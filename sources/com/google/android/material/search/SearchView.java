package com.google.android.material.search;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.u0;
import com.google.android.material.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.b, MaterialBackHandler {
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;
    private final MaterialBackOrchestrator backOrchestrator;
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final d0 searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    public interface TransitionListener {
        void onStateChanged(SearchView searchView, TransitionState transitionState, TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    static class b extends androidx.customview.view.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        String f5975;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f5976;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
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

        public b(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeString(this.f5975);
            parcel.writeInt(this.f5976);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5975 = parcel.readString();
            this.f5976 = parcel.readInt();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING);
    }

    private boolean isNavigationIconDrawerArrowDrawable(Toolbar toolbar) {
        return androidx.core.graphics.drawable.a.m2212(toolbar.getNavigationIcon()) instanceof androidx.appcompat.graphics.drawable.g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (!isAdjustNothingSoftInputMode()) {
            return false;
        }
        clearFocusAndHideKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f5 lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i5, int i6, View view, f5 f5Var) {
        marginLayoutParams.leftMargin = i5 + f5Var.m3074();
        marginLayoutParams.rightMargin = i6 + f5Var.m3075();
        return f5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f5 lambda$setUpStatusBarSpacerInsetListener$5(View view, f5 f5Var) {
        int m3076 = f5Var.m3076();
        setUpStatusBarSpacer(m3076);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(m3076 > 0);
        }
        return f5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ f5 lambda$setUpToolbarInsetListener$4(View view, f5 f5Var, ViewUtils.RelativePadding relativePadding) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        this.toolbar.setPadding((isLayoutRtl ? relativePadding.end : relativePadding.start) + f5Var.m3074(), relativePadding.f12851top, (isLayoutRtl ? relativePadding.start : relativePadding.end) + f5Var.m3075(), relativePadding.bottom);
        return f5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z5) {
        this.statusBarSpacer.setVisibility(z5 ? 0 : 8);
    }

    private void setUpBackButton(boolean z5, boolean z6) {
        if (z6) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6036.lambda$setUpBackButton$1(view);
            }
        });
        if (z5) {
            androidx.appcompat.graphics.drawable.g gVar = new androidx.appcompat.graphics.drawable.g(getContext());
            gVar.m820(MaterialColors.getColor(this, R.attr.colorOnSurface));
            this.toolbar.setNavigationIcon(gVar);
        }
    }

    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6044.lambda$setUpClearButton$2(view);
            }
        });
        this.editText.addTextChangedListener(new a());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f6034.lambda$setUpContentOnTouchListener$3(view, motionEvent);
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i5 = marginLayoutParams.leftMargin;
        final int i6 = marginLayoutParams.rightMargin;
        f1.m2846(this.divider, new u0() { // from class: com.google.android.material.search.n
            @Override // androidx.core.view.u0
            /* renamed from: ʻ */
            public final f5 mo691(View view, f5 f5Var) {
                return SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i5, i6, view, f5Var);
            }
        });
    }

    private void setUpEditText(int i5, String str, String str2) {
        if (i5 != -1) {
            androidx.core.widget.c0.m3570(this.editText, i5);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i5) {
        if (i5 != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i5, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.l
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.lambda$setUpRootView$0(view, motionEvent);
            }
        });
    }

    private void setUpStatusBarSpacer(int i5) {
        if (this.statusBarSpacer.getLayoutParams().height != i5) {
            this.statusBarSpacer.getLayoutParams().height = i5;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        f1.m2846(this.statusBarSpacer, new u0() { // from class: com.google.android.material.search.o
            @Override // androidx.core.view.u0
            /* renamed from: ʻ */
            public final f5 mo691(View view, f5 f5Var) {
                return this.f6040.lambda$setUpStatusBarSpacerInsetListener$5(view, f5Var);
            }
        });
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.search.t
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final f5 onApplyWindowInsets(View view, f5 f5Var, ViewUtils.RelativePadding relativePadding) {
                return this.f6045.lambda$setUpToolbarInsetListener$4(view, f5Var, relativePadding);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z5) {
        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z5);
                } else if (z5) {
                    this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    f1.m2843(childAt, 4);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        f1.m2843(childAt, this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(f.a.m8475(getContext(), defaultNavigationIconResource).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            androidx.core.graphics.drawable.a.m2209(m2213, this.toolbar.getNavigationIconTint().intValue());
        }
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), m2213));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i5 = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable m2212 = androidx.core.graphics.drawable.a.m2212(navigationIconButton.getDrawable());
        if (m2212 instanceof androidx.appcompat.graphics.drawable.g) {
            ((androidx.appcompat.graphics.drawable.g) m2212).m822(i5);
        }
        if (m2212 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) m2212).setProgress(i5);
        }
    }

    public void addHeaderView(View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i5, layoutParams);
        } else {
            super.addView(view, i5, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.m7124();
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new Runnable() { // from class: com.google.android.material.search.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f6035.lambda$clearFocusAndHideKeyboard$9();
            }
        });
    }

    public void clearText() {
        this.editText.setText(BuildConfig.FLAVOR);
    }

    MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.m7126();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    protected int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getHint() {
        return this.editText.getHint();
    }

    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    public Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        androidx.activity.b m7127 = this.searchViewAnimationHelper.m7127();
        if (Build.VERSION.SDK_INT < 34 || this.searchBar == null || m7127 == null) {
            hide();
        } else {
            this.searchViewAnimationHelper.m7125();
        }
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        this.searchViewAnimationHelper.m7123();
    }

    public void inflateMenu(int i5) {
        this.toolbar.inflateMenu(i5);
    }

    boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setText(bVar.f5975);
        setVisible(bVar.f5976 == 0);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        Editable text = getText();
        bVar.f5975 = text == null ? null : text.toString();
        bVar.f5976 = this.rootView.getVisibility();
        return bVar;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new Runnable() { // from class: com.google.android.material.search.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f6041.lambda$requestFocusAndShowKeyboard$8();
            }
        }, TALKBACK_FOCUS_CHANGE_DELAY_MS);
    }

    void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z5) {
        this.animatedNavigationIcon = z5;
    }

    public void setAutoShowKeyboard(boolean z5) {
        this.autoShowKeyboard = z5;
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        setUpBackgroundViewElevationOverlay(f5);
    }

    public void setHint(CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z5) {
        this.animatedMenuItems = z5;
    }

    public void setModalForAccessibility(boolean z5) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z5) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z5);
        if (z5) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setOnMenuItemClickListener(Toolbar.h hVar) {
        this.toolbar.setOnMenuItemClickListener(hVar);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z5) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z5);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z5) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.toolbar.setTouchscreenBlocksFocus(z5);
        }
    }

    void setTransitionState(TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    public void setUseWindowInsetsController(boolean z5) {
        this.useWindowInsetsController = z5;
    }

    public void setVisible(boolean z5) {
        boolean z6 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z5 ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z5 ? TransitionState.SHOWN : TransitionState.HIDDEN, z6 != z5);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.m7128(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.search.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6042.lambda$setupWithSearchBar$7(view);
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: com.google.android.material.search.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f6043.show();
                        }
                    });
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.m7120();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(androidx.activity.b bVar) {
        if (isHiddenOrHiding() || this.searchBar == null) {
            return;
        }
        this.searchViewAnimationHelper.m7121(bVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(androidx.activity.b bVar) {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.m7122(bVar);
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    private void setTransitionState(TransitionState transitionState, boolean z5) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z5) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private void setUpBackgroundViewElevationOverlay(float f5) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f5));
    }

    public void setHint(int i5) {
        this.editText.setHint(i5);
    }

    public void setText(int i5) {
        this.editText.setText(i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchView, i5, i6, new int[0]);
        this.backgroundColor = obtainStyledAttributes.getColor(R.styleable.SearchView_backgroundTint, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.SearchView_android_textAppearance, -1);
        String string = obtainStyledAttributes.getString(R.styleable.SearchView_android_text);
        String string2 = obtainStyledAttributes.getString(R.styleable.SearchView_android_hint);
        String string3 = obtainStyledAttributes.getString(R.styleable.SearchView_searchPrefixText);
        boolean z5 = obtainStyledAttributes.getBoolean(R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = obtainStyledAttributes.getBoolean(R.styleable.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = obtainStyledAttributes.getBoolean(R.styleable.SearchView_animateMenuItems, true);
        boolean z6 = obtainStyledAttributes.getBoolean(R.styleable.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = obtainStyledAttributes.getBoolean(R.styleable.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = obtainStyledAttributes.getBoolean(R.styleable.SearchView_backHandlingEnabled, true);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(R.id.open_search_view_scrim);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.backgroundView = findViewById(R.id.open_search_view_background);
        this.statusBarSpacer = findViewById(R.id.open_search_view_status_bar_spacer);
        this.headerContainer = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.toolbarContainer = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        this.toolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.dummyToolbar = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.searchPrefix = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.clearButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.divider = findViewById(R.id.open_search_view_divider);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.searchViewAnimationHelper = new d0(this);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z5, z6);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }
}
