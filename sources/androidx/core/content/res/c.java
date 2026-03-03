package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ColorStateListInflaterCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f2595 = new ThreadLocal<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static ColorStateList m2058(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2059(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ColorStateList m2059(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m2062(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static TypedValue m2060() {
        ThreadLocal<TypedValue> threadLocal = f2595;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static ColorStateList m2061(Resources resources, int i5, Resources.Theme theme) {
        try {
            return m2058(resources, resources.getXml(i5), theme);
        } catch (Exception e5) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e5);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* renamed from: ʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.content.res.ColorStateList m2062(android.content.res.Resources r17, org.xmlpull.v1.XmlPullParser r18, android.util.AttributeSet r19, android.content.res.Resources.Theme r20) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.c.m2062(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean m2063(Resources resources, int i5) {
        TypedValue m2060 = m2060();
        resources.getValue(i5, m2060, true);
        int i6 = m2060.type;
        return i6 >= 28 && i6 <= 31;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static int m2064(int i5, float f5, float f6) {
        boolean z5 = f6 >= 0.0f && f6 <= 100.0f;
        if (f5 == 1.0f && !z5) {
            return i5;
        }
        int m12444 = w.a.m12444((int) ((Color.alpha(i5) * f5) + 0.5f), 0, 255);
        if (z5) {
            a m2035 = a.m2035(i5);
            i5 = a.m2039(m2035.m2045(), m2035.m2044(), f6);
        }
        return (i5 & 16777215) | (m12444 << 24);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static TypedArray m2065(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
