package l1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* compiled from: DrawableToBitmapConverter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class u {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final f1.d f9011 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    static e1.v<Bitmap> m9707(f1.d dVar, Drawable drawable, int i5, int i6) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z5 = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmap = null;
        } else {
            bitmap = m9708(dVar, current, i5, i6);
            z5 = true;
        }
        if (!z5) {
            dVar = f9011;
        }
        return f.m9603(bitmap, dVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Bitmap m9708(f1.d dVar, Drawable drawable, int i5, int i6) {
        if (i5 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i6 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i5 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i6 = drawable.getIntrinsicHeight();
        }
        Lock m9615 = g0.m9615();
        m9615.lock();
        Bitmap mo8528 = dVar.mo8528(i5, i6, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(mo8528);
            drawable.setBounds(0, 0, i5, i6);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return mo8528;
        } finally {
            m9615.unlock();
        }
    }

    /* compiled from: DrawableToBitmapConverter.java */
    class a extends f1.e {
        a() {
        }

        @Override // f1.e, f1.d
        /* renamed from: ʾ */
        public void mo8529(Bitmap bitmap) {
        }
    }
}
