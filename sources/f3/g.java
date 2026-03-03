package f3;

import java.util.HashMap;
import java.util.Locale;

/* compiled from: MediaFile.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final HashMap<String, a> f7730 = new HashMap<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final HashMap<String, Integer> f7731 = new HashMap<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final HashMap<String, Integer> f7732 = new HashMap<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final HashMap<String, Integer> f7733 = new HashMap<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final HashMap<Integer, String> f7734 = new HashMap<>();

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final HashMap<String, String> f7735 = new HashMap<>();

    /* compiled from: MediaFile.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int f7736;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final String f7737;

        a(int i5, String str) {
            this.f7736 = i5;
            this.f7737 = str;
        }
    }

    static {
        m8597("MP3", 1, "audio/mpeg", 12297);
        m8597("MPGA", 1, "audio/mpeg", 12297);
        m8597("M4A", 2, "audio/mp4", 12299);
        m8597("WAV", 3, "audio/x-wav", 12296);
        m8596("WAV", 15, "audio/wav");
        m8596("AMR", 4, "audio/amr");
        m8596("AWB", 5, "audio/amr-wb");
        m8596("DIVX", 31, "video/divx");
        m8596("QCP", 13, "audio/qcelp");
        m8597("OGG", 7, "audio/ogg", 47362);
        m8597("OGG", 7, "application/ogg", 47362);
        m8597("OGA", 7, "audio/ogg", 47362);
        m8597("OGA", 7, "application/ogg", 47362);
        m8597("AAC", 8, "audio/aac", 47363);
        m8597("AAC", 8, "audio/aac-adts", 47363);
        m8596("MKA", 9, "audio/x-matroska");
        m8596("MID", 17, "audio/midi");
        m8596("MIDI", 17, "audio/midi");
        m8596("XMF", 17, "audio/midi");
        m8596("RTTTL", 17, "audio/midi");
        m8596("SMF", 18, "audio/sp-midi");
        m8596("IMY", 19, "audio/imelody");
        m8596("RTX", 17, "audio/midi");
        m8596("OTA", 17, "audio/midi");
        m8596("MXMF", 17, "audio/midi");
        m8597("MPEG", 21, "video/mpeg", 12299);
        m8597("MPG", 21, "video/mpeg", 12299);
        m8597("MP4", 21, "video/mp4", 12299);
        m8597("MPEG4", 21, "video/mpeg4", 12299);
        m8597("M4V", 22, "video/m4v", 12299);
        m8597("3GP", 23, "video/3gpp", 47492);
        m8597("3GPP", 23, "video/3gpp", 47492);
        m8597("3G2", 24, "video/3gpp2", 47492);
        m8597("3GPP2", 24, "video/3gpp2", 47492);
        m8596("MKV", 27, "video/x-matroska");
        m8596("WEBM", 30, "video/webm");
        m8596("TS", 28, "video/mp2ts");
        m8596("MPG", 28, "video/mp2ts");
        m8596("AVI", 29, "video/avi");
        m8597("JPG", 32, "image/jpeg", 14337);
        m8597("JPEG", 32, "image/jpeg", 14337);
        m8597("GIF", 33, "image/gif", 14343);
        m8597("PNG", 34, "image/png", 14347);
        m8597("BMP", 35, "image/x-ms-bmp", 14340);
        m8596("WBMP", 36, "image/vnd.wap.wbmp");
        m8596("WEBP", 37, "image/webp");
        m8597("M3U", 41, "audio/x-mpegurl", 47633);
        m8597("M3U", 41, "application/x-mpegurl", 47633);
        m8597("PLS", 42, "audio/x-scpls", 47636);
        m8597("WPL", 43, "application/vnd.ms-wpl", 47632);
        m8596("M3U8", 44, "application/vnd.apple.mpegurl");
        m8596("M3U8", 44, "audio/mpegurl");
        m8596("M3U8", 44, "audio/x-mpegurl");
        m8596("FL", 51, "application/x-android-drm-fl");
        m8597("TXT", 100, "text/plain", 12292);
        m8597("HTM", 101, "text/html", 12293);
        m8597("HTML", 101, "text/html", 12293);
        m8596("PDF", 102, "application/pdf");
        m8597("DOC", 104, "application/msword", 47747);
        m8597("XLS", 105, "application/vnd.ms-excel", 47749);
        m8597("PPT", 106, "application/mspowerpoint", 47750);
        m8597("FLAC", 10, "audio/flac", 47366);
        m8596("ZIP", 107, "application/zip");
        m8596("MPG", 200, "video/mp2p");
        m8596("MPEG", 200, "video/mp2p");
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m8596(String str, int i5, String str2) {
        f7730.put(str, new a(i5, str2));
        f7731.put(str2, Integer.valueOf(i5));
        f7735.put(str2, str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m8597(String str, int i5, String str2, int i6) {
        m8596(str, i5, str2);
        f7732.put(str, Integer.valueOf(i6));
        f7733.put(str2, Integer.valueOf(i6));
        f7734.put(Integer.valueOf(i6), str2);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static a m8598(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return null;
        }
        return f7730.get(str.substring(lastIndexOf + 1).toUpperCase(Locale.ROOT));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m8599(int i5) {
        return (i5 >= 21 && i5 <= 31) || (i5 >= 200 && i5 <= 200);
    }
}
