package e1;

/* compiled from: DiskCacheStrategy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final j f7450 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final j f7451 = new b();

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final j f7452 = new c();

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final j f7453 = new d();

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final j f7454 = new e();

    /* compiled from: DiskCacheStrategy.java */
    class a extends j {
        a() {
        }

        @Override // e1.j
        /* renamed from: ʻ */
        public boolean mo8366() {
            return true;
        }

        @Override // e1.j
        /* renamed from: ʼ */
        public boolean mo8367() {
            return true;
        }

        @Override // e1.j
        /* renamed from: ʽ */
        public boolean mo8368(c1.a aVar) {
            return aVar == c1.a.REMOTE;
        }

        @Override // e1.j
        /* renamed from: ʾ */
        public boolean mo8369(boolean z5, c1.a aVar, c1.c cVar) {
            return (aVar == c1.a.RESOURCE_DISK_CACHE || aVar == c1.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    class b extends j {
        b() {
        }

        @Override // e1.j
        /* renamed from: ʻ */
        public boolean mo8366() {
            return false;
        }

        @Override // e1.j
        /* renamed from: ʼ */
        public boolean mo8367() {
            return false;
        }

        @Override // e1.j
        /* renamed from: ʽ */
        public boolean mo8368(c1.a aVar) {
            return false;
        }

        @Override // e1.j
        /* renamed from: ʾ */
        public boolean mo8369(boolean z5, c1.a aVar, c1.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    class c extends j {
        c() {
        }

        @Override // e1.j
        /* renamed from: ʻ */
        public boolean mo8366() {
            return true;
        }

        @Override // e1.j
        /* renamed from: ʼ */
        public boolean mo8367() {
            return false;
        }

        @Override // e1.j
        /* renamed from: ʽ */
        public boolean mo8368(c1.a aVar) {
            return (aVar == c1.a.DATA_DISK_CACHE || aVar == c1.a.MEMORY_CACHE) ? false : true;
        }

        @Override // e1.j
        /* renamed from: ʾ */
        public boolean mo8369(boolean z5, c1.a aVar, c1.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    class d extends j {
        d() {
        }

        @Override // e1.j
        /* renamed from: ʻ */
        public boolean mo8366() {
            return false;
        }

        @Override // e1.j
        /* renamed from: ʼ */
        public boolean mo8367() {
            return true;
        }

        @Override // e1.j
        /* renamed from: ʽ */
        public boolean mo8368(c1.a aVar) {
            return false;
        }

        @Override // e1.j
        /* renamed from: ʾ */
        public boolean mo8369(boolean z5, c1.a aVar, c1.c cVar) {
            return (aVar == c1.a.RESOURCE_DISK_CACHE || aVar == c1.a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    class e extends j {
        e() {
        }

        @Override // e1.j
        /* renamed from: ʻ */
        public boolean mo8366() {
            return true;
        }

        @Override // e1.j
        /* renamed from: ʼ */
        public boolean mo8367() {
            return true;
        }

        @Override // e1.j
        /* renamed from: ʽ */
        public boolean mo8368(c1.a aVar) {
            return aVar == c1.a.REMOTE;
        }

        @Override // e1.j
        /* renamed from: ʾ */
        public boolean mo8369(boolean z5, c1.a aVar, c1.c cVar) {
            return ((z5 && aVar == c1.a.DATA_DISK_CACHE) || aVar == c1.a.LOCAL) && cVar == c1.c.TRANSFORMED;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public abstract boolean mo8366();

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract boolean mo8367();

    /* renamed from: ʽ, reason: contains not printable characters */
    public abstract boolean mo8368(c1.a aVar);

    /* renamed from: ʾ, reason: contains not printable characters */
    public abstract boolean mo8369(boolean z5, c1.a aVar, c1.c cVar);
}
