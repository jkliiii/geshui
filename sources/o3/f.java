package o3;

import java.util.Locale;

/* compiled from: Record.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final String f10118;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int f10119;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int f10120;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final long f10121;

    /* renamed from: ʿ, reason: contains not printable characters */
    public final int f10122;

    /* renamed from: ˆ, reason: contains not printable characters */
    public final String f10123;

    public f(String str, int i5, int i6, long j5, int i7) {
        this.f10118 = str;
        this.f10119 = i5;
        this.f10120 = Math.max(i6, 600);
        this.f10121 = j5;
        this.f10122 = i7;
        this.f10123 = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f10118.equals(fVar.f10118) && this.f10119 == fVar.f10119 && this.f10120 == fVar.f10120 && this.f10121 == fVar.f10121;
    }

    public String toString() {
        return String.format(Locale.getDefault(), "{type:%s, value:%s, source:%s, server:%s, timestamp:%d, ttl:%d}", Integer.valueOf(this.f10119), this.f10118, Integer.valueOf(this.f10122), this.f10123, Long.valueOf(this.f10121), Integer.valueOf(this.f10120));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m11000() {
        return this.f10119 == 1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m11001() {
        return this.f10119 == 28;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m11002() {
        return this.f10119 == 5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m11003() {
        return m11004(System.currentTimeMillis() / 1000);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m11004(long j5) {
        int i5 = this.f10120;
        return i5 != -1 && this.f10121 + ((long) i5) < j5;
    }

    public f(String str, int i5, int i6, long j5, int i7, String str2) {
        this.f10118 = str;
        this.f10119 = i5;
        this.f10120 = i6 < 600 ? 600 : i6;
        this.f10121 = j5;
        this.f10122 = i7;
        this.f10123 = str2;
    }
}
