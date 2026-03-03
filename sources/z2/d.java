package z2;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import x2.l;

/* compiled from: IonBitmapCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    Resources f12781;

    /* renamed from: ʼ, reason: contains not printable characters */
    DisplayMetrics f12782;

    /* renamed from: ʽ, reason: contains not printable characters */
    e f12783;

    /* renamed from: ʾ, reason: contains not printable characters */
    l f12784;

    /* renamed from: ʿ, reason: contains not printable characters */
    long f12785 = 30000;

    /* renamed from: ˆ, reason: contains not printable characters */
    double f12786 = 0.14285714285714285d;

    public d(l lVar) {
        Context applicationContext = lVar.m12720().getApplicationContext();
        this.f12784 = lVar;
        this.f12782 = new DisplayMetrics();
        ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(this.f12782);
        this.f12781 = new Resources(applicationContext.getAssets(), this.f12782, applicationContext.getResources().getConfiguration());
        this.f12783 = new e(m13156(applicationContext) / 7);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private Point m13155(int i5, int i6) {
        if (i5 == 0) {
            i5 = this.f12782.widthPixels;
        }
        if (i5 <= 0) {
            i5 = Integer.MAX_VALUE;
        }
        if (i6 == 0) {
            i6 = this.f12782.heightPixels;
        }
        return new Point(i5, i6 > 0 ? i6 : Integer.MAX_VALUE);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static int m13156(Context context) {
        return ((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1024 * 1024;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Bitmap m13157(Bitmap bitmap, int i5) {
        if (bitmap == null) {
            return null;
        }
        if (i5 == 0) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(i5);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Bitmap m13158(Resources resources, int i5, BitmapFactory.Options options) {
        InputStream inputStream;
        int i6;
        try {
            inputStream = resources.openRawResource(i5);
        } catch (Exception unused) {
            inputStream = null;
        }
        try {
            byte[] bArr = new byte[50000];
            i6 = c.m13153(bArr, 0, inputStream.read(bArr));
        } catch (Exception unused2) {
            i6 = 0;
            v2.h.m12364(inputStream);
            return m13157(BitmapFactory.decodeResource(resources, i5, options), i6);
        }
        v2.h.m12364(inputStream);
        return m13157(BitmapFactory.decodeResource(resources, i5, options), i6);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static Bitmap m13159(File file, BitmapFactory.Options options) {
        FileInputStream fileInputStream;
        int i5;
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[50000];
                i5 = c.m13153(bArr, 0, fileInputStream.read(bArr));
            } catch (Exception unused) {
                fileInputStream2 = fileInputStream;
                fileInputStream = fileInputStream2;
                i5 = 0;
                v2.h.m12364(fileInputStream);
                return m13157(BitmapFactory.decodeFile(file.toString(), options), i5);
            }
        } catch (Exception unused2) {
        }
        v2.h.m12364(fileInputStream);
        return m13157(BitmapFactory.decodeFile(file.toString(), options), i5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static Bitmap m13160(InputStream inputStream, BitmapFactory.Options options) throws IOException {
        f fVar = new f(inputStream);
        fVar.mark(50000);
        int i5 = 0;
        try {
            byte[] bArr = new byte[50000];
            i5 = c.m13153(bArr, 0, fVar.read(bArr));
        } catch (Exception unused) {
        }
        fVar.reset();
        return m13157(BitmapFactory.decodeStream(fVar, null, options), i5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static Bitmap m13161(byte[] bArr, int i5, int i6, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i5, i6, options);
        if (decodeByteArray == null) {
            return null;
        }
        return m13157(decodeByteArray, c.m13153(bArr, i5, i6));
    }

    @TargetApi(10)
    /* renamed from: ˊ, reason: contains not printable characters */
    public static Bitmap m13162(BitmapRegionDecoder bitmapRegionDecoder, Rect rect, int i5) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i5;
        return bitmapRegionDecoder.decodeRegion(rect, options);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private BitmapFactory.Options m13163(BitmapFactory.Options options, int i5, int i6) throws a {
        if (options.outWidth < 0 || options.outHeight < 0) {
            throw new a(options.outWidth, options.outHeight);
        }
        Point m13155 = m13155(i5, i6);
        int round = Math.round(Math.max(options.outWidth / m13155.x, options.outHeight / m13155.y));
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = round;
        options2.outWidth = options.outWidth;
        options2.outHeight = options.outHeight;
        options2.outMimeType = options.outMimeType;
        return options2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public b m13164(String str) {
        b m13172;
        if (str == null || (m13172 = this.f12783.m13172(str)) == null) {
            return null;
        }
        Bitmap bitmap = m13172.f12774;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("ION", "Cached bitmap was recycled.");
            Log.w("ION", "This may happen if passing Ion bitmaps directly to notification builders or remote media clients.");
            Log.w("ION", "Create a deep copy before doing this.");
            this.f12783.m12362(str);
            return null;
        }
        if (m13172.f12775 == null) {
            return m13172;
        }
        if (m13172.f12770 + this.f12785 > System.currentTimeMillis()) {
            return m13172;
        }
        this.f12783.m12362(str);
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public BitmapFactory.Options m13165(Resources resources, int i5, int i6, int i7) throws a {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i5, options);
        return m13163(options, i6, i7);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public BitmapFactory.Options m13166(File file, int i5, int i6) throws a {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.toString(), options);
        return m13163(options, i5, i6);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public BitmapFactory.Options m13167(InputStream inputStream, int i5, int i6) throws a {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return m13163(options, i5, i6);
    }

    /* renamed from: י, reason: contains not printable characters */
    public BitmapFactory.Options m13168(byte[] bArr, int i5, int i6, int i7, int i8) throws a {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, i5, i6, options);
        return m13163(options, i7, i8);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m13169(b bVar) {
        double m13156 = m13156(this.f12784.m12720());
        double d6 = this.f12786;
        Double.isNaN(m13156);
        long j5 = (int) (m13156 * d6);
        if (j5 != this.f12783.m12360()) {
            this.f12783.m12363(j5);
        }
        this.f12783.m12361(bVar.f12772, bVar);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public void m13170(b bVar) {
        this.f12783.m13173(bVar.f12772, bVar);
    }
}
