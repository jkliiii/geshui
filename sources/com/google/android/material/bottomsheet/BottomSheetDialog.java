package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.t;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.u0;
import androidx.core.view.u4;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.shape.MaterialShapeDrawable;

/* loaded from: E:\78999\cookie_5123796.dex */
public class BottomSheetDialog extends t {
    private MaterialBackOrchestrator backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private f edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    class a implements u0 {
        a() {
        }

        @Override // androidx.core.view.u0
        /* renamed from: ʻ */
        public f5 mo691(View view, f5 f5Var) {
            if (BottomSheetDialog.this.edgeToEdgeCallback != null) {
                BottomSheetDialog.this.behavior.removeBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
            }
            if (f5Var != null) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                bottomSheetDialog.edgeToEdgeCallback = new f(bottomSheetDialog.bottomSheet, f5Var, null);
                BottomSheetDialog.this.edgeToEdgeCallback.m6231(BottomSheetDialog.this.getWindow());
                BottomSheetDialog.this.behavior.addBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
            }
            return f5Var;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            if (!BottomSheetDialog.this.cancelable) {
                j0Var.m2646(false);
            } else {
                j0Var.m2636(1048576);
                j0Var.m2646(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (i5 == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.cancelable) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i5, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    private static class f extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Boolean f5340;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final f5 f5341;

        /* renamed from: ʽ, reason: contains not printable characters */
        private Window f5342;

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f5343;

        /* synthetic */ f(View view, f5 f5Var, a aVar) {
            this(view, f5Var);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m6230(View view) {
            if (view.getTop() < this.f5341.m3076()) {
                Window window = this.f5342;
                if (window != null) {
                    Boolean bool = this.f5340;
                    EdgeToEdgeUtils.setLightStatusBar(window, bool == null ? this.f5343 : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f5341.m3076() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f5342;
                if (window2 != null) {
                    EdgeToEdgeUtils.setLightStatusBar(window2, this.f5343);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        void onLayout(View view) {
            m6230(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f5) {
            m6230(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i5) {
            m6230(view);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m6231(Window window) {
            if (this.f5342 == window) {
                return;
            }
            this.f5342 = window;
            if (window != null) {
                this.f5343 = u4.m3368(window, window.getDecorView()).m3331();
            }
        }

        private f(View view, f5 f5Var) {
            this.f5341 = f5Var;
            MaterialShapeDrawable materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
            ColorStateList fillColor = materialShapeDrawable != null ? materialShapeDrawable.getFillColor() : f1.m2896(view);
            if (fillColor != null) {
                this.f5340 = Boolean.valueOf(MaterialColors.isColorLight(fillColor.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f5340 = Boolean.valueOf(MaterialColors.isColorLight(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f5340 = null;
            }
        }
    }

    public BottomSheetDialog(Context context) {
        this(context, 0);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.coordinator = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
            this.behavior = from;
            from.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
            this.backOrchestrator = new MaterialBackOrchestrator(this.behavior, this.bottomSheet);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i5) {
        if (i5 != 0) {
            return i5;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z5) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z5 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
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

    private View wrapInBottomSheet(int i5, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i5 != 0 && view == null) {
            view = getLayoutInflater().inflate(i5, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            f1.m2846(this.bottomSheet, new a());
        }
        this.bottomSheet.removeAllViews();
        if (layoutParams == null) {
            this.bottomSheet.addView(view);
        } else {
            this.bottomSheet.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        f1.m2830(this.bottomSheet, new c());
        this.bottomSheet.setOnTouchListener(new d());
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                boolean z5 = this.edgeToEdgeEnabled && Color.alpha(window.getNavigationBarColor()) < 255;
                FrameLayout frameLayout = this.container;
                if (frameLayout != null) {
                    frameLayout.setFitsSystemWindows(!z5);
                }
                CoordinatorLayout coordinatorLayout = this.coordinator;
                if (coordinatorLayout != null) {
                    coordinatorLayout.setFitsSystemWindows(!z5);
                }
                u4.m3369(window, !z5);
            }
            f fVar = this.edgeToEdgeCallback;
            if (fVar != null) {
                fVar.m6231(window);
            }
        }
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
        f fVar = this.edgeToEdgeCallback;
        if (fVar != null) {
            fVar.m6231(null);
        }
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.behavior.setState(4);
    }

    void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z5) {
        super.setCancelable(z5);
        if (this.cancelable != z5) {
            this.cancelable = z5;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z5);
            }
            if (getWindow() != null) {
                updateListeningForBackCallbacks();
            }
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
        super.setContentView(wrapInBottomSheet(i5, null, null));
    }

    public void setDismissWithAnimation(boolean z5) {
        this.dismissWithAnimation = z5;
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    @Override // androidx.appcompat.app.t, androidx.activity.k, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public BottomSheetDialog(Context context, int i5) {
        super(context, getThemeResId(context, i5));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new e();
        supportRequestWindowFeature(1);
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    protected BottomSheetDialog(Context context, boolean z5, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z5, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new e();
        supportRequestWindowFeature(1);
        this.cancelable = z5;
        this.edgeToEdgeEnabled = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    class e extends BottomSheetBehavior.BottomSheetCallback {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i5) {
            if (i5 == 5) {
                BottomSheetDialog.this.cancel();
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f5) {
        }
    }
}
