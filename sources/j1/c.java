package j1;

import android.content.Context;
import android.net.Uri;
import c1.h;
import i1.o;
import i1.p;
import i1.s;
import java.io.InputStream;
import l1.k0;

/* compiled from: MediaStoreVideoThumbLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c implements o<Uri, InputStream> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f8617;

    /* compiled from: MediaStoreVideoThumbLoader.java */
    public static class a implements p<Uri, InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f8618;

        public a(Context context) {
            this.f8618 = context;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, InputStream> mo9118(s sVar) {
            return new c(this.f8618);
        }
    }

    public c(Context context) {
        this.f8617 = context.getApplicationContext();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m9282(h hVar) {
        Long l5 = (Long) hVar.m5831(k0.f8968);
        return l5 != null && l5.longValue() == -1;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<InputStream> mo9113(Uri uri, int i5, int i6, h hVar) {
        if (d1.b.m8179(i5, i6) && m9282(hVar)) {
            return new o.a<>(new x1.b(uri), d1.c.m8183(this.f8617, uri));
        }
        return null;
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return d1.b.m8178(uri);
    }
}
