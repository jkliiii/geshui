package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.q;
import androidx.transition.x;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public class TextScale extends q {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ TextView f5848;

        a(TextView textView) {
            this.f5848 = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f5848.setScaleX(floatValue);
            this.f5848.setScaleY(floatValue);
        }
    }

    private void captureValues(x xVar) {
        View view = xVar.f4581;
        if (view instanceof TextView) {
            xVar.f4580.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.q
    public void captureEndValues(x xVar) {
        captureValues(xVar);
    }

    @Override // androidx.transition.q
    public void captureStartValues(x xVar) {
        captureValues(xVar);
    }

    @Override // androidx.transition.q
    public Animator createAnimator(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.f4581 instanceof TextView)) {
            return null;
        }
        View view = xVar2.f4581;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = xVar.f4580;
        Map<String, Object> map2 = xVar2.f4580;
        float floatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        float floatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
