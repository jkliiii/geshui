package m4;

/* compiled from: CancellableContinuationImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class m {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Object f9355;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final e f9356;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final e4.l<Throwable, v3.p> f9357;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final Object f9358;

    /* renamed from: ʿ, reason: contains not printable characters */
    public final Throwable f9359;

    /* JADX WARN: Multi-variable type inference failed */
    public m(Object obj, e eVar, e4.l<? super Throwable, v3.p> lVar, Object obj2, Throwable th) {
        this.f9355 = obj;
        this.f9356 = eVar;
        this.f9357 = lVar;
        this.f9358 = obj2;
        this.f9359 = th;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static /* synthetic */ m m10189(m mVar, Object obj, e eVar, e4.l lVar, Object obj2, Throwable th, int i5, Object obj3) {
        if ((i5 & 1) != 0) {
            obj = mVar.f9355;
        }
        if ((i5 & 2) != 0) {
            eVar = mVar.f9356;
        }
        e eVar2 = eVar;
        if ((i5 & 4) != 0) {
            lVar = mVar.f9357;
        }
        e4.l lVar2 = lVar;
        if ((i5 & 8) != 0) {
            obj2 = mVar.f9358;
        }
        Object obj4 = obj2;
        if ((i5 & 16) != 0) {
            th = mVar.f9359;
        }
        return mVar.m10190(obj, eVar2, lVar2, obj4, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return f4.k.m8619(this.f9355, mVar.f9355) && f4.k.m8619(this.f9356, mVar.f9356) && f4.k.m8619(this.f9357, mVar.f9357) && f4.k.m8619(this.f9358, mVar.f9358) && f4.k.m8619(this.f9359, mVar.f9359);
    }

    public int hashCode() {
        Object obj = this.f9355;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        e eVar = this.f9356;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        e4.l<Throwable, v3.p> lVar = this.f9357;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f9358;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f9359;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f9355 + ", cancelHandler=" + this.f9356 + ", onCancellation=" + this.f9357 + ", idempotentResume=" + this.f9358 + ", cancelCause=" + this.f9359 + ')';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final m m10190(Object obj, e eVar, e4.l<? super Throwable, v3.p> lVar, Object obj2, Throwable th) {
        return new m(obj, eVar, lVar, obj2, th);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m10191() {
        return this.f9359 != null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m10192(h<?> hVar, Throwable th) {
        e eVar = this.f9356;
        if (eVar != null) {
            hVar.m10177(eVar, th);
        }
        e4.l<Throwable, v3.p> lVar = this.f9357;
        if (lVar != null) {
            hVar.m10178(lVar, th);
        }
    }

    public /* synthetic */ m(Object obj, e eVar, e4.l lVar, Object obj2, Throwable th, int i5, f4.g gVar) {
        this(obj, (i5 & 2) != 0 ? null : eVar, (i5 & 4) != 0 ? null : lVar, (i5 & 8) != 0 ? null : obj2, (i5 & 16) != 0 ? null : th);
    }
}
