package c1;

import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g<T> {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final b<Object> f4979 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final T f4980;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final b<T> f4981;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final String f4982;

    /* renamed from: ʾ, reason: contains not printable characters */
    private volatile byte[] f4983;

    /* compiled from: Option.java */
    public interface b<T> {
        /* renamed from: ʻ */
        void mo5829(byte[] bArr, T t5, MessageDigest messageDigest);
    }

    private g(String str, T t5, b<T> bVar) {
        this.f4982 = y1.k.m12891(str);
        this.f4980 = t5;
        this.f4981 = (b) y1.k.m12893(bVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static <T> g<T> m5822(String str, T t5, b<T> bVar) {
        return new g<>(str, t5, bVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static <T> b<T> m5823() {
        return (b<T>) f4979;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private byte[] m5824() {
        if (this.f4983 == null) {
            this.f4983 = this.f4982.getBytes(f.f4978);
        }
        return this.f4983;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static <T> g<T> m5825(String str) {
        return new g<>(str, null, m5823());
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static <T> g<T> m5826(String str, T t5) {
        return new g<>(str, t5, m5823());
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f4982.equals(((g) obj).f4982);
        }
        return false;
    }

    public int hashCode() {
        return this.f4982.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f4982 + "'}";
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public T m5827() {
        return this.f4980;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m5828(T t5, MessageDigest messageDigest) {
        this.f4981.mo5829(m5824(), t5, messageDigest);
    }

    /* compiled from: Option.java */
    class a implements b<Object> {
        a() {
        }

        @Override // c1.g.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo5829(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
