package v3;

import java.io.Serializable;

/* compiled from: Tuples.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i<A, B> implements Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final A f11727;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final B f11728;

    public i(A a6, B b6) {
        this.f11727 = a6;
        this.f11728 = b6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return f4.k.m8619(this.f11727, iVar.f11727) && f4.k.m8619(this.f11728, iVar.f11728);
    }

    public int hashCode() {
        A a6 = this.f11727;
        int hashCode = (a6 == null ? 0 : a6.hashCode()) * 31;
        B b6 = this.f11728;
        return hashCode + (b6 != null ? b6.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f11727 + ", " + this.f11728 + ')';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final A m12376() {
        return this.f11727;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final B m12377() {
        return this.f11728;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final A m12378() {
        return this.f11727;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final B m12379() {
        return this.f11728;
    }
}
