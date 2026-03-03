package org.junit.internal.builders;

import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

/* loaded from: E:\78999\cookie_192572.dex */
public class NullBuilder extends RunnerBuilder {
    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> each) throws Throwable {
        return null;
    }
}
