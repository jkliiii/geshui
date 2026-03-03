package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: ContentInfoCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f f2916;

    /* compiled from: ContentInfoCompat.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final InterfaceC0035c f2917;

        public a(ClipData clipData, int i5) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f2917 = new b(clipData, i5);
            } else {
                this.f2917 = new d(clipData, i5);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public c m2770() {
            return this.f2917.build();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public a m2771(Bundle bundle) {
            this.f2917.setExtras(bundle);
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public a m2772(int i5) {
            this.f2917.mo2775(i5);
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public a m2773(Uri uri) {
            this.f2917.mo2774(uri);
            return this;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    private static final class b implements InterfaceC0035c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentInfo.Builder f2918;

        b(ClipData clipData, int i5) {
            this.f2918 = new ContentInfo.Builder(clipData, i5);
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        public c build() {
            return new c(new e(this.f2918.build()));
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        public void setExtras(Bundle bundle) {
            this.f2918.setExtras(bundle);
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo2774(Uri uri) {
            this.f2918.setLinkUri(uri);
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo2775(int i5) {
            this.f2918.setFlags(i5);
        }
    }

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: androidx.core.view.c$c, reason: collision with other inner class name */
    private interface InterfaceC0035c {
        c build();

        void setExtras(Bundle bundle);

        /* renamed from: ʻ */
        void mo2774(Uri uri);

        /* renamed from: ʼ */
        void mo2775(int i5);
    }

    /* compiled from: ContentInfoCompat.java */
    private static final class d implements InterfaceC0035c {

        /* renamed from: ʻ, reason: contains not printable characters */
        ClipData f2919;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f2920;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f2921;

        /* renamed from: ʾ, reason: contains not printable characters */
        Uri f2922;

        /* renamed from: ʿ, reason: contains not printable characters */
        Bundle f2923;

        d(ClipData clipData, int i5) {
            this.f2919 = clipData;
            this.f2920 = i5;
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        public c build() {
            return new c(new g(this));
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        public void setExtras(Bundle bundle) {
            this.f2923 = bundle;
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        /* renamed from: ʻ */
        public void mo2774(Uri uri) {
            this.f2922 = uri;
        }

        @Override // androidx.core.view.c.InterfaceC0035c
        /* renamed from: ʼ */
        public void mo2775(int i5) {
            this.f2921 = i5;
        }
    }

    /* compiled from: ContentInfoCompat.java */
    private static final class e implements f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentInfo f2924;

        e(ContentInfo contentInfo) {
            this.f2924 = (ContentInfo) androidx.core.util.h.m2583(contentInfo);
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f2924 + "}";
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʻ, reason: contains not printable characters */
        public ClipData mo2776() {
            return this.f2924.getClip();
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʼ, reason: contains not printable characters */
        public int mo2777() {
            return this.f2924.getFlags();
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʽ, reason: contains not printable characters */
        public ContentInfo mo2778() {
            return this.f2924;
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʾ, reason: contains not printable characters */
        public int mo2779() {
            return this.f2924.getSource();
        }
    }

    /* compiled from: ContentInfoCompat.java */
    private interface f {
        /* renamed from: ʻ */
        ClipData mo2776();

        /* renamed from: ʼ */
        int mo2777();

        /* renamed from: ʽ */
        ContentInfo mo2778();

        /* renamed from: ʾ */
        int mo2779();
    }

    /* compiled from: ContentInfoCompat.java */
    private static final class g implements f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ClipData f2925;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f2926;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f2927;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Uri f2928;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final Bundle f2929;

        g(d dVar) {
            this.f2925 = (ClipData) androidx.core.util.h.m2583(dVar.f2919);
            this.f2926 = androidx.core.util.h.m2579(dVar.f2920, 0, 5, "source");
            this.f2927 = androidx.core.util.h.m2582(dVar.f2921, 1);
            this.f2928 = dVar.f2922;
            this.f2929 = dVar.f2923;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f2925.getDescription());
            sb.append(", source=");
            sb.append(c.m2764(this.f2926));
            sb.append(", flags=");
            sb.append(c.m2763(this.f2927));
            Uri uri = this.f2928;
            String str2 = BuildConfig.FLAVOR;
            if (uri == null) {
                str = BuildConfig.FLAVOR;
            } else {
                str = ", hasLinkUri(" + this.f2928.toString().length() + ")";
            }
            sb.append(str);
            if (this.f2929 != null) {
                str2 = ", hasExtras";
            }
            sb.append(str2);
            sb.append("}");
            return sb.toString();
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʻ */
        public ClipData mo2776() {
            return this.f2925;
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʼ */
        public int mo2777() {
            return this.f2927;
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʽ */
        public ContentInfo mo2778() {
            return null;
        }

        @Override // androidx.core.view.c.f
        /* renamed from: ʾ */
        public int mo2779() {
            return this.f2926;
        }
    }

    c(f fVar) {
        this.f2916 = fVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static String m2763(int i5) {
        return (i5 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static String m2764(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? String.valueOf(i5) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static c m2765(ContentInfo contentInfo) {
        return new c(new e(contentInfo));
    }

    public String toString() {
        return this.f2916.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public ClipData m2766() {
        return this.f2916.mo2776();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m2767() {
        return this.f2916.mo2777();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m2768() {
        return this.f2916.mo2779();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public ContentInfo m2769() {
        ContentInfo mo2778 = this.f2916.mo2778();
        Objects.requireNonNull(mo2778);
        return mo2778;
    }
}
