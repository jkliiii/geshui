package x;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* compiled from: InputContentInfoCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c f12091;

    /* compiled from: InputContentInfoCompat.java */
    private interface c {
        ClipDescription getDescription();

        /* renamed from: ʻ */
        Object mo12656();

        /* renamed from: ʼ */
        Uri mo12657();

        /* renamed from: ʽ */
        void mo12658();

        /* renamed from: ʾ */
        Uri mo12659();
    }

    public k(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f12091 = new a(uri, clipDescription, uri2);
        } else {
            this.f12091 = new b(uri, clipDescription, uri2);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static k m12650(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new k(new a(obj));
        }
        return null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Uri m12651() {
        return this.f12091.mo12657();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public ClipDescription m12652() {
        return this.f12091.getDescription();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public Uri m12653() {
        return this.f12091.mo12659();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m12654() {
        this.f12091.mo12658();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Object m12655() {
        return this.f12091.mo12656();
    }

    /* compiled from: InputContentInfoCompat.java */
    private static final class a implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final InputContentInfo f12092;

        a(Object obj) {
            this.f12092 = (InputContentInfo) obj;
        }

        @Override // x.k.c
        public ClipDescription getDescription() {
            return this.f12092.getDescription();
        }

        @Override // x.k.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public Object mo12656() {
            return this.f12092;
        }

        @Override // x.k.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public Uri mo12657() {
            return this.f12092.getContentUri();
        }

        @Override // x.k.c
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo12658() {
            this.f12092.requestPermission();
        }

        @Override // x.k.c
        /* renamed from: ʾ, reason: contains not printable characters */
        public Uri mo12659() {
            return this.f12092.getLinkUri();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12092 = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private k(c cVar) {
        this.f12091 = cVar;
    }

    /* compiled from: InputContentInfoCompat.java */
    private static final class b implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Uri f12093;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final ClipDescription f12094;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Uri f12095;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f12093 = uri;
            this.f12094 = clipDescription;
            this.f12095 = uri2;
        }

        @Override // x.k.c
        public ClipDescription getDescription() {
            return this.f12094;
        }

        @Override // x.k.c
        /* renamed from: ʻ */
        public Object mo12656() {
            return null;
        }

        @Override // x.k.c
        /* renamed from: ʼ */
        public Uri mo12657() {
            return this.f12093;
        }

        @Override // x.k.c
        /* renamed from: ʾ */
        public Uri mo12659() {
            return this.f12095;
        }

        @Override // x.k.c
        /* renamed from: ʽ */
        public void mo12658() {
        }
    }
}
