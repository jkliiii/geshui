package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f1;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f6403;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f6404;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ ExpandableWidget f6405;

        a(View view, int i5, ExpandableWidget expandableWidget) {
            this.f6403 = view;
            this.f6404 = i5;
            this.f6405 = expandableWidget;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f6403.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.currentState == this.f6404) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                ExpandableWidget expandableWidget = this.f6405;
                expandableBehavior.onExpandedStateChange((View) expandableWidget, this.f6403, expandableWidget.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    private boolean didStateChange(boolean z5) {
        if (!z5) {
            return this.currentState == 1;
        }
        int i5 = this.currentState;
        return i5 == 0 || i5 == 2;
    }

    public static <T extends ExpandableBehavior> T from(View view, Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.f)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) layoutParams).m1896();
        if (m1896 instanceof ExpandableBehavior) {
            return cls.cast(m1896);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected ExpandableWidget findExpandableWidget(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = dependencies.get(i5);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!didStateChange(expandableWidget.isExpanded())) {
            return false;
        }
        this.currentState = expandableWidget.isExpanded() ? 1 : 2;
        return onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), true);
    }

    protected abstract boolean onExpandedStateChange(View view, View view2, boolean z5, boolean z6);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i5) {
        ExpandableWidget findExpandableWidget;
        if (f1.m2808(view) || (findExpandableWidget = findExpandableWidget(coordinatorLayout, view)) == null || !didStateChange(findExpandableWidget.isExpanded())) {
            return false;
        }
        int i6 = findExpandableWidget.isExpanded() ? 1 : 2;
        this.currentState = i6;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i6, findExpandableWidget));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }
}
