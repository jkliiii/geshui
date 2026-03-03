package org.junit.runner;

import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

/* loaded from: E:\78999\cookie_192572.dex */
public class Computer {
    public static Computer serial() {
        return new Computer();
    }

    public Runner getSuite(final RunnerBuilder builder, Class<?>[] classes) throws InitializationError {
        return new Suite(new RunnerBuilder() { // from class: org.junit.runner.Computer.1
            @Override // org.junit.runners.model.RunnerBuilder
            public Runner runnerForClass(Class<?> testClass) throws Throwable {
                return Computer.this.getRunner(builder, testClass);
            }
        }, classes);
    }

    protected Runner getRunner(RunnerBuilder builder, Class<?> testClass) throws Throwable {
        return builder.runnerForClass(testClass);
    }
}
