package q4;

/* compiled from: SystemProps.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final /* synthetic */ class q {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final int f10655 = Runtime.getRuntime().availableProcessors();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final int m11528() {
        return f10655;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final String m11529(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
