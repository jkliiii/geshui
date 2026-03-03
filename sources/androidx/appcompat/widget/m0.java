package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* compiled from: AppCompatRatingBar.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m0 extends RatingBar {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final l0 f1362;

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6897);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        Bitmap m1414 = this.f1362.m1414();
        if (m1414 != null) {
            setMeasuredDimension(View.resolveSizeAndState(m1414.getWidth() * getNumStars(), i5, 0), getMeasuredHeight());
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        y2.m1650(this, getContext());
        l0 l0Var = new l0(this);
        this.f1362 = l0Var;
        l0Var.mo1415(attributeSet, i5);
    }
}
