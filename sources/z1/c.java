package z1;

/* compiled from: StateVerifier.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c {

    /* compiled from: StateVerifier.java */
    private static class b extends c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private volatile boolean f12766;

        b() {
            super();
        }

        @Override // z1.c
        /* renamed from: ʼ */
        public void mo13150(boolean z5) {
            this.f12766 = z5;
        }

        @Override // z1.c
        /* renamed from: ʽ */
        public void mo13151() {
            if (this.f12766) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private c() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static c m13149() {
        return new b();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    abstract void mo13150(boolean z5);

    /* renamed from: ʽ, reason: contains not printable characters */
    public abstract void mo13151();
}
