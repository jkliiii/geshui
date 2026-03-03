package f3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import java.net.URI;
import m2.t;
import x2.b0;

/* compiled from: PackageIconLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends j {

    /* compiled from: PackageIconLoader.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ String f7738;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ x2.l f7739;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ String f7740;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ t f7741;

        a(String str, x2.l lVar, String str2, t tVar) {
            this.f7738 = str;
            this.f7739 = lVar;
            this.f7740 = str2;
            this.f7741 = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String host = URI.create(this.f7738).getHost();
                PackageManager packageManager = this.f7739.m12720().getPackageManager();
                Bitmap bitmap = ((BitmapDrawable) packageManager.getPackageInfo(host, 0).applicationInfo.loadIcon(packageManager)).getBitmap();
                if (bitmap == null) {
                    throw new Exception("package icon failed to load");
                }
                z2.b bVar = new z2.b(this.f7740, null, bitmap, new Point(bitmap.getWidth(), bitmap.getHeight()));
                bVar.f12773 = b0.LOADED_FROM_CACHE;
                this.f7741.m9906(bVar);
            } catch (Exception e5) {
                this.f7741.m9905(e5);
            }
        }
    }

    @Override // f3.j, x2.x
    /* renamed from: ʾ */
    public m2.f<z2.b> mo8592(Context context, x2.l lVar, String str, String str2, int i5, int i6, boolean z5) {
        if (str2 == null || !str2.startsWith("package:")) {
            return null;
        }
        t tVar = new t();
        x2.l.m12710().execute(new a(str2, lVar, str, tVar));
        return tVar;
    }
}
