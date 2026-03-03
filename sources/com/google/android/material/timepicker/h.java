package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.R;
import java.util.Arrays;

/* compiled from: TimeModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e f6362;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final e f6363;

    /* renamed from: ˆ, reason: contains not printable characters */
    final int f6364;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f6365;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f6366;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f6367;

    /* renamed from: ˋ, reason: contains not printable characters */
    int f6368;

    /* compiled from: TimeModel.java */
    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public h[] newArray(int i5) {
            return new h[i5];
        }
    }

    public h() {
        this(0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m7611(Resources resources, CharSequence charSequence) {
        return m7612(resources, charSequence, "%02d");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static String m7612(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static int m7613(int i5) {
        return i5 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6365 == hVar.f6365 && this.f6366 == hVar.f6366 && this.f6364 == hVar.f6364 && this.f6367 == hVar.f6367;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6364), Integer.valueOf(this.f6365), Integer.valueOf(this.f6366), Integer.valueOf(this.f6367)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f6365);
        parcel.writeInt(this.f6366);
        parcel.writeInt(this.f6367);
        parcel.writeInt(this.f6364);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m7614() {
        return this.f6364 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m7615() {
        if (this.f6364 == 1) {
            return this.f6365 % 24;
        }
        int i5 = this.f6365;
        if (i5 % 12 == 0) {
            return 12;
        }
        return this.f6368 == 1 ? i5 - 12 : i5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public e m7616() {
        return this.f6363;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public e m7617() {
        return this.f6362;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m7618(int i5) {
        if (this.f6364 == 1) {
            this.f6365 = i5;
        } else {
            this.f6365 = (i5 % 12) + (this.f6368 != 1 ? 0 : 12);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m7619(int i5) {
        this.f6368 = m7613(i5);
        this.f6365 = i5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m7620(int i5) {
        this.f6366 = i5 % 60;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m7621(int i5) {
        if (i5 != this.f6368) {
            this.f6368 = i5;
            int i6 = this.f6365;
            if (i6 < 12 && i5 == 1) {
                this.f6365 = i6 + 12;
            } else {
                if (i6 < 12 || i5 != 0) {
                    return;
                }
                this.f6365 = i6 - 12;
            }
        }
    }

    public h(int i5) {
        this(0, 0, 10, i5);
    }

    public h(int i5, int i6, int i7, int i8) {
        this.f6365 = i5;
        this.f6366 = i6;
        this.f6367 = i7;
        this.f6364 = i8;
        this.f6368 = m7613(i5);
        this.f6362 = new e(59);
        this.f6363 = new e(i8 == 1 ? 23 : 12);
    }

    protected h(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
