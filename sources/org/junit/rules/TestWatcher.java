package org.junit.rules;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public abstract class TestWatcher implements TestRule {
    @Override // org.junit.rules.TestRule
    public Statement apply(final Statement base, final Description description) {
        return new Statement() { // from class: org.junit.rules.TestWatcher.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                List<Throwable> errors = new ArrayList<>();
                TestWatcher.this.startingQuietly(description, errors);
                try {
                    base.evaluate();
                    TestWatcher.this.succeededQuietly(description, errors);
                } catch (AssumptionViolatedException e5) {
                    errors.add(e5);
                    TestWatcher.this.skippedQuietly(e5, description, errors);
                } catch (Throwable t5) {
                    errors.add(t5);
                    TestWatcher.this.failedQuietly(t5, description, errors);
                } finally {
                    TestWatcher.this.finishedQuietly(description, errors);
                }
                MultipleFailureException.assertEmpty(errors);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void succeededQuietly(Description description, List<Throwable> errors) {
        try {
            succeeded(description);
        } catch (Throwable t5) {
            errors.add(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failedQuietly(Throwable t5, Description description, List<Throwable> errors) {
        try {
            failed(t5, description);
        } catch (Throwable t12) {
            errors.add(t12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void skippedQuietly(AssumptionViolatedException e5, Description description, List<Throwable> errors) {
        try {
            skipped(e5, description);
        } catch (Throwable t5) {
            errors.add(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startingQuietly(Description description, List<Throwable> errors) {
        try {
            starting(description);
        } catch (Throwable t5) {
            errors.add(t5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishedQuietly(Description description, List<Throwable> errors) {
        try {
            finished(description);
        } catch (Throwable t5) {
            errors.add(t5);
        }
    }

    protected void succeeded(Description description) {
    }

    protected void failed(Throwable e5, Description description) {
    }

    protected void skipped(AssumptionViolatedException e5, Description description) {
    }

    protected void starting(Description description) {
    }

    protected void finished(Description description) {
    }
}
