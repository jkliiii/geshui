package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: E:\78999\cookie_5123796.dex */
public class RangeDateSelector implements DateSelector<androidx.core.util.d<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();
    private CharSequence error;
    private String invalidRangeStartError;
    private SimpleDateFormat textInputFormat;
    private final String invalidRangeEndError = " ";
    private Long selectedStartItem = null;
    private Long selectedEndItem = null;
    private Long proposedTextStart = null;
    private Long proposedTextEnd = null;

    class a extends e {

        /* renamed from: ˏ, reason: contains not printable characters */
        final /* synthetic */ TextInputLayout f5637;

        /* renamed from: ˑ, reason: contains not printable characters */
        final /* synthetic */ TextInputLayout f5638;

        /* renamed from: י, reason: contains not printable characters */
        final /* synthetic */ OnSelectionChangedListener f5639;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f5637 = textInputLayout2;
            this.f5638 = textInputLayout3;
            this.f5639 = onSelectionChangedListener;
        }

        @Override // com.google.android.material.datepicker.e
        /* renamed from: ˆ, reason: contains not printable characters */
        void mo6682() {
            RangeDateSelector.this.proposedTextStart = null;
            RangeDateSelector.this.updateIfValidTextProposal(this.f5637, this.f5638, this.f5639);
        }

        @Override // com.google.android.material.datepicker.e
        /* renamed from: ˈ, reason: contains not printable characters */
        void mo6683(Long l5) {
            RangeDateSelector.this.proposedTextStart = l5;
            RangeDateSelector.this.updateIfValidTextProposal(this.f5637, this.f5638, this.f5639);
        }
    }

    class b extends e {

        /* renamed from: ˏ, reason: contains not printable characters */
        final /* synthetic */ TextInputLayout f5641;

        /* renamed from: ˑ, reason: contains not printable characters */
        final /* synthetic */ TextInputLayout f5642;

        /* renamed from: י, reason: contains not printable characters */
        final /* synthetic */ OnSelectionChangedListener f5643;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f5641 = textInputLayout2;
            this.f5642 = textInputLayout3;
            this.f5643 = onSelectionChangedListener;
        }

        @Override // com.google.android.material.datepicker.e
        /* renamed from: ˆ */
        void mo6682() {
            RangeDateSelector.this.proposedTextEnd = null;
            RangeDateSelector.this.updateIfValidTextProposal(this.f5641, this.f5642, this.f5643);
        }

        @Override // com.google.android.material.datepicker.e
        /* renamed from: ˈ */
        void mo6683(Long l5) {
            RangeDateSelector.this.proposedTextEnd = l5;
            RangeDateSelector.this.updateIfValidTextProposal(this.f5641, this.f5642, this.f5643);
        }
    }

    class c implements Parcelable.Creator<RangeDateSelector> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public RangeDateSelector[] newArray(int i5) {
            return new RangeDateSelector[i5];
        }
    }

    private void clearInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !" ".contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean isValidRange(long j5, long j6) {
        return j5 <= j6;
    }

    private void setInvalidRange(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(" ");
    }

    private void updateError(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            this.error = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            this.error = null;
        } else {
            this.error = textInputLayout2.getError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener<androidx.core.util.d<Long, Long>> onSelectionChangedListener) {
        Long l5 = this.proposedTextStart;
        if (l5 == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (isValidRange(l5.longValue(), this.proposedTextEnd.longValue())) {
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        } else {
            setInvalidRange(textInputLayout, textInputLayout2);
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        updateError(textInputLayout, textInputLayout2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.resolveOrThrow(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getError() {
        if (TextUtils.isEmpty(this.error)) {
            return null;
        }
        return this.error.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l5 = this.selectedStartItem;
        if (l5 != null) {
            arrayList.add(l5);
        }
        Long l6 = this.selectedEndItem;
        if (l6 != null) {
            arrayList.add(l6);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public Collection<androidx.core.util.d<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new androidx.core.util.d(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionContentDescription(Context context) {
        Resources resources = context.getResources();
        androidx.core.util.d<String, String> m6710 = j.m6710(this.selectedStartItem, this.selectedEndItem);
        String str = m6710.f2843;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = m6710.f2844;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public String getSelectionDisplayString(Context context) {
        Resources resources = context.getResources();
        Long l5 = this.selectedStartItem;
        if (l5 == null && this.selectedEndItem == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l6 = this.selectedEndItem;
        if (l6 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, j.m6712(l5.longValue()));
        }
        if (l5 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, j.m6712(l6.longValue()));
        }
        androidx.core.util.d<String, String> m6710 = j.m6710(l5, l6);
        return resources.getString(R.string.mtrl_picker_range_header_selected, m6710.f2843, m6710.f2844);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l5 = this.selectedStartItem;
        return (l5 == null || this.selectedEndItem == null || !isValidRange(l5.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<androidx.core.util.d<Long, Long>> onSelectionChangedListener) {
        View inflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = inflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormat = this.textInputFormat;
        boolean z5 = simpleDateFormat != null;
        if (!z5) {
            simpleDateFormat = w.m6774();
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        Long l5 = this.selectedStartItem;
        if (l5 != null) {
            editText.setText(simpleDateFormat2.format(l5));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l6 = this.selectedEndItem;
        if (l6 != null) {
            editText2.setText(simpleDateFormat2.format(l6));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String pattern = z5 ? simpleDateFormat2.toPattern() : w.m6775(inflate.getResources(), simpleDateFormat2);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat2, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, onSelectionChangedListener));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat2, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, onSelectionChangedListener));
        h.m6708(editText, editText2);
        return inflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j5) {
        Long l5 = this.selectedStartItem;
        if (l5 == null) {
            this.selectedStartItem = Long.valueOf(j5);
        } else if (this.selectedEndItem == null && isValidRange(l5.longValue(), j5)) {
            this.selectedEndItem = Long.valueOf(j5);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j5);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            simpleDateFormat = (SimpleDateFormat) w.m6781(simpleDateFormat);
        }
        this.textInputFormat = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    public androidx.core.util.d<Long, Long> getSelection() {
        return new androidx.core.util.d<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(androidx.core.util.d<Long, Long> dVar) {
        Long l5 = dVar.f2843;
        if (l5 != null && dVar.f2844 != null) {
            androidx.core.util.h.m2577(isValidRange(l5.longValue(), dVar.f2844.longValue()));
        }
        Long l6 = dVar.f2843;
        this.selectedStartItem = l6 == null ? null : Long.valueOf(w.m6768(l6.longValue()));
        Long l7 = dVar.f2844;
        this.selectedEndItem = l7 != null ? Long.valueOf(w.m6768(l7.longValue())) : null;
    }
}
