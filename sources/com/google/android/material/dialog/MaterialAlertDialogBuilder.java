package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.b;
import androidx.appcompat.view.d;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MaterialAlertDialogBuilder extends b.a {
    private static final int DEF_STYLE_ATTR = R.attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = R.style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R.attr.materialAlertDialogTheme;
    private Drawable background;
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) {
        int materialAlertDialogThemeOverlay = getMaterialAlertDialogThemeOverlay(context);
        Context wrap = MaterialThemeOverlay.wrap(context, null, DEF_STYLE_ATTR, DEF_STYLE_RES);
        return materialAlertDialogThemeOverlay == 0 ? wrap : new d(wrap, materialAlertDialogThemeOverlay);
    }

    private static int getMaterialAlertDialogThemeOverlay(Context context) {
        TypedValue resolve = MaterialAttributes.resolve(context, MATERIAL_ALERT_DIALOG_THEME_OVERLAY);
        if (resolve == null) {
            return 0;
        }
        return resolve.data;
    }

    private static int getOverridingThemeResId(Context context, int i5) {
        return i5 == 0 ? getMaterialAlertDialogThemeOverlay(context) : i5;
    }

    @Override // androidx.appcompat.app.b.a
    public b create() {
        b create = super.create();
        Window window = create.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.background;
        if (drawable instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) drawable).setElevation(f1.m2904(decorView));
        }
        window.setBackgroundDrawable(MaterialDialogs.insetDrawable(this.background, this.backgroundInsets));
        decorView.setOnTouchListener(new InsetDialogOnTouchListener(create, this.backgroundInsets));
        return create;
    }

    public Drawable getBackground() {
        return this.background;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackground(Drawable drawable) {
        this.background = drawable;
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int i5) {
        this.backgroundInsets.bottom = i5;
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int i5) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.left = i5;
        } else {
            this.backgroundInsets.right = i5;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetStart(int i5) {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.backgroundInsets.right = i5;
        } else {
            this.backgroundInsets.left = i5;
        }
        return this;
    }

    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setBackgroundInsetTop(int i5) {
        this.backgroundInsets.top = i5;
        return this;
    }

    public MaterialAlertDialogBuilder(Context context, int i5) {
        super(createMaterialAlertDialogThemedContext(context), getOverridingThemeResId(context, i5));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i6 = DEF_STYLE_ATTR;
        int i7 = DEF_STYLE_RES;
        this.backgroundInsets = MaterialDialogs.getDialogBackgroundInsets(context2, i6, i7);
        int color = MaterialColors.getColor(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, R.styleable.MaterialAlertDialog, i6, i7);
        int color2 = obtainStyledAttributes.getColor(R.styleable.MaterialAlertDialog_backgroundTint, color);
        obtainStyledAttributes.recycle();
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context2, null, i6, i7);
        materialShapeDrawable.initializeElevationOverlay(context2);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                materialShapeDrawable.setCornerSize(dimension);
            }
        }
        this.background = materialShapeDrawable;
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setAdapter(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCancelable(boolean z5) {
        return (MaterialAlertDialogBuilder) super.setCancelable(z5);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        return (MaterialAlertDialogBuilder) super.setCursor(cursor, onClickListener, str);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setCustomTitle(View view) {
        return (MaterialAlertDialogBuilder) super.setCustomTitle(view);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIconAttribute(int i5) {
        return (MaterialAlertDialogBuilder) super.setIconAttribute(i5);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNegativeButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setNeutralButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder) super.setOnCancelListener(onCancelListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder) super.setOnDismissListener(onDismissListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder) super.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder) super.setOnKeyListener(onKeyListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButtonIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setPositiveButtonIcon(drawable);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(int i5) {
        return (MaterialAlertDialogBuilder) super.setIcon(i5);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(i5, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(int i5) {
        return (MaterialAlertDialogBuilder) super.setMessage(i5);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(i5, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(i5, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(i5, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(int i5) {
        return (MaterialAlertDialogBuilder) super.setTitle(i5);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(int i5) {
        return (MaterialAlertDialogBuilder) super.setView(i5);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setIcon(Drawable drawable) {
        return (MaterialAlertDialogBuilder) super.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setItems(charSequenceArr, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setMessage(charSequence);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(int i5, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(i5, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNegativeButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setNeutralButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setPositiveButton(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setView(View view) {
        return (MaterialAlertDialogBuilder) super.setView(view);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(int i5, int i6, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(i5, i6, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder) super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int i5, String str, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(cursor, i5, str, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArr, int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(charSequenceArr, i5, onClickListener);
    }

    @Override // androidx.appcompat.app.b.a
    @CanIgnoreReturnValue
    public MaterialAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int i5, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder) super.setSingleChoiceItems(listAdapter, i5, onClickListener);
    }
}
