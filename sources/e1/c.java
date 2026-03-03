package e1;

import com.bumptech.glide.load.data.d;
import e1.f;
import i1.o;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c implements f, d.a<Object> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final List<c1.f> f7359;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final g<?> f7360;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final f.a f7361;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f7362;

    /* renamed from: ˉ, reason: contains not printable characters */
    private c1.f f7363;

    /* renamed from: ˊ, reason: contains not printable characters */
    private List<i1.o<File, ?>> f7364;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f7365;

    /* renamed from: ˎ, reason: contains not printable characters */
    private volatile o.a<?> f7366;

    /* renamed from: ˏ, reason: contains not printable characters */
    private File f7367;

    c(g<?> gVar, f.a aVar) {
        this(gVar.m8297(), gVar, aVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m8289() {
        return this.f7365 < this.f7364.size();
    }

    @Override // e1.f
    public void cancel() {
        o.a<?> aVar = this.f7366;
        if (aVar != null) {
            aVar.f8513.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    /* renamed from: ʽ */
    public void mo6145(Exception exc) {
        this.f7361.mo8292(this.f7363, exc, this.f7366.f8513, c1.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.data.d.a
    /* renamed from: ʾ */
    public void mo6146(Object obj) {
        this.f7361.mo8294(this.f7363, obj, this.f7366.f8513, c1.a.DATA_DISK_CACHE, this.f7363);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r1 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (m8289() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        r0 = r7.f7364;
        r3 = r7.f7365;
        r7.f7365 = r3 + 1;
        r7.f7366 = r0.get(r3).mo9113(r7.f7367, r7.f7360.m8314(), r7.f7360.m8300(), r7.f7360.m8305());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (r7.f7366 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r7.f7360.m8315(r7.f7366.f8513.mo6132()) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        r7.f7366.f8513.mo6141(r7.f7360.m8306(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r7.f7366 = null;
     */
    @Override // e1.f
    /* renamed from: ʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo8290() {
        /*
            r7 = this;
            java.lang.String r0 = "DataCacheGenerator.startNext"
            z1.b.m13143(r0)
        L5:
            java.util.List<i1.o<java.io.File, ?>> r0 = r7.f7364     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L6c
            boolean r0 = r7.m8289()     // Catch: java.lang.Throwable -> Lae
            if (r0 != 0) goto L12
            goto L6c
        L12:
            r0 = 0
            r7.f7366 = r0     // Catch: java.lang.Throwable -> Lae
        L15:
            if (r1 != 0) goto L68
            boolean r0 = r7.m8289()     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L68
            java.util.List<i1.o<java.io.File, ?>> r0 = r7.f7364     // Catch: java.lang.Throwable -> Lae
            int r3 = r7.f7365     // Catch: java.lang.Throwable -> Lae
            int r4 = r3 + 1
            r7.f7365 = r4     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> Lae
            i1.o r0 = (i1.o) r0     // Catch: java.lang.Throwable -> Lae
            java.io.File r3 = r7.f7367     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r4 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            int r4 = r4.m8314()     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r5 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            int r5 = r5.m8300()     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r6 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            c1.h r6 = r6.m8305()     // Catch: java.lang.Throwable -> Lae
            i1.o$a r0 = r0.mo9113(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lae
            r7.f7366 = r0     // Catch: java.lang.Throwable -> Lae
            i1.o$a<?> r0 = r7.f7366     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            e1.g<?> r0 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            i1.o$a<?> r3 = r7.f7366     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d<Data> r3 = r3.f8513     // Catch: java.lang.Throwable -> Lae
            java.lang.Class r3 = r3.mo6132()     // Catch: java.lang.Throwable -> Lae
            boolean r0 = r0.m8315(r3)     // Catch: java.lang.Throwable -> Lae
            if (r0 == 0) goto L15
            i1.o$a<?> r0 = r7.f7366     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.load.data.d<Data> r0 = r0.f8513     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r1 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            com.bumptech.glide.g r1 = r1.m8306()     // Catch: java.lang.Throwable -> Lae
            r0.mo6141(r1, r7)     // Catch: java.lang.Throwable -> Lae
            r1 = 1
            goto L15
        L68:
            z1.b.m13147()
            return r1
        L6c:
            int r0 = r7.f7362     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 + r2
            r7.f7362 = r0     // Catch: java.lang.Throwable -> Lae
            java.util.List<c1.f> r2 = r7.f7359     // Catch: java.lang.Throwable -> Lae
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lae
            if (r0 < r2) goto L7d
            z1.b.m13147()
            return r1
        L7d:
            java.util.List<c1.f> r0 = r7.f7359     // Catch: java.lang.Throwable -> Lae
            int r2 = r7.f7362     // Catch: java.lang.Throwable -> Lae
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> Lae
            c1.f r0 = (c1.f) r0     // Catch: java.lang.Throwable -> Lae
            e1.d r2 = new e1.d     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r3 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            c1.f r3 = r3.m8310()     // Catch: java.lang.Throwable -> Lae
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r3 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            g1.a r3 = r3.m8298()     // Catch: java.lang.Throwable -> Lae
            java.io.File r2 = r3.mo8660(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f7367 = r2     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L5
            r7.f7363 = r0     // Catch: java.lang.Throwable -> Lae
            e1.g<?> r0 = r7.f7360     // Catch: java.lang.Throwable -> Lae
            java.util.List r0 = r0.m8304(r2)     // Catch: java.lang.Throwable -> Lae
            r7.f7364 = r0     // Catch: java.lang.Throwable -> Lae
            r7.f7365 = r1     // Catch: java.lang.Throwable -> Lae
            goto L5
        Lae:
            r0 = move-exception
            z1.b.m13147()
            goto Lb4
        Lb3:
            throw r0
        Lb4:
            goto Lb3
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.c.mo8290():boolean");
    }

    c(List<c1.f> list, g<?> gVar, f.a aVar) {
        this.f7362 = -1;
        this.f7359 = list;
        this.f7360 = gVar;
        this.f7361 = aVar;
    }
}
