package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: MediaControllerCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: ʻ, reason: contains not printable characters */
    final Object f184;

    /* renamed from: ʼ, reason: contains not printable characters */
    android.support.v4.media.session.a f185;

    /* compiled from: MediaControllerCompat.java */
    private static class a implements e.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final WeakReference<c> f186;

        a(c cVar) {
            this.f186 = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo306(CharSequence charSequence) {
            c cVar = this.f186.get();
            if (cVar != null) {
                cVar.m302(charSequence);
            }
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo307() {
            c cVar = this.f186.get();
            if (cVar != null) {
                cVar.m303();
            }
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo308(Bundle bundle) {
            c cVar = this.f186.get();
            if (cVar != null) {
                cVar.m298(bundle);
            }
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo309(List<?> list) {
            c cVar = this.f186.get();
            if (cVar != null) {
                cVar.m301(MediaSessionCompat.QueueItem.m269(list));
            }
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo310(Object obj) {
            c cVar = this.f186.get();
            if (cVar != null) {
                cVar.m299(MediaMetadataCompat.m219(obj));
            }
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo311(int i5, int i6, int i7, int i8, int i9) {
            c cVar = this.f186.get();
            if (cVar != null) {
                cVar.m297(new d(i5, i6, i7, i8, i9));
            }
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ˈ, reason: contains not printable characters */
        public void mo312(Object obj) {
            c cVar = this.f186.get();
            if (cVar == null || cVar.f185 != null) {
                return;
            }
            cVar.m300(PlaybackStateCompat.m281(obj));
        }

        @Override // android.support.v4.media.session.e.a
        /* renamed from: ˉ, reason: contains not printable characters */
        public void mo313(String str, Bundle bundle) {
            c cVar = this.f186.get();
            if (cVar != null) {
                if (cVar.f185 == null || Build.VERSION.SDK_INT >= 23) {
                    cVar.m304(str, bundle);
                }
            }
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f184 = e.m328(new a(this));
            return;
        }
        b bVar = new b(this);
        this.f185 = bVar;
        this.f184 = bVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m305(8, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MediaControllerCompat.java */
    static class b extends a.AbstractBinderC0008a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final WeakReference<c> f187;

        b(c cVar) {
            this.f187 = new WeakReference<>(cVar);
        }

        @Override // android.support.v4.media.session.a
        public void onEvent(String str, Bundle bundle) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(1, str, bundle);
            }
        }

        /* renamed from: ʻ */
        public void mo261(CharSequence charSequence) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(6, charSequence, null);
            }
        }

        /* renamed from: ʼ */
        public void mo262() throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(8, null, null);
            }
        }

        /* renamed from: ʽ */
        public void mo263(Bundle bundle) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(7, bundle, null);
            }
        }

        /* renamed from: ʾ */
        public void mo264(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(5, list, null);
            }
        }

        /* renamed from: ˈ */
        public void mo265(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(3, mediaMetadataCompat, null);
            }
        }

        @Override // android.support.v4.media.session.a
        /* renamed from: ˉ */
        public void mo288(int i5) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(9, Integer.valueOf(i5), null);
            }
        }

        @Override // android.support.v4.media.session.a
        /* renamed from: ˊ */
        public void mo289(int i5) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(12, Integer.valueOf(i5), null);
            }
        }

        @Override // android.support.v4.media.session.a
        /* renamed from: ˋ */
        public void mo290() throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(13, null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        /* renamed from: ˎ */
        public void mo291(boolean z5) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(11, Boolean.valueOf(z5), null);
            }
        }

        @Override // android.support.v4.media.session.a
        /* renamed from: ˏ */
        public void mo292(PlaybackStateCompat playbackStateCompat) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(2, playbackStateCompat, null);
            }
        }

        /* renamed from: י */
        public void mo266(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
            c cVar = this.f187.get();
            if (cVar != null) {
                cVar.m305(4, parcelableVolumeInfo != null ? new d(parcelableVolumeInfo.f161, parcelableVolumeInfo.f162, parcelableVolumeInfo.f163, parcelableVolumeInfo.f164, parcelableVolumeInfo.f165) : null, null);
            }
        }

        @Override // android.support.v4.media.session.a
        /* renamed from: ʿ */
        public void mo287(boolean z5) throws RemoteException {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m297(d dVar) {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m298(Bundle bundle) {
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m299(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m300(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m301(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m302(CharSequence charSequence) {
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m303() {
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m304(String str, Bundle bundle) {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m305(int i5, Object obj, Bundle bundle) {
    }
}
