package u2;

import java.io.InputStream;
import java.nio.ByteBuffer;
import k2.f0;
import k2.k;
import k2.q;
import k2.s;

/* compiled from: InputStreamDataEmitter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c implements s {

    /* renamed from: ʻ, reason: contains not printable characters */
    k f11523;

    /* renamed from: ʼ, reason: contains not printable characters */
    InputStream f11524;

    /* renamed from: ʽ, reason: contains not printable characters */
    l2.d f11525;

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f11526;

    /* renamed from: ʿ, reason: contains not printable characters */
    int f11527 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    q f11528 = new q();

    /* renamed from: ˈ, reason: contains not printable characters */
    Runnable f11529 = new b();

    /* renamed from: ˉ, reason: contains not printable characters */
    l2.a f11530;

    /* compiled from: InputStreamDataEmitter.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Exception f11531;

        a(Exception exc) {
            this.f11531 = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            Exception e5 = this.f11531;
            try {
                c.this.f11524.close();
            } catch (Exception e6) {
                e5 = e6;
            }
            l2.a aVar = c.this.f11530;
            if (aVar != null) {
                aVar.mo9412(e5);
            }
        }
    }

    /* compiled from: InputStreamDataEmitter.java */
    class b implements Runnable {

        /* compiled from: InputStreamDataEmitter.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                f0.m9422(cVar, cVar.f11528);
            }
        }

        /* compiled from: InputStreamDataEmitter.java */
        /* renamed from: u2.c$b$b, reason: collision with other inner class name */
        class RunnableC0163b implements Runnable {
            RunnableC0163b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                f0.m9422(cVar, cVar.f11528);
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!c.this.f11528.m9501()) {
                    c.this.mo9358().m9459(new a());
                    if (!c.this.f11528.m9501()) {
                        return;
                    }
                }
                do {
                    ByteBuffer m9480 = q.m9480(Math.min(Math.max(c.this.f11527, 4096), 262144));
                    int read = c.this.f11524.read(m9480.array());
                    if (-1 == read) {
                        c.this.m12208(null);
                        return;
                    }
                    c.this.f11527 = read * 2;
                    m9480.limit(read);
                    c.this.f11528.m9483(m9480);
                    c.this.mo9358().m9459(new RunnableC0163b());
                    if (c.this.f11528.m9500() != 0) {
                        return;
                    }
                } while (!c.this.mo9370());
            } catch (Exception e5) {
                c.this.m12208(e5);
            }
        }
    }

    public c(k kVar, InputStream inputStream) {
        this.f11523 = kVar;
        this.f11524 = inputStream;
        m12207();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m12207() {
        new Thread(this.f11529).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public void m12208(Exception exc) {
        mo9358().m9462(new a(exc));
    }

    @Override // k2.s
    public void close() {
        m12208(null);
        try {
            this.f11524.close();
        } catch (Exception unused) {
        }
    }

    @Override // k2.s, k2.u
    /* renamed from: ʻ */
    public k mo9358() {
        return this.f11523;
    }

    @Override // k2.s
    /* renamed from: ʽ */
    public void mo9359() {
        this.f11526 = true;
    }

    @Override // k2.s
    /* renamed from: ˎ */
    public void mo9362(l2.d dVar) {
        this.f11525 = dVar;
    }

    @Override // k2.s
    /* renamed from: ـ */
    public void mo9365() {
        this.f11526 = false;
        m12207();
    }

    @Override // k2.s
    /* renamed from: ᐧ */
    public void mo9366(l2.a aVar) {
        this.f11530 = aVar;
    }

    @Override // k2.s
    /* renamed from: ᵔ */
    public boolean mo9370() {
        return this.f11526;
    }

    @Override // k2.s
    /* renamed from: ⁱ */
    public String mo9372() {
        return null;
    }

    @Override // k2.s
    /* renamed from: ﾞ */
    public l2.d mo9375() {
        return this.f11525;
    }
}
