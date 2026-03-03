package f4;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Reflection.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class r {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final s f7800;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final j4.b[] f7801;

    static {
        s sVar = null;
        try {
            sVar = (s) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (sVar == null) {
            sVar = new s();
        }
        f7800 = sVar;
        f7801 = new j4.b[0];
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static j4.d m8633(i iVar) {
        return f7800.m8639(iVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static j4.b m8634(Class cls) {
        return f7800.m8640(cls);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static j4.c m8635(Class cls) {
        return f7800.m8641(cls, BuildConfig.FLAVOR);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static j4.e m8636(n nVar) {
        return f7800.m8642(nVar);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static String m8637(h hVar) {
        return f7800.m8643(hVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static String m8638(l lVar) {
        return f7800.m8644(lVar);
    }
}
