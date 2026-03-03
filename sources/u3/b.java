package u3;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* compiled from: SmartTabIndicationInterpolator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final b f11579 = new C0164b();

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final b f11580 = new a();

    /* compiled from: SmartTabIndicationInterpolator.java */
    /* renamed from: u3.b$b, reason: collision with other inner class name */
    public static class C0164b extends b {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Interpolator f11581;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Interpolator f11582;

        public C0164b() {
            this(3.0f);
        }

        @Override // u3.b
        /* renamed from: ʻ */
        public float mo12212(float f5) {
            return this.f11581.getInterpolation(f5);
        }

        @Override // u3.b
        /* renamed from: ʼ */
        public float mo12213(float f5) {
            return this.f11582.getInterpolation(f5);
        }

        @Override // u3.b
        /* renamed from: ʽ */
        public float mo12214(float f5) {
            return 1.0f / ((1.0f - mo12212(f5)) + mo12213(f5));
        }

        public C0164b(float f5) {
            this.f11581 = new AccelerateInterpolator(f5);
            this.f11582 = new DecelerateInterpolator(f5);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static b m12211(int i5) {
        if (i5 == 0) {
            return f11579;
        }
        if (i5 == 1) {
            return f11580;
        }
        throw new IllegalArgumentException("Unknown id: " + i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract float mo12212(float f5);

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract float mo12213(float f5);

    /* renamed from: ʽ, reason: contains not printable characters */
    public float mo12214(float f5) {
        return 1.0f;
    }

    /* compiled from: SmartTabIndicationInterpolator.java */
    public static class a extends b {
        @Override // u3.b
        /* renamed from: ʻ */
        public float mo12212(float f5) {
            return f5;
        }

        @Override // u3.b
        /* renamed from: ʼ */
        public float mo12213(float f5) {
            return f5;
        }
    }
}
