package com.google.android.material.transition;

/* compiled from: FadeModeEvaluators.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final com.google.android.material.transition.a f6494 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final com.google.android.material.transition.a f6495 = new C0089b();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final com.google.android.material.transition.a f6496 = new c();

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final com.google.android.material.transition.a f6497 = new d();

    /* compiled from: FadeModeEvaluators.java */
    class a implements com.google.android.material.transition.a {
        a() {
        }

        @Override // com.google.android.material.transition.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.c mo7673(float f5, float f6, float f7, float f8) {
            return com.google.android.material.transition.c.m7675(255, k.m7700(0, 255, f6, f7, f5));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    /* renamed from: com.google.android.material.transition.b$b, reason: collision with other inner class name */
    class C0089b implements com.google.android.material.transition.a {
        C0089b() {
        }

        @Override // com.google.android.material.transition.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.c mo7673(float f5, float f6, float f7, float f8) {
            return com.google.android.material.transition.c.m7676(k.m7700(255, 0, f6, f7, f5), 255);
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    class c implements com.google.android.material.transition.a {
        c() {
        }

        @Override // com.google.android.material.transition.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.c mo7673(float f5, float f6, float f7, float f8) {
            return com.google.android.material.transition.c.m7676(k.m7700(255, 0, f6, f7, f5), k.m7700(0, 255, f6, f7, f5));
        }
    }

    /* compiled from: FadeModeEvaluators.java */
    class d implements com.google.android.material.transition.a {
        d() {
        }

        @Override // com.google.android.material.transition.a
        /* renamed from: ʻ */
        public com.google.android.material.transition.c mo7673(float f5, float f6, float f7, float f8) {
            float f9 = ((f7 - f6) * f8) + f6;
            return com.google.android.material.transition.c.m7676(k.m7700(255, 0, f6, f9, f5), k.m7700(0, 255, f9, f7, f5));
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static com.google.android.material.transition.a m7674(int i5, boolean z5) {
        if (i5 == 0) {
            return z5 ? f6494 : f6495;
        }
        if (i5 == 1) {
            return z5 ? f6495 : f6494;
        }
        if (i5 == 2) {
            return f6496;
        }
        if (i5 == 3) {
            return f6497;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i5);
    }
}
