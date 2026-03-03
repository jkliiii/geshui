package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.h2;
import androidx.core.view.f1;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialAutoCompleteTextView extends androidx.appcompat.widget.d {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final AccessibilityManager accessibilityManager;
    private ColorStateList dropDownBackgroundTint;
    private final h2 modalListPopup;
    private final float popupElevation;
    private final int simpleItemLayout;
    private int simpleItemSelectedColor;
    private ColorStateList simpleItemSelectedRippleColor;
    private final Rect tempRect;

    class a implements AdapterView.OnItemClickListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.this.updateText(i5 < 0 ? materialAutoCompleteTextView.modalListPopup.m1317() : materialAutoCompleteTextView.getAdapter().getItem(i5));
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i5 < 0) {
                    view = MaterialAutoCompleteTextView.this.modalListPopup.m1320();
                    i5 = MaterialAutoCompleteTextView.this.modalListPopup.m1319();
                    j5 = MaterialAutoCompleteTextView.this.modalListPopup.m1318();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.modalListPopup.mo923(), view, i5, j5);
            }
            MaterialAutoCompleteTextView.this.modalListPopup.dismiss();
        }
    }

    private class b<T> extends ArrayAdapter<String> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private ColorStateList f6161;

        /* renamed from: ʿ, reason: contains not printable characters */
        private ColorStateList f6162;

        b(Context context, int i5, String[] strArr) {
            super(context, i5, strArr);
            m7278();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private ColorStateList m7273() {
            if (!m7275() || !m7276() || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            int[] iArr = {R.attr.state_hovered, -16842919};
            int[] iArr2 = {R.attr.state_selected, -16842919};
            return new ColorStateList(new int[][]{iArr2, iArr, new int[0]}, new int[]{MaterialColors.layer(MaterialAutoCompleteTextView.this.simpleItemSelectedColor, MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr2, 0)), MaterialColors.layer(MaterialAutoCompleteTextView.this.simpleItemSelectedColor, MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0)), MaterialAutoCompleteTextView.this.simpleItemSelectedColor});
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private Drawable m7274() {
            if (!m7275() || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ColorDrawable colorDrawable = new ColorDrawable(MaterialAutoCompleteTextView.this.simpleItemSelectedColor);
            if (this.f6162 == null) {
                return colorDrawable;
            }
            androidx.core.graphics.drawable.a.m2210(colorDrawable, this.f6161);
            return new RippleDrawable(this.f6162, colorDrawable, null);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean m7275() {
            return MaterialAutoCompleteTextView.this.simpleItemSelectedColor != 0;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean m7276() {
            return MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor != null;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private ColorStateList m7277() {
            if (!m7276()) {
                return null;
            }
            int[] iArr = {R.attr.state_pressed};
            return new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{MaterialAutoCompleteTextView.this.simpleItemSelectedRippleColor.getColorForState(iArr, 0), 0});
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i5, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                f1.m2836(textView, MaterialAutoCompleteTextView.this.getText().toString().contentEquals(textView.getText()) ? m7274() : null);
            }
            return view2;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        void m7278() {
            this.f6162 = m7277();
            this.f6161 = m7273();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    private TextInputLayout findTextInputLayoutAncestor() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private boolean isTouchExplorationEnabled() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    private int measureContentWidth() {
        ListAdapter adapter = getAdapter();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        int i5 = 0;
        if (adapter == null || findTextInputLayoutAncestor == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.modalListPopup.m1319()) + 15);
        View view = null;
        int i6 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(max, view, findTextInputLayoutAncestor);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        Drawable m1299 = this.modalListPopup.m1299();
        if (m1299 != null) {
            m1299.getPadding(this.tempRect);
            Rect rect = this.tempRect;
            i6 += rect.left + rect.right;
        }
        return i6 + findTextInputLayoutAncestor.getEndIconView().getMeasuredWidth();
    }

    private void onInputTypeChanged() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null) {
            findTextInputLayoutAncestor.updateEditTextBoxBackgroundIfNeeded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ListAdapter & Filterable> void updateText(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (isTouchExplorationEnabled()) {
            this.modalListPopup.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.dropDownBackgroundTint;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        return (findTextInputLayoutAncestor == null || !findTextInputLayoutAncestor.isProvidingHint()) ? super.getHint() : findTextInputLayoutAncestor.getHint();
    }

    public float getPopupElevation() {
        return this.popupElevation;
    }

    public int getSimpleItemSelectedColor() {
        return this.simpleItemSelectedColor;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.simpleItemSelectedRippleColor;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout findTextInputLayoutAncestor = findTextInputLayoutAncestor();
        if (findTextInputLayoutAncestor != null && findTextInputLayoutAncestor.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint(BuildConfig.FLAVOR);
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.modalListPopup.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), measureContentWidth()), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z5) {
        if (isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z5);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.modalListPopup.mo1310(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        h2 h2Var = this.modalListPopup;
        if (h2Var != null) {
            h2Var.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i5) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i5));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.dropDownBackgroundTint = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).setFillColor(this.dropDownBackgroundTint);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.modalListPopup.m1305(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i5) {
        super.setRawInputType(i5);
        onInputTypeChanged();
    }

    public void setSimpleItemSelectedColor(int i5) {
        this.simpleItemSelectedColor = i5;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).m7278();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.simpleItemSelectedRippleColor = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).m7278();
        }
    }

    public void setSimpleItems(int i5) {
        setSimpleItems(getResources().getStringArray(i5));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (isTouchExplorationEnabled()) {
            this.modalListPopup.mo919();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new b(getContext(), this.simpleItemLayout, strArr));
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i5) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, 0), attributeSet, i5);
        this.tempRect = new Rect();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialAutoCompleteTextView, i5, com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i6 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (obtainStyledAttributes.hasValue(i6) && obtainStyledAttributes.getInt(i6, 0) == 0) {
            setKeyListener(null);
        }
        this.simpleItemLayout = obtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.popupElevation = obtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i7 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if (obtainStyledAttributes.hasValue(i7)) {
            this.dropDownBackgroundTint = ColorStateList.valueOf(obtainStyledAttributes.getColor(i7, 0));
        }
        this.simpleItemSelectedColor = obtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.simpleItemSelectedRippleColor = MaterialResources.getColorStateList(context2, obtainStyledAttributes, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.accessibilityManager = (AccessibilityManager) context2.getSystemService("accessibility");
        h2 h2Var = new h2(context2);
        this.modalListPopup = h2Var;
        h2Var.m1300(true);
        h2Var.m1293(this);
        h2Var.m1311(2);
        h2Var.mo1310(getAdapter());
        h2Var.m1301(new a());
        int i8 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems;
        if (obtainStyledAttributes.hasValue(i8)) {
            setSimpleItems(obtainStyledAttributes.getResourceId(i8, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
