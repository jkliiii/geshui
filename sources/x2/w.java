package x2;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;

/* compiled from: LoadDeepZoom.java */
@TargetApi(10)
/* loaded from: E:\78999\cookie_5123796.dex */
public class w extends u implements m2.g<a0<File>> {

    /* renamed from: ˉ, reason: contains not printable characters */
    v2.d f12371;

    /* compiled from: LoadDeepZoom.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ File f12372;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ a0 f12373;

        a(File file, a0 a0Var) {
            this.f12372 = file;
            this.f12373 = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            FileInputStream fileInputStream;
            File file;
            FileInputStream fileInputStream2 = null;
            try {
                w wVar = w.this;
                v2.d dVar = wVar.f12371;
                if (dVar != null) {
                    dVar.m12330(wVar.f12121, this.f12372);
                    w wVar2 = w.this;
                    file = wVar2.f12371.m12334(wVar2.f12121);
                } else {
                    file = this.f12372;
                }
                BitmapFactory.Options m13166 = w.this.f12122.m12719().m13166(file, 0, 0);
                Point point = new Point(m13166.outWidth, m13166.outHeight);
                if (!w.this.f12365 || !TextUtils.equals("image/gif", m13166.outMimeType)) {
                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(file.toString(), false);
                    Bitmap decodeRegion = newInstance.decodeRegion(new Rect(0, 0, point.x, point.y), m13166);
                    if (decodeRegion == null) {
                        throw new Exception("unable to load decoder");
                    }
                    z2.b bVar = new z2.b(w.this.f12121, m13166.outMimeType, decodeRegion, point);
                    bVar.f12777 = newInstance;
                    bVar.f12778 = file;
                    bVar.f12773 = this.f12373.m12681();
                    w.this.m12678(null, bVar);
                    v2.h.m12364(null);
                    return;
                }
                w wVar3 = w.this;
                FileInputStream m12332 = wVar3.f12371.m12332(wVar3.f12121);
                try {
                    e3.a aVar = new e3.a(ByteBuffer.wrap(v2.h.m12365(m12332)));
                    z2.b bVar2 = new z2.b(w.this.f12121, m13166.outMimeType, aVar.m8472().f7635, point);
                    bVar2.f12776 = aVar;
                    w.this.m12678(null, bVar2);
                    v2.h.m12364(m12332);
                } catch (Exception e5) {
                    fileInputStream = m12332;
                    e = e5;
                    try {
                        w.this.m12678(e, null);
                        v2.h.m12364(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        v2.h.m12364(fileInputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = m12332;
                    v2.h.m12364(fileInputStream2);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public w(l lVar, String str, boolean z5, v2.d dVar) {
        super(lVar, str, true, z5);
        this.f12371 = dVar;
    }

    @Override // m2.g
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo8740(Exception exc, a0<File> a0Var) {
        if (exc == null) {
            exc = a0Var.m12679();
        }
        if (exc != null) {
            m12678(exc, null);
            return;
        }
        File m12680 = a0Var.m12680();
        if (this.f12122.f12208.m12354(this.f12121) != this) {
            return;
        }
        l.m12710().execute(new a(m12680, a0Var));
    }
}
