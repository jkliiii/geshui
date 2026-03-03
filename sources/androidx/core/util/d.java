package androidx.core.util;

/* compiled from: Pair.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d<F, S> {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final F f2843;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final S f2844;

    public d(F f5, S s5) {
        this.f2843 = f5;
        this.f2844 = s5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static <A, B> d<A, B> m2573(A a6, B b6) {
        return new d<>(a6, b6);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.m2568(dVar.f2843, this.f2843) && c.m2568(dVar.f2844, this.f2844);
    }

    public int hashCode() {
        F f5 = this.f2843;
        int hashCode = f5 == null ? 0 : f5.hashCode();
        S s5 = this.f2844;
        return hashCode ^ (s5 != null ? s5.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f2843 + " " + this.f2844 + "}";
    }
}
