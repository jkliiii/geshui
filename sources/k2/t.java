package k2;

/* compiled from: DataEmitterBase.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class t implements s {

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f8846;

    /* renamed from: ʼ, reason: contains not printable characters */
    l2.a f8847;

    /* renamed from: ʽ, reason: contains not printable characters */
    l2.d f8848;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final l2.a m9510() {
        return this.f8847;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    protected void mo9511(Exception exc) {
        if (this.f8846) {
            return;
        }
        this.f8846 = true;
        if (m9510() != null) {
            m9510().mo9412(exc);
        }
    }

    @Override // k2.s
    /* renamed from: ˎ */
    public void mo9362(l2.d dVar) {
        this.f8848 = dVar;
    }

    @Override // k2.s
    /* renamed from: ᐧ */
    public final void mo9366(l2.a aVar) {
        this.f8847 = aVar;
    }

    @Override // k2.s
    /* renamed from: ⁱ */
    public String mo9372() {
        return null;
    }

    @Override // k2.s
    /* renamed from: ﾞ */
    public l2.d mo9375() {
        return this.f8848;
    }
}
