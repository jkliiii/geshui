package i1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.data.d;
import i1.o;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DirectResourceLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8468;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final e<DataT> f8469;

    /* compiled from: DirectResourceLoader.java */
    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8470;

        a(Context context) {
            this.f8470 = context;
        }

        @Override // i1.f.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public Class<AssetFileDescriptor> mo9138() {
            return AssetFileDescriptor.class;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Integer, AssetFileDescriptor> mo9118(s sVar) {
            return new f(this.f8470, this);
        }

        @Override // i1.f.e
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9139(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // i1.f.e
        /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AssetFileDescriptor mo9140(Resources.Theme theme, Resources resources, int i5) {
            return resources.openRawResourceFd(i5);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8472;

        c(Context context) {
            this.f8472 = context;
        }

        @Override // i1.f.e
        /* renamed from: ʻ */
        public Class<InputStream> mo9138() {
            return InputStream.class;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Integer, InputStream> mo9118(s sVar) {
            return new f(this.f8472, this);
        }

        @Override // i1.f.e
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9139(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // i1.f.e
        /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public InputStream mo9140(Resources.Theme theme, Resources resources, int i5) {
            return resources.openRawResource(i5);
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private interface e<DataT> {
        /* renamed from: ʻ */
        Class<DataT> mo9138();

        /* renamed from: ʼ */
        void mo9139(DataT datat) throws IOException;

        /* renamed from: ʽ */
        DataT mo9140(Resources.Theme theme, Resources resources, int i5);
    }

    f(Context context, e<DataT> eVar) {
        this.f8468 = context.getApplicationContext();
        this.f8469 = eVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static p<Integer, AssetFileDescriptor> m9133(Context context) {
        return new a(context);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static p<Integer, Drawable> m9134(Context context) {
        return new b(context);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static p<Integer, InputStream> m9135(Context context) {
        return new c(context);
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<DataT> mo9113(Integer num, int i5, int i6, c1.h hVar) {
        Resources.Theme theme = (Resources.Theme) hVar.m5831(n1.j.f9521);
        return new o.a<>(new x1.b(num), new d(theme, (Build.VERSION.SDK_INT < 21 || theme == null) ? this.f8468.getResources() : theme.getResources(), this.f8469, num.intValue()));
    }

    @Override // i1.o
    /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Integer num) {
        return true;
    }

    /* compiled from: DirectResourceLoader.java */
    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8471;

        b(Context context) {
            this.f8471 = context;
        }

        @Override // i1.f.e
        /* renamed from: ʻ */
        public Class<Drawable> mo9138() {
            return Drawable.class;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Integer, Drawable> mo9118(s sVar) {
            return new f(this.f8471, this);
        }

        @Override // i1.f.e
        /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Drawable mo9140(Resources.Theme theme, Resources resources, int i5) {
            return n1.g.m10433(this.f8471, i5, theme);
        }

        @Override // i1.f.e
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9139(Drawable drawable) throws IOException {
        }
    }

    /* compiled from: DirectResourceLoader.java */
    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Resources.Theme f8473;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final Resources f8474;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final e<DataT> f8475;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final int f8476;

        /* renamed from: ˉ, reason: contains not printable characters */
        private DataT f8477;

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i5) {
            this.f8473 = theme;
            this.f8474 = resources;
            this.f8475 = eVar;
            this.f8476 = i5;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<DataT> mo6132() {
            return this.f8475.mo9138();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
            DataT datat = this.f8477;
            if (datat != null) {
                try {
                    this.f8475.mo9139(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                DataT mo9140 = this.f8475.mo9140(this.f8473, this.f8474, this.f8476);
                this.f8477 = mo9140;
                aVar.mo6146(mo9140);
            } catch (Resources.NotFoundException e5) {
                aVar.mo6145(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
