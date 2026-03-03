package n2;

import java.util.Hashtable;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Protocol.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class y {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final y f9684;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final y f9685;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final y f9686;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final y f9687;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final Hashtable<String, y> f9688;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final /* synthetic */ y[] f9689;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f9690;

    /* compiled from: Protocol.java */
    enum a extends y {
        a(String str, int i5, String str2) {
            super(str, i5, str2, null);
        }
    }

    static {
        y yVar = new y("HTTP_1_0", 0, "http/1.0");
        f9684 = yVar;
        y yVar2 = new y("HTTP_1_1", 1, "http/1.1");
        f9685 = yVar2;
        a aVar = new a("SPDY_3", 2, "spdy/3.1");
        f9686 = aVar;
        y yVar3 = new y("HTTP_2", 3, "h2-13") { // from class: n2.y.b
            {
                a aVar2 = null;
            }
        };
        f9687 = yVar3;
        f9689 = new y[]{yVar, yVar2, aVar, yVar3};
        Hashtable<String, y> hashtable = new Hashtable<>();
        f9688 = hashtable;
        hashtable.put(yVar.toString(), yVar);
        hashtable.put(yVar2.toString(), yVar2);
        hashtable.put(aVar.toString(), aVar);
        hashtable.put(yVar3.toString(), yVar3);
    }

    /* synthetic */ y(String str, int i5, String str2, a aVar) {
        this(str, i5, str2);
    }

    public static y valueOf(String str) {
        return (y) Enum.valueOf(y.class, str);
    }

    public static y[] values() {
        return (y[]) f9689.clone();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static y m10579(String str) {
        if (str == null) {
            return null;
        }
        return f9688.get(str.toLowerCase(Locale.US));
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f9690;
    }

    private y(String str, int i5, String str2) {
        this.f9690 = str2;
    }
}
