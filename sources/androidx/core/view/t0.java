package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f3021;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f3022;

    public t0(ViewGroup viewGroup) {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m3319() {
        return this.f3021 | this.f3022;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m3320(View view, View view2, int i5) {
        m3321(view, view2, i5, 0);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m3321(View view, View view2, int i5, int i6) {
        if (i6 == 1) {
            this.f3022 = i5;
        } else {
            this.f3021 = i5;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m3322(View view) {
        m3323(view, 0);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m3323(View view, int i5) {
        if (i5 == 1) {
            this.f3022 = 0;
        } else {
            this.f3021 = 0;
        }
    }
}
