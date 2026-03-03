package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

@Deprecated
/* loaded from: E:\78999\cookie_192572.dex */
public class JUnit4ClassRunner extends Runner implements Filterable, Sortable {
    private TestClass fTestClass;
    private final List<Method> fTestMethods = getTestMethods();

    public JUnit4ClassRunner(Class<?> klass) throws InitializationError {
        this.fTestClass = new TestClass(klass);
        validate();
    }

    protected List<Method> getTestMethods() {
        return this.fTestClass.getTestMethods();
    }

    protected void validate() throws InitializationError {
        MethodValidator methodValidator = new MethodValidator(this.fTestClass);
        methodValidator.validateMethodsForDefaultRunner();
        methodValidator.assertValid();
    }

    @Override // org.junit.runner.Runner
    public void run(final RunNotifier notifier) {
        new ClassRoadie(notifier, this.fTestClass, getDescription(), new Runnable() { // from class: org.junit.internal.runners.JUnit4ClassRunner.1
            @Override // java.lang.Runnable
            public void run() {
                JUnit4ClassRunner.this.runMethods(notifier);
            }
        }).runProtected();
    }

    protected void runMethods(RunNotifier notifier) {
        for (Method method : this.fTestMethods) {
            invokeTestMethod(method, notifier);
        }
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description spec = Description.createSuiteDescription(getName(), classAnnotations());
        List<Method> testMethods = this.fTestMethods;
        for (Method method : testMethods) {
            spec.addChild(methodDescription(method));
        }
        return spec;
    }

    protected Annotation[] classAnnotations() {
        return this.fTestClass.getJavaClass().getAnnotations();
    }

    protected String getName() {
        return getTestClass().getName();
    }

    protected Object createTest() throws Exception {
        return getTestClass().getConstructor().newInstance(new Object[0]);
    }

    protected void invokeTestMethod(Method method, RunNotifier notifier) {
        Description description = methodDescription(method);
        try {
            Object test = createTest();
            TestMethod testMethod = wrapMethod(method);
            new MethodRoadie(test, testMethod, notifier, description).run();
        } catch (InvocationTargetException e5) {
            testAborted(notifier, description, e5.getCause());
        } catch (Exception e6) {
            testAborted(notifier, description, e6);
        }
    }

    private void testAborted(RunNotifier notifier, Description description, Throwable e5) {
        notifier.fireTestStarted(description);
        notifier.fireTestFailure(new Failure(description, e5));
        notifier.fireTestFinished(description);
    }

    protected TestMethod wrapMethod(Method method) {
        return new TestMethod(method, this.fTestClass);
    }

    protected String testName(Method method) {
        return method.getName();
    }

    protected Description methodDescription(Method method) {
        return Description.createTestDescription(getTestClass().getJavaClass(), testName(method), testAnnotations(method));
    }

    protected Annotation[] testAnnotations(Method method) {
        return method.getAnnotations();
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        Iterator<Method> iter = this.fTestMethods.iterator();
        while (iter.hasNext()) {
            Method method = iter.next();
            if (!filter.shouldRun(methodDescription(method))) {
                iter.remove();
            }
        }
        if (this.fTestMethods.isEmpty()) {
            throw new NoTestsRemainException();
        }
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(final Sorter sorter) {
        Collections.sort(this.fTestMethods, new Comparator<Method>() { // from class: org.junit.internal.runners.JUnit4ClassRunner.2
            @Override // java.util.Comparator
            public int compare(Method o12, Method o22) {
                return sorter.compare(JUnit4ClassRunner.this.methodDescription(o12), JUnit4ClassRunner.this.methodDescription(o22));
            }
        });
    }

    protected TestClass getTestClass() {
        return this.fTestClass;
    }
}
