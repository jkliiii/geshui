package x3;

import e4.p;
import f4.k;
import java.io.Serializable;
import x3.e;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f implements e, Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final f f12391 = new f();

    private f() {
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // x3.e
    /* renamed from: ˆ */
    public <E extends e.a> E mo10126(e.b<E> bVar) {
        k.m8623(bVar, "key");
        return null;
    }

    @Override // x3.e
    /* renamed from: ˎ */
    public <R> R mo10127(R r5, p<? super R, ? super e.a, ? extends R> pVar) {
        k.m8623(pVar, "operation");
        return r5;
    }
}
