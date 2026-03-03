package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class m extends RecyclerView.m {

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f4327 = true;

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ʻ */
    public boolean mo4834(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i5;
        int i6;
        return (cVar == null || ((i5 = cVar.f4090) == (i6 = cVar2.f4090) && cVar.f4091 == cVar2.f4091)) ? mo5106(f0Var) : mo5109(f0Var, i5, cVar.f4091, i6, cVar2.f4091);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final void m5197(RecyclerView.f0 f0Var, boolean z5) {
        m5203(f0Var, z5);
        m4840(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ʼ */
    public boolean mo4835(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i5;
        int i6;
        int i7 = cVar.f4090;
        int i8 = cVar.f4091;
        if (f0Var2.shouldIgnore()) {
            int i9 = cVar.f4090;
            i6 = cVar.f4091;
            i5 = i9;
        } else {
            i5 = cVar2.f4090;
            i6 = cVar2.f4091;
        }
        return mo5108(f0Var, f0Var2, i7, i8, i5, i6);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public final void m5198(RecyclerView.f0 f0Var) {
        m5205(f0Var);
        m4840(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ʽ */
    public boolean mo4836(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i5 = cVar.f4090;
        int i6 = cVar.f4091;
        View view = f0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f4090;
        int top2 = cVar2 == null ? view.getTop() : cVar2.f4091;
        if (f0Var.isRemoved() || (i5 == left && i6 == top2)) {
            return mo5110(f0Var);
        }
        view.layout(left, top2, view.getWidth() + left, view.getHeight() + top2);
        return mo5109(f0Var, i5, i6, left, top2);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public final void m5199(RecyclerView.f0 f0Var, boolean z5) {
        m5206(f0Var, z5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ʾ */
    public boolean mo4837(RecyclerView.f0 f0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i5 = cVar.f4090;
        int i6 = cVar2.f4090;
        if (i5 != i6 || cVar.f4091 != cVar2.f4091) {
            return mo5109(f0Var, i5, cVar.f4091, i6, cVar2.f4091);
        }
        m5198(f0Var);
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public final void m5200(RecyclerView.f0 f0Var) {
        m5207(f0Var);
        m4840(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ʿʿ, reason: contains not printable characters */
    public final void m5201(RecyclerView.f0 f0Var) {
        m5208(f0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ˆ */
    public boolean mo4838(RecyclerView.f0 f0Var) {
        return !this.f4327 || f0Var.isInvalid();
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ــ, reason: contains not printable characters */
    public final void m5210(RecyclerView.f0 f0Var) {
        m5209(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public final void m5211(RecyclerView.f0 f0Var) {
        m5202(f0Var);
        m4840(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public final void m5212(RecyclerView.f0 f0Var) {
        m5204(f0Var);
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﹳ */
    public abstract boolean mo5106(RecyclerView.f0 f0Var);

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﹶ */
    public abstract boolean mo5108(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i5, int i6, int i7, int i8);

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﾞ */
    public abstract boolean mo5109(RecyclerView.f0 f0Var, int i5, int i6, int i7, int i8);

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﾞﾞ */
    public abstract boolean mo5110(RecyclerView.f0 f0Var);

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˆˆ, reason: contains not printable characters */
    public void m5202(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void m5204(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m5205(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˎˎ, reason: contains not printable characters */
    public void m5207(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void m5208(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˑˑ, reason: contains not printable characters */
    public void m5209(RecyclerView.f0 f0Var) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˈˈ, reason: contains not printable characters */
    public void m5203(RecyclerView.f0 f0Var, boolean z5) {
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m5206(RecyclerView.f0 f0Var, boolean z5) {
    }
}
