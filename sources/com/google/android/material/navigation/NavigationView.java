package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.d3;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.r;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* loaded from: E:\78999\cookie_5123796.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final DrawerLayout.d backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;
    private int drawerLayoutCornerSize;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = com.google.android.material.R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(MenuItem menuItem);
    }

    class a extends DrawerLayout.g {
        a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        /* renamed from: ʽ */
        public void mo3738(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                Objects.requireNonNull(materialBackOrchestrator);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        materialBackOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.d
        /* renamed from: ʾ */
        public void mo3739(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.backOrchestrator.stopListeningForBackCallbacks();
            }
        }
    }

    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.tmpLocation);
            boolean z5 = true;
            boolean z6 = NavigationView.this.tmpLocation[1] == 0;
            NavigationView.this.presenter.setBehindStatusBar(z6);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z6 && navigationView2.isTopInsetScrimEnabled());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.tmpLocation[0] == 0 || NavigationView.this.tmpLocation[0] + NavigationView.this.getWidth() == 0);
            Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
            if (activity == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
            boolean z7 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
            boolean z8 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView3 = NavigationView.this;
            navigationView3.setDrawBottomInsetForeground(z7 && z8 && navigationView3.isBottomInsetScrimEnabled());
            if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                z5 = false;
            }
            NavigationView.this.setDrawRightInsetForeground(z5);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private ColorStateList createDefaultColorStateList(int i5) {
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
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{m8474.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    private Drawable createDefaultItemBackground(d3 d3Var) {
        return createDefaultItemDrawable(d3Var, MaterialResources.getColorStateList(getContext(), d3Var, com.google.android.material.R.styleable.NavigationView_itemShapeFillColor));
    }

    private Drawable createDefaultItemDrawable(d3 d3Var, ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), d3Var.m1195(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance, 0), d3Var.m1195(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, d3Var.m1187(com.google.android.material.R.styleable.NavigationView_itemShapeInsetStart, 0), d3Var.m1187(com.google.android.material.R.styleable.NavigationView_itemShapeInsetTop, 0), d3Var.m1187(com.google.android.material.R.styleable.NavigationView_itemShapeInsetEnd, 0), d3Var.m1187(com.google.android.material.R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new g(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(d3 d3Var) {
        return d3Var.m1200(com.google.android.material.R.styleable.NavigationView_itemShapeAppearance) || d3Var.m1200(com.google.android.material.R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    private void maybeUpdateCornerSizeForDrawerLayout(int i5, int i6) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.e) && this.drawerLayoutCornerSize > 0 && (getBackground() instanceof MaterialShapeDrawable)) {
            boolean z5 = r.m3298(((DrawerLayout.e) getLayoutParams()).f3194, f1.m2834(this)) == 3;
            MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
            ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
            if (z5) {
                allCornerSizes.setTopLeftCornerSize(0.0f);
                allCornerSizes.setBottomLeftCornerSize(0.0f);
            } else {
                allCornerSizes.setTopRightCornerSize(0.0f);
                allCornerSizes.setBottomRightCornerSize(0.0f);
            }
            ShapeAppearanceModel build = allCornerSizes.build();
            materialShapeDrawable.setShapeAppearanceModel(build);
            this.shapeableDelegate.onShapeAppearanceChanged(this, build);
            this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i5, i6));
            this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
        }
    }

    @CanIgnoreReturnValue
    private Pair<DrawerLayout, DrawerLayout.e> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.e)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.e) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: com.google.android.material.navigation.b
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                this.f5906.lambda$dispatchDraw$0(canvas2);
            }
        });
    }

    MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i5) {
        return this.presenter.getHeaderView(i5);
    }

    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    public Menu getMenu() {
        return this.menu;
    }

    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<DrawerLayout, DrawerLayout.e> requireDrawerLayoutParent = requireDrawerLayoutParent();
        DrawerLayout drawerLayout = (DrawerLayout) requireDrawerLayoutParent.first;
        androidx.activity.b onHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (onHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.m3705(this);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(onHandleBackInvoked, ((DrawerLayout.e) requireDrawerLayoutParent.second).f3194, DrawerLayoutUtils.getScrimCloseAnimatorListener(drawerLayout, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(drawerLayout));
    }

    public View inflateHeaderView(int i5) {
        return this.presenter.inflateHeaderView(i5);
    }

    public void inflateMenu(int i5) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i5, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.m3716(this.backDrawerListener);
            drawerLayout.m3697(this.backDrawerListener);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).m3716(this.backDrawerListener);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onInsetsChanged(f5 f5Var) {
        this.presenter.dispatchApplyWindowInsets(f5Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        if (mode == Integer.MIN_VALUE) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i5, i6);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        maybeUpdateCornerSizeForDrawerLayout(i5, i6);
    }

    public void removeHeaderView(View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z5) {
        this.bottomInsetScrimEnabled = z5;
    }

    public void setCheckedItem(int i5) {
        MenuItem findItem = this.menu.findItem(i5);
        if (findItem != null) {
            this.presenter.setCheckedItem((i) findItem);
        }
    }

    public void setDividerInsetEnd(int i5) {
        this.presenter.setDividerInsetEnd(i5);
    }

    public void setDividerInsetStart(int i5) {
        this.presenter.setDividerInsetStart(i5);
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f5);
        }
        MaterialShapeUtils.setElevation(this, f5);
    }

    public void setForceCompatClippingEnabled(boolean z5) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z5);
    }

    public void setItemBackground(Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i5) {
        setItemBackground(androidx.core.content.a.m1993(getContext(), i5));
    }

    public void setItemHorizontalPadding(int i5) {
        this.presenter.setItemHorizontalPadding(i5);
    }

    public void setItemHorizontalPaddingResource(int i5) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i5));
    }

    public void setItemIconPadding(int i5) {
        this.presenter.setItemIconPadding(i5);
    }

    public void setItemIconPaddingResource(int i5) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i5));
    }

    public void setItemIconSize(int i5) {
        this.presenter.setItemIconSize(i5);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i5) {
        this.presenter.setItemMaxLines(i5);
    }

    public void setItemTextAppearance(int i5) {
        this.presenter.setItemTextAppearance(i5);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z5);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(int i5) {
        this.presenter.setItemVerticalPadding(i5);
    }

    public void setItemVerticalPaddingResource(int i5) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i5));
    }

    public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i5) {
        super.setOverScrollMode(i5);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i5);
        }
    }

    public void setSubheaderInsetEnd(int i5) {
        this.presenter.setSubheaderInsetEnd(i5);
    }

    public void setSubheaderInsetStart(int i5) {
        this.presenter.setSubheaderInsetStart(i5);
    }

    public void setTopInsetScrimEnabled(boolean z5) {
        this.topInsetScrimEnabled = z5;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.activity.b bVar) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(bVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.activity.b bVar) {
        this.sideContainerBackHelper.updateBackProgress(bVar, ((DrawerLayout.e) requireDrawerLayoutParent().second).f3194);
    }

    public static class SavedState extends androidx.customview.view.a {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Bundle menuState;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i5) {
                return new SavedState[i5];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i5) {
        ColorStateList createDefaultColorStateList;
        int i6;
        int i7;
        int i8 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i8), attributeSet, i5);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new a();
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        d3 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.NavigationView, i5, i8, new int[0]);
        int i9 = com.google.android.material.R.styleable.NavigationView_android_background;
        if (obtainTintedStyledAttributes.m1200(i9)) {
            f1.m2836(this, obtainTintedStyledAttributes.m1188(i9));
        }
        this.drawerLayoutCornerSize = obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            ShapeAppearanceModel build = ShapeAppearanceModel.builder(context2, attributeSet, i5, i8).build();
            Drawable background = getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(build);
            if (background instanceof ColorDrawable) {
                materialShapeDrawable.setFillColor(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            f1.m2836(this, materialShapeDrawable);
        }
        if (obtainTintedStyledAttributes.m1200(com.google.android.material.R.styleable.NavigationView_elevation)) {
            setElevation(obtainTintedStyledAttributes.m1187(r2, 0));
        }
        setFitsSystemWindows(obtainTintedStyledAttributes.m1182(com.google.android.material.R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_android_maxWidth, 0);
        int i10 = com.google.android.material.R.styleable.NavigationView_subheaderColor;
        ColorStateList m1184 = obtainTintedStyledAttributes.m1200(i10) ? obtainTintedStyledAttributes.m1184(i10) : null;
        int i11 = com.google.android.material.R.styleable.NavigationView_subheaderTextAppearance;
        int m1195 = obtainTintedStyledAttributes.m1200(i11) ? obtainTintedStyledAttributes.m1195(i11, 0) : 0;
        if (m1195 == 0 && m1184 == null) {
            m1184 = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i12 = com.google.android.material.R.styleable.NavigationView_itemIconTint;
        if (obtainTintedStyledAttributes.m1200(i12)) {
            createDefaultColorStateList = obtainTintedStyledAttributes.m1184(i12);
        } else {
            createDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int i13 = com.google.android.material.R.styleable.NavigationView_itemTextAppearance;
        int m11952 = obtainTintedStyledAttributes.m1200(i13) ? obtainTintedStyledAttributes.m1195(i13, 0) : 0;
        boolean m1182 = obtainTintedStyledAttributes.m1182(com.google.android.material.R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        int i14 = com.google.android.material.R.styleable.NavigationView_itemIconSize;
        if (obtainTintedStyledAttributes.m1200(i14)) {
            setItemIconSize(obtainTintedStyledAttributes.m1187(i14, 0));
        }
        int i15 = com.google.android.material.R.styleable.NavigationView_itemTextColor;
        ColorStateList m11842 = obtainTintedStyledAttributes.m1200(i15) ? obtainTintedStyledAttributes.m1184(i15) : null;
        if (m11952 == 0 && m11842 == null) {
            m11842 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable m1188 = obtainTintedStyledAttributes.m1188(com.google.android.material.R.styleable.NavigationView_itemBackground);
        if (m1188 == null && hasShapeAppearance(obtainTintedStyledAttributes)) {
            m1188 = createDefaultItemBackground(obtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, com.google.android.material.R.styleable.NavigationView_itemRippleColor);
            if (Build.VERSION.SDK_INT >= 21 && colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(obtainTintedStyledAttributes, null)));
            }
        }
        int i16 = com.google.android.material.R.styleable.NavigationView_itemHorizontalPadding;
        if (obtainTintedStyledAttributes.m1200(i16)) {
            i6 = 0;
            setItemHorizontalPadding(obtainTintedStyledAttributes.m1187(i16, 0));
        } else {
            i6 = 0;
        }
        int i17 = com.google.android.material.R.styleable.NavigationView_itemVerticalPadding;
        if (obtainTintedStyledAttributes.m1200(i17)) {
            setItemVerticalPadding(obtainTintedStyledAttributes.m1187(i17, i6));
        }
        setDividerInsetStart(obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_dividerInsetStart, i6));
        setDividerInsetEnd(obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_dividerInsetEnd, i6));
        setSubheaderInsetStart(obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_subheaderInsetStart, i6));
        setSubheaderInsetEnd(obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_subheaderInsetEnd, i6));
        setTopInsetScrimEnabled(obtainTintedStyledAttributes.m1182(com.google.android.material.R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(obtainTintedStyledAttributes.m1182(com.google.android.material.R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        int m1187 = obtainTintedStyledAttributes.m1187(com.google.android.material.R.styleable.NavigationView_itemIconPadding, i6);
        setItemMaxLines(obtainTintedStyledAttributes.m1192(com.google.android.material.R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new b());
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (m1195 != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(m1195);
        }
        navigationMenuPresenter.setSubheaderColor(m1184);
        navigationMenuPresenter.setItemIconTintList(createDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (m11952 != 0) {
            navigationMenuPresenter.setItemTextAppearance(m11952);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(m1182);
        navigationMenuPresenter.setItemTextColor(m11842);
        navigationMenuPresenter.setItemBackground(m1188);
        navigationMenuPresenter.setItemIconPadding(m1187);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        int i18 = com.google.android.material.R.styleable.NavigationView_menu;
        if (obtainTintedStyledAttributes.m1200(i18)) {
            i7 = 0;
            inflateMenu(obtainTintedStyledAttributes.m1195(i18, 0));
        } else {
            i7 = 0;
        }
        int i19 = com.google.android.material.R.styleable.NavigationView_headerLayout;
        if (obtainTintedStyledAttributes.m1200(i19)) {
            inflateHeaderView(obtainTintedStyledAttributes.m1195(i19, i7));
        }
        obtainTintedStyledAttributes.m1201();
        setupInsetScrimsListener();
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.menu.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.presenter.setCheckedItem((i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    class b implements g.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʻ */
        public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
            return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʼ */
        public void mo529(androidx.appcompat.view.menu.g gVar) {
        }
    }
}
