package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LayoutState.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f {

    /* renamed from: ʼ, reason: contains not printable characters */
    int f4300;

    /* renamed from: ʽ, reason: contains not printable characters */
    int f4301;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f4302;

    /* renamed from: ʿ, reason: contains not printable characters */
    int f4303;

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean f4306;

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean f4307;

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean f4299 = true;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f4304 = 0;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f4305 = 0;

    f() {
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f4300 + ", mCurrentPosition=" + this.f4301 + ", mItemDirection=" + this.f4302 + ", mLayoutDirection=" + this.f4303 + ", mStartLine=" + this.f4304 + ", mEndLine=" + this.f4305 + '}';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean m5147(RecyclerView.b0 b0Var) {
        int i5 = this.f4301;
        return i5 >= 0 && i5 < b0Var.m4766();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    View m5148(RecyclerView.w wVar) {
        View m4922 = wVar.m4922(this.f4301);
        this.f4301 += this.f4302;
        return m4922;
    }
}
