package org.junit.internal.requests;

import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Request;
import org.junit.runner.Runner;

/* loaded from: E:\78999\cookie_192572.dex */
public class ClassRequest extends Request {
    private final boolean fCanUseSuiteMethod;
    private Runner fRunner;
    private final Object fRunnerLock;
    private final Class<?> fTestClass;

    public ClassRequest(Class<?> testClass, boolean canUseSuiteMethod) {
        this.fRunnerLock = new Object();
        this.fTestClass = testClass;
        this.fCanUseSuiteMethod = canUseSuiteMethod;
    }

    public ClassRequest(Class<?> testClass) {
        this(testClass, true);
    }

    @Override // org.junit.runner.Request
    public Runner getRunner() {
        Runner runner;
        synchronized (this.fRunnerLock) {
            if (this.fRunner == null) {
                this.fRunner = new AllDefaultPossibilitiesBuilder(this.fCanUseSuiteMethod).safeRunnerForClass(this.fTestClass);
            }
            runner = this.fRunner;
        }
        return runner;
    }
}
