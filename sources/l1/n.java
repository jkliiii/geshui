package l1;

/* compiled from: DownsampleStrategy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class n {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final n f8985 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final n f8986 = new b();

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final n f8987 = new e();

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final n f8988 = new c();

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final n f8989;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final n f8990;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final n f8991;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final c1.g<n> f8992;

    /* renamed from: ˊ, reason: contains not printable characters */
    static final boolean f8993;

    /* compiled from: DownsampleStrategy.java */
    private static class a extends n {
        a() {
        }

        @Override // l1.n
        /* renamed from: ʻ */
        public g mo9673(int i5, int i6, int i7, int i8) {
            return g.QUALITY;
        }

        @Override // l1.n
        /* renamed from: ʼ */
        public float mo9674(int i5, int i6, int i7, int i8) {
            if (Math.min(i6 / i8, i5 / i7) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class b extends n {
        b() {
        }

        @Override // l1.n
        /* renamed from: ʻ */
        public g mo9673(int i5, int i6, int i7, int i8) {
            return g.MEMORY;
        }

        @Override // l1.n
        /* renamed from: ʼ */
        public float mo9674(int i5, int i6, int i7, int i8) {
            int ceil = (int) Math.ceil(Math.max(i6 / i8, i5 / i7));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class c extends n {
        c() {
        }

        @Override // l1.n
        /* renamed from: ʻ */
        public g mo9673(int i5, int i6, int i7, int i8) {
            return mo9674(i5, i6, i7, i8) == 1.0f ? g.QUALITY : n.f8987.mo9673(i5, i6, i7, i8);
        }

        @Override // l1.n
        /* renamed from: ʼ */
        public float mo9674(int i5, int i6, int i7, int i8) {
            return Math.min(1.0f, n.f8987.mo9674(i5, i6, i7, i8));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class d extends n {
        d() {
        }

        @Override // l1.n
        /* renamed from: ʻ */
        public g mo9673(int i5, int i6, int i7, int i8) {
            return g.QUALITY;
        }

        @Override // l1.n
        /* renamed from: ʼ */
        public float mo9674(int i5, int i6, int i7, int i8) {
            return Math.max(i7 / i5, i8 / i6);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class e extends n {
        e() {
        }

        @Override // l1.n
        /* renamed from: ʻ */
        public g mo9673(int i5, int i6, int i7, int i8) {
            return n.f8993 ? g.QUALITY : g.MEMORY;
        }

        @Override // l1.n
        /* renamed from: ʼ */
        public float mo9674(int i5, int i6, int i7, int i8) {
            if (n.f8993) {
                return Math.min(i7 / i5, i8 / i6);
            }
            if (Math.max(i6 / i8, i5 / i7) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    private static class f extends n {
        f() {
        }

        @Override // l1.n
        /* renamed from: ʻ */
        public g mo9673(int i5, int i6, int i7, int i8) {
            return g.QUALITY;
        }

        @Override // l1.n
        /* renamed from: ʼ */
        public float mo9674(int i5, int i6, int i7, int i8) {
            return 1.0f;
        }
    }

    /* compiled from: DownsampleStrategy.java */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f8989 = dVar;
        f8990 = new f();
        f8991 = dVar;
        f8992 = c1.g.m5826("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f8993 = true;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract g mo9673(int i5, int i6, int i7, int i8);

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract float mo9674(int i5, int i6, int i7, int i8);
}
