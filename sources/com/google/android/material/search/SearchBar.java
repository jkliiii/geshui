package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.c;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = R.style.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;
    private Integer navigationIconTint;
    private Drawable originalNavigationIconBackground;
    private final i searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final c.b touchExplorationStateChangeListener;

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            androidx.core.view.accessibility.c.m2602(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            androidx.core.view.accessibility.c.m2603(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
        }
    }

    static class b extends androidx.customview.view.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        String f5973;

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
            parcel.writeString(this.f5973);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5973 = parcel.readString();
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private int defaultIfZero(int i5, int i6) {
        return i5 == 0 ? i6 : i5;
    }

    private ColorStateList getCompatBackgroundColorStateList(int i5, int i6) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, new int[0]};
        int layer = MaterialColors.layer(i5, i6);
        return new ColorStateList(iArr, new int[]{layer, layer, i5});
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, int i5, float f5, float f6, int i6) {
        Drawable drawable;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f5);
        if (f6 >= 0.0f) {
            this.backgroundShape.setStroke(f6, i6);
        }
        int color = MaterialColors.getColor(this, R.attr.colorControlHighlight);
        if (Build.VERSION.SDK_INT >= 21) {
            this.backgroundShape.setFillColor(ColorStateList.valueOf(i5));
            ColorStateList valueOf = ColorStateList.valueOf(color);
            MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
            drawable = new RippleDrawable(valueOf, materialShapeDrawable2, materialShapeDrawable2);
        } else {
            this.backgroundShape.setFillColor(getCompatBackgroundColorStateList(i5, color));
            drawable = this.backgroundShape;
        }
        f1.m2836(this, drawable);
    }

    private void initNavigationIcon() {
        setNavigationIcon(getNavigationIcon() == null ? this.defaultNavigationIcon : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void initTextView(int i5, String str, String str2) {
        if (i5 != -1) {
            androidx.core.widget.c0.m3570(this.textView, i5);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            androidx.core.view.u.m3356((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams(), getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z5) {
        setFocusableInTouchMode(z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnLoadAnimation$1() {
        this.searchBarAnimationHelper.m7160(this);
    }

    private void layoutCenterView() {
        View view = this.centerView;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i5 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.centerView.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(this.centerView, measuredWidth2, measuredHeight2, i5, measuredHeight2 + measuredHeight);
    }

    private void layoutChild(View view, int i5, int i6, int i7, int i8) {
        if (f1.m2834(this) == 1) {
            view.layout(getMeasuredWidth() - i7, i6, getMeasuredWidth() - i5, i8);
        } else {
            view.layout(i5, i6, i7, i8);
        }
    }

    private Drawable maybeTintNavigationIcon(Drawable drawable) {
        int color;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        Integer num = this.navigationIconTint;
        if (num != null) {
            color = num.intValue();
        } else {
            color = MaterialColors.getColor(this, drawable == this.defaultNavigationIcon ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
        }
        Drawable m2213 = androidx.core.graphics.drawable.a.m2213(drawable.mutate());
        androidx.core.graphics.drawable.a.m2209(m2213, color);
        return m2213;
    }

    private void measureCenterView(int i5, int i6) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i5, i6);
        }
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void setNavigationIconDecorative(boolean z5) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z5);
        navigationIconButton.setFocusable(!z5);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        navigationIconButton.setBackgroundDrawable(z5 ? null : this.originalNavigationIconBackground);
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void setupTouchExplorationStateChangeListener() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new a());
        }
    }

    private void validateAttributes(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.m7159(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.m7161(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(OnLoadAnimationCallback onLoadAnimationCallback) {
        this.searchBarAnimationHelper.m7162(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i5, layoutParams);
    }

    public void clearText() {
        this.textView.setText(BuildConfig.FLAVOR);
    }

    @CanIgnoreReturnValue
    public boolean collapse(View view) {
        return collapse(view, null);
    }

    @CanIgnoreReturnValue
    public boolean expand(View view) {
        return expand(view, null);
    }

    public View getCenterView() {
        return this.centerView;
    }

    float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : f1.m2904(this);
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    protected int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    protected int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.textView.getHint();
    }

    int getMenuResId() {
        return this.menuResId;
    }

    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    public CharSequence getText() {
        return this.textView.getText();
    }

    public TextView getTextView() {
        return this.textView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i5) {
        Menu menu = getMenu();
        boolean z5 = menu instanceof androidx.appcompat.view.menu.g;
        if (z5) {
            ((androidx.appcompat.view.menu.g) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i5);
        this.menuResId = i5;
        if (z5) {
            ((androidx.appcompat.view.menu.g) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.m7164();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.m7165();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.m7166();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        layoutCenterView();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        measureCenterView(i5, i6);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setText(bVar.f5973);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        CharSequence text = getText();
        bVar.f5973 = text == null ? null : text.toString();
        return bVar;
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.m7154(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.m7153(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.m7156(onLoadAnimationCallback);
    }

    public void setCenterView(View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z5) {
        this.defaultScrollFlagsEnabled = z5;
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f5);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z5) {
        this.searchBarAnimationHelper.m7155(z5);
    }

    public void setStrokeColor(int i5) {
        if (getStrokeColor() != i5) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i5));
        }
    }

    public void setStrokeWidth(float f5) {
        if (getStrokeWidth() != f5) {
            this.backgroundShape.setStrokeWidth(f5);
        }
    }

    public void setText(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f5979.lambda$startOnLoadAnimation$1();
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.m7158(this);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
            } else {
                appBarLayout.setTargetElevation(0.0f);
            }
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean onDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return onDependentViewChanged;
        }

        @Override // com.google.android.material.appbar.l
        protected boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    @CanIgnoreReturnValue
    public boolean collapse(View view, AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    @CanIgnoreReturnValue
    public boolean expand(View view, AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    public void setHint(int i5) {
        this.textView.setHint(i5);
    }

    public void setText(int i5) {
        this.textView.setText(i5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.menuResId = -1;
        this.touchExplorationStateChangeListener = new c.b() { // from class: com.google.android.material.search.a
            @Override // androidx.core.view.accessibility.c.b
            public final void onTouchExplorationStateChanged(boolean z5) {
                this.f5977.lambda$new$0(z5);
            }
        };
        Context context2 = getContext();
        validateAttributes(attributeSet);
        this.defaultNavigationIcon = f.a.m8475(context2, getDefaultNavigationIconResource());
        this.searchBarAnimationHelper = new i();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, R.styleable.SearchBar, i5, i6, new int[0]);
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(context2, attributeSet, i5, i6).build();
        int color = obtainStyledAttributes.getColor(R.styleable.SearchBar_backgroundTint, 0);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.SearchBar_elevation, 0.0f);
        this.defaultMarginsEnabled = obtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.defaultScrollFlagsEnabled = obtainStyledAttributes.getBoolean(R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z5 = obtainStyledAttributes.getBoolean(R.styleable.SearchBar_hideNavigationIcon, false);
        this.forceDefaultNavigationOnClickListener = obtainStyledAttributes.getBoolean(R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.tintNavigationIcon = obtainStyledAttributes.getBoolean(R.styleable.SearchBar_tintNavigationIcon, true);
        int i7 = R.styleable.SearchBar_navigationIconTint;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.navigationIconTint = Integer.valueOf(obtainStyledAttributes.getColor(i7, -1));
        }
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.SearchBar_android_textAppearance, -1);
        String string = obtainStyledAttributes.getString(R.styleable.SearchBar_android_text);
        String string2 = obtainStyledAttributes.getString(R.styleable.SearchBar_android_hint);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = obtainStyledAttributes.getColor(R.styleable.SearchBar_strokeColor, 0);
        obtainStyledAttributes.recycle();
        if (!z5) {
            initNavigationIcon();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.layoutInflated = true;
        this.textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        f1.m2840(this, dimension);
        initTextView(resourceId, string, string2);
        initBackground(build, color, dimension, dimension2, color2);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setupTouchExplorationStateChangeListener();
    }

    @CanIgnoreReturnValue
    public boolean collapse(View view, AppBarLayout appBarLayout, boolean z5) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.m7163(this, view, appBarLayout, z5);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(View view, AppBarLayout appBarLayout, boolean z5) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.m7157(this, view, appBarLayout, z5);
        return true;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }
}
