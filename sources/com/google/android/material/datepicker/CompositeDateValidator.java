package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    private static final int COMPARATOR_ALL_ID = 2;
    private static final int COMPARATOR_ANY_ID = 1;
    private final d operator;
    private final List<CalendarConstraints.DateValidator> validators;
    private static final d ANY_OPERATOR = new a();
    private static final d ALL_OPERATOR = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    class a implements d {
        a() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 1;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo6662(List<CalendarConstraints.DateValidator> list, long j5) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j5)) {
                    return true;
                }
            }
            return false;
        }
    }

    class b implements d {
        b() {
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public int getId() {
            return 2;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        /* renamed from: ʻ */
        public boolean mo6662(List<CalendarConstraints.DateValidator> list, long j5) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j5)) {
                    return false;
                }
            }
            return true;
        }
    }

    class c implements Parcelable.Creator<CompositeDateValidator> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            return new CompositeDateValidator((List) androidx.core.util.h.m2583(readArrayList), readInt == 2 ? CompositeDateValidator.ALL_OPERATOR : readInt == 1 ? CompositeDateValidator.ANY_OPERATOR : CompositeDateValidator.ALL_OPERATOR, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CompositeDateValidator[] newArray(int i5) {
            return new CompositeDateValidator[i5];
        }
    }

    private interface d {
        int getId();

        /* renamed from: ʻ */
        boolean mo6662(List<CalendarConstraints.DateValidator> list, long j5);
    }

    /* synthetic */ CompositeDateValidator(List list, d dVar, a aVar) {
        this(list, dVar);
    }

    public static CalendarConstraints.DateValidator allOf(List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ALL_OPERATOR);
    }

    public static CalendarConstraints.DateValidator anyOf(List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, ANY_OPERATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.validators.equals(compositeDateValidator.validators) && this.operator.getId() == compositeDateValidator.operator.getId();
    }

    public int hashCode() {
        return this.validators.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j5) {
        return this.operator.mo6662(this.validators, j5);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeList(this.validators);
        parcel.writeInt(this.operator.getId());
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list, d dVar) {
        this.validators = list;
        this.operator = dVar;
    }
}
