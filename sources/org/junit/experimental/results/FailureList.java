package org.junit.experimental.results;

import java.util.List;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* loaded from: E:\78999\cookie_192572.dex */
class FailureList {
    private final List<Failure> failures;

    public FailureList(List<Failure> failures) {
        this.failures = failures;
    }

    public Result result() {
        Result result = new Result();
        RunListener listener = result.createListener();
        for (Failure failure : this.failures) {
            try {
                listener.testFailure(failure);
            } catch (Exception e5) {
                throw new RuntimeException("I can't believe this happened");
            }
        }
        return result;
    }
}
