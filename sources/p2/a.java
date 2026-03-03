package p2;

/* compiled from: HeaderParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class a {

    /* compiled from: HeaderParser.java */
    /* renamed from: p2.a$a, reason: collision with other inner class name */
    public interface InterfaceC0148a {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo11069(String str, String str2);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m11065(String str, InterfaceC0148a interfaceC0148a) {
        int m11067;
        String trim;
        if (str == null) {
            return;
        }
        int i5 = 0;
        while (i5 < str.length()) {
            int m110672 = m11067(str, i5, "=,");
            String trim2 = str.substring(i5, m110672).trim();
            if (m110672 == str.length() || str.charAt(m110672) == ',') {
                interfaceC0148a.mo11069(trim2, null);
                i5 = m110672 + 1;
            } else {
                int m11068 = m11068(str, m110672 + 1);
                if (m11068 >= str.length() || str.charAt(m11068) != '\"') {
                    m11067 = m11067(str, m11068, ",");
                    trim = str.substring(m11068, m11067).trim();
                } else {
                    int i6 = m11068 + 1;
                    int m110673 = m11067(str, i6, "\"");
                    trim = str.substring(i6, m110673);
                    m11067 = m110673 + 1;
                }
                interfaceC0148a.mo11069(trim2, trim);
                i5 = m11067;
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m11066(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int m11067(String str, int i5, String str2) {
        while (i5 < str.length() && str2.indexOf(str.charAt(i5)) == -1) {
            i5++;
        }
        return i5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int m11068(String str, int i5) {
        char charAt;
        while (i5 < str.length() && ((charAt = str.charAt(i5)) == ' ' || charAt == '\t')) {
            i5++;
        }
        return i5;
    }
}
