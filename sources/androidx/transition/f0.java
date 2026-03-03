package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.core.view.f1;

/* compiled from: ViewUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final r0 f4500;

    /* renamed from: ʼ, reason: contains not printable characters */
    static final Property<View, Float> f4501;

    /* renamed from: ʽ, reason: contains not printable characters */
    static final Property<View, Rect> f4502;

    /* compiled from: ViewUtils.java */
    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(f0.m5352(view));
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Float f5) {
            f0.m5356(view, f5.floatValue());
        }
    }

    /* compiled from: ViewUtils.java */
    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return f1.m2900(view);
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            f1.m2839(view, rect);
        }
    }

    static {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            f4500 = new q0();
        } else if (i5 >= 23) {
            f4500 = new p0();
        } else if (i5 >= 22) {
            f4500 = new n0();
        } else if (i5 >= 21) {
            f4500 = new l0();
        } else {
            f4500 = new i0();
        }
        f4501 = new a(Float.class, "translationAlpha");
        f4502 = new b(Rect.class, "clipBounds");
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m5350(View view) {
        f4500.mo5369(view);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static e0 m5351(View view) {
        return new d0(view);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static float m5352(View view) {
        return f4500.mo5370(view);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static u0 m5353(View view) {
        return new t0(view);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static void m5354(View view) {
        f4500.mo5371(view);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static void m5355(View view, int i5, int i6, int i7, int i8) {
        f4500.mo5383(view, i5, i6, i7, i8);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static void m5356(View view, float f5) {
        f4500.mo5372(view, f5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static void m5357(View view, int i5) {
        f4500.mo5388(view, i5);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m5358(View view, Matrix matrix) {
        f4500.mo5379(view, matrix);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static void m5359(View view, Matrix matrix) {
        f4500.mo5380(view, matrix);
    }
}
