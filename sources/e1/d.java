package e1;

import java.security.MessageDigest;

/* compiled from: DataCacheKey.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d implements c1.f {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c1.f f7368;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final c1.f f7369;

    d(c1.f fVar, c1.f fVar2) {
        this.f7368 = fVar;
        this.f7369 = fVar2;
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7368.equals(dVar.f7368) && this.f7369.equals(dVar.f7369);
    }

    @Override // c1.f
    public int hashCode() {
        return (this.f7368.hashCode() * 31) + this.f7369.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f7368 + ", signature=" + this.f7369 + '}';
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        this.f7368.mo5821(messageDigest);
        this.f7369.mo5821(messageDigest);
    }
}
