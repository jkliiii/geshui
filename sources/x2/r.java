package x2;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import k2.f0;
import k2.v;
import x2.x;

/* compiled from: IonRequestBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class r implements a3.c, a3.e, a3.f, a3.i, a3.k, a3.g<a3.c> {

    /* renamed from: ʻ, reason: contains not printable characters */
    l f12285;

    /* renamed from: ʼ, reason: contains not printable characters */
    n f12286;

    /* renamed from: ʿ, reason: contains not printable characters */
    String f12289;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f12290;

    /* renamed from: ˈ, reason: contains not printable characters */
    n2.s f12291;

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean f12292;

    /* renamed from: ˊ, reason: contains not printable characters */
    n2.w f12293;

    /* renamed from: ˎ, reason: contains not printable characters */
    o2.a f12295;

    /* renamed from: ˑ, reason: contains not printable characters */
    i f12297;

    /* renamed from: י, reason: contains not printable characters */
    WeakReference<ProgressBar> f12298;

    /* renamed from: ـ, reason: contains not printable characters */
    WeakReference<ProgressDialog> f12299;

    /* renamed from: ٴ, reason: contains not printable characters */
    y f12300;

    /* renamed from: ᐧ, reason: contains not printable characters */
    y f12301;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    ProgressDialog f12302;

    /* renamed from: ᴵ, reason: contains not printable characters */
    n2.w f12303;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    y f12304;

    /* renamed from: ᵎ, reason: contains not printable characters */
    o2.c f12305;

    /* renamed from: ᵔ, reason: contains not printable characters */
    String f12306;

    /* renamed from: ᵢ, reason: contains not printable characters */
    int f12307;

    /* renamed from: ⁱ, reason: contains not printable characters */
    ArrayList<WeakReference<Object>> f12308;

    /* renamed from: ﹳ, reason: contains not printable characters */
    String f12309;

    /* renamed from: ﹶ, reason: contains not printable characters */
    int f12310;

    /* renamed from: ﾞ, reason: contains not printable characters */
    y f12311;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    ProgressBar f12312;

    /* renamed from: ʽ, reason: contains not printable characters */
    Handler f12287 = l.f12189;

    /* renamed from: ʾ, reason: contains not printable characters */
    String f12288 = "GET";

    /* renamed from: ˋ, reason: contains not printable characters */
    int f12294 = 30000;

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean f12296 = true;

    /* compiled from: IonRequestBuilder.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ h f12313;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Exception f12314;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ Object f12315;

        a(h hVar, Exception exc, Object obj) {
            this.f12313 = hVar;
            this.f12314 = exc;
            this.f12315 = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            String mo12694 = r.this.f12286.mo12694();
            if (mo12694 == null) {
                Exception exc = this.f12314;
                if (exc != null) {
                    this.f12313.m9905(exc);
                    return;
                } else {
                    this.f12313.m9906(this.f12315);
                    return;
                }
            }
            this.f12313.f12344.m10511("context has died: " + mo12694);
            this.f12313.m9907();
        }
    }

    /* compiled from: IonRequestBuilder.java */
    class b implements y {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ h f12317;

        /* compiled from: IonRequestBuilder.java */
        class a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ long f12319;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ long f12320;

            a(long j5, long j6) {
                this.f12319 = j5;
                this.f12320 = j6;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f12317.isCancelled() || b.this.f12317.isDone()) {
                    return;
                }
                r.this.f12304.mo9030(this.f12319, this.f12320);
            }
        }

        b(h hVar) {
            this.f12317 = hVar;
        }

        @Override // x2.y
        /* renamed from: ʻ */
        public void mo9030(long j5, long j6) {
            int i5 = (int) ((j5 / j6) * 100.0f);
            ProgressBar progressBar = r.this.f12312;
            if (progressBar != null) {
                progressBar.setProgress(i5);
            }
            ProgressDialog progressDialog = r.this.f12302;
            if (progressDialog != null) {
                progressDialog.setProgress(i5);
            }
            y yVar = r.this.f12311;
            if (yVar != null) {
                yVar.mo9030(j5, j6);
            }
            if (r.this.f12304 != null) {
                k2.k.m9449(l.f12189, new a(j5, j6));
            }
        }
    }

    /* compiled from: IonRequestBuilder.java */
    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        n2.e f12322;

        /* renamed from: ʿ, reason: contains not printable characters */
        Runnable f12323 = this;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ n2.e f12324;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m2.t f12325;

        /* compiled from: IonRequestBuilder.java */
        class a implements m2.g<n2.e> {
            a() {
            }

            @Override // m2.g
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo8740(Exception exc, n2.e eVar) {
                if (exc != null) {
                    c.this.f12325.m9905(exc);
                    return;
                }
                c cVar = c.this;
                cVar.f12322 = eVar;
                cVar.f12323.run();
            }
        }

        c(n2.e eVar, m2.t tVar) {
            this.f12324 = eVar;
            this.f12325 = tVar;
            this.f12322 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m2.f<n2.e> m12789 = r.this.m12789(this.f12322);
            if (m12789 == null) {
                this.f12325.m9906(this.f12322);
            } else {
                m12789.mo9865(new a());
            }
        }
    }

    /* compiled from: IonRequestBuilder.java */
    class d implements m2.g<n2.e> {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ h f12328;

        /* compiled from: IonRequestBuilder.java */
        class a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ n2.e f12330;

            a(n2.e eVar) {
                this.f12330 = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = d.this;
                r.this.m12794(this.f12330, dVar.f12328);
            }
        }

        d(h hVar) {
            this.f12328 = hVar;
        }

        @Override // m2.g
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo8740(Exception exc, n2.e eVar) {
            if (exc != null) {
                this.f12328.m9905(exc);
                return;
            }
            this.f12328.f12345 = eVar;
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                k2.k.m9449(l.f12189, new a(eVar));
            } else {
                r.this.m12794(eVar, this.f12328);
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IonRequestBuilder.java */
    class e<T> extends h<T> {

        /* renamed from: ᵢ, reason: contains not printable characters */
        h<T> f12332;

        /* renamed from: ⁱ, reason: contains not printable characters */
        final /* synthetic */ boolean f12333;

        /* renamed from: ﹳ, reason: contains not printable characters */
        final /* synthetic */ k2.u f12334;

        /* renamed from: ﹶ, reason: contains not printable characters */
        final /* synthetic */ Object f12335;

        /* compiled from: IonRequestBuilder.java */
        class a implements l2.a {
            a() {
            }

            @Override // l2.a
            /* renamed from: ʻ */
            public void mo9412(Exception exc) {
                e eVar = e.this;
                r.this.m12777(eVar.f12332, exc, eVar.f12335);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Runnable runnable, boolean z5, k2.u uVar, Object obj) {
            super(runnable);
            this.f12333 = z5;
            this.f12334 = uVar;
            this.f12335 = obj;
            this.f12332 = this;
        }

        @Override // m2.k
        /* renamed from: ˎ */
        protected void mo9872() {
            super.mo9872();
            if (this.f12333) {
                this.f12334.end();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.x
        /* renamed from: ﹶﹶ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9912(x.a aVar) throws Exception {
            super.mo9912(aVar);
            f0.m9427(this.f12349, this.f12334, new a());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IonRequestBuilder.java */
    class f<T> extends h<T> {

        /* renamed from: ᵢ, reason: contains not printable characters */
        h<T> f12338;

        /* renamed from: ⁱ, reason: contains not printable characters */
        final /* synthetic */ t2.a f12339;

        /* compiled from: IonRequestBuilder.java */
        class a implements m2.g<T> {
            a() {
            }

            @Override // m2.g
            /* renamed from: ʻ */
            public void mo8740(Exception exc, T t5) {
                f fVar = f.this;
                r.this.m12777(fVar.f12338, exc, t5);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Runnable runnable, t2.a aVar) {
            super(runnable);
            this.f12339 = aVar;
            this.f12338 = this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // m2.x
        /* renamed from: ﹶﹶ */
        public void mo9912(x.a aVar) throws Exception {
            super.mo9912(aVar);
            this.f12339.mo12046(this.f12349).mo9865(new a());
        }
    }

    /* compiled from: IonRequestBuilder.java */
    class g implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ File f12342;

        g(File file) {
            this.f12342 = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12342.delete();
        }
    }

    /* compiled from: IonRequestBuilder.java */
    class h<T> extends m2.x<T, x.a> implements d3.b<T> {

        /* renamed from: י, reason: contains not printable characters */
        n2.e f12344;

        /* renamed from: ـ, reason: contains not printable characters */
        n2.e f12345;

        /* renamed from: ٴ, reason: contains not printable characters */
        b0 f12346;

        /* renamed from: ᐧ, reason: contains not printable characters */
        Runnable f12347;

        /* renamed from: ᴵ, reason: contains not printable characters */
        x2.h f12348;

        /* renamed from: ᵎ, reason: contains not printable characters */
        k2.s f12349;

        /* compiled from: IonRequestBuilder.java */
        class a implements m2.g<T> {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ m2.t f12351;

            a(m2.t tVar) {
                this.f12351 = tVar;
            }

            @Override // m2.g
            /* renamed from: ʻ */
            public void mo8740(Exception exc, T t5) {
                h hVar = h.this;
                if (hVar.f12349 != null) {
                    this.f12351.m9906(hVar.m12809(exc, t5));
                } else {
                    this.f12351.m9904(exc, null);
                }
            }
        }

        /* compiled from: IonRequestBuilder.java */
        class b implements v.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            int f12353;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ long f12354;

            /* compiled from: IonRequestBuilder.java */
            class a implements Runnable {

                /* renamed from: ʾ, reason: contains not printable characters */
                final /* synthetic */ int f12356;

                a(int i5) {
                    this.f12356 = i5;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ProgressDialog progressDialog;
                    ProgressBar progressBar;
                    if (h.this.isCancelled() || h.this.isDone()) {
                        return;
                    }
                    WeakReference<ProgressBar> weakReference = r.this.f12298;
                    if (weakReference != null && (progressBar = weakReference.get()) != null) {
                        progressBar.setProgress(this.f12356);
                    }
                    WeakReference<ProgressDialog> weakReference2 = r.this.f12299;
                    if (weakReference2 == null || (progressDialog = weakReference2.get()) == null) {
                        return;
                    }
                    progressDialog.setProgress(this.f12356);
                }
            }

            /* compiled from: IonRequestBuilder.java */
            /* renamed from: x2.r$h$b$b, reason: collision with other inner class name */
            class RunnableC0175b implements Runnable {

                /* renamed from: ʾ, reason: contains not printable characters */
                final /* synthetic */ int f12358;

                RunnableC0175b(int i5) {
                    this.f12358 = i5;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (h.this.isCancelled() || h.this.isDone()) {
                        return;
                    }
                    b bVar = b.this;
                    r.this.f12301.mo9030(this.f12358, bVar.f12354);
                }
            }

            b(long j5) {
                this.f12354 = j5;
            }

            @Override // k2.v.a
            /* renamed from: ʻ */
            public void mo9514(int i5) {
                if (r.this.f12286.mo12694() != null) {
                    h.this.f12344.m10511("context has died, cancelling");
                    h.this.m9907();
                    return;
                }
                int i6 = (int) ((i5 / this.f12354) * 100.0f);
                r rVar = r.this;
                if ((rVar.f12298 != null || rVar.f12299 != null) && i6 != this.f12353) {
                    k2.k.m9449(l.f12189, new a(i6));
                }
                this.f12353 = i6;
                y yVar = r.this.f12300;
                if (yVar != null) {
                    yVar.mo9030(i5, this.f12354);
                }
                if (r.this.f12301 != null) {
                    k2.k.m9449(l.f12189, new RunnableC0175b(i5));
                }
            }
        }

        public h(Runnable runnable) {
            this.f12347 = runnable;
            r.this.f12285.m12715(this, r.this.f12286.getContext());
            ArrayList<WeakReference<Object>> arrayList = r.this.f12308;
            if (arrayList == null) {
                return;
            }
            Iterator<WeakReference<Object>> it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj = it.next().get();
                if (obj != null) {
                    r.this.f12285.m12715(this, obj);
                }
            }
        }

        @Override // d3.b
        /* renamed from: ˊ */
        public m2.f<a0<T>> mo8255() {
            m2.t tVar = new m2.t();
            mo9865(new a(tVar));
            tVar.mo9858(this);
            return tVar;
        }

        @Override // m2.k
        /* renamed from: ˋ */
        protected void mo9466() {
            super.mo9466();
            k2.s sVar = this.f12349;
            if (sVar != null) {
                sVar.close();
            }
            Runnable runnable = this.f12347;
            if (runnable != null) {
                runnable.run();
            }
        }

        /* renamed from: ٴٴ, reason: contains not printable characters */
        public a0<T> m12809(Exception exc, T t5) {
            return new a0<>(this.f12345, this.f12346, this.f12348, exc, t5);
        }

        @Override // m2.x
        /* renamed from: ⁱⁱ */
        protected void mo9911(Exception exc) {
            r.this.m12777(this, exc, null);
        }

        /* renamed from: ﹶﹶ */
        protected void mo9912(x.a aVar) throws Exception {
            k2.v vVar;
            this.f12349 = aVar.m12812();
            this.f12346 = aVar.m12815();
            this.f12348 = aVar.m12813();
            this.f12345 = aVar.m12814();
            r.this.getClass();
            long m12816 = aVar.m12816();
            k2.s sVar = this.f12349;
            if (sVar instanceof k2.v) {
                vVar = (k2.v) sVar;
            } else {
                vVar = new k2.x();
                vVar.mo9512(this.f12349);
            }
            this.f12349 = vVar;
            vVar.mo9513(new b(m12816));
        }
    }

    /* compiled from: IonRequestBuilder.java */
    interface i {
        /* renamed from: ʻ */
        boolean mo12686(n2.e eVar);
    }

    public r(n nVar, l lVar) {
        String mo12694 = nVar.mo12694();
        if (mo12694 != null) {
            Log.w("Ion", "Building request with dead context: " + mo12694);
        }
        this.f12285 = lVar;
        this.f12286 = nVar;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private r m12775(String str, String str2) {
        this.f12288 = str;
        if (!TextUtils.isEmpty(str2) && str2.startsWith("/")) {
            str2 = new File(str2).toURI().toString();
        }
        this.f12289 = str2;
        return this;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private n2.e m12776(Uri uri) {
        n2.e mo8594 = this.f12285.m12718().m12727().mo8594(uri, this.f12288, this.f12291);
        mo8594.m10517(this.f12296);
        mo8594.m10516(this.f12295);
        l lVar = this.f12285;
        mo8594.m10518(lVar.f12203, lVar.f12204);
        String str = this.f12306;
        if (str != null) {
            mo8594.m10518(str, this.f12307);
        }
        mo8594.m10499(this.f12309, this.f12310);
        mo8594.m10519(this.f12294);
        mo8594.m10511("preparing request");
        return mo8594;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʿʿ, reason: contains not printable characters */
    public <T> void m12777(h<T> hVar, Exception exc, T t5) {
        a aVar = new a(hVar, exc, t5);
        Handler handler = this.f12287;
        if (handler == null) {
            this.f12285.f12191.m10465().m9462(aVar);
        } else {
            k2.k.m9449(handler, aVar);
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private <T> r m12778(o2.a<T> aVar) {
        if (!this.f12290) {
            this.f12288 = "POST";
        }
        this.f12295 = aVar;
        return this;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private Uri m12779() {
        Uri uri;
        try {
            if (this.f12293 != null) {
                Uri.Builder buildUpon = Uri.parse(this.f12289).buildUpon();
                for (String str : this.f12293.keySet()) {
                    Iterator<String> it = this.f12293.get(str).iterator();
                    while (it.hasNext()) {
                        buildUpon = buildUpon.appendQueryParameter(str, it.next());
                    }
                }
                uri = buildUpon.build();
            } else {
                uri = Uri.parse(this.f12289);
            }
        } catch (Exception unused) {
            uri = null;
        }
        if (uri == null || uri.getScheme() == null) {
            return null;
        }
        return uri;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private n2.s m12781() {
        if (this.f12291 == null) {
            n2.s sVar = new n2.s();
            this.f12291 = sVar;
            String str = this.f12289;
            n2.e.m10498(sVar, str == null ? null : Uri.parse(str));
        }
        return this.f12291;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private <T> void m12782(h<T> hVar) {
        Uri m12779 = m12779();
        if (m12779 == null) {
            hVar.m9905(new Exception("Invalid URI"));
            return;
        }
        n2.e m12776 = m12776(m12779);
        hVar.f12344 = m12776;
        m12783(hVar, m12776);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private <T> void m12783(h<T> hVar, n2.e eVar) {
        o2.a aVar = this.f12295;
        if (aVar != null && (this.f12304 != null || this.f12312 != null || this.f12311 != null || this.f12302 != null)) {
            eVar.m10516(new z(aVar, new b(hVar)));
        }
        m12787(eVar, hVar);
    }

    @Override // a3.g
    /* renamed from: ʻʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo188(String str, String str2) {
        this.f12290 = true;
        return m12775(str, str2);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    <T> void m12785(n2.e eVar, h<T> hVar) {
        Iterator<x> it = this.f12285.f12206.iterator();
        while (it.hasNext()) {
            x next = it.next();
            m2.f<k2.s> mo8591 = next.mo8591(this.f12285, eVar, hVar);
            if (mo8591 != null) {
                eVar.m10513("Using loader: " + next);
                hVar.mo9858(mo8591);
                return;
            }
        }
        hVar.m9905(new Exception("Unknown uri scheme"));
    }

    @Override // a3.e
    /* renamed from: ʾ */
    public <F extends OutputStream> d3.b<F> mo183(F f5) {
        return m12802(new u2.d(this.f12285.m12723(), f5), true, f5);
    }

    @Override // a3.f
    /* renamed from: ʿ */
    public d3.a mo186(ImageView imageView) {
        return new p(this).m12773(imageView).mo186(imageView);
    }

    @Override // a3.e
    /* renamed from: ˆ */
    public d3.b<InputStream> mo184() {
        return m12798(new k());
    }

    @Override // a3.j
    /* renamed from: ˆˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo193(y yVar) {
        this.f12300 = yVar;
        return this;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    <T> void m12787(n2.e eVar, h<T> hVar) {
        m12788(eVar).mo9865(new d(hVar));
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    m2.f<n2.e> m12788(n2.e eVar) {
        m2.t tVar = new m2.t();
        new c(eVar, tVar).run();
        return tVar;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    <T> m2.f<n2.e> m12789(n2.e eVar) {
        Iterator<x> it = this.f12285.f12206.iterator();
        while (it.hasNext()) {
            m2.f<n2.e> mo8602 = it.next().mo8602(this.f12286.getContext(), this.f12285, eVar);
            if (mo8602 != null) {
                return mo8602;
            }
        }
        return null;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public r m12790(Handler handler) {
        this.f12287 = handler;
        return this;
    }

    @Override // a3.k
    /* renamed from: ˏˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo198(String str, String str2) {
        if (this.f12303 == null) {
            n2.w wVar = new n2.w();
            this.f12303 = wVar;
            m12778(new o2.h(wVar));
        }
        if (str2 != null) {
            this.f12303.m10574(str, str2);
        }
        return this;
    }

    @Override // a3.j
    /* renamed from: ˑˑ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo197(String str, String str2) {
        if (str2 == null) {
            m12781().m10556(str);
        } else {
            m12781().m10557(str, str2);
        }
        return this;
    }

    @Override // a3.e
    /* renamed from: י */
    public d3.b<String> mo185() {
        return m12798(new t2.d());
    }

    @Override // a3.i
    /* renamed from: יי, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo191(String str, String str2, File file) {
        if (this.f12305 == null) {
            o2.c cVar = new o2.c();
            this.f12305 = cVar;
            m12778(cVar);
        }
        o2.b bVar = new o2.b(str, file);
        if (str2 == null) {
            str2 = s2.a.m11712(file.getAbsolutePath());
        }
        if (str2 != null) {
            bVar.m10986(str2);
        }
        this.f12305.m10979(bVar);
        return this;
    }

    @Override // a3.b
    /* renamed from: ᐧ */
    public m2.f<Bitmap> mo181() {
        return new p(this).mo181();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    <T> void m12794(n2.e eVar, h<T> hVar) {
        i iVar = this.f12297;
        if (iVar == null || iVar.mo12686(eVar)) {
            m12785(eVar, hVar);
        }
    }

    @Override // a3.g
    /* renamed from: ᴵᴵ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo187(String str) {
        return m12775("GET", str);
    }

    @Override // a3.j
    /* renamed from: ᵎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo194(String str, String str2) {
        if (str2 == null) {
            return this;
        }
        if (this.f12293 == null) {
            this.f12293 = new n2.w();
        }
        this.f12293.m10574(str, str2);
        return this;
    }

    @Override // a3.i
    /* renamed from: ᵎᵎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo190(String str, String str2) {
        if (this.f12305 == null) {
            o2.c cVar = new o2.c();
            this.f12305 = cVar;
            m12778(cVar);
        }
        if (str2 != null) {
            this.f12305.m10981(str, str2);
        }
        return this;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    <T> d3.b<T> m12798(t2.a<T> aVar) {
        return m12800(aVar, null);
    }

    @Override // a3.i
    /* renamed from: ᵔᵔ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo192(String str, File file) {
        return mo191(str, null, file);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    <T> d3.b<T> m12800(t2.a<T> aVar, Runnable runnable) {
        n2.e eVar;
        String mo12045 = aVar.mo12045();
        if (!TextUtils.isEmpty(mo12045) && m12781().m10554("Accept") == "*/*") {
            mo197("Accept", mo12045);
        }
        Uri m12779 = m12779();
        if (m12779 != null) {
            eVar = m12776(m12779);
            Type type = aVar.getType();
            Iterator<x> it = this.f12285.f12206.iterator();
            while (it.hasNext()) {
                d3.b<T> mo8603 = it.next().mo8603(this.f12285, eVar, type);
                if (mo8603 != null) {
                    return mo8603;
                }
            }
        } else {
            eVar = null;
        }
        f fVar = new f(runnable, aVar);
        if (m12779 == null) {
            fVar.m9905(new Exception("Invalid URI"));
            return fVar;
        }
        fVar.f12344 = eVar;
        m12782(fVar);
        return fVar;
    }

    @Override // a3.j
    /* renamed from: ᵢᵢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public r mo195(String str) {
        return m12778(new o2.f(str));
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    <T> h<T> m12802(k2.u uVar, boolean z5, T t5) {
        return m12804(uVar, z5, t5, null);
    }

    @Override // a3.j
    /* renamed from: ⁱⁱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public a3.c mo196(y yVar) {
        this.f12311 = yVar;
        return this;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    <T> h<T> m12804(k2.u uVar, boolean z5, T t5, Runnable runnable) {
        e eVar = new e(runnable, z5, uVar, t5);
        m12782(eVar);
        return eVar;
    }

    @Override // a3.e
    /* renamed from: ﹳﹳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public h<File> mo182(File file) {
        return m12804(new u2.b(this.f12285.m12723(), file), true, file, new g(file));
    }
}
