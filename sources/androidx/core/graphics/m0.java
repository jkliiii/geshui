package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.f;
import androidx.core.content.res.i;
import androidx.core.provider.g;

/* compiled from: TypefaceCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final o1 f2707;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final m.e<String, Typeface> f2708;

    /* compiled from: TypefaceCompat.java */
    public static class a extends g.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private i.f f2709;

        public a(i.f fVar) {
            this.f2709 = fVar;
        }

        @Override // androidx.core.provider.g.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo2326(int i5) {
            i.f fVar = this.f2709;
            if (fVar != null) {
                fVar.m2128(i5);
            }
        }

        @Override // androidx.core.provider.g.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo2327(Typeface typeface) {
            i.f fVar = this.f2709;
            if (fVar != null) {
                fVar.m2129(typeface);
            }
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            f2707 = new n1();
        } else if (i5 >= 28) {
            f2707 = new y0();
        } else if (i5 >= 26) {
            f2707 = new x0();
        } else if (i5 >= 24 && s0.m2374()) {
            f2707 = new s0();
        } else if (i5 >= 21) {
            f2707 = new r0();
        } else {
            f2707 = new o1();
        }
        f2708 = new m.e<>(16);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Typeface m2318(Context context, Typeface typeface, int i5) {
        Typeface m2324;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (m2324 = m2324(context, typeface, i5)) == null) ? Typeface.create(typeface, i5) : m2324;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Typeface m2319(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i5) {
        return f2707.mo2334(context, cancellationSignal, bVarArr, i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Typeface m2320(Context context, f.b bVar, Resources resources, int i5, String str, int i6, int i7, i.f fVar, Handler handler, boolean z5) {
        Typeface mo2333;
        if (bVar instanceof f.e) {
            f.e eVar = (f.e) bVar;
            Typeface m2325 = m2325(eVar.m2097());
            if (m2325 != null) {
                if (fVar != null) {
                    fVar.m2131(m2325, handler);
                }
                return m2325;
            }
            mo2333 = androidx.core.provider.g.m2479(context, eVar.m2096(), i7, !z5 ? fVar != null : eVar.m2095() != 0, z5 ? eVar.m2098() : -1, i.f.m2127(handler), new a(fVar));
        } else {
            mo2333 = f2707.mo2333(context, (f.c) bVar, resources, i7);
            if (fVar != null) {
                if (mo2333 != null) {
                    fVar.m2131(mo2333, handler);
                } else {
                    fVar.m2130(-3, handler);
                }
            }
        }
        if (mo2333 != null) {
            f2708.m9808(m2322(resources, i5, str, i6, i7), mo2333);
        }
        return mo2333;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static Typeface m2321(Context context, Resources resources, int i5, String str, int i6, int i7) {
        Typeface mo2336 = f2707.mo2336(context, resources, i5, str, i7);
        if (mo2336 != null) {
            f2708.m9808(m2322(resources, i5, str, i6, i7), mo2336);
        }
        return mo2336;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static String m2322(Resources resources, int i5, String str, int i6, int i7) {
        return resources.getResourcePackageName(i5) + '-' + str + '-' + i6 + '-' + i5 + '-' + i7;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static Typeface m2323(Resources resources, int i5, String str, int i6, int i7) {
        return f2708.m9807(m2322(resources, i5, str, i6, i7));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static Typeface m2324(Context context, Typeface typeface, int i5) {
        o1 o1Var = f2707;
        f.c m2345 = o1Var.m2345(typeface);
        if (m2345 == null) {
            return null;
        }
        return o1Var.mo2333(context, m2345, context.getResources(), i5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static Typeface m2325(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
