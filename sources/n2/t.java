package n2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: HttpDate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class t {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<DateFormat> f9671 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final String[] f9672 = {"EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* compiled from: HttpDate.java */
    static class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m10561(Date date) {
        return f9671.get().format(date);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Date m10562(String str) {
        if (str == null) {
            return null;
        }
        try {
            return f9671.get().parse(str);
        } catch (ParseException unused) {
            for (String str2 : f9672) {
                try {
                    return new SimpleDateFormat(str2, Locale.US).parse(str);
                } catch (ParseException unused2) {
                }
            }
            return null;
        }
    }
}
