package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f965;

    /* renamed from: ʿ, reason: contains not printable characters */
    private View f966;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View f967;

    /* renamed from: ˈ, reason: contains not printable characters */
    private View f968;

    /* renamed from: ˉ, reason: contains not printable characters */
    Drawable f969;

    /* renamed from: ˊ, reason: contains not printable characters */
    Drawable f970;

    /* renamed from: ˋ, reason: contains not printable characters */
    Drawable f971;

    /* renamed from: ˎ, reason: contains not printable characters */
    boolean f972;

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean f973;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f974;

    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static void m1005(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.f1.m2836(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f7079);
        this.f969 = obtainStyledAttributes.getDrawable(e.j.f7105);
        this.f970 = obtainStyledAttributes.getDrawable(e.j.f7157);
        this.f974 = obtainStyledAttributes.getDimensionPixelSize(e.j.f7309, -1);
        boolean z5 = true;
        if (getId() == e.f.f7025) {
            this.f972 = true;
            this.f971 = obtainStyledAttributes.getDrawable(e.j.f7131);
        }
        obtainStyledAttributes.recycle();
        if (!this.f972 ? this.f969 != null || this.f970 != null : this.f971 != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private int m1003(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean m1004(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f969;
        if (drawable != null && drawable.isStateful()) {
            this.f969.setState(getDrawableState());
        }
        Drawable drawable2 = this.f970;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f970.setState(getDrawableState());
        }
        Drawable drawable3 = this.f971;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f971.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f966;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f969;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f970;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f971;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f967 = findViewById(e.f.f6997);
        this.f968 = findViewById(e.f.f7007);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f965 || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        Drawable drawable;
        super.onLayout(z5, i5, i6, i7, i8);
        View view = this.f966;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i9 = layoutParams.bottomMargin;
            view.layout(i5, measuredHeight2 - i9, i7, measuredHeight - i9);
        }
        if (this.f972) {
            Drawable drawable2 = this.f971;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z6 = false;
            }
        } else {
            if (this.f969 != null) {
                if (this.f967.getVisibility() == 0) {
                    this.f969.setBounds(this.f967.getLeft(), this.f967.getTop(), this.f967.getRight(), this.f967.getBottom());
                } else {
                    View view2 = this.f968;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f969.setBounds(0, 0, 0, 0);
                    } else {
                        this.f969.setBounds(this.f968.getLeft(), this.f968.getTop(), this.f968.getRight(), this.f968.getBottom());
                    }
                }
                z7 = true;
            }
            this.f973 = z8;
            if (!z8 || (drawable = this.f970) == null) {
                z6 = z7;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z6) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        int i7;
        if (this.f967 == null && View.MeasureSpec.getMode(i6) == Integer.MIN_VALUE && (i7 = this.f974) >= 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(Math.min(i7, View.MeasureSpec.getSize(i6)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i5, i6);
        if (this.f967 == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i6);
        View view = this.f966;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!m1004(this.f967) ? m1003(this.f967) : !m1004(this.f968) ? m1003(this.f968) : 0) + m1003(this.f966), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i6) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f969;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f969);
        }
        this.f969 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f967;
            if (view != null) {
                this.f969.setBounds(view.getLeft(), this.f967.getTop(), this.f967.getRight(), this.f967.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f972 ? this.f969 != null || this.f970 != null : this.f971 != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.m1005(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f971;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f971);
        }
        this.f971 = drawable;
        boolean z5 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f972 && (drawable2 = this.f971) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f972 ? !(this.f969 != null || this.f970 != null) : this.f971 == null) {
            z5 = true;
        }
        setWillNotDraw(z5);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.m1005(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f970;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f970);
        }
        this.f970 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f973 && (drawable2 = this.f970) != null) {
                drawable2.setBounds(this.f966.getLeft(), this.f966.getTop(), this.f966.getRight(), this.f966.getBottom());
            }
        }
        boolean z5 = true;
        if (!this.f972 ? this.f969 != null || this.f970 != null : this.f971 != null) {
            z5 = false;
        }
        setWillNotDraw(z5);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            a.m1005(this);
        }
    }

    public void setTabContainer(u2 u2Var) {
        View view = this.f966;
        if (view != null) {
            removeView(view);
        }
        this.f966 = u2Var;
        if (u2Var != null) {
            addView(u2Var);
            ViewGroup.LayoutParams layoutParams = u2Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            u2Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z5) {
        this.f965 = z5;
        setDescendantFocusability(z5 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z5 = i5 == 0;
        Drawable drawable = this.f969;
        if (drawable != null) {
            drawable.setVisible(z5, false);
        }
        Drawable drawable2 = this.f970;
        if (drawable2 != null) {
            drawable2.setVisible(z5, false);
        }
        Drawable drawable3 = this.f971;
        if (drawable3 != null) {
            drawable3.setVisible(z5, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f969 && !this.f972) || (drawable == this.f970 && this.f973) || ((drawable == this.f971 && this.f972) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return super.startActionModeForChild(view, callback, i5);
        }
        return null;
    }
}
