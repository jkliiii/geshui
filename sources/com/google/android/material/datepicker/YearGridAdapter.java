package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: E:\78999\cookie_5123796.dex */
class YearGridAdapter extends RecyclerView.h<ViewHolder> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final MaterialCalendar<?> f5648;

    public static class ViewHolder extends RecyclerView.f0 {
        final TextView textView;

        ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    class a implements View.OnClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f5649;

        a(int i5) {
            this.f5649 = i5;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            YearGridAdapter.this.f5648.setCurrentMonth(YearGridAdapter.this.f5648.getCalendarConstraints().clamp(m.m6729(this.f5649, YearGridAdapter.this.f5648.getCurrentMonth().f5685)));
            YearGridAdapter.this.f5648.setSelector(MaterialCalendar.l.DAY);
        }
    }

    YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.f5648 = materialCalendar;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private View.OnClickListener m6689(int i5) {
        return new a(i5);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ʻʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public ViewHolder mo4817(ViewGroup viewGroup, int i5) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ʿ */
    public int mo4807() {
        return this.f5648.getCalendarConstraints().getYearSpan();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    int m6691(int i5) {
        return this.f5648.getCalendarConstraints().getStart().f5686 + i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: ᴵᴵ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo4815(ViewHolder viewHolder, int i5) {
        int m6691 = m6691(i5);
        viewHolder.textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m6691)));
        TextView textView = viewHolder.textView;
        textView.setContentDescription(j.m6720(textView.getContext(), m6691));
        b calendarStyle = this.f5648.getCalendarStyle();
        Calendar m6784 = w.m6784();
        com.google.android.material.datepicker.a aVar = m6784.get(1) == m6691 ? calendarStyle.f5662 : calendarStyle.f5660;
        Iterator<Long> it = this.f5648.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            m6784.setTimeInMillis(it.next().longValue());
            if (m6784.get(1) == m6691) {
                aVar = calendarStyle.f5661;
            }
        }
        aVar.m6697(viewHolder.textView);
        viewHolder.textView.setOnClickListener(m6689(m6691));
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    int m6693(int i5) {
        return i5 - this.f5648.getCalendarConstraints().getStart().f5686;
    }
}
