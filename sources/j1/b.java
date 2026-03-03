package j1;

import android.content.Context;
import android.net.Uri;
import c1.h;
import i1.o;
import i1.p;
import i1.s;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements o<Uri, InputStream> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8615;

    /* compiled from: MediaStoreImageThumbLoader.java */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8616;

        public a(Context context) {
            this.f8616 = context;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, InputStream> mo9118(s sVar) {
            return new b(this.f8616);
        }
    }

    public b(Context context) {
        this.f8615 = context.getApplicationContext();
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<InputStream> mo9113(Uri uri, int i5, int i6, h hVar) {
        if (d1.b.m8179(i5, i6)) {
            return new o.a<>(new x1.b(uri), d1.c.m8182(this.f8615, uri));
        }
        return null;
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return d1.b.m8176(uri);
    }
}
