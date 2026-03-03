package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.f1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static q f4545 = new b();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static ThreadLocal<WeakReference<m.a<ViewGroup, ArrayList<q>>>> f4546 = new ThreadLocal<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    static ArrayList<ViewGroup> f4547 = new ArrayList<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m5393(ViewGroup viewGroup, q qVar) {
        if (f4547.contains(viewGroup) || !f1.m2808(viewGroup)) {
            return;
        }
        f4547.add(viewGroup);
        if (qVar == null) {
            qVar = f4545;
        }
        q mo5389clone = qVar.mo5389clone();
        m5396(viewGroup, mo5389clone);
        o.m5385(viewGroup, null);
        m5395(viewGroup, mo5389clone);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static m.a<ViewGroup, ArrayList<q>> m5394() {
        m.a<ViewGroup, ArrayList<q>> aVar;
        WeakReference<m.a<ViewGroup, ArrayList<q>>> weakReference = f4546.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        m.a<ViewGroup, ArrayList<q>> aVar2 = new m.a<>();
        f4546.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m5395(ViewGroup viewGroup, q qVar) {
        if (qVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(qVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m5396(ViewGroup viewGroup, q qVar) {
        ArrayList<q> arrayList = m5394().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<q> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (qVar != null) {
            qVar.captureValues(viewGroup, true);
        }
        o m5384 = o.m5384(viewGroup);
        if (m5384 != null) {
            m5384.m5386();
        }
    }

    /* compiled from: TransitionManager.java */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        q f4548;

        /* renamed from: ʿ, reason: contains not printable characters */
        ViewGroup f4549;

        /* compiled from: TransitionManager.java */
        /* renamed from: androidx.transition.s$a$a, reason: collision with other inner class name */
        class C0066a extends r {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ m.a f4550;

            C0066a(m.a aVar) {
                this.f4550 = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.transition.q.g
            /* renamed from: ʿ */
            public void mo5337(q qVar) {
                ((ArrayList) this.f4550.get(a.this.f4549)).remove(qVar);
                qVar.removeListener(this);
            }
        }

        a(q qVar, ViewGroup viewGroup) {
            this.f4548 = qVar;
            this.f4549 = viewGroup;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m5397() {
            this.f4549.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4549.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m5397();
            if (!s.f4547.remove(this.f4549)) {
                return true;
            }
            m.a<ViewGroup, ArrayList<q>> m5394 = s.m5394();
            ArrayList<q> arrayList = m5394.get(this.f4549);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m5394.put(this.f4549, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f4548);
            this.f4548.addListener(new C0066a(m5394));
            this.f4548.captureValues(this.f4549, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).resume(this.f4549);
                }
            }
            this.f4548.playTransition(this.f4549);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m5397();
            s.f4547.remove(this.f4549);
            ArrayList<q> arrayList = s.m5394().get(this.f4549);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<q> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f4549);
                }
            }
            this.f4548.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
