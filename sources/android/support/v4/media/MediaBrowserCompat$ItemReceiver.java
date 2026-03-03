package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: E:\78999\cookie_5123796.dex */
class MediaBrowserCompat$ItemReceiver extends a.b {
    @Override // a.b
    /* renamed from: ʻ */
    protected void mo4(int i5, Bundle bundle) {
        MediaSessionCompat.m267(bundle);
        if (i5 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
