package z2;

/* compiled from: LruBitmapCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e extends v2.g<String, b> {

    /* renamed from: ˊ, reason: contains not printable characters */
    private i<String, b> f12787;

    public e(int i5) {
        super(i5);
        this.f12787 = new i<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v2.g
    /* renamed from: ˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo12344(boolean z5, String str, b bVar, b bVar2) {
        super.mo12344(z5, str, bVar, bVar2);
        if (z5) {
            this.f12787.m13181(str, bVar);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public b m13172(String str) {
        b m12359 = m12359(str);
        if (m12359 != null) {
            return m12359;
        }
        b m13182 = this.f12787.m13182(str);
        if (m13182 != null) {
            m12361(str, m13182);
        }
        return m13182;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m13173(String str, b bVar) {
        this.f12787.m13181(str, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // v2.g
    /* renamed from: י, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public long mo12345(String str, b bVar) {
        return bVar.m13152();
    }
}
