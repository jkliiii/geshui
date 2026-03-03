package org.junit.internal;

import java.io.PrintStream;

/* loaded from: E:\78999\cookie_192572.dex */
public class RealSystem implements JUnitSystem {
    @Override // org.junit.internal.JUnitSystem
    public PrintStream out() {
        return System.out;
    }
}
