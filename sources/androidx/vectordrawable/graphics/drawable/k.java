package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.res.q;
import androidx.core.graphics.l0;
import java.io.IOException;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k {

    /* compiled from: AnimatorInflaterCompat.java */
    private static class a implements TypeEvaluator<l0.b[]> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private l0.b[] f4617;

        a() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public l0.b[] evaluate(float f5, l0.b[] bVarArr, l0.b[] bVarArr2) {
            if (!l0.m2302(bVarArr, bVarArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!l0.m2302(this.f4617, bVarArr)) {
                this.f4617 = l0.m2306(bVarArr);
            }
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                this.f4617[i5].m2315(bVarArr[i5], bVarArr2[i5], f5);
            }
            return this.f4617;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Animator m5445(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f5) throws XmlPullParserException, IOException {
        return m5446(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator m5446(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.k.m5446(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Keyframe m5447(Keyframe keyframe, float f5) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f5) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f5) : Keyframe.ofObject(f5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m5448(Keyframe[] keyframeArr, float f5, int i5, int i6) {
        float f6 = f5 / ((i6 - i5) + 2);
        while (i5 <= i6) {
            keyframeArr[i5].setFraction(keyframeArr[i5 - 1].getFraction() + f6);
            i5++;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static PropertyValuesHolder m5449(TypedArray typedArray, int i5, int i6, int i7, String str) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i6);
        boolean z5 = peekValue != null;
        int i8 = z5 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i7);
        boolean z6 = peekValue2 != null;
        int i9 = z6 ? peekValue2.type : 0;
        if (i5 == 4) {
            i5 = ((z5 && m5452(i8)) || (z6 && m5452(i9))) ? 3 : 0;
        }
        boolean z7 = i5 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i5 != 2) {
            l m5465 = i5 == 3 ? l.m5465() : null;
            if (z7) {
                if (z5) {
                    float dimension = i8 == 5 ? typedArray.getDimension(i6, 0.0f) : typedArray.getFloat(i6, 0.0f);
                    if (z6) {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
                    } else {
                        ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, i9 == 5 ? typedArray.getDimension(i7, 0.0f) : typedArray.getFloat(i7, 0.0f));
                }
                propertyValuesHolder = ofFloat;
            } else if (z5) {
                int dimension2 = i8 == 5 ? (int) typedArray.getDimension(i6, 0.0f) : m5452(i8) ? typedArray.getColor(i6, 0) : typedArray.getInt(i6, 0);
                if (z6) {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : m5452(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
                } else {
                    propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
                }
            } else if (z6) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, i9 == 5 ? (int) typedArray.getDimension(i7, 0.0f) : m5452(i9) ? typedArray.getColor(i7, 0) : typedArray.getInt(i7, 0));
            }
            if (propertyValuesHolder == null || m5465 == null) {
                return propertyValuesHolder;
            }
            propertyValuesHolder.setEvaluator(m5465);
            return propertyValuesHolder;
        }
        String string = typedArray.getString(i6);
        String string2 = typedArray.getString(i7);
        l0.b[] m2304 = l0.m2304(string);
        l0.b[] m23042 = l0.m2304(string2);
        if (m2304 == null && m23042 == null) {
            return null;
        }
        if (m2304 == null) {
            if (m23042 != null) {
                return PropertyValuesHolder.ofObject(str, new a(), m23042);
            }
            return null;
        }
        a aVar = new a();
        if (m23042 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m2304);
        } else {
            if (!l0.m2302(m2304, m23042)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, aVar, m2304, m23042);
        }
        return ofObject;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static int m5450(TypedArray typedArray, int i5, int i6) {
        TypedValue peekValue = typedArray.peekValue(i5);
        boolean z5 = peekValue != null;
        int i7 = z5 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i6);
        boolean z6 = peekValue2 != null;
        return ((z5 && m5452(i7)) || (z6 && m5452(z6 ? peekValue2.type : 0))) ? 3 : 0;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static int m5451(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4597);
        int i5 = 0;
        TypedValue m2151 = q.m2151(m2150, xmlPullParser, "value", 0);
        if ((m2151 != null) && m5452(m2151.type)) {
            i5 = 3;
        }
        m2150.recycle();
        return i5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m5452(int i5) {
        return i5 >= 28 && i5 <= 31;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static Animator m5453(Context context, int i5) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i5) : m5454(context, context.getResources(), context.getTheme(), i5);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static Animator m5454(Context context, Resources resources, Resources.Theme theme, int i5) throws Resources.NotFoundException {
        return m5455(context, resources, theme, i5, 1.0f);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static Animator m5455(Context context, Resources resources, Resources.Theme theme, int i5, float f5) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i5);
                    return m5445(context, resources, theme, xmlResourceParser, f5);
                } catch (IOException e5) {
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i5));
                    notFoundException.initCause(e5);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e6) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i5));
                notFoundException2.initCause(e6);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static ValueAnimator m5456(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f5, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4594);
        TypedArray m21502 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4598);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        m5461(valueAnimator, m2150, m21502, f5, xmlPullParser);
        int m2147 = q.m2147(m2150, xmlPullParser, "interpolator", 0, 0);
        if (m2147 > 0) {
            valueAnimator.setInterpolator(j.m5444(context, m2147));
        }
        m2150.recycle();
        if (m21502 != null) {
            m21502.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static Keyframe m5457(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i5, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4597);
        float m2145 = q.m2145(m2150, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue m2151 = q.m2151(m2150, xmlPullParser, "value", 0);
        boolean z5 = m2151 != null;
        if (i5 == 4) {
            i5 = (z5 && m5452(m2151.type)) ? 3 : 0;
        }
        Keyframe ofInt = z5 ? i5 != 0 ? (i5 == 1 || i5 == 3) ? Keyframe.ofInt(m2145, q.m2146(m2150, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(m2145, q.m2145(m2150, xmlPullParser, "value", 0, 0.0f)) : i5 == 0 ? Keyframe.ofFloat(m2145) : Keyframe.ofInt(m2145);
        int m2147 = q.m2147(m2150, xmlPullParser, "interpolator", 1, 0);
        if (m2147 > 0) {
            ofInt.setInterpolator(j.m5444(context, m2147));
        }
        m2150.recycle();
        return ofInt;
    }

    /* renamed from: י, reason: contains not printable characters */
    private static ObjectAnimator m5458(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f5, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m5456(context, resources, theme, attributeSet, objectAnimator, f5, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static PropertyValuesHolder m5459(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i5) throws XmlPullParserException, IOException {
        int size;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i5 == 4) {
                    i5 = m5451(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m5457 = m5457(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i5, xmlPullParser);
                if (m5457 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m5457);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), m5447(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, m5447(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i6 = 0; i6 < size; i6++) {
                Keyframe keyframe3 = keyframeArr[i6];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i6 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i7 = size - 1;
                        if (i6 == i7) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i8 = i6;
                            for (int i9 = i6 + 1; i9 < i7 && keyframeArr[i9].getFraction() < 0.0f; i9++) {
                                i8 = i9;
                            }
                            m5448(keyframeArr, keyframeArr[i8 + 1].getFraction() - keyframeArr[i6 - 1].getFraction(), i6, i8);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i5 == 3) {
                propertyValuesHolder.setEvaluator(l.m5465());
            }
        }
        return propertyValuesHolder;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static PropertyValuesHolder[] m5460(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int i5;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    TypedArray m2150 = q.m2150(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4596);
                    String m2148 = q.m2148(m2150, xmlPullParser, "propertyName", 3);
                    int m2146 = q.m2146(m2150, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder m5459 = m5459(context, resources, theme, xmlPullParser, m2148, m2146);
                    if (m5459 == null) {
                        m5459 = m5449(m2150, m2146, 0, 1, m2148);
                    }
                    if (m5459 != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(m5459);
                    }
                    m2150.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i5 = 0; i5 < size; i5++) {
                propertyValuesHolderArr[i5] = (PropertyValuesHolder) arrayList.get(i5);
            }
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static void m5461(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f5, XmlPullParser xmlPullParser) {
        long m2146 = q.m2146(typedArray, xmlPullParser, "duration", 1, 300);
        long m21462 = q.m2146(typedArray, xmlPullParser, "startOffset", 2, 0);
        int m21463 = q.m2146(typedArray, xmlPullParser, "valueType", 7, 4);
        if (q.m2149(xmlPullParser, "valueFrom") && q.m2149(xmlPullParser, "valueTo")) {
            if (m21463 == 4) {
                m21463 = m5450(typedArray, 5, 6);
            }
            PropertyValuesHolder m5449 = m5449(typedArray, m21463, 5, 6, BuildConfig.FLAVOR);
            if (m5449 != null) {
                valueAnimator.setValues(m5449);
            }
        }
        valueAnimator.setDuration(m2146);
        valueAnimator.setStartDelay(m21462);
        valueAnimator.setRepeatCount(q.m2146(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(q.m2146(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            m5462(valueAnimator, typedArray2, m21463, f5, xmlPullParser);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static void m5462(ValueAnimator valueAnimator, TypedArray typedArray, int i5, float f5, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m2148 = q.m2148(typedArray, xmlPullParser, "pathData", 1);
        if (m2148 == null) {
            objectAnimator.setPropertyName(q.m2148(typedArray, xmlPullParser, "propertyName", 0));
            return;
        }
        String m21482 = q.m2148(typedArray, xmlPullParser, "propertyXName", 2);
        String m21483 = q.m2148(typedArray, xmlPullParser, "propertyYName", 3);
        if (i5 != 2) {
        }
        if (m21482 != null || m21483 != null) {
            m5463(l0.m2305(m2148), objectAnimator, f5 * 0.5f, m21482, m21483);
            return;
        }
        throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static void m5463(Path path, ObjectAnimator objectAnimator, float f5, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f6 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f7 = 0.0f;
        do {
            f7 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f7));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f7 / f5)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f8 = f7 / (min - 1);
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i6)).floatValue(), fArr3, null);
            fArr[i5] = fArr3[0];
            fArr2[i5] = fArr3[1];
            f6 += f8;
            int i7 = i6 + 1;
            if (i7 < arrayList.size() && f6 > ((Float) arrayList.get(i7)).floatValue()) {
                pathMeasure2.nextContour();
                i6 = i7;
            }
            i5++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }
}
