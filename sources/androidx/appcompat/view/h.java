package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.q4;
import androidx.core.view.r4;
import androidx.core.view.s4;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h {

    /* renamed from: ʽ, reason: contains not printable characters */
    private Interpolator f751;

    /* renamed from: ʾ, reason: contains not printable characters */
    r4 f752;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f753;

    /* renamed from: ʼ, reason: contains not printable characters */
    private long f750 = -1;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final s4 f754 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    final ArrayList<q4> f749 = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    class a extends s4 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f755 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f756 = 0;

        a() {
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            int i5 = this.f756 + 1;
            this.f756 = i5;
            if (i5 == h.this.f749.size()) {
                r4 r4Var = h.this.f752;
                if (r4Var != null) {
                    r4Var.mo561(null);
                }
                m867();
            }
        }

        @Override // androidx.core.view.s4, androidx.core.view.r4
        /* renamed from: ʽ */
        public void mo694(View view) {
            if (this.f755) {
                return;
            }
            this.f755 = true;
            r4 r4Var = h.this.f752;
            if (r4Var != null) {
                r4Var.mo694(null);
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m867() {
            this.f756 = 0;
            this.f755 = false;
            h.this.m860();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m859() {
        if (this.f753) {
            Iterator<q4> it = this.f749.iterator();
            while (it.hasNext()) {
                it.next().m3285();
            }
            this.f753 = false;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m860() {
        this.f753 = false;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public h m861(q4 q4Var) {
        if (!this.f753) {
            this.f749.add(q4Var);
        }
        return this;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public h m862(q4 q4Var, q4 q4Var2) {
        this.f749.add(q4Var);
        q4Var2.m3290(q4Var.m3286());
        this.f749.add(q4Var2);
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public h m863(long j5) {
        if (!this.f753) {
            this.f750 = j5;
        }
        return this;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public h m864(Interpolator interpolator) {
        if (!this.f753) {
            this.f751 = interpolator;
        }
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public h m865(r4 r4Var) {
        if (!this.f753) {
            this.f752 = r4Var;
        }
        return this;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m866() {
        if (this.f753) {
            return;
        }
        Iterator<q4> it = this.f749.iterator();
        while (it.hasNext()) {
            q4 next = it.next();
            long j5 = this.f750;
            if (j5 >= 0) {
                next.m3287(j5);
            }
            Interpolator interpolator = this.f751;
            if (interpolator != null) {
                next.m3288(interpolator);
            }
            if (this.f752 != null) {
                next.m3289(this.f754);
            }
            next.m3292();
        }
        this.f753 = true;
    }
}
