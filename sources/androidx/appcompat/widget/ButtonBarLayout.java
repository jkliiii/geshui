package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f1046;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f1047;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f1048;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1048 = -1;
        int[] iArr = e.j.f7124;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.f1.m2828(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1046 = obtainStyledAttributes.getBoolean(e.j.f7125, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1046);
        }
    }

    private void setStacked(boolean z5) {
        if (this.f1047 != z5) {
            if (!z5 || this.f1046) {
                this.f1047 = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View findViewById = findViewById(e.f.f7004);
                if (findViewById != null) {
                    findViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private int m1064(int i5) {
        int childCount = getChildCount();
        while (i5 < childCount) {
            if (getChildAt(i5).getVisibility() == 0) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean m1065() {
        return this.f1047;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        boolean z5;
        int size = View.MeasureSpec.getSize(i5);
        int i8 = 0;
        if (this.f1046) {
            if (size > this.f1048 && m1065()) {
                setStacked(false);
            }
            this.f1048 = size;
        }
        if (m1065() || View.MeasureSpec.getMode(i5) != 1073741824) {
            i7 = i5;
            z5 = false;
        } else {
            i7 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z5 = true;
        }
        super.onMeasure(i7, i6);
        if (this.f1046 && !m1065()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z5 = true;
            }
        }
        if (z5) {
            super.onMeasure(i5, i6);
        }
        int m1064 = m1064(0);
        if (m1064 >= 0) {
            View childAt = getChildAt(m1064);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m1065()) {
                int m10642 = m1064(m1064 + 1);
                if (m10642 >= 0) {
                    paddingTop += getChildAt(m10642).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i8 = paddingTop;
            } else {
                i8 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.f1.m2865(this) != i8) {
            setMinimumHeight(i8);
            if (i6 == 0) {
                super.onMeasure(i5, i6);
            }
        }
    }

    public void setAllowStacking(boolean z5) {
        if (this.f1046 != z5) {
            this.f1046 = z5;
            if (!z5 && m1065()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
