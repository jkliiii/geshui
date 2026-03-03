package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    private final m end;
    private final int firstDayOfWeek;
    private final int monthSpan;
    private m openAt;
    private final m start;
    private final DateValidator validator;
    private final int yearSpan;

    public interface DateValidator extends Parcelable {
        boolean isValid(long j5);
    }

    class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i5) {
            return new CalendarConstraints[i5];
        }
    }

    /* synthetic */ CalendarConstraints(m mVar, m mVar2, DateValidator dateValidator, m mVar3, int i5, a aVar) {
        this(mVar, mVar2, dateValidator, mVar3, i5);
    }

    m clamp(m mVar) {
        return mVar.compareTo(this.start) < 0 ? this.start : mVar.compareTo(this.end) > 0 ? this.end : mVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.start.equals(calendarConstraints.start) && this.end.equals(calendarConstraints.end) && androidx.core.util.c.m2568(this.openAt, calendarConstraints.openAt) && this.firstDayOfWeek == calendarConstraints.firstDayOfWeek && this.validator.equals(calendarConstraints.validator);
    }

    public DateValidator getDateValidator() {
        return this.validator;
    }

    m getEnd() {
        return this.end;
    }

    public long getEndMs() {
        return this.end.f5689;
    }

    int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    int getMonthSpan() {
        return this.monthSpan;
    }

    m getOpenAt() {
        return this.openAt;
    }

    public Long getOpenAtMs() {
        m mVar = this.openAt;
        if (mVar == null) {
            return null;
        }
        return Long.valueOf(mVar.f5689);
    }

    m getStart() {
        return this.start;
    }

    public long getStartMs() {
        return this.start.f5689;
    }

    int getYearSpan() {
        return this.yearSpan;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.start, this.end, this.openAt, Integer.valueOf(this.firstDayOfWeek), this.validator});
    }

    boolean isWithinBounds(long j5) {
        if (this.start.m6734(1) <= j5) {
            m mVar = this.end;
            if (j5 <= mVar.m6734(mVar.f5688)) {
                return true;
            }
        }
        return false;
    }

    void setOpenAt(m mVar) {
        this.openAt = mVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeParcelable(this.start, 0);
        parcel.writeParcelable(this.end, 0);
        parcel.writeParcelable(this.openAt, 0);
        parcel.writeParcelable(this.validator, 0);
        parcel.writeInt(this.firstDayOfWeek);
    }

    private CalendarConstraints(m mVar, m mVar2, DateValidator dateValidator, m mVar3, int i5) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.start = mVar;
        this.end = mVar2;
        this.openAt = mVar3;
        this.firstDayOfWeek = i5;
        this.validator = dateValidator;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i5 < 0 || i5 > w.m6786().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.monthSpan = mVar.m6739(mVar2) + 1;
        this.yearSpan = (mVar2.f5686 - mVar.f5686) + 1;
    }

    public static final class Builder {
        private static final String DEEP_COPY_VALIDATOR_KEY = "DEEP_COPY_VALIDATOR_KEY";
        private long end;
        private int firstDayOfWeek;
        private Long openAt;
        private long start;
        private DateValidator validator;
        static final long DEFAULT_START = w.m6768(m.m6729(1900, 0).f5689);
        static final long DEFAULT_END = w.m6768(m.m6729(2100, 11).f5689);

        public Builder() {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
        }

        public CalendarConstraints build() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(DEEP_COPY_VALIDATOR_KEY, this.validator);
            m m6730 = m.m6730(this.start);
            m m67302 = m.m6730(this.end);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(DEEP_COPY_VALIDATOR_KEY);
            Long l5 = this.openAt;
            return new CalendarConstraints(m6730, m67302, dateValidator, l5 == null ? null : m.m6730(l5.longValue()), this.firstDayOfWeek, null);
        }

        @CanIgnoreReturnValue
        public Builder setEnd(long j5) {
            this.end = j5;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFirstDayOfWeek(int i5) {
            this.firstDayOfWeek = i5;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setOpenAt(long j5) {
            this.openAt = Long.valueOf(j5);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setStart(long j5) {
            this.start = j5;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setValidator(DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.validator = dateValidator;
            return this;
        }

        Builder(CalendarConstraints calendarConstraints) {
            this.start = DEFAULT_START;
            this.end = DEFAULT_END;
            this.validator = DateValidatorPointForward.from(Long.MIN_VALUE);
            this.start = calendarConstraints.start.f5689;
            this.end = calendarConstraints.end.f5689;
            this.openAt = Long.valueOf(calendarConstraints.openAt.f5689);
            this.firstDayOfWeek = calendarConstraints.firstDayOfWeek;
            this.validator = calendarConstraints.validator;
        }
    }
}
