package l4;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringsJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends k {
    /* renamed from: ʽ, reason: contains not printable characters */
    public static final boolean m9753(String str, int i5, String str2, int i6, int i7, boolean z5) {
        f4.k.m8623(str, "<this>");
        f4.k.m8623(str2, "other");
        return !z5 ? str.regionMatches(i5, str2, i6, i7) : str.regionMatches(z5, i5, str2, i6, i7);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final String m9754(String str, String str2, String str3, boolean z5) {
        f4.k.m8623(str, "<this>");
        f4.k.m8623(str2, "oldValue");
        f4.k.m8623(str3, "newValue");
        int i5 = 0;
        int m9757 = m.m9757(str, str2, 0, z5);
        if (m9757 < 0) {
            return str;
        }
        int length = str2.length();
        int m9256 = i4.f.m9256(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i5, m9757);
            sb.append(str3);
            i5 = m9757 + length;
            if (m9757 >= str.length()) {
                break;
            }
            m9757 = m.m9757(str, str2, m9757 + m9256, z5);
        } while (m9757 > 0);
        sb.append((CharSequence) str, i5, str.length());
        String sb2 = sb.toString();
        f4.k.m8622(sb2, "stringBuilder.append(this, i, length).toString()");
        return sb2;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static /* synthetic */ String m9755(String str, String str2, String str3, boolean z5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return m9754(str, str2, str3, z5);
    }
}
