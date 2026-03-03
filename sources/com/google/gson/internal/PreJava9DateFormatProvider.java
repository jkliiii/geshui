package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: E:\78999\cookie_5123796.dex */
public class PreJava9DateFormatProvider {
    private static String getDateFormatPattern(int i5) {
        if (i5 == 0) {
            return "EEEE, MMMM d, y";
        }
        if (i5 == 1) {
            return "MMMM d, y";
        }
        if (i5 == 2) {
            return "MMM d, y";
        }
        if (i5 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i5);
    }

    private static String getDatePartOfDateTimePattern(int i5) {
        if (i5 == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i5 == 1) {
            return "MMMM d, yyyy";
        }
        if (i5 == 2) {
            return "MMM d, yyyy";
        }
        if (i5 == 3) {
            return "M/d/yy";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i5);
    }

    private static String getTimePartOfDateTimePattern(int i5) {
        if (i5 == 0 || i5 == 1) {
            return "h:mm:ss a z";
        }
        if (i5 == 2) {
            return "h:mm:ss a";
        }
        if (i5 == 3) {
            return "h:mm a";
        }
        throw new IllegalArgumentException("Unknown DateFormat style: " + i5);
    }

    public static DateFormat getUSDateFormat(int i5) {
        return new SimpleDateFormat(getDateFormatPattern(i5), Locale.US);
    }

    public static DateFormat getUSDateTimeFormat(int i5, int i6) {
        return new SimpleDateFormat(getDatePartOfDateTimePattern(i5) + " " + getTimePartOfDateTimePattern(i6), Locale.US);
    }
}
