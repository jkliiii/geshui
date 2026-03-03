package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* loaded from: E:\78999\cookie_5123796.dex */
public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new a();
    private final long point;

    class a implements Parcelable.Creator<DateValidatorPointBackward> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public DateValidatorPointBackward[] newArray(int i5) {
            return new DateValidatorPointBackward[i5];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j5, a aVar) {
        this(j5);
    }

    public static DateValidatorPointBackward before(long j5) {
        return new DateValidatorPointBackward(j5);
    }

    public static DateValidatorPointBackward now() {
        return before(w.m6784().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointBackward) && this.point == ((DateValidatorPointBackward) obj).point;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.point)});
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j5) {
        return j5 <= this.point;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeLong(this.point);
    }

    private DateValidatorPointBackward(long j5) {
        this.point = j5;
    }
}
