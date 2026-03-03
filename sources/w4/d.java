package w4;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: HttpDate.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<DateFormat> f12059 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final String[] f12060;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final DateFormat[] f12061;

    /* compiled from: HttpDate.java */
    class a extends ThreadLocal<DateFormat> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(t4.c.f11338);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f12060 = strArr;
        f12061 = new DateFormat[strArr.length];
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m12592(Date date) {
        return f12059.get().format(date);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Date m12593(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = f12059.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f12060;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i5 = 0; i5 < length; i5++) {
                DateFormat[] dateFormatArr = f12061;
                DateFormat dateFormat = dateFormatArr[i5];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f12060[i5], Locale.US);
                    dateFormat.setTimeZone(t4.c.f11338);
                    dateFormatArr[i5] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }
}
