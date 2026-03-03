package androidx.lifecycle;

import androidx.lifecycle.l;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f implements n {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f3806;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final n f3807;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    public /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f3808;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f3808 = iArr;
        }
    }

    public f(e eVar, n nVar) {
        f4.k.m8623(eVar, "defaultLifecycleObserver");
        this.f3806 = eVar;
        this.f3807 = nVar;
    }

    @Override // androidx.lifecycle.n
    /* renamed from: ʿ */
    public void mo389(p pVar, l.a aVar) {
        f4.k.m8623(pVar, "source");
        f4.k.m8623(aVar, "event");
        switch (a.f3808[aVar.ordinal()]) {
            case 1:
                this.f3806.mo3753(pVar);
                break;
            case 2:
                this.f3806.onStart(pVar);
                break;
            case 3:
                this.f3806.mo3752(pVar);
                break;
            case 4:
                this.f3806.mo3754(pVar);
                break;
            case 5:
                this.f3806.onStop(pVar);
                break;
            case 6:
                this.f3806.onDestroy(pVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        n nVar = this.f3807;
        if (nVar != null) {
            nVar.mo389(pVar, aVar);
        }
    }
}
