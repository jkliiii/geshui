package org.junit.rules;

import org.junit.internal.runners.statements.FailOnTimeout;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public class Timeout implements TestRule {
    private final int fMillis;

    public Timeout(int millis) {
        this.fMillis = millis;
    }

    @Override // org.junit.rules.TestRule
    public Statement apply(Statement base, Description description) {
        return new FailOnTimeout(base, this.fMillis);
    }
}
