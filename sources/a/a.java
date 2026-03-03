package a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: IResultReceiver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface a extends IInterface {

    /* compiled from: IResultReceiver.java */
    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʼ, reason: contains not printable characters */
        public static <T> T m3(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void mo0(int i5, Bundle bundle) throws RemoteException;

    /* compiled from: IResultReceiver.java */
    /* renamed from: a.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* compiled from: IResultReceiver.java */
        /* renamed from: a.a$a$a, reason: collision with other inner class name */
        private static class C0001a implements a {

            /* renamed from: ʻ, reason: collision with root package name */
            private IBinder f12833;

            C0001a(IBinder iBinder) {
                this.f12833 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f12833;
            }
        }

        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public static a m1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof a)) ? new C0001a(iBinder) : (a) queryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i5, Parcel parcel, Parcel parcel2, int i6) throws RemoteException {
            if (i5 >= 1 && i5 <= 16777215) {
                parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            }
            if (i5 == 1598968902) {
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            if (i5 != 1) {
                return super.onTransact(i5, parcel, parcel2, i6);
            }
            mo0(parcel.readInt(), (Bundle) b.m3(parcel, Bundle.CREATOR));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
