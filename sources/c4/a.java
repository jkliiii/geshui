package c4;

import g4.c;
import h4.b;

/* compiled from: JDK8PlatformImplementations.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends b4.a {

    /* compiled from: JDK8PlatformImplementations.kt */
    /* renamed from: c4.a$a, reason: collision with other inner class name */
    private static final class C0076a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final C0076a f4995 = new C0076a();

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final Integer f4996;

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
            f4996 = num;
        }

        private C0076a() {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final boolean m5853(int i5) {
        Integer num = C0076a.f4996;
        return num == null || num.intValue() >= i5;
    }

    @Override // a4.a
    /* renamed from: ʼ */
    public c mo200() {
        return m5853(34) ? new b() : super.mo200();
    }
}
