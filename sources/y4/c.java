package y4;

/* compiled from: Header.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final c5.f f12498 = c5.f.m5920(":");

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final c5.f f12499 = c5.f.m5920(":status");

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final c5.f f12500 = c5.f.m5920(":method");

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final c5.f f12501 = c5.f.m5920(":path");

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final c5.f f12502 = c5.f.m5920(":scheme");

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final c5.f f12503 = c5.f.m5920(":authority");

    /* renamed from: ʻ, reason: contains not printable characters */
    public final c5.f f12504;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final c5.f f12505;

    /* renamed from: ʽ, reason: contains not printable characters */
    final int f12506;

    /* compiled from: Header.java */
    interface a {
    }

    public c(String str, String str2) {
        this(c5.f.m5920(str), c5.f.m5920(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12504.equals(cVar.f12504) && this.f12505.equals(cVar.f12505);
    }

    public int hashCode() {
        return ((527 + this.f12504.hashCode()) * 31) + this.f12505.hashCode();
    }

    public String toString() {
        return t4.c.m12072("%s: %s", this.f12504.mo5935(), this.f12505.mo5935());
    }

    public c(c5.f fVar, String str) {
        this(fVar, c5.f.m5920(str));
    }

    public c(c5.f fVar, c5.f fVar2) {
        this.f12504 = fVar;
        this.f12505 = fVar2;
        this.f12506 = fVar.mo5930() + 32 + fVar2.mo5930();
    }
}
