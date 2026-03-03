package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* compiled from: MediaControllerCompatApi21.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e {

    /* compiled from: MediaControllerCompatApi21.java */
    public interface a {
        /* renamed from: ʻ */
        void mo306(CharSequence charSequence);

        /* renamed from: ʼ */
        void mo307();

        /* renamed from: ʽ */
        void mo308(Bundle bundle);

        /* renamed from: ʾ */
        void mo309(List<?> list);

        /* renamed from: ʿ */
        void mo310(Object obj);

        /* renamed from: ˆ */
        void mo311(int i5, int i6, int i7, int i8, int i9);

        /* renamed from: ˈ */
        void mo312(Object obj);

        /* renamed from: ˉ */
        void mo313(String str, Bundle bundle);
    }

    /* compiled from: MediaControllerCompatApi21.java */
    static class b<T extends a> extends MediaController.Callback {

        /* renamed from: ʻ, reason: contains not printable characters */
        protected final T f193;

        public b(T t5) {
            this.f193 = t5;
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f193.mo311(playbackInfo.getPlaybackType(), c.m330(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m267(bundle);
            this.f193.mo308(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f193.mo310(mediaMetadata);
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f193.mo312(playbackState);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f193.mo309(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f193.mo306(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            this.f193.mo307();
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m267(bundle);
            this.f193.mo313(str, bundle);
        }
    }

    /* compiled from: MediaControllerCompatApi21.java */
    public static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static AudioAttributes m329(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static int m330(Object obj) {
            return m331(m329(obj));
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private static int m331(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Object m328(a aVar) {
        return new b(aVar);
    }
}
