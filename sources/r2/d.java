package r2;

import k2.q;
import k2.s;
import k2.x;

/* compiled from: ContentLengthFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends x {

    /* renamed from: ˉ, reason: contains not printable characters */
    long f10832;

    /* renamed from: ˊ, reason: contains not printable characters */
    long f10833;

    /* renamed from: ˋ, reason: contains not printable characters */
    q f10834 = new q();

    public d(long j5) {
        this.f10832 = j5;
    }

    @Override // k2.t
    /* renamed from: ʿʿ */
    protected void mo9511(Exception exc) {
        if (exc == null && this.f10833 != this.f10832) {
            exc = new h("End of data reached before content length was read: " + this.f10833 + "/" + this.f10832 + " Paused: " + mo9370());
        }
        super.mo9511(exc);
    }

    @Override // k2.x, l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        qVar.m9490(this.f10834, (int) Math.min(this.f10832 - this.f10833, qVar.m9500()));
        int m9500 = this.f10834.m9500();
        super.mo9377(sVar, this.f10834);
        this.f10833 += m9500 - this.f10834.m9500();
        this.f10834.m9489(qVar);
        if (this.f10833 == this.f10832) {
            mo9511(null);
        }
    }
}
