package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.core.util.e;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.transition.s;
import androidx.transition.u;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements n {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int ITEM_POOL_SIZE = 5;
    private static final int NO_PADDING = -1;
    private final SparseArray<BadgeDrawable> badgeDrawables;
    private NavigationBarItemView[] buttons;
    private ColorStateList itemActiveIndicatorColor;
    private boolean itemActiveIndicatorEnabled;
    private int itemActiveIndicatorHeight;
    private int itemActiveIndicatorLabelPadding;
    private int itemActiveIndicatorMarginHorizontal;
    private boolean itemActiveIndicatorResizeable;
    private ShapeAppearanceModel itemActiveIndicatorShapeAppearance;
    private int itemActiveIndicatorWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private int itemIconSize;
    private ColorStateList itemIconTint;
    private int itemPaddingBottom;
    private int itemPaddingTop;
    private final e<NavigationBarItemView> itemPool;
    private ColorStateList itemRippleColor;
    private int itemTextAppearanceActive;
    private boolean itemTextAppearanceActiveBoldEnabled;
    private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private g menu;
    private final View.OnClickListener onClickListener;
    private final SparseArray<View.OnTouchListener> onTouchListeners;
    private NavigationBarPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final u set;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i itemData = ((NavigationBarItemView) view).getItemData();
            if (NavigationBarMenuView.this.menu.performItemAction(itemData, NavigationBarMenuView.this.presenter, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public NavigationBarMenuView(Context context) {
        super(context);
        this.itemPool = new androidx.core.util.g(5);
        this.onTouchListeners = new SparseArray<>(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        this.badgeDrawables = new SparseArray<>(5);
        this.itemPaddingTop = -1;
        this.itemPaddingBottom = -1;
        this.itemActiveIndicatorLabelPadding = -1;
        this.itemActiveIndicatorResizeable = false;
        this.itemTextColorDefault = createDefaultColorStateList(R.attr.textColorSecondary);
        if (isInEditMode()) {
            this.set = null;
        } else {
            androidx.transition.b bVar = new androidx.transition.b();
            this.set = bVar;
            bVar.m5417(0);
            bVar.setDuration(MotionUtils.resolveThemeDuration(getContext(), com.google.android.material.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.material.R.integer.material_motion_duration_long_1)));
            bVar.setInterpolator(MotionUtils.resolveThemeInterpolator(getContext(), com.google.android.material.R.attr.motionEasingStandard, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
            bVar.m5407(new TextScale());
        }
        this.onClickListener = new a();
        f1.m2843(this, 1);
    }

    private Drawable createItemActiveIndicatorDrawable() {
        if (this.itemActiveIndicatorShapeAppearance == null || this.itemActiveIndicatorColor == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.itemActiveIndicatorShapeAppearance);
        materialShapeDrawable.setFillColor(this.itemActiveIndicatorColor);
        return materialShapeDrawable;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView mo2575 = this.itemPool.mo2575();
        return mo2575 == null ? createNavigationBarItemView(getContext()) : mo2575;
    }

    private boolean isValidId(int i5) {
        return i5 != -1;
    }

    private void removeUnusedBadges() {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < this.menu.size(); i5++) {
            hashSet.add(Integer.valueOf(this.menu.getItem(i5).getItemId()));
        }
        for (int i6 = 0; i6 < this.badgeDrawables.size(); i6++) {
            int keyAt = this.badgeDrawables.keyAt(i6);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.badgeDrawables.delete(keyAt);
            }
        }
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (isValidId(id) && (badgeDrawable = this.badgeDrawables.get(id)) != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
    }

    private void validateMenuItemId(int i5) {
        if (isValidId(i5)) {
            return;
        }
        throw new IllegalArgumentException(i5 + " is not a valid view id");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void buildMenuView() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.itemPool.mo2574(navigationBarItemView);
                    navigationBarItemView.clear();
                }
            }
        }
        if (this.menu.size() == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }
        removeUnusedBadges();
        this.buttons = new NavigationBarItemView[this.menu.size()];
        boolean isShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i5 = 0; i5 < this.menu.size(); i5++) {
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(i5).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            NavigationBarItemView newItem = getNewItem();
            this.buttons[i5] = newItem;
            newItem.setIconTintList(this.itemIconTint);
            newItem.setIconSize(this.itemIconSize);
            newItem.setTextColor(this.itemTextColorDefault);
            newItem.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            newItem.setTextAppearanceActive(this.itemTextAppearanceActive);
            newItem.setTextAppearanceActiveBoldEnabled(this.itemTextAppearanceActiveBoldEnabled);
            newItem.setTextColor(this.itemTextColorFromUser);
            int i6 = this.itemPaddingTop;
            if (i6 != -1) {
                newItem.setItemPaddingTop(i6);
            }
            int i7 = this.itemPaddingBottom;
            if (i7 != -1) {
                newItem.setItemPaddingBottom(i7);
            }
            int i8 = this.itemActiveIndicatorLabelPadding;
            if (i8 != -1) {
                newItem.setActiveIndicatorLabelPadding(i8);
            }
            newItem.setActiveIndicatorWidth(this.itemActiveIndicatorWidth);
            newItem.setActiveIndicatorHeight(this.itemActiveIndicatorHeight);
            newItem.setActiveIndicatorMarginHorizontal(this.itemActiveIndicatorMarginHorizontal);
            newItem.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            newItem.setActiveIndicatorResizeable(this.itemActiveIndicatorResizeable);
            newItem.setActiveIndicatorEnabled(this.itemActiveIndicatorEnabled);
            Drawable drawable = this.itemBackground;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.itemBackgroundRes);
            }
            newItem.setItemRippleColor(this.itemRippleColor);
            newItem.setShifting(isShifting);
            newItem.setLabelVisibilityMode(this.labelVisibilityMode);
            i iVar = (i) this.menu.getItem(i5);
            newItem.initialize(iVar, 0);
            newItem.setItemPosition(i5);
            int itemId = iVar.getItemId();
            newItem.setOnTouchListener(this.onTouchListeners.get(itemId));
            newItem.setOnClickListener(this.onClickListener);
            int i9 = this.selectedItemId;
            if (i9 != 0 && itemId == i9) {
                this.selectedItemPosition = i5;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.selectedItemPosition = min;
        this.menu.getItem(min).setChecked(true);
    }

    public ColorStateList createDefaultColorStateList(int i5) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i5, typedValue, true)) {
            return null;
        }
        ColorStateList m8474 = f.a.m8474(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(e.a.f6926, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = m8474.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, ViewGroup.EMPTY_STATE_SET}, new int[]{m8474.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    protected abstract NavigationBarItemView createNavigationBarItemView(Context context);

    public NavigationBarItemView findItemView(int i5) {
        validateMenuItemId(i5);
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr == null) {
            return null;
        }
        for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
            if (navigationBarItemView.getId() == i5) {
                return navigationBarItemView;
            }
        }
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.itemActiveIndicatorLabelPadding;
    }

    public BadgeDrawable getBadge(int i5) {
        return this.badgeDrawables.get(i5);
    }

    SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.badgeDrawables;
    }

    public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.itemActiveIndicatorColor;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.itemActiveIndicatorEnabled;
    }

    public int getItemActiveIndicatorHeight() {
        return this.itemActiveIndicatorHeight;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.itemActiveIndicatorMarginHorizontal;
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.itemActiveIndicatorShapeAppearance;
    }

    public int getItemActiveIndicatorWidth() {
        return this.itemActiveIndicatorWidth;
    }

    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.itemBackground : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    public int getItemIconSize() {
        return this.itemIconSize;
    }

    public int getItemPaddingBottom() {
        return this.itemPaddingBottom;
    }

    public int getItemPaddingTop() {
        return this.itemPaddingTop;
    }

    public ColorStateList getItemRippleColor() {
        return this.itemRippleColor;
    }

    public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    protected g getMenu() {
        return this.menu;
    }

    BadgeDrawable getOrCreateBadge(int i5) {
        validateMenuItemId(i5);
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(i5);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.create(getContext());
            this.badgeDrawables.put(i5, badgeDrawable);
        }
        NavigationBarItemView findItemView = findItemView(i5);
        if (findItemView != null) {
            findItemView.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    protected int getSelectedItemPosition() {
        return this.selectedItemPosition;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initialize(g gVar) {
        this.menu = gVar;
    }

    protected boolean isItemActiveIndicatorResizeable() {
        return this.itemActiveIndicatorResizeable;
    }

    protected boolean isShifting(int i5, int i6) {
        if (i5 == -1) {
            if (i6 > 3) {
                return true;
            }
        } else if (i5 == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        j0.m2620(accessibilityNodeInfo).m2643(j0.b.m2710(1, this.menu.getVisibleItems().size(), false, 1));
    }

    void removeBadge(int i5) {
        validateMenuItemId(i5);
        BadgeDrawable badgeDrawable = this.badgeDrawables.get(i5);
        NavigationBarItemView findItemView = findItemView(i5);
        if (findItemView != null) {
            findItemView.removeBadge();
        }
        if (badgeDrawable != null) {
            this.badgeDrawables.remove(i5);
        }
    }

    void restoreBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            int keyAt = sparseArray.keyAt(i5);
            if (this.badgeDrawables.indexOfKey(keyAt) < 0) {
                this.badgeDrawables.append(keyAt, sparseArray.get(keyAt));
            }
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setBadge(this.badgeDrawables.get(navigationBarItemView.getId()));
            }
        }
    }

    public void setActiveIndicatorLabelPadding(int i5) {
        this.itemActiveIndicatorLabelPadding = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorLabelPadding(i5);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.itemIconTint = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.itemActiveIndicatorColor = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.itemActiveIndicatorEnabled = z5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z5);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i5) {
        this.itemActiveIndicatorHeight = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i5);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i5) {
        this.itemActiveIndicatorMarginHorizontal = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i5);
            }
        }
    }

    protected void setItemActiveIndicatorResizeable(boolean z5) {
        this.itemActiveIndicatorResizeable = z5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z5);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.itemActiveIndicatorShapeAppearance = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(createItemActiveIndicatorDrawable());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i5) {
        this.itemActiveIndicatorWidth = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i5);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i5) {
        this.itemBackgroundRes = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i5);
            }
        }
    }

    public void setItemIconSize(int i5) {
        this.itemIconSize = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i5);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i5, View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.onTouchListeners.remove(i5);
        } else {
            this.onTouchListeners.put(i5, onTouchListener);
        }
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView.getItemData().getItemId() == i5) {
                    navigationBarItemView.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i5) {
        this.itemPaddingBottom = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i5);
            }
        }
    }

    public void setItemPaddingTop(int i5) {
        this.itemPaddingTop = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i5);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.itemRippleColor = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i5) {
        this.itemTextAppearanceActive = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i5);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.itemTextAppearanceActiveBoldEnabled = z5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(z5);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i5) {
        this.itemTextAppearanceInactive = i5;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i5);
                ColorStateList colorStateList = this.itemTextColorFromUser;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.itemTextColorFromUser = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.buttons;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i5) {
        this.labelVisibilityMode = i5;
    }

    public void setPresenter(NavigationBarPresenter navigationBarPresenter) {
        this.presenter = navigationBarPresenter;
    }

    void tryRestoreSelectedItemId(int i5) {
        int size = this.menu.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = this.menu.getItem(i6);
            if (i5 == item.getItemId()) {
                this.selectedItemId = i5;
                this.selectedItemPosition = i6;
                item.setChecked(true);
                return;
            }
        }
    }

    public void updateMenuView() {
        u uVar;
        g gVar = this.menu;
        if (gVar == null || this.buttons == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.buttons.length) {
            buildMenuView();
            return;
        }
        int i5 = this.selectedItemId;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = this.menu.getItem(i6);
            if (item.isChecked()) {
                this.selectedItemId = item.getItemId();
                this.selectedItemPosition = i6;
            }
        }
        if (i5 != this.selectedItemId && (uVar = this.set) != null) {
            s.m5393(this, uVar);
        }
        boolean isShifting = isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for (int i7 = 0; i7 < size; i7++) {
            this.presenter.setUpdateSuspended(true);
            this.buttons[i7].setLabelVisibilityMode(this.labelVisibilityMode);
            this.buttons[i7].setShifting(isShifting);
            this.buttons[i7].initialize((i) this.menu.getItem(i7), 0);
            this.presenter.setUpdateSuspended(false);
        }
    }
}
