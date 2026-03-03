package e1;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: ResourceCacheKey.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class x implements c1.f {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final y1.h<Class<?>, byte[]> f7560 = new y1.h<>(50);

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f1.b f7561;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final c1.f f7562;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c1.f f7563;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f7564;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f7565;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Class<?> f7566;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final c1.h f7567;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final c1.l<?> f7568;

    x(f1.b bVar, c1.f fVar, c1.f fVar2, int i5, int i6, c1.l<?> lVar, Class<?> cls, c1.h hVar) {
        this.f7561 = bVar;
        this.f7562 = fVar;
        this.f7563 = fVar2;
        this.f7564 = i5;
        this.f7565 = i6;
        this.f7568 = lVar;
        this.f7566 = cls;
        this.f7567 = hVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private byte[] m8442() {
        y1.h<Class<?>, byte[]> hVar = f7560;
        byte[] m12882 = hVar.m12882(this.f7566);
        if (m12882 != null) {
            return m12882;
        }
        byte[] bytes = this.f7566.getName().getBytes(c1.f.f4978);
        hVar.m12884(this.f7566, bytes);
        return bytes;
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f7565 == xVar.f7565 && this.f7564 == xVar.f7564 && y1.l.m12898(this.f7568, xVar.f7568) && this.f7566.equals(xVar.f7566) && this.f7562.equals(xVar.f7562) && this.f7563.equals(xVar.f7563) && this.f7567.equals(xVar.f7567);
    }

    @Override // c1.f
    public int hashCode() {
        int hashCode = (((((this.f7562.hashCode() * 31) + this.f7563.hashCode()) * 31) + this.f7564) * 31) + this.f7565;
        c1.l<?> lVar = this.f7568;
        if (lVar != null) {
            hashCode = (hashCode * 31) + lVar.hashCode();
        }
        return (((hashCode * 31) + this.f7566.hashCode()) * 31) + this.f7567.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f7562 + ", signature=" + this.f7563 + ", width=" + this.f7564 + ", height=" + this.f7565 + ", decodedResourceClass=" + this.f7566 + ", transformation='" + this.f7568 + "', options=" + this.f7567 + '}';
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f7561.mo8521(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f7564).putInt(this.f7565).array();
        this.f7563.mo5821(messageDigest);
        this.f7562.mo5821(messageDigest);
        messageDigest.update(bArr);
        c1.l<?> lVar = this.f7568;
        if (lVar != null) {
            lVar.mo5821(messageDigest);
        }
        this.f7567.mo5821(messageDigest);
        messageDigest.update(m8442());
        this.f7561.put(bArr);
    }
}
