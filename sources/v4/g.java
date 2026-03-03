package v4;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import s4.c0;
import s4.i;
import s4.o;
import s4.t;
import s4.v;
import v4.f;
import y4.n;

/* compiled from: StreamAllocation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final s4.a f11768;

    /* renamed from: ʼ, reason: contains not printable characters */
    private f.a f11769;

    /* renamed from: ʽ, reason: contains not printable characters */
    private c0 f11770;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final i f11771;

    /* renamed from: ʿ, reason: contains not printable characters */
    public final s4.d f11772;

    /* renamed from: ˆ, reason: contains not printable characters */
    public final o f11773;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Object f11774;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final f f11775;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f11776;

    /* renamed from: ˋ, reason: contains not printable characters */
    private c f11777;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f11778;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f11779;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f11780;

    /* renamed from: י, reason: contains not printable characters */
    private w4.c f11781;

    /* compiled from: StreamAllocation.java */
    public static final class a extends WeakReference<g> {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final Object f11782;

        a(g gVar, Object obj) {
            super(gVar);
            this.f11782 = obj;
        }
    }

    public g(i iVar, s4.a aVar, s4.d dVar, o oVar, Object obj) {
        this.f11771 = iVar;
        this.f11768 = aVar;
        this.f11772 = dVar;
        this.f11773 = oVar;
        this.f11775 = new f(aVar, m12430(), dVar, oVar);
        this.f11774 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* renamed from: ʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.Socket m12425(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            r0 = 0
            if (r4 == 0) goto L5
            r1.f11781 = r0
        L5:
            r4 = 1
            if (r3 == 0) goto La
            r1.f11779 = r4
        La:
            v4.c r3 = r1.f11777
            if (r3 == 0) goto L4a
            if (r2 == 0) goto L12
            r3.f11750 = r4
        L12:
            w4.c r2 = r1.f11781
            if (r2 != 0) goto L4a
            boolean r2 = r1.f11779
            if (r2 != 0) goto L1e
            boolean r2 = r3.f11750
            if (r2 == 0) goto L4a
        L1e:
            r1.m12428(r3)
            v4.c r2 = r1.f11777
            java.util.List<java.lang.ref.Reference<v4.g>> r2 = r2.f11753
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L46
            v4.c r2 = r1.f11777
            long r3 = java.lang.System.nanoTime()
            r2.f11754 = r3
            t4.a r2 = t4.a.f11321
            s4.i r3 = r1.f11771
            v4.c r4 = r1.f11777
            boolean r2 = r2.mo11981(r3, r4)
            if (r2 == 0) goto L46
            v4.c r2 = r1.f11777
            java.net.Socket r2 = r2.m12406()
            goto L47
        L46:
            r2 = r0
        L47:
            r1.f11777 = r0
            r0 = r2
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.g.m12425(boolean, boolean, boolean):java.net.Socket");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private c m12426(int i5, int i6, int i7, int i8, boolean z5) throws IOException {
        c cVar;
        Socket m12429;
        c cVar2;
        Socket socket;
        c0 c0Var;
        boolean z6;
        boolean z7;
        f.a aVar;
        synchronized (this.f11771) {
            if (this.f11779) {
                throw new IllegalStateException("released");
            }
            if (this.f11781 != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f11780) {
                throw new IOException("Canceled");
            }
            cVar = this.f11777;
            m12429 = m12429();
            cVar2 = this.f11777;
            socket = null;
            if (cVar2 != null) {
                cVar = null;
            } else {
                cVar2 = null;
            }
            if (!this.f11778) {
                cVar = null;
            }
            if (cVar2 == null) {
                t4.a.f11321.mo11984(this.f11771, this.f11768, this, null);
                c cVar3 = this.f11777;
                if (cVar3 != null) {
                    cVar2 = cVar3;
                    z6 = true;
                    c0Var = null;
                } else {
                    c0Var = this.f11770;
                }
            } else {
                c0Var = null;
            }
            z6 = false;
        }
        t4.c.m12061(m12429);
        if (cVar != null) {
            this.f11773.m11852(this.f11772, cVar);
        }
        if (z6) {
            this.f11773.m11851(this.f11772, cVar2);
        }
        if (cVar2 != null) {
            this.f11770 = this.f11777.m12405();
            return cVar2;
        }
        if (c0Var != null || ((aVar = this.f11769) != null && aVar.m12423())) {
            z7 = false;
        } else {
            this.f11769 = this.f11775.m12421();
            z7 = true;
        }
        synchronized (this.f11771) {
            if (this.f11780) {
                throw new IOException("Canceled");
            }
            if (z7) {
                List<c0> m12422 = this.f11769.m12422();
                int size = m12422.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    }
                    c0 c0Var2 = m12422.get(i9);
                    t4.a.f11321.mo11984(this.f11771, this.f11768, this, c0Var2);
                    c cVar4 = this.f11777;
                    if (cVar4 != null) {
                        this.f11770 = c0Var2;
                        cVar2 = cVar4;
                        z6 = true;
                        break;
                    }
                    i9++;
                }
            }
            if (!z6) {
                if (c0Var == null) {
                    c0Var = this.f11769.m12424();
                }
                this.f11770 = c0Var;
                this.f11776 = 0;
                cVar2 = new c(this.f11771, c0Var);
                m12431(cVar2, false);
            }
        }
        if (z6) {
            this.f11773.m11851(this.f11772, cVar2);
            return cVar2;
        }
        cVar2.m12399(i5, i6, i7, i8, z5, this.f11772, this.f11773);
        m12430().m12408(cVar2.m12405());
        synchronized (this.f11771) {
            this.f11778 = true;
            t4.a.f11321.mo11985(this.f11771, cVar2);
            if (cVar2.m12403()) {
                socket = t4.a.f11321.mo11982(this.f11771, this.f11768, this);
                cVar2 = this.f11777;
            }
        }
        t4.c.m12061(socket);
        this.f11773.m11851(this.f11772, cVar2);
        return cVar2;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private c m12427(int i5, int i6, int i7, int i8, boolean z5, boolean z6) throws IOException {
        while (true) {
            c m12426 = m12426(i5, i6, i7, i8, z5);
            synchronized (this.f11771) {
                if (m12426.f11751 == 0 && !m12426.m12403()) {
                    return m12426;
                }
                if (m12426.m12402(z6)) {
                    return m12426;
                }
                m12437();
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m12428(c cVar) {
        int size = cVar.f11753.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (cVar.f11753.get(i5).get() == this) {
                cVar.f11753.remove(i5);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* renamed from: י, reason: contains not printable characters */
    private Socket m12429() {
        c cVar = this.f11777;
        if (cVar == null || !cVar.f11750) {
            return null;
        }
        return m12425(false, false, true);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private d m12430() {
        return t4.a.f11321.mo11986(this.f11771);
    }

    public String toString() {
        c m12434 = m12434();
        return m12434 != null ? m12434.toString() : this.f11768.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m12431(c cVar, boolean z5) {
        if (this.f11777 != null) {
            throw new IllegalStateException();
        }
        this.f11777 = cVar;
        this.f11778 = z5;
        cVar.f11753.add(new a(this, this.f11774));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m12432() {
        w4.c cVar;
        c cVar2;
        synchronized (this.f11771) {
            this.f11780 = true;
            cVar = this.f11781;
            cVar2 = this.f11777;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.m12398();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public w4.c m12433() {
        w4.c cVar;
        synchronized (this.f11771) {
            cVar = this.f11781;
        }
        return cVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized c m12434() {
        return this.f11777;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m12435() {
        f.a aVar;
        return this.f11770 != null || ((aVar = this.f11769) != null && aVar.m12423()) || this.f11775.m12420();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public w4.c m12436(v vVar, t.a aVar, boolean z5) {
        try {
            w4.c m12404 = m12427(aVar.mo11941(), aVar.mo11942(), aVar.mo11943(), vVar.m11971(), vVar.m11967(), z5).m12404(vVar, aVar, this);
            synchronized (this.f11771) {
                this.f11781 = m12404;
            }
            return m12404;
        } catch (IOException e5) {
            throw new e(e5);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m12437() {
        c cVar;
        Socket m12425;
        synchronized (this.f11771) {
            cVar = this.f11777;
            m12425 = m12425(true, false, false);
            if (this.f11777 != null) {
                cVar = null;
            }
        }
        t4.c.m12061(m12425);
        if (cVar != null) {
            this.f11773.m11852(this.f11772, cVar);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m12438() {
        c cVar;
        Socket m12425;
        synchronized (this.f11771) {
            cVar = this.f11777;
            m12425 = m12425(false, true, false);
            if (this.f11777 != null) {
                cVar = null;
            }
        }
        t4.c.m12061(m12425);
        if (cVar != null) {
            t4.a.f11321.mo11987(this.f11772, null);
            this.f11773.m11852(this.f11772, cVar);
            this.f11773.m11845(this.f11772);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public Socket m12439(c cVar) {
        if (this.f11781 != null || this.f11777.f11753.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<g> reference = this.f11777.f11753.get(0);
        Socket m12425 = m12425(true, false, false);
        this.f11777 = cVar;
        cVar.f11753.add(reference);
        return m12425;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public c0 m12440() {
        return this.f11770;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m12441(IOException iOException) {
        c cVar;
        boolean z5;
        Socket m12425;
        synchronized (this.f11771) {
            cVar = null;
            if (iOException instanceof n) {
                y4.b bVar = ((n) iOException).f12661;
                if (bVar == y4.b.REFUSED_STREAM) {
                    int i5 = this.f11776 + 1;
                    this.f11776 = i5;
                    if (i5 > 1) {
                        this.f11770 = null;
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    if (bVar != y4.b.CANCEL) {
                        this.f11770 = null;
                        z5 = true;
                    }
                    z5 = false;
                }
            } else {
                c cVar2 = this.f11777;
                if (cVar2 != null && (!cVar2.m12403() || (iOException instanceof y4.a))) {
                    if (this.f11777.f11751 == 0) {
                        c0 c0Var = this.f11770;
                        if (c0Var != null && iOException != null) {
                            this.f11775.m12419(c0Var, iOException);
                        }
                        this.f11770 = null;
                    }
                    z5 = true;
                }
                z5 = false;
            }
            c cVar3 = this.f11777;
            m12425 = m12425(z5, false, true);
            if (this.f11777 == null && this.f11778) {
                cVar = cVar3;
            }
        }
        t4.c.m12061(m12425);
        if (cVar != null) {
            this.f11773.m11852(this.f11772, cVar);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m12442(boolean z5, w4.c cVar, long j5, IOException iOException) {
        c cVar2;
        Socket m12425;
        boolean z6;
        this.f11773.m11859(this.f11772, j5);
        synchronized (this.f11771) {
            if (cVar != null) {
                if (cVar == this.f11781) {
                    if (!z5) {
                        this.f11777.f11751++;
                    }
                    cVar2 = this.f11777;
                    m12425 = m12425(z5, false, true);
                    if (this.f11777 != null) {
                        cVar2 = null;
                    }
                    z6 = this.f11779;
                }
            }
            throw new IllegalStateException("expected " + this.f11781 + " but was " + cVar);
        }
        t4.c.m12061(m12425);
        if (cVar2 != null) {
            this.f11773.m11852(this.f11772, cVar2);
        }
        if (iOException != null) {
            this.f11773.m11846(this.f11772, t4.a.f11321.mo11987(this.f11772, iOException));
        } else if (z6) {
            t4.a.f11321.mo11987(this.f11772, null);
            this.f11773.m11845(this.f11772);
        }
    }
}
