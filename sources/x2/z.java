package x2;

/* compiled from: RequestBodyUploadObserver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class z implements o2.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    o2.a f12380;

    /* renamed from: ʼ, reason: contains not printable characters */
    y f12381;

    /* compiled from: RequestBodyUploadObserver.java */
    class a implements k2.u {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f12382;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ k2.u f12383;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ int f12384;

        a(k2.u uVar, int i5) {
            this.f12383 = uVar;
            this.f12384 = i5;
        }

        @Override // k2.u
        public void end() {
            this.f12383.end();
        }

        @Override // k2.u
        /* renamed from: ʻ */
        public k2.k mo9358() {
            return this.f12383.mo9358();
        }

        @Override // k2.u
        /* renamed from: ˋ */
        public void mo9361(k2.q qVar) {
            int m9500 = qVar.m9500();
            this.f12383.mo9361(qVar);
            int m95002 = this.f12382 + (m9500 - qVar.m9500());
            this.f12382 = m95002;
            z.this.f12381.mo9030(m95002, this.f12384);
        }

        @Override // k2.u
        /* renamed from: י */
        public void mo9364(l2.g gVar) {
            this.f12383.mo9364(gVar);
        }

        @Override // k2.u
        /* renamed from: ᴵᴵ */
        public void mo9368(l2.a aVar) {
            this.f12383.mo9368(aVar);
        }
    }

    public z(o2.a aVar, y yVar) {
        this.f12380 = aVar;
        this.f12381 = yVar;
    }

    @Override // o2.a
    public int length() {
        return this.f12380.length();
    }

    @Override // o2.a
    /* renamed from: ʻʻ */
    public void mo10974(n2.e eVar, k2.u uVar, l2.a aVar) {
        this.f12380.mo10974(eVar, new a(uVar, this.f12380.length()), aVar);
    }

    @Override // o2.a
    /* renamed from: ﹶ */
    public String mo10975() {
        return this.f12380.mo10975();
    }
}
