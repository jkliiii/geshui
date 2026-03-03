package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i0 {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final i0 f2697 = new i0(0, 0, 0, 0);

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int f2698;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int f2699;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int f2700;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final int f2701;

    /* compiled from: Insets.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Insets m2290(int i5, int i6, int i7, int i8) {
            return Insets.of(i5, i6, i7, i8);
        }
    }

    private i0(int i5, int i6, int i7, int i8) {
        this.f2698 = i5;
        this.f2699 = i6;
        this.f2700 = i7;
        this.f2701 = i8;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static i0 m2285(i0 i0Var, i0 i0Var2) {
        return m2286(Math.max(i0Var.f2698, i0Var2.f2698), Math.max(i0Var.f2699, i0Var2.f2699), Math.max(i0Var.f2700, i0Var2.f2700), Math.max(i0Var.f2701, i0Var2.f2701));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static i0 m2286(int i5, int i6, int i7, int i8) {
        return (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) ? f2697 : new i0(i5, i6, i7, i8);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static i0 m2287(Rect rect) {
        return m2286(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static i0 m2288(Insets insets) {
        return m2286(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f2701 == i0Var.f2701 && this.f2698 == i0Var.f2698 && this.f2700 == i0Var.f2700 && this.f2699 == i0Var.f2699;
    }

    public int hashCode() {
        return (((((this.f2698 * 31) + this.f2699) * 31) + this.f2700) * 31) + this.f2701;
    }

    public String toString() {
        return "Insets{left=" + this.f2698 + ", top=" + this.f2699 + ", right=" + this.f2700 + ", bottom=" + this.f2701 + '}';
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Insets m2289() {
        return a.m2290(this.f2698, this.f2699, this.f2700, this.f2701);
    }
}
