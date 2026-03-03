package j0;

import f4.g;
import f4.k;
import j0.a;

/* compiled from: CreationExtras.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends a {
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // j0.a
    /* renamed from: ʻ */
    public <T> T mo9275(a.b<T> bVar) {
        k.m8623(bVar, "key");
        return (T) m9276().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    public final <T> void m9277(a.b<T> bVar, T t5) {
        k.m8623(bVar, "key");
        m9276().put(bVar, t5);
    }

    public b(a aVar) {
        k.m8623(aVar, "initialExtras");
        m9276().putAll(aVar.m9276());
    }

    public /* synthetic */ b(a aVar, int i5, g gVar) {
        this((i5 & 1) != 0 ? a.C0121a.f8610 : aVar);
    }
}
