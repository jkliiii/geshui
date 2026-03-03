package f3;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import k2.s;
import x2.b0;
import x2.x;

/* compiled from: ContentLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends k {

    /* compiled from: ContentLoader.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7710;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ n2.e f7711;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ f f7712;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m2.g f7713;

        a(x2.l lVar, n2.e eVar, f fVar, m2.g gVar) {
            this.f7710 = lVar;
            this.f7711 = eVar;
            this.f7712 = fVar;
            this.f7713 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InputStream openInputStream = this.f7710.m12720().getContentResolver().openInputStream(Uri.parse(this.f7711.m10509().toString()));
                if (openInputStream == null) {
                    throw new Exception("Unable to load content stream");
                }
                int available = openInputStream.available();
                u2.c cVar = new u2.c(this.f7710.m12721().m10465(), openInputStream);
                this.f7712.m9906(cVar);
                this.f7713.mo8740(null, new x.a(cVar, available, b0.LOADED_FROM_CACHE, null, null));
            } catch (Exception e5) {
                this.f7712.m9905(e5);
                this.f7713.mo8740(e5, null);
            }
        }
    }

    @Override // f3.j, x2.x
    /* renamed from: ʼ */
    public m2.f<s> mo8591(x2.l lVar, n2.e eVar, m2.g<x.a> gVar) {
        if (eVar.m10509().getScheme() == null || !eVar.m10509().getScheme().startsWith("content")) {
            return null;
        }
        f fVar = new f();
        lVar.m12721().m10465().m9462(new a(lVar, eVar, fVar, gVar));
        return fVar;
    }

    @Override // f3.k, f3.j, x2.x
    /* renamed from: ʾ */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        if (str2.startsWith("content:/")) {
            return super.mo8592(context, lVar, str, str2, i5, i6, z5);
        }
        return null;
    }

    @Override // f3.k
    /* renamed from: ʿ */
    protected InputStream mo8593(Context context, String str) throws Exception {
        return context.getContentResolver().openInputStream(Uri.parse(str));
    }
}
