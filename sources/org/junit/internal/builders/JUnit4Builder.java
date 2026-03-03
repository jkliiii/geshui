package org.junit.internal.builders;

import org.junit.runner.Runner;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.RunnerBuilder;

/* loaded from: E:\78999\cookie_192572.dex */
public class JUnit4Builder extends RunnerBuilder {
    @Override // org.junit.runners.model.RunnerBuilder
    public Runner runnerForClass(Class<?> testClass) throws Throwable {
        return new BlockJUnit4ClassRunner(testClass);
    }
}
