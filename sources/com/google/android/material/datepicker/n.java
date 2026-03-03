package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class n extends BaseAdapter {

    /* renamed from: ˋ, reason: contains not printable characters */
    static final int f5691 = w.m6786().getMaximum(4);

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final int f5692 = (w.m6786().getMaximum(5) + w.m6786().getMaximum(7)) - 1;

    /* renamed from: ʾ, reason: contains not printable characters */
    final m f5693;

    /* renamed from: ʿ, reason: contains not printable characters */
    final DateSelector<?> f5694;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Collection<Long> f5695;

    /* renamed from: ˈ, reason: contains not printable characters */
    b f5696;

    /* renamed from: ˉ, reason: contains not printable characters */
    final CalendarConstraints f5697;

    /* renamed from: ˊ, reason: contains not printable characters */
    final DayViewDecorator f5698;

    n(m mVar, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f5693 = mVar;
        this.f5694 = dateSelector;
        this.f5697 = calendarConstraints;
        this.f5698 = dayViewDecorator;
        this.f5695 = dateSelector.getSelectedDays();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private String m6742(Context context, long j5) {
        return j.m6714(context, j5, m6745(j5), m6755(j5), m6752(j5));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m6743(Context context) {
        if (this.f5696 == null) {
            this.f5696 = new b(context);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m6744(long j5) {
        Iterator<Long> it = this.f5694.getSelectedDays().iterator();
        while (it.hasNext()) {
            if (w.m6768(j5) == w.m6768(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m6745(long j5) {
        return w.m6784().getTimeInMillis() == j5;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m6746(TextView textView, long j5, int i5) {
        a aVar;
        boolean z5;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String m6742 = m6742(context, j5);
        textView.setContentDescription(m6742);
        boolean isValid = this.f5697.getDateValidator().isValid(j5);
        if (isValid) {
            textView.setEnabled(true);
            boolean m6744 = m6744(j5);
            textView.setSelected(m6744);
            aVar = m6744 ? this.f5696.f5658 : m6745(j5) ? this.f5696.f5659 : this.f5696.f5657;
            z5 = m6744;
        } else {
            textView.setEnabled(false);
            aVar = this.f5696.f5663;
            z5 = false;
        }
        DayViewDecorator dayViewDecorator = this.f5698;
        if (dayViewDecorator == null || i5 == -1) {
            aVar.m6697(textView);
            return;
        }
        m mVar = this.f5693;
        int i6 = mVar.f5686;
        int i7 = mVar.f5685;
        ColorStateList backgroundColor = dayViewDecorator.getBackgroundColor(context, i6, i7, i5, isValid, z5);
        boolean z6 = z5;
        aVar.m6698(textView, backgroundColor, this.f5698.getTextColor(context, i6, i7, i5, isValid, z6));
        Drawable compoundDrawableLeft = this.f5698.getCompoundDrawableLeft(context, i6, i7, i5, isValid, z6);
        Drawable compoundDrawableTop = this.f5698.getCompoundDrawableTop(context, i6, i7, i5, isValid, z6);
        Drawable compoundDrawableRight = this.f5698.getCompoundDrawableRight(context, i6, i7, i5, isValid, z6);
        boolean z7 = z5;
        textView.setCompoundDrawables(compoundDrawableLeft, compoundDrawableTop, compoundDrawableRight, this.f5698.getCompoundDrawableBottom(context, i6, i7, i5, isValid, z7));
        textView.setContentDescription(this.f5698.getContentDescription(context, i6, i7, i5, isValid, z7, m6742));
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m6747(MaterialCalendarGridView materialCalendarGridView, long j5) {
        if (m.m6730(j5).equals(this.f5693)) {
            int m6735 = this.f5693.m6735(j5);
            m6746((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().m6748(m6735) - materialCalendarGridView.getFirstVisiblePosition()), j5, m6735);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f5692;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5 / this.f5693.f5687;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    int m6748(int i5) {
        return m6749() + (i5 - 1);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    int m6749() {
        return this.f5693.m6733(this.f5697.getFirstDayOfWeek());
    }

    @Override // android.widget.Adapter
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Long getItem(int i5) {
        if (i5 < m6749() || i5 > m6756()) {
            return null;
        }
        return Long.valueOf(this.f5693.m6734(m6757(i5)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    @Override // android.widget.Adapter
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m6743(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m6749()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.m r8 = r5.f5693
            int r2 = r8.f5688
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m6746(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean m6752(long j5) {
        Iterator<androidx.core.util.d<Long, Long>> it = this.f5694.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l5 = it.next().f2844;
            if (l5 != null && l5.longValue() == j5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean m6753(int i5) {
        return i5 % this.f5693.f5687 == 0;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean m6754(int i5) {
        return (i5 + 1) % this.f5693.f5687 == 0;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    boolean m6755(long j5) {
        Iterator<androidx.core.util.d<Long, Long>> it = this.f5694.getSelectedRanges().iterator();
        while (it.hasNext()) {
            Long l5 = it.next().f2843;
            if (l5 != null && l5.longValue() == j5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    int m6756() {
        return (m6749() + this.f5693.f5688) - 1;
    }

    /* renamed from: י, reason: contains not printable characters */
    int m6757(int i5) {
        return (i5 - m6749()) + 1;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m6758(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f5695.iterator();
        while (it.hasNext()) {
            m6747(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f5694;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.getSelectedDays().iterator();
            while (it2.hasNext()) {
                m6747(materialCalendarGridView, it2.next().longValue());
            }
            this.f5695 = this.f5694.getSelectedDays();
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    boolean m6759(int i5) {
        return i5 >= m6749() && i5 <= m6756();
    }
}
