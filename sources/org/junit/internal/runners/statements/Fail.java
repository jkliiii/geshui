package org.junit.internal.runners.statements;

import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public class Fail extends Statement {
    private final Throwable fError;

    public Fail(Throwable e5) {
        this.fError = e5;
    }

    @Override // org.junit.runners.model.Statement
    public void evaluate() throws Throwable {
        throw this.fError;
    }
}
