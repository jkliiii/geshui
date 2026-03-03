package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;

@ExperimentalBadgeUtils
/* loaded from: E:\78999\cookie_5123796.dex */
public class BadgeUtils {
    private static final String LOG_TAG = "BadgeUtils";
    public static final boolean USE_COMPAT_PARENT = false;

    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Toolbar f5282;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f5283;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ BadgeDrawable f5284;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ FrameLayout f5285;

        a(Toolbar toolbar, int i5, BadgeDrawable badgeDrawable, FrameLayout frameLayout) {
            this.f5282 = toolbar;
            this.f5283 = i5;
            this.f5284 = badgeDrawable;
            this.f5285 = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(this.f5282, this.f5283);
            if (actionMenuItemView != null) {
                BadgeUtils.setToolbarOffset(this.f5284, this.f5282.getResources());
                BadgeUtils.attachBadgeDrawable(this.f5284, actionMenuItemView, this.f5285);
                BadgeUtils.attachBadgeContentDescription(this.f5284, actionMenuItemView);
            }
        }
    }

    class b extends androidx.core.view.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ BadgeDrawable f5286;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(View.AccessibilityDelegate accessibilityDelegate, BadgeDrawable badgeDrawable) {
            super(accessibilityDelegate);
            this.f5286 = badgeDrawable;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(this.f5286.getContentDescription());
        }
    }

    class c extends androidx.core.view.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ BadgeDrawable f5287;

        c(BadgeDrawable badgeDrawable) {
            this.f5287 = badgeDrawable;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(this.f5287.getContentDescription());
        }
    }

    class d extends androidx.core.view.a {
        d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(null);
        }
    }

    private BadgeUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void attachBadgeContentDescription(BadgeDrawable badgeDrawable, View view) {
        if (Build.VERSION.SDK_INT < 29 || !f1.m2893(view)) {
            f1.m2830(view, new c(badgeDrawable));
        } else {
            f1.m2830(view, new b(view.getAccessibilityDelegate(), badgeDrawable));
        }
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i5 = 0; i5 < parcelableSparseArray.size(); i5++) {
            int keyAt = parcelableSparseArray.keyAt(i5);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i5);
            if (state == null) {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
            sparseArray.put(keyAt, BadgeDrawable.createFromSavedState(context, state));
        }
        return sparseArray;
    }

    public static ParcelableSparseArray createParcelableBadgeStates(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            int keyAt = sparseArray.keyAt(i5);
            BadgeDrawable valueAt = sparseArray.valueAt(i5);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            parcelableSparseArray.put(keyAt, valueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    private static void detachBadgeContentDescription(View view) {
        if (Build.VERSION.SDK_INT < 29 || !f1.m2893(view)) {
            f1.m2830(view, null);
        } else {
            f1.m2830(view, new d(view.getAccessibilityDelegate()));
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    static void removeToolbarOffset(BadgeDrawable badgeDrawable) {
        badgeDrawable.setAdditionalHorizontalOffset(0);
        badgeDrawable.setAdditionalVerticalOffset(0);
    }

    public static void setBadgeDrawableBounds(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    static void setToolbarOffset(BadgeDrawable badgeDrawable, Resources resources) {
        badgeDrawable.setAdditionalHorizontalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset));
        badgeDrawable.setAdditionalVerticalOffset(resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset));
    }

    public static void updateBadgeBounds(Rect rect, float f5, float f6, float f7, float f8) {
        rect.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else {
            if (USE_COMPAT_PARENT) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i5) {
        if (badgeDrawable == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i5);
        if (actionMenuItemView != null) {
            removeToolbarOffset(badgeDrawable);
            detachBadgeDrawable(badgeDrawable, actionMenuItemView);
            detachBadgeContentDescription(actionMenuItemView);
        } else {
            Log.w(LOG_TAG, "Trying to remove badge from a null menuItemView: " + i5);
        }
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i5) {
        attachBadgeDrawable(badgeDrawable, toolbar, i5, null);
    }

    public static void attachBadgeDrawable(BadgeDrawable badgeDrawable, Toolbar toolbar, int i5, FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i5, badgeDrawable, frameLayout));
    }
}
