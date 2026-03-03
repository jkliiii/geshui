package s4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: CipherSuite.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    final String f11072;

    /* renamed from: ʼ, reason: contains not printable characters */
    static final Comparator<String> f10976 = new a();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Map<String, g> f11002 = new LinkedHashMap();

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final g f11028 = m11802("SSL_RSA_WITH_NULL_MD5", 1);

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final g f11030 = m11802("SSL_RSA_WITH_NULL_SHA", 2);

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final g f11032 = m11802("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final g f11034 = m11802("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final g f11036 = m11802("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final g f11038 = m11802("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final g f11040 = m11802("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final g f11042 = m11802("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final g f11044 = m11802("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* renamed from: ˑ, reason: contains not printable characters */
    public static final g f11046 = m11802("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* renamed from: י, reason: contains not printable characters */
    public static final g f11048 = m11802("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* renamed from: ـ, reason: contains not printable characters */
    public static final g f11050 = m11802("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* renamed from: ٴ, reason: contains not printable characters */
    public static final g f11052 = m11802("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static final g f11054 = m11802("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static final g f11056 = m11802("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static final g f11058 = m11802("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static final g f11060 = m11802("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static final g f11062 = m11802("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* renamed from: ⁱ, reason: contains not printable characters */
    public static final g f11064 = m11802("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final g f11066 = m11802("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final g f11068 = m11802("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final g f11070 = m11802("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final g f11071 = m11802("TLS_KRB5_WITH_DES_CBC_MD5", 34);

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static final g f11055 = m11802("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static final g f11057 = m11802("TLS_KRB5_WITH_RC4_128_MD5", 36);

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static final g f10951 = m11802("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static final g f11005 = m11802("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static final g f10978 = m11802("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static final g f11031 = m11802("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static final g f11029 = m11802("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: ــ, reason: contains not printable characters */
    public static final g f11051 = m11802("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public static final g f11033 = m11802("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public static final g f11037 = m11802("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public static final g f11035 = m11802("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public static final g f11041 = m11802("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static final g f11039 = m11802("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public static final g f11045 = m11802("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public static final g f11043 = m11802("TLS_RSA_WITH_NULL_SHA256", 59);

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public static final g f11047 = m11802("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public static final g f11061 = m11802("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);

    /* renamed from: יי, reason: contains not printable characters */
    public static final g f11049 = m11802("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    public static final g f11059 = m11802("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public static final g f11063 = m11802("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public static final g f11065 = m11802("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public static final g f11067 = m11802("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public static final g f11053 = m11802("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    public static final g f11069 = m11802("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static final g f10952 = m11802("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public static final g f10953 = m11802("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);

    /* renamed from: ʻʾ, reason: contains not printable characters */
    public static final g f10954 = m11802("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* renamed from: ʻʿ, reason: contains not printable characters */
    public static final g f10955 = m11802("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);

    /* renamed from: ʻˆ, reason: contains not printable characters */
    public static final g f10956 = m11802("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* renamed from: ʻˈ, reason: contains not printable characters */
    public static final g f10957 = m11802("TLS_PSK_WITH_RC4_128_SHA", 138);

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public static final g f10958 = m11802("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* renamed from: ʻˊ, reason: contains not printable characters */
    public static final g f10959 = m11802("TLS_PSK_WITH_AES_128_CBC_SHA", 140);

    /* renamed from: ʻˋ, reason: contains not printable characters */
    public static final g f10960 = m11802("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* renamed from: ʻˎ, reason: contains not printable characters */
    public static final g f10961 = m11802("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* renamed from: ʻˏ, reason: contains not printable characters */
    public static final g f10962 = m11802("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public static final g f10963 = m11802("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: ʻי, reason: contains not printable characters */
    public static final g f10964 = m11802("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* renamed from: ʻـ, reason: contains not printable characters */
    public static final g f10965 = m11802("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* renamed from: ʻٴ, reason: contains not printable characters */
    public static final g f10966 = m11802("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public static final g f10967 = m11802("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    public static final g f10968 = m11802("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    public static final g f10969 = m11802("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    public static final g f10970 = m11802("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    public static final g f10971 = m11802("TLS_FALLBACK_SCSV", 22016);

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    public static final g f10972 = m11802("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    public static final g f10973 = m11802("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public static final g f10974 = m11802("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    public static final g f10975 = m11802("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* renamed from: ʼʻ, reason: contains not printable characters */
    public static final g f10977 = m11802("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* renamed from: ʼʽ, reason: contains not printable characters */
    public static final g f10979 = m11802("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* renamed from: ʼʾ, reason: contains not printable characters */
    public static final g f10980 = m11802("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* renamed from: ʼʿ, reason: contains not printable characters */
    public static final g f10981 = m11802("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);

    /* renamed from: ʼˆ, reason: contains not printable characters */
    public static final g f10982 = m11802("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);

    /* renamed from: ʼˈ, reason: contains not printable characters */
    public static final g f10983 = m11802("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);

    /* renamed from: ʼˉ, reason: contains not printable characters */
    public static final g f10984 = m11802("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);

    /* renamed from: ʼˊ, reason: contains not printable characters */
    public static final g f10985 = m11802("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);

    /* renamed from: ʼˋ, reason: contains not printable characters */
    public static final g f10986 = m11802("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);

    /* renamed from: ʼˎ, reason: contains not printable characters */
    public static final g f10987 = m11802("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);

    /* renamed from: ʼˏ, reason: contains not printable characters */
    public static final g f10988 = m11802("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);

    /* renamed from: ʼˑ, reason: contains not printable characters */
    public static final g f10989 = m11802("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);

    /* renamed from: ʼי, reason: contains not printable characters */
    public static final g f10990 = m11802("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);

    /* renamed from: ʼـ, reason: contains not printable characters */
    public static final g f10991 = m11802("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);

    /* renamed from: ʼٴ, reason: contains not printable characters */
    public static final g f10992 = m11802("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    public static final g f10993 = m11802("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    public static final g f10994 = m11802("TLS_ECDH_anon_WITH_NULL_SHA", 49173);

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    public static final g f10995 = m11802("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    public static final g f10996 = m11802("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);

    /* renamed from: ʼᵢ, reason: contains not printable characters */
    public static final g f10997 = m11802("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    public static final g f10998 = m11802("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    public static final g f10999 = m11802("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    public static final g f11000 = m11802("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    public static final g f11001 = m11802("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);

    /* renamed from: ʽʻ, reason: contains not printable characters */
    public static final g f11003 = m11802("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);

    /* renamed from: ʽʼ, reason: contains not printable characters */
    public static final g f11004 = m11802("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);

    /* renamed from: ʽʾ, reason: contains not printable characters */
    public static final g f11006 = m11802("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);

    /* renamed from: ʽʿ, reason: contains not printable characters */
    public static final g f11007 = m11802("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);

    /* renamed from: ʽˆ, reason: contains not printable characters */
    public static final g f11008 = m11802("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);

    /* renamed from: ʽˈ, reason: contains not printable characters */
    public static final g f11009 = m11802("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: ʽˉ, reason: contains not printable characters */
    public static final g f11010 = m11802("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: ʽˊ, reason: contains not printable characters */
    public static final g f11011 = m11802("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* renamed from: ʽˋ, reason: contains not printable characters */
    public static final g f11012 = m11802("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* renamed from: ʽˎ, reason: contains not printable characters */
    public static final g f11013 = m11802("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: ʽˏ, reason: contains not printable characters */
    public static final g f11014 = m11802("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: ʽˑ, reason: contains not printable characters */
    public static final g f11015 = m11802("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* renamed from: ʽי, reason: contains not printable characters */
    public static final g f11016 = m11802("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);

    /* renamed from: ʽـ, reason: contains not printable characters */
    public static final g f11017 = m11802("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* renamed from: ʽٴ, reason: contains not printable characters */
    public static final g f11018 = m11802("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    public static final g f11019 = m11802("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: ʽᴵ, reason: contains not printable characters */
    public static final g f11020 = m11802("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: ʽᵎ, reason: contains not printable characters */
    public static final g f11021 = m11802("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* renamed from: ʽᵔ, reason: contains not printable characters */
    public static final g f11022 = m11802("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* renamed from: ʽᵢ, reason: contains not printable characters */
    public static final g f11023 = m11802("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    public static final g f11024 = m11802("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: ʽﹳ, reason: contains not printable characters */
    public static final g f11025 = m11802("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: ʽﹶ, reason: contains not printable characters */
    public static final g f11026 = m11802("TLS_AES_128_CCM_SHA256", 4868);

    /* renamed from: ʽﾞ, reason: contains not printable characters */
    public static final g f11027 = m11802("TLS_AES_256_CCM_8_SHA256", 4869);

    /* compiled from: CipherSuite.java */
    class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int min = Math.min(str.length(), str2.length());
            for (int i5 = 4; i5 < min; i5++) {
                char charAt = str.charAt(i5);
                char charAt2 = str2.charAt(i5);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    private g(String str) {
        str.getClass();
        this.f11072 = str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static synchronized g m11800(String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = f11002;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(m11803(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static List<g> m11801(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(m11800(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static g m11802(String str, int i5) {
        g gVar = new g(str);
        f11002.put(str, gVar);
        return gVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static String m11803(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f11072;
    }
}
