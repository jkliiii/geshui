package junit.extensions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/* loaded from: E:\78999\cookie_192572.dex */
public class ActiveTestSuite extends TestSuite {
    private volatile int fActiveTestDeathCount;

    public ActiveTestSuite() {
    }

    public ActiveTestSuite(Class<? extends TestCase> theClass) {
        super(theClass);
    }

    public ActiveTestSuite(String name) {
        super(name);
    }

    public ActiveTestSuite(Class<? extends TestCase> theClass, String name) {
        super(theClass, name);
    }

    @Override // junit.framework.TestSuite, junit.framework.Test
    public void run(TestResult result) {
        this.fActiveTestDeathCount = 0;
        super.run(result);
        waitUntilFinished();
    }

    @Override // junit.framework.TestSuite
    public void runTest(final Test test, final TestResult result) {
        Thread t5 = new Thread() { // from class: junit.extensions.ActiveTestSuite.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    test.run(result);
                } finally {
                    ActiveTestSuite.this.runFinished();
                }
            }
        };
        t5.start();
    }

    synchronized void waitUntilFinished() {
        while (this.fActiveTestDeathCount < testCount()) {
            try {
                wait();
            } catch (InterruptedException e5) {
            }
        }
    }

    public synchronized void runFinished() {
        this.fActiveTestDeathCount++;
        notifyAll();
    }
}
