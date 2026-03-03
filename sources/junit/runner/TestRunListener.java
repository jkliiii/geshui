package junit.runner;

/* loaded from: E:\78999\cookie_192572.dex */
public interface TestRunListener {
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_FAILURE = 2;

    void testEnded(String str);

    void testFailed(int i5, String str, String str2);

    void testRunEnded(long j5);

    void testRunStarted(String str, int i5);

    void testRunStopped(long j5);

    void testStarted(String str);
}
