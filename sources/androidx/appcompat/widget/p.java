package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ImageView f1390;

    /* renamed from: ʼ, reason: contains not printable characters */
    private b3 f1391;

    /* renamed from: ʽ, reason: contains not printable characters */
    private b3 f1392;

    /* renamed from: ʾ, reason: contains not printable characters */
    private b3 f1393;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f1394 = 0;

    public p(ImageView imageView) {
        this.f1390 = imageView;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m1462(Drawable drawable) {
        if (this.f1393 == null) {
            this.f1393 = new b3();
        }
        b3 b3Var = this.f1393;
        b3Var.m1149();
        ColorStateList m3649 = androidx.core.widget.s.m3649(this.f1390);
        if (m3649 != null) {
            b3Var.f1174 = true;
            b3Var.f1171 = m3649;
        }
        PorterDuff.Mode m3650 = androidx.core.widget.s.m3650(this.f1390);
        if (m3650 != null) {
            b3Var.f1173 = true;
            b3Var.f1172 = m3650;
        }
        if (!b3Var.f1174 && !b3Var.f1173) {
            return false;
        }
        j.m1378(drawable, b3Var, this.f1390.getDrawableState());
        return true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m1463() {
        int i5 = Build.VERSION.SDK_INT;
        return i5 > 21 ? this.f1391 != null : i5 == 21;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m1464() {
        if (this.f1390.getDrawable() != null) {
            this.f1390.getDrawable().setLevel(this.f1394);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m1465() {
        Drawable drawable = this.f1390.getDrawable();
        if (drawable != null) {
            b2.m1143(drawable);
        }
        if (drawable != null) {
            if (m1463() && m1462(drawable)) {
                return;
            }
            b3 b3Var = this.f1392;
            if (b3Var != null) {
                j.m1378(drawable, b3Var, this.f1390.getDrawableState());
                return;
            }
            b3 b3Var2 = this.f1391;
            if (b3Var2 != null) {
                j.m1378(drawable, b3Var2, this.f1390.getDrawableState());
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    ColorStateList m1466() {
        b3 b3Var = this.f1392;
        if (b3Var != null) {
            return b3Var.f1171;
        }
        return null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    PorterDuff.Mode m1467() {
        b3 b3Var = this.f1392;
        if (b3Var != null) {
            return b3Var.f1172;
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean m1468() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1390.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m1469(AttributeSet attributeSet, int i5) {
        int m1195;
        Context context = this.f1390.getContext();
        int[] iArr = e.j.f7316;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        ImageView imageView = this.f1390;
        androidx.core.view.f1.m2828(imageView, imageView.getContext(), iArr, attributeSet, m1181.m1199(), i5, 0);
        try {
            Drawable drawable = this.f1390.getDrawable();
            if (drawable == null && (m1195 = m1181.m1195(e.j.f7330, -1)) != -1 && (drawable = f.a.m8475(this.f1390.getContext(), m1195)) != null) {
                this.f1390.setImageDrawable(drawable);
            }
            if (drawable != null) {
                b2.m1143(drawable);
            }
            int i6 = e.j.f7318;
            if (m1181.m1200(i6)) {
                androidx.core.widget.s.m3651(this.f1390, m1181.m1184(i6));
            }
            int i7 = e.j.f7328;
            if (m1181.m1200(i7)) {
                androidx.core.widget.s.m3652(this.f1390, b2.m1146(m1181.m1192(i7, -1), null));
            }
        } finally {
            m1181.m1201();
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m1470(Drawable drawable) {
        this.f1394 = drawable.getLevel();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m1471(int i5) {
        if (i5 != 0) {
            Drawable m8475 = f.a.m8475(this.f1390.getContext(), i5);
            if (m8475 != null) {
                b2.m1143(m8475);
            }
            this.f1390.setImageDrawable(m8475);
        } else {
            this.f1390.setImageDrawable(null);
        }
        m1465();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m1472(ColorStateList colorStateList) {
        if (this.f1392 == null) {
            this.f1392 = new b3();
        }
        b3 b3Var = this.f1392;
        b3Var.f1171 = colorStateList;
        b3Var.f1174 = true;
        m1465();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m1473(PorterDuff.Mode mode) {
        if (this.f1392 == null) {
            this.f1392 = new b3();
        }
        b3 b3Var = this.f1392;
        b3Var.f1172 = mode;
        b3Var.f1173 = true;
        m1465();
    }
}
