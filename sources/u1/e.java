package u1;

/* compiled from: RequestCoordinator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface e {

    /* compiled from: RequestCoordinator.java */
    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);


        /* renamed from: ʾ, reason: contains not printable characters */
        private final boolean f11475;

        a(boolean z5) {
            this.f11475 = z5;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m12171() {
            return this.f11475;
        }
    }

    e getRoot();

    /* renamed from: ʻ */
    boolean mo12156();

    /* renamed from: ʼ */
    boolean mo12157(d dVar);

    /* renamed from: ʾ */
    void mo12159(d dVar);

    /* renamed from: ˈ */
    boolean mo12162(d dVar);

    /* renamed from: ˉ */
    void mo12163(d dVar);

    /* renamed from: ˎ */
    boolean mo12166(d dVar);
}
