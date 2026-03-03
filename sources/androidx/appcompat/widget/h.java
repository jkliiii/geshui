package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* compiled from: AppCompatCheckedTextViewHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final CheckedTextView f1267;

    /* renamed from: ʼ, reason: contains not printable characters */
    private ColorStateList f1268 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private PorterDuff.Mode f1269 = null;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f1270 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f1271 = false;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f1272;

    h(CheckedTextView checkedTextView) {
        this.f1267 = checkedTextView;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m1280() {
        Drawable m3548 = androidx.core.widget.b.m3548(this.f1267);
        if (m3548 != null) {
            if (this.f1270 || this.f1271) {
                Drawable mutate = androidx.core.graphics.drawable.a.m2213(m3548).mutate();
                if (this.f1270) {
                    androidx.core.graphics.drawable.a.m2210(mutate, this.f1268);
                }
                if (this.f1271) {
                    androidx.core.graphics.drawable.a.m2211(mutate, this.f1269);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f1267.getDrawableState());
                }
                this.f1267.setCheckMarkDrawable(mutate);
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    ColorStateList m1281() {
        return this.f1268;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    PorterDuff.Mode m1282() {
        return this.f1269;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m1283(AttributeSet attributeSet, int i5) {
        boolean z5;
        int m1195;
        int m11952;
        Context context = this.f1267.getContext();
        int[] iArr = e.j.f7126;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        CheckedTextView checkedTextView = this.f1267;
        androidx.core.view.f1.m2828(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, m1181.m1199(), i5, 0);
        try {
            int i6 = e.j.f7128;
            if (!m1181.m1200(i6) || (m11952 = m1181.m1195(i6, 0)) == 0) {
                z5 = false;
            } else {
                try {
                    CheckedTextView checkedTextView2 = this.f1267;
                    checkedTextView2.setCheckMarkDrawable(f.a.m8475(checkedTextView2.getContext(), m11952));
                    z5 = true;
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z5) {
                int i7 = e.j.f7127;
                if (m1181.m1200(i7) && (m1195 = m1181.m1195(i7, 0)) != 0) {
                    CheckedTextView checkedTextView3 = this.f1267;
                    checkedTextView3.setCheckMarkDrawable(f.a.m8475(checkedTextView3.getContext(), m1195));
                }
            }
            int i8 = e.j.f7129;
            if (m1181.m1200(i8)) {
                androidx.core.widget.b.m3549(this.f1267, m1181.m1184(i8));
            }
            int i9 = e.j.f7130;
            if (m1181.m1200(i9)) {
                androidx.core.widget.b.m3550(this.f1267, b2.m1146(m1181.m1192(i9, -1), null));
            }
        } finally {
            m1181.m1201();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m1284() {
        if (this.f1272) {
            this.f1272 = false;
        } else {
            this.f1272 = true;
            m1280();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m1285(ColorStateList colorStateList) {
        this.f1268 = colorStateList;
        this.f1270 = true;
        m1280();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m1286(PorterDuff.Mode mode) {
        this.f1269 = mode;
        this.f1271 = true;
        m1280();
    }
}
