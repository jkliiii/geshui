package x2;

import f3.g;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import x2.r;

/* compiled from: BitmapFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c implements r.i {

    /* renamed from: ʻ, reason: contains not printable characters */
    String f12142;

    /* renamed from: ʼ, reason: contains not printable characters */
    String f12143;

    /* renamed from: ʽ, reason: contains not printable characters */
    z2.b f12144;

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f12145;

    /* renamed from: ʿ, reason: contains not printable characters */
    ArrayList<z2.j> f12146;

    /* renamed from: ˆ, reason: contains not printable characters */
    r f12147;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f12148;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f12149;

    /* renamed from: ˊ, reason: contains not printable characters */
    boolean f12150;

    /* renamed from: ˋ, reason: contains not printable characters */
    boolean f12151;

    /* renamed from: ˎ, reason: contains not printable characters */
    ArrayList<z2.g> f12152;

    /* compiled from: BitmapFetcher.java */
    class a implements m2.g<z2.b> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ x2.a f12153;

        a(x2.a aVar) {
            this.f12153 = aVar;
        }

        @Override // m2.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8740(Exception exc, z2.b bVar) {
            this.f12153.m12678(exc, bVar);
        }
    }

    /* compiled from: BitmapFetcher.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ l f12155;

        /* compiled from: BitmapFetcher.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b bVar = b.this;
                bVar.f12155.f12208.m12352(c.this.f12142);
            }
        }

        b(l lVar) {
            this.f12155 = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            k2.k.m9449(l.f12189, new a());
        }
    }

    c() {
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m12683(l lVar) {
        if (this.f12145 && lVar.f12208.m12354(this.f12143) == null) {
            v2.f<m2.g<z2.b>> fVar = lVar.f12208;
            String str = this.f12142;
            fVar.m12349(str, new d0(lVar, this.f12143, str, this.f12146, this.f12152));
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m12684(String str) {
        l lVar = this.f12147.f12285;
        if (this.f12151) {
            if (str == null || !str.startsWith("file:/")) {
                return false;
            }
            File file = new File(URI.create(str));
            if (!file.exists()) {
                return false;
            }
            g.a m8598 = f3.g.m8598(file.getAbsolutePath());
            if (m8598 == null || !f3.g.m8599(m8598.f7736)) {
                new w(lVar, this.f12142, this.f12150, null).mo8740(null, new a0<>(null, b0.LOADED_FROM_CACHE, null, null, file));
                return true;
            }
        }
        boolean z5 = !this.f12145;
        Iterator<x> it = lVar.m12718().m12728().iterator();
        while (it.hasNext()) {
            m2.f<z2.b> mo8592 = it.next().mo8592(this.f12147.f12286.getContext(), lVar, this.f12142, str, this.f12148, this.f12149, this.f12150);
            if (mo8592 != null) {
                mo8592.mo9865(new a(new t(lVar, this.f12142, z5)));
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static boolean m12685(l lVar) {
        if (lVar.f12208.m12351().size() <= 5) {
            return false;
        }
        Iterator<String> it = lVar.f12208.m12351().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            if ((lVar.f12208.m12354(it.next()) instanceof t) && (i5 = i5 + 1) > 5) {
                return true;
            }
        }
        return false;
    }

    @Override // x2.r.i
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo12686(n2.e eVar) {
        return !m12684(eVar.m10509().toString());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public g m12687() {
        g gVar = new g(this.f12147.f12285, this.f12142, this);
        m12683(this.f12147.f12285);
        return gVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m12688() {
        l lVar = this.f12147.f12285;
        v2.d m11108 = lVar.f12194.m11108();
        if (!this.f12147.f12292 && m11108.m12331(this.f12143) && !this.f12151) {
            x2.a.m12674(lVar, this.f12143, this.f12152);
            return;
        }
        if (lVar.f12208.m12354(this.f12142) == null && !m12684(this.f12147.f12289)) {
            this.f12147.m12790(null);
            r rVar = this.f12147;
            rVar.f12297 = this;
            if (this.f12151) {
                this.f12147.mo182(m11108.m12337()).mo8255().mo9865(new w(lVar, this.f12142, this.f12150, m11108));
            } else {
                rVar.m12800(new t2.b(), new b(lVar)).mo8255().mo9865(new s(lVar, this.f12142, !this.f12145, this.f12148, this.f12149, this.f12150));
            }
        }
        m12683(lVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m12689() {
        String m12731 = m.m12731(this.f12147, this.f12148, this.f12149, this.f12150, this.f12151);
        this.f12142 = m12731;
        this.f12143 = m.m12729(m12731, this.f12146);
    }
}
