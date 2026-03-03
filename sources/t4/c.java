package t4;

import c5.e;
import c5.f;
import c5.s;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import s4.b0;
import s4.r;
import s4.z;

/* compiled from: Util.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final byte[] f11323;

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final b0 f11325;

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final z f11326;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static final Method f11340;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static final Pattern f11341;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final String[] f11324 = new String[0];

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final f f11327 = f.m5917("efbbbf");

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final f f11328 = f.m5917("feff");

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final f f11329 = f.m5917("fffe");

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final f f11330 = f.m5917("0000ffff");

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final f f11331 = f.m5917("ffff0000");

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final Charset f11332 = Charset.forName("UTF-8");

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final Charset f11333 = Charset.forName("ISO-8859-1");

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Charset f11334 = Charset.forName("UTF-16BE");

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final Charset f11335 = Charset.forName("UTF-16LE");

    /* renamed from: י, reason: contains not printable characters */
    private static final Charset f11336 = Charset.forName("UTF-32BE");

    /* renamed from: ـ, reason: contains not printable characters */
    private static final Charset f11337 = Charset.forName("UTF-32LE");

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final TimeZone f11338 = TimeZone.getTimeZone("GMT");

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final Comparator<String> f11339 = new a();

    /* compiled from: Util.java */
    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* compiled from: Util.java */
    class b implements ThreadFactory {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f11342;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ boolean f11343;

        b(String str, boolean z5) {
            this.f11342 = str;
            this.f11343 = z5;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f11342);
            thread.setDaemon(this.f11343);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f11323 = bArr;
        Method method = null;
        f11325 = b0.m11760(null, bArr);
        f11326 = z.m12021(null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f11340 = method;
        f11341 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m12049(Throwable th, Throwable th2) {
        Method method = f11340;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static boolean m12050(s sVar, int i5, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long mo5940 = sVar.mo5868().mo5942() ? sVar.mo5868().mo5940() - nanoTime : Long.MAX_VALUE;
        sVar.mo5868().mo5941(Math.min(mo5940, timeUnit.toNanos(i5)) + nanoTime);
        try {
            c5.c cVar = new c5.c();
            while (sVar.mo5869(cVar, 8192L) != -1) {
                cVar.m5911();
            }
            if (mo5940 == Long.MAX_VALUE) {
                sVar.mo5868().mo5938();
                return true;
            }
            sVar.mo5868().mo5941(nanoTime + mo5940);
            return true;
        } catch (InterruptedIOException unused) {
            if (mo5940 == Long.MAX_VALUE) {
                sVar.mo5868().mo5938();
                return false;
            }
            sVar.mo5868().mo5941(nanoTime + mo5940);
            return false;
        } catch (Throwable th) {
            if (mo5940 == Long.MAX_VALUE) {
                sVar.mo5868().mo5938();
            } else {
                sVar.mo5868().mo5941(nanoTime + mo5940);
            }
            throw th;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static AssertionError m12051(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static int m12052(String str, int i5, int i6) {
        for (int i7 = i6 - 1; i7 >= i5; i7--) {
            char charAt = str.charAt(i7);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i7 + 1;
            }
        }
        return i5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Charset m12053(e eVar, Charset charset) throws IOException {
        if (eVar.mo5880(0L, f11327)) {
            eVar.skip(r0.mo5930());
            return f11332;
        }
        if (eVar.mo5880(0L, f11328)) {
            eVar.skip(r0.mo5930());
            return f11334;
        }
        if (eVar.mo5880(0L, f11329)) {
            eVar.skip(r0.mo5930());
            return f11335;
        }
        if (eVar.mo5880(0L, f11330)) {
            eVar.skip(r0.mo5930());
            return f11336;
        }
        if (!eVar.mo5880(0L, f11331)) {
            return charset;
        }
        eVar.skip(r0.mo5930());
        return f11337;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static int m12054(String str, int i5, int i6) {
        while (i5 < i6) {
            char charAt = str.charAt(i5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static String m12055(String str) {
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (m12063(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress m12066 = (str.startsWith("[") && str.endsWith("]")) ? m12066(str, 1, str.length() - 1) : m12066(str, 0, str.length());
        if (m12066 == null) {
            return null;
        }
        byte[] address = m12066.getAddress();
        if (address.length == 16) {
            return m12081(address);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + "'");
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static r m12056(List<y4.c> list) {
        r.a aVar = new r.a();
        for (y4.c cVar : list) {
            t4.a.f11321.mo11978(aVar, cVar.f12504.mo5935(), cVar.f12505.mo5935());
        }
        return aVar.m11887();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m12057(long j5, long j6, long j7) {
        if ((j6 | j7) < 0 || j6 > j5 || j5 - j6 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static ThreadFactory m12058(String str, boolean z5) {
        return new b(str, z5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12059(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static boolean m12060(String str) {
        return f11341.matcher(str).matches();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m12061(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e5) {
                if (!m12083(e5)) {
                    throw e5;
                }
            } catch (RuntimeException e6) {
                if (!"bio == null".equals(e6.getMessage())) {
                    throw e6;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static String[] m12062(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m12063(String str) {
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m12064(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        char c7 = 'a';
        if (c6 < 'a' || c6 > 'f') {
            c7 = 'A';
            if (c6 < 'A' || c6 > 'F') {
                return -1;
            }
        }
        return (c6 - c7) + 10;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m12065(String str, int i5, int i6, byte[] bArr, int i7) {
        int i8 = i7;
        while (i5 < i6) {
            if (i8 == bArr.length) {
                return false;
            }
            if (i8 != i7) {
                if (str.charAt(i5) != '.') {
                    return false;
                }
                i5++;
            }
            int i9 = i5;
            int i10 = 0;
            while (i9 < i6) {
                char charAt = str.charAt(i9);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                if ((i10 == 0 && i5 != i9) || (i10 = ((i10 * 10) + charAt) - 48) > 255) {
                    return false;
                }
                i9++;
            }
            if (i9 - i5 == 0) {
                return false;
            }
            bArr[i8] = (byte) i10;
            i8++;
            i5 = i9;
        }
        return i8 == i7 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    @javax.annotation.Nullable
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress m12066(java.lang.String r11, int r12, int r13) {
        /*
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r2, r10)
            if (r9 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r2, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r2, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = m12065(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r12 = r6
            r8 = 0
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = m12064(r9)
            if (r9 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r3) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            goto L97
        L96:
            throw r11
        L97:
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.c.m12066(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static int m12067(String str, int i5, int i6, char c6) {
        while (i5 < i6) {
            if (str.charAt(i5) == c6) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* renamed from: י, reason: contains not printable characters */
    public static int m12068(String str, int i5, int i6, String str2) {
        while (i5 < i6) {
            if (str2.indexOf(str.charAt(i5)) != -1) {
                return i5;
            }
            i5++;
        }
        return i6;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static boolean m12069(s sVar, int i5, TimeUnit timeUnit) {
        try {
            return m12050(sVar, i5, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public static String m12070(String str, int i5, int i6) {
        int m12054 = m12054(str, i5, i6);
        return str.substring(m12054, m12052(str, m12054, i6));
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static boolean m12071(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static String m12072(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static boolean m12073(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static String m12074(s4.s sVar, boolean z5) {
        String m11912;
        if (sVar.m11912().contains(":")) {
            m11912 = "[" + sVar.m11912() + "]";
        } else {
            m11912 = sVar.m11912();
        }
        if (!z5 && sVar.m11918() == s4.s.m11894(sVar.m11904())) {
            return m11912;
        }
        return m11912 + ":" + sVar.m11918();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static X509TrustManager m12075() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
            if (trustManagers.length == 1) {
                TrustManager trustManager = trustManagers[0];
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e5) {
            throw m12051("No System TLS", e5);
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static <T> List<T> m12076(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static <T> List<T> m12077(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m12078(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static int m12079(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (comparator.compare(strArr[i5], str) == 0) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static int m12080(String str) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (charAt <= 31 || charAt >= 127) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static String m12081(byte[] bArr) {
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i7 < bArr.length) {
            int i9 = i7;
            while (i9 < 16 && bArr[i9] == 0 && bArr[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i5 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        c5.c cVar = new c5.c();
        while (i6 < bArr.length) {
            if (i6 == i5) {
                cVar.writeByte(58);
                i6 += i8;
                if (i6 == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i6 > 0) {
                    cVar.writeByte(58);
                }
                cVar.mo5876(((bArr[i6] & 255) << 8) | (bArr[i6 + 1] & 255));
                i6 += 2;
            }
        }
        return cVar.m5879();
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static String[] m12082(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i5]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i5++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static boolean m12083(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
