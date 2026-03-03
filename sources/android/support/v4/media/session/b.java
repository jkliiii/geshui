package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMediaSession.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface b extends IInterface {

    /* compiled from: IMediaSession.java */
    public static abstract class a extends Binder implements b {

        /* compiled from: IMediaSession.java */
        /* renamed from: android.support.v4.media.session.b$a$a, reason: collision with other inner class name */
        private static class C0009a implements b {

            /* renamed from: ʻ, reason: contains not printable characters */
            private IBinder f183;

            C0009a(IBinder iBinder) {
                this.f183 = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f183;
            }

            @Override // android.support.v4.media.session.b
            /* renamed from: ˆ */
            public void mo294(android.support.v4.media.session.a aVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.f183.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public static b m295(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0009a(iBinder) : (b) queryLocalInterface;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void mo294(android.support.v4.media.session.a aVar) throws RemoteException;
}
