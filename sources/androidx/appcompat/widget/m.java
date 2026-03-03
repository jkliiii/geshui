package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: AppCompatEmojiTextHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class m {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final TextView f1360;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f0.f f1361;

    m(TextView textView) {
        this.f1360 = textView;
        this.f1361 = new f0.f(textView, false);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    InputFilter[] m1419(InputFilter[] inputFilterArr) {
        return this.f1361.m8491(inputFilterArr);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m1420() {
        return this.f1361.m8492();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m1421(AttributeSet attributeSet, int i5) {
        TypedArray obtainStyledAttributes = this.f1360.getContext().obtainStyledAttributes(attributeSet, e.j.f7089, i5, 0);
        try {
            int i6 = e.j.f7103;
            boolean z5 = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getBoolean(i6, true) : true;
            obtainStyledAttributes.recycle();
            m1423(z5);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m1422(boolean z5) {
        this.f1361.m8493(z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m1423(boolean z5) {
        this.f1361.m8494(z5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public TransformationMethod m1424(TransformationMethod transformationMethod) {
        return this.f1361.m8495(transformationMethod);
    }
}
