package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f147;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final float f148;

    static class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public RatingCompat[] newArray(int i5) {
            return new RatingCompat[i5];
        }
    }

    RatingCompat(int i5, float f5) {
        this.f147 = i5;
        this.f148 = f5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f147;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f147);
        sb.append(" rating=");
        float f5 = this.f148;
        sb.append(f5 < 0.0f ? "unrated" : String.valueOf(f5));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f147);
        parcel.writeFloat(this.f148);
    }
}
