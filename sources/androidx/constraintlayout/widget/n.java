package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* compiled from: VirtualLayout.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class n extends d {

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f2500;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f2501;

    public n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.d, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2500 || this.f2501) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i5 = 0; i5 < this.f1853; i5++) {
                    View m1803 = constraintLayout.m1803(this.f1852[i5]);
                    if (m1803 != null) {
                        if (this.f2500) {
                            m1803.setVisibility(visibility);
                        }
                        if (this.f2501 && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            m1803.setTranslationZ(m1803.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        m1829();
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        m1829();
    }

    @Override // androidx.constraintlayout.widget.d
    /* renamed from: ˊ */
    protected void mo1831(ConstraintLayout constraintLayout) {
        m1830(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.d
    /* renamed from: ˑ */
    protected void mo1742(AttributeSet attributeSet) {
        super.mo1742(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f2101);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2109) {
                    this.f2500 = true;
                } else if (index == l.f2117) {
                    this.f2501 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ᵔ */
    public void mo1744(q.l lVar, int i5, int i6) {
    }
}
