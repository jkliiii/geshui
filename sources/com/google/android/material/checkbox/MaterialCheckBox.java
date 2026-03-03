package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.d3;
import androidx.core.widget.i;
import androidx.vectordrawable.graphics.drawable.h;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int[][] CHECKBOX_STATES;
    private static final int[] ERROR_STATE_SET;

    @SuppressLint({"DiscouragedApi"})
    private static final int FRAMEWORK_BUTTON_DRAWABLE_RES_ID;
    public static final int STATE_CHECKED = 1;
    public static final int STATE_INDETERMINATE = 2;
    public static final int STATE_UNCHECKED = 0;
    private boolean broadcasting;
    private Drawable buttonDrawable;
    private Drawable buttonIconDrawable;
    ColorStateList buttonIconTintList;
    private PorterDuff.Mode buttonIconTintMode;
    ColorStateList buttonTintList;
    private boolean centerIfNoTextEnabled;
    private int checkedState;
    private int[] currentStateChecked;
    private CharSequence customStateDescription;
    private CharSequence errorAccessibilityLabel;
    private boolean errorShown;
    private ColorStateList materialThemeColorsTintList;
    private CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
    private final LinkedHashSet<OnCheckedStateChangedListener> onCheckedStateChangedListeners;
    private final LinkedHashSet<OnErrorChangedListener> onErrorChangedListeners;
    private final h transitionToUnchecked;
    private final androidx.vectordrawable.graphics.drawable.b transitionToUncheckedCallback;
    private boolean useMaterialThemeColors;
    private boolean usingMaterialButtonDrawable;
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[] INDETERMINATE_STATE_SET = {R.attr.state_indeterminate};

    @Retention(RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    public interface OnCheckedStateChangedListener {
        void onCheckedStateChangedListener(MaterialCheckBox materialCheckBox, int i5);
    }

    public interface OnErrorChangedListener {
        void onErrorChanged(MaterialCheckBox materialCheckBox, boolean z5);
    }

    class a extends androidx.vectordrawable.graphics.drawable.b {
        a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        /* renamed from: ʼ */
        public void mo5425(Drawable drawable) {
            super.mo5425(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.buttonTintList;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.m2210(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.b
        /* renamed from: ʽ */
        public void mo5426(Drawable drawable) {
            super.mo5426(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.buttonTintList;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.m2209(drawable, colorStateList.getColorForState(materialCheckBox.currentStateChecked, MaterialCheckBox.this.buttonTintList.getDefaultColor()));
            }
        }
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f5457;

        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b[] newArray(int i5) {
                return new b[i5];
            }
        }

        /* synthetic */ b(Parcel parcel, a aVar) {
            this(parcel);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private String m6421() {
            int i5 = this.f5457;
            return i5 != 1 ? i5 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + m6421() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeValue(Integer.valueOf(this.f5457));
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f5457 = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i5 = R.attr.state_error;
        ERROR_STATE_SET = new int[]{i5};
        CHECKBOX_STATES = new int[][]{new int[]{android.R.attr.state_enabled, i5}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        FRAMEWORK_BUTTON_DRAWABLE_RES_ID = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private String getButtonStateDescription() {
        int i5 = this.checkedState;
        return i5 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i5 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = CHECKBOX_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, R.attr.colorError);
            int color3 = MaterialColors.getColor(this, R.attr.colorSurface);
            int color4 = MaterialColors.getColor(this, R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color3, color2, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[2] = MaterialColors.layer(color3, color4, 0.54f);
            iArr2[3] = MaterialColors.layer(color3, color4, 0.38f);
            iArr2[4] = MaterialColors.layer(color3, color4, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.buttonTintList;
        return colorStateList != null ? colorStateList : (Build.VERSION.SDK_INT < 21 || super.getButtonTintList() == null) ? getSupportButtonTintList() : super.getButtonTintList();
    }

    private boolean isButtonDrawableLegacy(d3 d3Var) {
        int m1195 = d3Var.m1195(R.styleable.MaterialCheckBox_android_button, 0);
        int m11952 = d3Var.m1195(R.styleable.MaterialCheckBox_buttonCompat, 0);
        return Build.VERSION.SDK_INT < 21 ? m1195 == R.drawable.abc_btn_check_material && m11952 == R.drawable.abc_btn_check_material_anim : m1195 == FRAMEWORK_BUTTON_DRAWABLE_RES_ID && m11952 == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.buttonIconDrawable.jumpToCurrentState();
    }

    private void refreshButtonDrawable() {
        this.buttonDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonDrawable, this.buttonTintList, i.m3616(this));
        this.buttonIconDrawable = DrawableUtils.createTintableMutatedDrawableIfNeeded(this.buttonIconDrawable, this.buttonIconTintList, this.buttonIconTintMode);
        setUpDefaultButtonDrawableAnimationIfNeeded();
        updateButtonTints();
        super.setButtonDrawable(DrawableUtils.compositeTwoLayeredDrawable(this.buttonDrawable, this.buttonIconDrawable));
        refreshDrawableState();
    }

    private void setDefaultStateDescription() {
        if (Build.VERSION.SDK_INT < 30 || this.customStateDescription != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void setUpDefaultButtonDrawableAnimationIfNeeded() {
        h hVar;
        if (this.usingMaterialButtonDrawable) {
            h hVar2 = this.transitionToUnchecked;
            if (hVar2 != null) {
                hVar2.m5440(this.transitionToUncheckedCallback);
                this.transitionToUnchecked.m5439(this.transitionToUncheckedCallback);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable = this.buttonDrawable;
                if (!(drawable instanceof AnimatedStateListDrawable) || (hVar = this.transitionToUnchecked) == null) {
                    return;
                }
                int i5 = R.id.checked;
                int i6 = R.id.unchecked;
                ((AnimatedStateListDrawable) drawable).addTransition(i5, i6, hVar, false);
                ((AnimatedStateListDrawable) this.buttonDrawable).addTransition(R.id.indeterminate, i6, this.transitionToUnchecked, false);
            }
        }
    }

    private void updateButtonTints() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.buttonDrawable;
        if (drawable != null && (colorStateList2 = this.buttonTintList) != null) {
            androidx.core.graphics.drawable.a.m2210(drawable, colorStateList2);
        }
        Drawable drawable2 = this.buttonIconDrawable;
        if (drawable2 == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.m2210(drawable2, colorStateList);
    }

    private void updateIconTintIfNeeded() {
        Drawable drawable;
        ColorStateList colorStateList;
        if (Build.VERSION.SDK_INT >= 21 || (drawable = this.buttonIconDrawable) == null || (colorStateList = this.buttonIconTintList) == null) {
            return;
        }
        drawable.setColorFilter(DrawableUtils.updateTintFilter(drawable, colorStateList, this.buttonIconTintMode));
    }

    public void addOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.add(onCheckedStateChangedListener);
    }

    public void addOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.add(onErrorChangedListener);
    }

    public void clearOnCheckedStateChangedListeners() {
        this.onCheckedStateChangedListeners.clear();
    }

    public void clearOnErrorChangedListeners() {
        this.onErrorChangedListeners.clear();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.buttonDrawable;
    }

    public Drawable getButtonIconDrawable() {
        return this.buttonIconDrawable;
    }

    public ColorStateList getButtonIconTintList() {
        return this.buttonIconTintList;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.buttonIconTintMode;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.buttonTintList;
    }

    public int getCheckedState() {
        return this.checkedState;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.errorAccessibilityLabel;
    }

    public boolean isCenterIfNoTextEnabled() {
        return this.centerIfNoTextEnabled;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.checkedState == 1;
    }

    public boolean isErrorShown() {
        return this.errorShown;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && this.buttonTintList == null && this.buttonIconTintList == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, INDETERMINATE_STATE_SET);
        }
        if (isErrorShown()) {
            View.mergeDrawableStates(onCreateDrawableState, ERROR_STATE_SET);
        }
        this.currentStateChecked = DrawableUtils.getCheckedState(onCreateDrawableState);
        updateIconTintIfNeeded();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable m3614;
        if (!this.centerIfNoTextEnabled || !TextUtils.isEmpty(getText()) || (m3614 = i.m3614(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - m3614.getIntrinsicWidth()) / 2) * (ViewUtils.isLayoutRtl(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = m3614.getBounds();
            androidx.core.graphics.drawable.a.m2207(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && isErrorShown()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.errorAccessibilityLabel));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f5457);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5457 = getCheckedState();
        return bVar;
    }

    public void removeOnCheckedStateChangedListener(OnCheckedStateChangedListener onCheckedStateChangedListener) {
        this.onCheckedStateChangedListeners.remove(onCheckedStateChangedListener);
    }

    public void removeOnErrorChangedListener(OnErrorChangedListener onErrorChangedListener) {
        this.onErrorChangedListeners.remove(onErrorChangedListener);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i5) {
        setButtonDrawable(f.a.m8475(getContext(), i5));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.buttonIconDrawable = drawable;
        refreshButtonDrawable();
    }

    public void setButtonIconDrawableResource(int i5) {
        setButtonIconDrawable(f.a.m8475(getContext(), i5));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.buttonIconTintList == colorStateList) {
            return;
        }
        this.buttonIconTintList = colorStateList;
        refreshButtonDrawable();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.buttonIconTintMode == mode) {
            return;
        }
        this.buttonIconTintMode = mode;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.buttonTintList == colorStateList) {
            return;
        }
        this.buttonTintList = colorStateList;
        refreshButtonDrawable();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        refreshButtonDrawable();
    }

    public void setCenterIfNoTextEnabled(boolean z5) {
        this.centerIfNoTextEnabled = z5;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        setCheckedState(z5 ? 1 : 0);
    }

    public void setCheckedState(int i5) {
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.checkedState != i5) {
            this.checkedState = i5;
            super.setChecked(i5 == 1);
            refreshDrawableState();
            setDefaultStateDescription();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            LinkedHashSet<OnCheckedStateChangedListener> linkedHashSet = this.onCheckedStateChangedListeners;
            if (linkedHashSet != null) {
                Iterator<OnCheckedStateChangedListener> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().onCheckedStateChangedListener(this, this.checkedState);
                }
            }
            if (this.checkedState != 2 && (onCheckedChangeListener = this.onCheckedChangeListener) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.broadcasting = false;
            if (i6 >= 21 || this.buttonIconDrawable == null) {
                return;
            }
            refreshDrawableState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        updateIconTintIfNeeded();
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.errorAccessibilityLabel = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i5) {
        setErrorAccessibilityLabel(i5 != 0 ? getResources().getText(i5) : null);
    }

    public void setErrorShown(boolean z5) {
        Drawable drawable;
        if (this.errorShown == z5) {
            return;
        }
        this.errorShown = z5;
        refreshDrawableState();
        if (Build.VERSION.SDK_INT < 21 && (drawable = this.buttonIconDrawable) != null) {
            drawable.jumpToCurrentState();
        }
        Iterator<OnErrorChangedListener> it = this.onErrorChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onErrorChanged(this, this.errorShown);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.onCheckedChangeListener = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.customStateDescription = charSequence;
        if (charSequence == null) {
            setDefaultStateDescription();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.useMaterialThemeColors = z5;
        if (z5) {
            i.m3617(this, getMaterialThemeColorsTintList());
        } else {
            i.m3617(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.buttonDrawable = drawable;
        this.usingMaterialButtonDrawable = false;
        refreshButtonDrawable();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i5) {
        int i6 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i5, i6), attributeSet, i5);
        this.onErrorChangedListeners = new LinkedHashSet<>();
        this.onCheckedStateChangedListeners = new LinkedHashSet<>();
        this.transitionToUnchecked = h.m5432(getContext(), R.drawable.mtrl_checkbox_button_checked_unchecked);
        this.transitionToUncheckedCallback = new a();
        Context context2 = getContext();
        this.buttonDrawable = i.m3614(this);
        this.buttonTintList = getSuperButtonTintList();
        setSupportButtonTintList(null);
        d3 obtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, R.styleable.MaterialCheckBox, i5, i6, new int[0]);
        this.buttonIconDrawable = obtainTintedStyledAttributes.m1188(R.styleable.MaterialCheckBox_buttonIcon);
        if (this.buttonDrawable != null && ThemeEnforcement.isMaterial3Theme(context2) && isButtonDrawableLegacy(obtainTintedStyledAttributes)) {
            super.setButtonDrawable((Drawable) null);
            this.buttonDrawable = f.a.m8475(context2, R.drawable.mtrl_checkbox_button);
            this.usingMaterialButtonDrawable = true;
            if (this.buttonIconDrawable == null) {
                this.buttonIconDrawable = f.a.m8475(context2, R.drawable.mtrl_checkbox_button_icon);
            }
        }
        this.buttonIconTintList = MaterialResources.getColorStateList(context2, obtainTintedStyledAttributes, R.styleable.MaterialCheckBox_buttonIconTint);
        this.buttonIconTintMode = ViewUtils.parseTintMode(obtainTintedStyledAttributes.m1192(R.styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.useMaterialThemeColors = obtainTintedStyledAttributes.m1182(R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.centerIfNoTextEnabled = obtainTintedStyledAttributes.m1182(R.styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.errorShown = obtainTintedStyledAttributes.m1182(R.styleable.MaterialCheckBox_errorShown, false);
        this.errorAccessibilityLabel = obtainTintedStyledAttributes.m1197(R.styleable.MaterialCheckBox_errorAccessibilityLabel);
        int i7 = R.styleable.MaterialCheckBox_checkedState;
        if (obtainTintedStyledAttributes.m1200(i7)) {
            setCheckedState(obtainTintedStyledAttributes.m1192(i7, 0));
        }
        obtainTintedStyledAttributes.m1201();
        refreshButtonDrawable();
        if (Build.VERSION.SDK_INT >= 21 || this.buttonIconDrawable == null) {
            return;
        }
        post(new Runnable() { // from class: com.google.android.material.checkbox.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f5458.lambda$new$0();
            }
        });
    }
}
