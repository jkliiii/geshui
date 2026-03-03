package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.q;
import androidx.lifecycle.l;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: OnBackPressedDispatcher.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class q {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Runnable f259;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final androidx.core.util.a<Boolean> f260;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final w3.e<p> f261;

    /* renamed from: ʾ, reason: contains not printable characters */
    private p f262;

    /* renamed from: ʿ, reason: contains not printable characters */
    private OnBackInvokedCallback f263;

    /* renamed from: ˆ, reason: contains not printable characters */
    private OnBackInvokedDispatcher f264;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f265;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f266;

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class a extends f4.l implements e4.l<androidx.activity.b, v3.p> {
        a() {
            super(1);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m429(androidx.activity.b bVar) {
            f4.k.m8623(bVar, "backEvent");
            q.this.m422(bVar);
        }

        @Override // e4.l
        /* renamed from: ˉ, reason: contains not printable characters */
        public /* bridge */ /* synthetic */ v3.p mo430(androidx.activity.b bVar) {
            m429(bVar);
            return v3.p.f11735;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class b extends f4.l implements e4.l<androidx.activity.b, v3.p> {
        b() {
            super(1);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m431(androidx.activity.b bVar) {
            f4.k.m8623(bVar, "backEvent");
            q.this.m421(bVar);
        }

        @Override // e4.l
        /* renamed from: ˉ */
        public /* bridge */ /* synthetic */ v3.p mo430(androidx.activity.b bVar) {
            m431(bVar);
            return v3.p.f11735;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class c extends f4.l implements e4.a<v3.p> {
        c() {
            super(0);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m432() {
            q.this.m427();
        }

        @Override // e4.a
        /* renamed from: ʼ */
        public /* bridge */ /* synthetic */ v3.p mo368() {
            m432();
            return v3.p.f11735;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class d extends f4.l implements e4.a<v3.p> {
        d() {
            super(0);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m433() {
            q.this.m420();
        }

        @Override // e4.a
        /* renamed from: ʼ */
        public /* bridge */ /* synthetic */ v3.p mo368() {
            m433();
            return v3.p.f11735;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class e extends f4.l implements e4.a<v3.p> {
        e() {
            super(0);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m434() {
            q.this.m427();
        }

        @Override // e4.a
        /* renamed from: ʼ */
        public /* bridge */ /* synthetic */ v3.p mo368() {
            m434();
            return v3.p.f11735;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final f f272 = new f();

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public static final void m436(e4.a aVar) {
            f4.k.m8623(aVar, "$onBackInvoked");
            aVar.mo368();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final OnBackInvokedCallback m437(final e4.a<v3.p> aVar) {
            f4.k.m8623(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.r
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    q.f.m436(aVar);
                }
            };
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public final void m438(Object obj, int i5, Object obj2) {
            f4.k.m8623(obj, "dispatcher");
            f4.k.m8623(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i5, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public final void m439(Object obj, Object obj2) {
            f4.k.m8623(obj, "dispatcher");
            f4.k.m8623(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class g {

        /* renamed from: ʻ, reason: contains not printable characters */
        public static final g f273 = new g();

        /* compiled from: OnBackPressedDispatcher.kt */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ e4.l<androidx.activity.b, v3.p> f274;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ e4.l<androidx.activity.b, v3.p> f275;

            /* renamed from: ʽ, reason: contains not printable characters */
            final /* synthetic */ e4.a<v3.p> f276;

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ e4.a<v3.p> f277;

            /* JADX WARN: Multi-variable type inference failed */
            a(e4.l<? super androidx.activity.b, v3.p> lVar, e4.l<? super androidx.activity.b, v3.p> lVar2, e4.a<v3.p> aVar, e4.a<v3.p> aVar2) {
                this.f274 = lVar;
                this.f275 = lVar2;
                this.f276 = aVar;
                this.f277 = aVar2;
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackCancelled() {
                this.f277.mo368();
            }

            @Override // android.window.OnBackInvokedCallback
            public void onBackInvoked() {
                this.f276.mo368();
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackProgressed(BackEvent backEvent) {
                f4.k.m8623(backEvent, "backEvent");
                this.f275.mo430(new androidx.activity.b(backEvent));
            }

            @Override // android.window.OnBackAnimationCallback
            public void onBackStarted(BackEvent backEvent) {
                f4.k.m8623(backEvent, "backEvent");
                this.f274.mo430(new androidx.activity.b(backEvent));
            }
        }

        private g() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final OnBackInvokedCallback m440(e4.l<? super androidx.activity.b, v3.p> lVar, e4.l<? super androidx.activity.b, v3.p> lVar2, e4.a<v3.p> aVar, e4.a<v3.p> aVar2) {
            f4.k.m8623(lVar, "onBackStarted");
            f4.k.m8623(lVar2, "onBackProgressed");
            f4.k.m8623(aVar, "onBackInvoked");
            f4.k.m8623(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    private final class h implements androidx.lifecycle.n, androidx.activity.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.lifecycle.l f278;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final p f279;

        /* renamed from: ʽ, reason: contains not printable characters */
        private androidx.activity.c f280;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ q f281;

        public h(q qVar, androidx.lifecycle.l lVar, p pVar) {
            f4.k.m8623(lVar, "lifecycle");
            f4.k.m8623(pVar, "onBackPressedCallback");
            this.f281 = qVar;
            this.f278 = lVar;
            this.f279 = pVar;
            lVar.mo4444(this);
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f278.mo4446(this);
            this.f279.m410(this);
            androidx.activity.c cVar = this.f280;
            if (cVar != null) {
                cVar.cancel();
            }
            this.f280 = null;
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
            f4.k.m8623(pVar, "source");
            f4.k.m8623(aVar, "event");
            if (aVar == l.a.ON_START) {
                this.f280 = this.f281.m426(this.f279);
                return;
            }
            if (aVar != l.a.ON_STOP) {
                if (aVar == l.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.c cVar = this.f280;
                if (cVar != null) {
                    cVar.cancel();
                }
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    private final class i implements androidx.activity.c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final p f282;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ q f283;

        public i(q qVar, p pVar) {
            f4.k.m8623(pVar, "onBackPressedCallback");
            this.f283 = qVar;
            this.f282 = pVar;
        }

        @Override // androidx.activity.c
        public void cancel() {
            this.f283.f261.remove(this.f282);
            if (f4.k.m8619(this.f283.f262, this.f282)) {
                this.f282.m404();
                this.f283.f262 = null;
            }
            this.f282.m410(this);
            e4.a<v3.p> m403 = this.f282.m403();
            if (m403 != null) {
                m403.mo368();
            }
            this.f282.m412(null);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* synthetic */ class j extends f4.j implements e4.a<v3.p> {
        j(Object obj) {
            super(0, obj, q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // e4.a
        /* renamed from: ʼ */
        public /* bridge */ /* synthetic */ v3.p mo368() {
            m441();
            return v3.p.f11735;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final void m441() {
            ((q) this.f7779).m424();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    /* synthetic */ class k extends f4.j implements e4.a<v3.p> {
        k(Object obj) {
            super(0, obj, q.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // e4.a
        /* renamed from: ʼ */
        public /* bridge */ /* synthetic */ v3.p mo368() {
            m442();
            return v3.p.f11735;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final void m442() {
            ((q) this.f7779).m424();
        }
    }

    public q() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m420() {
        p pVar;
        w3.e<p> eVar = this.f261;
        ListIterator<p> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pVar = null;
                break;
            } else {
                pVar = listIterator.previous();
                if (pVar.m408()) {
                    break;
                }
            }
        }
        p pVar2 = pVar;
        this.f262 = null;
        if (pVar2 != null) {
            pVar2.m404();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m421(androidx.activity.b bVar) {
        p pVar;
        w3.e<p> eVar = this.f261;
        ListIterator<p> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pVar = null;
                break;
            } else {
                pVar = listIterator.previous();
                if (pVar.m408()) {
                    break;
                }
            }
        }
        p pVar2 = pVar;
        if (pVar2 != null) {
            pVar2.m406(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public final void m422(androidx.activity.b bVar) {
        p pVar;
        w3.e<p> eVar = this.f261;
        ListIterator<p> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pVar = null;
                break;
            } else {
                pVar = listIterator.previous();
                if (pVar.m408()) {
                    break;
                }
            }
        }
        p pVar2 = pVar;
        this.f262 = pVar2;
        if (pVar2 != null) {
            pVar2.m407(bVar);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private final void m423(boolean z5) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f264;
        OnBackInvokedCallback onBackInvokedCallback = this.f263;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z5 && !this.f265) {
            f.f272.m438(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f265 = true;
        } else {
            if (z5 || !this.f265) {
                return;
            }
            f.f272.m439(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f265 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴ, reason: contains not printable characters */
    public final void m424() {
        boolean z5 = this.f266;
        w3.e<p> eVar = this.f261;
        boolean z6 = false;
        if (!(eVar instanceof Collection) || !eVar.isEmpty()) {
            Iterator<p> it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (it.next().m408()) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f266 = z6;
        if (z6 != z5) {
            androidx.core.util.a<Boolean> aVar = this.f260;
            if (aVar != null) {
                aVar.accept(Boolean.valueOf(z6));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                m423(z6);
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m425(androidx.lifecycle.p pVar, p pVar2) {
        f4.k.m8623(pVar, "owner");
        f4.k.m8623(pVar2, "onBackPressedCallback");
        androidx.lifecycle.l lifecycle = pVar.getLifecycle();
        if (lifecycle.mo4445() == l.b.DESTROYED) {
            return;
        }
        pVar2.m402(new h(this, lifecycle, pVar2));
        m424();
        pVar2.m412(new j(this));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final androidx.activity.c m426(p pVar) {
        f4.k.m8623(pVar, "onBackPressedCallback");
        this.f261.add(pVar);
        i iVar = new i(this, pVar);
        pVar.m402(iVar);
        m424();
        pVar.m412(new k(this));
        return iVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m427() {
        p pVar;
        w3.e<p> eVar = this.f261;
        ListIterator<p> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                pVar = null;
                break;
            } else {
                pVar = listIterator.previous();
                if (pVar.m408()) {
                    break;
                }
            }
        }
        p pVar2 = pVar;
        this.f262 = null;
        if (pVar2 != null) {
            pVar2.mo405();
            return;
        }
        Runnable runnable = this.f259;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public final void m428(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        f4.k.m8623(onBackInvokedDispatcher, "invoker");
        this.f264 = onBackInvokedDispatcher;
        m423(this.f266);
    }

    public q(Runnable runnable, androidx.core.util.a<Boolean> aVar) {
        this.f259 = runnable;
        this.f260 = aVar;
        this.f261 = new w3.e<>();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 33) {
            this.f263 = i5 >= 34 ? g.f273.m440(new a(), new b(), new c(), new d()) : f.f272.m437(new e());
        }
    }

    public /* synthetic */ q(Runnable runnable, int i5, f4.g gVar) {
        this((i5 & 1) != 0 ? null : runnable);
    }

    public q(Runnable runnable) {
        this(runnable, null);
    }
}
