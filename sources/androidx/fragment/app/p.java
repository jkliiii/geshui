package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    ArrayList<s> f3664;

    /* renamed from: ʿ, reason: contains not printable characters */
    ArrayList<String> f3665;

    /* renamed from: ˆ, reason: contains not printable characters */
    b[] f3666;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f3667;

    /* renamed from: ˉ, reason: contains not printable characters */
    String f3668;

    /* renamed from: ˊ, reason: contains not printable characters */
    ArrayList<String> f3669;

    /* renamed from: ˋ, reason: contains not printable characters */
    ArrayList<Bundle> f3670;

    /* renamed from: ˎ, reason: contains not printable characters */
    ArrayList<n.l> f3671;

    /* compiled from: FragmentManagerState.java */
    class a implements Parcelable.Creator<p> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public p[] newArray(int i5) {
            return new p[i5];
        }
    }

    public p() {
        this.f3668 = null;
        this.f3669 = new ArrayList<>();
        this.f3670 = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeTypedList(this.f3664);
        parcel.writeStringList(this.f3665);
        parcel.writeTypedArray(this.f3666, i5);
        parcel.writeInt(this.f3667);
        parcel.writeString(this.f3668);
        parcel.writeStringList(this.f3669);
        parcel.writeTypedList(this.f3670);
        parcel.writeTypedList(this.f3671);
    }

    public p(Parcel parcel) {
        this.f3668 = null;
        this.f3669 = new ArrayList<>();
        this.f3670 = new ArrayList<>();
        this.f3664 = parcel.createTypedArrayList(s.CREATOR);
        this.f3665 = parcel.createStringArrayList();
        this.f3666 = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f3667 = parcel.readInt();
        this.f3668 = parcel.readString();
        this.f3669 = parcel.createStringArrayList();
        this.f3670 = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f3671 = parcel.createTypedArrayList(n.l.CREATOR);
    }
}
