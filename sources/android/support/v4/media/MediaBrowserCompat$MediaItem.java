package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f122;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final MediaDescriptionCompat f123;

    static class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public MediaBrowserCompat$MediaItem[] newArray(int i5) {
            return new MediaBrowserCompat$MediaItem[i5];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f122 = parcel.readInt();
        this.f123 = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f122 + ", mDescription=" + this.f123 + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f122);
        this.f123.writeToParcel(parcel, i5);
    }
}
