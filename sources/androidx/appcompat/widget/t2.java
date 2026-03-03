package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class t2 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f1457 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f1458 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f1459 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f1460 = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f1461 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f1462 = 0;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f1463 = false;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f1464 = false;

    t2() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m1551() {
        return this.f1463 ? this.f1457 : this.f1458;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m1552() {
        return this.f1457;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m1553() {
        return this.f1458;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m1554() {
        return this.f1463 ? this.f1458 : this.f1457;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m1555(int i5, int i6) {
        this.f1464 = false;
        if (i5 != Integer.MIN_VALUE) {
            this.f1461 = i5;
            this.f1457 = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f1462 = i6;
            this.f1458 = i6;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m1556(boolean z5) {
        if (z5 == this.f1463) {
            return;
        }
        this.f1463 = z5;
        if (!this.f1464) {
            this.f1457 = this.f1461;
            this.f1458 = this.f1462;
            return;
        }
        if (z5) {
            int i5 = this.f1460;
            if (i5 == Integer.MIN_VALUE) {
                i5 = this.f1461;
            }
            this.f1457 = i5;
            int i6 = this.f1459;
            if (i6 == Integer.MIN_VALUE) {
                i6 = this.f1462;
            }
            this.f1458 = i6;
            return;
        }
        int i7 = this.f1459;
        if (i7 == Integer.MIN_VALUE) {
            i7 = this.f1461;
        }
        this.f1457 = i7;
        int i8 = this.f1460;
        if (i8 == Integer.MIN_VALUE) {
            i8 = this.f1462;
        }
        this.f1458 = i8;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m1557(int i5, int i6) {
        this.f1459 = i5;
        this.f1460 = i6;
        this.f1464 = true;
        if (this.f1463) {
            if (i6 != Integer.MIN_VALUE) {
                this.f1457 = i6;
            }
            if (i5 != Integer.MIN_VALUE) {
                this.f1458 = i5;
                return;
            }
            return;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f1457 = i5;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f1458 = i6;
        }
    }
}
