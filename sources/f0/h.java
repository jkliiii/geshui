package f0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: EmojiTransformationMethod.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h implements TransformationMethod {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final TransformationMethod f7665;

    h(TransformationMethod transformationMethod) {
        this.f7665 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f7665;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.e.m3781().m3789() != 1) ? charSequence : androidx.emoji2.text.e.m3781().m3794(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z5, int i5, Rect rect) {
        TransformationMethod transformationMethod = this.f7665;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z5, i5, rect);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public TransformationMethod m8515() {
        return this.f7665;
    }
}
