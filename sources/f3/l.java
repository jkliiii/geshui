package f3;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.os.Build;
import f3.g;
import java.io.File;
import java.net.URI;
import m2.t;
import x2.b0;

/* compiled from: VideoLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends j {

    /* compiled from: VideoLoader.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ String f7768;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ t f7769;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ int f7770;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f7771;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ String f7772;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ g.a f7773;

        a(String str, t tVar, int i5, int i6, String str2, g.a aVar) {
            this.f7768 = str;
            this.f7769 = tVar;
            this.f7770 = i5;
            this.f7771 = i6;
            this.f7772 = str2;
            this.f7773 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(URI.create(this.f7768));
            if (this.f7769.isCancelled()) {
                return;
            }
            try {
                Bitmap m8605 = !l.m8606() ? l.m8605(file.getAbsolutePath()) : ThumbnailUtils.createVideoThumbnail(file.getAbsolutePath(), 1);
                if (m8605 == null) {
                    throw new Exception("video bitmap failed to load");
                }
                Point point = new Point(m8605.getWidth(), m8605.getHeight());
                if (m8605.getWidth() > this.f7770 * 2 && m8605.getHeight() > this.f7771 * 2) {
                    float min = Math.min(this.f7770 / m8605.getWidth(), this.f7771 / m8605.getHeight());
                    if (min != 0.0f) {
                        m8605 = Bitmap.createScaledBitmap(m8605, (int) (m8605.getWidth() * min), (int) (m8605.getHeight() * min), true);
                    }
                }
                z2.b bVar = new z2.b(this.f7772, this.f7773.f7737, m8605, point);
                bVar.f12773 = b0.LOADED_FROM_CACHE;
                this.f7769.m9906(bVar);
            } catch (Exception e5) {
                this.f7769.m9905(e5);
            } catch (OutOfMemoryError e6) {
                this.f7769.m9905(new Exception(e6));
            }
        }
    }

    @TargetApi(10)
    /* renamed from: ʿ, reason: contains not printable characters */
    public static Bitmap m8605(String str) throws Exception {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        try {
            return mediaMetadataRetriever.getFrameAtTime();
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static boolean m8606() {
        return Build.MANUFACTURER.toLowerCase().contains("samsung");
    }

    @Override // f3.j, x2.x
    /* renamed from: ʾ */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        g.a m8598;
        if (!str2.startsWith("file") || (m8598 = g.m8598(str2)) == null || !g.m8599(m8598.f7736)) {
            return null;
        }
        t tVar = new t();
        x2.l.m12710().execute(new a(str2, tVar, i5, i6, str, m8598));
        return tVar;
    }
}
