package c1;

import java.security.MessageDigest;

/* compiled from: Options.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class h implements f {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final m.a<g<?>, Object> f4984 = new y1.b();

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˆ, reason: contains not printable characters */
    private static <T> void m5830(g<T> gVar, Object obj, MessageDigest messageDigest) {
        gVar.m5828(obj, messageDigest);
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f4984.equals(((h) obj).f4984);
        }
        return false;
    }

    @Override // c1.f
    public int hashCode() {
        return this.f4984.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f4984 + '}';
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        for (int i5 = 0; i5 < this.f4984.size(); i5++) {
            m5830(this.f4984.m9830(i5), this.f4984.m9834(i5), messageDigest);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public <T> T m5831(g<T> gVar) {
        return this.f4984.containsKey(gVar) ? (T) this.f4984.get(gVar) : gVar.m5827();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m5832(h hVar) {
        this.f4984.mo9831(hVar.f4984);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public <T> h m5833(g<T> gVar, T t5) {
        this.f4984.put(gVar, t5);
        return this;
    }
}
