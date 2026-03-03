package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private ViewParent f2999;

    /* renamed from: ʼ, reason: contains not printable characters */
    private ViewParent f3000;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final View f3001;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f3002;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int[] f3003;

    public p0(View view) {
        this.f3001 = view;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean m3243(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        ViewParent m3244;
        int i10;
        int i11;
        int[] iArr3;
        if (!m3256() || (m3244 = m3244(i9)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0 && i7 == 0 && i8 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3001.getLocationInWindow(iArr);
            i10 = iArr[0];
            i11 = iArr[1];
        } else {
            i10 = 0;
            i11 = 0;
        }
        if (iArr2 == null) {
            int[] m3245 = m3245();
            m3245[0] = 0;
            m3245[1] = 0;
            iArr3 = m3245;
        } else {
            iArr3 = iArr2;
        }
        o4.m3229(m3244, this.f3001, i5, i6, i7, i8, i9, iArr3);
        if (iArr != null) {
            this.f3001.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i10;
            iArr[1] = iArr[1] - i11;
        }
        return true;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private ViewParent m3244(int i5) {
        if (i5 == 0) {
            return this.f2999;
        }
        if (i5 != 1) {
            return null;
        }
        return this.f3000;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int[] m3245() {
        if (this.f3003 == null) {
            this.f3003 = new int[2];
        }
        return this.f3003;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m3246(int i5, ViewParent viewParent) {
        if (i5 == 0) {
            this.f2999 = viewParent;
        } else {
            if (i5 != 1) {
                return;
            }
            this.f3000 = viewParent;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m3247(float f5, float f6, boolean z5) {
        ViewParent m3244;
        if (!m3256() || (m3244 = m3244(0)) == null) {
            return false;
        }
        return o4.m3226(m3244, this.f3001, f5, f6, z5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m3248(float f5, float f6) {
        ViewParent m3244;
        if (!m3256() || (m3244 = m3244(0)) == null) {
            return false;
        }
        return o4.m3227(m3244, this.f3001, f5, f6);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m3249(int i5, int i6, int[] iArr, int[] iArr2) {
        return m3250(i5, i6, iArr, iArr2, 0);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m3250(int i5, int i6, int[] iArr, int[] iArr2, int i7) {
        ViewParent m3244;
        int i8;
        int i9;
        if (!m3256() || (m3244 = m3244(i7)) == null) {
            return false;
        }
        if (i5 == 0 && i6 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f3001.getLocationInWindow(iArr2);
            i8 = iArr2[0];
            i9 = iArr2[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr == null) {
            iArr = m3245();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        o4.m3228(m3244, this.f3001, i5, i6, iArr, i7);
        if (iArr2 != null) {
            this.f3001.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i8;
            iArr2[1] = iArr2[1] - i9;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m3251(int i5, int i6, int i7, int i8, int[] iArr, int i9, int[] iArr2) {
        m3243(i5, i6, i7, i8, iArr, i9, iArr2);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m3252(int i5, int i6, int i7, int i8, int[] iArr) {
        return m3243(i5, i6, i7, i8, iArr, 0, null);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m3253(int i5, int i6, int i7, int i8, int[] iArr, int i9) {
        return m3243(i5, i6, i7, i8, iArr, i9, null);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m3254() {
        return m3255(0);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m3255(int i5) {
        return m3244(i5) != null;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m3256() {
        return this.f3002;
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m3257(boolean z5) {
        if (this.f3002) {
            f1.m2859(this.f3001);
        }
        this.f3002 = z5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m3258(int i5) {
        return m3259(i5, 0);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m3259(int i5, int i6) {
        if (m3255(i6)) {
            return true;
        }
        if (!m3256()) {
            return false;
        }
        View view = this.f3001;
        for (ViewParent parent = this.f3001.getParent(); parent != null; parent = parent.getParent()) {
            if (o4.m3231(parent, view, this.f3001, i5, i6)) {
                m3246(i6, parent);
                o4.m3230(parent, view, this.f3001, i5, i6);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m3260() {
        m3261(0);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m3261(int i5) {
        ViewParent m3244 = m3244(i5);
        if (m3244 != null) {
            o4.m3232(m3244, this.f3001, i5);
            m3246(i5, null);
        }
    }
}
