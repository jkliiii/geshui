package x2;

import java.io.InputStream;
import java.lang.reflect.Type;

/* compiled from: InputStreamParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k implements t2.a<InputStream> {
    k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static /* synthetic */ InputStream m12707(k2.q qVar) throws Exception {
        return new u2.a(qVar);
    }

    @Override // t2.a
    public Type getType() {
        return InputStream.class;
    }

    @Override // t2.a
    /* renamed from: ʻ */
    public String mo12045() {
        return null;
    }

    @Override // t2.a
    /* renamed from: ʼ */
    public m2.f<InputStream> mo12046(k2.s sVar) {
        return new t2.b().mo12046(sVar).mo9862(new m2.v() { // from class: x2.j
            @Override // m2.v
            /* renamed from: ʻ */
            public final Object mo9431(Object obj) {
                return k.m12707((k2.q) obj);
            }
        });
    }
}
