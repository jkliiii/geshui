package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;

/* compiled from: MediaDescriptionCompatApi21.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class r {

    /* compiled from: MediaDescriptionCompatApi21.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static Object m250(Object obj) {
            return ((MediaDescription.Builder) obj).build();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static Object m251() {
            return new MediaDescription.Builder();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static void m252(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setDescription(charSequence);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public static void m253(Object obj, Bundle bundle) {
            ((MediaDescription.Builder) obj).setExtras(bundle);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static void m254(Object obj, Bitmap bitmap) {
            ((MediaDescription.Builder) obj).setIconBitmap(bitmap);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public static void m255(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setIconUri(uri);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public static void m256(Object obj, String str) {
            ((MediaDescription.Builder) obj).setMediaId(str);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public static void m257(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setSubtitle(charSequence);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public static void m258(Object obj, CharSequence charSequence) {
            ((MediaDescription.Builder) obj).setTitle(charSequence);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Object m241(Parcel parcel) {
        return MediaDescription.CREATOR.createFromParcel(parcel);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static CharSequence m242(Object obj) {
        return ((MediaDescription) obj).getDescription();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Bundle m243(Object obj) {
        return ((MediaDescription) obj).getExtras();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static Bitmap m244(Object obj) {
        return ((MediaDescription) obj).getIconBitmap();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Uri m245(Object obj) {
        return ((MediaDescription) obj).getIconUri();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static String m246(Object obj) {
        return ((MediaDescription) obj).getMediaId();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static CharSequence m247(Object obj) {
        return ((MediaDescription) obj).getSubtitle();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static CharSequence m248(Object obj) {
        return ((MediaDescription) obj).getTitle();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m249(Object obj, Parcel parcel, int i5) {
        ((MediaDescription) obj).writeToParcel(parcel, i5);
    }
}
