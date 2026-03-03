package org.junit.runner.notification;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Result;

/* loaded from: E:\78999\cookie_192572.dex */
public class RunNotifier {
    private final List<RunListener> fListeners = Collections.synchronizedList(new ArrayList());
    private volatile boolean fPleaseStop = false;

    public void addListener(RunListener listener) {
        this.fListeners.add(listener);
    }

    public void removeListener(RunListener listener) {
        this.fListeners.remove(listener);
    }

    private abstract class SafeNotifier {
        private final List<RunListener> fCurrentListeners;

        protected abstract void notifyListener(RunListener runListener) throws Exception;

        SafeNotifier(RunNotifier runNotifier) {
            this(runNotifier.fListeners);
        }

        SafeNotifier(List<RunListener> currentListeners) {
            this.fCurrentListeners = currentListeners;
        }

        void run() {
            synchronized (RunNotifier.this.fListeners) {
                List<RunListener> safeListeners = new ArrayList<>();
                List<Failure> failures = new ArrayList<>();
                for (RunListener listener : this.fCurrentListeners) {
                    try {
                        notifyListener(listener);
                        safeListeners.add(listener);
                    } catch (Exception e5) {
                        failures.add(new Failure(Description.TEST_MECHANISM, e5));
                    }
                }
                RunNotifier.this.fireTestFailures(safeListeners, failures);
            }
        }
    }

    public void fireTestRunStarted(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener each) throws Exception {
                each.testRunStarted(description);
            }
        }.run();
    }

    public void fireTestRunFinished(final Result result) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener each) throws Exception {
                each.testRunFinished(result);
            }
        }.run();
    }

    public void fireTestStarted(final Description description) throws StoppedByUserException {
        if (this.fPleaseStop) {
            throw new StoppedByUserException();
        }
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener each) throws Exception {
                each.testStarted(description);
            }
        }.run();
    }

    public void fireTestFailure(Failure failure) {
        fireTestFailures(this.fListeners, Arrays.asList(failure));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fireTestFailures(List<RunListener> listeners, final List<Failure> failures) {
        if (!failures.isEmpty()) {
            new SafeNotifier(listeners) { // from class: org.junit.runner.notification.RunNotifier.4
                @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
                protected void notifyListener(RunListener listener) throws Exception {
                    for (Failure each : failures) {
                        listener.testFailure(each);
                    }
                }
            }.run();
        }
    }

    public void fireTestAssumptionFailed(final Failure failure) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener each) throws Exception {
                each.testAssumptionFailure(failure);
            }
        }.run();
    }

    public void fireTestIgnored(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener each) throws Exception {
                each.testIgnored(description);
            }
        }.run();
    }

    public void fireTestFinished(final Description description) {
        new SafeNotifier() { // from class: org.junit.runner.notification.RunNotifier.7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(RunNotifier.this);
            }

            @Override // org.junit.runner.notification.RunNotifier.SafeNotifier
            protected void notifyListener(RunListener each) throws Exception {
                each.testFinished(description);
            }
        }.run();
    }

    public void pleaseStop() {
        this.fPleaseStop = true;
    }

    public void addFirstListener(RunListener listener) {
        this.fListeners.add(0, listener);
    }
}
