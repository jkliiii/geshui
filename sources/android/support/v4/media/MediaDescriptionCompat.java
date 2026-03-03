package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.r;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.u;
import android.text.TextUtils;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f124;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final CharSequence f125;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final CharSequence f126;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final CharSequence f127;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Bitmap f128;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final Uri f129;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Bundle f130;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final Uri f131;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Object f132;

    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m206(r.m241(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i5) {
            return new MediaDescriptionCompat[i5];
        }
    }

    public static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private String f133;

        /* renamed from: ʼ, reason: contains not printable characters */
        private CharSequence f134;

        /* renamed from: ʽ, reason: contains not printable characters */
        private CharSequence f135;

        /* renamed from: ʾ, reason: contains not printable characters */
        private CharSequence f136;

        /* renamed from: ʿ, reason: contains not printable characters */
        private Bitmap f137;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Uri f138;

        /* renamed from: ˈ, reason: contains not printable characters */
        private Bundle f139;

        /* renamed from: ˉ, reason: contains not printable characters */
        private Uri f140;

        /* renamed from: ʻ, reason: contains not printable characters */
        public MediaDescriptionCompat m210() {
            return new MediaDescriptionCompat(this.f133, this.f134, this.f135, this.f136, this.f137, this.f138, this.f139, this.f140);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public b m211(CharSequence charSequence) {
            this.f136 = charSequence;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public b m212(Bundle bundle) {
            this.f139 = bundle;
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public b m213(Bitmap bitmap) {
            this.f137 = bitmap;
            return this;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public b m214(Uri uri) {
            this.f138 = uri;
            return this;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public b m215(String str) {
            this.f133 = str;
            return this;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public b m216(Uri uri) {
            this.f140 = uri;
            return this;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public b m217(CharSequence charSequence) {
            this.f135 = charSequence;
            return this;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public b m218(CharSequence charSequence) {
            this.f134 = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f124 = str;
        this.f125 = charSequence;
        this.f126 = charSequence2;
        this.f127 = charSequence3;
        this.f128 = bitmap;
        this.f129 = uri;
        this.f130 = bundle;
        this.f131 = uri2;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static MediaDescriptionCompat m206(Object obj) {
        int i5;
        Uri uri;
        Bundle bundle = null;
        if (obj == null || (i5 = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        b bVar = new b();
        bVar.m215(r.m246(obj));
        bVar.m218(r.m248(obj));
        bVar.m217(r.m247(obj));
        bVar.m211(r.m242(obj));
        bVar.m213(r.m244(obj));
        bVar.m214(r.m245(obj));
        Bundle m243 = r.m243(obj);
        if (m243 != null) {
            MediaSessionCompat.m267(m243);
            uri = (Uri) m243.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = m243;
        } else if (!m243.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || m243.size() != 2) {
            m243.remove("android.support.v4.media.description.MEDIA_URI");
            m243.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = m243;
        }
        bVar.m212(bundle);
        if (uri != null) {
            bVar.m216(uri);
        } else if (i5 >= 23) {
            bVar.m216(u.m356(obj));
        }
        MediaDescriptionCompat m210 = bVar.m210();
        m210.f132 = obj;
        return m210;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f125) + ", " + ((Object) this.f126) + ", " + ((Object) this.f127);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            r.m249(m207(), parcel, i5);
            return;
        }
        parcel.writeString(this.f124);
        TextUtils.writeToParcel(this.f125, parcel, i5);
        TextUtils.writeToParcel(this.f126, parcel, i5);
        TextUtils.writeToParcel(this.f127, parcel, i5);
        parcel.writeParcelable(this.f128, i5);
        parcel.writeParcelable(this.f129, i5);
        parcel.writeBundle(this.f130);
        parcel.writeParcelable(this.f131, i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public Object m207() {
        int i5;
        Object obj = this.f132;
        if (obj != null || (i5 = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object m251 = r.a.m251();
        r.a.m256(m251, this.f124);
        r.a.m258(m251, this.f125);
        r.a.m257(m251, this.f126);
        r.a.m252(m251, this.f127);
        r.a.m254(m251, this.f128);
        r.a.m255(m251, this.f129);
        Bundle bundle = this.f130;
        if (i5 < 23 && this.f131 != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f131);
        }
        r.a.m253(m251, bundle);
        if (i5 >= 23) {
            u.a.m357(m251, this.f131);
        }
        Object m250 = r.a.m250(m251);
        this.f132 = m250;
        return m250;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f124 = parcel.readString();
        this.f125 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f126 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f127 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f128 = (Bitmap) parcel.readParcelable(classLoader);
        this.f129 = (Uri) parcel.readParcelable(classLoader);
        this.f130 = parcel.readBundle(classLoader);
        this.f131 = (Uri) parcel.readParcelable(classLoader);
    }
}
