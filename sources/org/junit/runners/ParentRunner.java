package org.junit.runners;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.internal.AssumptionViolatedException;
import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.internal.runners.rules.RuleFieldValidator;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.rules.RunRules;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.NoTestsRemainException;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;
import org.junit.runner.notification.RunNotifier;
import org.junit.runner.notification.StoppedByUserException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

/* loaded from: E:\78999\cookie_192572.dex */
public abstract class ParentRunner<T> extends Runner implements Filterable, Sortable {
    private final TestClass fTestClass;
    private Sorter fSorter = Sorter.NULL;
    private List<T> fFilteredChildren = null;
    private RunnerScheduler fScheduler = new RunnerScheduler() { // from class: org.junit.runners.ParentRunner.1
        @Override // org.junit.runners.model.RunnerScheduler
        public void schedule(Runnable childStatement) {
            childStatement.run();
        }

        @Override // org.junit.runners.model.RunnerScheduler
        public void finished() {
        }
    };

    protected abstract Description describeChild(T t5);

    protected abstract List<T> getChildren();

    protected abstract void runChild(T t5, RunNotifier runNotifier);

    protected ParentRunner(Class<?> testClass) throws InitializationError {
        this.fTestClass = new TestClass(testClass);
        validate();
    }

    protected void collectInitializationErrors(List<Throwable> errors) {
        validatePublicVoidNoArgMethods(BeforeClass.class, true, errors);
        validatePublicVoidNoArgMethods(AfterClass.class, true, errors);
        validateClassRules(errors);
    }

    protected void validatePublicVoidNoArgMethods(Class<? extends Annotation> annotation, boolean isStatic, List<Throwable> errors) {
        List<FrameworkMethod> methods = getTestClass().getAnnotatedMethods(annotation);
        for (FrameworkMethod eachTestMethod : methods) {
            eachTestMethod.validatePublicVoidNoArg(isStatic, errors);
        }
    }

    private void validateClassRules(List<Throwable> errors) {
        RuleFieldValidator.CLASS_RULE_VALIDATOR.validate(getTestClass(), errors);
        RuleFieldValidator.CLASS_RULE_METHOD_VALIDATOR.validate(getTestClass(), errors);
    }

    protected Statement classBlock(RunNotifier notifier) {
        Statement statement = childrenInvoker(notifier);
        return withClassRules(withAfterClasses(withBeforeClasses(statement)));
    }

    protected Statement withBeforeClasses(Statement statement) {
        List<FrameworkMethod> befores = this.fTestClass.getAnnotatedMethods(BeforeClass.class);
        return befores.isEmpty() ? statement : new RunBefores(statement, befores, null);
    }

    protected Statement withAfterClasses(Statement statement) {
        List<FrameworkMethod> afters = this.fTestClass.getAnnotatedMethods(AfterClass.class);
        return afters.isEmpty() ? statement : new RunAfters(statement, afters, null);
    }

    private Statement withClassRules(Statement statement) {
        List<TestRule> classRules = classRules();
        return classRules.isEmpty() ? statement : new RunRules(statement, classRules, getDescription());
    }

    protected List<TestRule> classRules() {
        List<TestRule> result = this.fTestClass.getAnnotatedMethodValues(null, ClassRule.class, TestRule.class);
        result.addAll(this.fTestClass.getAnnotatedFieldValues(null, ClassRule.class, TestRule.class));
        return result;
    }

    protected Statement childrenInvoker(final RunNotifier notifier) {
        return new Statement() { // from class: org.junit.runners.ParentRunner.2
            @Override // org.junit.runners.model.Statement
            public void evaluate() {
                ParentRunner.this.runChildren(notifier);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runChildren(final RunNotifier notifier) {
        for (final T each : getFilteredChildren()) {
            this.fScheduler.schedule(new Runnable() { // from class: org.junit.runners.ParentRunner.3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    ParentRunner.this.runChild(each, notifier);
                }
            });
        }
        this.fScheduler.finished();
    }

    protected String getName() {
        return this.fTestClass.getName();
    }

    public final TestClass getTestClass() {
        return this.fTestClass;
    }

    protected final void runLeaf(Statement statement, Description description, RunNotifier notifier) {
        EachTestNotifier eachNotifier = new EachTestNotifier(notifier, description);
        eachNotifier.fireTestStarted();
        try {
            statement.evaluate();
        } catch (AssumptionViolatedException e5) {
            eachNotifier.addFailedAssumption(e5);
        } catch (Throwable e6) {
            eachNotifier.addFailure(e6);
        } finally {
            eachNotifier.fireTestFinished();
        }
    }

    protected Annotation[] getRunnerAnnotations() {
        return this.fTestClass.getAnnotations();
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        Description description = Description.createSuiteDescription(getName(), getRunnerAnnotations());
        for (T child : getFilteredChildren()) {
            description.addChild(describeChild(child));
        }
        return description;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier notifier) {
        EachTestNotifier testNotifier = new EachTestNotifier(notifier, getDescription());
        try {
            Statement statement = classBlock(notifier);
            statement.evaluate();
        } catch (AssumptionViolatedException e5) {
            testNotifier.fireTestIgnored();
        } catch (StoppedByUserException e6) {
            throw e6;
        } catch (Throwable e7) {
            testNotifier.addFailure(e7);
        }
    }

    @Override // org.junit.runner.manipulation.Filterable
    public void filter(Filter filter) throws NoTestsRemainException {
        Iterator<T> iter = getFilteredChildren().iterator();
        while (iter.hasNext()) {
            T each = iter.next();
            if (shouldRun(filter, each)) {
                try {
                    filter.apply(each);
                } catch (NoTestsRemainException e5) {
                    iter.remove();
                }
            } else {
                iter.remove();
            }
        }
        if (getFilteredChildren().isEmpty()) {
            throw new NoTestsRemainException();
        }
    }

    @Override // org.junit.runner.manipulation.Sortable
    public void sort(Sorter sorter) {
        this.fSorter = sorter;
        for (T each : getFilteredChildren()) {
            sortChild(each);
        }
        Collections.sort(getFilteredChildren(), comparator());
    }

    private void validate() throws InitializationError {
        List<Throwable> errors = new ArrayList<>();
        collectInitializationErrors(errors);
        if (!errors.isEmpty()) {
            throw new InitializationError(errors);
        }
    }

    private List<T> getFilteredChildren() {
        if (this.fFilteredChildren == null) {
            this.fFilteredChildren = new ArrayList(getChildren());
        }
        return this.fFilteredChildren;
    }

    private void sortChild(T child) {
        this.fSorter.apply(child);
    }

    private boolean shouldRun(Filter filter, T each) {
        return filter.shouldRun(describeChild(each));
    }

    private Comparator<? super T> comparator() {
        return new Comparator<T>() { // from class: org.junit.runners.ParentRunner.4
            @Override // java.util.Comparator
            public int compare(T o12, T o22) {
                return ParentRunner.this.fSorter.compare(ParentRunner.this.describeChild(o12), ParentRunner.this.describeChild(o22));
            }
        };
    }

    public void setScheduler(RunnerScheduler scheduler) {
        this.fScheduler = scheduler;
    }
}
