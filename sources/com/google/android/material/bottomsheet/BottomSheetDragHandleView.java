package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j0;
import androidx.core.view.accessibility.o0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;

/* loaded from: E:\78999\cookie_5123796.dex */
public class BottomSheetDragHandleView extends q implements AccessibilityManager.AccessibilityStateChangeListener {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_BottomSheet_DragHandle;
    private final AccessibilityManager accessibilityManager;
    private boolean accessibilityServiceEnabled;
    private BottomSheetBehavior<?> bottomSheetBehavior;
    private final BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    private final String clickFeedback;
    private final String clickToCollapseActionLabel;
    private boolean clickToExpand;
    private final String clickToExpandActionLabel;
    private boolean interactable;

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            if (accessibilityEvent.getEventType() == 1) {
                BottomSheetDragHandleView.this.expandOrCollapseBottomSheetIfPossible();
            }
        }
    }

    public BottomSheetDragHandleView(Context context) {
        this(context, null);
    }

    private void announceAccessibilityEvent(String str) {
        if (this.accessibilityManager == null) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        this.accessibilityManager.sendAccessibilityEvent(obtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean expandOrCollapseBottomSheetIfPossible() {
        boolean z5 = false;
        if (!this.interactable) {
            return false;
        }
        announceAccessibilityEvent(this.clickFeedback);
        if (!this.bottomSheetBehavior.isFitToContents() && !this.bottomSheetBehavior.shouldSkipHalfExpandedStateWhenDragging()) {
            z5 = true;
        }
        int state = this.bottomSheetBehavior.getState();
        int i5 = 6;
        if (state == 4) {
            if (!z5) {
                i5 = 3;
            }
        } else if (state != 3) {
            i5 = this.clickToExpand ? 3 : 4;
        } else if (!z5) {
            i5 = 4;
        }
        this.bottomSheetBehavior.setState(i5);
        return true;
    }

    private BottomSheetBehavior<?> findParentBottomSheetBehavior() {
        View view = this;
        while (true) {
            view = getParentView(view);
            if (view == null) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                CoordinatorLayout.c m1896 = ((CoordinatorLayout.f) layoutParams).m1896();
                if (m1896 instanceof BottomSheetBehavior) {
                    return (BottomSheetBehavior) m1896;
                }
            }
        }
    }

    private static View getParentView(View view) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$onBottomSheetStateChanged$0(View view, o0.a aVar) {
        return expandOrCollapseBottomSheetIfPossible();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onBottomSheetStateChanged(int i5) {
        if (i5 == 4) {
            this.clickToExpand = true;
        } else if (i5 == 3) {
            this.clickToExpand = false;
        }
        f1.m2826(this, j0.a.f2869, this.clickToExpand ? this.clickToExpandActionLabel : this.clickToCollapseActionLabel, new o0() { // from class: com.google.android.material.bottomsheet.e
            @Override // androidx.core.view.accessibility.o0
            /* renamed from: ʻ */
            public final boolean mo2731(View view, o0.a aVar) {
                return this.f5347.lambda$onBottomSheetStateChanged$0(view, aVar);
            }
        });
    }

    private void setBottomSheetBehavior(BottomSheetBehavior<?> bottomSheetBehavior) {
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.bottomSheetBehavior;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.removeBottomSheetCallback(this.bottomSheetCallback);
            this.bottomSheetBehavior.setAccessibilityDelegateView(null);
        }
        this.bottomSheetBehavior = bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setAccessibilityDelegateView(this);
            onBottomSheetStateChanged(this.bottomSheetBehavior.getState());
            this.bottomSheetBehavior.addBottomSheetCallback(this.bottomSheetCallback);
        }
        updateInteractableState();
    }

    private void updateInteractableState() {
        this.interactable = this.accessibilityServiceEnabled && this.bottomSheetBehavior != null;
        f1.m2843(this, this.bottomSheetBehavior == null ? 2 : 1);
        setClickable(this.interactable);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z5) {
        this.accessibilityServiceEnabled = z5;
        updateInteractableState();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBottomSheetBehavior(findParentBottomSheetBehavior());
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.addAccessibilityStateChangeListener(this);
            onAccessibilityStateChanged(this.accessibilityManager.isEnabled());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            accessibilityManager.removeAccessibilityStateChangeListener(this);
        }
        setBottomSheetBehavior(null);
        super.onDetachedFromWindow();
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomSheetDragHandleStyle);
    }

    public BottomSheetDragHandleView(Context context, AttributeSet attributeSet, int i5) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, DEF_STYLE_RES), attributeSet, i5);
        this.clickToExpandActionLabel = getResources().getString(R.string.bottomsheet_action_expand);
        this.clickToCollapseActionLabel = getResources().getString(R.string.bottomsheet_action_collapse);
        this.clickFeedback = getResources().getString(R.string.bottomsheet_drag_handle_clicked);
        this.bottomSheetCallback = new a();
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        updateInteractableState();
        f1.m2830(this, new b());
    }

    class a extends BottomSheetBehavior.BottomSheetCallback {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i5) {
            BottomSheetDragHandleView.this.onBottomSheetStateChanged(i5);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f5) {
        }
    }
}
