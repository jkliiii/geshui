package l1;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import c1.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k0<T> implements c1.j<T, Bitmap> {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final c1.g<Long> f8968 = c1.g.m5822("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final c1.g<Integer> f8969 = c1.g.m5822("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final f f8970 = new f();

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final List<String> f8971 = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e<T> f8972;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f1.d f8973;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final f f8974;

    /* compiled from: VideoDecoder.java */
    class a implements g.b<Long> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ByteBuffer f8975 = ByteBuffer.allocate(8);

        a() {
        }

        @Override // c1.g.b
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5829(byte[] bArr, Long l5, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f8975) {
                this.f8975.position(0);
                messageDigest.update(this.f8975.putLong(l5.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    class b implements g.b<Integer> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ByteBuffer f8976 = ByteBuffer.allocate(4);

        b() {
        }

        @Override // c1.g.b
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5829(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f8976) {
                this.f8976.position(0);
                messageDigest.update(this.f8976.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        @Override // l1.k0.e
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9646(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // l1.k0.e
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9645(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    interface e<T> {
        /* renamed from: ʻ */
        void mo9645(MediaMetadataRetriever mediaMetadataRetriever, T t5);

        /* renamed from: ʼ */
        void mo9646(MediaExtractor mediaExtractor, T t5) throws IOException;
    }

    /* compiled from: VideoDecoder.java */
    static class f {
        f() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public MediaMetadataRetriever m9652() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // l1.k0.e
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9646(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // l1.k0.e
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9645(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    private static final class h extends RuntimeException {
        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    k0(f1.d dVar, e<T> eVar) {
        this(dVar, eVar, f8970);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static c1.j<AssetFileDescriptor, Bitmap> m9632(f1.d dVar) {
        return new k0(dVar, new c(null));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static c1.j<ByteBuffer, Bitmap> m9633(f1.d dVar) {
        return new k0(dVar, new d());
    }

    @TargetApi(30)
    /* renamed from: ʿ, reason: contains not printable characters */
    private static Bitmap m9634(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m9639()) {
            return bitmap;
        }
        boolean z5 = false;
        try {
            if (m9638(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    z5 = true;
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z5) {
            return bitmap;
        }
        if (Log.isLoggable("VideoDecoder", 3)) {
            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private Bitmap m9635(T t5, MediaMetadataRetriever mediaMetadataRetriever, long j5, int i5, int i6, int i7, n nVar) {
        if (m9641(t5, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap m9637 = (Build.VERSION.SDK_INT < 27 || i6 == Integer.MIN_VALUE || i7 == Integer.MIN_VALUE || nVar == n.f8990) ? null : m9637(mediaMetadataRetriever, j5, i5, i6, i7, nVar);
        if (m9637 == null) {
            m9637 = m9636(mediaMetadataRetriever, j5, i5);
        }
        Bitmap m9634 = m9634(mediaMetadataRetriever, m9637);
        if (m9634 != null) {
            return m9634;
        }
        throw new h();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static Bitmap m9636(MediaMetadataRetriever mediaMetadataRetriever, long j5, int i5) {
        return mediaMetadataRetriever.getFrameAtTime(j5, i5);
    }

    @TargetApi(27)
    /* renamed from: ˉ, reason: contains not printable characters */
    private static Bitmap m9637(MediaMetadataRetriever mediaMetadataRetriever, long j5, int i5, int i6, int i7, n nVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float mo9674 = nVar.mo9674(parseInt, parseInt2, i6, i7);
            return mediaMetadataRetriever.getScaledFrameAtTime(j5, i5, Math.round(parseInt * mo9674), Math.round(mo9674 * parseInt2));
        } catch (Throwable th) {
            if (!Log.isLoggable("VideoDecoder", 3)) {
                return null;
            }
            Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
            return null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m9638(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static boolean m9639() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m9640();
        }
        int i5 = Build.VERSION.SDK_INT;
        return i5 >= 30 && i5 < 33;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m9640() {
        Iterator<String> it = f8971.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m9641(T t5, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (!(str != null && str.matches(".+_cheets|cheets_.+"))) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f8972.mo9646(mediaExtractor2, t5);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i5 = 0; i5 < trackCount; i5++) {
                if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i5).getString("mime"))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable th2) {
            th = th2;
            mediaExtractor = mediaExtractor2;
            try {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                }
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static c1.j<ParcelFileDescriptor, Bitmap> m9642(f1.d dVar) {
        return new k0(dVar, new g());
    }

    @Override // c1.j
    /* renamed from: ʻ */
    public e1.v<Bitmap> mo5835(T t5, int i5, int i6, c1.h hVar) throws IOException {
        long longValue = ((Long) hVar.m5831(f8968)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) hVar.m5831(f8969);
        if (num == null) {
            num = 2;
        }
        n nVar = (n) hVar.m5831(n.f8992);
        if (nVar == null) {
            nVar = n.f8991;
        }
        n nVar2 = nVar;
        MediaMetadataRetriever m9652 = this.f8974.m9652();
        try {
            this.f8972.mo9645(m9652, t5);
            return l1.f.m9603(m9635(t5, m9652, longValue, num.intValue(), i5, i6, nVar2), this.f8973);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                m9652.close();
            } else {
                m9652.release();
            }
        }
    }

    @Override // c1.j
    /* renamed from: ʼ */
    public boolean mo5836(T t5, c1.h hVar) {
        return true;
    }

    k0(f1.d dVar, e<T> eVar, f fVar) {
        this.f8973 = dVar;
        this.f8972 = eVar;
        this.f8974 = fVar;
    }

    /* compiled from: VideoDecoder.java */
    static final class d implements e<ByteBuffer> {
        d() {
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private MediaDataSource m9649(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // l1.k0.e
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9646(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(m9649(byteBuffer));
        }

        @Override // l1.k0.e
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9645(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(m9649(byteBuffer));
        }

        /* compiled from: VideoDecoder.java */
        class a extends MediaDataSource {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ ByteBuffer f8977;

            a(ByteBuffer byteBuffer) {
                this.f8977 = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f8977.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j5, byte[] bArr, int i5, int i6) {
                if (j5 >= this.f8977.limit()) {
                    return -1;
                }
                this.f8977.position((int) j5);
                int min = Math.min(i6, this.f8977.remaining());
                this.f8977.get(bArr, i5, min);
                return min;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
