package x1;

import c1.f;
import java.security.MessageDigest;
import y1.k;

/* compiled from: ObjectKey.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements f {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Object f12120;

    public b(Object obj) {
        this.f12120 = k.m12893(obj);
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f12120.equals(((b) obj).f12120);
        }
        return false;
    }

    @Override // c1.f
    public int hashCode() {
        return this.f12120.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f12120 + '}';
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        messageDigest.update(this.f12120.toString().getBytes(f.f4978));
    }
}
