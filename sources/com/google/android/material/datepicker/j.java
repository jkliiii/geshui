package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.text.format.DateUtils;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: DateStrings.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class j {
    /* renamed from: ʻ, reason: contains not printable characters */
    static androidx.core.util.d<String, String> m6710(Long l5, Long l6) {
        return m6711(l5, l6, null);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static androidx.core.util.d<String, String> m6711(Long l5, Long l6, SimpleDateFormat simpleDateFormat) {
        if (l5 == null && l6 == null) {
            return androidx.core.util.d.m2573(null, null);
        }
        if (l5 == null) {
            return androidx.core.util.d.m2573(null, m6713(l6.longValue(), simpleDateFormat));
        }
        if (l6 == null) {
            return androidx.core.util.d.m2573(m6713(l5.longValue(), simpleDateFormat), null);
        }
        Calendar m6784 = w.m6784();
        Calendar m6786 = w.m6786();
        m6786.setTimeInMillis(l5.longValue());
        Calendar m67862 = w.m6786();
        m67862.setTimeInMillis(l6.longValue());
        if (simpleDateFormat != null) {
            return androidx.core.util.d.m2573(simpleDateFormat.format(new Date(l5.longValue())), simpleDateFormat.format(new Date(l6.longValue())));
        }
        return m6786.get(1) == m67862.get(1) ? m6786.get(1) == m6784.get(1) ? androidx.core.util.d.m2573(m6716(l5.longValue(), Locale.getDefault()), m6716(l6.longValue(), Locale.getDefault())) : androidx.core.util.d.m2573(m6716(l5.longValue(), Locale.getDefault()), m6723(l6.longValue(), Locale.getDefault())) : androidx.core.util.d.m2573(m6723(l5.longValue(), Locale.getDefault()), m6723(l6.longValue(), Locale.getDefault()));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static String m6712(long j5) {
        return m6713(j5, null);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static String m6713(long j5, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j5)) : m6726(j5) ? m6715(j5) : m6722(j5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static String m6714(Context context, long j5, boolean z5, boolean z6, boolean z7) {
        String m6719 = m6719(j5);
        if (z5) {
            m6719 = String.format(context.getString(R.string.mtrl_picker_today_description), m6719);
        }
        return z6 ? String.format(context.getString(R.string.mtrl_picker_start_date_description), m6719) : z7 ? String.format(context.getString(R.string.mtrl_picker_end_date_description), m6719) : m6719;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static String m6715(long j5) {
        return m6716(j5, Locale.getDefault());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static String m6716(long j5, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? w.m6770(locale).format(new Date(j5)) : w.m6779(locale).format(new Date(j5));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static String m6717(long j5) {
        return m6718(j5, Locale.getDefault());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static String m6718(long j5, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? w.m6780(locale).format(new Date(j5)) : w.m6777(locale).format(new Date(j5));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static String m6719(long j5) {
        return m6726(j5) ? m6717(j5) : m6724(j5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static String m6720(Context context, int i5) {
        return w.m6784().get(1) == i5 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i5)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i5));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static String m6721(long j5) {
        return Build.VERSION.SDK_INT >= 24 ? w.m6789(Locale.getDefault()).format(new Date(j5)) : DateUtils.formatDateTime(null, j5, 8228);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static String m6722(long j5) {
        return m6723(j5, Locale.getDefault());
    }

    /* renamed from: י, reason: contains not printable characters */
    static String m6723(long j5, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? w.m6788(locale).format(new Date(j5)) : w.m6778(locale).format(new Date(j5));
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static String m6724(long j5) {
        return m6725(j5, Locale.getDefault());
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    static String m6725(long j5, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? w.m6790(locale).format(new Date(j5)) : w.m6777(locale).format(new Date(j5));
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static boolean m6726(long j5) {
        Calendar m6784 = w.m6784();
        Calendar m6786 = w.m6786();
        m6786.setTimeInMillis(j5);
        return m6784.get(1) == m6786.get(1);
    }
}
