package l4;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Strings.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m extends l {
    /* renamed from: ˆ, reason: contains not printable characters */
    public static final int m9756(CharSequence charSequence) {
        f4.k.m8623(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final int m9757(CharSequence charSequence, String str, int i5, boolean z5) {
        f4.k.m8623(charSequence, "<this>");
        f4.k.m8623(str, "string");
        return (z5 || !(charSequence instanceof String)) ? m9759(charSequence, str, i5, charSequence.length(), z5, false, 16, null) : ((String) charSequence).indexOf(str, i5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final int m9758(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z5, boolean z6) {
        i4.a cVar = !z6 ? new i4.c(i4.f.m9256(i5, 0), i4.f.m9258(i6, charSequence.length())) : i4.f.m9260(i4.f.m9258(i5, m9756(charSequence)), i4.f.m9256(i6, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int m9245 = cVar.m9245();
            int m9246 = cVar.m9246();
            int m9247 = cVar.m9247();
            if ((m9247 <= 0 || m9245 > m9246) && (m9247 >= 0 || m9246 > m9245)) {
                return -1;
            }
            while (!l.m9753((String) charSequence2, 0, (String) charSequence, m9245, charSequence2.length(), z5)) {
                if (m9245 == m9246) {
                    return -1;
                }
                m9245 += m9247;
            }
            return m9245;
        }
        int m92452 = cVar.m9245();
        int m92462 = cVar.m9246();
        int m92472 = cVar.m9247();
        if ((m92472 <= 0 || m92452 > m92462) && (m92472 >= 0 || m92462 > m92452)) {
            return -1;
        }
        while (!m9763(charSequence2, 0, charSequence, m92452, charSequence2.length(), z5)) {
            if (m92452 == m92462) {
                return -1;
            }
            m92452 += m92472;
        }
        return m92452;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static /* synthetic */ int m9759(CharSequence charSequence, CharSequence charSequence2, int i5, int i6, boolean z5, boolean z6, int i7, Object obj) {
        return m9758(charSequence, charSequence2, i5, i6, z5, (i7 & 16) != 0 ? false : z6);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final int m9760(CharSequence charSequence, char c6, int i5, boolean z5) {
        f4.k.m8623(charSequence, "<this>");
        return (z5 || !(charSequence instanceof String)) ? m9762(charSequence, new char[]{c6}, i5, z5) : ((String) charSequence).lastIndexOf(c6, i5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static /* synthetic */ int m9761(CharSequence charSequence, char c6, int i5, boolean z5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = m9756(charSequence);
        }
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        return m9760(charSequence, c6, i5, z5);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final int m9762(CharSequence charSequence, char[] cArr, int i5, boolean z5) {
        f4.k.m8623(charSequence, "<this>");
        f4.k.m8623(cArr, "chars");
        if (!z5 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(w3.j.m12546(cArr), i5);
        }
        for (int m9258 = i4.f.m9258(i5, m9756(charSequence)); -1 < m9258; m9258--) {
            char charAt = charSequence.charAt(m9258);
            int length = cArr.length;
            boolean z6 = false;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (b.m9747(cArr[i6], charAt, z5)) {
                    z6 = true;
                    break;
                }
                i6++;
            }
            if (z6) {
                return m9258;
            }
        }
        return -1;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final boolean m9763(CharSequence charSequence, int i5, CharSequence charSequence2, int i6, int i7, boolean z5) {
        f4.k.m8623(charSequence, "<this>");
        f4.k.m8623(charSequence2, "other");
        if (i6 < 0 || i5 < 0 || i5 > charSequence.length() - i7 || i6 > charSequence2.length() - i7) {
            return false;
        }
        for (int i8 = 0; i8 < i7; i8++) {
            if (!b.m9747(charSequence.charAt(i5 + i8), charSequence2.charAt(i6 + i8), z5)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: י, reason: contains not printable characters */
    public static final String m9764(String str, char c6, String str2) {
        f4.k.m8623(str, "<this>");
        f4.k.m8623(str2, "missingDelimiterValue");
        int m9761 = m9761(str, c6, 0, false, 6, null);
        if (m9761 == -1) {
            return str2;
        }
        String substring = str.substring(m9761 + 1, str.length());
        f4.k.m8622(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static /* synthetic */ String m9765(String str, char c6, String str2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str2 = str;
        }
        return m9764(str, c6, str2);
    }
}
