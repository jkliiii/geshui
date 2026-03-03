package x2;

import android.graphics.Bitmap;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;

/* compiled from: LoadBitmapRegion.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v extends x2.a {

    /* compiled from: LoadBitmapRegion.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ BitmapRegionDecoder f12366;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Rect f12367;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ int f12368;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ String f12369;

        a(BitmapRegionDecoder bitmapRegionDecoder, Rect rect, int i5, String str) {
            this.f12366 = bitmapRegionDecoder;
            this.f12367 = rect;
            this.f12368 = i5;
            this.f12369 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Bitmap m13162 = z2.d.m13162(this.f12366, this.f12367, this.f12368);
                if (m13162 == null) {
                    throw new Exception("failed to load bitmap region");
                }
                v.this.m12678(null, new z2.b(this.f12369, null, m13162, new Point(m13162.getWidth(), m13162.getHeight())));
            } catch (Exception e5) {
                v.this.m12678(e5, null);
            }
        }
    }

    public v(l lVar, String str, BitmapRegionDecoder bitmapRegionDecoder, Rect rect, int i5) {
        super(lVar, str, true);
        l.m12710().execute(new a(bitmapRegionDecoder, rect, i5, str));
    }
}
