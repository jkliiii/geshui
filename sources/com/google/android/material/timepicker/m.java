package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.j0;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.timepicker.TimePickerView;
import java.lang.reflect.Field;
import java.util.Locale;

/* compiled from: TimePickerTextInputPresenter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class m implements TimePickerView.f, j {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final LinearLayout f6384;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final h f6385;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final TextWatcher f6386 = new a();

    /* renamed from: ˈ, reason: contains not printable characters */
    private final TextWatcher f6387 = new b();

    /* renamed from: ˉ, reason: contains not printable characters */
    private final ChipTextInputComboView f6388;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final ChipTextInputComboView f6389;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final k f6390;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final EditText f6391;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final EditText f6392;

    /* renamed from: ˑ, reason: contains not printable characters */
    private MaterialButtonToggleGroup f6393;

    /* compiled from: TimePickerTextInputPresenter.java */
    class a extends TextWatcherAdapter {
        a() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    m.this.f6385.m7620(0);
                } else {
                    m.this.f6385.m7620(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class b extends TextWatcherAdapter {
        b() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    m.this.f6385.m7618(0);
                } else {
                    m.this.f6385.m7618(Integer.parseInt(editable.toString()));
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.mo7603(((Integer) view.getTag(R.id.selection_type)).intValue());
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class d extends com.google.android.material.timepicker.b {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ h f6397;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i5, h hVar) {
            super(context, i5);
            this.f6397 = hVar;
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(view.getResources().getString(this.f6397.m7614(), String.valueOf(this.f6397.m7615())));
        }
    }

    /* compiled from: TimePickerTextInputPresenter.java */
    class e extends com.google.android.material.timepicker.b {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ h f6399;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, int i5, h hVar) {
            super(context, i5);
            this.f6399 = hVar;
        }

        @Override // com.google.android.material.timepicker.b, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2645(view.getResources().getString(R.string.material_minute_suffix, String.valueOf(this.f6399.f6366)));
        }
    }

    public m(LinearLayout linearLayout, h hVar) {
        this.f6384 = linearLayout;
        this.f6385 = hVar;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_minute_text_input);
        this.f6388 = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(R.id.material_hour_text_input);
        this.f6389 = chipTextInputComboView2;
        int i5 = R.id.material_label;
        TextView textView = (TextView) chipTextInputComboView.findViewById(i5);
        TextView textView2 = (TextView) chipTextInputComboView2.findViewById(i5);
        textView.setText(resources.getString(R.string.material_timepicker_minute));
        textView2.setText(resources.getString(R.string.material_timepicker_hour));
        int i6 = R.id.selection_type;
        chipTextInputComboView.setTag(i6, 12);
        chipTextInputComboView2.setTag(i6, 10);
        if (hVar.f6364 == 0) {
            m7648();
        }
        c cVar = new c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.m7540(hVar.m7616());
        chipTextInputComboView.m7540(hVar.m7617());
        EditText editText = chipTextInputComboView2.m7541().getEditText();
        this.f6391 = editText;
        EditText editText2 = chipTextInputComboView.m7541().getEditText();
        this.f6392 = editText2;
        if (Build.VERSION.SDK_INT < 21) {
            int color = MaterialColors.getColor(linearLayout, R.attr.colorPrimary);
            m7646(editText, color);
            m7646(editText2, color);
        }
        this.f6390 = new k(chipTextInputComboView2, chipTextInputComboView, hVar);
        chipTextInputComboView2.m7542(new d(linearLayout.getContext(), R.string.material_hour_selection, hVar));
        chipTextInputComboView.m7542(new e(linearLayout.getContext(), R.string.material_minute_selection, hVar));
        m7651();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m7643() {
        this.f6391.addTextChangedListener(this.f6387);
        this.f6392.addTextChangedListener(this.f6386);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public /* synthetic */ void m7644(MaterialButtonToggleGroup materialButtonToggleGroup, int i5, boolean z5) {
        if (z5) {
            this.f6385.m7621(i5 == R.id.material_clock_period_pm_button ? 1 : 0);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m7645() {
        this.f6391.removeTextChangedListener(this.f6387);
        this.f6392.removeTextChangedListener(this.f6386);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static void m7646(EditText editText, int i5) {
        try {
            Context context = editText.getContext();
            Field declaredField = TextView.class.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i6 = declaredField.getInt(editText);
            Field declaredField2 = TextView.class.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable m8475 = f.a.m8475(context, i6);
            m8475.setColorFilter(i5, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{m8475, m8475});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m7647(h hVar) {
        m7645();
        Locale locale = this.f6384.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(hVar.f6366));
        String format2 = String.format(locale, "%02d", Integer.valueOf(hVar.m7615()));
        this.f6388.m7543(format);
        this.f6389.m7543(format2);
        m7643();
        m7649();
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m7648() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f6384.findViewById(R.id.material_clock_period_toggle);
        this.f6393 = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.l
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i5, boolean z5) {
                this.f6383.m7644(materialButtonToggleGroup2, i5, z5);
            }
        });
        this.f6393.setVisibility(0);
        m7649();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m7649() {
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f6393;
        if (materialButtonToggleGroup == null) {
            return;
        }
        materialButtonToggleGroup.check(this.f6385.f6368 == 0 ? R.id.material_clock_period_am_button : R.id.material_clock_period_pm_button);
    }

    @Override // com.google.android.material.timepicker.j
    public void invalidate() {
        m7647(this.f6385);
    }

    @Override // com.google.android.material.timepicker.j
    /* renamed from: ʻ */
    public void mo7632() {
        this.f6384.setVisibility(0);
        mo7603(this.f6385.f6367);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    /* renamed from: ʽ */
    public void mo7603(int i5) {
        this.f6385.f6367 = i5;
        this.f6388.setChecked(i5 == 12);
        this.f6389.setChecked(i5 == 10);
        m7649();
    }

    @Override // com.google.android.material.timepicker.j
    /* renamed from: ʾ */
    public void mo7633() {
        View focusedChild = this.f6384.getFocusedChild();
        if (focusedChild != null) {
            ViewUtils.hideKeyboard(focusedChild, false);
        }
        this.f6384.setVisibility(8);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m7650() {
        this.f6388.setChecked(false);
        this.f6389.setChecked(false);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m7651() {
        m7643();
        m7647(this.f6385);
        this.f6390.m7640();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m7652() {
        this.f6388.setChecked(this.f6385.f6367 == 12);
        this.f6389.setChecked(this.f6385.f6367 == 10);
    }
}
