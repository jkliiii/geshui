package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: E:\78999\cookie_5123796.dex */
class MonthsPagerAdapter extends RecyclerView.h<ViewHolder> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final CalendarConstraints f5630;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final DateSelector<?> f5631;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final DayViewDecorator f5632;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final MaterialCalendar.m f5633;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f5634;

    public static class ViewHolder extends RecyclerView.f0 {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        ViewHolder(LinearLayout linearLayout, boolean z5) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.monthTitle = textView;
            f1.m2831(textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z5) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ MaterialCalendarGridView f5635;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f5635 = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
            if (this.f5635.getAdapter().m6759(i5)) {
                MonthsPagerAdapter.this.f5633.mo6669(this.f5635.getAdapter().getItem(i5).longValue());
            }
        }
    }

    MonthsPagerAdapter(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.m mVar) {
        m start = calendarConstraints.getStart();
        m end = calendarConstraints.getEnd();
        m openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (openAt.compareTo(end) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5634 = (n.f5691 * MaterialCalendar.getDayHeight(context)) + (MaterialDatePicker.isFullscreen(context) ? MaterialCalendar.getDayHeight(context) : 0);
        this.f5630 = calendarConstraints;
        this.f5631 = dateSelector;
        this.f5632 = dayViewDecorator;
        this.f5633 = mVar;
        m4824(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ʻʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public ViewHolder mo4817(ViewGroup viewGroup, int i5) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f5634));
        return new ViewHolder(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ʿ */
    public int mo4807() {
        return this.f5630.getMonthSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ˆ */
    public long mo4808(int i5) {
        return this.f5630.getStart().m6738(i5).m6737();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    int m6678(m mVar) {
        return this.f5630.getStart().m6739(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ᴵᴵ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo4815(ViewHolder viewHolder, int i5) {
        m m6738 = this.f5630.getStart().m6738(i5);
        viewHolder.monthTitle.setText(m6738.m6736());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !m6738.equals(materialCalendarGridView.getAdapter().f5693)) {
            n nVar = new n(m6738, this.f5631, this.f5630, this.f5632);
            materialCalendarGridView.setNumColumns(m6738.f5687);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m6758(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    m m6680(int i5) {
        return this.f5630.getStart().m6738(i5);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    CharSequence m6681(int i5) {
        return m6680(i5).m6736();
    }
}
