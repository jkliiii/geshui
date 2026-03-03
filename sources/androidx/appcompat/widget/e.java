package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final View f1209;

    /* renamed from: ʾ, reason: contains not printable characters */
    private b3 f1212;

    /* renamed from: ʿ, reason: contains not printable characters */
    private b3 f1213;

    /* renamed from: ˆ, reason: contains not printable characters */
    private b3 f1214;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f1211 = -1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final j f1210 = j.m1375();

    e(View view) {
        this.f1209 = view;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m1202(Drawable drawable) {
        if (this.f1214 == null) {
            this.f1214 = new b3();
        }
        b3 b3Var = this.f1214;
        b3Var.m1149();
        ColorStateList m2896 = androidx.core.view.f1.m2896(this.f1209);
        if (m2896 != null) {
            b3Var.f1174 = true;
            b3Var.f1171 = m2896;
        }
        PorterDuff.Mode m2898 = androidx.core.view.f1.m2898(this.f1209);
        if (m2898 != null) {
            b3Var.f1173 = true;
            b3Var.f1172 = m2898;
        }
        if (!b3Var.f1174 && !b3Var.f1173) {
            return false;
        }
        j.m1378(drawable, b3Var, this.f1209.getDrawableState());
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean m1203() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 21 ? this.f1212 != null : i5 == 21;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m1204() {
        Drawable background = this.f1209.getBackground();
        if (background != null) {
            if (m1203() && m1202(background)) {
                return;
            }
            b3 b3Var = this.f1213;
            if (b3Var != null) {
                j.m1378(background, b3Var, this.f1209.getDrawableState());
                return;
            }
            b3 b3Var2 = this.f1212;
            if (b3Var2 != null) {
                j.m1378(background, b3Var2, this.f1209.getDrawableState());
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    ColorStateList m1205() {
        b3 b3Var = this.f1213;
        if (b3Var != null) {
            return b3Var.f1171;
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    PorterDuff.Mode m1206() {
        b3 b3Var = this.f1213;
        if (b3Var != null) {
            return b3Var.f1172;
        }
        return null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m1207(AttributeSet attributeSet, int i5) {
        Context context = this.f1209.getContext();
        int[] iArr = e.j.f7301;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        View view = this.f1209;
        androidx.core.view.f1.m2828(view, view.getContext(), iArr, attributeSet, m1181.m1199(), i5, 0);
        try {
            int i6 = e.j.f7302;
            if (m1181.m1200(i6)) {
                this.f1211 = m1181.m1195(i6, -1);
                ColorStateList m1381 = this.f1210.m1381(this.f1209.getContext(), this.f1211);
                if (m1381 != null) {
                    m1210(m1381);
                }
            }
            int i7 = e.j.f7303;
            if (m1181.m1200(i7)) {
                androidx.core.view.f1.m2837(this.f1209, m1181.m1184(i7));
            }
            int i8 = e.j.f7304;
            if (m1181.m1200(i8)) {
                androidx.core.view.f1.m2838(this.f1209, b2.m1146(m1181.m1192(i8, -1), null));
            }
        } finally {
            m1181.m1201();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m1208(Drawable drawable) {
        this.f1211 = -1;
        m1210(null);
        m1204();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m1209(int i5) {
        this.f1211 = i5;
        j jVar = this.f1210;
        m1210(jVar != null ? jVar.m1381(this.f1209.getContext(), i5) : null);
        m1204();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1210(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1212 == null) {
                this.f1212 = new b3();
            }
            b3 b3Var = this.f1212;
            b3Var.f1171 = colorStateList;
            b3Var.f1174 = true;
        } else {
            this.f1212 = null;
        }
        m1204();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m1211(ColorStateList colorStateList) {
        if (this.f1213 == null) {
            this.f1213 = new b3();
        }
        b3 b3Var = this.f1213;
        b3Var.f1171 = colorStateList;
        b3Var.f1174 = true;
        m1204();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m1212(PorterDuff.Mode mode) {
        if (this.f1213 == null) {
            this.f1213 = new b3();
        }
        b3 b3Var = this.f1213;
        b3Var.f1172 = mode;
        b3Var.f1173 = true;
        m1204();
    }
}
