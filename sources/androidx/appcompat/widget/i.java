package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final CompoundButton f1337;

    /* renamed from: ʼ, reason: contains not printable characters */
    private ColorStateList f1338 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private PorterDuff.Mode f1339 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f1340 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f1341 = false;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f1342;

    i(CompoundButton compoundButton) {
        this.f1337 = compoundButton;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m1362() {
        Drawable m3614 = androidx.core.widget.i.m3614(this.f1337);
        if (m3614 != null) {
            if (this.f1340 || this.f1341) {
                Drawable mutate = androidx.core.graphics.drawable.a.m2213(m3614).mutate();
                if (this.f1340) {
                    androidx.core.graphics.drawable.a.m2210(mutate, this.f1338);
                }
                if (this.f1341) {
                    androidx.core.graphics.drawable.a.m2211(mutate, this.f1339);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1337.getDrawableState());
                }
                this.f1337.setButtonDrawable(mutate);
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    ColorStateList m1364() {
        return this.f1338;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    PorterDuff.Mode m1365() {
        return this.f1339;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m1366(AttributeSet attributeSet, int i5) {
        boolean z5;
        int m1195;
        int m11952;
        Context context = this.f1337.getContext();
        int[] iArr = e.j.f7132;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        CompoundButton compoundButton = this.f1337;
        androidx.core.view.f1.m2828(compoundButton, compoundButton.getContext(), iArr, attributeSet, m1181.m1199(), i5, 0);
        try {
            int i6 = e.j.f7135;
            if (!m1181.m1200(i6) || (m11952 = m1181.m1195(i6, 0)) == 0) {
                z5 = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1337;
                    compoundButton2.setButtonDrawable(f.a.m8475(compoundButton2.getContext(), m11952));
                    z5 = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z5) {
                int i7 = e.j.f7133;
                if (m1181.m1200(i7) && (m1195 = m1181.m1195(i7, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1337;
                    compoundButton3.setButtonDrawable(f.a.m8475(compoundButton3.getContext(), m1195));
                }
            }
            int i8 = e.j.f7136;
            if (m1181.m1200(i8)) {
                androidx.core.widget.i.m3617(this.f1337, m1181.m1184(i8));
            }
            int i9 = e.j.f7137;
            if (m1181.m1200(i9)) {
                androidx.core.widget.i.m3618(this.f1337, b2.m1146(m1181.m1192(i9, -1), null));
            }
        } finally {
            m1181.m1201();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m1367() {
        if (this.f1342) {
            this.f1342 = false;
        } else {
            this.f1342 = true;
            m1362();
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m1368(ColorStateList colorStateList) {
        this.f1338 = colorStateList;
        this.f1340 = true;
        m1362();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1369(PorterDuff.Mode mode) {
        this.f1339 = mode;
        this.f1341 = true;
        m1362();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    int m1363(int i5) {
        return i5;
    }
}
