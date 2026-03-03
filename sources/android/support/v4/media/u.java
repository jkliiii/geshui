package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* compiled from: MediaDescriptionCompatApi23.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class u {

    /* compiled from: MediaDescriptionCompatApi23.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static void m357(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Uri m356(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
