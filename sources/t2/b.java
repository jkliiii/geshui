package t2;

import java.lang.reflect.Type;
import k2.q;
import k2.s;
import m2.f;
import m2.t;

/* compiled from: ByteBufferListParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements t2.a<q> {

    /* compiled from: ByteBufferListParser.java */
    class a extends t<q> {

        /* renamed from: י, reason: contains not printable characters */
        final /* synthetic */ s f11277;

        a(s sVar) {
            this.f11277 = sVar;
        }

        @Override // m2.k
        /* renamed from: ˋ */
        protected void mo9466() {
            this.f11277.close();
        }
    }

    /* compiled from: ByteBufferListParser.java */
    /* renamed from: t2.b$b, reason: collision with other inner class name */
    class C0161b implements l2.d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ q f11279;

        C0161b(q qVar) {
            this.f11279 = qVar;
        }

        @Override // l2.d
        /* renamed from: ᵢ */
        public void mo9377(s sVar, q qVar) {
            qVar.m9489(this.f11279);
        }
    }

    /* compiled from: ByteBufferListParser.java */
    class c implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ t f11281;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ q f11282;

        c(t tVar, q qVar) {
            this.f11281 = tVar;
            this.f11282 = qVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (exc != null) {
                this.f11281.m9905(exc);
                return;
            }
            try {
                this.f11281.m9906(this.f11282);
            } catch (Exception e5) {
                this.f11281.m9905(e5);
            }
        }
    }

    @Override // t2.a
    public Type getType() {
        return q.class;
    }

    @Override // t2.a
    /* renamed from: ʻ */
    public String mo12045() {
        return null;
    }

    @Override // t2.a
    /* renamed from: ʼ */
    public f<q> mo12046(s sVar) {
        q qVar = new q();
        a aVar = new a(sVar);
        sVar.mo9362(new C0161b(qVar));
        sVar.mo9366(new c(aVar, qVar));
        return aVar;
    }
}
