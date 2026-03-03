package com.google.android.material.transition.platform;

/* compiled from: FadeModeEvaluators.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final com.google.android.material.transition.platform.a f6599 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final com.google.android.material.transition.platform.a f6600 = new C0090b();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final com.google.android.material.transition.platform.a f6601 = new c();

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final com.google.android.material.transition.platform.a f6602 = new d();

    /* compiled from: FadeModeEvaluators.java */
    class a implements com.google.android.material.transition.platform.a {
        a() {
        }

        @Override // com.google.android.material.transition.platform.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.platform.c mo7730(float f5, float f6, float f7, float f8) {
            return com.google.android.material.transition.platform.c.m7732(255, q.m7764(0, 255, f6, f7, f5));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.platform.b$b, reason: collision with other inner class name */
    class C0090b implements com.google.android.material.transition.platform.a {
        C0090b() {
        }

        @Override // com.google.android.material.transition.platform.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.platform.c mo7730(float f5, float f6, float f7, float f8) {
            return com.google.android.material.transition.platform.c.m7733(q.m7764(255, 0, f6, f7, f5), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    class c implements com.google.android.material.transition.platform.a {
        c() {
        }

        @Override // com.google.android.material.transition.platform.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.platform.c mo7730(float f5, float f6, float f7, float f8) {
            return com.google.android.material.transition.platform.c.m7733(q.m7764(255, 0, f6, f7, f5), q.m7764(0, 255, f6, f7, f5));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    class d implements com.google.android.material.transition.platform.a {
        d() {
        }

        @Override // com.google.android.material.transition.platform.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.platform.c mo7730(float f5, float f6, float f7, float f8) {
            float f9 = ((f7 - f6) * f8) + f6;
            return com.google.android.material.transition.platform.c.m7733(q.m7764(255, 0, f6, f9, f5), q.m7764(0, 255, f9, f7, f5));
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static com.google.android.material.transition.platform.a m7731(int i5, boolean z5) {
        if (i5 == 0) {
            return z5 ? f6599 : f6600;
        }
        if (i5 == 1) {
            return z5 ? f6600 : f6599;
        }
        if (i5 == 2) {
            return f6601;
        }
        if (i5 == 3) {
            return f6602;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i5);
    }
}
