package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.view.f1;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_LinearProgressIndicator;
    public static final int INDETERMINATE_ANIMATION_TYPE_CONTIGUOUS = 0;
    public static final int INDETERMINATE_ANIMATION_TYPE_DISJOINT = 1;
    public static final int INDICATOR_DIRECTION_END_TO_START = 3;
    public static final int INDICATOR_DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int INDICATOR_DIRECTION_RIGHT_TO_LEFT = 1;
    public static final int INDICATOR_DIRECTION_START_TO_END = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndeterminateAnimationType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface IndicatorDirection {
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    private void initializeDrawables() {
        setIndeterminateDrawable(IndeterminateDrawable.createLinearDrawable(getContext(), (LinearProgressIndicatorSpec) this.spec));
        setProgressDrawable(DeterminateDrawable.createLinearDrawable(getContext(), (LinearProgressIndicatorSpec) this.spec));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.spec).indicatorDirection;
    }

    @Override // android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        S s5 = this.spec;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s5;
        boolean z6 = true;
        if (((LinearProgressIndicatorSpec) s5).indicatorDirection != 1 && ((f1.m2834(this) != 1 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (f1.m2834(this) != 0 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 3))) {
            z6 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z6;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        int paddingLeft = i5 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i6 - (getPaddingTop() + getPaddingBottom());
        IndeterminateDrawable<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        DeterminateDrawable<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    public void setIndeterminateAnimationType(int i5) {
        if (((LinearProgressIndicatorSpec) this.spec).indeterminateAnimationType == i5) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s5 = this.spec;
        ((LinearProgressIndicatorSpec) s5).indeterminateAnimationType = i5;
        ((LinearProgressIndicatorSpec) s5).validateSpec();
        if (i5 == 0) {
            getIndeterminateDrawable().setAnimatorDelegate(new g((LinearProgressIndicatorSpec) this.spec));
        } else {
            getIndeterminateDrawable().setAnimatorDelegate(new h(getContext(), (LinearProgressIndicatorSpec) this.spec));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
    }

    public void setIndicatorDirection(int i5) {
        S s5 = this.spec;
        ((LinearProgressIndicatorSpec) s5).indicatorDirection = i5;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s5;
        boolean z5 = true;
        if (i5 != 1 && ((f1.m2834(this) != 1 || ((LinearProgressIndicatorSpec) this.spec).indicatorDirection != 2) && (f1.m2834(this) != 0 || i5 != 3))) {
            z5 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z5;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i5, boolean z5) {
        S s5 = this.spec;
        if (s5 != 0 && ((LinearProgressIndicatorSpec) s5).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i5, z5);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i5) {
        super.setTrackCornerRadius(i5);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public LinearProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5, DEF_STYLE_RES);
        initializeDrawables();
    }
}
