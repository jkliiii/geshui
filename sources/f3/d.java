package f3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.net.URI;
import k2.s;
import k2.w;
import m2.t;
import x2.b0;
import x2.x;

/* compiled from: FileLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends k {

    /* compiled from: FileLoader.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ t f7715;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ String f7716;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7717;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f7718;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ int f7719;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ boolean f7720;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ String f7721;

        a(t tVar, String str, x2.l lVar, int i5, int i6, boolean z5, String str2) {
            this.f7715 = tVar;
            this.f7716 = str;
            this.f7717 = lVar;
            this.f7718 = i5;
            this.f7719 = i6;
            this.f7720 = z5;
            this.f7721 = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            z2.b bVar;
            if (this.f7715.isCancelled()) {
                return;
            }
            try {
                File file = new File(URI.create(this.f7716));
                BitmapFactory.Options m13166 = this.f7717.m12719().m13166(file, this.f7718, this.f7719);
                Point point = new Point(m13166.outWidth, m13166.outHeight);
                if (this.f7720 && TextUtils.equals("image/gif", m13166.outMimeType)) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        bVar = d.this.m8604(this.f7721, point, fileInputStream, m13166);
                        v2.h.m12364(fileInputStream);
                    } catch (Throwable th) {
                        v2.h.m12364(fileInputStream);
                        throw th;
                    }
                } else {
                    Bitmap m13159 = z2.d.m13159(file, m13166);
                    if (m13159 == null) {
                        throw new Exception("Bitmap failed to load");
                    }
                    bVar = new z2.b(this.f7721, m13166.outMimeType, m13159, point);
                }
                bVar.f12773 = b0.LOADED_FROM_CACHE;
                this.f7715.m9906(bVar);
            } catch (Exception e5) {
                this.f7715.m9905(e5);
            } catch (OutOfMemoryError e6) {
                this.f7715.m9904(new Exception(e6), null);
            }
        }
    }

    /* compiled from: FileLoader.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ n2.e f7723;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7724;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ c f7725;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m2.g f7726;

        b(n2.e eVar, x2.l lVar, c cVar, m2.g gVar) {
            this.f7723 = eVar;
            this.f7724 = lVar;
            this.f7725 = cVar;
            this.f7726 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w wVar = new w(this.f7724.m12721().m10465(), new File(URI.create(this.f7723.m10509().toString())));
            this.f7725.m9906(wVar);
            this.f7726.mo8740(null, new x.a(wVar, (int) r0.length(), b0.LOADED_FROM_CACHE, null, this.f7723));
        }
    }

    /* compiled from: FileLoader.java */
    private static final class c extends t<s> {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    @Override // f3.j, x2.x
    /* renamed from: ʼ */
    public m2.f<s> mo8591(x2.l lVar, n2.e eVar, m2.g<x.a> gVar) {
        a aVar = null;
        if (eVar.m10509().getScheme() == null || !eVar.m10509().getScheme().startsWith("file")) {
            return null;
        }
        c cVar = new c(aVar);
        lVar.m12721().m10465().m9462(new b(eVar, lVar, cVar, gVar));
        return cVar;
    }

    @Override // f3.k, f3.j, x2.x
    /* renamed from: ʾ */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        if (str2 == null || !str2.startsWith("file:/")) {
            return null;
        }
        t tVar = new t();
        x2.l.m12710().execute(new a(tVar, str2, lVar, i5, i6, z5, str));
        return tVar;
    }
}
