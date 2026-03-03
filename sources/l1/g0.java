package l1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final Paint f8959 = new Paint(6);

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Paint f8960 = new Paint(7);

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Paint f8961;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final Set<String> f8962;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final Lock f8963;

    /* compiled from: TransformationUtils.java */
    private static final class a implements Lock {
        a() {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j5, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f8962 = hashSet;
        f8963 = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f8961 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m9610(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f8963;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f8959);
            m9613(canvas);
            lock.unlock();
        } catch (Throwable th) {
            f8963.unlock();
            throw th;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Bitmap m9611(f1.d dVar, Bitmap bitmap, int i5, int i6) {
        float width;
        float height;
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f5 = 0.0f;
        if (bitmap.getWidth() * i6 > bitmap.getHeight() * i5) {
            width = i6 / bitmap.getHeight();
            f5 = (i5 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i5 / bitmap.getWidth();
            height = (i6 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
        Bitmap mo8528 = dVar.mo8528(i5, i6, m9617(bitmap));
        m9621(bitmap, mo8528);
        m9610(bitmap, mo8528, matrix);
        return mo8528;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static Bitmap m9612(f1.d dVar, Bitmap bitmap, int i5, int i6) {
        if (bitmap.getWidth() > i5 || bitmap.getHeight() > i6) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return m9614(dVar, bitmap, i5, i6);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m9613(Canvas canvas) {
        canvas.setBitmap(null);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Bitmap m9614(f1.d dVar, Bitmap bitmap, int i5, int i6) {
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float min = Math.min(i5 / bitmap.getWidth(), i6 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap mo8528 = dVar.mo8528((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), m9617(bitmap));
        m9621(bitmap, mo8528);
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i5 + "x" + i6);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + mo8528.getWidth() + "x" + mo8528.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(min);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        m9610(bitmap, mo8528, matrix);
        return mo8528;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static Lock m9615() {
        return f8963;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static int m9616(int i5) {
        switch (i5) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static Bitmap.Config m9617(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m9618(int i5, Matrix matrix) {
        switch (i5) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m9619(int i5) {
        switch (i5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static Bitmap m9620(f1.d dVar, Bitmap bitmap, int i5) {
        if (!m9619(i5)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        m9618(i5, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap mo8528 = dVar.mo8528(Math.round(rectF.width()), Math.round(rectF.height()), m9617(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        mo8528.setHasAlpha(bitmap.hasAlpha());
        m9610(bitmap, mo8528, matrix);
        return mo8528;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m9621(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
