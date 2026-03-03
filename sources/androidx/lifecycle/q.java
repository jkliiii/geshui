package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q extends l {

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final a f3859 = new a(null);

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f3860;

    /* renamed from: ʽ, reason: contains not printable characters */
    private j.a<o, b> f3861;

    /* renamed from: ʾ, reason: contains not printable characters */
    private l.b f3862;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final WeakReference<p> f3863;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f3864;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f3865;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f3866;

    /* renamed from: ˊ, reason: contains not printable characters */
    private ArrayList<l.b> f3867;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final o4.a<l.b> f3868;

    /* compiled from: LifecycleRegistry.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final l.b m4488(l.b bVar, l.b bVar2) {
            f4.k.m8623(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* compiled from: LifecycleRegistry.kt */
    public static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private l.b f3869;

        /* renamed from: ʼ, reason: contains not printable characters */
        private n f3870;

        public b(o oVar, l.b bVar) {
            f4.k.m8623(bVar, "initialState");
            f4.k.m8620(oVar);
            this.f3870 = s.m4501(oVar);
            this.f3869 = bVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final void m4489(p pVar, l.a aVar) {
            f4.k.m8623(aVar, "event");
            l.b m4450 = aVar.m4450();
            this.f3869 = q.f3859.m4488(this.f3869, m4450);
            n nVar = this.f3870;
            f4.k.m8620(pVar);
            nVar.mo389(pVar, aVar);
            this.f3869 = m4450;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public final l.b m4490() {
            return this.f3869;
        }
    }

    private q(p pVar, boolean z5) {
        this.f3860 = z5;
        this.f3861 = new j.a<>();
        l.b bVar = l.b.INITIALIZED;
        this.f3862 = bVar;
        this.f3867 = new ArrayList<>();
        this.f3863 = new WeakReference<>(pVar);
        this.f3868 = o4.c.m11006(bVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private final void m4476(p pVar) {
        Iterator<Map.Entry<o, b>> descendingIterator = this.f3861.descendingIterator();
        f4.k.m8622(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f3866) {
            Map.Entry<o, b> next = descendingIterator.next();
            f4.k.m8622(next, "next()");
            o key = next.getKey();
            b value = next.getValue();
            while (value.m4490().compareTo(this.f3862) > 0 && !this.f3866 && this.f3861.contains(key)) {
                l.a m4451 = l.a.Companion.m4451(value.m4490());
                if (m4451 == null) {
                    throw new IllegalStateException("no event down from " + value.m4490());
                }
                m4483(m4451.m4450());
                value.m4489(pVar, m4451);
                m4482();
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private final l.b m4477(o oVar) {
        b value;
        Map.Entry<o, b> m9264 = this.f3861.m9264(oVar);
        l.b bVar = null;
        l.b m4490 = (m9264 == null || (value = m9264.getValue()) == null) ? null : value.m4490();
        if (!this.f3867.isEmpty()) {
            bVar = this.f3867.get(r0.size() - 1);
        }
        a aVar = f3859;
        return aVar.m4488(aVar.m4488(this.f3862, m4490), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: ˆ, reason: contains not printable characters */
    private final void m4478(String str) {
        if (!this.f3860 || i.c.m9104().mo9108()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private final void m4479(p pVar) {
        j.b<o, b>.d m9266 = this.f3861.m9266();
        f4.k.m8622(m9266, "observerMap.iteratorWithAdditions()");
        while (m9266.hasNext() && !this.f3866) {
            Map.Entry next = m9266.next();
            o oVar = (o) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.m4490().compareTo(this.f3862) < 0 && !this.f3866 && this.f3861.contains(oVar)) {
                m4483(bVar.m4490());
                l.a m4452 = l.a.Companion.m4452(bVar.m4490());
                if (m4452 == null) {
                    throw new IllegalStateException("no event up from " + bVar.m4490());
                }
                bVar.m4489(pVar, m4452);
                m4482();
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private final boolean m4480() {
        if (this.f3861.size() == 0) {
            return true;
        }
        Map.Entry<o, b> m9265 = this.f3861.m9265();
        f4.k.m8620(m9265);
        l.b m4490 = m9265.getValue().m4490();
        Map.Entry<o, b> m9267 = this.f3861.m9267();
        f4.k.m8620(m9267);
        l.b m44902 = m9267.getValue().m4490();
        return m4490 == m44902 && this.f3862 == m44902;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private final void m4481(l.b bVar) {
        l.b bVar2 = this.f3862;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == l.b.INITIALIZED && bVar == l.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f3862 + " in component " + this.f3863.get()).toString());
        }
        this.f3862 = bVar;
        if (this.f3865 || this.f3864 != 0) {
            this.f3866 = true;
            return;
        }
        this.f3865 = true;
        m4484();
        this.f3865 = false;
        if (this.f3862 == l.b.DESTROYED) {
            this.f3861 = new j.a<>();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private final void m4482() {
        this.f3867.remove(r0.size() - 1);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private final void m4483(l.b bVar) {
        this.f3867.add(bVar);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private final void m4484() {
        p pVar = this.f3863.get();
        if (pVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!m4480()) {
            this.f3866 = false;
            l.b bVar = this.f3862;
            Map.Entry<o, b> m9265 = this.f3861.m9265();
            f4.k.m8620(m9265);
            if (bVar.compareTo(m9265.getValue().m4490()) < 0) {
                m4476(pVar);
            }
            Map.Entry<o, b> m9267 = this.f3861.m9267();
            if (!this.f3866 && m9267 != null && this.f3862.compareTo(m9267.getValue().m4490()) > 0) {
                m4479(pVar);
            }
        }
        this.f3866 = false;
        this.f3868.setValue(mo4445());
    }

    @Override // androidx.lifecycle.l
    /* renamed from: ʻ */
    public void mo4444(o oVar) {
        p pVar;
        f4.k.m8623(oVar, "observer");
        m4478("addObserver");
        l.b bVar = this.f3862;
        l.b bVar2 = l.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = l.b.INITIALIZED;
        }
        b bVar3 = new b(oVar, bVar2);
        if (this.f3861.mo9262(oVar, bVar3) == null && (pVar = this.f3863.get()) != null) {
            boolean z5 = this.f3864 != 0 || this.f3865;
            l.b m4477 = m4477(oVar);
            this.f3864++;
            while (bVar3.m4490().compareTo(m4477) < 0 && this.f3861.contains(oVar)) {
                m4483(bVar3.m4490());
                l.a m4452 = l.a.Companion.m4452(bVar3.m4490());
                if (m4452 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m4490());
                }
                bVar3.m4489(pVar, m4452);
                m4482();
                m4477 = m4477(oVar);
            }
            if (!z5) {
                m4484();
            }
            this.f3864--;
        }
    }

    @Override // androidx.lifecycle.l
    /* renamed from: ʼ */
    public l.b mo4445() {
        return this.f3862;
    }

    @Override // androidx.lifecycle.l
    /* renamed from: ʽ */
    public void mo4446(o oVar) {
        f4.k.m8623(oVar, "observer");
        m4478("removeObserver");
        this.f3861.mo9263(oVar);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m4485(l.a aVar) {
        f4.k.m8623(aVar, "event");
        m4478("handleLifecycleEvent");
        m4481(aVar.m4450());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m4486(l.b bVar) {
        f4.k.m8623(bVar, "state");
        m4478("markState");
        m4487(bVar);
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m4487(l.b bVar) {
        f4.k.m8623(bVar, "state");
        m4478("setCurrentState");
        m4481(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q(p pVar) {
        this(pVar, true);
        f4.k.m8623(pVar, "provider");
    }
}
