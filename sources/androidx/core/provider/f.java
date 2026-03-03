package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.core.graphics.m0;
import androidx.core.provider.g;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: FontRequestWorker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final m.e<String, Typeface> f2766 = new m.e<>(16);

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final ExecutorService f2767 = h.m2489("fonts-androidx", 10, 10000);

    /* renamed from: ʽ, reason: contains not printable characters */
    static final Object f2768 = new Object();

    /* renamed from: ʾ, reason: contains not printable characters */
    static final m.g<String, ArrayList<androidx.core.util.a<e>>> f2769 = new m.g<>();

    /* compiled from: FontRequestWorker.java */
    class a implements Callable<e> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f2770;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ Context f2771;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.provider.e f2772;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f2773;

        a(String str, Context context, androidx.core.provider.e eVar, int i5) {
            this.f2770 = str;
            this.f2771 = context;
            this.f2772 = eVar;
            this.f2773 = i5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e call() {
            return f.m2469(this.f2770, this.f2771, this.f2772, this.f2773);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class b implements androidx.core.util.a<e> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.provider.a f2774;

        b(androidx.core.provider.a aVar) {
            this.f2774 = aVar;
        }

        @Override // androidx.core.util.a
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f2774.m2449(eVar);
        }
    }

    /* compiled from: FontRequestWorker.java */
    class c implements Callable<e> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f2775;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ Context f2776;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.provider.e f2777;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f2778;

        c(String str, Context context, androidx.core.provider.e eVar, int i5) {
            this.f2775 = str;
            this.f2776 = context;
            this.f2777 = eVar;
            this.f2778 = i5;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.m2469(this.f2775, this.f2776, this.f2777, this.f2778);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    /* compiled from: FontRequestWorker.java */
    class d implements androidx.core.util.a<e> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f2779;

        d(String str) {
            this.f2779 = str;
        }

        @Override // androidx.core.util.a
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f2768) {
                m.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f.f2769;
                ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(this.f2779);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f2779);
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    arrayList.get(i5).accept(eVar);
                }
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String m2467(androidx.core.provider.e eVar, int i5) {
        return eVar.m2463() + "-" + i5;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: ʼ, reason: contains not printable characters */
    private static int m2468(g.a aVar) {
        int i5 = 1;
        if (aVar.m2482() != 0) {
            return aVar.m2482() != 1 ? -3 : -2;
        }
        g.b[] m2481 = aVar.m2481();
        if (m2481 != null && m2481.length != 0) {
            i5 = 0;
            for (g.b bVar : m2481) {
                int m2484 = bVar.m2484();
                if (m2484 != 0) {
                    if (m2484 < 0) {
                        return -3;
                    }
                    return m2484;
                }
            }
        }
        return i5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static e m2469(String str, Context context, androidx.core.provider.e eVar, int i5) {
        m.e<String, Typeface> eVar2 = f2766;
        Typeface m9807 = eVar2.m9807(str);
        if (m9807 != null) {
            return new e(m9807);
        }
        try {
            g.a m2455 = androidx.core.provider.d.m2455(context, eVar, null);
            int m2468 = m2468(m2455);
            if (m2468 != 0) {
                return new e(m2468);
            }
            Typeface m2319 = m0.m2319(context, null, m2455.m2481(), i5);
            if (m2319 == null) {
                return new e(-3);
            }
            eVar2.m9808(str, m2319);
            return new e(m2319);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static Typeface m2470(Context context, androidx.core.provider.e eVar, int i5, Executor executor, androidx.core.provider.a aVar) {
        String m2467 = m2467(eVar, i5);
        Typeface m9807 = f2766.m9807(m2467);
        if (m9807 != null) {
            aVar.m2449(new e(m9807));
            return m9807;
        }
        b bVar = new b(aVar);
        synchronized (f2768) {
            m.g<String, ArrayList<androidx.core.util.a<e>>> gVar = f2769;
            ArrayList<androidx.core.util.a<e>> arrayList = gVar.get(m2467);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<androidx.core.util.a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(m2467, arrayList2);
            c cVar = new c(m2467, context, eVar, i5);
            if (executor == null) {
                executor = f2767;
            }
            h.m2490(executor, cVar, new d(m2467));
            return null;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static Typeface m2471(Context context, androidx.core.provider.e eVar, androidx.core.provider.a aVar, int i5, int i6) {
        String m2467 = m2467(eVar, i5);
        Typeface m9807 = f2766.m9807(m2467);
        if (m9807 != null) {
            aVar.m2449(new e(m9807));
            return m9807;
        }
        if (i6 == -1) {
            e m2469 = m2469(m2467, context, eVar, i5);
            aVar.m2449(m2469);
            return m2469.f2780;
        }
        try {
            e eVar2 = (e) h.m2491(f2767, new a(m2467, context, eVar, i5), i6);
            aVar.m2449(eVar2);
            return eVar2.f2780;
        } catch (InterruptedException unused) {
            aVar.m2449(new e(-3));
            return null;
        }
    }

    /* compiled from: FontRequestWorker.java */
    static final class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final Typeface f2780;

        /* renamed from: ʼ, reason: contains not printable characters */
        final int f2781;

        e(int i5) {
            this.f2780 = null;
            this.f2781 = i5;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: ʻ, reason: contains not printable characters */
        boolean m2476() {
            return this.f2781 == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f2780 = typeface;
            this.f2781 = 0;
        }
    }
}
