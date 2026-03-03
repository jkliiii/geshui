package org.junit.internal.builders;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

/* loaded from: E:\78999\cookie_192572.dex */
public class IgnoredClassRunner extends Runner {
    private final Class<?> fTestClass;

    public IgnoredClassRunner(Class<?> testClass) {
        this.fTestClass = testClass;
    }

    @Override // org.junit.runner.Runner
    public void run(RunNotifier notifier) {
        notifier.fireTestIgnored(getDescription());
    }

    @Override // org.junit.runner.Runner, org.junit.runner.Describable
    public Description getDescription() {
        return Description.createSuiteDescription(this.fTestClass);
    }
}
