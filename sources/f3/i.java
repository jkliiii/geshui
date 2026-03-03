package f3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.text.TextUtils;
import java.io.InputStream;
import k2.s;
import m2.t;
import x2.b0;
import x2.x;

/* compiled from: ResourceLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends k {

    /* compiled from: ResourceLoader.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Context f7743;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ String f7744;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7745;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f7746;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ int f7747;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ boolean f7748;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ String f7749;

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ t f7750;

        a(Context context, String str, x2.l lVar, int i5, int i6, boolean z5, String str2, t tVar) {
            this.f7743 = context;
            this.f7744 = str;
            this.f7745 = lVar;
            this.f7746 = i5;
            this.f7747 = i6;
            this.f7748 = z5;
            this.f7749 = str2;
            this.f7750 = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            z2.b bVar;
            try {
                c m8601 = i.m8601(this.f7743, this.f7744);
                BitmapFactory.Options m13165 = this.f7745.m12719().m13165(m8601.f7757, m8601.f7758, this.f7746, this.f7747);
                Point point = new Point(m13165.outWidth, m13165.outHeight);
                if (this.f7748 && TextUtils.equals("image/gif", m13165.outMimeType)) {
                    InputStream openRawResource = m8601.f7757.openRawResource(m8601.f7758);
                    try {
                        bVar = i.this.m8604(this.f7749, point, openRawResource, m13165);
                        v2.h.m12364(openRawResource);
                    } catch (Throwable th) {
                        v2.h.m12364(openRawResource);
                        throw th;
                    }
                } else {
                    Bitmap m13158 = z2.d.m13158(m8601.f7757, m8601.f7758, m13165);
                    if (m13158 == null) {
                        throw new Exception("Bitmap failed to load");
                    }
                    bVar = new z2.b(this.f7749, m13165.outMimeType, m13158, point);
                }
                bVar.f12773 = b0.LOADED_FROM_CACHE;
                this.f7750.m9906(bVar);
            } catch (Exception e5) {
                this.f7750.m9905(e5);
            } catch (OutOfMemoryError e6) {
                this.f7750.m9904(new Exception(e6), null);
            }
        }
    }

    /* compiled from: ResourceLoader.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7752;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ n2.e f7753;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ f f7754;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m2.g f7755;

        b(x2.l lVar, n2.e eVar, f fVar, m2.g gVar) {
            this.f7752 = lVar;
            this.f7753 = eVar;
            this.f7754 = fVar;
            this.f7755 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c m8601 = i.m8601(this.f7752.m12720(), this.f7753.m10509().toString());
                InputStream openRawResource = m8601.f7757.openRawResource(m8601.f7758);
                if (openRawResource == null) {
                    throw new Exception("Unable to load content stream");
                }
                int available = openRawResource.available();
                u2.c cVar = new u2.c(this.f7752.m12721().m10465(), openRawResource);
                this.f7754.m9906(cVar);
                this.f7755.mo8740(null, new x.a(cVar, available, b0.LOADED_FROM_CACHE, null, null));
            } catch (Exception e5) {
                this.f7754.m9905(e5);
                this.f7755.mo8740(e5, null);
            }
        }
    }

    /* compiled from: ResourceLoader.java */
    private static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        Resources f7757;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f7758;

        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static c m8601(Context context, String str) throws Exception {
        int identifier;
        Uri parse = Uri.parse(str);
        if (parse.getPathSegments() == null) {
            throw new IllegalArgumentException("uri is not a valid resource uri");
        }
        String authority = parse.getAuthority();
        Resources resources = context.createPackageContext(authority, 0).getResources();
        if (parse.getPathSegments().size() == 1) {
            identifier = Integer.valueOf(parse.getPathSegments().get(0)).intValue();
        } else {
            if (parse.getPathSegments().size() != 2) {
                throw new IllegalArgumentException("uri is not a valid resource uri");
            }
            identifier = resources.getIdentifier(parse.getPathSegments().get(1), parse.getPathSegments().get(0), authority);
            if (identifier == 0) {
                throw new IllegalArgumentException("resource not found in given package");
            }
        }
        c cVar = new c(null);
        cVar.f7757 = resources;
        cVar.f7758 = identifier;
        return cVar;
    }

    @Override // f3.j, x2.x
    /* renamed from: ʼ */
    public m2.f<s> mo8591(x2.l lVar, n2.e eVar, m2.g<x.a> gVar) {
        if (eVar.m10509().getScheme() == null || !eVar.m10509().getScheme().equals("android.resource")) {
            return null;
        }
        f fVar = new f();
        lVar.m12721().m10465().m9462(new b(lVar, eVar, fVar, gVar));
        return fVar;
    }

    @Override // f3.k, f3.j, x2.x
    /* renamed from: ʾ */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        if (str2 == null || !str2.startsWith("android.resource:/")) {
            return null;
        }
        t tVar = new t();
        x2.l.m12710().execute(new a(context, str2, lVar, i5, i6, z5, str, tVar));
        return tVar;
    }
}
