package androidx.core.text;

import java.util.Locale;

/* compiled from: TextDirectionHeuristicsCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final b0 f2828 = new e(null, false);

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final b0 f2829 = new e(null, true);

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final b0 f2830;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final b0 f2831;

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final b0 f2832;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final b0 f2833;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class a implements c {

        /* renamed from: ʼ, reason: contains not printable characters */
        static final a f2834 = new a(true);

        /* renamed from: ʻ, reason: contains not printable characters */
        private final boolean f2835;

        private a(boolean z5) {
            this.f2835 = z5;
        }

        @Override // androidx.core.text.c0.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public int mo2530(CharSequence charSequence, int i5, int i6) {
            int i7 = i6 + i5;
            boolean z5 = false;
            while (i5 < i7) {
                int m2528 = c0.m2528(Character.getDirectionality(charSequence.charAt(i5)));
                if (m2528 != 0) {
                    if (m2528 != 1) {
                        continue;
                        i5++;
                    } else if (!this.f2835) {
                        return 1;
                    }
                } else if (this.f2835) {
                    return 0;
                }
                z5 = true;
                i5++;
            }
            if (z5) {
                return this.f2835 ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class b implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final b f2836 = new b();

        private b() {
        }

        @Override // androidx.core.text.c0.c
        /* renamed from: ʻ */
        public int mo2530(CharSequence charSequence, int i5, int i6) {
            int i7 = i6 + i5;
            int i8 = 2;
            while (i5 < i7 && i8 == 2) {
                i8 = c0.m2529(Character.getDirectionality(charSequence.charAt(i5)));
                i5++;
            }
            return i8;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private interface c {
        /* renamed from: ʻ */
        int mo2530(CharSequence charSequence, int i5, int i6);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static abstract class d implements b0 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final c f2837;

        d(c cVar) {
            this.f2837 = cVar;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean m2531(CharSequence charSequence, int i5, int i6) {
            int mo2530 = this.f2837.mo2530(charSequence, i5, i6);
            if (mo2530 == 0) {
                return true;
            }
            if (mo2530 != 1) {
                return mo2532();
            }
            return false;
        }

        @Override // androidx.core.text.b0
        public boolean isRtl(CharSequence charSequence, int i5, int i6) {
            if (charSequence == null || i5 < 0 || i6 < 0 || charSequence.length() - i6 < i5) {
                throw new IllegalArgumentException();
            }
            return this.f2837 == null ? mo2532() : m2531(charSequence, i5, i6);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        protected abstract boolean mo2532();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class e extends d {

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean f2838;

        e(c cVar, boolean z5) {
            super(cVar);
            this.f2838 = z5;
        }

        @Override // androidx.core.text.c0.d
        /* renamed from: ʻ */
        protected boolean mo2532() {
            return this.f2838;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    private static class f extends d {

        /* renamed from: ʼ, reason: contains not printable characters */
        static final f f2839 = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.c0.d
        /* renamed from: ʻ */
        protected boolean mo2532() {
            return d0.m2534(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f2836;
        f2830 = new e(bVar, false);
        f2831 = new e(bVar, true);
        f2832 = new e(a.f2834, false);
        f2833 = f.f2839;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static int m2528(int i5) {
        if (i5 != 0) {
            return (i5 == 1 || i5 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static int m2529(int i5) {
        if (i5 != 0) {
            if (i5 == 1 || i5 == 2) {
                return 0;
            }
            switch (i5) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
