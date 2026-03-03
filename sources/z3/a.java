package z3;

import f4.k;
import java.io.Serializable;
import v3.j;
import v3.p;

/* compiled from: ContinuationImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a implements x3.c<Object>, d, Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final x3.c<Object> f12794;

    public a(x3.c<Object> cVar) {
        this.f12794 = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object m13185 = m13185();
        if (m13185 == null) {
            m13185 = getClass().getName();
        }
        sb.append(m13185);
        return sb.toString();
    }

    /* renamed from: ʻ */
    public x3.c<p> mo3057(Object obj, x3.c<?> cVar) {
        k.m8623(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final x3.c<Object> m13184() {
        return this.f12794;
    }

    @Override // z3.d
    /* renamed from: ʾ */
    public d mo10176() {
        x3.c<Object> cVar = this.f12794;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x3.c
    /* renamed from: ˈ */
    public final void mo9541(Object obj) {
        Object mo3059;
        x3.c cVar = this;
        while (true) {
            g.m13193(cVar);
            a aVar = (a) cVar;
            x3.c cVar2 = aVar.f12794;
            k.m8620(cVar2);
            try {
                mo3059 = aVar.mo3059(obj);
            } catch (Throwable th) {
                j.a aVar2 = v3.j.f11729;
                obj = v3.j.m12380(v3.k.m12382(th));
            }
            if (mo3059 == y3.d.m12938()) {
                return;
            }
            obj = v3.j.m12380(mo3059);
            aVar.mo13186();
            if (!(cVar2 instanceof a)) {
                cVar2.mo9541(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public StackTraceElement m13185() {
        return f.m13191(this);
    }

    /* renamed from: ˋ */
    protected abstract Object mo3059(Object obj);

    /* renamed from: ˎ, reason: contains not printable characters */
    protected void mo13186() {
    }
}
