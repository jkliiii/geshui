package org.junit.internal.runners.statements;

import java.util.ArrayList;
import java.util.List;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.MultipleFailureException;
import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public class RunAfters extends Statement {
    private final List<FrameworkMethod> fAfters;
    private final Statement fNext;
    private final Object fTarget;

    public RunAfters(Statement next, List<FrameworkMethod> afters, Object target) {
        this.fNext = next;
        this.fAfters = afters;
        this.fTarget = target;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        List<Throwable> errors = new ArrayList<>();
        try {
            try {
                this.fNext.evaluate();
                for (FrameworkMethod each : this.fAfters) {
                    try {
                        each.invokeExplosively(this.fTarget, new Object[0]);
                    } catch (Throwable e5) {
                        errors.add(e5);
                    }
                }
            } catch (Throwable th) {
                for (FrameworkMethod each2 : this.fAfters) {
                    try {
                        each2.invokeExplosively(this.fTarget, new Object[0]);
                    } catch (Throwable e6) {
                        errors.add(e6);
                    }
                }
                throw th;
            }
        } catch (Throwable e7) {
            errors.add(e7);
            for (FrameworkMethod each3 : this.fAfters) {
                try {
                    each3.invokeExplosively(this.fTarget, new Object[0]);
                } catch (Throwable e8) {
                    errors.add(e8);
                }
            }
        }
        MultipleFailureException.assertEmpty(errors);
    }
}
