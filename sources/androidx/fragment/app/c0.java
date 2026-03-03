package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c0 extends d0 {

    /* compiled from: FragmentTransitionCompat21.java */
    class a extends Transition.EpicenterCallback {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Rect f3450;

        a(Rect rect) {
            this.f3450 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3450;
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    class e extends Transition.EpicenterCallback {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Rect f3464;

        e(Rect rect) {
            this.f3464 = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3464;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3464;
        }
    }

    c0() {
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static boolean m3987(Transition transition) {
        return (d0.m4012(transition.getTargetIds()) && d0.m4012(transition.getTargetNames()) && d0.m4012(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo3988(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo3989(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i5 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i5 < transitionCount) {
                mo3989(transitionSet.getTransitionAt(i5), arrayList);
                i5++;
            }
            return;
        }
        if (m3987(transition) || !d0.m4012(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i5 < size) {
            transition.addTarget(arrayList.get(i5));
            i5++;
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo3990(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean mo3991(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ˈ, reason: contains not printable characters */
    public Object mo3992(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ˑ, reason: contains not printable characters */
    public Object mo3993(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: י, reason: contains not printable characters */
    public Object mo3994(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ٴ, reason: contains not printable characters */
    public void mo3995(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᐧ, reason: contains not printable characters */
    public void mo3996(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i5 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i5 < transitionCount) {
                mo3996(transitionSet.getTransitionAt(i5), arrayList, arrayList2);
                i5++;
            }
            return;
        }
        if (m3987(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i5 < size) {
            transition.addTarget(arrayList2.get(i5));
            i5++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void mo3997(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo3996(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᴵ, reason: contains not printable characters */
    public void mo3998(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public Object mo3999(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᵔ, reason: contains not printable characters */
    public void mo4000(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᵢ, reason: contains not printable characters */
    public void mo4001(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(rect));
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ⁱ, reason: contains not printable characters */
    public void mo4002(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m4015(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void mo4003(androidx.fragment.app.e eVar, Object obj, androidx.core.os.g gVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(runnable));
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void mo4004(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            d0.m4009(targets, arrayList.get(i5));
        }
        targets.add(view);
        arrayList.add(view);
        mo3989(transitionSet, arrayList);
    }

    /* compiled from: FragmentTransitionCompat21.java */
    class b implements Transition.TransitionListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ View f3452;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3453;

        b(View view, ArrayList arrayList) {
            this.f3452 = view;
            this.f3453 = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3452.setVisibility(8);
            int size = this.f3453.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((View) this.f3453.get(i5)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    class c implements Transition.TransitionListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Object f3455;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3456;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ Object f3457;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3458;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Object f3459;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3460;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3455 = obj;
            this.f3456 = arrayList;
            this.f3457 = obj2;
            this.f3458 = arrayList2;
            this.f3459 = obj3;
            this.f3460 = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3455;
            if (obj != null) {
                c0.this.mo3996(obj, this.f3456, null);
            }
            Object obj2 = this.f3457;
            if (obj2 != null) {
                c0.this.mo3996(obj2, this.f3458, null);
            }
            Object obj3 = this.f3459;
            if (obj3 != null) {
                c0.this.mo3996(obj3, this.f3460, null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* compiled from: FragmentTransitionCompat21.java */
    class d implements Transition.TransitionListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Runnable f3462;

        d(Runnable runnable) {
            this.f3462 = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3462.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
