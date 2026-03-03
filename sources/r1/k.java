package r1;

import androidx.lifecycle.l;
import androidx.lifecycle.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: LifecycleLifecycle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class k implements j, androidx.lifecycle.o {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<l> f10773 = new HashSet();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final androidx.lifecycle.l f10774;

    k(androidx.lifecycle.l lVar) {
        this.f10774 = lVar;
        lVar.mo4444(this);
    }

    @x(l.a.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.p pVar) {
        Iterator it = y1.l.m12904(this.f10773).iterator();
        while (it.hasNext()) {
            ((l) it.next()).mo6093();
        }
        pVar.getLifecycle().mo4446(this);
    }

    @x(l.a.ON_START)
    public void onStart(androidx.lifecycle.p pVar) {
        Iterator it = y1.l.m12904(this.f10773).iterator();
        while (it.hasNext()) {
            ((l) it.next()).mo6091();
        }
    }

    @x(l.a.ON_STOP)
    public void onStop(androidx.lifecycle.p pVar) {
        Iterator it = y1.l.m12904(this.f10773).iterator();
        while (it.hasNext()) {
            ((l) it.next()).mo6092();
        }
    }

    @Override // r1.j
    /* renamed from: ʽ */
    public void mo11630(l lVar) {
        this.f10773.remove(lVar);
    }

    @Override // r1.j
    /* renamed from: ʾ */
    public void mo11631(l lVar) {
        this.f10773.add(lVar);
        if (this.f10774.mo4445() == l.b.DESTROYED) {
            lVar.mo6093();
        } else if (this.f10774.mo4445().m4455(l.b.STARTED)) {
            lVar.mo6091();
        } else {
            lVar.mo6092();
        }
    }
}
