package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Runnable f3065;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<m0> f3066 = new CopyOnWriteArrayList<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Map<m0, a> f3067 = new HashMap();

    /* compiled from: MenuHostHelper.java */
    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final androidx.lifecycle.l f3068;

        /* renamed from: ʼ, reason: contains not printable characters */
        private androidx.lifecycle.n f3069;

        a(androidx.lifecycle.l lVar, androidx.lifecycle.n nVar) {
            this.f3068 = lVar;
            this.f3069 = nVar;
            lVar.mo4444(nVar);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m3433() {
            this.f3068.mo4446(this.f3069);
            this.f3069 = null;
        }
    }

    public x(Runnable runnable) {
        this.f3065 = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˆ, reason: contains not printable characters */
    public /* synthetic */ void m3423(m0 m0Var, androidx.lifecycle.p pVar, l.a aVar) {
        if (aVar == l.a.ON_DESTROY) {
            m3432(m0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public /* synthetic */ void m3424(l.b bVar, m0 m0Var, androidx.lifecycle.p pVar, l.a aVar) {
        if (aVar == l.a.m4449(bVar)) {
            m3425(m0Var);
            return;
        }
        if (aVar == l.a.ON_DESTROY) {
            m3432(m0Var);
        } else if (aVar == l.a.m4448(bVar)) {
            this.f3066.remove(m0Var);
            this.f3065.run();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m3425(m0 m0Var) {
        this.f3066.add(m0Var);
        this.f3065.run();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m3426(final m0 m0Var, androidx.lifecycle.p pVar) {
        m3425(m0Var);
        androidx.lifecycle.l lifecycle = pVar.getLifecycle();
        a remove = this.f3067.remove(m0Var);
        if (remove != null) {
            remove.m3433();
        }
        this.f3067.put(m0Var, new a(lifecycle, new androidx.lifecycle.n() { // from class: androidx.core.view.v
            @Override // androidx.lifecycle.n
            /* renamed from: ʿ */
            public final void mo389(androidx.lifecycle.p pVar2, l.a aVar) {
                this.f3030.m3423(m0Var, pVar2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: ʿ, reason: contains not printable characters */
    public void m3427(final m0 m0Var, androidx.lifecycle.p pVar, final l.b bVar) {
        androidx.lifecycle.l lifecycle = pVar.getLifecycle();
        a remove = this.f3067.remove(m0Var);
        if (remove != null) {
            remove.m3433();
        }
        this.f3067.put(m0Var, new a(lifecycle, new androidx.lifecycle.n() { // from class: androidx.core.view.w
            @Override // androidx.lifecycle.n
            /* renamed from: ʿ */
            public final void mo389(androidx.lifecycle.p pVar2, l.a aVar) {
                this.f3032.m3424(bVar, m0Var, pVar2, aVar);
            }
        }));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m3428(Menu menu, MenuInflater menuInflater) {
        Iterator<m0> it = this.f3066.iterator();
        while (it.hasNext()) {
            it.next().m3206(menu, menuInflater);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m3429(Menu menu) {
        Iterator<m0> it = this.f3066.iterator();
        while (it.hasNext()) {
            it.next().m3205(menu);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m3430(MenuItem menuItem) {
        Iterator<m0> it = this.f3066.iterator();
        while (it.hasNext()) {
            if (it.next().m3204(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m3431(Menu menu) {
        Iterator<m0> it = this.f3066.iterator();
        while (it.hasNext()) {
            it.next().m3207(menu);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m3432(m0 m0Var) {
        this.f3066.remove(m0Var);
        a remove = this.f3067.remove(m0Var);
        if (remove != null) {
            remove.m3433();
        }
        this.f3065.run();
    }
}
