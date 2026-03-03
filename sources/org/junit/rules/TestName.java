package org.junit.rules;

import org.junit.runner.Description;

/* loaded from: E:\78999\cookie_192572.dex */
public class TestName extends TestWatcher {
    private String fName;

    @Override // org.junit.rules.TestWatcher
    protected void starting(Description d6) {
        this.fName = d6.getMethodName();
    }

    public String getMethodName() {
        return this.fName;
    }
}
