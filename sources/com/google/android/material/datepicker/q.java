package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class q {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final q f5700 = new q(null, null);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Long f5701;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final TimeZone f5702;

    private q(Long l5, TimeZone timeZone) {
        this.f5701 = l5;
        this.f5702 = timeZone;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static q m6760() {
        return f5700;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    Calendar m6761() {
        return m6762(this.f5702);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    Calendar m6762(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l5 = this.f5701;
        if (l5 != null) {
            calendar.setTimeInMillis(l5.longValue());
        }
        return calendar;
    }
}
