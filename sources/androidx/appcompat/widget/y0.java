package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.i;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class y0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final TextView f1510;

    /* renamed from: ʼ, reason: contains not printable characters */
    private b3 f1511;

    /* renamed from: ʽ, reason: contains not printable characters */
    private b3 f1512;

    /* renamed from: ʾ, reason: contains not printable characters */
    private b3 f1513;

    /* renamed from: ʿ, reason: contains not printable characters */
    private b3 f1514;

    /* renamed from: ˆ, reason: contains not printable characters */
    private b3 f1515;

    /* renamed from: ˈ, reason: contains not printable characters */
    private b3 f1516;

    /* renamed from: ˉ, reason: contains not printable characters */
    private b3 f1517;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final g1 f1518;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f1519 = 0;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f1520 = -1;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Typeface f1521;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f1522;

    /* compiled from: AppCompatTextHelper.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ TextView f1527;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Typeface f1528;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ int f1529;

        b(TextView textView, Typeface typeface, int i5) {
            this.f1527 = textView;
            this.f1528 = typeface;
            this.f1529 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1527.setTypeface(this.f1528, this.f1529);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable[] m1638(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1639(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m1640(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    static class d {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Locale m1641(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    static class e {
        /* renamed from: ʻ, reason: contains not printable characters */
        static LocaleList m1642(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1643(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    static class f {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m1644(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1645(TextView textView, int i5, int i6, int i7, int i8) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m1646(TextView textView, int[] iArr, int i5) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static boolean m1647(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* compiled from: AppCompatTextHelper.java */
    static class g {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Typeface m1648(Typeface typeface, int i5, boolean z5) {
            return Typeface.create(typeface, i5, z5);
        }
    }

    y0(TextView textView) {
        this.f1510 = textView;
        this.f1518 = new g1(textView);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1607(Drawable drawable, b3 b3Var) {
        if (drawable == null || b3Var == null) {
            return;
        }
        j.m1378(drawable, b3Var, this.f1510.getDrawableState());
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m1608(Context context, d3 d3Var) {
        String m1196;
        this.f1519 = d3Var.m1192(e.j.f7254, this.f1519);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int m1192 = d3Var.m1192(e.j.f7259, -1);
            this.f1520 = m1192;
            if (m1192 != -1) {
                this.f1519 = (this.f1519 & 2) | 0;
            }
        }
        int i6 = e.j.f7258;
        if (!d3Var.m1200(i6) && !d3Var.m1200(e.j.f7260)) {
            int i7 = e.j.f7253;
            if (d3Var.m1200(i7)) {
                this.f1522 = false;
                int m11922 = d3Var.m1192(i7, 1);
                if (m11922 == 1) {
                    this.f1521 = Typeface.SANS_SERIF;
                    return;
                } else if (m11922 == 2) {
                    this.f1521 = Typeface.SERIF;
                    return;
                } else {
                    if (m11922 != 3) {
                        return;
                    }
                    this.f1521 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1521 = null;
        int i8 = e.j.f7260;
        if (d3Var.m1200(i8)) {
            i6 = i8;
        }
        int i9 = this.f1520;
        int i10 = this.f1519;
        if (!context.isRestricted()) {
            try {
                Typeface m1191 = d3Var.m1191(i6, this.f1519, new a(i9, i10, new WeakReference(this.f1510)));
                if (m1191 != null) {
                    if (i5 < 28 || this.f1520 == -1) {
                        this.f1521 = m1191;
                    } else {
                        this.f1521 = g.m1648(Typeface.create(m1191, 0), this.f1520, (this.f1519 & 2) != 0);
                    }
                }
                this.f1522 = this.f1521 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1521 != null || (m1196 = d3Var.m1196(i6)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1520 == -1) {
            this.f1521 = Typeface.create(m1196, this.f1519);
        } else {
            this.f1521 = g.m1648(Typeface.create(m1196, 0), this.f1520, (this.f1519 & 2) != 0);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static b3 m1609(Context context, j jVar, int i5) {
        ColorStateList m1381 = jVar.m1381(context, i5);
        if (m1381 == null) {
            return null;
        }
        b3 b3Var = new b3();
        b3Var.f1174 = true;
        b3Var.f1171 = m1381;
        return b3Var;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m1610(int i5, float f5) {
        this.f1518.m1266(i5, f5);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m1611(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] m1638 = c.m1638(this.f1510);
            TextView textView = this.f1510;
            if (drawable5 == null) {
                drawable5 = m1638[0];
            }
            if (drawable2 == null) {
                drawable2 = m1638[1];
            }
            if (drawable6 == null) {
                drawable6 = m1638[2];
            }
            if (drawable4 == null) {
                drawable4 = m1638[3];
            }
            c.m1639(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] m16382 = c.m1638(this.f1510);
        Drawable drawable7 = m16382[0];
        if (drawable7 != null || m16382[2] != null) {
            TextView textView2 = this.f1510;
            if (drawable2 == null) {
                drawable2 = m16382[1];
            }
            Drawable drawable8 = m16382[2];
            if (drawable4 == null) {
                drawable4 = m16382[3];
            }
            c.m1639(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1510.getCompoundDrawables();
        TextView textView3 = this.f1510;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m1612() {
        b3 b3Var = this.f1517;
        this.f1511 = b3Var;
        this.f1512 = b3Var;
        this.f1513 = b3Var;
        this.f1514 = b3Var;
        this.f1515 = b3Var;
        this.f1516 = b3Var;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m1613() {
        if (this.f1511 != null || this.f1512 != null || this.f1513 != null || this.f1514 != null) {
            Drawable[] compoundDrawables = this.f1510.getCompoundDrawables();
            m1607(compoundDrawables[0], this.f1511);
            m1607(compoundDrawables[1], this.f1512);
            m1607(compoundDrawables[2], this.f1513);
            m1607(compoundDrawables[3], this.f1514);
        }
        if (this.f1515 == null && this.f1516 == null) {
            return;
        }
        Drawable[] m1638 = c.m1638(this.f1510);
        m1607(m1638[0], this.f1515);
        m1607(m1638[2], this.f1516);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m1614() {
        this.f1518.m1253();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    int m1615() {
        return this.f1518.m1255();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    int m1616() {
        return this.f1518.m1256();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m1617() {
        return this.f1518.m1257();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    int[] m1618() {
        return this.f1518.m1258();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    int m1619() {
        return this.f1518.m1259();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    ColorStateList m1620() {
        b3 b3Var = this.f1517;
        if (b3Var != null) {
            return b3Var.f1171;
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    PorterDuff.Mode m1621() {
        b3 b3Var = this.f1517;
        if (b3Var != null) {
            return b3Var.f1172;
        }
        return null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean m1622() {
        return this.f1518.m1261();
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: ˑ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m1623(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.m1623(android.util.AttributeSet, int):void");
    }

    /* renamed from: י, reason: contains not printable characters */
    void m1624(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1522) {
            this.f1521 = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (androidx.core.view.f1.m2903(textView)) {
                    textView.post(new b(textView, typeface, this.f1519));
                } else {
                    textView.setTypeface(typeface, this.f1519);
                }
            }
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m1625(boolean z5, int i5, int i6, int i7, int i8) {
        if (p3.f1397) {
            return;
        }
        m1614();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m1626() {
        m1613();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m1627(Context context, int i5) {
        String m1196;
        ColorStateList m1184;
        ColorStateList m11842;
        ColorStateList m11843;
        d3 m1179 = d3.m1179(context, i5, e.j.f7251);
        int i6 = e.j.f7263;
        if (m1179.m1200(i6)) {
            m1630(m1179.m1182(i6, false));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 23) {
            int i8 = e.j.f7255;
            if (m1179.m1200(i8) && (m11843 = m1179.m1184(i8)) != null) {
                this.f1510.setTextColor(m11843);
            }
            int i9 = e.j.f7257;
            if (m1179.m1200(i9) && (m11842 = m1179.m1184(i9)) != null) {
                this.f1510.setLinkTextColor(m11842);
            }
            int i10 = e.j.f7256;
            if (m1179.m1200(i10) && (m1184 = m1179.m1184(i10)) != null) {
                this.f1510.setHintTextColor(m1184);
            }
        }
        int i11 = e.j.f7252;
        if (m1179.m1200(i11) && m1179.m1187(i11, -1) == 0) {
            this.f1510.setTextSize(0, 0.0f);
        }
        m1608(context, m1179);
        if (i7 >= 26) {
            int i12 = e.j.f7262;
            if (m1179.m1200(i12) && (m1196 = m1179.m1196(i12)) != null) {
                f.m1647(this.f1510, m1196);
            }
        }
        m1179.m1201();
        Typeface typeface = this.f1521;
        if (typeface != null) {
            this.f1510.setTypeface(typeface, this.f1519);
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m1628(int i5, float f5) {
        if (p3.f1397 || m1622()) {
            return;
        }
        m1610(i5, f5);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m1629(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        x.d.m12635(editorInfo, textView.getText());
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m1630(boolean z5) {
        this.f1510.setAllCaps(z5);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m1631(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        this.f1518.m1263(i5, i6, i7, i8);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m1632(int[] iArr, int i5) throws IllegalArgumentException {
        this.f1518.m1264(iArr, i5);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m1633(int i5) {
        this.f1518.m1265(i5);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m1634(ColorStateList colorStateList) {
        if (this.f1517 == null) {
            this.f1517 = new b3();
        }
        b3 b3Var = this.f1517;
        b3Var.f1171 = colorStateList;
        b3Var.f1174 = colorStateList != null;
        m1612();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m1635(PorterDuff.Mode mode) {
        if (this.f1517 == null) {
            this.f1517 = new b3();
        }
        b3 b3Var = this.f1517;
        b3Var.f1172 = mode;
        b3Var.f1173 = mode != null;
        m1612();
    }

    /* compiled from: AppCompatTextHelper.java */
    class a extends i.f {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ int f1523;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ int f1524;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ WeakReference f1525;

        a(int i5, int i6, WeakReference weakReference) {
            this.f1523 = i5;
            this.f1524 = i6;
            this.f1525 = weakReference;
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: ˊ, reason: contains not printable characters */
        public void m2129(Typeface typeface) {
            int i5;
            if (Build.VERSION.SDK_INT >= 28 && (i5 = this.f1523) != -1) {
                typeface = g.m1648(typeface, i5, (this.f1524 & 2) != 0);
            }
            y0.this.m1624(this.f1525, typeface);
        }

        @Override // androidx.core.content.res.i.f
        /* renamed from: ˉ, reason: contains not printable characters */
        public void m2128(int i5) {
        }
    }
}
