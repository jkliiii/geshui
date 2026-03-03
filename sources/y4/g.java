package y4;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y4.h;

/* compiled from: Http2Connection.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g implements Closeable {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static final ExecutorService f12541 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), t4.c.m12058("OkHttp Http2Connection", true));

    /* renamed from: ʾ, reason: contains not printable characters */
    final boolean f12542;

    /* renamed from: ʿ, reason: contains not printable characters */
    final j f12543;

    /* renamed from: ˈ, reason: contains not printable characters */
    final String f12545;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f12546;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f12547;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f12548;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final ScheduledExecutorService f12549;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final ExecutorService f12550;

    /* renamed from: ˑ, reason: contains not printable characters */
    final y4.l f12551;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    final l f12556;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    final Set<Integer> f12558;

    /* renamed from: ⁱ, reason: contains not printable characters */
    long f12562;

    /* renamed from: ﹶ, reason: contains not printable characters */
    final m f12564;

    /* renamed from: ﾞ, reason: contains not printable characters */
    final Socket f12565;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    final y4.j f12566;

    /* renamed from: ˆ, reason: contains not printable characters */
    final Map<Integer, y4.i> f12544 = new LinkedHashMap();

    /* renamed from: י, reason: contains not printable characters */
    private long f12552 = 0;

    /* renamed from: ـ, reason: contains not printable characters */
    private long f12553 = 0;

    /* renamed from: ٴ, reason: contains not printable characters */
    private long f12554 = 0;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private long f12555 = 0;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private long f12557 = 0;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private long f12559 = 0;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private long f12560 = 0;

    /* renamed from: ᵢ, reason: contains not printable characters */
    long f12561 = 0;

    /* renamed from: ﹳ, reason: contains not printable characters */
    m f12563 = new m();

    /* compiled from: Http2Connection.java */
    class a extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f12567;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ y4.b f12568;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i5, y4.b bVar) {
            super(str, objArr);
            this.f12567 = i5;
            this.f12568 = bVar;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            try {
                g.this.m12990(this.f12567, this.f12568);
            } catch (IOException unused) {
                g.this.m12978();
            }
        }
    }

    /* compiled from: Http2Connection.java */
    class b extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f12570;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ long f12571;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i5, long j5) {
            super(str, objArr);
            this.f12570 = i5;
            this.f12571 = j5;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            try {
                g.this.f12566.m13074(this.f12570, this.f12571);
            } catch (IOException unused) {
                g.this.m12978();
            }
        }
    }

    /* compiled from: Http2Connection.java */
    class c extends t4.b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            g.this.m12989(false, 2, 0);
        }
    }

    /* compiled from: Http2Connection.java */
    class d extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f12574;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ List f12575;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i5, List list) {
            super(str, objArr);
            this.f12574 = i5;
            this.f12575 = list;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            if (g.this.f12551.mo13087(this.f12574, this.f12575)) {
                try {
                    g.this.f12566.m13068(this.f12574, y4.b.CANCEL);
                    synchronized (g.this) {
                        g.this.f12558.remove(Integer.valueOf(this.f12574));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: Http2Connection.java */
    class e extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f12577;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ List f12578;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ boolean f12579;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i5, List list, boolean z5) {
            super(str, objArr);
            this.f12577 = i5;
            this.f12578 = list;
            this.f12579 = z5;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            boolean mo13088 = g.this.f12551.mo13088(this.f12577, this.f12578, this.f12579);
            if (mo13088) {
                try {
                    g.this.f12566.m13068(this.f12577, y4.b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (mo13088 || this.f12579) {
                synchronized (g.this) {
                    g.this.f12558.remove(Integer.valueOf(this.f12577));
                }
            }
        }
    }

    /* compiled from: Http2Connection.java */
    class f extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f12581;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ c5.c f12582;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f12583;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ boolean f12584;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i5, c5.c cVar, int i6, boolean z5) {
            super(str, objArr);
            this.f12581 = i5;
            this.f12582 = cVar;
            this.f12583 = i6;
            this.f12584 = z5;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            try {
                boolean mo13089 = g.this.f12551.mo13089(this.f12581, this.f12582, this.f12583, this.f12584);
                if (mo13089) {
                    g.this.f12566.m13068(this.f12581, y4.b.CANCEL);
                }
                if (mo13089 || this.f12584) {
                    synchronized (g.this) {
                        g.this.f12558.remove(Integer.valueOf(this.f12581));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* compiled from: Http2Connection.java */
    /* renamed from: y4.g$g, reason: collision with other inner class name */
    class C0181g extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f12586;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ y4.b f12587;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0181g(String str, Object[] objArr, int i5, y4.b bVar) {
            super(str, objArr);
            this.f12586 = i5;
            this.f12587 = bVar;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            g.this.f12551.mo13090(this.f12586, this.f12587);
            synchronized (g.this) {
                g.this.f12558.remove(Integer.valueOf(this.f12586));
            }
        }
    }

    /* compiled from: Http2Connection.java */
    public static class h {

        /* renamed from: ʻ, reason: contains not printable characters */
        Socket f12589;

        /* renamed from: ʼ, reason: contains not printable characters */
        String f12590;

        /* renamed from: ʽ, reason: contains not printable characters */
        c5.e f12591;

        /* renamed from: ʾ, reason: contains not printable characters */
        c5.d f12592;

        /* renamed from: ʿ, reason: contains not printable characters */
        j f12593 = j.f12598;

        /* renamed from: ˆ, reason: contains not printable characters */
        y4.l f12594 = y4.l.f12658;

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f12595;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f12596;

        public h(boolean z5) {
            this.f12595 = z5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public g m13009() {
            return new g(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public h m13010(j jVar) {
            this.f12593 = jVar;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public h m13011(int i5) {
            this.f12596 = i5;
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public h m13012(Socket socket, String str, c5.e eVar, c5.d dVar) {
            this.f12589 = socket;
            this.f12590 = str;
            this.f12591 = eVar;
            this.f12592 = dVar;
            return this;
        }
    }

    /* compiled from: Http2Connection.java */
    final class i extends t4.b {
        i() {
            super("OkHttp %s ping", g.this.f12545);
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            boolean z5;
            synchronized (g.this) {
                if (g.this.f12553 < g.this.f12552) {
                    z5 = true;
                } else {
                    g.m12986(g.this);
                    z5 = false;
                }
            }
            if (z5) {
                g.this.m12978();
            } else {
                g.this.m12989(false, 1, 0);
            }
        }
    }

    /* compiled from: Http2Connection.java */
    final class k extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final boolean f12599;

        /* renamed from: ˆ, reason: contains not printable characters */
        final int f12600;

        /* renamed from: ˈ, reason: contains not printable characters */
        final int f12601;

        k(boolean z5, int i5, int i6) {
            super("OkHttp %s ping %08x%08x", g.this.f12545, Integer.valueOf(i5), Integer.valueOf(i6));
            this.f12599 = z5;
            this.f12600 = i5;
            this.f12601 = i6;
        }

        @Override // t4.b
        /* renamed from: ˎ */
        public void mo12000() {
            g.this.m12989(this.f12599, this.f12600, this.f12601);
        }
    }

    g(h hVar) {
        m mVar = new m();
        this.f12564 = mVar;
        this.f12558 = new LinkedHashSet();
        this.f12551 = hVar.f12594;
        boolean z5 = hVar.f12595;
        this.f12542 = z5;
        this.f12543 = hVar.f12593;
        int i5 = z5 ? 1 : 2;
        this.f12547 = i5;
        if (z5) {
            this.f12547 = i5 + 2;
        }
        if (z5) {
            this.f12563.m13099(7, 16777216);
        }
        String str = hVar.f12590;
        this.f12545 = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, t4.c.m12058(t4.c.m12072("OkHttp %s Writer", str), false));
        this.f12549 = scheduledThreadPoolExecutor;
        if (hVar.f12596 != 0) {
            i iVar = new i();
            int i6 = hVar.f12596;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, i6, i6, TimeUnit.MILLISECONDS);
        }
        this.f12550 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), t4.c.m12058(t4.c.m12072("OkHttp %s Push Observer", str), true));
        mVar.m13099(7, 65535);
        mVar.m13099(5, 16384);
        this.f12562 = mVar.m13094();
        this.f12565 = hVar.f12589;
        this.f12566 = new y4.j(hVar.f12592, z5);
        this.f12556 = new l(new y4.h(hVar.f12591, z5));
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    static /* synthetic */ long m12975(g gVar) {
        long j5 = gVar.f12559;
        gVar.f12559 = 1 + j5;
        return j5;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    static /* synthetic */ long m12977(g gVar) {
        long j5 = gVar.f12555;
        gVar.f12555 = 1 + j5;
        return j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m12978() {
        try {
            y4.b bVar = y4.b.PROTOCOL_ERROR;
            m12993(bVar, bVar);
        } catch (IOException unused) {
        }
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private y4.i m12979(int i5, List<y4.c> list, boolean z5) throws IOException {
        int i6;
        y4.i iVar;
        boolean z6;
        boolean z7 = !z5;
        synchronized (this.f12566) {
            synchronized (this) {
                if (this.f12547 > 1073741823) {
                    m13006(y4.b.REFUSED_STREAM);
                }
                if (this.f12548) {
                    throw new y4.a();
                }
                i6 = this.f12547;
                this.f12547 = i6 + 2;
                iVar = new y4.i(i6, this, z7, false, null);
                z6 = !z5 || this.f12562 == 0 || iVar.f12623 == 0;
                if (iVar.m13052()) {
                    this.f12544.put(Integer.valueOf(i6), iVar);
                }
            }
            if (i5 == 0) {
                this.f12566.m13071(z7, i6, i5, list);
            } else {
                if (this.f12542) {
                    throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                }
                this.f12566.m13070(i5, i6, list);
            }
        }
        if (z6) {
            this.f12566.flush();
        }
        return iVar;
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private synchronized void m12981(t4.b bVar) {
        if (!this.f12548) {
            this.f12550.execute(bVar);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static /* synthetic */ long m12984(g gVar) {
        long j5 = gVar.f12553;
        gVar.f12553 = 1 + j5;
        return j5;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    static /* synthetic */ long m12986(g gVar) {
        long j5 = gVar.f12552;
        gVar.f12552 = 1 + j5;
        return j5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m12993(y4.b.NO_ERROR, y4.b.CANCEL);
    }

    public void flush() throws IOException {
        this.f12566.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f12566.m13076());
        r6 = r3;
        r8.f12562 -= r6;
     */
    /* renamed from: ʻʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12988(int r9, boolean r10, c5.c r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            y4.j r12 = r8.f12566
            r12.m13077(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L67
            monitor-enter(r8)
        L12:
            long r3 = r8.f12562     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, y4.i> r3 = r8.f12544     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            y4.j r3 = r8.f12566     // Catch: java.lang.Throwable -> L56
            int r3 = r3.m13076()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f12562     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f12562 = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            y4.j r4 = r8.f12566
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.m13077(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L65
        L58:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L56
            r9.interrupt()     // Catch: java.lang.Throwable -> L56
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L65:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.g.m12988(int, boolean, c5.c, long):void");
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m12989(boolean z5, int i5, int i6) {
        try {
            this.f12566.m13067(z5, i5, i6);
        } catch (IOException unused) {
            m12978();
        }
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    void m12990(int i5, y4.b bVar) throws IOException {
        this.f12566.m13068(i5, bVar);
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    void m12991(int i5, y4.b bVar) {
        try {
            this.f12549.execute(new a("OkHttp %s stream %d", new Object[]{this.f12545, Integer.valueOf(i5)}, i5, bVar));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    void m12992(int i5, long j5) {
        try {
            this.f12549.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f12545, Integer.valueOf(i5)}, i5, j5));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    void m12993(y4.b bVar, y4.b bVar2) throws IOException {
        y4.i[] iVarArr = null;
        try {
            m13006(bVar);
            e = null;
        } catch (IOException e5) {
            e = e5;
        }
        synchronized (this) {
            if (!this.f12544.isEmpty()) {
                iVarArr = (y4.i[]) this.f12544.values().toArray(new y4.i[this.f12544.size()]);
                this.f12544.clear();
            }
        }
        if (iVarArr != null) {
            for (y4.i iVar : iVarArr) {
                try {
                    iVar.m13046(bVar2);
                } catch (IOException e6) {
                    if (e != null) {
                        e = e6;
                    }
                }
            }
        }
        try {
            this.f12566.close();
        } catch (IOException e7) {
            if (e == null) {
                e = e7;
            }
        }
        try {
            this.f12565.close();
        } catch (IOException e8) {
            e = e8;
        }
        this.f12549.shutdown();
        this.f12550.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public synchronized boolean m12994(long j5) {
        if (this.f12548) {
            return false;
        }
        if (this.f12555 < this.f12554) {
            if (j5 >= this.f12560) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public synchronized int m12995() {
        return this.f12564.m13095(Integer.MAX_VALUE);
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m12996(int i5, c5.e eVar, int i6, boolean z5) throws IOException {
        c5.c cVar = new c5.c();
        long j5 = i6;
        eVar.mo5899(j5);
        eVar.mo5869(cVar, j5);
        if (cVar.size() == j5) {
            m12981(new f("OkHttp %s Push Data[%s]", new Object[]{this.f12545, Integer.valueOf(i5)}, i5, cVar, i6, z5));
            return;
        }
        throw new IOException(cVar.size() + " != " + i6);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public y4.i m12997(List<y4.c> list, boolean z5) throws IOException {
        return m12979(0, list, z5);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    void m12998(int i5, List<y4.c> list, boolean z5) {
        try {
            m12981(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f12545, Integer.valueOf(i5)}, i5, list, z5));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m12999(int i5, List<y4.c> list) {
        synchronized (this) {
            if (this.f12558.contains(Integer.valueOf(i5))) {
                m12991(i5, y4.b.PROTOCOL_ERROR);
                return;
            }
            this.f12558.add(Integer.valueOf(i5));
            try {
                m12981(new d("OkHttp %s Push Request[%s]", new Object[]{this.f12545, Integer.valueOf(i5)}, i5, list));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    boolean m13000(int i5) {
        return i5 != 0 && (i5 & 1) == 0;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    synchronized y4.i m13001(int i5) {
        return this.f12544.get(Integer.valueOf(i5));
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    void m13002(boolean z5) throws IOException {
        if (z5) {
            this.f12566.m13073();
            this.f12566.m13072(this.f12563);
            if (this.f12563.m13094() != 65535) {
                this.f12566.m13074(0, r5 - 65535);
            }
        }
        new Thread(this.f12556).start();
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    synchronized y4.i m13003(int i5) {
        y4.i remove;
        remove = this.f12544.remove(Integer.valueOf(i5));
        notifyAll();
        return remove;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    void m13004(int i5, y4.b bVar) {
        m12981(new C0181g("OkHttp %s Push Reset[%s]", new Object[]{this.f12545, Integer.valueOf(i5)}, i5, bVar));
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    void m13005() {
        synchronized (this) {
            long j5 = this.f12555;
            long j6 = this.f12554;
            if (j5 < j6) {
                return;
            }
            this.f12554 = j6 + 1;
            this.f12560 = System.nanoTime() + 1000000000;
            try {
                this.f12549.execute(new c("OkHttp %s ping", this.f12545));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public void m13006(y4.b bVar) throws IOException {
        synchronized (this.f12566) {
            synchronized (this) {
                if (this.f12548) {
                    return;
                }
                this.f12548 = true;
                this.f12566.m13080(this.f12546, bVar, t4.c.f11323);
            }
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public void m13007() throws IOException {
        m13002(true);
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    synchronized void m13008(long j5) {
        long j6 = this.f12561 + j5;
        this.f12561 = j6;
        if (j6 >= this.f12563.m13094() / 2) {
            m12992(0, this.f12561);
            this.f12561 = 0L;
        }
    }

    /* compiled from: Http2Connection.java */
    public static abstract class j {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final j f12598 = new a();

        /* compiled from: Http2Connection.java */
        class a extends j {
            a() {
            }

            @Override // y4.g.j
            /* renamed from: ʼ */
            public void mo12397(y4.i iVar) throws IOException {
                iVar.m13046(y4.b.REFUSED_STREAM);
            }
        }

        /* renamed from: ʼ */
        public abstract void mo12397(y4.i iVar) throws IOException;

        /* renamed from: ʻ */
        public void mo12396(g gVar) {
        }
    }

    /* compiled from: Http2Connection.java */
    class l extends t4.b implements h.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        final y4.h f12603;

        /* compiled from: Http2Connection.java */
        class a extends t4.b {

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ y4.i f12605;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, y4.i iVar) {
                super(str, objArr);
                this.f12605 = iVar;
            }

            @Override // t4.b
            /* renamed from: ˎ */
            public void mo12000() {
                try {
                    g.this.f12543.mo12397(this.f12605);
                } catch (IOException e5) {
                    z4.k.m13239().mo13216(4, "Http2Connection.Listener failure for " + g.this.f12545, e5);
                    try {
                        this.f12605.m13046(y4.b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* compiled from: Http2Connection.java */
        class b extends t4.b {

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ boolean f12607;

            /* renamed from: ˆ, reason: contains not printable characters */
            final /* synthetic */ m f12608;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z5, m mVar) {
                super(str, objArr);
                this.f12607 = z5;
                this.f12608 = mVar;
            }

            @Override // t4.b
            /* renamed from: ˎ */
            public void mo12000() {
                l.this.m13023(this.f12607, this.f12608);
            }
        }

        /* compiled from: Http2Connection.java */
        class c extends t4.b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // t4.b
            /* renamed from: ˎ */
            public void mo12000() {
                g gVar = g.this;
                gVar.f12543.mo12396(gVar);
            }
        }

        l(y4.h hVar) {
            super("OkHttp %s", g.this.f12545);
            this.f12603 = hVar;
        }

        @Override // y4.h.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo13013(int i5, y4.b bVar, c5.f fVar) {
            y4.i[] iVarArr;
            fVar.mo5930();
            synchronized (g.this) {
                iVarArr = (y4.i[]) g.this.f12544.values().toArray(new y4.i[g.this.f12544.size()]);
                g.this.f12548 = true;
            }
            for (y4.i iVar : iVarArr) {
                if (iVar.m13048() > i5 && iVar.m13051()) {
                    iVar.m13057(y4.b.REFUSED_STREAM);
                    g.this.m13003(iVar.m13048());
                }
            }
        }

        @Override // y4.h.b
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo13015(boolean z5, m mVar) {
            try {
                g.this.f12549.execute(new b("OkHttp %s ACK Settings", new Object[]{g.this.f12545}, z5, mVar));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // y4.h.b
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo13016(boolean z5, int i5, c5.e eVar, int i6) throws IOException {
            if (g.this.m13000(i5)) {
                g.this.m12996(i5, eVar, i6, z5);
                return;
            }
            y4.i m13001 = g.this.m13001(i5);
            if (m13001 == null) {
                g.this.m12991(i5, y4.b.PROTOCOL_ERROR);
                long j5 = i6;
                g.this.m13008(j5);
                eVar.skip(j5);
                return;
            }
            m13001.m13054(eVar, i6);
            if (z5) {
                m13001.m13055();
            }
        }

        @Override // y4.h.b
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo13017(boolean z5, int i5, int i6) {
            if (!z5) {
                try {
                    g.this.f12549.execute(g.this.new k(true, i5, i6));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (g.this) {
                try {
                    if (i5 == 1) {
                        g.m12984(g.this);
                    } else if (i5 == 2) {
                        g.m12977(g.this);
                    } else if (i5 == 3) {
                        g.m12975(g.this);
                        g.this.notifyAll();
                    }
                } finally {
                }
            }
        }

        @Override // y4.h.b
        /* renamed from: ˈ, reason: contains not printable characters */
        public void mo13019(boolean z5, int i5, int i6, List<y4.c> list) {
            if (g.this.m13000(i5)) {
                g.this.m12998(i5, list, z5);
                return;
            }
            synchronized (g.this) {
                y4.i m13001 = g.this.m13001(i5);
                if (m13001 != null) {
                    m13001.m13056(list);
                    if (z5) {
                        m13001.m13055();
                        return;
                    }
                    return;
                }
                if (g.this.f12548) {
                    return;
                }
                g gVar = g.this;
                if (i5 <= gVar.f12546) {
                    return;
                }
                if (i5 % 2 == gVar.f12547 % 2) {
                    return;
                }
                y4.i iVar = new y4.i(i5, g.this, false, z5, t4.c.m12056(list));
                g gVar2 = g.this;
                gVar2.f12546 = i5;
                gVar2.f12544.put(Integer.valueOf(i5), iVar);
                g.f12541.execute(new a("OkHttp %s stream %d", new Object[]{g.this.f12545, Integer.valueOf(i5)}, iVar));
            }
        }

        @Override // y4.h.b
        /* renamed from: ˉ, reason: contains not printable characters */
        public void mo13020(int i5, y4.b bVar) {
            if (g.this.m13000(i5)) {
                g.this.m13004(i5, bVar);
                return;
            }
            y4.i m13003 = g.this.m13003(i5);
            if (m13003 != null) {
                m13003.m13057(bVar);
            }
        }

        @Override // y4.h.b
        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo13021(int i5, long j5) {
            if (i5 == 0) {
                synchronized (g.this) {
                    g gVar = g.this;
                    gVar.f12562 += j5;
                    gVar.notifyAll();
                }
                return;
            }
            y4.i m13001 = g.this.m13001(i5);
            if (m13001 != null) {
                synchronized (m13001) {
                    m13001.m13043(j5);
                }
            }
        }

        @Override // y4.h.b
        /* renamed from: ˋ, reason: contains not printable characters */
        public void mo13022(int i5, int i6, List<y4.c> list) {
            g.this.m12999(i6, list);
        }

        @Override // t4.b
        /* renamed from: ˎ */
        protected void mo12000() {
            y4.b bVar;
            y4.b bVar2 = y4.b.INTERNAL_ERROR;
            try {
                try {
                    this.f12603.m13038(this);
                    while (this.f12603.m13037(false, this)) {
                    }
                    bVar = y4.b.NO_ERROR;
                } catch (IOException unused) {
                    bVar = bVar2;
                } catch (Throwable th) {
                    th = th;
                    bVar = bVar2;
                    try {
                        g.this.m12993(bVar, bVar2);
                    } catch (IOException unused2) {
                    }
                    t4.c.m12059(this.f12603);
                    throw th;
                }
                try {
                    try {
                        g.this.m12993(bVar, y4.b.CANCEL);
                    } catch (Throwable th2) {
                        th = th2;
                        g.this.m12993(bVar, bVar2);
                        t4.c.m12059(this.f12603);
                        throw th;
                    }
                } catch (IOException unused3) {
                    y4.b bVar3 = y4.b.PROTOCOL_ERROR;
                    g.this.m12993(bVar3, bVar3);
                    t4.c.m12059(this.f12603);
                }
            } catch (IOException unused4) {
            }
            t4.c.m12059(this.f12603);
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        void m13023(boolean z5, m mVar) {
            y4.i[] iVarArr;
            long j5;
            synchronized (g.this.f12566) {
                synchronized (g.this) {
                    int m13094 = g.this.f12564.m13094();
                    if (z5) {
                        g.this.f12564.m13091();
                    }
                    g.this.f12564.m13098(mVar);
                    int m130942 = g.this.f12564.m13094();
                    iVarArr = null;
                    if (m130942 == -1 || m130942 == m13094) {
                        j5 = 0;
                    } else {
                        j5 = m130942 - m13094;
                        if (!g.this.f12544.isEmpty()) {
                            iVarArr = (y4.i[]) g.this.f12544.values().toArray(new y4.i[g.this.f12544.size()]);
                        }
                    }
                }
                try {
                    g gVar = g.this;
                    gVar.f12566.m13069(gVar.f12564);
                } catch (IOException unused) {
                    g.this.m12978();
                }
            }
            if (iVarArr != null) {
                for (y4.i iVar : iVarArr) {
                    synchronized (iVar) {
                        iVar.m13043(j5);
                    }
                }
            }
            g.f12541.execute(new c("OkHttp %s settings", g.this.f12545));
        }

        @Override // y4.h.b
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo13014() {
        }

        @Override // y4.h.b
        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo13018(int i5, int i6, int i7, boolean z5) {
        }
    }
}
