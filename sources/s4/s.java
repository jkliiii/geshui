package s4;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: HttpUrl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class s {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final char[] f11131 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ʻ, reason: contains not printable characters */
    final String f11132;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String f11133;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final String f11134;

    /* renamed from: ʾ, reason: contains not printable characters */
    final String f11135;

    /* renamed from: ʿ, reason: contains not printable characters */
    final int f11136;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final List<String> f11137;

    /* renamed from: ˈ, reason: contains not printable characters */
    @Nullable
    private final List<String> f11138;

    /* renamed from: ˉ, reason: contains not printable characters */
    @Nullable
    private final String f11139;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final String f11140;

    /* compiled from: HttpUrl.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        @Nullable
        String f11141;

        /* renamed from: ʾ, reason: contains not printable characters */
        @Nullable
        String f11144;

        /* renamed from: ˆ, reason: contains not printable characters */
        final List<String> f11146;

        /* renamed from: ˈ, reason: contains not printable characters */
        @Nullable
        List<String> f11147;

        /* renamed from: ˉ, reason: contains not printable characters */
        @Nullable
        String f11148;

        /* renamed from: ʼ, reason: contains not printable characters */
        String f11142 = BuildConfig.FLAVOR;

        /* renamed from: ʽ, reason: contains not printable characters */
        String f11143 = BuildConfig.FLAVOR;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f11145 = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f11146 = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static String m11920(String str, int i5, int i6) {
            return t4.c.m12055(s.m11898(str, i5, i6, false));
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean m11921(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean m11922(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private static int m11923(String str, int i5, int i6) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(s.m11890(str, i5, i6, BuildConfig.FLAVOR, false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        private void m11924() {
            if (!this.f11146.remove(r0.size() - 1).isEmpty() || this.f11146.isEmpty()) {
                this.f11146.add(BuildConfig.FLAVOR);
            } else {
                this.f11146.set(r0.size() - 1, BuildConfig.FLAVOR);
            }
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private static int m11925(String str, int i5, int i6) {
            while (i5 < i6) {
                char charAt = str.charAt(i5);
                if (charAt == ':') {
                    return i5;
                }
                if (charAt == '[') {
                    do {
                        i5++;
                        if (i5 < i6) {
                        }
                    } while (str.charAt(i5) != ']');
                }
                i5++;
            }
            return i6;
        }

        /* renamed from: י, reason: contains not printable characters */
        private void m11926(String str, int i5, int i6, boolean z5, boolean z6) {
            String m11890 = s.m11890(str, i5, i6, " \"<>^`{}|/\\?#", z6, false, false, true, null);
            if (m11921(m11890)) {
                return;
            }
            if (m11922(m11890)) {
                m11924();
                return;
            }
            if (this.f11146.get(r11.size() - 1).isEmpty()) {
                this.f11146.set(r11.size() - 1, m11890);
            } else {
                this.f11146.add(m11890);
            }
            if (z5) {
                this.f11146.add(BuildConfig.FLAVOR);
            }
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        private void m11927(String str, int i5, int i6) {
            if (i5 == i6) {
                return;
            }
            char charAt = str.charAt(i5);
            if (charAt == '/' || charAt == '\\') {
                this.f11146.clear();
                this.f11146.add(BuildConfig.FLAVOR);
                i5++;
            } else {
                List<String> list = this.f11146;
                list.set(list.size() - 1, BuildConfig.FLAVOR);
            }
            while (true) {
                int i7 = i5;
                if (i7 >= i6) {
                    return;
                }
                i5 = t4.c.m12068(str, i7, i6, "/\\");
                boolean z5 = i5 < i6;
                m11926(str, i7, i5, z5, true);
                if (z5) {
                    i5++;
                }
            }
        }

        /* renamed from: ᴵ, reason: contains not printable characters */
        private static int m11928(String str, int i5, int i6) {
            if (i6 - i5 < 2) {
                return -1;
            }
            char charAt = str.charAt(i5);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i5++;
                    if (i5 >= i6) {
                        break;
                    }
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        private static int m11929(String str, int i5, int i6) {
            int i7 = 0;
            while (i5 < i6) {
                char charAt = str.charAt(i5);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i7++;
                i5++;
            }
            return i7;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f11141;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f11142.isEmpty() || !this.f11143.isEmpty()) {
                sb.append(this.f11142);
                if (!this.f11143.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f11143);
                }
                sb.append('@');
            }
            String str2 = this.f11144;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f11144);
                    sb.append(']');
                } else {
                    sb.append(this.f11144);
                }
            }
            if (this.f11145 != -1 || this.f11141 != null) {
                int m11931 = m11931();
                String str3 = this.f11141;
                if (str3 == null || m11931 != s.m11894(str3)) {
                    sb.append(':');
                    sb.append(m11931);
                }
            }
            s.m11897(sb, this.f11146);
            if (this.f11147 != null) {
                sb.append('?');
                s.m11896(sb, this.f11147);
            }
            if (this.f11148 != null) {
                sb.append('#');
                sb.append(this.f11148);
            }
            return sb.toString();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public s m11930() {
            if (this.f11141 == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f11144 != null) {
                return new s(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        int m11931() {
            int i5 = this.f11145;
            return i5 != -1 ? i5 : s.m11894(this.f11141);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public a m11932(@Nullable String str) {
            this.f11147 = str != null ? s.m11903(s.m11891(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public a m11933(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String m11920 = m11920(str, 0, str.length());
            if (m11920 != null) {
                this.f11144 = m11920;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        a m11934(@Nullable s sVar, String str) {
            int m12068;
            int i5;
            int m12054 = t4.c.m12054(str, 0, str.length());
            int m12052 = t4.c.m12052(str, m12054, str.length());
            int m11928 = m11928(str, m12054, m12052);
            if (m11928 != -1) {
                if (str.regionMatches(true, m12054, "https:", 0, 6)) {
                    this.f11141 = "https";
                    m12054 += 6;
                } else {
                    if (!str.regionMatches(true, m12054, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, m11928) + "'");
                    }
                    this.f11141 = "http";
                    m12054 += 5;
                }
            } else {
                if (sVar == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f11141 = sVar.f11132;
            }
            int m11929 = m11929(str, m12054, m12052);
            char c6 = '?';
            char c7 = '#';
            if (m11929 >= 2 || sVar == null || !sVar.f11132.equals(this.f11141)) {
                int i6 = m12054 + m11929;
                boolean z5 = false;
                boolean z6 = false;
                while (true) {
                    m12068 = t4.c.m12068(str, i6, m12052, "@/\\?#");
                    char charAt = m12068 != m12052 ? str.charAt(m12068) : (char) 65535;
                    if (charAt == 65535 || charAt == c7 || charAt == '/' || charAt == '\\' || charAt == c6) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z5) {
                            i5 = m12068;
                            this.f11143 += "%40" + s.m11890(str, i6, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int m12067 = t4.c.m12067(str, i6, m12068, ':');
                            i5 = m12068;
                            String m11890 = s.m11890(str, i6, m12067, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z6) {
                                m11890 = this.f11142 + "%40" + m11890;
                            }
                            this.f11142 = m11890;
                            if (m12067 != i5) {
                                this.f11143 = s.m11890(str, m12067 + 1, i5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z5 = true;
                            }
                            z6 = true;
                        }
                        i6 = i5 + 1;
                    }
                    c6 = '?';
                    c7 = '#';
                }
                int m11925 = m11925(str, i6, m12068);
                int i7 = m11925 + 1;
                if (i7 < m12068) {
                    this.f11144 = m11920(str, i6, m11925);
                    int m11923 = m11923(str, i7, m12068);
                    this.f11145 = m11923;
                    if (m11923 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i7, m12068) + '\"');
                    }
                } else {
                    this.f11144 = m11920(str, i6, m11925);
                    this.f11145 = s.m11894(this.f11141);
                }
                if (this.f11144 == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i6, m11925) + '\"');
                }
                m12054 = m12068;
            } else {
                this.f11142 = sVar.m11911();
                this.f11143 = sVar.m11907();
                this.f11144 = sVar.f11135;
                this.f11145 = sVar.f11136;
                this.f11146.clear();
                this.f11146.addAll(sVar.m11909());
                if (m12054 == m12052 || str.charAt(m12054) == '#') {
                    m11932(sVar.m11910());
                }
            }
            int m120682 = t4.c.m12068(str, m12054, m12052, "?#");
            m11927(str, m12054, m120682);
            if (m120682 < m12052 && str.charAt(m120682) == '?') {
                int m120672 = t4.c.m12067(str, m120682, m12052, '#');
                this.f11147 = s.m11903(s.m11890(str, m120682 + 1, m120672, " \"'<>#", true, false, true, true, null));
                m120682 = m120672;
            }
            if (m120682 < m12052 && str.charAt(m120682) == '#') {
                this.f11148 = s.m11890(str, 1 + m120682, m12052, BuildConfig.FLAVOR, true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public a m11935(String str) {
            if (str == null) {
                throw new NullPointerException("password == null");
            }
            this.f11143 = s.m11891(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public a m11936(int i5) {
            if (i5 > 0 && i5 <= 65535) {
                this.f11145 = i5;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i5);
        }

        /* renamed from: ـ, reason: contains not printable characters */
        a m11937() {
            int size = this.f11146.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f11146.set(i5, s.m11891(this.f11146.get(i5), "[]", true, true, false, true));
            }
            List<String> list = this.f11147;
            if (list != null) {
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    String str = this.f11147.get(i6);
                    if (str != null) {
                        this.f11147.set(i6, s.m11891(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f11148;
            if (str2 != null) {
                this.f11148 = s.m11891(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        public a m11938(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.f11141 = "http";
            } else {
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                this.f11141 = "https";
            }
            return this;
        }

        /* renamed from: ᵔ, reason: contains not printable characters */
        public a m11939(String str) {
            if (str == null) {
                throw new NullPointerException("username == null");
            }
            this.f11142 = s.m11891(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }
    }

    s(a aVar) {
        this.f11132 = aVar.f11141;
        this.f11133 = m11899(aVar.f11142, false);
        this.f11134 = m11899(aVar.f11143, false);
        this.f11135 = aVar.f11144;
        this.f11136 = aVar.m11931();
        this.f11137 = m11900(aVar.f11146, false);
        List<String> list = aVar.f11147;
        this.f11138 = list != null ? m11900(list, true) : null;
        String str = aVar.f11148;
        this.f11139 = str != null ? m11899(str, false) : null;
        this.f11140 = aVar.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static String m11890(String str, int i5, int i6, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset) {
        int i7 = i5;
        while (i7 < i6) {
            int codePointAt = str.codePointAt(i7);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z8)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z5 && (!z6 || m11902(str, i7, i6)))) && (codePointAt != 43 || !z7))) {
                    i7 += Character.charCount(codePointAt);
                }
            }
            c5.c cVar = new c5.c();
            cVar.m5912(str, i5, i7);
            m11893(cVar, str, i7, i6, str2, z5, z6, z7, z8, charset);
            return cVar.m5879();
        }
        return str.substring(i5, i6);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static String m11891(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8) {
        return m11890(str, 0, str.length(), str2, z5, z6, z7, z8, null);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static String m11892(String str, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset) {
        return m11890(str, 0, str.length(), str2, z5, z6, z7, z8, charset);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static void m11893(c5.c cVar, String str, int i5, int i6, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset) {
        c5.c cVar2 = null;
        while (i5 < i6) {
            int codePointAt = str.codePointAt(i5);
            if (!z5 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z7) {
                    cVar.mo5901(z5 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z8) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z5 || (z6 && !m11902(str, i5, i6)))))) {
                    if (cVar2 == null) {
                        cVar2 = new c5.c();
                    }
                    if (charset == null || charset.equals(t4.c.f11332)) {
                        cVar2.m5898(codePointAt);
                    } else {
                        cVar2.m5908(str, i5, Character.charCount(codePointAt) + i5, charset);
                    }
                    while (!cVar2.mo5890()) {
                        int readByte = cVar2.readByte() & 255;
                        cVar.writeByte(37);
                        char[] cArr = f11131;
                        cVar.writeByte(cArr[(readByte >> 4) & 15]);
                        cVar.writeByte(cArr[readByte & 15]);
                    }
                } else {
                    cVar.m5898(codePointAt);
                }
            }
            i5 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static int m11894(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static s m11895(String str) {
        return new a().m11934(null, str).m11930();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static void m11896(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5 += 2) {
            String str = list.get(i5);
            String str2 = list.get(i5 + 1);
            if (i5 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    static void m11897(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb.append('/');
            sb.append(list.get(i5));
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    static String m11898(String str, int i5, int i6, boolean z5) {
        for (int i7 = i5; i7 < i6; i7++) {
            char charAt = str.charAt(i7);
            if (charAt == '%' || (charAt == '+' && z5)) {
                c5.c cVar = new c5.c();
                cVar.m5912(str, i5, i7);
                m11901(cVar, str, i7, i6, z5);
                return cVar.m5879();
            }
        }
        return str.substring(i5, i6);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    static String m11899(String str, boolean z5) {
        return m11898(str, 0, str.length(), z5);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private List<String> m11900(List<String> list, boolean z5) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            String str = list.get(i5);
            arrayList.add(str != null ? m11899(str, z5) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* renamed from: ⁱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void m11901(c5.c r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = t4.c.m12064(r2)
            char r3 = r6.charAt(r1)
            int r3 = t4.c.m12064(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.writeByte(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.writeByte(r1)
            goto L3c
        L39:
            r5.m5898(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s.m11901(c5.c, java.lang.String, int, int, boolean):void");
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static boolean m11902(String str, int i5, int i6) {
        int i7 = i5 + 2;
        return i7 < i6 && str.charAt(i5) == '%' && t4.c.m12064(str.charAt(i5 + 1)) != -1 && t4.c.m12064(str.charAt(i7)) != -1;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    static List<String> m11903(String str) {
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 <= str.length()) {
            int indexOf = str.indexOf(38, i5);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i5);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i5, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i5, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i5 = indexOf + 1;
        }
        return arrayList;
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof s) && ((s) obj).f11140.equals(this.f11140);
    }

    public int hashCode() {
        return this.f11140.hashCode();
    }

    public String toString() {
        return this.f11140;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public String m11904() {
        return this.f11132;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public URI m11905() {
        String aVar = m11914().m11937().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e5) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", BuildConfig.FLAVOR));
            } catch (Exception unused) {
                throw new RuntimeException(e5);
            }
        }
    }

    @Nullable
    /* renamed from: ˆ, reason: contains not printable characters */
    public String m11906() {
        if (this.f11139 == null) {
            return null;
        }
        return this.f11140.substring(this.f11140.indexOf(35) + 1);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public String m11907() {
        if (this.f11134.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return this.f11140.substring(this.f11140.indexOf(58, this.f11132.length() + 3) + 1, this.f11140.indexOf(64));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public String m11908() {
        int indexOf = this.f11140.indexOf(47, this.f11132.length() + 3);
        String str = this.f11140;
        return this.f11140.substring(indexOf, t4.c.m12068(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public List<String> m11909() {
        int indexOf = this.f11140.indexOf(47, this.f11132.length() + 3);
        String str = this.f11140;
        int m12068 = t4.c.m12068(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m12068) {
            int i5 = indexOf + 1;
            int m12067 = t4.c.m12067(this.f11140, i5, m12068, '/');
            arrayList.add(this.f11140.substring(i5, m12067));
            indexOf = m12067;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: ˋ, reason: contains not printable characters */
    public String m11910() {
        if (this.f11138 == null) {
            return null;
        }
        int indexOf = this.f11140.indexOf(63) + 1;
        String str = this.f11140;
        return this.f11140.substring(indexOf, t4.c.m12067(str, indexOf, str.length(), '#'));
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public String m11911() {
        if (this.f11133.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f11132.length() + 3;
        String str = this.f11140;
        return this.f11140.substring(length, t4.c.m12068(str, length, str.length(), ":@"));
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public String m11912() {
        return this.f11135;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m11913() {
        return this.f11132.equals("https");
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public a m11914() {
        a aVar = new a();
        aVar.f11141 = this.f11132;
        aVar.f11142 = m11911();
        aVar.f11143 = m11907();
        aVar.f11144 = this.f11135;
        aVar.f11145 = this.f11136 != m11894(this.f11132) ? this.f11136 : -1;
        aVar.f11146.clear();
        aVar.f11146.addAll(m11909());
        aVar.m11932(m11910());
        aVar.f11148 = m11906();
        return aVar;
    }

    @Nullable
    /* renamed from: ᐧ, reason: contains not printable characters */
    public a m11915(String str) {
        try {
            return new a().m11934(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public String m11916() {
        return m11915("/...").m11939(BuildConfig.FLAVOR).m11935(BuildConfig.FLAVOR).m11930().toString();
    }

    @Nullable
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public s m11917(String str) {
        a m11915 = m11915(str);
        if (m11915 != null) {
            return m11915.m11930();
        }
        return null;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public int m11918() {
        return this.f11136;
    }

    @Nullable
    /* renamed from: ﾞ, reason: contains not printable characters */
    public String m11919() {
        if (this.f11138 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m11896(sb, this.f11138);
        return sb.toString();
    }
}
