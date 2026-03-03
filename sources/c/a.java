package c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ActivityResult.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0071a();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f4877;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Intent f4878;

    /* compiled from: ActivityResult.java */
    /* renamed from: c.a$a, reason: collision with other inner class name */
    class C0071a implements Parcelable.Creator<a> {
        C0071a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public a[] newArray(int i5) {
            return new a[i5];
        }
    }

    public a(int i5, Intent intent) {
        this.f4877 = i5;
        this.f4878 = intent;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static String m5720(int i5) {
        return i5 != -1 ? i5 != 0 ? String.valueOf(i5) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m5720(this.f4877) + ", data=" + this.f4878 + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        parcel.writeInt(this.f4877);
        parcel.writeInt(this.f4878 == null ? 0 : 1);
        Intent intent = this.f4878;
        if (intent != null) {
            intent.writeToParcel(parcel, i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Intent m5721() {
        return this.f4878;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m5722() {
        return this.f4877;
    }

    a(Parcel parcel) {
        this.f4877 = parcel.readInt();
        this.f4878 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
