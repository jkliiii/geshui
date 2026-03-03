package j1;

import i1.h;
import i1.o;
import i1.p;
import i1.s;
import java.io.InputStream;
import java.net.URL;

/* compiled from: UrlLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g implements o<URL, InputStream> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final o<h, InputStream> f8636;

    /* compiled from: UrlLoader.java */
    public static class a implements p<URL, InputStream> {
        @Override // i1.p
        /* renamed from: ʾ */
        public o<URL, InputStream> mo9118(s sVar) {
            return new g(sVar.m9190(h.class, InputStream.class));
        }
    }

    public g(o<h, InputStream> oVar) {
        this.f8636 = oVar;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<InputStream> mo9113(URL url, int i5, int i6, c1.h hVar) {
        return this.f8636.mo9113(new h(url), i5, i6, hVar);
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(URL url) {
        return true;
    }
}
