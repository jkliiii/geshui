package p3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: DnsResolver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c implements o3.c {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static ScheduledExecutorService f10324 = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: ˆ, reason: contains not printable characters */
    private static ExecutorService f10325 = Executors.newFixedThreadPool(4);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f10326;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final String[] f10327;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final ExecutorService f10328;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final int f10329;

    /* compiled from: DnsResolver.java */
    class a implements Callable<Object> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ d f10330;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ String f10331;

        a(d dVar, String str) {
            this.f10330 = dVar;
            this.f10331 = str;
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            synchronized (this.f10330) {
                this.f10330.notify();
                this.f10330.f10341 = new IOException("resolver timeout for server:" + c.this.f10327 + " host:" + this.f10331);
            }
            return null;
        }
    }

    /* compiled from: DnsResolver.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ C0150c f10333;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ String f10334;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ String f10335;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f10336;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ d f10337;

        b(C0150c c0150c, String str, String str2, int i5, d dVar) {
            this.f10333 = c0150c;
            this.f10334 = str;
            this.f10335 = str2;
            this.f10336 = i5;
            this.f10337 = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IOException iOException;
            p3.d dVar = null;
            try {
                iOException = null;
                dVar = c.this.mo11148(this.f10333, this.f10334, this.f10335, this.f10336);
            } catch (Exception e5) {
                e5.printStackTrace();
                iOException = new IOException(e5);
            }
            synchronized (this.f10337) {
                d dVar2 = this.f10337;
                int i5 = dVar2.f10342 + 1;
                dVar2.f10342 = i5;
                if (dVar2.f10340 == null) {
                    dVar2.f10340 = dVar;
                }
                if (dVar2.f10341 == null) {
                    dVar2.f10341 = iOException;
                }
                if (i5 == c.this.f10327.length || this.f10337.f10340 != null) {
                    this.f10337.notify();
                }
            }
        }
    }

    /* compiled from: DnsResolver.java */
    /* renamed from: p3.c$c, reason: collision with other inner class name */
    static class C0150c {

        /* renamed from: ʻ, reason: contains not printable characters */
        Queue<Runnable> f10339 = new ConcurrentLinkedQueue();

        C0150c() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m11149(Runnable runnable) {
            if (runnable != null) {
                this.f10339.add(runnable);
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m11150() {
            for (Runnable runnable : this.f10339) {
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    /* compiled from: DnsResolver.java */
    private static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        p3.d f10340;

        /* renamed from: ʼ, reason: contains not printable characters */
        IOException f10341;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f10342 = 0;

        d() {
        }
    }

    public c(String str) {
        this(str, 1, 10);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private p3.d m11146(String str) throws IOException {
        return m11147(str, this.f10326);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private p3.d m11147(String str, int i5) throws IOException {
        String[] strArr = this.f10327;
        if (strArr == null || strArr.length == 0) {
            throw new IOException("server can not empty");
        }
        if (str == null || str.length() == 0) {
            throw new IOException("host can not empty");
        }
        C0150c c0150c = new C0150c();
        String[] strArr2 = this.f10327;
        if (strArr2.length == 1 || this.f10328 == null) {
            p3.d dVar = null;
            for (String str2 : strArr2) {
                dVar = mo11148(c0150c, str2, str, i5);
                if (dVar != null) {
                    break;
                }
            }
            return dVar;
        }
        d dVar2 = new d();
        f10324.schedule(new a(dVar2, str), this.f10329, TimeUnit.SECONDS);
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = this.f10327;
        int length = strArr3.length;
        int i6 = 0;
        while (i6 < length) {
            arrayList.add(this.f10328.submit(new b(c0150c, strArr3[i6], str, i5, dVar2)));
            i6++;
            strArr3 = strArr3;
        }
        synchronized (dVar2) {
            try {
                dVar2.wait();
            } catch (InterruptedException e5) {
                e5.printStackTrace();
            }
        }
        c0150c.m11150();
        IOException iOException = dVar2.f10341;
        if (iOException == null || dVar2.f10340 != null) {
            return dVar2.f10340;
        }
        throw iOException;
    }

    @Override // o3.c
    /* renamed from: ʻ */
    public o3.f[] mo10996(o3.b bVar, o3.e eVar) throws IOException {
        p3.d m11146 = m11146(bVar.f10105);
        if (m11146 == null) {
            throw new IOException("response is null");
        }
        List<o3.f> m11160 = m11146.m11160();
        if (m11160 == null || m11160.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (o3.f fVar : m11160) {
            if (fVar.m11000() || fVar.m11002() || fVar.m11001() || fVar.f10119 == this.f10326) {
                arrayList.add(fVar);
            }
        }
        return (o3.f[]) arrayList.toArray(new o3.f[0]);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    abstract p3.d mo11148(C0150c c0150c, String str, String str2, int i5) throws IOException;

    public c(String str, int i5, int i6) {
        this(str == null ? null : new String[]{str}, i5, i6, null);
    }

    public c(String[] strArr, int i5, int i6, ExecutorService executorService) {
        if (strArr != null && strArr.length > 1 && executorService == null) {
            executorService = f10325;
        }
        this.f10326 = i5;
        this.f10329 = i6 <= 0 ? 10 : i6;
        this.f10327 = strArr;
        this.f10328 = executorService;
    }
}
