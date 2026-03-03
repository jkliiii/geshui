package d1;

import android.net.Uri;

/* compiled from: MediaStoreUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m8175(Uri uri) {
        return m8177(uri) && uri.getPathSegments().contains("picker");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m8176(Uri uri) {
        return m8177(uri) && !m8180(uri);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m8177(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m8178(Uri uri) {
        return m8177(uri) && m8180(uri);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static boolean m8179(int i5, int i6) {
        return i5 != Integer.MIN_VALUE && i6 != Integer.MIN_VALUE && i5 <= 512 && i6 <= 384;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static boolean m8180(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
