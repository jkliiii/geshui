package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.t;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.c;

/* compiled from: SheetDialog.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class f<C extends c> extends t {
    private static final int COORDINATOR_LAYOUT_ID = R.id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = R.id.touch_outside;
    private MaterialBackOrchestrator backOrchestrator;
    private Sheet<C> behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;
    private FrameLayout sheet;

    /* compiled from: SheetDialog.java */
    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            if (!f.this.cancelable) {
                j0Var.m2646(false);
            } else {
                j0Var.m2636(1048576);
                j0Var.m2646(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (i5 == 1048576) {
                f fVar = f.this;
                if (fVar.cancelable) {
                    fVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i5, bundle);
        }
    }

    f(Context context, int i5, int i6, int i7) {
        super(context, getThemeResId(context, i5, i6, i7));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        supportRequestWindowFeature(1);
    }

    private void ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), getLayoutResId(), null);
            this.container = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(getDialogId());
            this.sheet = frameLayout2;
            Sheet<C> behaviorFromSheet = getBehaviorFromSheet(frameLayout2);
            this.behavior = behaviorFromSheet;
            addSheetCancelOnHideCallback(behaviorFromSheet);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.sheet);
        }
    }

    private FrameLayout getContainer() {
        if (this.container == null) {
            ensureContainerAndBehavior();
        }
        return this.container;
    }

    private FrameLayout getSheet() {
        if (this.sheet == null) {
            ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(Context context, int i5, int i6, int i7) {
        if (i5 != 0) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i6, typedValue, true) ? typedValue.resourceId : i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$wrapInSheet$0(View view) {
        if (this.cancelable && isShowing() && shouldWindowCloseOnTouchOutside()) {
            cancel();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.sheet) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.f)) {
            return;
        }
        window.setWindowAnimations(r.m3298(((CoordinatorLayout.f) this.sheet.getLayoutParams()).f2506, f1.m2834(this.sheet)) == 3 ? R.style.Animation_Material3_SideSheetDialog_Left : R.style.Animation_Material3_SideSheetDialog_Right);
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    private void updateListeningForBackCallbacks() {
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        if (this.cancelable) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View wrapInSheet(int i5, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) getContainer().findViewById(COORDINATOR_LAYOUT_ID);
        if (i5 != 0 && view == null) {
            view = getLayoutInflater().inflate(i5, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout sheet = getSheet();
        sheet.removeAllViews();
        if (layoutParams == null) {
            sheet.addView(view);
        } else {
            sheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(TOUCH_OUTSIDE_ID).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6085.lambda$wrapInSheet$0(view2);
            }
        });
        f1.m2830(getSheet(), new a());
        return this.container;
    }

    abstract void addSheetCancelOnHideCallback(Sheet<C> sheet);

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        Sheet<C> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    Sheet<C> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    abstract Sheet<C> getBehaviorFromSheet(FrameLayout frameLayout);

    abstract int getDialogId();

    abstract int getLayoutResId();

    abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        updateListeningForBackCallbacks();
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                window.setStatusBarColor(0);
                window.addFlags(RecyclerView.UNDEFINED_DURATION);
                if (i5 < 23) {
                    window.addFlags(67108864);
                }
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStart() {
        super.onStart();
        Sheet<C> sheet = this.behavior;
        if (sheet == null || sheet.getState() != 5) {
            return;
        }
        this.behavior.setState(getStateOnStart());
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z5) {
        super.setCancelable(z5);
        if (this.cancelable != z5) {
            this.cancelable = z5;
        }
        if (getWindow() != null) {
            updateListeningForBackCallbacks();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z5) {
        super.setCanceledOnTouchOutside(z5);
        if (z5 && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z5;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public void setContentView(int i5) {
        super.setContentView(wrapInSheet(i5, null, null));
    }

    public void setDismissWithSheetAnimationEnabled(boolean z5) {
        this.dismissWithAnimation = z5;
    }

    public void setSheetEdge(int i5) {
        FrameLayout frameLayout = this.sheet;
        if (frameLayout == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (f1.m2808(frameLayout)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams layoutParams = this.sheet.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            ((CoordinatorLayout.f) layoutParams).f2506 = i5;
            maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        }
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInSheet(0, view, layoutParams));
    }
}
