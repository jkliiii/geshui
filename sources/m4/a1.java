package m4;

/* compiled from: CoroutineContext.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a1<T> extends q4.n<T> {
    private volatile boolean threadLocalIsSet;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final ThreadLocal<v3.i<x3.e, Object>> f9331;

    @Override // q4.n, m4.a
    /* renamed from: ʻˑ */
    protected void mo10106(Object obj) {
        if (this.threadLocalIsSet) {
            v3.i<x3.e, Object> iVar = this.f9331.get();
            if (iVar != null) {
                q4.s.m11535(iVar.m12376(), iVar.m12377());
            }
            this.f9331.remove();
        }
        Object m10200 = r.m10200(obj, this.f10653);
        x3.c<T> cVar = this.f10653;
        x3.e context = cVar.getContext();
        Object m11537 = q4.s.m11537(context, null);
        a1<?> m10208 = m11537 != q4.s.f10656 ? s.m10208(cVar, context, m11537) : null;
        try {
            this.f10653.mo9541(m10200);
            v3.p pVar = v3.p.f11735;
        } finally {
            if (m10208 == null || m10208.m10119()) {
                q4.s.m11535(context, m11537);
            }
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public final boolean m10119() {
        boolean z5 = this.threadLocalIsSet && this.f9331.get() == null;
        this.f9331.remove();
        return !z5;
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public final void m10120(x3.e eVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f9331.set(v3.m.m12385(eVar, obj));
    }
}
