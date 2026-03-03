package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: TypedArrayUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m2140(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5, boolean z5) {
        return !m2149(xmlPullParser, str) ? z5 : typedArray.getBoolean(i5, z5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m2141(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5, int i6) {
        return !m2149(xmlPullParser, str) ? i6 : typedArray.getColor(i5, i6);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static ColorStateList m2142(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i5) {
        if (!m2149(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i5, typedValue);
        int i6 = typedValue.type;
        if (i6 != 2) {
            return (i6 < 28 || i6 > 31) ? c.m2061(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme) : m2143(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i5 + ": " + typedValue);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static ColorStateList m2143(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static d m2144(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i5, int i6) {
        if (m2149(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i5, typedValue);
            int i7 = typedValue.type;
            if (i7 >= 28 && i7 <= 31) {
                return d.m2067(typedValue.data);
            }
            d m2070 = d.m2070(typedArray.getResources(), typedArray.getResourceId(i5, 0), theme);
            if (m2070 != null) {
                return m2070;
            }
        }
        return d.m2067(i6);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static float m2145(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5, float f5) {
        return !m2149(xmlPullParser, str) ? f5 : typedArray.getFloat(i5, f5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static int m2146(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5, int i6) {
        return !m2149(xmlPullParser, str) ? i6 : typedArray.getInt(i5, i6);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static int m2147(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5, int i6) {
        return !m2149(xmlPullParser, str) ? i6 : typedArray.getResourceId(i5, i6);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static String m2148(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5) {
        if (m2149(xmlPullParser, str)) {
            return typedArray.getString(i5);
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m2149(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static TypedArray m2150(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static TypedValue m2151(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i5) {
        if (m2149(xmlPullParser, str)) {
            return typedArray.peekValue(i5);
        }
        return null;
    }
}
