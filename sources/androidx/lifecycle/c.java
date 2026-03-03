package androidx.lifecycle;

import androidx.lifecycle.l;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c implements n {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final h[] f3795;

    public c(h[] hVarArr) {
        f4.k.m8623(hVarArr, "generatedAdapters");
        this.f3795 = hVarArr;
    }

    @Override // androidx.lifecycle.n
    /* renamed from: ʿ */
    public void mo389(p pVar, l.a aVar) {
        f4.k.m8623(pVar, "source");
        f4.k.m8623(aVar, "event");
        u uVar = new u();
        for (h hVar : this.f3795) {
            hVar.m4426(pVar, aVar, false, uVar);
        }
        for (h hVar2 : this.f3795) {
            hVar2.m4426(pVar, aVar, true, uVar);
        }
    }
}
