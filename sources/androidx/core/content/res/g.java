package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: GradientColorInflaterCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class g {
    /* renamed from: ʻ, reason: contains not printable characters */
    private static a m2099(a aVar, int i5, int i6, boolean z5, int i7) {
        return aVar != null ? aVar : z5 ? new a(i5, i7, i6) : new a(i5, i6);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static Shader m2100(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, u.c.f11424);
        float m2145 = q.m2145(m2150, xmlPullParser, "startX", u.c.f11408, 0.0f);
        float m21452 = q.m2145(m2150, xmlPullParser, "startY", u.c.f11406, 0.0f);
        float m21453 = q.m2145(m2150, xmlPullParser, "endX", u.c.f11412, 0.0f);
        float m21454 = q.m2145(m2150, xmlPullParser, "endY", u.c.f11410, 0.0f);
        float m21455 = q.m2145(m2150, xmlPullParser, "centerX", u.c.f11396, 0.0f);
        float m21456 = q.m2145(m2150, xmlPullParser, "centerY", u.c.f11402, 0.0f);
        int m2146 = q.m2146(m2150, xmlPullParser, "type", u.c.f11398, 0);
        int m2141 = q.m2141(m2150, xmlPullParser, "startColor", u.c.f11426, 0);
        boolean m2149 = q.m2149(xmlPullParser, "centerColor");
        int m21412 = q.m2141(m2150, xmlPullParser, "centerColor", u.c.f11404, 0);
        int m21413 = q.m2141(m2150, xmlPullParser, "endColor", u.c.f11394, 0);
        int m21462 = q.m2146(m2150, xmlPullParser, "tileMode", u.c.f11421, 0);
        float m21457 = q.m2145(m2150, xmlPullParser, "gradientRadius", u.c.f11400, 0.0f);
        m2150.recycle();
        a m2099 = m2099(m2101(resources, xmlPullParser, attributeSet, theme), m2141, m21413, m2149, m21412);
        if (m2146 != 1) {
            return m2146 != 2 ? new LinearGradient(m2145, m21452, m21453, m21454, m2099.f2610, m2099.f2611, m2102(m21462)) : new SweepGradient(m21455, m21456, m2099.f2610, m2099.f2611);
        }
        if (m21457 > 0.0f) {
            return new RadialGradient(m21455, m21456, m21457, m2099.f2610, m2099.f2611, m2102(m21462));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r10.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static androidx.core.content.res.g.a m2101(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            int r0 = r10.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r10.next()
            if (r3 == r1) goto L81
            int r5 = r10.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L81
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r10.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = u.c.f11416
            android.content.res.TypedArray r3 = androidx.core.content.res.q.m2150(r9, r12, r11, r3)
            int r5 = u.c.f11414
            boolean r6 = r3.hasValue(r5)
            int r7 = u.c.f11418
            boolean r8 = r3.hasValue(r7)
            if (r6 == 0) goto L66
            if (r8 == 0) goto L66
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            r6 = 0
            float r6 = r3.getFloat(r7, r6)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L66:
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r10 = r10.getPositionDescription()
            r11.append(r10)
            java.lang.String r10 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L81:
            int r9 = r4.size()
            if (r9 <= 0) goto L8d
            androidx.core.content.res.g$a r9 = new androidx.core.content.res.g$a
            r9.<init>(r4, r2)
            return r9
        L8d:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.g.m2101(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):androidx.core.content.res.g$a");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Shader.TileMode m2102(int i5) {
        return i5 != 1 ? i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    /* compiled from: GradientColorInflaterCompat.java */
    static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final int[] f2610;

        /* renamed from: ʼ, reason: contains not printable characters */
        final float[] f2611;

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f2610 = new int[size];
            this.f2611 = new float[size];
            for (int i5 = 0; i5 < size; i5++) {
                this.f2610[i5] = list.get(i5).intValue();
                this.f2611[i5] = list2.get(i5).floatValue();
            }
        }

        a(int i5, int i6) {
            this.f2610 = new int[]{i5, i6};
            this.f2611 = new float[]{0.0f, 1.0f};
        }

        a(int i5, int i6, int i7) {
            this.f2610 = new int[]{i5, i6, i7};
            this.f2611 = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
