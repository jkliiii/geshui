package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p0 extends SeekBar {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final q0 f1395;

    public p0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6901);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1395.m1481();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1395.m1482();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1395.m1480(canvas);
    }

    public p0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        y2.m1650(this, getContext());
        q0 q0Var = new q0(this);
        this.f1395 = q0Var;
        q0Var.mo1415(attributeSet, i5);
    }
}
