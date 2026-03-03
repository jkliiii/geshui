package b4;

import f4.k;

/* compiled from: JDK7PlatformImplementations.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends a4.a {

    /* compiled from: JDK7PlatformImplementations.kt */
    /* renamed from: b4.a$a, reason: collision with other inner class name */
    private static final class C0070a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final C0070a f4872 = new C0070a();

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final Integer f4873;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null) {
                if (num2.intValue() > 0) {
                    num = num2;
                }
            }
            f4873 = num;
        }

        private C0070a() {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final boolean m5709(int i5) {
        Integer num = C0070a.f4873;
        return num == null || num.intValue() >= i5;
    }

    @Override // a4.a
    /* renamed from: ʻ */
    public void mo199(Throwable th, Throwable th2) {
        k.m8623(th, "cause");
        k.m8623(th2, "exception");
        if (m5709(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo199(th, th2);
        }
    }
}
