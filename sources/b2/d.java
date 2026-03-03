package b2;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Log;
import android.util.Property;
import android.view.animation.Interpolator;
import d2.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: SpriteAnimatorBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private f f4853;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Interpolator f4854;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f4855 = -1;

    /* renamed from: ʾ, reason: contains not printable characters */
    private long f4856 = 2000;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f4857 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Map<String, b> f4858 = new HashMap();

    /* compiled from: SpriteAnimatorBuilder.java */
    class a extends b<Float> {
        public a(float[] fArr, Property property, Float[] fArr2) {
            super(fArr, property, fArr2);
        }
    }

    /* compiled from: SpriteAnimatorBuilder.java */
    class b<T> {

        /* renamed from: ʻ, reason: contains not printable characters */
        float[] f4860;

        /* renamed from: ʼ, reason: contains not printable characters */
        Property f4861;

        /* renamed from: ʽ, reason: contains not printable characters */
        T[] f4862;

        public b(float[] fArr, Property property, T[] tArr) {
            this.f4860 = fArr;
            this.f4861 = property;
            this.f4862 = tArr;
        }
    }

    /* compiled from: SpriteAnimatorBuilder.java */
    class c extends b<Integer> {
        public c(float[] fArr, Property property, Integer[] numArr) {
            super(fArr, property, numArr);
        }
    }

    public d(f fVar) {
        this.f4853 = fVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m5690(int i5, int i6) {
        if (i5 != i6) {
            throw new IllegalStateException(String.format(Locale.getDefault(), "The fractions.length must equal values.length, fraction.length[%d], values.length[%d]", Integer.valueOf(i5), Integer.valueOf(i6)));
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m5691(float[] fArr, Property property, Float[] fArr2) {
        m5690(fArr.length, fArr2.length);
        this.f4858.put(property.getName(), new a(fArr, property, fArr2));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m5692(float[] fArr, Property property, Integer[] numArr) {
        m5690(fArr.length, numArr.length);
        this.f4858.put(property.getName(), new c(fArr, property, numArr));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public d m5693(float[] fArr, Integer... numArr) {
        m5692(fArr, f.f6855, numArr);
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public ObjectAnimator m5694() {
        PropertyValuesHolder[] propertyValuesHolderArr = new PropertyValuesHolder[this.f4858.size()];
        Iterator<Map.Entry<String, b>> it = this.f4858.entrySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            b value = it.next().getValue();
            float[] fArr = value.f4860;
            Keyframe[] keyframeArr = new Keyframe[fArr.length];
            int i6 = this.f4857;
            float f5 = fArr[i6];
            while (true) {
                int i7 = this.f4857;
                Object[] objArr = value.f4862;
                if (i6 < objArr.length + i7) {
                    int i8 = i6 - i7;
                    int length = i6 % objArr.length;
                    float f6 = fArr[length] - f5;
                    if (f6 < 0.0f) {
                        f6 += fArr[fArr.length - 1];
                    }
                    if (value instanceof c) {
                        keyframeArr[i8] = Keyframe.ofInt(f6, ((Integer) objArr[length]).intValue());
                    } else if (value instanceof a) {
                        keyframeArr[i8] = Keyframe.ofFloat(f6, ((Float) objArr[length]).floatValue());
                    } else {
                        keyframeArr[i8] = Keyframe.ofObject(f6, objArr[length]);
                    }
                    i6++;
                }
            }
            propertyValuesHolderArr[i5] = PropertyValuesHolder.ofKeyframe(value.f4861, keyframeArr);
            i5++;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this.f4853, propertyValuesHolderArr);
        ofPropertyValuesHolder.setDuration(this.f4856);
        ofPropertyValuesHolder.setRepeatCount(this.f4855);
        ofPropertyValuesHolder.setInterpolator(this.f4854);
        return ofPropertyValuesHolder;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public d m5695(long j5) {
        this.f4856 = j5;
        return this;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public d m5696(float... fArr) {
        m5697(c2.b.m5840(fArr));
        return this;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public d m5697(Interpolator interpolator) {
        this.f4854 = interpolator;
        return this;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public d m5698(float[] fArr, Integer... numArr) {
        m5692(fArr, f.f6861, numArr);
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public d m5699(float[] fArr, Integer... numArr) {
        m5692(fArr, f.f6860, numArr);
        return this;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public d m5700(float[] fArr, Integer... numArr) {
        m5692(fArr, f.f6862, numArr);
        return this;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public d m5701(float[] fArr, Float... fArr2) {
        m5691(fArr, f.f6856, fArr2);
        return this;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public d m5702(float[] fArr, Float... fArr2) {
        m5691(fArr, f.f6853, fArr2);
        return this;
    }

    /* renamed from: י, reason: contains not printable characters */
    public d m5703(int i5) {
        if (i5 < 0) {
            Log.w("SpriteAnimatorBuilder", "startFrame should always be non-negative");
            i5 = 0;
        }
        this.f4857 = i5;
        return this;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public d m5704(float[] fArr, Float... fArr2) {
        m5691(fArr, f.f6858, fArr2);
        return this;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public d m5705(float[] fArr, Float... fArr2) {
        m5691(fArr, f.f6852, fArr2);
        return this;
    }
}
