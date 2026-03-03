package i1;

import android.net.Uri;
import i1.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UrlUriLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class z<Data> implements o<Uri, Data> {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final Set<String> f8555 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: ʻ, reason: contains not printable characters */
    private final o<h, Data> f8556;

    /* compiled from: UrlUriLoader.java */
    public static class a implements p<Uri, InputStream> {
        @Override // i1.p
        /* renamed from: ʾ */
        public o<Uri, InputStream> mo9118(s sVar) {
            return new z(sVar.m9190(h.class, InputStream.class));
        }
    }

    public z(o<h, Data> oVar) {
        this.f8556 = oVar;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(Uri uri, int i5, int i6, c1.h hVar) {
        return this.f8556.mo9113(new h(uri.toString()), i5, i6, hVar);
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(Uri uri) {
        return f8555.contains(uri.getScheme());
    }
}
