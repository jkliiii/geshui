package k2;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AsyncServer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k {

    /* renamed from: ˈ, reason: contains not printable characters */
    static k f8782 = new k();

    /* renamed from: ˉ, reason: contains not printable characters */
    private static ExecutorService f8783 = m9448("AsyncServer-worker-");

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final Comparator<InetAddress> f8784 = new c();

    /* renamed from: ˋ, reason: contains not printable characters */
    private static ExecutorService f8785 = m9448("AsyncServer-resolver-");

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final ThreadLocal<k> f8786 = new ThreadLocal<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    private c0 f8787;

    /* renamed from: ʼ, reason: contains not printable characters */
    String f8788;

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean f8789;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f8790;

    /* renamed from: ʿ, reason: contains not printable characters */
    PriorityQueue<j> f8791;

    /* renamed from: ˆ, reason: contains not printable characters */
    Thread f8792;

    /* compiled from: AsyncServer.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g f8793;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ l2.b f8794;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ InetSocketAddress f8795;

        a(g gVar, l2.b bVar, l2.f fVar, InetSocketAddress inetSocketAddress) {
            this.f8793 = gVar;
            this.f8794 = bVar;
            this.f8795 = inetSocketAddress;
        }

        @Override // java.lang.Runnable
        public void run() {
            SocketChannel socketChannel;
            if (this.f8793.isCancelled()) {
                return;
            }
            g gVar = this.f8793;
            gVar.f8812 = this.f8794;
            SelectionKey selectionKey = null;
            try {
                socketChannel = SocketChannel.open();
                gVar.f8811 = socketChannel;
            } catch (Throwable th) {
                th = th;
                socketChannel = null;
            }
            try {
                socketChannel.configureBlocking(false);
                selectionKey = socketChannel.register(k.this.f8787.m9388(), 8);
                selectionKey.attach(this.f8793);
                socketChannel.connect(this.f8795);
            } catch (Throwable th2) {
                th = th2;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
                v2.h.m12364(socketChannel);
                this.f8793.m9905(new RuntimeException(th));
            }
        }
    }

    /* compiled from: AsyncServer.java */
    class b implements m2.g<InetAddress> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ l2.b f8797;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ m2.t f8798;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ InetSocketAddress f8799;

        b(l2.b bVar, m2.t tVar, InetSocketAddress inetSocketAddress) {
            this.f8797 = bVar;
            this.f8798 = tVar;
            this.f8799 = inetSocketAddress;
        }

        @Override // m2.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8740(Exception exc, InetAddress inetAddress) {
            if (exc == null) {
                this.f8798.m9902((g) k.this.m9452(new InetSocketAddress(inetAddress, this.f8799.getPort()), this.f8797));
            } else {
                this.f8797.mo9724(exc, null);
                this.f8798.m9905(exc);
            }
        }
    }

    /* compiled from: AsyncServer.java */
    static class c implements Comparator<InetAddress> {
        c() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(InetAddress inetAddress, InetAddress inetAddress2) {
            boolean z5 = inetAddress instanceof Inet4Address;
            if (z5 && (inetAddress2 instanceof Inet4Address)) {
                return 0;
            }
            if ((inetAddress instanceof Inet6Address) && (inetAddress2 instanceof Inet6Address)) {
                return 0;
            }
            return (z5 && (inetAddress2 instanceof Inet6Address)) ? -1 : 1;
        }
    }

    /* compiled from: AsyncServer.java */
    class d implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ String f8801;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ m2.t f8802;

        /* compiled from: AsyncServer.java */
        class a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ InetAddress[] f8804;

            a(InetAddress[] inetAddressArr) {
                this.f8804 = inetAddressArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f8802.m9904(null, this.f8804);
            }
        }

        /* compiled from: AsyncServer.java */
        class b implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ Exception f8806;

            b(Exception exc) {
                this.f8806 = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f8802.m9904(this.f8806, null);
            }
        }

        d(String str, m2.t tVar) {
            this.f8801 = str;
            this.f8802 = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                InetAddress[] allByName = InetAddress.getAllByName(this.f8801);
                Arrays.sort(allByName, k.f8784);
                if (allByName == null || allByName.length == 0) {
                    throw new z("no addresses for host");
                }
                k.this.m9462(new a(allByName));
            } catch (Exception e5) {
                k.this.m9462(new b(e5));
            }
        }
    }

    /* compiled from: AsyncServer.java */
    class e extends Thread {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ c0 f8808;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ PriorityQueue f8809;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, c0 c0Var, PriorityQueue priorityQueue) {
            super(str);
            this.f8808 = c0Var;
            this.f8809 = priorityQueue;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                k.f8786.set(k.this);
                k.m9446(k.this, this.f8808, this.f8809);
            } finally {
                k.f8786.remove();
            }
        }
    }

    /* compiled from: AsyncServer.java */
    private static class f extends IOException {
        public f(Exception exc) {
            super(exc);
        }
    }

    /* compiled from: AsyncServer.java */
    private class g extends m2.t<k2.a> {

        /* renamed from: י, reason: contains not printable characters */
        SocketChannel f8811;

        /* renamed from: ـ, reason: contains not printable characters */
        l2.b f8812;

        private g() {
        }

        @Override // m2.k
        /* renamed from: ˋ, reason: contains not printable characters */
        protected void mo9466() {
            super.mo9466();
            try {
                SocketChannel socketChannel = this.f8811;
                if (socketChannel != null) {
                    socketChannel.close();
                }
            } catch (IOException unused) {
            }
        }

        /* synthetic */ g(k kVar, k2.j jVar) {
            this();
        }
    }

    /* compiled from: AsyncServer.java */
    private static class h implements ThreadFactory {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ThreadGroup f8814;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final AtomicInteger f8815 = new AtomicInteger(1);

        /* renamed from: ʽ, reason: contains not printable characters */
        private final String f8816;

        h(String str) {
            SecurityManager securityManager = System.getSecurityManager();
            this.f8814 = securityManager != null ? securityManager.getThreadGroup() : Thread.currentThread().getThreadGroup();
            this.f8816 = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(this.f8814, runnable, this.f8816 + this.f8815.getAndIncrement(), 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* compiled from: AsyncServer.java */
    private static class i implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f8817;

        /* renamed from: ʿ, reason: contains not printable characters */
        Runnable f8818;

        /* renamed from: ˆ, reason: contains not printable characters */
        e0 f8819;

        /* renamed from: ˈ, reason: contains not printable characters */
        Handler f8820;

        private i() {
        }

        /* synthetic */ i(k2.j jVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                if (this.f8817) {
                    return;
                }
                this.f8817 = true;
                try {
                    this.f8818.run();
                } finally {
                    this.f8819.remove(this);
                    this.f8820.removeCallbacks(this);
                    this.f8819 = null;
                    this.f8820 = null;
                    this.f8818 = null;
                }
            }
        }
    }

    /* compiled from: AsyncServer.java */
    private static class j implements m2.a, Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        public k f8821;

        /* renamed from: ʿ, reason: contains not printable characters */
        public Runnable f8822;

        /* renamed from: ˆ, reason: contains not printable characters */
        public long f8823;

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f8824;

        public j(k kVar, Runnable runnable, long j5) {
            this.f8821 = kVar;
            this.f8822 = runnable;
            this.f8823 = j5;
        }

        @Override // m2.a
        public boolean cancel() {
            boolean remove;
            synchronized (this.f8821) {
                remove = this.f8821.f8791.remove(this);
                this.f8824 = remove;
            }
            return remove;
        }

        @Override // m2.a
        public boolean isCancelled() {
            return this.f8824;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8822.run();
        }
    }

    /* compiled from: AsyncServer.java */
    /* renamed from: k2.k$k, reason: collision with other inner class name */
    static class C0126k implements Comparator<j> {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static C0126k f8825 = new C0126k();

        private C0126k() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(j jVar, j jVar2) {
            long j5 = jVar.f8823;
            long j6 = jVar2.f8823;
            if (j5 == j6) {
                return 0;
            }
            return j5 > j6 ? 1 : -1;
        }
    }

    public k() {
        this(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v19, types: [l2.b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.nio.channels.SelectionKey] */
    /* JADX WARN: Type inference failed for: r1v7, types: [l2.e] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.nio.channels.SelectionKey] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, k2.a, k2.l] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, k2.a, k2.l] */
    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static void m9433(k kVar, c0 c0Var, PriorityQueue<j> priorityQueue) throws f {
        boolean z5;
        SocketChannel socketChannel;
        SelectionKey selectionKey;
        ?? r32;
        long m9447 = m9447(kVar, priorityQueue);
        try {
            synchronized (kVar) {
                if (c0Var.m9394() != 0) {
                    z5 = false;
                } else if (c0Var.m9389().size() == 0 && m9447 == Long.MAX_VALUE) {
                    return;
                } else {
                    z5 = true;
                }
                if (z5) {
                    if (m9447 == Long.MAX_VALUE) {
                        c0Var.m9392();
                    } else {
                        c0Var.m9393(m9447);
                    }
                }
                Set<SelectionKey> m9395 = c0Var.m9395();
                for (SelectionKey selectionKey2 : m9395) {
                    try {
                        socketChannel = null;
                        r32 = 0;
                    } catch (CancelledKeyException unused) {
                    }
                    if (selectionKey2.isAcceptable()) {
                        try {
                            SocketChannel accept = ((ServerSocketChannel) selectionKey2.channel()).accept();
                            if (accept != null) {
                                try {
                                    accept.configureBlocking(false);
                                    r32 = accept.register(c0Var.m9388(), 1);
                                    ?? r12 = (l2.e) selectionKey2.attachment();
                                    ?? aVar = new k2.a();
                                    aVar.m9360(accept, (InetSocketAddress) accept.socket().getRemoteSocketAddress());
                                    aVar.m9374(kVar, r32);
                                    r32.attach(aVar);
                                    r12.m9726(aVar);
                                } catch (IOException unused2) {
                                    selectionKey = r32;
                                    socketChannel = accept;
                                    v2.h.m12364(socketChannel);
                                    if (selectionKey != null) {
                                        selectionKey.cancel();
                                    }
                                }
                            }
                        } catch (IOException unused3) {
                            selectionKey = null;
                        }
                    } else if (selectionKey2.isReadable()) {
                        kVar.m9460(((k2.a) selectionKey2.attachment()).m9367());
                    } else if (selectionKey2.isWritable()) {
                        ((k2.a) selectionKey2.attachment()).m9363();
                    } else {
                        if (!selectionKey2.isConnectable()) {
                            Log.i("NIO", "wtf");
                            throw new RuntimeException("Unknown key state.");
                        }
                        g gVar = (g) selectionKey2.attachment();
                        SocketChannel socketChannel2 = (SocketChannel) selectionKey2.channel();
                        selectionKey2.interestOps(1);
                        try {
                            socketChannel2.finishConnect();
                            ?? aVar2 = new k2.a();
                            aVar2.m9374(kVar, selectionKey2);
                            aVar2.m9360(socketChannel2, (InetSocketAddress) socketChannel2.socket().getRemoteSocketAddress());
                            selectionKey2.attach(aVar2);
                            if (gVar.m9906(aVar2)) {
                                gVar.f8812.mo9724(null, aVar2);
                            }
                        } catch (IOException e5) {
                            selectionKey2.cancel();
                            v2.h.m12364(socketChannel2);
                            if (gVar.m9905(e5)) {
                                gVar.f8812.mo9724(e5, null);
                            }
                        }
                    }
                }
                m9395.clear();
            }
        } catch (Exception e6) {
            throw new f(e6);
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static void m9435(c0 c0Var) {
        try {
            for (SelectionKey selectionKey : c0Var.m9389()) {
                v2.h.m12364(selectionKey.channel());
                try {
                    selectionKey.cancel();
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static void m9437(c0 c0Var) {
        m9435(c0Var);
        v2.h.m12364(c0Var);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private static void m9440(final c0 c0Var) {
        f8783.execute(new Runnable() { // from class: k2.g
            @Override // java.lang.Runnable
            public final void run() {
                k.m9445(c0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴ, reason: contains not printable characters */
    public static /* synthetic */ InetAddress m9443(InetAddress[] inetAddressArr) throws Exception {
        return inetAddressArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public static /* synthetic */ void m9444(Runnable runnable, Semaphore semaphore) {
        runnable.run();
        semaphore.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵ, reason: contains not printable characters */
    public static /* synthetic */ void m9445(c0 c0Var) {
        try {
            c0Var.m9391();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static void m9446(k kVar, c0 c0Var, PriorityQueue<j> priorityQueue) {
        while (true) {
            try {
                m9433(kVar, c0Var, priorityQueue);
            } catch (f e5) {
                if (!(e5.getCause() instanceof ClosedSelectorException)) {
                    Log.i("NIO", "Selector exception, shutting down", e5);
                }
                v2.h.m12364(c0Var);
            }
            synchronized (kVar) {
                if (!c0Var.isOpen() || (c0Var.m9389().size() <= 0 && priorityQueue.size() <= 0)) {
                    break;
                }
            }
        }
        m9437(c0Var);
        if (kVar.f8787 == c0Var) {
            kVar.f8791 = new PriorityQueue<>(1, C0126k.f8825);
            kVar.f8787 = null;
            kVar.f8792 = null;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static long m9447(k kVar, PriorityQueue<j> priorityQueue) {
        j jVar;
        long j5 = Long.MAX_VALUE;
        while (true) {
            synchronized (kVar) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                jVar = null;
                if (priorityQueue.size() > 0) {
                    j remove = priorityQueue.remove();
                    long j6 = remove.f8823;
                    if (j6 <= elapsedRealtime) {
                        jVar = remove;
                    } else {
                        priorityQueue.add(remove);
                        j5 = j6 - elapsedRealtime;
                    }
                }
            }
            if (jVar == null) {
                kVar.f8790 = 0;
                return j5;
            }
            jVar.run();
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private static ExecutorService m9448(String str) {
        return new ThreadPoolExecutor(0, 4, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new h(str));
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static void m9449(Handler handler, Runnable runnable) {
        i iVar = new i(null);
        e0 m9415 = e0.m9415(handler.getLooper().getThread());
        iVar.f8819 = m9415;
        iVar.f8820 = handler;
        iVar.f8818 = runnable;
        m9415.add(iVar);
        handler.post(iVar);
        m9415.f8757.release();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m9450() {
        synchronized (this) {
            c0 c0Var = this.f8787;
            if (c0Var != null) {
                PriorityQueue<j> priorityQueue = this.f8791;
                try {
                    m9433(this, c0Var, priorityQueue);
                    return;
                } catch (f e5) {
                    Log.i("NIO", "Selector closed", e5);
                    try {
                        c0Var.m9388().close();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
            }
            try {
                c0 c0Var2 = new c0(SelectorProvider.provider().openSelector());
                this.f8787 = c0Var2;
                e eVar = new e(this.f8788, c0Var2, this.f8791);
                this.f8792 = eVar;
                eVar.start();
            } catch (IOException e6) {
                throw new RuntimeException("unable to create selector?", e6);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public g m9451(InetSocketAddress inetSocketAddress, l2.b bVar, l2.f fVar) {
        g gVar = new g(this, null);
        m9462(new a(gVar, bVar, fVar, inetSocketAddress));
        return gVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public m2.a m9452(InetSocketAddress inetSocketAddress, l2.b bVar) {
        return m9451(inetSocketAddress, bVar, null);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public m2.a m9453(String str, int i5, l2.b bVar) {
        return m9454(InetSocketAddress.createUnresolved(str, i5), bVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public m2.a m9454(InetSocketAddress inetSocketAddress, l2.b bVar) {
        if (!inetSocketAddress.isUnresolved()) {
            return m9452(inetSocketAddress, bVar);
        }
        m2.t tVar = new m2.t();
        m2.f<InetAddress> m9457 = m9457(inetSocketAddress.getHostName());
        tVar.mo9858(m9457);
        m9457.mo9865(new b(bVar, tVar, inetSocketAddress));
        return tVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public Thread m9455() {
        return this.f8792;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public m2.f<InetAddress[]> m9456(String str) {
        m2.t tVar = new m2.t();
        f8785.execute(new d(str, tVar));
        return tVar;
    }

    /* renamed from: י, reason: contains not printable characters */
    public m2.f<InetAddress> m9457(String str) {
        return m9456(str).mo9862(new m2.v() { // from class: k2.i
            @Override // m2.v
            /* renamed from: ʻ, reason: contains not printable characters */
            public final Object mo9431(Object obj) {
                return k.m9443((InetAddress[]) obj);
            }
        });
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m9458() {
        return this.f8792 == Thread.currentThread();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m9459(final Runnable runnable) {
        if (Thread.currentThread() == this.f8792) {
            m9462(runnable);
            m9447(this, this.f8791);
            return;
        }
        synchronized (this) {
            if (this.f8789) {
                return;
            }
            final Semaphore semaphore = new Semaphore(0);
            m9462(new Runnable() { // from class: k2.h
                @Override // java.lang.Runnable
                public final void run() {
                    k.m9444(runnable, semaphore);
                }
            });
            try {
                semaphore.acquire();
            } catch (InterruptedException e5) {
                Log.e("NIO", "run", e5);
            }
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public m2.a m9462(Runnable runnable) {
        return m9463(runnable, 0L);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public m2.a m9463(Runnable runnable, long j5) {
        synchronized (this) {
            if (this.f8789) {
                return m2.k.f9120;
            }
            long j6 = 0;
            if (j5 > 0) {
                j6 = SystemClock.elapsedRealtime() + j5;
            } else if (j5 == 0) {
                int i5 = this.f8790;
                this.f8790 = i5 + 1;
                j6 = i5;
            } else if (this.f8791.size() > 0) {
                j6 = Math.min(0L, this.f8791.peek().f8823 - 1);
            }
            PriorityQueue<j> priorityQueue = this.f8791;
            j jVar = new j(this, runnable, j6);
            priorityQueue.add(jVar);
            if (this.f8787 == null) {
                m9450();
            }
            if (!m9458()) {
                m9440(this.f8787);
            }
            return jVar;
        }
    }

    public k(String str) {
        this.f8790 = 0;
        this.f8791 = new PriorityQueue<>(1, C0126k.f8825);
        this.f8788 = str == null ? "AsyncServer" : str;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    protected void m9460(int i5) {
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    protected void m9461(int i5) {
    }
}
