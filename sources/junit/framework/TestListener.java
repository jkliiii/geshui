package junit.framework;

/* loaded from: E:\78999\cookie_192572.dex */
public interface TestListener {
    void addError(Test test, Throwable th);

    void addFailure(Test test, AssertionFailedError assertionFailedError);

    void endTest(Test test);

    void startTest(Test test);
}
