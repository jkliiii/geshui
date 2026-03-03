package i1;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import i1.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Set<String> f8550 = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c<Data> f8551;

    /* compiled from: UriLoader.java */
    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentResolver f8552;

        public a(ContentResolver contentResolver) {
            this.f8552 = contentResolver;
        }

        @Override // i1.y.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> mo9214(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f8552, uri);
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, AssetFileDescriptor> mo9118(s sVar) {
            return new y(this);
        }
    }

    /* compiled from: UriLoader.java */
    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentResolver f8553;

        public b(ContentResolver contentResolver) {
            this.f8553 = contentResolver;
        }

        @Override // i1.y.c
        /* renamed from: ʻ */
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> mo9214(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f8553, uri);
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, ParcelFileDescriptor> mo9118(s sVar) {
            return new y(this);
        }
    }

    /* compiled from: UriLoader.java */
    public interface c<Data> {
        /* renamed from: ʻ */
        com.bumptech.glide.load.data.d<Data> mo9214(Uri uri);
    }

    /* compiled from: UriLoader.java */
    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ContentResolver f8554;

        public d(ContentResolver contentResolver) {
            this.f8554 = contentResolver;
        }

        @Override // i1.y.c
        /* renamed from: ʻ */
        public com.bumptech.glide.load.data.d<InputStream> mo9214(Uri uri) {
            return new com.bumptech.glide.load.data.o(this.f8554, uri);
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, InputStream> mo9118(s sVar) {
            return new y(this);
        }
    }

    public y(c<Data> cVar) {
        this.f8551 = cVar;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(Uri uri, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(uri), this.f8551.mo9214(uri));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return f8550.contains(uri.getScheme());
    }
}
