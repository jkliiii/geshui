package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.res.q;
import androidx.core.graphics.l0;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m implements Interpolator {

    /* renamed from: ʻ, reason: contains not printable characters */
    private float[] f4619;

    /* renamed from: ʼ, reason: contains not printable characters */
    private float[] f4620;

    public m(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m5466(float f5, float f6, float f7, float f8) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f5, f6, f7, f8, 1.0f, 1.0f);
        m5467(path);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m5467(Path path) {
        int i5 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f4619 = new float[min];
        this.f4620 = new float[min];
        float[] fArr = new float[2];
        for (int i6 = 0; i6 < min; i6++) {
            pathMeasure.getPosTan((i6 * length) / (min - 1), fArr, null);
            this.f4619[i6] = fArr[0];
            this.f4620[i6] = fArr[1];
        }
        if (Math.abs(this.f4619[0]) <= 1.0E-5d && Math.abs(this.f4620[0]) <= 1.0E-5d) {
            int i7 = min - 1;
            if (Math.abs(this.f4619[i7] - 1.0f) <= 1.0E-5d && Math.abs(this.f4620[i7] - 1.0f) <= 1.0E-5d) {
                float f5 = 0.0f;
                int i8 = 0;
                while (i5 < min) {
                    float[] fArr2 = this.f4619;
                    int i9 = i8 + 1;
                    float f6 = fArr2[i8];
                    if (f6 < f5) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f6);
                    }
                    fArr2[i5] = f6;
                    i5++;
                    f5 = f6;
                    i8 = i9;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f4619[0]);
        sb.append(",");
        sb.append(this.f4620[0]);
        sb.append(" end:");
        int i10 = min - 1;
        sb.append(this.f4619[i10]);
        sb.append(",");
        sb.append(this.f4620[i10]);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5468(float f5, float f6) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f5, f6, 1.0f, 1.0f);
        m5467(path);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m5469(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (q.m2149(xmlPullParser, "pathData")) {
            String m2148 = q.m2148(typedArray, xmlPullParser, "pathData", 4);
            Path m2305 = l0.m2305(m2148);
            if (m2305 != null) {
                m5467(m2305);
                return;
            }
            throw new InflateException("The path is null, which is created from " + m2148);
        }
        if (!q.m2149(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!q.m2149(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float m2145 = q.m2145(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float m21452 = q.m2145(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean m2149 = q.m2149(xmlPullParser, "controlX2");
        if (m2149 != q.m2149(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (m2149) {
            m5466(m2145, m21452, q.m2145(typedArray, xmlPullParser, "controlX2", 2, 0.0f), q.m2145(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            m5468(m2145, m21452);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f4619.length - 1;
        int i5 = 0;
        while (length - i5 > 1) {
            int i6 = (i5 + length) / 2;
            if (f5 < this.f4619[i6]) {
                length = i6;
            } else {
                i5 = i6;
            }
        }
        float[] fArr = this.f4619;
        float f6 = fArr[length];
        float f7 = fArr[i5];
        float f8 = f6 - f7;
        if (f8 == 0.0f) {
            return this.f4620[i5];
        }
        float f9 = (f5 - f7) / f8;
        float[] fArr2 = this.f4620;
        float f10 = fArr2[i5];
        return f10 + (f9 * (fArr2[length] - f10));
    }

    public m(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, a.f4599);
        m5469(m2150, xmlPullParser);
        m2150.recycle();
    }
}
