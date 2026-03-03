package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.g;
import androidx.core.view.f1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: SpecialEffectsController.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class g0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ViewGroup f3557;

    /* renamed from: ʼ, reason: contains not printable characters */
    final ArrayList<e> f3558 = new ArrayList<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    final ArrayList<e> f3559 = new ArrayList<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f3560 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    boolean f3561 = false;

    /* compiled from: SpecialEffectsController.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d f3562;

        a(d dVar) {
            this.f3562 = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (g0.this.f3558.contains(this.f3562)) {
                this.f3562.m4078().m4087(this.f3562.m4079().mView);
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d f3564;

        b(d dVar) {
            this.f3564 = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g0.this.f3558.remove(this.f3564);
            g0.this.f3559.remove(this.f3564);
        }
    }

    /* compiled from: SpecialEffectsController.java */
    static /* synthetic */ class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f3566;

        /* renamed from: ʼ, reason: contains not printable characters */
        static final /* synthetic */ int[] f3567;

        static {
            int[] iArr = new int[e.b.values().length];
            f3567 = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3567[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3567[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f3566 = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3566[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3566[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3566[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: SpecialEffectsController.java */
    private static class d extends e {

        /* renamed from: ˉ, reason: contains not printable characters */
        private final t f3568;

        d(e.c cVar, e.b bVar, t tVar, androidx.core.os.g gVar) {
            super(cVar, bVar, tVar.m4302(), gVar);
            this.f3568 = tVar;
        }

        @Override // androidx.fragment.app.g0.e
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo4073() {
            super.mo4073();
            this.f3568.m4303();
        }

        @Override // androidx.fragment.app.g0.e
        /* renamed from: ˏ, reason: contains not printable characters */
        void mo4074() {
            if (m4080() == e.b.ADDING) {
                androidx.fragment.app.e m4302 = this.f3568.m4302();
                View findFocus = m4302.mView.findFocus();
                if (findFocus != null) {
                    m4302.setFocusedView(findFocus);
                    if (n.m4148(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m4302);
                    }
                }
                View requireView = m4079().requireView();
                if (requireView.getParent() == null) {
                    this.f3568.m4293();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m4302.getPostOnViewCreatedAlpha());
            }
        }
    }

    g0(ViewGroup viewGroup) {
        this.f3557 = viewGroup;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m4056(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f3558) {
            androidx.core.os.g gVar = new androidx.core.os.g();
            e m4057 = m4057(tVar.m4302());
            if (m4057 != null) {
                m4057.m4084(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, tVar, gVar);
            this.f3558.add(dVar);
            dVar.m4075(new a(dVar));
            dVar.m4075(new b(dVar));
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private e m4057(androidx.fragment.app.e eVar) {
        Iterator<e> it = this.f3558.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m4079().equals(eVar) && !next.m4081()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private e m4058(androidx.fragment.app.e eVar) {
        Iterator<e> it = this.f3559.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m4079().equals(eVar) && !next.m4081()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: י, reason: contains not printable characters */
    static g0 m4059(ViewGroup viewGroup, n nVar) {
        return m4060(viewGroup, nVar.m4188());
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static g0 m4060(ViewGroup viewGroup, h0 h0Var) {
        int i5 = g0.b.f7827;
        Object tag = viewGroup.getTag(i5);
        if (tag instanceof g0) {
            return (g0) tag;
        }
        g0 mo4089 = h0Var.mo4089(viewGroup);
        viewGroup.setTag(i5, mo4089);
        return mo4089;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m4061() {
        Iterator<e> it = this.f3558.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.m4080() == e.b.ADDING) {
                next.m4084(e.c.m4085(next.m4079().requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m4062(e.c cVar, t tVar) {
        if (n.m4148(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.m4302());
        }
        m4056(cVar, e.b.ADDING, tVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m4063(t tVar) {
        if (n.m4148(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.m4302());
        }
        m4056(e.c.GONE, e.b.NONE, tVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m4064(t tVar) {
        if (n.m4148(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.m4302());
        }
        m4056(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m4065(t tVar) {
        if (n.m4148(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.m4302());
        }
        m4056(e.c.VISIBLE, e.b.NONE, tVar);
    }

    /* renamed from: ˆ */
    abstract void mo3971(List<e> list, boolean z5);

    /* renamed from: ˈ, reason: contains not printable characters */
    void m4066() {
        if (this.f3561) {
            return;
        }
        if (!f1.m2903(this.f3557)) {
            m4067();
            this.f3560 = false;
            return;
        }
        synchronized (this.f3558) {
            if (!this.f3558.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f3559);
                this.f3559.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (n.m4148(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.m4076();
                    if (!eVar.m4082()) {
                        this.f3559.add(eVar);
                    }
                }
                m4061();
                ArrayList arrayList2 = new ArrayList(this.f3558);
                this.f3558.clear();
                this.f3559.addAll(arrayList2);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((e) it2.next()).mo4074();
                }
                mo3971(arrayList2, this.f3560);
                this.f3560 = false;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m4067() {
        String str;
        String str2;
        boolean m2903 = f1.m2903(this.f3557);
        synchronized (this.f3558) {
            m4061();
            Iterator<e> it = this.f3558.iterator();
            while (it.hasNext()) {
                it.next().mo4074();
            }
            Iterator it2 = new ArrayList(this.f3559).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                if (n.m4148(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m2903) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Container " + this.f3557 + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.m4076();
            }
            Iterator it3 = new ArrayList(this.f3558).iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (n.m4148(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m2903) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = "Container " + this.f3557 + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.m4076();
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m4068() {
        if (this.f3561) {
            this.f3561 = false;
            m4066();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    e.b m4069(t tVar) {
        e m4057 = m4057(tVar.m4302());
        e.b m4080 = m4057 != null ? m4057.m4080() : null;
        e m4058 = m4058(tVar.m4302());
        return (m4058 == null || !(m4080 == null || m4080 == e.b.NONE)) ? m4080 : m4058.m4080();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public ViewGroup m4070() {
        return this.f3557;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m4071() {
        synchronized (this.f3558) {
            m4061();
            this.f3561 = false;
            int size = this.f3558.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                e eVar = this.f3558.get(size);
                e.c m4086 = e.c.m4086(eVar.m4079().mView);
                e.c m4078 = eVar.m4078();
                e.c cVar = e.c.VISIBLE;
                if (m4078 == cVar && m4086 != cVar) {
                    this.f3561 = eVar.m4079().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m4072(boolean z5) {
        this.f3560 = z5;
    }

    /* compiled from: SpecialEffectsController.java */
    static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private c f3569;

        /* renamed from: ʼ, reason: contains not printable characters */
        private b f3570;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final androidx.fragment.app.e f3571;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final List<Runnable> f3572 = new ArrayList();

        /* renamed from: ʿ, reason: contains not printable characters */
        private final HashSet<androidx.core.os.g> f3573 = new HashSet<>();

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f3574 = false;

        /* renamed from: ˈ, reason: contains not printable characters */
        private boolean f3575 = false;

        /* compiled from: SpecialEffectsController.java */
        class a implements g.b {
            a() {
            }

            @Override // androidx.core.os.g.b
            public void onCancel() {
                e.this.m4076();
            }
        }

        /* compiled from: SpecialEffectsController.java */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: SpecialEffectsController.java */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: ʼ, reason: contains not printable characters */
            static c m4085(int i5) {
                if (i5 == 0) {
                    return VISIBLE;
                }
                if (i5 == 4) {
                    return INVISIBLE;
                }
                if (i5 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i5);
            }

            /* renamed from: ʽ, reason: contains not printable characters */
            static c m4086(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : m4085(view.getVisibility());
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            void m4087(View view) {
                int i5 = c.f3566[ordinal()];
                if (i5 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.m4148(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i5 == 2) {
                    if (n.m4148(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i5 == 3) {
                    if (n.m4148(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i5 != 4) {
                    return;
                }
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, androidx.fragment.app.e eVar, androidx.core.os.g gVar) {
            this.f3569 = cVar;
            this.f3570 = bVar;
            this.f3571 = eVar;
            gVar.m2414(new a());
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f3569 + "} {mLifecycleImpact = " + this.f3570 + "} {mFragment = " + this.f3571 + "}";
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        final void m4075(Runnable runnable) {
            this.f3572.add(runnable);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        final void m4076() {
            if (m4081()) {
                return;
            }
            this.f3574 = true;
            if (this.f3573.isEmpty()) {
                mo4073();
                return;
            }
            Iterator it = new ArrayList(this.f3573).iterator();
            while (it.hasNext()) {
                ((androidx.core.os.g) it.next()).m2412();
            }
        }

        /* renamed from: ʽ */
        public void mo4073() {
            if (this.f3575) {
                return;
            }
            if (n.m4148(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f3575 = true;
            Iterator<Runnable> it = this.f3572.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public final void m4077(androidx.core.os.g gVar) {
            if (this.f3573.remove(gVar) && this.f3573.isEmpty()) {
                mo4073();
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public c m4078() {
            return this.f3569;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public final androidx.fragment.app.e m4079() {
            return this.f3571;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        b m4080() {
            return this.f3570;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        final boolean m4081() {
            return this.f3574;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        final boolean m4082() {
            return this.f3575;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final void m4083(androidx.core.os.g gVar) {
            mo4074();
            this.f3573.add(gVar);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        final void m4084(c cVar, b bVar) {
            int i5 = c.f3567[bVar.ordinal()];
            if (i5 == 1) {
                if (this.f3569 == c.REMOVED) {
                    if (n.m4148(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3571 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f3570 + " to ADDING.");
                    }
                    this.f3569 = c.VISIBLE;
                    this.f3570 = b.ADDING;
                    return;
                }
                return;
            }
            if (i5 == 2) {
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3571 + " mFinalState = " + this.f3569 + " -> REMOVED. mLifecycleImpact  = " + this.f3570 + " to REMOVING.");
                }
                this.f3569 = c.REMOVED;
                this.f3570 = b.REMOVING;
                return;
            }
            if (i5 == 3 && this.f3569 != c.REMOVED) {
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f3571 + " mFinalState = " + this.f3569 + " -> " + cVar + ". ");
                }
                this.f3569 = cVar;
            }
        }

        /* renamed from: ˏ */
        void mo4074() {
        }
    }
}
