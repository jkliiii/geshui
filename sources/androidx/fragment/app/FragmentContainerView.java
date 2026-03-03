package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.f1;
import androidx.core.view.f5;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    private ArrayList<View> f3387;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ArrayList<View> f3388;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View.OnApplyWindowInsetsListener f3389;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f3390;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m3941(View view) {
        ArrayList<View> arrayList = this.f3388;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f3387 == null) {
            this.f3387 = new ArrayList<>();
        }
        this.f3387.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (n.m4147(view) != null) {
            super.addView(view, i5, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i5, ViewGroup.LayoutParams layoutParams, boolean z5) {
        if (n.m4147(view) != null) {
            return super.addViewInLayout(view, i5, layoutParams, z5);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        f5 m3063 = f5.m3063(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3389;
        f5 m30632 = onApplyWindowInsetsListener != null ? f5.m3063(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : f1.m2816(this, m3063);
        if (!m30632.m3080()) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f1.m2872(getChildAt(i5), m30632);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f3390 && this.f3387 != null) {
            for (int i5 = 0; i5 < this.f3387.size(); i5++) {
                super.drawChild(canvas, this.f3387.get(i5), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j5) {
        ArrayList<View> arrayList;
        if (!this.f3390 || (arrayList = this.f3387) == null || arrayList.size() <= 0 || !this.f3387.contains(view)) {
            return super.drawChild(canvas, view, j5);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f3388;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f3387;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f3390 = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            m3941(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z5) {
        if (z5) {
            m3941(view);
        }
        super.removeDetachedView(view, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        m3941(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i5) {
        m3941(getChildAt(i5));
        super.removeViewAt(i5);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        m3941(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            m3941(getChildAt(i7));
        }
        super.removeViews(i5, i6);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            m3941(getChildAt(i7));
        }
        super.removeViewsInLayout(i5, i6);
    }

    void setDrawDisappearingViewsLast(boolean z5) {
        this.f3390 = z5;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f3389 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f3388 == null) {
                this.f3388 = new ArrayList<>();
            }
            this.f3388.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i5) {
        String str;
        super(context, attributeSet, i5);
        this.f3390 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f7836);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(g0.c.f7837);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    FragmentContainerView(Context context, AttributeSet attributeSet, n nVar) {
        String str;
        super(context, attributeSet);
        this.f3390 = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f7836);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(g0.c.f7837) : classAttribute;
        String string = obtainStyledAttributes.getString(g0.c.f7838);
        obtainStyledAttributes.recycle();
        int id = getId();
        e m4175 = nVar.m4175(id);
        if (classAttribute != null && m4175 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            e mo4117 = nVar.m4180().mo4117(context.getClassLoader(), classAttribute);
            mo4117.onInflate(context, attributeSet, (Bundle) null);
            nVar.m4238().m4344(true).m4337(this, mo4117, string).mo3950();
        }
        nVar.m4207(this);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
