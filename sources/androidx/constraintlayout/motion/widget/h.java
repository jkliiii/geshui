package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.j;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: MotionHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends androidx.constraintlayout.widget.d implements j.d {

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f1637;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f1638;

    /* renamed from: ـ, reason: contains not printable characters */
    private float f1639;

    /* renamed from: ٴ, reason: contains not printable characters */
    protected View[] f1640;

    public float getProgress() {
        return this.f1639;
    }

    public void setProgress(float f5) {
        this.f1639 = f5;
        int i5 = 0;
        if (this.f1853 > 0) {
            this.f1640 = m1832((ConstraintLayout) getParent());
            while (i5 < this.f1853) {
                m1759(this.f1640[i5], f5);
                i5++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i5 < childCount) {
            View childAt = viewGroup.getChildAt(i5);
            if (!(childAt instanceof h)) {
                m1759(childAt, f5);
            }
            i5++;
        }
    }

    @Override // androidx.constraintlayout.widget.d
    /* renamed from: ˑ */
    protected void mo1742(AttributeSet attributeSet) {
        super.mo1742(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.l.f2425);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == androidx.constraintlayout.widget.l.f2427) {
                    this.f1637 = obtainStyledAttributes.getBoolean(index, this.f1637);
                } else if (index == androidx.constraintlayout.widget.l.f2426) {
                    this.f1638 = obtainStyledAttributes.getBoolean(index, this.f1638);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean m1755() {
        return false;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public boolean m1756() {
        return this.f1638;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public boolean m1757() {
        return this.f1637;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m1758(Canvas canvas) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo1754(j jVar, int i5) {
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m1759(View view, float f5) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo1753(j jVar, int i5, int i6) {
    }

    @Override // androidx.constraintlayout.motion.widget.j.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo1752(j jVar, int i5, int i6, float f5) {
    }
}
