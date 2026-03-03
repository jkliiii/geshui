package m4;

/* compiled from: CompletionState.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class o {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final Object f9365;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final e4.l<Throwable, v3.p> f9366;

    /* JADX WARN: Multi-variable type inference failed */
    public o(Object obj, e4.l<? super Throwable, v3.p> lVar) {
        this.f9365 = obj;
        this.f9366 = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return f4.k.m8619(this.f9365, oVar.f9365) && f4.k.m8619(this.f9366, oVar.f9366);
    }

    public int hashCode() {
        Object obj = this.f9365;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f9366.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f9365 + ", onCancellation=" + this.f9366 + ')';
    }
}
