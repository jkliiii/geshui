package i1;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import i1.o;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a<Data> implements o<Uri, Data> {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final int f8451 = 22;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final AssetManager f8452;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final InterfaceC0114a<Data> f8453;

    /* compiled from: AssetUriLoader.java */
    /* renamed from: i1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0114a<Data> {
        /* renamed from: ʻ, reason: contains not printable characters */
        com.bumptech.glide.load.data.d<Data> mo9117(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC0114a<AssetFileDescriptor> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final AssetManager f8454;

        public b(AssetManager assetManager) {
            this.f8454 = assetManager;
        }

        @Override // i1.a.InterfaceC0114a
        /* renamed from: ʻ */
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> mo9117(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // i1.p
        /* renamed from: ʾ, reason: contains not printable characters */
        public o<Uri, AssetFileDescriptor> mo9118(s sVar) {
            return new a(this.f8454, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    public static class c implements p<Uri, InputStream>, InterfaceC0114a<InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final AssetManager f8455;

        public c(AssetManager assetManager) {
            this.f8455 = assetManager;
        }

        @Override // i1.a.InterfaceC0114a
        /* renamed from: ʻ */
        public com.bumptech.glide.load.data.d<InputStream> mo9117(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.n(assetManager, str);
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, InputStream> mo9118(s sVar) {
            return new a(this.f8455, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0114a<Data> interfaceC0114a) {
        this.f8452 = assetManager;
        this.f8453 = interfaceC0114a;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(Uri uri, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(uri), this.f8453.mo9117(this.f8452, uri.toString().substring(f8451)));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
