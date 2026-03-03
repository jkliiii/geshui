package x2;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Ion.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    static HashMap<String, l> f12185;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static Comparator<g> f12186;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    static ExecutorService f12188;

    /* renamed from: ʻ, reason: contains not printable characters */
    n2.a f12191;

    /* renamed from: ʼ, reason: contains not printable characters */
    b3.a f12192;

    /* renamed from: ʽ, reason: contains not printable characters */
    c3.a f12193;

    /* renamed from: ʾ, reason: contains not printable characters */
    p2.e f12194;

    /* renamed from: ʿ, reason: contains not printable characters */
    v2.d f12195;

    /* renamed from: ˆ, reason: contains not printable characters */
    f3.e f12196;

    /* renamed from: ˈ, reason: contains not printable characters */
    f3.c f12197;

    /* renamed from: ˉ, reason: contains not printable characters */
    f3.i f12198;

    /* renamed from: ˊ, reason: contains not printable characters */
    f3.a f12199;

    /* renamed from: ˋ, reason: contains not printable characters */
    f3.l f12200;

    /* renamed from: ˎ, reason: contains not printable characters */
    f3.h f12201;

    /* renamed from: ˏ, reason: contains not printable characters */
    f3.d f12202;

    /* renamed from: ˑ, reason: contains not printable characters */
    String f12203;

    /* renamed from: י, reason: contains not printable characters */
    int f12204;

    /* renamed from: ـ, reason: contains not printable characters */
    String f12205;

    /* renamed from: ᐧ, reason: contains not printable characters */
    String f12207;

    /* renamed from: ᵔ, reason: contains not printable characters */
    z2.d f12210;

    /* renamed from: ᵢ, reason: contains not printable characters */
    Context f12211;

    /* renamed from: ﾞ, reason: contains not printable characters */
    static final Handler f12189 = new Handler(Looper.getMainLooper());

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    static int f12190 = Runtime.getRuntime().availableProcessors();

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    static ExecutorService f12187 = Executors.newFixedThreadPool(4);

    /* renamed from: ٴ, reason: contains not printable characters */
    ArrayList<x> f12206 = new ArrayList<>();

    /* renamed from: ᴵ, reason: contains not printable characters */
    v2.f<m2.g<z2.b>> f12208 = new v2.f<>();

    /* renamed from: ᵎ, reason: contains not printable characters */
    c f12209 = new c();

    /* renamed from: ⁱ, reason: contains not printable characters */
    p f12212 = new p(this);

    /* renamed from: ﹳ, reason: contains not printable characters */
    private Runnable f12213 = new b();

    /* renamed from: ﹶ, reason: contains not printable characters */
    WeakHashMap<Object, d> f12214 = new WeakHashMap<>();

    /* compiled from: Ion.java */
    static class a implements Comparator<g> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(g gVar, g gVar2) {
            int i5 = gVar.f12175;
            int i6 = gVar2.f12175;
            if (i5 == i6) {
                return 0;
            }
            return i5 < i6 ? 1 : -1;
        }
    }

    /* compiled from: Ion.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x2.c.m12685(l.this)) {
                return;
            }
            Iterator<String> it = l.this.f12208.m12351().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                Object m12354 = l.this.f12208.m12354(it.next());
                if (m12354 instanceof g) {
                    g gVar = (g) m12354;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar);
                }
            }
            if (arrayList == null) {
                return;
            }
            Collections.sort(arrayList, l.f12186);
            Iterator it2 = arrayList.iterator();
            int i5 = 0;
            while (it2.hasNext()) {
                g gVar2 = (g) it2.next();
                l.this.f12208.m12355(gVar2.f12121, null);
                l.this.f12208.m12355(gVar2.f12174.f12143, null);
                gVar2.f12174.m12688();
                i5++;
                if (i5 > 5) {
                    return;
                }
            }
        }
    }

    /* compiled from: Ion.java */
    public class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        f3.b f12216 = new a();

        /* compiled from: Ion.java */
        class a implements f3.b {
            a() {
            }

            @Override // f3.b
            /* renamed from: ʻ */
            public n2.e mo8594(Uri uri, String str, n2.s sVar) {
                n2.e eVar = new n2.e(uri, str, sVar);
                if (!TextUtils.isEmpty(l.this.f12205)) {
                    eVar.m10502().m10557("User-Agent", l.this.f12205);
                }
                return eVar;
            }
        }

        public c() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public c m12726(x xVar) {
            l.this.f12206.add(xVar);
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public f3.b m12727() {
            return this.f12216;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public List<x> m12728() {
            return l.this.f12206;
        }
    }

    /* compiled from: Ion.java */
    static class d extends WeakHashMap<m2.f, Boolean> {
        d() {
        }
    }

    static {
        int i5 = f12190;
        f12188 = i5 > 2 ? Executors.newFixedThreadPool(i5 - 1) : Executors.newFixedThreadPool(1);
        f12185 = new HashMap<>();
        f12186 = new a();
    }

    private l(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        this.f12211 = applicationContext;
        this.f12207 = str;
        n2.a aVar = new n2.a(new k2.k("ion-" + str));
        this.f12191 = aVar;
        aVar.m10464().m10529(new y2.c());
        n2.a aVar2 = this.f12191;
        b3.a aVar3 = new b3.a(applicationContext, this.f12191.m10464());
        this.f12192 = aVar3;
        aVar2.m10467(aVar3);
        File file = new File(applicationContext.getCacheDir(), str);
        try {
            this.f12194 = p2.e.m11107(this.f12191, file, 10485760L);
        } catch (IOException e5) {
            q.m12774("unable to set up response cache, clearing", e5);
            v2.e.m12348(file);
            try {
                this.f12194 = p2.e.m11107(this.f12191, file, 10485760L);
            } catch (IOException unused) {
                q.m12774("unable to set up response cache, failing", e5);
            }
        }
        this.f12195 = new v2.d(new File(applicationContext.getFilesDir(), str), Long.MAX_VALUE, false);
        m12709();
        this.f12191.m10466().m10550(true);
        this.f12191.m10464().m10550(true);
        this.f12210 = new z2.d(this);
        c m12718 = m12718();
        f3.l lVar = new f3.l();
        this.f12200 = lVar;
        c m12726 = m12718.m12726(lVar);
        f3.h hVar = new f3.h();
        this.f12201 = hVar;
        c m127262 = m12726.m12726(hVar);
        f3.e eVar = new f3.e();
        this.f12196 = eVar;
        c m127263 = m127262.m12726(eVar);
        f3.c cVar = new f3.c();
        this.f12197 = cVar;
        c m127264 = m127263.m12726(cVar);
        f3.i iVar = new f3.i();
        this.f12198 = iVar;
        c m127265 = m127264.m12726(iVar);
        f3.a aVar4 = new f3.a();
        this.f12199 = aVar4;
        c m127266 = m127265.m12726(aVar4);
        f3.d dVar = new f3.d();
        this.f12202 = dVar;
        m127266.m12726(dVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m12709() {
        n2.a aVar = this.f12191;
        c3.a aVar2 = new c3.a(this);
        this.f12193 = aVar2;
        aVar.m10467(aVar2);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static ExecutorService m12710() {
        return f12188;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static l m12711(Context context) {
        return m12712(context, "ion");
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static l m12712(Context context, String str) {
        if (context == null) {
            throw new NullPointerException("Can not pass null context in to retrieve ion instance");
        }
        l lVar = f12185.get(str);
        if (lVar != null) {
            return lVar;
        }
        HashMap<String, l> hashMap = f12185;
        l lVar2 = new l(context, str);
        hashMap.put(str, lVar2);
        return lVar2;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static a3.d<? extends a3.d<?>> m12713(ImageView imageView) {
        return m12711(imageView.getContext()).m12716(imageView);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static a3.g<a3.c> m12714(Context context) {
        return m12711(context).m12717(context);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m12715(m2.f fVar, Object obj) {
        d dVar;
        if (obj == null || fVar == null || fVar.isDone() || fVar.isCancelled()) {
            return;
        }
        synchronized (this) {
            dVar = this.f12214.get(obj);
            if (dVar == null) {
                dVar = new d();
                this.f12214.put(obj, dVar);
            }
        }
        dVar.put(fVar, Boolean.TRUE);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public a3.d<? extends a3.d<?>> m12716(ImageView imageView) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("must be called from UI thread");
        }
        this.f12212.mo12738();
        p pVar = this.f12212;
        pVar.f12221 = this;
        return pVar.m12773(imageView);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public a3.g<a3.c> m12717(Context context) {
        return new r(e.m12693(context), this);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public c m12718() {
        return this.f12209;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public z2.d m12719() {
        return this.f12210;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public Context m12720() {
        return this.f12211;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public n2.a m12721() {
        return this.f12191;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public String m12722() {
        return this.f12207;
    }

    /* renamed from: י, reason: contains not printable characters */
    public k2.k m12723() {
        return this.f12191.m10465();
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m12724() {
        Handler handler = f12189;
        handler.removeCallbacks(this.f12213);
        handler.post(this.f12213);
    }
}
