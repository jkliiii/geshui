package f3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import java.io.InputStream;
import java.nio.ByteBuffer;
import m2.t;
import x2.b0;

/* compiled from: StreamLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends j {

    /* compiled from: StreamLoader.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Context f7759;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ String f7760;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7761;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f7762;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ int f7763;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ boolean f7764;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ String f7765;

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ t f7766;

        a(Context context, String str, x2.l lVar, int i5, int i6, boolean z5, String str2, t tVar) {
            this.f7759 = context;
            this.f7760 = str;
            this.f7761 = lVar;
            this.f7762 = i5;
            this.f7763 = i6;
            this.f7764 = z5;
            this.f7765 = str2;
            this.f7766 = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th;
            InputStream inputStream;
            Exception e5;
            z2.b bVar;
            try {
                try {
                    inputStream = k.this.mo8593(this.f7759, this.f7760);
                } catch (Exception e6) {
                    inputStream = null;
                    e5 = e6;
                } catch (OutOfMemoryError e7) {
                    e = e7;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    v2.h.m12364(null);
                    throw th;
                }
                try {
                    BitmapFactory.Options m13167 = this.f7761.m12719().m13167(inputStream, this.f7762, this.f7763);
                    v2.h.m12364(inputStream);
                    Point point = new Point(m13167.outWidth, m13167.outHeight);
                    InputStream mo8593 = k.this.mo8593(this.f7759, this.f7760);
                    if (this.f7764 && TextUtils.equals("image/gif", m13167.outMimeType)) {
                        bVar = k.this.m8604(this.f7765, point, mo8593, m13167);
                    } else {
                        Bitmap m13160 = z2.d.m13160(mo8593, m13167);
                        if (m13160 == null) {
                            throw new Exception("Bitmap failed to load");
                        }
                        bVar = new z2.b(this.f7765, m13167.outMimeType, m13160, point);
                    }
                    bVar.f12773 = b0.LOADED_FROM_CACHE;
                    this.f7766.m9906(bVar);
                    v2.h.m12364(mo8593);
                } catch (Exception e8) {
                    e5 = e8;
                    this.f7766.m9905(e5);
                    v2.h.m12364(inputStream);
                } catch (OutOfMemoryError e9) {
                    e = e9;
                    this.f7766.m9904(new Exception(e), null);
                    v2.h.m12364(inputStream);
                }
            } catch (Throwable th3) {
                th = th3;
                v2.h.m12364(null);
                throw th;
            }
        }
    }

    @Override // f3.j, x2.x
    /* renamed from: ʾ */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        t tVar = new t();
        x2.l.m12710().execute(new a(context, str2, lVar, i5, i6, z5, str, tVar));
        return tVar;
    }

    /* renamed from: ʿ */
    protected InputStream mo8593(Context context, String str) throws Exception {
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected z2.b m8604(String str, Point point, InputStream inputStream, BitmapFactory.Options options) throws Exception {
        e3.a aVar = new e3.a(ByteBuffer.wrap(v2.h.m12365(inputStream)));
        z2.b bVar = new z2.b(str, options.outMimeType, aVar.m8472().f7635, point);
        bVar.f12776 = aVar;
        return bVar;
    }
}
