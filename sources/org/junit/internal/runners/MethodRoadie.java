package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

@Deprecated
/* loaded from: E:\78999\cookie_192572.dex */
public class MethodRoadie {
    private final Description fDescription;
    private final RunNotifier fNotifier;
    private final Object fTest;
    private TestMethod fTestMethod;

    public MethodRoadie(Object test, TestMethod method, RunNotifier notifier, Description description) {
        this.fTest = test;
        this.fNotifier = notifier;
        this.fDescription = description;
        this.fTestMethod = method;
    }

    public void run() {
        if (this.fTestMethod.isIgnored()) {
            this.fNotifier.fireTestIgnored(this.fDescription);
            return;
        }
        this.fNotifier.fireTestStarted(this.fDescription);
        try {
            long timeout = this.fTestMethod.getTimeout();
            if (timeout > 0) {
                runWithTimeout(timeout);
            } else {
                runTest();
            }
        } finally {
            this.fNotifier.fireTestFinished(this.fDescription);
        }
    }

    private void runWithTimeout(final long timeout) {
        runBeforesThenTestThenAfters(new Runnable() { // from class: org.junit.internal.runners.MethodRoadie.1
            @Override // java.lang.Runnable
            public void run() {
                ExecutorService service = Executors.newSingleThreadExecutor();
                Callable<Object> callable = new Callable<Object>() { // from class: org.junit.internal.runners.MethodRoadie.1.1
                    @Override // java.util.concurrent.Callable
                    public Object call() throws Exception {
                        MethodRoadie.this.runTestMethod();
                        return null;
                    }
                };
                Future<Object> result = service.submit(callable);
                service.shutdown();
                try {
                    boolean terminated = service.awaitTermination(timeout, TimeUnit.MILLISECONDS);
                    if (!terminated) {
                        service.shutdownNow();
                    }
                    result.get(0L, TimeUnit.MILLISECONDS);
                } catch (TimeoutException e5) {
                    MethodRoadie.this.addFailure(new Exception(String.format("test timed out after %d milliseconds", Long.valueOf(timeout))));
                } catch (Exception e6) {
                    MethodRoadie.this.addFailure(e6);
                }
            }
        });
    }

    public void runTest() {
        runBeforesThenTestThenAfters(new Runnable() { // from class: org.junit.internal.runners.MethodRoadie.2
            @Override // java.lang.Runnable
            public void run() {
                MethodRoadie.this.runTestMethod();
            }
        });
    }

    public void runBeforesThenTestThenAfters(Runnable test) {
        try {
            try {
                runBefores();
                test.run();
                runAfters();
            } catch (FailedBefore e5) {
                runAfters();
            } catch (Exception e6) {
                throw new RuntimeException("test should never throw an exception to this level");
            }
        } catch (Throwable th) {
            runAfters();
            throw th;
        }
    }

    protected void runTestMethod() {
        try {
            this.fTestMethod.invoke(this.fTest);
            if (this.fTestMethod.expectsException()) {
                addFailure(new AssertionError("Expected exception: " + this.fTestMethod.getExpectedException().getName()));
            }
        } catch (InvocationTargetException e5) {
            Throwable actual = e5.getTargetException();
            if (!(actual instanceof AssumptionViolatedException)) {
                if (!this.fTestMethod.expectsException()) {
                    addFailure(actual);
                } else if (this.fTestMethod.isUnexpected(actual)) {
                    String message = "Unexpected exception, expected<" + this.fTestMethod.getExpectedException().getName() + "> but was<" + actual.getClass().getName() + ">";
                    addFailure(new Exception(message, actual));
                }
            }
        } catch (Throwable e6) {
            addFailure(e6);
        }
    }

    private void runBefores() throws FailedBefore {
        try {
            try {
                List<Method> befores = this.fTestMethod.getBefores();
                for (Method before : befores) {
                    before.invoke(this.fTest, new Object[0]);
                }
            } catch (AssumptionViolatedException e5) {
                throw new FailedBefore();
            } catch (Throwable e6) {
                addFailure(e6);
                throw new FailedBefore();
            }
        } catch (InvocationTargetException e7) {
            throw e7.getTargetException();
        }
    }

    private void runAfters() {
        List<Method> afters = this.fTestMethod.getAfters();
        for (Method after : afters) {
            try {
                after.invoke(this.fTest, new Object[0]);
            } catch (InvocationTargetException e5) {
                addFailure(e5.getTargetException());
            } catch (Throwable e6) {
                addFailure(e6);
            }
        }
    }

    protected void addFailure(Throwable e5) {
        this.fNotifier.fireTestFailure(new Failure(this.fDescription, e5));
    }
}
