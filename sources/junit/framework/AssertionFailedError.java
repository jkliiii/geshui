package junit.framework;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_192572.dex */
public class AssertionFailedError extends AssertionError {
    private static final long serialVersionUID = 1;

    public AssertionFailedError() {
    }

    public AssertionFailedError(String message) {
        super(defaultString(message));
    }

    private static String defaultString(String message) {
        return message == null ? BuildConfig.FLAVOR : message;
    }
}
