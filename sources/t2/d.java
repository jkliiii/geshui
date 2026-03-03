package t2;

import java.lang.reflect.Type;
import java.nio.charset.Charset;
import k2.q;
import k2.s;
import m2.f;
import m2.v;

/* compiled from: StringParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d implements a<String> {

    /* renamed from: ʻ, reason: contains not printable characters */
    Charset f11286;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public /* synthetic */ String m12048(String str, q qVar) throws Exception {
        Charset charset = this.f11286;
        if (charset == null && str != null) {
            charset = Charset.forName(str);
        }
        return qVar.m9506(charset);
    }

    @Override // t2.a
    public Type getType() {
        return String.class;
    }

    @Override // t2.a
    /* renamed from: ʻ */
    public String mo12045() {
        return null;
    }

    @Override // t2.a
    /* renamed from: ʼ */
    public f<String> mo12046(s sVar) {
        final String mo9372 = sVar.mo9372();
        return new b().mo12046(sVar).mo9862(new v() { // from class: t2.c
            @Override // m2.v
            /* renamed from: ʻ */
            public final Object mo9431(Object obj) {
                return this.f11284.m12048(mo9372, (q) obj);
            }
        });
    }
}
