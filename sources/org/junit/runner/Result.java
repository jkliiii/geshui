package org.junit.runner;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

/* loaded from: E:\78999\cookie_192572.dex */
public class Result implements Serializable {
    private static final long serialVersionUID = 1;
    private long fStartTime;
    private AtomicInteger fCount = new AtomicInteger();
    private AtomicInteger fIgnoreCount = new AtomicInteger();
    private final List<Failure> fFailures = Collections.synchronizedList(new ArrayList());
    private long fRunTime = 0;

    static /* synthetic */ long access$114(Result x02, long x12) {
        long j5 = x02.fRunTime + x12;
        x02.fRunTime = j5;
        return j5;
    }

    public int getRunCount() {
        return this.fCount.get();
    }

    public int getFailureCount() {
        return this.fFailures.size();
    }

    public long getRunTime() {
        return this.fRunTime;
    }

    public List<Failure> getFailures() {
        return this.fFailures;
    }

    public int getIgnoreCount() {
        return this.fIgnoreCount.get();
    }

    public boolean wasSuccessful() {
        return getFailureCount() == 0;
    }

    private class Listener extends RunListener {
        private Listener() {
        }

        @Override // org.junit.runner.notification.RunListener
        public void testRunStarted(Description description) throws Exception {
            Result.this.fStartTime = System.currentTimeMillis();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testRunFinished(Result result) throws Exception {
            long endTime = System.currentTimeMillis();
            Result.access$114(Result.this, endTime - Result.this.fStartTime);
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFinished(Description description) throws Exception {
            Result.this.fCount.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testFailure(Failure failure) throws Exception {
            Result.this.fFailures.add(failure);
        }

        @Override // org.junit.runner.notification.RunListener
        public void testIgnored(Description description) throws Exception {
            Result.this.fIgnoreCount.getAndIncrement();
        }

        @Override // org.junit.runner.notification.RunListener
        public void testAssumptionFailure(Failure failure) {
        }
    }

    public RunListener createListener() {
        return new Listener();
    }
}
