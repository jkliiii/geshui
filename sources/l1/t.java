package l1;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import l1.n;
import l1.z;

/* compiled from: Downsampler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class t {

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final c1.g<c1.b> f8997 = c1.g.m5826("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", c1.b.f4971);

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final c1.g<c1.i> f8998 = c1.g.m5825("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");

    /* renamed from: ˉ, reason: contains not printable characters */
    @Deprecated
    public static final c1.g<n> f8999 = n.f8992;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final c1.g<Boolean> f9000;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final c1.g<Boolean> f9001;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Set<String> f9002;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final b f9003;

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final Set<ImageHeaderParser.ImageType> f9004;

    /* renamed from: י, reason: contains not printable characters */
    private static final Queue<BitmapFactory.Options> f9005;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.d f9006;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final DisplayMetrics f9007;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final f1.b f9008;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final List<ImageHeaderParser> f9009;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final y f9010 = y.m9712();

    /* compiled from: Downsampler.java */
    public interface b {
        /* renamed from: ʻ */
        void mo9607(f1.d dVar, Bitmap bitmap) throws IOException;

        /* renamed from: ʼ */
        void mo9608();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f9000 = c1.g.m5826("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f9001 = c1.g.m5826("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f9002 = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f9003 = new a();
        f9004 = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f9005 = y1.l.m12900(0);
    }

    public t(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, f1.d dVar, f1.b bVar) {
        this.f9009 = list;
        this.f9007 = (DisplayMetrics) y1.k.m12893(displayMetrics);
        this.f9006 = (f1.d) y1.k.m12893(dVar);
        this.f9008 = (f1.b) y1.k.m12893(bVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m9681(double d6) {
        int m9689 = m9689(d6);
        double d7 = m9689;
        Double.isNaN(d7);
        int m9698 = m9698(d7 * d6);
        double d8 = m9698 / m9689;
        Double.isNaN(d8);
        double d9 = m9698;
        Double.isNaN(d9);
        return m9698((d6 / d8) * d9);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m9682(z zVar, c1.b bVar, boolean z5, boolean z6, BitmapFactory.Options options, int i5, int i6) {
        boolean z7;
        if (this.f9010.m9717(i5, i6, options, z5, z6)) {
            return;
        }
        if (bVar == c1.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z7 = zVar.mo9722().hasAlpha();
        } catch (IOException e5) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + bVar, e5);
            }
            z7 = false;
        }
        Bitmap.Config config = z7 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m9683(ImageHeaderParser.ImageType imageType, z zVar, b bVar, f1.d dVar, n nVar, int i5, int i6, int i7, int i8, int i9, BitmapFactory.Options options) throws IOException {
        int i10;
        int i11;
        int i12;
        int floor;
        double floor2;
        int i13;
        if (i6 <= 0 || i7 <= 0) {
            if (Log.isLoggable("Downsampler", 3)) {
                Log.d("Downsampler", "Unable to determine dimensions for: " + imageType + " with target [" + i8 + "x" + i9 + "]");
                return;
            }
            return;
        }
        if (m9692(i5)) {
            i11 = i6;
            i10 = i7;
        } else {
            i10 = i6;
            i11 = i7;
        }
        float mo9674 = nVar.mo9674(i10, i11, i8, i9);
        if (mo9674 <= 0.0f) {
            throw new IllegalArgumentException("Cannot scale with factor: " + mo9674 + " from: " + nVar + ", source: [" + i6 + "x" + i7 + "], target: [" + i8 + "x" + i9 + "]");
        }
        n.g mo9673 = nVar.mo9673(i10, i11, i8, i9);
        if (mo9673 == null) {
            throw new IllegalArgumentException("Cannot round with null rounding");
        }
        float f5 = i10;
        float f6 = i11;
        int m9698 = i10 / m9698(mo9674 * f5);
        int m96982 = i11 / m9698(mo9674 * f6);
        n.g gVar = n.g.MEMORY;
        int max = mo9673 == gVar ? Math.max(m9698, m96982) : Math.min(m9698, m96982);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 > 23 || !f9002.contains(options.outMimeType)) {
            int max2 = Math.max(1, Integer.highestOneBit(max));
            if (mo9673 == gVar && max2 < 1.0f / mo9674) {
                max2 <<= 1;
            }
            i12 = max2;
        } else {
            i12 = 1;
        }
        options.inSampleSize = i12;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(i12, 8);
            floor = (int) Math.ceil(f5 / min);
            i13 = (int) Math.ceil(f6 / min);
            int i15 = i12 / 8;
            if (i15 > 0) {
                floor /= i15;
                i13 /= i15;
            }
        } else {
            if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
                float f7 = i12;
                floor = (int) Math.floor(f5 / f7);
                floor2 = Math.floor(f6 / f7);
            } else if (imageType.isWebp()) {
                if (i14 >= 24) {
                    float f8 = i12;
                    floor = Math.round(f5 / f8);
                    i13 = Math.round(f6 / f8);
                } else {
                    float f9 = i12;
                    floor = (int) Math.floor(f5 / f9);
                    floor2 = Math.floor(f6 / f9);
                }
            } else if (i10 % i12 == 0 && i11 % i12 == 0) {
                floor = i10 / i12;
                i13 = i11 / i12;
            } else {
                int[] m9690 = m9690(zVar, options, bVar, dVar);
                floor = m9690[0];
                i13 = m9690[1];
            }
            i13 = (int) floor2;
        }
        double mo96742 = nVar.mo9674(floor, i13, i8, i9);
        options.inTargetDensity = m9681(mo96742);
        options.inDensity = m9689(mo96742);
        if (m9693(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        if (Log.isLoggable("Downsampler", 2)) {
            Log.v("Downsampler", "Calculate scaling, source: [" + i6 + "x" + i7 + "], degreesToRotate: " + i5 + ", target: [" + i8 + "x" + i9 + "], power of two scaled: [" + floor + "x" + i13 + "], exact scale factor: " + mo9674 + ", power of 2 sample size: " + i12 + ", adjusted scale factor: " + mo96742 + ", target density: " + options.inTargetDensity + ", density: " + options.inDensity);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private e1.v<Bitmap> m9684(z zVar, int i5, int i6, c1.h hVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f9008.mo8522(65536, byte[].class);
        BitmapFactory.Options m9688 = m9688();
        m9688.inTempStorage = bArr;
        c1.b bVar2 = (c1.b) hVar.m5831(f8997);
        c1.i iVar = (c1.i) hVar.m5831(f8998);
        n nVar = (n) hVar.m5831(n.f8992);
        boolean booleanValue = ((Boolean) hVar.m5831(f9000)).booleanValue();
        c1.g<Boolean> gVar = f9001;
        try {
            return f.m9603(m9685(zVar, m9688, nVar, bVar2, iVar, hVar.m5831(gVar) != null && ((Boolean) hVar.m5831(gVar)).booleanValue(), i5, i6, booleanValue, bVar), this.f9006);
        } finally {
            m9696(m9688);
            this.f9008.put(bArr);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private Bitmap m9685(z zVar, BitmapFactory.Options options, n nVar, c1.b bVar, c1.i iVar, boolean z5, int i5, int i6, boolean z6, b bVar2) throws IOException {
        int i7;
        int i8;
        String str;
        int round;
        int round2;
        long m12879 = y1.g.m12879();
        int[] m9690 = m9690(zVar, options, bVar2, this.f9006);
        boolean z7 = false;
        int i9 = m9690[0];
        int i10 = m9690[1];
        String str2 = options.outMimeType;
        boolean z8 = (i9 == -1 || i10 == -1) ? false : z5;
        int mo9721 = zVar.mo9721();
        int m9616 = g0.m9616(mo9721);
        boolean m9619 = g0.m9619(mo9721);
        if (i5 == Integer.MIN_VALUE) {
            i7 = i6;
            i8 = m9692(m9616) ? i10 : i9;
        } else {
            i7 = i6;
            i8 = i5;
        }
        int i11 = i7 == Integer.MIN_VALUE ? m9692(m9616) ? i9 : i10 : i7;
        ImageHeaderParser.ImageType mo9722 = zVar.mo9722();
        m9683(mo9722, zVar, bVar2, this.f9006, nVar, m9616, i9, i10, i8, i11, options);
        m9682(zVar, bVar, z8, m9619, options, i8, i11);
        int i12 = Build.VERSION.SDK_INT;
        int i13 = options.inSampleSize;
        if (m9700(mo9722)) {
            if (i9 < 0 || i10 < 0 || !z6) {
                float f5 = m9693(options) ? options.inTargetDensity / options.inDensity : 1.0f;
                int i14 = options.inSampleSize;
                float f6 = i14;
                int ceil = (int) Math.ceil(i9 / f6);
                int ceil2 = (int) Math.ceil(i10 / f6);
                round = Math.round(ceil * f5);
                round2 = Math.round(ceil2 * f5);
                str = "Downsampler";
                if (Log.isLoggable(str, 2)) {
                    Log.v(str, "Calculated target [" + round + "x" + round2 + "] for source [" + i9 + "x" + i10 + "], sampleSize: " + i14 + ", targetDensity: " + options.inTargetDensity + ", density: " + options.inDensity + ", density multiplier: " + f5);
                }
            } else {
                str = "Downsampler";
                round = i8;
                round2 = i11;
            }
            if (round > 0 && round2 > 0) {
                m9699(options, this.f9006, round, round2);
            }
        } else {
            str = "Downsampler";
        }
        if (iVar != null) {
            if (i12 >= 28) {
                if (iVar == c1.i.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                    z7 = true;
                }
                options.inPreferredColorSpace = ColorSpace.get(z7 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            } else if (i12 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap m9686 = m9686(zVar, options, bVar2, this.f9006);
        bVar2.mo9607(this.f9006, m9686);
        if (Log.isLoggable(str, 2)) {
            m9694(i9, i10, str2, options, m9686, i5, i6, m12879);
        }
        if (m9686 == null) {
            return null;
        }
        m9686.setDensity(this.f9007.densityDpi);
        Bitmap m9620 = g0.m9620(this.f9006, m9686, mo9721);
        if (m9686.equals(m9620)) {
            return m9620;
        }
        this.f9006.mo8529(m9686);
        return m9620;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        throw r1;
     */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Bitmap m9686(l1.z r5, android.graphics.BitmapFactory.Options r6, l1.t.b r7, f1.d r8) throws java.io.IOException {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r7.mo9608()
            r5.mo9720()
        Lc:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = l1.g0.m9615()
            r4.lock()
            android.graphics.Bitmap r5 = r5.mo9719(r6)     // Catch: java.lang.Throwable -> L25 java.lang.IllegalArgumentException -> L27
            java.util.concurrent.locks.Lock r6 = l1.g0.m9615()
            r6.unlock()
            return r5
        L25:
            r5 = move-exception
            goto L50
        L27:
            r4 = move-exception
            java.io.IOException r1 = m9695(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L25
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L38
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L25
        L38:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L4f
            r8.mo8529(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            r0 = 0
            r6.inBitmap = r0     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            android.graphics.Bitmap r5 = m9686(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> L4e
            java.util.concurrent.locks.Lock r6 = l1.g0.m9615()
            r6.unlock()
            return r5
        L4e:
            throw r1     // Catch: java.lang.Throwable -> L25
        L4f:
            throw r1     // Catch: java.lang.Throwable -> L25
        L50:
            java.util.concurrent.locks.Lock r6 = l1.g0.m9615()
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.t.m9686(l1.z, android.graphics.BitmapFactory$Options, l1.t$b, f1.d):android.graphics.Bitmap");
    }

    @TargetApi(19)
    /* renamed from: ˋ, reason: contains not printable characters */
    private static String m9687(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static synchronized BitmapFactory.Options m9688() {
        BitmapFactory.Options poll;
        synchronized (t.class) {
            Queue<BitmapFactory.Options> queue = f9005;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m9697(poll);
            }
        }
        return poll;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static int m9689(double d6) {
        if (d6 > 1.0d) {
            d6 = 1.0d / d6;
        }
        return (int) Math.round(d6 * 2.147483647E9d);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static int[] m9690(z zVar, BitmapFactory.Options options, b bVar, f1.d dVar) throws IOException {
        options.inJustDecodeBounds = true;
        m9686(zVar, options, bVar, dVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: י, reason: contains not printable characters */
    private static String m9691(BitmapFactory.Options options) {
        return m9687(options.inBitmap);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static boolean m9692(int i5) {
        return i5 == 90 || i5 == 270;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static boolean m9693(BitmapFactory.Options options) {
        int i5;
        int i6 = options.inTargetDensity;
        return i6 > 0 && (i5 = options.inDensity) > 0 && i6 != i5;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private static void m9694(int i5, int i6, String str, BitmapFactory.Options options, Bitmap bitmap, int i7, int i8, long j5) {
        Log.v("Downsampler", "Decoded " + m9687(bitmap) + " from [" + i5 + "x" + i6 + "] " + str + " with inBitmap " + m9691(options) + " for [" + i7 + "x" + i8 + "], sample size: " + options.inSampleSize + ", density: " + options.inDensity + ", target density: " + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + y1.g.m12878(j5));
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static IOException m9695(IllegalArgumentException illegalArgumentException, int i5, int i6, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i5 + ", outHeight: " + i6 + ", outMimeType: " + str + ", inBitmap: " + m9691(options), illegalArgumentException);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static void m9696(BitmapFactory.Options options) {
        m9697(options);
        Queue<BitmapFactory.Options> queue = f9005;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static void m9697(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static int m9698(double d6) {
        return (int) (d6 + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: ﾞ, reason: contains not printable characters */
    private static void m9699(BitmapFactory.Options options, f1.d dVar, int i5, int i6) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return;
        } else {
            config = options.outConfig;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = dVar.mo8530(i5, i6, config);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean m9700(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public e1.v<Bitmap> m9701(ParcelFileDescriptor parcelFileDescriptor, int i5, int i6, c1.h hVar) throws IOException {
        return m9684(new z.c(parcelFileDescriptor, this.f9009, this.f9008), i5, i6, hVar, f9003);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public e1.v<Bitmap> m9702(InputStream inputStream, int i5, int i6, c1.h hVar, b bVar) throws IOException {
        return m9684(new z.b(inputStream, this.f9009, this.f9008), i5, i6, hVar, bVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public e1.v<Bitmap> m9703(ByteBuffer byteBuffer, int i5, int i6, c1.h hVar) throws IOException {
        return m9684(new z.a(byteBuffer, this.f9009, this.f9008), i5, i6, hVar, f9003);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m9704(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m6125();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m9705(InputStream inputStream) {
        return true;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m9706(ByteBuffer byteBuffer) {
        return true;
    }

    /* compiled from: Downsampler.java */
    class a implements b {
        a() {
        }

        @Override // l1.t.b
        /* renamed from: ʼ */
        public void mo9608() {
        }

        @Override // l1.t.b
        /* renamed from: ʻ */
        public void mo9607(f1.d dVar, Bitmap bitmap) {
        }
    }
}
