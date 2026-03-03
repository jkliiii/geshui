package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.d3;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;
    private final NavigationBarMenuView menuView;
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    static class b extends androidx.customview.view.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        Bundle f5901;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b[] newArray(int i5) {
                return new b[i5];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m6974(Parcel parcel, ClassLoader classLoader) {
            this.f5901 = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeBundle(this.f5901);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m6974(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        int[] iArr = R.styleable.NavigationBarView;
        int i7 = R.styleable.NavigationBarView_itemTextAppearanceInactive;
        int i8 = R.styleable.NavigationBarView_itemTextAppearanceActive;
        d3 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i5, i6, i7, i8);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        NavigationBarMenuView createNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = createNavigationBarMenuView;
        navigationBarPresenter.setMenuView(createNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        createNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        int i9 = R.styleable.NavigationBarView_itemIconTint;
        if (obtainTintedStyledAttributes.m1200(i9)) {
            createNavigationBarMenuView.setIconTintList(obtainTintedStyledAttributes.m1184(i9));
        } else {
            createNavigationBarMenuView.setIconTintList(createNavigationBarMenuView.createDefaultColorStateList(android.R.attr.textColorSecondary));
        }
        setItemIconSize(obtainTintedStyledAttributes.m1187(R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (obtainTintedStyledAttributes.m1200(i7)) {
            setItemTextAppearanceInactive(obtainTintedStyledAttributes.m1195(i7, 0));
        }
        if (obtainTintedStyledAttributes.m1200(i8)) {
            setItemTextAppearanceActive(obtainTintedStyledAttributes.m1195(i8, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(obtainTintedStyledAttributes.m1182(R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        int i10 = R.styleable.NavigationBarView_itemTextColor;
        if (obtainTintedStyledAttributes.m1200(i10)) {
            setItemTextColor(obtainTintedStyledAttributes.m1184(i10));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            f1.m2836(this, createMaterialShapeDrawableBackground(context2, ShapeAppearanceModel.builder(context2, attributeSet, i5, i6).build()));
        }
        int i11 = R.styleable.NavigationBarView_itemPaddingTop;
        if (obtainTintedStyledAttributes.m1200(i11)) {
            setItemPaddingTop(obtainTintedStyledAttributes.m1187(i11, 0));
        }
        int i12 = R.styleable.NavigationBarView_itemPaddingBottom;
        if (obtainTintedStyledAttributes.m1200(i12)) {
            setItemPaddingBottom(obtainTintedStyledAttributes.m1187(i12, 0));
        }
        int i13 = R.styleable.NavigationBarView_activeIndicatorLabelPadding;
        if (obtainTintedStyledAttributes.m1200(i13)) {
            setActiveIndicatorLabelPadding(obtainTintedStyledAttributes.m1187(i13, 0));
        }
        if (obtainTintedStyledAttributes.m1200(R.styleable.NavigationBarView_elevation)) {
            setElevation(obtainTintedStyledAttributes.m1187(r12, 0));
        }
        androidx.core.graphics.drawable.a.m2210(getBackground().mutate(), MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(obtainTintedStyledAttributes.m1193(R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int m1195 = obtainTintedStyledAttributes.m1195(R.styleable.NavigationBarView_itemBackground, 0);
        if (m1195 != 0) {
            createNavigationBarMenuView.setItemBackgroundRes(m1195);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.NavigationBarView_itemRippleColor));
        }
        int m11952 = obtainTintedStyledAttributes.m1195(R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (m11952 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m11952, R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, obtainStyledAttributes, R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, obtainStyledAttributes.getResourceId(R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            obtainStyledAttributes.recycle();
        }
        int i14 = R.styleable.NavigationBarView_menu;
        if (obtainTintedStyledAttributes.m1200(i14)) {
            inflateMenu(obtainTintedStyledAttributes.m1195(i14, 0));
        }
        obtainTintedStyledAttributes.m1201();
        addView(createNavigationBarMenuView);
        navigationBarMenu.setCallback(new a());
    }

    private MaterialShapeDrawable createMaterialShapeDrawableBackground(Context context, ShapeAppearanceModel shapeAppearanceModel) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        return materialShapeDrawable;
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new g(getContext());
        }
        return this.menuInflater;
    }

    protected abstract NavigationBarMenuView createNavigationBarMenuView(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    public BadgeDrawable getBadge(int i5) {
        return this.menuView.getBadge(i5);
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.menu;
    }

    public n getMenuView() {
        return this.menuView;
    }

    public BadgeDrawable getOrCreateBadge(int i5) {
        return this.menuView.getOrCreateBadge(i5);
    }

    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i5) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i5, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.menu.restorePresenterStates(bVar.f5901);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f5901 = bundle;
        this.menu.savePresenterStates(bundle);
        return bVar;
    }

    public void removeBadge(int i5) {
        this.menuView.removeBadge(i5);
    }

    public void setActiveIndicatorLabelPadding(int i5) {
        this.menuView.setActiveIndicatorLabelPadding(i5);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f5);
        }
        MaterialShapeUtils.setElevation(this, f5);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z5) {
        this.menuView.setItemActiveIndicatorEnabled(z5);
    }

    public void setItemActiveIndicatorHeight(int i5) {
        this.menuView.setItemActiveIndicatorHeight(i5);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i5) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i5);
    }

    public void setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(int i5) {
        this.menuView.setItemActiveIndicatorWidth(i5);
    }

    public void setItemBackground(Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i5) {
        this.menuView.setItemBackgroundRes(i5);
    }

    public void setItemIconSize(int i5) {
        this.menuView.setItemIconSize(i5);
    }

    public void setItemIconSizeRes(int i5) {
        setItemIconSize(getResources().getDimensionPixelSize(i5));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i5, View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i5, onTouchListener);
    }

    public void setItemPaddingBottom(int i5) {
        this.menuView.setItemPaddingBottom(i5);
    }

    public void setItemPaddingTop(int i5) {
        this.menuView.setItemPaddingTop(i5);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i5) {
        this.menuView.setItemTextAppearanceActive(i5);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z5);
    }

    public void setItemTextAppearanceInactive(int i5) {
        this.menuView.setItemTextAppearanceInactive(i5);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i5) {
        if (this.menuView.getLabelVisibilityMode() != i5) {
            this.menuView.setLabelVisibilityMode(i5);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setSelectedItemId(int i5) {
        MenuItem findItem = this.menu.findItem(i5);
        if (findItem == null || this.menu.performItemAction(findItem, this.presenter, 0)) {
            return;
        }
        findItem.setChecked(true);
    }

    class a implements g.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʻ */
        public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                return (NavigationBarView.this.selectedListener == null || NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
            }
            NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʼ */
        public void mo529(androidx.appcompat.view.menu.g gVar) {
        }
    }
}
