package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class m implements Comparable<m>, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Calendar f5684;

    /* renamed from: ʿ, reason: contains not printable characters */
    final int f5685;

    /* renamed from: ˆ, reason: contains not printable characters */
    final int f5686;

    /* renamed from: ˈ, reason: contains not printable characters */
    final int f5687;

    /* renamed from: ˉ, reason: contains not printable characters */
    final int f5688;

    /* renamed from: ˊ, reason: contains not printable characters */
    final long f5689;

    /* renamed from: ˋ, reason: contains not printable characters */
    private String f5690;

    /* compiled from: Month.java */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.m6729(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public m[] newArray(int i5) {
            return new m[i5];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m6773 = w.m6773(calendar);
        this.f5684 = m6773;
        this.f5685 = m6773.get(2);
        this.f5686 = m6773.get(1);
        this.f5687 = m6773.getMaximum(7);
        this.f5688 = m6773.getActualMaximum(5);
        this.f5689 = m6773.getTimeInMillis();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static m m6729(int i5, int i6) {
        Calendar m6786 = w.m6786();
        m6786.set(1, i5);
        m6786.set(2, i6);
        return new m(m6786);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static m m6730(long j5) {
        Calendar m6786 = w.m6786();
        m6786.setTimeInMillis(j5);
        return new m(m6786);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static m m6731() {
        return new m(w.m6784());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f5685 == mVar.f5685 && this.f5686 == mVar.f5686;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5685), Integer.valueOf(this.f5686)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f5686);
        parcel.writeInt(this.f5685);
    }

    @Override // java.lang.Comparable
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f5684.compareTo(mVar.f5684);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    int m6733(int i5) {
        int i6 = this.f5684.get(7);
        if (i5 <= 0) {
            i5 = this.f5684.getFirstDayOfWeek();
        }
        int i7 = i6 - i5;
        return i7 < 0 ? i7 + this.f5687 : i7;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    long m6734(int i5) {
        Calendar m6773 = w.m6773(this.f5684);
        m6773.set(5, i5);
        return m6773.getTimeInMillis();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m6735(long j5) {
        Calendar m6773 = w.m6773(this.f5684);
        m6773.setTimeInMillis(j5);
        return m6773.get(5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    String m6736() {
        if (this.f5690 == null) {
            this.f5690 = j.m6721(this.f5684.getTimeInMillis());
        }
        return this.f5690;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    long m6737() {
        return this.f5684.getTimeInMillis();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    m m6738(int i5) {
        Calendar m6773 = w.m6773(this.f5684);
        m6773.add(2, i5);
        return new m(m6773);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    int m6739(m mVar) {
        if (this.f5684 instanceof GregorianCalendar) {
            return ((mVar.f5686 - this.f5686) * 12) + (mVar.f5685 - this.f5685);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
