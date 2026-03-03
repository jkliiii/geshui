package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final r0.a f4691;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i5) {
            return new ParcelImpl[i5];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4691 = new b(parcel).m5546();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        new b(parcel).m5532(this.f4691);
    }
}
