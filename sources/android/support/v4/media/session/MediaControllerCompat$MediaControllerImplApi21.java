package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: ʻ, reason: contains not printable characters */
    final Object f149;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<c> f150;

    /* renamed from: ʽ, reason: contains not printable characters */
    private HashMap<c, a> f151;

    /* renamed from: ʾ, reason: contains not printable characters */
    final MediaSessionCompat.Token f152;

    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: ʾ, reason: contains not printable characters */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f153;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i5, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f153.get();
            if (mediaControllerCompat$MediaControllerImplApi21 == null || bundle == null) {
                return;
            }
            synchronized (mediaControllerCompat$MediaControllerImplApi21.f149) {
                mediaControllerCompat$MediaControllerImplApi21.f152.m275(b.a.m295(androidx.core.app.m.m1969(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                mediaControllerCompat$MediaControllerImplApi21.f152.m276(bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
                mediaControllerCompat$MediaControllerImplApi21.m260();
            }
        }
    }

    private static class a extends c.b {
        a(c cVar) {
            super(cVar);
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo261(CharSequence charSequence) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo262() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo263(Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo264(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        /* renamed from: ˈ, reason: contains not printable characters */
        public void mo265(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.c.b, android.support.v4.media.session.a
        /* renamed from: י, reason: contains not printable characters */
        public void mo266(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            throw new AssertionError();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m260() {
        if (this.f152.m274() == null) {
            return;
        }
        for (c cVar : this.f150) {
            a aVar = new a(cVar);
            this.f151.put(cVar, aVar);
            cVar.f185 = aVar;
            try {
                this.f152.m274().mo294(aVar);
                cVar.m305(13, null, null);
            } catch (RemoteException e5) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e5);
            }
        }
        this.f150.clear();
    }
}
