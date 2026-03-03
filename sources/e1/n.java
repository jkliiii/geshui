package e1;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: EngineKey.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class n implements c1.f {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Object f7514;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f7515;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f7516;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Class<?> f7517;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Class<?> f7518;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final c1.f f7519;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Map<Class<?>, c1.l<?>> f7520;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final c1.h f7521;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f7522;

    n(Object obj, c1.f fVar, int i5, int i6, Map<Class<?>, c1.l<?>> map, Class<?> cls, Class<?> cls2, c1.h hVar) {
        this.f7514 = y1.k.m12893(obj);
        this.f7519 = (c1.f) y1.k.m12894(fVar, "Signature must not be null");
        this.f7515 = i5;
        this.f7516 = i6;
        this.f7520 = (Map) y1.k.m12893(map);
        this.f7517 = (Class) y1.k.m12894(cls, "Resource class must not be null");
        this.f7518 = (Class) y1.k.m12894(cls2, "Transcode class must not be null");
        this.f7521 = (c1.h) y1.k.m12893(hVar);
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f7514.equals(nVar.f7514) && this.f7519.equals(nVar.f7519) && this.f7516 == nVar.f7516 && this.f7515 == nVar.f7515 && this.f7520.equals(nVar.f7520) && this.f7517.equals(nVar.f7517) && this.f7518.equals(nVar.f7518) && this.f7521.equals(nVar.f7521);
    }

    @Override // c1.f
    public int hashCode() {
        if (this.f7522 == 0) {
            int hashCode = this.f7514.hashCode();
            this.f7522 = hashCode;
            int hashCode2 = (((((hashCode * 31) + this.f7519.hashCode()) * 31) + this.f7515) * 31) + this.f7516;
            this.f7522 = hashCode2;
            int hashCode3 = (hashCode2 * 31) + this.f7520.hashCode();
            this.f7522 = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f7517.hashCode();
            this.f7522 = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f7518.hashCode();
            this.f7522 = hashCode5;
            this.f7522 = (hashCode5 * 31) + this.f7521.hashCode();
        }
        return this.f7522;
    }

    public String toString() {
        return "EngineKey{model=" + this.f7514 + ", width=" + this.f7515 + ", height=" + this.f7516 + ", resourceClass=" + this.f7517 + ", transcodeClass=" + this.f7518 + ", signature=" + this.f7519 + ", hashCode=" + this.f7522 + ", transformations=" + this.f7520 + ", options=" + this.f7521 + '}';
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
