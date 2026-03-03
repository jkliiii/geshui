package junit.textui;

import java.io.PrintStream;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;
import junit.runner.BaseTestRunner;
import junit.runner.Version;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_192572.dex */
public class TestRunner extends BaseTestRunner {
    public static final int EXCEPTION_EXIT = 2;
    public static final int FAILURE_EXIT = 1;
    public static final int SUCCESS_EXIT = 0;
    private ResultPrinter fPrinter;

    public TestRunner() {
        this(System.out);
    }

    public TestRunner(PrintStream writer) {
        this(new ResultPrinter(writer));
    }

    public TestRunner(ResultPrinter printer) {
        this.fPrinter = printer;
    }

    public static void run(Class<? extends TestCase> testClass) {
        run(new TestSuite(testClass));
    }

    public static TestResult run(Test test) {
        TestRunner runner = new TestRunner();
        return runner.doRun(test);
    }

    public static void runAndWait(Test suite) {
        TestRunner aTestRunner = new TestRunner();
        aTestRunner.doRun(suite, true);
    }

    @Override // junit.runner.BaseTestRunner
    public void testFailed(int status, Test test, Throwable t5) {
    }

    @Override // junit.runner.BaseTestRunner
    public void testStarted(String testName) {
    }

    @Override // junit.runner.BaseTestRunner
    public void testEnded(String testName) {
    }

    protected TestResult createTestResult() {
        return new TestResult();
    }

    public TestResult doRun(Test test) {
        return doRun(test, false);
    }

    public TestResult doRun(Test suite, boolean wait) {
        TestResult result = createTestResult();
        result.addListener(this.fPrinter);
        long startTime = System.currentTimeMillis();
        suite.run(result);
        long endTime = System.currentTimeMillis();
        long runTime = endTime - startTime;
        this.fPrinter.print(result, runTime);
        pause(wait);
        return result;
    }

    protected void pause(boolean wait) {
        if (wait) {
            this.fPrinter.printWaitPrompt();
            try {
                System.in.read();
            } catch (Exception e5) {
            }
        }
    }

    public static void main(String[] args) {
        TestRunner aTestRunner = new TestRunner();
        try {
            TestResult r5 = aTestRunner.start(args);
            if (!r5.wasSuccessful()) {
                System.exit(1);
            }
            System.exit(0);
        } catch (Exception e5) {
            System.err.println(e5.getMessage());
            System.exit(2);
        }
    }

    public TestResult start(String[] args) throws Exception {
        String testCase = BuildConfig.FLAVOR;
        String method = BuildConfig.FLAVOR;
        boolean wait = false;
        int i5 = 0;
        while (i5 < args.length) {
            if (args[i5].equals("-wait")) {
                wait = true;
            } else if (args[i5].equals("-c")) {
                i5++;
                testCase = extractClassName(args[i5]);
            } else if (args[i5].equals("-m")) {
                i5++;
                String arg = args[i5];
                int lastIndex = arg.lastIndexOf(46);
                testCase = arg.substring(0, lastIndex);
                method = arg.substring(lastIndex + 1);
            } else if (args[i5].equals("-v")) {
                System.err.println("JUnit " + Version.id() + " by Kent Beck and Erich Gamma");
            } else {
                testCase = args[i5];
            }
            i5++;
        }
        if (testCase.equals(BuildConfig.FLAVOR)) {
            throw new Exception("Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
        }
        try {
            if (!method.equals(BuildConfig.FLAVOR)) {
                return runSingleMethod(testCase, method, wait);
            }
            Test suite = getTest(testCase);
            return doRun(suite, wait);
        } catch (Exception e5) {
            throw new Exception("Could not create and run test suite: " + e5);
        }
    }

    protected TestResult runSingleMethod(String testCase, String method, boolean wait) throws Exception {
        Test test = TestSuite.createTest(loadSuiteClass(testCase).asSubclass(TestCase.class), method);
        return doRun(test, wait);
    }

    @Override // junit.runner.BaseTestRunner
    protected void runFailed(String message) {
        System.err.println(message);
        System.exit(1);
    }

    public void setPrinter(ResultPrinter printer) {
        this.fPrinter = printer;
    }
}
