package e1;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.i;
import e1.f;
import e1.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import z1.a;

/* compiled from: DecodeJob.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private Object f7391;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private com.bumptech.glide.load.data.d<?> f7392;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private c1.a f7393;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private volatile boolean f7395;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private volatile e1.f f7397;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private boolean f7399;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final e f7400;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final androidx.core.util.e<h<?>> f7401;

    /* renamed from: ˎ, reason: contains not printable characters */
    private com.bumptech.glide.d f7404;

    /* renamed from: ˏ, reason: contains not printable characters */
    private c1.f f7405;

    /* renamed from: ˑ, reason: contains not printable characters */
    private com.bumptech.glide.g f7406;

    /* renamed from: י, reason: contains not printable characters */
    private n f7407;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f7408;

    /* renamed from: ــ, reason: contains not printable characters */
    private volatile boolean f7409;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f7410;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private j f7411;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private c1.f f7412;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private c1.h f7413;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private c1.f f7414;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private b<R> f7415;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f7416;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private EnumC0102h f7417;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private g f7418;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private long f7419;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f7420;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private Object f7421;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private Thread f7422;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e1.g<R> f7394 = new e1.g<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final List<Throwable> f7396 = new ArrayList();

    /* renamed from: ˆ, reason: contains not printable characters */
    private final z1.c f7398 = z1.c.m13149();

    /* renamed from: ˊ, reason: contains not printable characters */
    private final d<?> f7402 = new d<>();

    /* renamed from: ˋ, reason: contains not printable characters */
    private final f f7403 = new f();

    /* compiled from: DecodeJob.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f7423;

        /* renamed from: ʼ, reason: contains not printable characters */
        static final /* synthetic */ int[] f7424;

        /* renamed from: ʽ, reason: contains not printable characters */
        static final /* synthetic */ int[] f7425;

        static {
            int[] iArr = new int[c1.c.values().length];
            f7425 = iArr;
            try {
                iArr[c1.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7425[c1.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0102h.values().length];
            f7424 = iArr2;
            try {
                iArr2[EnumC0102h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7424[EnumC0102h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7424[EnumC0102h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7424[EnumC0102h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7424[EnumC0102h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f7423 = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7423[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7423[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    interface b<R> {
        /* renamed from: ʼ, reason: contains not printable characters */
        void mo8347(q qVar);

        /* renamed from: ʾ, reason: contains not printable characters */
        void mo8348(v<R> vVar, c1.a aVar, boolean z5);

        /* renamed from: ʿ, reason: contains not printable characters */
        void mo8349(h<?> hVar);
    }

    /* compiled from: DecodeJob.java */
    private final class c<Z> implements i.a<Z> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final c1.a f7426;

        c(c1.a aVar) {
            this.f7426 = aVar;
        }

        @Override // e1.i.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public v<Z> mo8350(v<Z> vVar) {
            return h.this.m8345(this.f7426, vVar);
        }
    }

    /* compiled from: DecodeJob.java */
    private static class d<Z> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private c1.f f7428;

        /* renamed from: ʼ, reason: contains not printable characters */
        private c1.k<Z> f7429;

        /* renamed from: ʽ, reason: contains not printable characters */
        private u<Z> f7430;

        d() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m8351() {
            this.f7428 = null;
            this.f7429 = null;
            this.f7430 = null;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m8352(e eVar, c1.h hVar) {
            z1.b.m13143("DecodeJob.encode");
            try {
                eVar.mo8355().mo8661(this.f7428, new e1.e(this.f7429, this.f7430, hVar));
            } finally {
                this.f7430.m8439();
                z1.b.m13147();
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean m8353() {
            return this.f7430 != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: ʾ, reason: contains not printable characters */
        <X> void m8354(c1.f fVar, c1.k<X> kVar, u<X> uVar) {
            this.f7428 = fVar;
            this.f7429 = kVar;
            this.f7430 = uVar;
        }
    }

    /* compiled from: DecodeJob.java */
    interface e {
        /* renamed from: ʻ, reason: contains not printable characters */
        g1.a mo8355();
    }

    /* compiled from: DecodeJob.java */
    private static class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f7431;

        /* renamed from: ʼ, reason: contains not printable characters */
        private boolean f7432;

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean f7433;

        f() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean m8356(boolean z5) {
            return (this.f7433 || z5 || this.f7432) && this.f7431;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        synchronized boolean m8357() {
            this.f7432 = true;
            return m8356(false);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        synchronized boolean m8358() {
            this.f7433 = true;
            return m8356(false);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        synchronized boolean m8359(boolean z5) {
            this.f7431 = true;
            return m8356(z5);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        synchronized void m8360() {
            this.f7432 = false;
            this.f7431 = false;
            this.f7433 = false;
        }
    }

    /* compiled from: DecodeJob.java */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: e1.h$h, reason: collision with other inner class name */
    private enum EnumC0102h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, androidx.core.util.e<h<?>> eVar2) {
        this.f7400 = eVar;
        this.f7401 = eVar2;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m8320() {
        Throwable th;
        this.f7398.mo13151();
        if (!this.f7395) {
            this.f7395 = true;
            return;
        }
        if (this.f7396.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f7396;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private <Data> v<R> m8321(com.bumptech.glide.load.data.d<?> dVar, Data data, c1.a aVar) throws q {
        if (data == null) {
            dVar.mo6137();
            return null;
        }
        try {
            long m12879 = y1.g.m12879();
            v<R> m8322 = m8322(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                m8328("Decoded result " + m8322, m12879);
            }
            return m8322;
        } finally {
            dVar.mo6137();
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private <Data> v<R> m8322(Data data, c1.a aVar) throws q {
        return m8331(data, aVar, this.f7394.m8302(data.getClass()));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m8323() {
        v<R> vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            m8329("Retrieved data", this.f7419, "data: " + this.f7391 + ", cache key: " + this.f7412 + ", fetcher: " + this.f7392);
        }
        try {
            vVar = m8321(this.f7392, this.f7391, this.f7393);
        } catch (q e5) {
            e5.m8425(this.f7414, this.f7393);
            this.f7396.add(e5);
            vVar = null;
        }
        if (vVar != null) {
            m8332(vVar, this.f7393, this.f7399);
        } else {
            m8339();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private e1.f m8324() {
        int i5 = a.f7424[this.f7417.ordinal()];
        if (i5 == 1) {
            return new w(this.f7394, this);
        }
        if (i5 == 2) {
            return new e1.c(this.f7394, this);
        }
        if (i5 == 3) {
            return new z(this.f7394, this);
        }
        if (i5 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f7417);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private EnumC0102h m8325(EnumC0102h enumC0102h) {
        int i5 = a.f7424[enumC0102h.ordinal()];
        if (i5 == 1) {
            return this.f7411.mo8366() ? EnumC0102h.DATA_CACHE : m8325(EnumC0102h.DATA_CACHE);
        }
        if (i5 == 2) {
            return this.f7420 ? EnumC0102h.FINISHED : EnumC0102h.SOURCE;
        }
        if (i5 == 3 || i5 == 4) {
            return EnumC0102h.FINISHED;
        }
        if (i5 == 5) {
            return this.f7411.mo8367() ? EnumC0102h.RESOURCE_CACHE : m8325(EnumC0102h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0102h);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private c1.h m8326(c1.a aVar) {
        c1.h hVar = this.f7413;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z5 = aVar == c1.a.RESOURCE_DISK_CACHE || this.f7394.m8318();
        c1.g<Boolean> gVar = l1.t.f9001;
        Boolean bool = (Boolean) hVar.m5831(gVar);
        if (bool != null && (!bool.booleanValue() || z5)) {
            return hVar;
        }
        c1.h hVar2 = new c1.h();
        hVar2.m5832(this.f7413);
        hVar2.m5833(gVar, Boolean.valueOf(z5));
        return hVar2;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private int m8327() {
        return this.f7406.ordinal();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m8328(String str, long j5) {
        m8329(str, j5, null);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m8329(String str, long j5, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(y1.g.m12878(j5));
        sb.append(", load key: ");
        sb.append(this.f7407);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = BuildConfig.FLAVOR;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m8330(v<R> vVar, c1.a aVar, boolean z5) {
        m8320();
        this.f7415.mo8348(vVar, aVar, z5);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private <Data, ResourceType> v<R> m8331(Data data, c1.a aVar, t<Data, ResourceType, R> tVar) throws q {
        c1.h m8326 = m8326(aVar);
        com.bumptech.glide.load.data.e<Data> m6058 = this.f7404.m6041().m6058(data);
        try {
            return tVar.m8435(m6058, m8326, this.f7408, this.f7410, new c(aVar));
        } finally {
            m6058.mo6127();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m8332(v<R> vVar, c1.a aVar, boolean z5) {
        u uVar;
        z1.b.m13143("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).mo8429();
            }
            if (this.f7402.m8353()) {
                vVar = u.m8437(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            m8330(vVar, aVar, z5);
            this.f7417 = EnumC0102h.ENCODE;
            try {
                if (this.f7402.m8353()) {
                    this.f7402.m8352(this.f7400, this.f7413);
                }
                m8335();
            } finally {
                if (uVar != 0) {
                    uVar.m8439();
                }
            }
        } finally {
            z1.b.m13147();
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m8333() {
        int i5 = a.f7423[this.f7418.ordinal()];
        if (i5 == 1) {
            this.f7417 = m8325(EnumC0102h.INITIALIZE);
            this.f7397 = m8324();
            m8339();
        } else if (i5 == 2) {
            m8339();
        } else {
            if (i5 == 3) {
                m8323();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f7418);
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m8334() {
        m8320();
        this.f7415.mo8347(new q("Failed to load resource", new ArrayList(this.f7396)));
        m8336();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m8335() {
        if (this.f7403.m8357()) {
            m8337();
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m8336() {
        if (this.f7403.m8358()) {
            m8337();
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m8337() {
        this.f7403.m8360();
        this.f7402.m8351();
        this.f7394.m8295();
        this.f7395 = false;
        this.f7404 = null;
        this.f7405 = null;
        this.f7413 = null;
        this.f7406 = null;
        this.f7407 = null;
        this.f7415 = null;
        this.f7417 = null;
        this.f7397 = null;
        this.f7422 = null;
        this.f7412 = null;
        this.f7391 = null;
        this.f7393 = null;
        this.f7392 = null;
        this.f7419 = 0L;
        this.f7409 = false;
        this.f7421 = null;
        this.f7396.clear();
        this.f7401.mo2574(this);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m8338(g gVar) {
        this.f7418 = gVar;
        this.f7415.mo8349(this);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m8339() {
        this.f7422 = Thread.currentThread();
        this.f7419 = y1.g.m12879();
        boolean z5 = false;
        while (!this.f7409 && this.f7397 != null && !(z5 = this.f7397.mo8290())) {
            this.f7417 = m8325(this.f7417);
            this.f7397 = m8324();
            if (this.f7417 == EnumC0102h.SOURCE) {
                m8338(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f7417 == EnumC0102h.FINISHED || this.f7409) && !z5) {
            m8334();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        z1.b.m13145("DecodeJob#run(reason=%s, model=%s)", this.f7418, this.f7421);
        com.bumptech.glide.load.data.d<?> dVar = this.f7392;
        try {
            try {
                if (this.f7409) {
                    m8334();
                    return;
                }
                m8333();
                if (dVar != null) {
                    dVar.mo6137();
                }
                z1.b.m13147();
            } catch (e1.b e5) {
                throw e5;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f7409 + ", stage: " + this.f7417, th);
                }
                if (this.f7417 != EnumC0102h.ENCODE) {
                    this.f7396.add(th);
                    m8334();
                }
                if (!this.f7409) {
                    throw th;
                }
                throw th;
            }
        } finally {
            if (dVar != null) {
                dVar.mo6137();
            }
            z1.b.m13147();
        }
    }

    @Override // e1.f.a
    /* renamed from: ʻ */
    public void mo8292(c1.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, c1.a aVar) {
        dVar.mo6137();
        q qVar = new q("Fetching data failed", exc);
        qVar.m8426(fVar, aVar, dVar.mo6132());
        this.f7396.add(qVar);
        if (Thread.currentThread() != this.f7422) {
            m8338(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            m8339();
        }
    }

    @Override // e1.f.a
    /* renamed from: ʼ */
    public void mo8293() {
        m8338(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // e1.f.a
    /* renamed from: ʽ */
    public void mo8294(c1.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, c1.a aVar, c1.f fVar2) {
        this.f7412 = fVar;
        this.f7391 = obj;
        this.f7392 = dVar;
        this.f7393 = aVar;
        this.f7414 = fVar2;
        this.f7399 = fVar != this.f7394.m8297().get(0);
        if (Thread.currentThread() != this.f7422) {
            m8338(g.DECODE_DATA);
            return;
        }
        z1.b.m13143("DecodeJob.decodeFromRetrievedData");
        try {
            m8323();
        } finally {
            z1.b.m13147();
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    boolean m8340() {
        EnumC0102h m8325 = m8325(EnumC0102h.INITIALIZE);
        return m8325 == EnumC0102h.RESOURCE_CACHE || m8325 == EnumC0102h.DATA_CACHE;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m8341() {
        this.f7409 = true;
        e1.f fVar = this.f7397;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int m8327 = m8327() - hVar.m8327();
        return m8327 == 0 ? this.f7416 - hVar.f7416 : m8327;
    }

    @Override // z1.a.f
    /* renamed from: ˆ, reason: contains not printable characters */
    public z1.c mo8343() {
        return this.f7398;
    }

    /* renamed from: י, reason: contains not printable characters */
    h<R> m8344(com.bumptech.glide.d dVar, Object obj, n nVar, c1.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, c1.l<?>> map, boolean z5, boolean z6, boolean z7, c1.h hVar, b<R> bVar, int i7) {
        this.f7394.m8316(dVar, obj, fVar, i5, i6, jVar, cls, cls2, gVar, hVar, map, z5, z6, this.f7400);
        this.f7404 = dVar;
        this.f7405 = fVar;
        this.f7406 = gVar;
        this.f7407 = nVar;
        this.f7408 = i5;
        this.f7410 = i6;
        this.f7411 = jVar;
        this.f7420 = z7;
        this.f7413 = hVar;
        this.f7415 = bVar;
        this.f7416 = i7;
        this.f7418 = g.INITIALIZE;
        this.f7421 = obj;
        return this;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    <Z> v<Z> m8345(c1.a aVar, v<Z> vVar) {
        v<Z> vVar2;
        c1.l<Z> lVar;
        c1.c cVar;
        c1.f dVar;
        Class<?> cls = vVar.get().getClass();
        c1.k<Z> kVar = null;
        if (aVar != c1.a.RESOURCE_DISK_CACHE) {
            c1.l<Z> m8313 = this.f7394.m8313(cls);
            lVar = m8313;
            vVar2 = m8313.mo5838(this.f7404, vVar, this.f7408, this.f7410);
        } else {
            vVar2 = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVar2)) {
            vVar.mo8413();
        }
        if (this.f7394.m8317(vVar2)) {
            kVar = this.f7394.m8308(vVar2);
            cVar = kVar.mo5837(this.f7413);
        } else {
            cVar = c1.c.NONE;
        }
        c1.k kVar2 = kVar;
        if (!this.f7411.mo8369(!this.f7394.m8319(this.f7412), aVar, cVar)) {
            return vVar2;
        }
        if (kVar2 == null) {
            throw new i.d(vVar2.get().getClass());
        }
        int i5 = a.f7425[cVar.ordinal()];
        if (i5 == 1) {
            dVar = new e1.d(this.f7412, this.f7405);
        } else {
            if (i5 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar);
            }
            dVar = new x(this.f7394.m8296(), this.f7412, this.f7405, this.f7408, this.f7410, lVar, cls, this.f7413);
        }
        u m8437 = u.m8437(vVar2);
        this.f7402.m8354(dVar, kVar2, m8437);
        return m8437;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m8346(boolean z5) {
        if (this.f7403.m8359(z5)) {
            m8337();
        }
    }
}
