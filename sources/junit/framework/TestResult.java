package junit.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/* loaded from: E:\78999\cookie_192572.dex */
public class TestResult {
    protected List<TestFailure> fFailures = new ArrayList();
    protected List<TestFailure> fErrors = new ArrayList();
    protected List<TestListener> fListeners = new ArrayList();
    protected int fRunTests = 0;
    private boolean fStop = false;

    public synchronized void addError(Test test, Throwable t5) {
        this.fErrors.add(new TestFailure(test, t5));
        for (TestListener each : cloneListeners()) {
            each.addError(test, t5);
        }
    }

    public synchronized void addFailure(Test test, AssertionFailedError t5) {
        this.fFailures.add(new TestFailure(test, t5));
        for (TestListener each : cloneListeners()) {
            each.addFailure(test, t5);
        }
    }

    public synchronized void addListener(TestListener listener) {
        this.fListeners.add(listener);
    }

    public synchronized void removeListener(TestListener listener) {
        this.fListeners.remove(listener);
    }

    private synchronized List<TestListener> cloneListeners() {
        List<TestListener> result;
        result = new ArrayList<>();
        result.addAll(this.fListeners);
        return result;
    }

    public void endTest(Test test) {
        for (TestListener each : cloneListeners()) {
            each.endTest(test);
        }
    }

    public synchronized int errorCount() {
        return this.fErrors.size();
    }

    public synchronized Enumeration<TestFailure> errors() {
        return Collections.enumeration(this.fErrors);
    }

    public synchronized int failureCount() {
        return this.fFailures.size();
    }

    public synchronized Enumeration<TestFailure> failures() {
        return Collections.enumeration(this.fFailures);
    }

    protected void run(final TestCase test) {
        startTest(test);
        Protectable p5 = new Protectable() { // from class: junit.framework.TestResult.1
            @Override // junit.framework.Protectable
            public void protect() throws Throwable {
                test.runBare();
            }
        };
        runProtected(test, p5);
        endTest(test);
    }

    public synchronized int runCount() {
        return this.fRunTests;
    }

    public void runProtected(Test test, Protectable p5) {
        try {
            p5.protect();
        } catch (ThreadDeath e5) {
            throw e5;
        } catch (AssertionFailedError e6) {
            addFailure(test, e6);
        } catch (Throwable e7) {
            addError(test, e7);
        }
    }

    public synchronized boolean shouldStop() {
        return this.fStop;
    }

    public void startTest(Test test) {
        int count = test.countTestCases();
        synchronized (this) {
            this.fRunTests += count;
        }
        for (TestListener each : cloneListeners()) {
            each.startTest(test);
        }
    }

    public synchronized void stop() {
        this.fStop = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean wasSuccessful() {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.failureCount()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            int r0 = r1.errorCount()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            r0 = 1
        Le:
            monitor-exit(r1)
            return r0
        L10:
            r0 = 0
            goto Le
        L12:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: junit.framework.TestResult.wasSuccessful():boolean");
    }
}
