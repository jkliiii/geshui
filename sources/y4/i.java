package y4;

import c5.s;
import c5.t;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import s4.r;
import y4.c;

/* compiled from: Http2Stream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    long f12622 = 0;

    /* renamed from: ʼ, reason: contains not printable characters */
    long f12623;

    /* renamed from: ʽ, reason: contains not printable characters */
    final int f12624;

    /* renamed from: ʾ, reason: contains not printable characters */
    final g f12625;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Deque<r> f12626;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f12627;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final b f12628;

    /* renamed from: ˉ, reason: contains not printable characters */
    final a f12629;

    /* renamed from: ˊ, reason: contains not printable characters */
    final c f12630;

    /* renamed from: ˋ, reason: contains not printable characters */
    final c f12631;

    /* renamed from: ˎ, reason: contains not printable characters */
    y4.b f12632;

    /* compiled from: Http2Stream.java */
    final class a implements c5.r {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final c5.c f12633 = new c5.c();

        /* renamed from: ʿ, reason: contains not printable characters */
        boolean f12634;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f12635;

        a() {
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m13061(boolean z5) throws IOException {
            i iVar;
            long min;
            i iVar2;
            synchronized (i.this) {
                i.this.f12631.m5858();
                while (true) {
                    try {
                        iVar = i.this;
                        if (iVar.f12623 > 0 || this.f12635 || this.f12634 || iVar.f12632 != null) {
                            break;
                        } else {
                            iVar.m13059();
                        }
                    } finally {
                    }
                }
                iVar.f12631.m13064();
                i.this.m13045();
                min = Math.min(i.this.f12623, this.f12633.size());
                iVar2 = i.this;
                iVar2.f12623 -= min;
            }
            iVar2.f12631.m5858();
            try {
                i iVar3 = i.this;
                iVar3.f12625.m12988(iVar3.f12624, z5 && min == this.f12633.size(), this.f12633, min);
            } finally {
            }
        }

        @Override // c5.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (i.this) {
                if (this.f12634) {
                    return;
                }
                if (!i.this.f12629.f12635) {
                    if (this.f12633.size() > 0) {
                        while (this.f12633.size() > 0) {
                            m13061(true);
                        }
                    } else {
                        i iVar = i.this;
                        iVar.f12625.m12988(iVar.f12624, true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f12634 = true;
                }
                i.this.f12625.flush();
                i.this.m13044();
            }
        }

        @Override // c5.r, java.io.Flushable
        public void flush() throws IOException {
            synchronized (i.this) {
                i.this.m13045();
            }
            while (this.f12633.size() > 0) {
                m13061(false);
                i.this.f12625.flush();
            }
        }

        @Override // c5.r
        /* renamed from: ʼ */
        public t mo5866() {
            return i.this.f12631;
        }

        @Override // c5.r
        /* renamed from: ˈ */
        public void mo5867(c5.c cVar, long j5) throws IOException {
            this.f12633.mo5867(cVar, j5);
            while (this.f12633.size() >= 16384) {
                m13061(false);
            }
        }
    }

    /* compiled from: Http2Stream.java */
    private final class b implements s {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final c5.c f12637 = new c5.c();

        /* renamed from: ʿ, reason: contains not printable characters */
        private final c5.c f12638 = new c5.c();

        /* renamed from: ˆ, reason: contains not printable characters */
        private final long f12639;

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f12640;

        /* renamed from: ˉ, reason: contains not printable characters */
        boolean f12641;

        b(long j5) {
            this.f12639 = j5;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private void m13062(long j5) {
            i.this.f12625.m13008(j5);
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (i.this) {
                this.f12640 = true;
                size = this.f12638.size();
                this.f12638.m5911();
                if (!i.this.f12626.isEmpty()) {
                    i.m13041(i.this);
                }
                i.this.notifyAll();
            }
            if (size > 0) {
                m13062(size);
            }
            i.this.m13044();
        }

        @Override // c5.s
        /* renamed from: ʼ */
        public t mo5868() {
            return i.this.f12630;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m13063(c5.e eVar, long j5) throws IOException {
            boolean z5;
            boolean z6;
            boolean z7;
            long j6;
            while (j5 > 0) {
                synchronized (i.this) {
                    z5 = this.f12641;
                    z6 = true;
                    z7 = this.f12638.size() + j5 > this.f12639;
                }
                if (z7) {
                    eVar.skip(j5);
                    i.this.m13047(y4.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z5) {
                    eVar.skip(j5);
                    return;
                }
                long mo5869 = eVar.mo5869(this.f12637, j5);
                if (mo5869 == -1) {
                    throw new EOFException();
                }
                j5 -= mo5869;
                synchronized (i.this) {
                    if (this.f12640) {
                        j6 = this.f12637.size();
                        this.f12637.m5911();
                    } else {
                        if (this.f12638.size() != 0) {
                            z6 = false;
                        }
                        this.f12638.m5889(this.f12637);
                        if (z6) {
                            i.this.notifyAll();
                        }
                        j6 = 0;
                    }
                }
                if (j6 > 0) {
                    m13062(j6);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        
            r12 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
        
            r11.f12642.f12630.m13064();
         */
        @Override // c5.s
        /* renamed from: י */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public long mo5869(c5.c r12, long r13) throws java.io.IOException {
            /*
                r11 = this;
                r0 = 0
                int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb2
            L6:
                y4.i r2 = y4.i.this
                monitor-enter(r2)
                y4.i r3 = y4.i.this     // Catch: java.lang.Throwable -> Laf
                y4.i$c r3 = r3.f12630     // Catch: java.lang.Throwable -> Laf
                r3.m5858()     // Catch: java.lang.Throwable -> Laf
                y4.i r3 = y4.i.this     // Catch: java.lang.Throwable -> L2c
                y4.b r4 = r3.f12632     // Catch: java.lang.Throwable -> L2c
                if (r4 == 0) goto L17
                goto L18
            L17:
                r4 = 0
            L18:
                boolean r5 = r11.f12640     // Catch: java.lang.Throwable -> L2c
                if (r5 != 0) goto L9f
                java.util.Deque r3 = y4.i.m13040(r3)     // Catch: java.lang.Throwable -> L2c
                boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2c
                if (r3 != 0) goto L2f
                y4.i r3 = y4.i.this     // Catch: java.lang.Throwable -> L2c
                y4.i.m13041(r3)     // Catch: java.lang.Throwable -> L2c
                goto L2f
            L2c:
                r12 = move-exception
                goto La7
            L2f:
                c5.c r3 = r11.f12638     // Catch: java.lang.Throwable -> L2c
                long r5 = r3.size()     // Catch: java.lang.Throwable -> L2c
                r7 = -1
                int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r3 <= 0) goto L71
                c5.c r3 = r11.f12638     // Catch: java.lang.Throwable -> L2c
                long r5 = r3.size()     // Catch: java.lang.Throwable -> L2c
                long r13 = java.lang.Math.min(r13, r5)     // Catch: java.lang.Throwable -> L2c
                long r12 = r3.mo5869(r12, r13)     // Catch: java.lang.Throwable -> L2c
                y4.i r14 = y4.i.this     // Catch: java.lang.Throwable -> L2c
                long r5 = r14.f12622     // Catch: java.lang.Throwable -> L2c
                long r5 = r5 + r12
                r14.f12622 = r5     // Catch: java.lang.Throwable -> L2c
                if (r4 != 0) goto L86
                y4.g r14 = r14.f12625     // Catch: java.lang.Throwable -> L2c
                y4.m r14 = r14.f12563     // Catch: java.lang.Throwable -> L2c
                int r14 = r14.m13094()     // Catch: java.lang.Throwable -> L2c
                int r14 = r14 / 2
                long r9 = (long) r14     // Catch: java.lang.Throwable -> L2c
                int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r14 < 0) goto L86
                y4.i r14 = y4.i.this     // Catch: java.lang.Throwable -> L2c
                y4.g r3 = r14.f12625     // Catch: java.lang.Throwable -> L2c
                int r5 = r14.f12624     // Catch: java.lang.Throwable -> L2c
                long r9 = r14.f12622     // Catch: java.lang.Throwable -> L2c
                r3.m12992(r5, r9)     // Catch: java.lang.Throwable -> L2c
                y4.i r14 = y4.i.this     // Catch: java.lang.Throwable -> L2c
                r14.f12622 = r0     // Catch: java.lang.Throwable -> L2c
                goto L86
            L71:
                boolean r3 = r11.f12641     // Catch: java.lang.Throwable -> L2c
                if (r3 != 0) goto L85
                if (r4 != 0) goto L85
                y4.i r3 = y4.i.this     // Catch: java.lang.Throwable -> L2c
                r3.m13059()     // Catch: java.lang.Throwable -> L2c
                y4.i r3 = y4.i.this     // Catch: java.lang.Throwable -> Laf
                y4.i$c r3 = r3.f12630     // Catch: java.lang.Throwable -> Laf
                r3.m13064()     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                goto L6
            L85:
                r12 = r7
            L86:
                y4.i r14 = y4.i.this     // Catch: java.lang.Throwable -> Laf
                y4.i$c r14 = r14.f12630     // Catch: java.lang.Throwable -> Laf
                r14.m13064()     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
                if (r14 == 0) goto L96
                r11.m13062(r12)
                return r12
            L96:
                if (r4 != 0) goto L99
                return r7
            L99:
                y4.n r12 = new y4.n
                r12.<init>(r4)
                throw r12
            L9f:
                java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L2c
                java.lang.String r13 = "stream closed"
                r12.<init>(r13)     // Catch: java.lang.Throwable -> L2c
                throw r12     // Catch: java.lang.Throwable -> L2c
            La7:
                y4.i r13 = y4.i.this     // Catch: java.lang.Throwable -> Laf
                y4.i$c r13 = r13.f12630     // Catch: java.lang.Throwable -> Laf
                r13.m13064()     // Catch: java.lang.Throwable -> Laf
                throw r12     // Catch: java.lang.Throwable -> Laf
            Laf:
                r12 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> Laf
                throw r12
            Lb2:
                java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r12.<init>(r13)
                goto Lca
            Lc9:
                throw r12
            Lca:
                goto Lc9
            */
            throw new UnsupportedOperationException("Method not decompiled: y4.i.b.mo5869(c5.c, long):long");
        }
    }

    /* compiled from: Http2Stream.java */
    class c extends c5.a {
        c() {
        }

        @Override // c5.a
        /* renamed from: ـ */
        protected IOException mo5862(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // c5.a
        /* renamed from: ᵔ */
        protected void mo5865() {
            i.this.m13047(y4.b.CANCEL);
            i.this.f12625.m13005();
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        public void m13064() throws IOException {
            if (m5861()) {
                throw mo5862(null);
            }
        }
    }

    i(int i5, g gVar, boolean z5, boolean z6, @Nullable r rVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f12626 = arrayDeque;
        this.f12630 = new c();
        this.f12631 = new c();
        this.f12632 = null;
        if (gVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.f12624 = i5;
        this.f12625 = gVar;
        this.f12623 = gVar.f12564.m13094();
        b bVar = new b(gVar.f12563.m13094());
        this.f12628 = bVar;
        a aVar = new a();
        this.f12629 = aVar;
        bVar.f12641 = z6;
        aVar.f12635 = z5;
        if (rVar != null) {
            arrayDeque.add(rVar);
        }
        if (m13051() && rVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m13051() && rVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static /* synthetic */ c.a m13041(i iVar) {
        iVar.getClass();
        return null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean m13042(y4.b bVar) {
        synchronized (this) {
            if (this.f12632 != null) {
                return false;
            }
            if (this.f12628.f12641 && this.f12629.f12635) {
                return false;
            }
            this.f12632 = bVar;
            notifyAll();
            this.f12625.m13003(this.f12624);
            return true;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m13043(long j5) {
        this.f12623 += j5;
        if (j5 > 0) {
            notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0017  */
    /* renamed from: ʾ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m13044() throws java.io.IOException {
        /*
            r2 = this;
            monitor-enter(r2)
            y4.i$b r0 = r2.f12628     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.f12641     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L17
            boolean r0 = r0.f12640     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
            y4.i$a r0 = r2.f12629     // Catch: java.lang.Throwable -> L2f
            boolean r1 = r0.f12635     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L15
            boolean r0 = r0.f12634     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L17
        L15:
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            boolean r1 = r2.m13052()     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L25
            y4.b r0 = y4.b.CANCEL
            r2.m13046(r0)
            goto L2e
        L25:
            if (r1 != 0) goto L2e
            y4.g r0 = r2.f12625
            int r1 = r2.f12624
            r0.m13003(r1)
        L2e:
            return
        L2f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.i.m13044():void");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m13045() throws IOException {
        a aVar = this.f12629;
        if (aVar.f12634) {
            throw new IOException("stream closed");
        }
        if (aVar.f12635) {
            throw new IOException("stream finished");
        }
        if (this.f12632 != null) {
            throw new n(this.f12632);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m13046(y4.b bVar) throws IOException {
        if (m13042(bVar)) {
            this.f12625.m12990(this.f12624, bVar);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m13047(y4.b bVar) {
        if (m13042(bVar)) {
            this.f12625.m12991(this.f12624, bVar);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m13048() {
        return this.f12624;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public c5.r m13049() {
        synchronized (this) {
            if (!this.f12627 && !m13051()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f12629;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public s m13050() {
        return this.f12628;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m13051() {
        return this.f12625.f12542 == ((this.f12624 & 1) == 1);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public synchronized boolean m13052() {
        if (this.f12632 != null) {
            return false;
        }
        b bVar = this.f12628;
        if (bVar.f12641 || bVar.f12640) {
            a aVar = this.f12629;
            if (aVar.f12635 || aVar.f12634) {
                if (this.f12627) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: י, reason: contains not printable characters */
    public t m13053() {
        return this.f12630;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m13054(c5.e eVar, int i5) throws IOException {
        this.f12628.m13063(eVar, i5);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m13055() {
        boolean m13052;
        synchronized (this) {
            this.f12628.f12641 = true;
            m13052 = m13052();
            notifyAll();
        }
        if (m13052) {
            return;
        }
        this.f12625.m13003(this.f12624);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m13056(List<y4.c> list) {
        boolean m13052;
        synchronized (this) {
            this.f12627 = true;
            this.f12626.add(t4.c.m12056(list));
            m13052 = m13052();
            notifyAll();
        }
        if (m13052) {
            return;
        }
        this.f12625.m13003(this.f12624);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    synchronized void m13057(y4.b bVar) {
        if (this.f12632 == null) {
            this.f12632 = bVar;
            notifyAll();
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public synchronized r m13058() throws IOException {
        this.f12630.m5858();
        while (this.f12626.isEmpty() && this.f12632 == null) {
            try {
                m13059();
            } catch (Throwable th) {
                this.f12630.m13064();
                throw th;
            }
        }
        this.f12630.m13064();
        if (this.f12626.isEmpty()) {
            throw new n(this.f12632);
        }
        return this.f12626.removeFirst();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m13059() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public t m13060() {
        return this.f12631;
    }
}
