package junit.runner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.NumberFormat;
import java.util.Properties;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestListener;
import junit.framework.TestSuite;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_192572.dex */
public abstract class BaseTestRunner implements TestListener {
    public static final String SUITE_METHODNAME = "suite";
    private static Properties fPreferences;
    static boolean fgFilterStack = true;
    static int fgMaxMessageLength;
    boolean fLoading = true;

    protected abstract void runFailed(String str);

    public abstract void testEnded(String str);

    public abstract void testFailed(int i5, Test test, Throwable th);

    public abstract void testStarted(String str);

    static {
        fgMaxMessageLength = 500;
        fgMaxMessageLength = getPreference("maxmessage", fgMaxMessageLength);
    }

    @Override // junit.framework.TestListener
    public synchronized void startTest(Test test) {
        testStarted(test.toString());
    }

    protected static void setPreferences(Properties preferences) {
        fPreferences = preferences;
    }

    protected static Properties getPreferences() {
        if (fPreferences == null) {
            fPreferences = new Properties();
            fPreferences.put("loading", "true");
            fPreferences.put("filterstack", "true");
            readPreferences();
        }
        return fPreferences;
    }

    public static void savePreferences() throws IOException {
        FileOutputStream fos = new FileOutputStream(getPreferencesFile());
        try {
            getPreferences().store(fos, BuildConfig.FLAVOR);
        } finally {
            fos.close();
        }
    }

    public static void setPreference(String key, String value) {
        getPreferences().put(key, value);
    }

    @Override // junit.framework.TestListener
    public synchronized void endTest(Test test) {
        testEnded(test.toString());
    }

    @Override // junit.framework.TestListener
    public synchronized void addError(Test test, Throwable t5) {
        testFailed(1, test, t5);
    }

    @Override // junit.framework.TestListener
    public synchronized void addFailure(Test test, AssertionFailedError t5) {
        testFailed(2, test, t5);
    }

    public Test getTest(String suiteClassName) {
        if (suiteClassName.length() <= 0) {
            clearStatus();
            return null;
        }
        try {
            Class<?> testClass = loadSuiteClass(suiteClassName);
            try {
                Method suiteMethod = testClass.getMethod(SUITE_METHODNAME, new Class[0]);
                if (!Modifier.isStatic(suiteMethod.getModifiers())) {
                    runFailed("Suite() method must be static");
                    return null;
                }
                try {
                    Test test = (Test) suiteMethod.invoke(null, new Class[0]);
                    if (test != null) {
                        clearStatus();
                        return test;
                    }
                    return test;
                } catch (IllegalAccessException e5) {
                    runFailed("Failed to invoke suite():" + e5.toString());
                    return null;
                } catch (InvocationTargetException e6) {
                    runFailed("Failed to invoke suite():" + e6.getTargetException().toString());
                    return null;
                }
            } catch (Exception e7) {
                clearStatus();
                return new TestSuite(testClass);
            }
        } catch (ClassNotFoundException e8) {
            String clazz = e8.getMessage();
            if (clazz == null) {
                clazz = suiteClassName;
            }
            runFailed("Class not found \"" + clazz + "\"");
            return null;
        } catch (Exception e9) {
            runFailed("Error: " + e9.toString());
            return null;
        }
    }

    public String elapsedTimeAsString(long runTime) {
        return NumberFormat.getInstance().format(runTime / 1000.0d);
    }

    protected String processArguments(String[] args) {
        String suiteName = null;
        int i5 = 0;
        while (i5 < args.length) {
            if (args[i5].equals("-noloading")) {
                setLoading(false);
            } else if (args[i5].equals("-nofilterstack")) {
                fgFilterStack = false;
            } else if (args[i5].equals("-c")) {
                if (args.length > i5 + 1) {
                    suiteName = extractClassName(args[i5 + 1]);
                } else {
                    System.out.println("Missing Test class name");
                }
                i5++;
            } else {
                suiteName = args[i5];
            }
            i5++;
        }
        return suiteName;
    }

    public void setLoading(boolean enable) {
        this.fLoading = enable;
    }

    public String extractClassName(String className) {
        if (className.startsWith("Default package for")) {
            return className.substring(className.lastIndexOf(".") + 1);
        }
        return className;
    }

    public static String truncate(String s5) {
        if (fgMaxMessageLength != -1 && s5.length() > fgMaxMessageLength) {
            return s5.substring(0, fgMaxMessageLength) + "...";
        }
        return s5;
    }

    protected Class<?> loadSuiteClass(String suiteClassName) throws ClassNotFoundException {
        return Class.forName(suiteClassName);
    }

    protected void clearStatus() {
    }

    protected boolean useReloadingTestSuiteLoader() {
        return getPreference("loading").equals("true") && this.fLoading;
    }

    private static File getPreferencesFile() {
        String home = System.getProperty("user.home");
        return new File(home, "junit.properties");
    }

    private static void readPreferences() {
        InputStream is;
        InputStream is2 = null;
        try {
            is = new FileInputStream(getPreferencesFile());
        } catch (IOException e5) {
        }
        try {
            setPreferences(new Properties(getPreferences()));
            getPreferences().load(is);
        } catch (IOException e6) {
            is2 = is;
            if (is2 != null) {
                try {
                    is2.close();
                } catch (IOException e7) {
                }
            }
        }
    }

    public static String getPreference(String key) {
        return getPreferences().getProperty(key);
    }

    public static int getPreference(String key, int dflt) {
        String value = getPreference(key);
        int intValue = dflt;
        if (value == null) {
            return intValue;
        }
        try {
            intValue = Integer.parseInt(value);
        } catch (NumberFormatException e5) {
        }
        return intValue;
    }

    public static String getFilteredTrace(Throwable t5) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        t5.printStackTrace(writer);
        StringBuffer buffer = stringWriter.getBuffer();
        String trace = buffer.toString();
        return getFilteredTrace(trace);
    }

    public static String getFilteredTrace(String stack) {
        if (!showStackRaw()) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            StringReader sr = new StringReader(stack);
            BufferedReader br = new BufferedReader(sr);
            while (true) {
                try {
                    String line = br.readLine();
                    if (line != null) {
                        if (!filterLine(line)) {
                            pw.println(line);
                        }
                    } else {
                        return sw.toString();
                    }
                } catch (Exception e5) {
                    return stack;
                }
            }
        } else {
            return stack;
        }
    }

    protected static boolean showStackRaw() {
        return (getPreference("filterstack").equals("true") && fgFilterStack) ? false : true;
    }

    static boolean filterLine(String line) {
        String[] patterns = {"junit.framework.TestCase", "junit.framework.TestResult", "junit.framework.TestSuite", "junit.framework.Assert.", "junit.swingui.TestRunner", "junit.awtui.TestRunner", "junit.textui.TestRunner", "java.lang.reflect.Method.invoke("};
        for (String str : patterns) {
            if (line.indexOf(str) > 0) {
                return true;
            }
        }
        return false;
    }
}
