package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    public int f161;

    /* renamed from: ʿ, reason: contains not printable characters */
    public int f162;

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f163;

    /* renamed from: ˈ, reason: contains not printable characters */
    public int f164;

    /* renamed from: ˉ, reason: contains not printable characters */
    public int f165;

    static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public ParcelableVolumeInfo[] newArray(int i5) {
            return new ParcelableVolumeInfo[i5];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f161 = parcel.readInt();
        this.f163 = parcel.readInt();
        this.f164 = parcel.readInt();
        this.f165 = parcel.readInt();
        this.f162 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f161);
        parcel.writeInt(this.f163);
        parcel.writeInt(this.f164);
        parcel.writeInt(this.f165);
        parcel.writeInt(this.f162);
    }
}
