package f3;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
import k2.s;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import x2.b0;
import x2.x;

/* compiled from: AssetLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends k {

    /* compiled from: AssetLoader.java */
    /* renamed from: f3.a$a, reason: collision with other inner class name */
    class RunnableC0106a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7705;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ n2.e f7706;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ f f7707;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m2.g f7708;

        RunnableC0106a(x2.l lVar, n2.e eVar, f fVar, m2.g gVar) {
            this.f7705 = lVar;
            this.f7706 = eVar;
            this.f7707 = fVar;
            this.f7708 = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InputStream mo8593 = a.this.mo8593(this.f7705.m12720(), this.f7706.m10509().toString());
                if (mo8593 == null) {
                    throw new Exception("Unable to load content stream");
                }
                int available = mo8593.available();
                u2.c cVar = new u2.c(this.f7705.m12721().m10465(), mo8593);
                this.f7707.m9906(cVar);
                this.f7708.mo8740(null, new x.a(cVar, available, b0.LOADED_FROM_CACHE, null, null));
            } catch (Exception e5) {
                this.f7707.m9905(e5);
                this.f7708.mo8740(e5, null);
            }
        }
    }

    @Override // f3.j, x2.x
    /* renamed from: ʼ, reason: contains not printable characters */
    public m2.f<s> mo8591(x2.l lVar, n2.e eVar, m2.g<x.a> gVar) {
        if (eVar.m10509().getScheme() == null || !eVar.m10509().toString().startsWith("file:///android_asset/")) {
            return null;
        }
        f fVar = new f();
        lVar.m12721().m10465().m9462(new RunnableC0106a(lVar, eVar, fVar, gVar));
        return fVar;
    }

    @Override // f3.k, f3.j, x2.x
    /* renamed from: ʾ, reason: contains not printable characters */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        if (str2.startsWith("file:///android_asset/")) {
            return super.mo8592(context, lVar, str, str2, i5, i6, z5);
        }
        return null;
    }

    @Override // f3.k
    /* renamed from: ʿ, reason: contains not printable characters */
    protected InputStream mo8593(Context context, String str) throws Exception {
        return context.getAssets().open(Uri.parse(str).getPath().replaceFirst("^/android_asset/", BuildConfig.FLAVOR));
    }
}
