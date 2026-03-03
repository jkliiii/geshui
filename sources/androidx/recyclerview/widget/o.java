package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class o {

    /* renamed from: ʻ, reason: contains not printable characters */
    final b f4331;

    /* renamed from: ʼ, reason: contains not printable characters */
    a f4332 = new a();

    /* compiled from: ViewBoundsCheck.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f4333 = 0;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4334;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f4335;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4336;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4337;

        a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5215(int i5) {
            this.f4333 = i5 | this.f4333;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean m5216() {
            int i5 = this.f4333;
            if ((i5 & 7) != 0 && (i5 & (m5217(this.f4336, this.f4334) << 0)) == 0) {
                return false;
            }
            int i6 = this.f4333;
            if ((i6 & 112) != 0 && (i6 & (m5217(this.f4336, this.f4335) << 4)) == 0) {
                return false;
            }
            int i7 = this.f4333;
            if ((i7 & 1792) != 0 && (i7 & (m5217(this.f4337, this.f4334) << 8)) == 0) {
                return false;
            }
            int i8 = this.f4333;
            return (i8 & 28672) == 0 || (i8 & (m5217(this.f4337, this.f4335) << 12)) != 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        int m5217(int i5, int i6) {
            if (i5 > i6) {
                return 1;
            }
            return i5 == i6 ? 2 : 4;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m5218() {
            this.f4333 = 0;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m5219(int i5, int i6, int i7, int i8) {
            this.f4334 = i5;
            this.f4335 = i6;
            this.f4336 = i7;
            this.f4337 = i8;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    interface b {
        /* renamed from: ʻ */
        View mo4859(int i5);

        /* renamed from: ʼ */
        int mo4860();

        /* renamed from: ʽ */
        int mo4861(View view);

        /* renamed from: ʾ */
        int mo4862();

        /* renamed from: ʿ */
        int mo4863(View view);
    }

    o(b bVar) {
        this.f4331 = bVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    View m5213(int i5, int i6, int i7, int i8) {
        int mo4862 = this.f4331.mo4862();
        int mo4860 = this.f4331.mo4860();
        int i9 = i6 > i5 ? 1 : -1;
        View view = null;
        while (i5 != i6) {
            View mo4859 = this.f4331.mo4859(i5);
            this.f4332.m5219(mo4862, mo4860, this.f4331.mo4861(mo4859), this.f4331.mo4863(mo4859));
            if (i7 != 0) {
                this.f4332.m5218();
                this.f4332.m5215(i7);
                if (this.f4332.m5216()) {
                    return mo4859;
                }
            }
            if (i8 != 0) {
                this.f4332.m5218();
                this.f4332.m5215(i8);
                if (this.f4332.m5216()) {
                    view = mo4859;
                }
            }
            i5 += i9;
        }
        return view;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    boolean m5214(View view, int i5) {
        this.f4332.m5219(this.f4331.mo4862(), this.f4331.mo4860(), this.f4331.mo4861(view), this.f4331.mo4863(view));
        if (i5 == 0) {
            return false;
        }
        this.f4332.m5218();
        this.f4332.m5215(i5);
        return this.f4332.m5216();
    }
}
