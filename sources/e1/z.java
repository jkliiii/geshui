package e1;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import e1.f;
import i1.o;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class z implements f, f.a {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final g<?> f7571;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final f.a f7572;

    /* renamed from: ˆ, reason: contains not printable characters */
    private volatile int f7573;

    /* renamed from: ˈ, reason: contains not printable characters */
    private volatile c f7574;

    /* renamed from: ˉ, reason: contains not printable characters */
    private volatile Object f7575;

    /* renamed from: ˊ, reason: contains not printable characters */
    private volatile o.a<?> f7576;

    /* renamed from: ˋ, reason: contains not printable characters */
    private volatile d f7577;

    /* compiled from: SourceGenerator.java */
    class a implements d.a<Object> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ o.a f7578;

        a(o.a aVar) {
            this.f7578 = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        /* renamed from: ʽ */
        public void mo6145(Exception exc) {
            if (z.this.m8447(this.f7578)) {
                z.this.m8449(this.f7578, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        /* renamed from: ʾ */
        public void mo6146(Object obj) {
            if (z.this.m8447(this.f7578)) {
                z.this.m8448(this.f7578, obj);
            }
        }
    }

    z(g<?> gVar, f.a aVar) {
        this.f7571 = gVar;
        this.f7572 = aVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m8444(Object obj) throws IOException {
        long m12879 = y1.g.m12879();
        boolean z5 = false;
        try {
            com.bumptech.glide.load.data.e<T> m8309 = this.f7571.m8309(obj);
            Object mo6126 = m8309.mo6126();
            c1.d<X> m8311 = this.f7571.m8311(mo6126);
            e eVar = new e(m8311, mo6126, this.f7571.m8305());
            d dVar = new d(this.f7576.f8511, this.f7571.m8310());
            g1.a m8298 = this.f7571.m8298();
            m8298.mo8661(dVar, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + dVar + ", data: " + obj + ", encoder: " + m8311 + ", duration: " + y1.g.m12878(m12879));
            }
            if (m8298.mo8660(dVar) != null) {
                this.f7577 = dVar;
                this.f7574 = new c(Collections.singletonList(this.f7576.f8511), this.f7571, this);
                this.f7576.f8513.mo6137();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f7577 + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f7572.mo8294(this.f7576.f8511, m8309.mo6126(), this.f7576.f8513, this.f7576.f8513.mo6140(), this.f7576.f8511);
                return false;
            } catch (Throwable th) {
                th = th;
                z5 = true;
                if (!z5) {
                    this.f7576.f8513.mo6137();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m8445() {
        return this.f7573 < this.f7571.m8301().size();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m8446(o.a<?> aVar) {
        this.f7576.f8513.mo6141(this.f7571.m8306(), new a(aVar));
    }

    @Override // e1.f
    public void cancel() {
        o.a<?> aVar = this.f7576;
        if (aVar != null) {
            aVar.f8513.cancel();
        }
    }

    @Override // e1.f.a
    /* renamed from: ʻ */
    public void mo8292(c1.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, c1.a aVar) {
        this.f7572.mo8292(fVar, exc, dVar, this.f7576.f8513.mo6140());
    }

    @Override // e1.f.a
    /* renamed from: ʼ */
    public void mo8293() {
        throw new UnsupportedOperationException();
    }

    @Override // e1.f.a
    /* renamed from: ʽ */
    public void mo8294(c1.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, c1.a aVar, c1.f fVar2) {
        this.f7572.mo8294(fVar, obj, dVar, this.f7576.f8513.mo6140(), fVar);
    }

    @Override // e1.f
    /* renamed from: ʿ */
    public boolean mo8290() {
        if (this.f7575 != null) {
            Object obj = this.f7575;
            this.f7575 = null;
            try {
                if (!m8444(obj)) {
                    return true;
                }
            } catch (IOException e5) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e5);
                }
            }
        }
        if (this.f7574 != null && this.f7574.mo8290()) {
            return true;
        }
        this.f7574 = null;
        this.f7576 = null;
        boolean z5 = false;
        while (!z5 && m8445()) {
            List<o.a<?>> m8301 = this.f7571.m8301();
            int i5 = this.f7573;
            this.f7573 = i5 + 1;
            this.f7576 = m8301.get(i5);
            if (this.f7576 != null && (this.f7571.m8299().mo8368(this.f7576.f8513.mo6140()) || this.f7571.m8315(this.f7576.f8513.mo6132()))) {
                m8446(this.f7576);
                z5 = true;
            }
        }
        return z5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean m8447(o.a<?> aVar) {
        o.a<?> aVar2 = this.f7576;
        return aVar2 != null && aVar2 == aVar;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m8448(o.a<?> aVar, Object obj) {
        j m8299 = this.f7571.m8299();
        if (obj != null && m8299.mo8368(aVar.f8513.mo6140())) {
            this.f7575 = obj;
            this.f7572.mo8293();
        } else {
            f.a aVar2 = this.f7572;
            c1.f fVar = aVar.f8511;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f8513;
            aVar2.mo8294(fVar, obj, dVar, dVar.mo6140(), this.f7577);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m8449(o.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f7572;
        d dVar = this.f7577;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f8513;
        aVar2.mo8292(dVar, exc, dVar2, dVar2.mo6140());
    }
}
