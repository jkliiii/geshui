package v0;

import java.util.HashSet;
import java.util.Set;

/* compiled from: StartupApiFeature.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class z {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Set<z> f11668 = new HashSet();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f11669;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f11670;

    /* compiled from: StartupApiFeature.java */
    public static class a extends z {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    /* compiled from: StartupApiFeature.java */
    public static class b extends z {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    z(String str, String str2) {
        this.f11669 = str;
        this.f11670 = str2;
        f11668.add(this);
    }
}
