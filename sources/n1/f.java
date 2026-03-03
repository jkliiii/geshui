package n1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import e1.v;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k1.n;
import y1.l;

/* compiled from: AnimatedImageDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<ImageHeaderParser> f9514;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f1.b f9515;

    /* compiled from: AnimatedImageDecoder.java */
    private static final class a implements v<Drawable> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final AnimatedImageDrawable f9516;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f9516 = animatedImageDrawable;
        }

        @Override // e1.v
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f9516;
        }

        @Override // e1.v
        /* renamed from: ʼ */
        public int mo8411() {
            return this.f9516.getIntrinsicWidth() * this.f9516.getIntrinsicHeight() * l.m12903(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // e1.v
        /* renamed from: ʽ */
        public Class<Drawable> mo8412() {
            return Drawable.class;
        }

        @Override // e1.v
        /* renamed from: ʾ */
        public void mo8413() {
            this.f9516.stop();
            this.f9516.clearAnimationCallbacks();
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    private static final class b implements c1.j<ByteBuffer, Drawable> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final f f9517;

        b(f fVar) {
            this.f9517 = fVar;
        }

        @Override // c1.j
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public v<Drawable> mo5835(ByteBuffer byteBuffer, int i5, int i6, c1.h hVar) throws IOException {
            return this.f9517.m10425(ImageDecoder.createSource(byteBuffer), i5, i6, hVar);
        }

        @Override // c1.j
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo5836(ByteBuffer byteBuffer, c1.h hVar) throws IOException {
            return this.f9517.m10427(byteBuffer);
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    private static final class c implements c1.j<InputStream, Drawable> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final f f9518;

        c(f fVar) {
            this.f9518 = fVar;
        }

        @Override // c1.j
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public v<Drawable> mo5835(InputStream inputStream, int i5, int i6, c1.h hVar) throws IOException {
            return this.f9518.m10425(ImageDecoder.createSource(y1.a.m12863(inputStream)), i5, i6, hVar);
        }

        @Override // c1.j
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public boolean mo5836(InputStream inputStream, c1.h hVar) throws IOException {
            return this.f9518.m10426(inputStream);
        }
    }

    private f(List<ImageHeaderParser> list, f1.b bVar) {
        this.f9514 = list;
        this.f9515 = bVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static c1.j<ByteBuffer, Drawable> m10422(List<ImageHeaderParser> list, f1.b bVar) {
        return new b(new f(list, bVar));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m10423(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static c1.j<InputStream, Drawable> m10424(List<ImageHeaderParser> list, f1.b bVar) {
        return new c(new f(list, bVar));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    v<Drawable> m10425(ImageDecoder.Source source, int i5, int i6, c1.h hVar) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new n(i5, i6, hVar));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new a((AnimatedImageDrawable) decodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean m10426(InputStream inputStream) throws IOException {
        return m10423(com.bumptech.glide.load.a.m6120(this.f9514, inputStream, this.f9515));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m10427(ByteBuffer byteBuffer) throws IOException {
        return m10423(com.bumptech.glide.load.a.m6121(this.f9514, byteBuffer));
    }
}
