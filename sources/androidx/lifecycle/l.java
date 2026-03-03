package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class l {

    /* renamed from: ʻ, reason: contains not printable characters */
    private AtomicReference<Object> f3830 = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0050a Companion = new C0050a(null);

        /* compiled from: Lifecycle.kt */
        /* renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name */
        public static final class C0050a {

            /* compiled from: Lifecycle.kt */
            /* renamed from: androidx.lifecycle.l$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0051a {

                /* renamed from: ʻ, reason: contains not printable characters */
                public static final /* synthetic */ int[] f3831;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f3831 = iArr;
                }
            }

            private C0050a() {
            }

            public /* synthetic */ C0050a(f4.g gVar) {
                this();
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            public final a m4451(b bVar) {
                f4.k.m8623(bVar, "state");
                int i5 = C0051a.f3831[bVar.ordinal()];
                if (i5 == 1) {
                    return a.ON_DESTROY;
                }
                if (i5 == 2) {
                    return a.ON_STOP;
                }
                if (i5 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            /* renamed from: ʼ, reason: contains not printable characters */
            public final a m4452(b bVar) {
                f4.k.m8623(bVar, "state");
                int i5 = C0051a.f3831[bVar.ordinal()];
                if (i5 == 1) {
                    return a.ON_START;
                }
                if (i5 == 2) {
                    return a.ON_RESUME;
                }
                if (i5 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            /* renamed from: ʽ, reason: contains not printable characters */
            public final a m4453(b bVar) {
                f4.k.m8623(bVar, "state");
                int i5 = C0051a.f3831[bVar.ordinal()];
                if (i5 == 1) {
                    return a.ON_CREATE;
                }
                if (i5 == 2) {
                    return a.ON_START;
                }
                if (i5 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        /* compiled from: Lifecycle.kt */
        public /* synthetic */ class b {

            /* renamed from: ʻ, reason: contains not printable characters */
            public static final /* synthetic */ int[] f3832;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f3832 = iArr;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static final a m4448(b bVar) {
            return Companion.m4451(bVar);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static final a m4449(b bVar) {
            return Companion.m4453(bVar);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public final b m4450() {
            switch (b.f3832[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final boolean m4455(b bVar) {
            f4.k.m8623(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract void mo4444(o oVar);

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract b mo4445();

    /* renamed from: ʽ, reason: contains not printable characters */
    public abstract void mo4446(o oVar);
}
