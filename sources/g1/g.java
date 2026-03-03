package g1;

import android.annotation.SuppressLint;
import e1.v;
import g1.h;

/* compiled from: LruResourceCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends y1.h<c1.f, v<?>> implements h {

    /* renamed from: ʿ, reason: contains not printable characters */
    private h.a f7855;

    public g(long j5) {
        super(j5);
    }

    @Override // g1.h
    @SuppressLint({"InlinedApi"})
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo8669(int i5) {
        if (i5 >= 40) {
            m12881();
        } else if (i5 >= 20 || i5 == 15) {
            m12886(m12883() / 2);
        }
    }

    @Override // g1.h
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo8670(h.a aVar) {
        this.f7855 = aVar;
    }

    @Override // g1.h
    /* renamed from: ʾ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ v mo8671(c1.f fVar, v vVar) {
        return (v) super.m12884(fVar, vVar);
    }

    @Override // g1.h
    /* renamed from: ʿ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ v mo8672(c1.f fVar) {
        return (v) super.m12885(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y1.h
    /* renamed from: י, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int mo8673(v<?> vVar) {
        return vVar == null ? super.mo8673(null) : vVar.mo8411();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y1.h
    /* renamed from: ـ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo8674(c1.f fVar, v<?> vVar) {
        h.a aVar = this.f7855;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.mo8378(vVar);
    }
}
