package l1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
interface z {

    /* compiled from: ImageReader.java */
    public static final class b implements z {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final com.bumptech.glide.load.data.k f9026;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final f1.b f9027;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final List<ImageHeaderParser> f9028;

        b(InputStream inputStream, List<ImageHeaderParser> list, f1.b bVar) {
            this.f9027 = (f1.b) y1.k.m12893(bVar);
            this.f9028 = (List) y1.k.m12893(list);
            this.f9026 = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // l1.z
        /* renamed from: ʻ */
        public Bitmap mo9719(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f9026.mo6126(), null, options);
        }

        @Override // l1.z
        /* renamed from: ʼ */
        public void mo9720() {
            this.f9026.m6160();
        }

        @Override // l1.z
        /* renamed from: ʽ */
        public int mo9721() throws IOException {
            return com.bumptech.glide.load.a.m6116(this.f9028, this.f9026.mo6126(), this.f9027);
        }

        @Override // l1.z
        /* renamed from: ʾ */
        public ImageHeaderParser.ImageType mo9722() throws IOException {
            return com.bumptech.glide.load.a.m6120(this.f9028, this.f9026.mo6126(), this.f9027);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    Bitmap mo9719(BitmapFactory.Options options) throws IOException;

    /* renamed from: ʼ, reason: contains not printable characters */
    void mo9720();

    /* renamed from: ʽ, reason: contains not printable characters */
    int mo9721() throws IOException;

    /* renamed from: ʾ, reason: contains not printable characters */
    ImageHeaderParser.ImageType mo9722() throws IOException;

    /* compiled from: ImageReader.java */
    public static final class a implements z {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ByteBuffer f9023;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final List<ImageHeaderParser> f9024;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final f1.b f9025;

        a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, f1.b bVar) {
            this.f9023 = byteBuffer;
            this.f9024 = list;
            this.f9025 = bVar;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private InputStream m9723() {
            return y1.a.m12868(y1.a.m12865(this.f9023));
        }

        @Override // l1.z
        /* renamed from: ʻ */
        public Bitmap mo9719(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m9723(), null, options);
        }

        @Override // l1.z
        /* renamed from: ʽ */
        public int mo9721() throws IOException {
            return com.bumptech.glide.load.a.m6117(this.f9024, y1.a.m12865(this.f9023), this.f9025);
        }

        @Override // l1.z
        /* renamed from: ʾ */
        public ImageHeaderParser.ImageType mo9722() throws IOException {
            return com.bumptech.glide.load.a.m6121(this.f9024, y1.a.m12865(this.f9023));
        }

        @Override // l1.z
        /* renamed from: ʼ */
        public void mo9720() {
        }
    }

    /* compiled from: ImageReader.java */
    public static final class c implements z {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final f1.b f9029;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final List<ImageHeaderParser> f9030;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final ParcelFileDescriptorRewinder f9031;

        c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, f1.b bVar) {
            this.f9029 = (f1.b) y1.k.m12893(bVar);
            this.f9030 = (List) y1.k.m12893(list);
            this.f9031 = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // l1.z
        /* renamed from: ʻ */
        public Bitmap mo9719(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f9031.mo6126().getFileDescriptor(), null, options);
        }

        @Override // l1.z
        /* renamed from: ʽ */
        public int mo9721() throws IOException {
            return com.bumptech.glide.load.a.m6115(this.f9030, this.f9031, this.f9029);
        }

        @Override // l1.z
        /* renamed from: ʾ */
        public ImageHeaderParser.ImageType mo9722() throws IOException {
            return com.bumptech.glide.load.a.m6119(this.f9030, this.f9031, this.f9029);
        }

        @Override // l1.z
        /* renamed from: ʼ */
        public void mo9720() {
        }
    }
}
