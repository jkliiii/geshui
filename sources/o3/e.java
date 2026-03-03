package o3;

/* compiled from: NetworkInfo.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final e f10110 = new e(a.NO_NETWORK, 0);

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final e f10111 = new e(a.WIFI, 0);

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int f10112;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final a f10113;

    /* compiled from: NetworkInfo.java */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public e(a aVar, int i5) {
        this.f10113 = aVar;
        this.f10112 = i5;
    }
}
