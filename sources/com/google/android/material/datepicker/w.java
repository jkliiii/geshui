package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import com.google.android.material.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: UtcDates.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class w {

    /* renamed from: ʻ, reason: contains not printable characters */
    static AtomicReference<q> f5703 = new AtomicReference<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    static long m6768(long j5) {
        Calendar m6786 = m6786();
        m6786.setTimeInMillis(j5);
        return m6773(m6786).getTimeInMillis();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m6769(String str, String str2, int i5, int i6) {
        while (i6 >= 0 && i6 < str.length() && str2.indexOf(str.charAt(i6)) == -1) {
            if (str.charAt(i6) == '\'') {
                do {
                    i6 += i5;
                    if (i6 >= 0 && i6 < str.length()) {
                    }
                } while (str.charAt(i6) != '\'');
            }
            i6 += i5;
        }
        return i6;
    }

    @TargetApi(24)
    /* renamed from: ʽ, reason: contains not printable characters */
    static DateFormat m6770(Locale locale) {
        return m6771("MMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: ʾ, reason: contains not printable characters */
    private static DateFormat m6771(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m6785());
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        return instanceForSkeleton;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static String m6772(String str) {
        return str.replaceAll("[^dMy/\\-.]", BuildConfig.FLAVOR).replaceAll("d{1,2}", "dd").replaceAll("M{1,2}", "MM").replaceAll("y{1,4}", "yyyy").replaceAll("\\.$", BuildConfig.FLAVOR).replaceAll("My", "M/y");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static Calendar m6773(Calendar calendar) {
        Calendar m6787 = m6787(calendar);
        Calendar m6786 = m6786();
        m6786.set(m6787.get(1), m6787.get(2), m6787.get(5));
        return m6786;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static SimpleDateFormat m6774() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(m6772(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern()), Locale.getDefault());
        simpleDateFormat.setTimeZone(m6783());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static String m6775(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(R.string.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(R.string.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(R.string.mtrl_picker_text_input_day_abbr);
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage())) {
            pattern = pattern.replaceAll("d+", "d").replaceAll("M+", "M").replaceAll("y+", "y");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static java.text.DateFormat m6776(int i5, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i5, locale);
        dateInstance.setTimeZone(m6783());
        return dateInstance;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static java.text.DateFormat m6777(Locale locale) {
        return m6776(0, locale);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static java.text.DateFormat m6778(Locale locale) {
        return m6776(2, locale);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static java.text.DateFormat m6779(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m6778(locale);
        simpleDateFormat.applyPattern(m6791(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    @TargetApi(24)
    /* renamed from: ˑ, reason: contains not printable characters */
    static DateFormat m6780(Locale locale) {
        return m6771("MMMMEEEEd", locale);
    }

    /* renamed from: י, reason: contains not printable characters */
    static java.text.DateFormat m6781(java.text.DateFormat dateFormat) {
        java.text.DateFormat dateFormat2 = (java.text.DateFormat) dateFormat.clone();
        dateFormat2.setTimeZone(m6783());
        return dateFormat2;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static q m6782() {
        q qVar = f5703.get();
        return qVar == null ? q.m6760() : qVar;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static TimeZone m6783() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    static Calendar m6784() {
        Calendar m6761 = m6782().m6761();
        m6761.set(11, 0);
        m6761.set(12, 0);
        m6761.set(13, 0);
        m6761.set(14, 0);
        m6761.setTimeZone(m6783());
        return m6761;
    }

    @TargetApi(24)
    /* renamed from: ᴵ, reason: contains not printable characters */
    private static android.icu.util.TimeZone m6785() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    static Calendar m6786() {
        return m6787(null);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    static Calendar m6787(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m6783());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    @TargetApi(24)
    /* renamed from: ᵢ, reason: contains not printable characters */
    static DateFormat m6788(Locale locale) {
        return m6771("yMMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: ⁱ, reason: contains not printable characters */
    static DateFormat m6789(Locale locale) {
        return m6771("yMMMM", locale);
    }

    @TargetApi(24)
    /* renamed from: ﹳ, reason: contains not printable characters */
    static DateFormat m6790(Locale locale) {
        return m6771("yMMMMEEEEd", locale);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static String m6791(String str) {
        int m6769 = m6769(str, "yY", 1, 0);
        if (m6769 >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int m67692 = m6769(str, "EMd", 1, m6769);
        if (m67692 < str.length()) {
            str2 = "EMd,";
        }
        return str.replace(str.substring(m6769(str, str2, -1, m6769) + 1, m67692), " ").trim();
    }
}
