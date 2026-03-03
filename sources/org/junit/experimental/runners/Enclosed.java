package org.junit.experimental.runners;

import org.junit.runners.Suite;
import org.junit.runners.model.RunnerBuilder;

/* loaded from: E:\78999\cookie_192572.dex */
public class Enclosed extends Suite {
    public Enclosed(Class<?> klass, RunnerBuilder builder) throws Throwable {
        super(builder, klass, klass.getClasses());
    }
}
