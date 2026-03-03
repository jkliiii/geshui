package org.junit.rules;

import org.junit.internal.AssumptionViolatedException;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

@Deprecated
/* loaded from: E:\78999\cookie_192572.dex */
public class TestWatchman implements MethodRule {
    @Override // org.junit.rules.MethodRule
    public Statement apply(final Statement base, final FrameworkMethod method, Object target) {
        return new Statement() { // from class: org.junit.rules.TestWatchman.1
            @Override // org.junit.runners.model.Statement
            public void evaluate() throws Throwable {
                TestWatchman.this.starting(method);
                try {
                    try {
                        base.evaluate();
                        TestWatchman.this.succeeded(method);
                    } catch (AssumptionViolatedException e5) {
                        throw e5;
                    } catch (Throwable t5) {
                        TestWatchman.this.failed(t5, method);
                        throw t5;
                    }
                } finally {
                    TestWatchman.this.finished(method);
                }
            }
        };
    }

    public void succeeded(FrameworkMethod method) {
    }

    public void failed(Throwable e5, FrameworkMethod method) {
    }

    public void starting(FrameworkMethod method) {
    }

    public void finished(FrameworkMethod method) {
    }
}
