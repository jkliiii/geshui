package j1;

import com.bumptech.glide.load.data.j;
import i1.h;
import i1.n;
import i1.o;
import i1.p;
import i1.s;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements o<h, InputStream> {

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final c1.g<Integer> f8612 = c1.g.m5826("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final n<h, h> f8613;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: j1.a$a, reason: collision with other inner class name */
    public static class C0122a implements p<h, InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final n<h, h> f8614 = new n<>(500);

        @Override // i1.p
        /* renamed from: ʾ */
        public o<h, InputStream> mo9118(s sVar) {
            return new a(this.f8614);
        }
    }

    public a(n<h, h> nVar) {
        this.f8613 = nVar;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<InputStream> mo9113(h hVar, int i5, int i6, c1.h hVar2) {
        n<h, h> nVar = this.f8613;
        if (nVar != null) {
            h m9171 = nVar.m9171(hVar, 0, 0);
            if (m9171 == null) {
                this.f8613.m9172(hVar, 0, 0, hVar);
            } else {
                hVar = m9171;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) hVar2.m5831(f8612)).intValue()));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(h hVar) {
        return true;
    }
}
