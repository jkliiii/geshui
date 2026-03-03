package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k extends BaseAdapter {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final int f5679;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Calendar f5680;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f5681;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f5682;

    static {
        f5679 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public k() {
        Calendar m6786 = w.m6786();
        this.f5680 = m6786;
        this.f5681 = m6786.getMaximum(7);
        this.f5682 = m6786.getFirstDayOfWeek();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private int m6727(int i5) {
        int i6 = i5 + this.f5682;
        int i7 = this.f5681;
        return i6 > i7 ? i6 - i7 : i6;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f5681;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i5, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f5680.set(7, m6727(i5));
        textView.setText(this.f5680.getDisplayName(7, f5679, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), this.f5680.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Integer getItem(int i5) {
        if (i5 >= this.f5681) {
            return null;
        }
        return Integer.valueOf(m6727(i5));
    }

    public k(int i5) {
        Calendar m6786 = w.m6786();
        this.f5680 = m6786;
        this.f5681 = m6786.getMaximum(7);
        this.f5682 = i5;
    }
}
