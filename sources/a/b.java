package a;

import a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ResultReceiver.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: ʾ, reason: collision with root package name */
    final boolean f12834 = false;

    /* renamed from: ʿ, reason: collision with root package name */
    final Handler f12835 = null;

    /* renamed from: ˆ, reason: collision with root package name */
    a.a f12836;

    /* compiled from: ResultReceiver.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public b[] newArray(int i5) {
            return new b[i5];
        }
    }

    /* compiled from: ResultReceiver.java */
    /* renamed from: a.b$b, reason: collision with other inner class name */
    class BinderC0002b extends a.AbstractBinderC0000a {
        BinderC0002b() {
        }

        @Override // a.a
        /* renamed from: ˑ */
        public void mo0(int i5, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f12835;
            if (handler != null) {
                handler.post(bVar.new c(i5, bundle));
            } else {
                bVar.mo4(i5, bundle);
            }
        }
    }

    /* compiled from: ResultReceiver.java */
    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final int f5;

        /* renamed from: ʿ, reason: contains not printable characters */
        final Bundle f6;

        c(int i5, Bundle bundle) {
            this.f5 = i5;
            this.f6 = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.mo4(this.f5, this.f6);
        }
    }

    b(Parcel parcel) {
        this.f12836 = a.AbstractBinderC0000a.m1(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i5) {
        synchronized (this) {
            if (this.f12836 == null) {
                this.f12836 = new BinderC0002b();
            }
            parcel.writeStrongBinder(this.f12836.asBinder());
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected void mo4(int i5, Bundle bundle) {
    }
}
