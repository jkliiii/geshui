package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.g;
import androidx.core.view.e4;
import androidx.core.view.f1;
import androidx.core.view.x0;
import androidx.fragment.app.g;
import androidx.fragment.app.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c extends g0 {

    /* compiled from: DefaultSpecialEffectsController.java */
    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f3408;

        static {
            int[] iArr = new int[g0.e.c.values().length];
            f3408 = iArr;
            try {
                iArr[g0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3408[g0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3408[g0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3408[g0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ List f3409;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ g0.e f3410;

        b(List list, g0.e eVar) {
            this.f3409 = list;
            this.f3410 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3409.contains(this.f3410)) {
                this.f3409.remove(this.f3410);
                c.this.m3972(this.f3410);
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class C0045c extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f3412;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f3413;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ boolean f3414;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ g0.e f3415;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ k f3416;

        C0045c(ViewGroup viewGroup, View view, boolean z5, g0.e eVar, k kVar) {
            this.f3412 = viewGroup;
            this.f3413 = view;
            this.f3414 = z5;
            this.f3415 = eVar;
            this.f3416 = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3412.endViewTransition(this.f3413);
            if (this.f3414) {
                this.f3415.m4078().m4087(this.f3413);
            }
            this.f3416.m3977();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class d implements g.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Animator f3418;

        d(Animator animator) {
            this.f3418 = animator;
        }

        @Override // androidx.core.os.g.b
        public void onCancel() {
            this.f3418.end();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class f implements g.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ View f3425;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f3426;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ k f3427;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f3425 = view;
            this.f3426 = viewGroup;
            this.f3427 = kVar;
        }

        @Override // androidx.core.os.g.b
        public void onCancel() {
            this.f3425.clearAnimation();
            this.f3426.endViewTransition(this.f3425);
            this.f3427.m3977();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class g implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g0.e f3429;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ g0.e f3430;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ boolean f3431;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m.a f3432;

        g(g0.e eVar, g0.e eVar2, boolean z5, m.a aVar) {
            this.f3429 = eVar;
            this.f3430 = eVar2;
            this.f3431 = z5;
            this.f3432 = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.m4350(this.f3429.m4079(), this.f3430.m4079(), this.f3431, this.f3432, false);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class h implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d0 f3434;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f3435;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ Rect f3436;

        h(d0 d0Var, View view, Rect rect) {
            this.f3434 = d0Var;
            this.f3435 = view;
            this.f3436 = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3434.m4015(this.f3435, this.f3436);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class i implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3438;

        i(ArrayList arrayList) {
            this.f3438 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.m4362(this.f3438, 4);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class j implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ m f3440;

        j(m mVar) {
            this.f3440 = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3440.m3977();
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class k extends l {

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean f3442;

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f3443;

        /* renamed from: ʿ, reason: contains not printable characters */
        private g.d f3444;

        k(g0.e eVar, androidx.core.os.g gVar, boolean z5) {
            super(eVar, gVar);
            this.f3443 = false;
            this.f3442 = z5;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        g.d m3976(Context context) {
            if (this.f3443) {
                return this.f3444;
            }
            g.d m4054 = androidx.fragment.app.g.m4054(context, m3978().m4079(), m3978().m4078() == g0.e.c.VISIBLE, this.f3442);
            this.f3444 = m4054;
            this.f3443 = true;
            return m4054;
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class l {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final g0.e f3445;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final androidx.core.os.g f3446;

        l(g0.e eVar, androidx.core.os.g gVar) {
            this.f3445 = eVar;
            this.f3446 = gVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m3977() {
            this.f3445.m4077(this.f3446);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        g0.e m3978() {
            return this.f3445;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        androidx.core.os.g m3979() {
            return this.f3446;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean m3980() {
            g0.e.c cVar;
            g0.e.c m4086 = g0.e.c.m4086(this.f3445.m4079().mView);
            g0.e.c m4078 = this.f3445.m4078();
            return m4086 == m4078 || !(m4086 == (cVar = g0.e.c.VISIBLE) || m4078 == cVar);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    private static class m extends l {

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Object f3447;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final boolean f3448;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final Object f3449;

        m(g0.e eVar, androidx.core.os.g gVar, boolean z5, boolean z6) {
            super(eVar, gVar);
            if (eVar.m4078() == g0.e.c.VISIBLE) {
                this.f3447 = z5 ? eVar.m4079().getReenterTransition() : eVar.m4079().getEnterTransition();
                this.f3448 = z5 ? eVar.m4079().getAllowReturnTransitionOverlap() : eVar.m4079().getAllowEnterTransitionOverlap();
            } else {
                this.f3447 = z5 ? eVar.m4079().getReturnTransition() : eVar.m4079().getExitTransition();
                this.f3448 = true;
            }
            if (!z6) {
                this.f3449 = null;
            } else if (z5) {
                this.f3449 = eVar.m4079().getSharedElementReturnTransition();
            } else {
                this.f3449 = eVar.m4079().getSharedElementEnterTransition();
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private d0 m3981(Object obj) {
            if (obj == null) {
                return null;
            }
            d0 d0Var = w.f3732;
            if (d0Var != null && d0Var.mo3991(obj)) {
                return d0Var;
            }
            d0 d0Var2 = w.f3733;
            if (d0Var2 != null && d0Var2.mo3991(obj)) {
                return d0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m3978().m4079() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        d0 m3982() {
            d0 m3981 = m3981(this.f3447);
            d0 m39812 = m3981(this.f3449);
            if (m3981 == null || m39812 == null || m3981 == m39812) {
                return m3981 != null ? m3981 : m39812;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m3978().m4079() + " returned Transition " + this.f3447 + " which uses a different Transition  type than its shared element transition " + this.f3449);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public Object m3983() {
            return this.f3449;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        Object m3984() {
            return this.f3447;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public boolean m3985() {
            return this.f3449 != null;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean m3986() {
            return this.f3448;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m3969(List<k> list, List<g0.e> list2, boolean z5, Map<g0.e, Boolean> map) {
        ViewGroup m4070 = m4070();
        Context context = m4070.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z6 = false;
        for (k kVar : list) {
            if (kVar.m3980()) {
                kVar.m3977();
            } else {
                g.d m3976 = kVar.m3976(context);
                if (m3976 == null) {
                    kVar.m3977();
                } else {
                    Animator animator = m3976.f3551;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        g0.e m3978 = kVar.m3978();
                        androidx.fragment.app.e m4079 = m3978.m4079();
                        if (Boolean.TRUE.equals(map.get(m3978))) {
                            if (n.m4148(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m4079 + " as this Fragment was involved in a Transition.");
                            }
                            kVar.m3977();
                        } else {
                            boolean z7 = m3978.m4078() == g0.e.c.GONE;
                            if (z7) {
                                list2.remove(m3978);
                            }
                            View view = m4079.mView;
                            m4070.startViewTransition(view);
                            animator.addListener(new C0045c(m4070, view, z7, m3978, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m3979().m2414(new d(animator));
                            z6 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k kVar2 = (k) it.next();
            g0.e m39782 = kVar2.m3978();
            androidx.fragment.app.e m40792 = m39782.m4079();
            if (z5) {
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m40792 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.m3977();
            } else if (z6) {
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m40792 + " as Animations cannot run alongside Animators.");
                }
                kVar2.m3977();
            } else {
                View view2 = m40792.mView;
                Animation animation = (Animation) androidx.core.util.h.m2583(((g.d) androidx.core.util.h.m2583(kVar2.m3976(context))).f3550);
                if (m39782.m4078() != g0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m3977();
                } else {
                    m4070.startViewTransition(view2);
                    g.e eVar = new g.e(animation, m4070, view2);
                    eVar.setAnimationListener(new e(m4070, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m3979().m2414(new f(view2, m4070, kVar2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ﹶ, reason: contains not printable characters */
    private Map<g0.e, Boolean> m3970(List<m> list, List<g0.e> list2, boolean z5, g0.e eVar, g0.e eVar2) {
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        g0.e eVar3;
        g0.e eVar4;
        View view2;
        Object mo3994;
        m.a aVar;
        ArrayList<View> arrayList3;
        g0.e eVar5;
        ArrayList<View> arrayList4;
        Rect rect;
        View view3;
        d0 d0Var;
        g0.e eVar6;
        View view4;
        boolean z6 = z5;
        g0.e eVar7 = eVar;
        g0.e eVar8 = eVar2;
        HashMap hashMap = new HashMap();
        d0 d0Var2 = null;
        for (m mVar : list) {
            if (!mVar.m3980()) {
                d0 m3982 = mVar.m3982();
                if (d0Var2 == null) {
                    d0Var2 = m3982;
                } else if (m3982 != null && d0Var2 != m3982) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.m3978().m4079() + " returned Transition " + mVar.m3984() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (d0Var2 == null) {
            for (m mVar2 : list) {
                hashMap.put(mVar2.m3978(), Boolean.FALSE);
                mVar2.m3977();
            }
            return hashMap;
        }
        View view5 = new View(m4070().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList5 = new ArrayList<>();
        ArrayList<View> arrayList6 = new ArrayList<>();
        m.a aVar2 = new m.a();
        Object obj3 = null;
        View view6 = null;
        boolean z7 = false;
        for (m mVar3 : list) {
            if (!mVar3.m3985() || eVar7 == null || eVar8 == null) {
                aVar = aVar2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                d0Var = d0Var2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object mo3999 = d0Var2.mo3999(d0Var2.mo3992(mVar3.m3983()));
                ArrayList<String> sharedElementSourceNames = eVar2.m4079().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.m4079().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.m4079().getSharedElementTargetNames();
                View view7 = view6;
                int i5 = 0;
                while (i5 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i5));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i5));
                    }
                    i5++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.m4079().getSharedElementTargetNames();
                if (z6) {
                    eVar.m4079().getEnterTransitionCallback();
                    eVar2.m4079().getExitTransitionCallback();
                } else {
                    eVar.m4079().getExitTransitionCallback();
                    eVar2.m4079().getEnterTransitionCallback();
                }
                int i6 = 0;
                for (int size = sharedElementSourceNames.size(); i6 < size; size = size) {
                    aVar2.put(sharedElementSourceNames.get(i6), sharedElementTargetNames2.get(i6));
                    i6++;
                }
                m.a<String, View> aVar3 = new m.a<>();
                m3974(aVar3, eVar.m4079().mView);
                aVar3.m9767(sharedElementSourceNames);
                aVar2.m9767(aVar3.keySet());
                m.a<String, View> aVar4 = new m.a<>();
                m3974(aVar4, eVar2.m4079().mView);
                aVar4.m9767(sharedElementTargetNames2);
                aVar4.m9767(aVar2.values());
                w.m4370(aVar2, aVar4);
                m3975(aVar3, aVar2.keySet());
                m3975(aVar4, aVar2.values());
                if (aVar2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    aVar = aVar2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    d0Var = d0Var2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    w.m4350(eVar2.m4079(), eVar.m4079(), z6, aVar3, true);
                    aVar = aVar2;
                    ArrayList<View> arrayList8 = arrayList6;
                    x0.m3434(m4070(), new g(eVar2, eVar, z5, aVar4));
                    arrayList5.addAll(aVar3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view8 = (View) aVar3.get(sharedElementSourceNames.get(0));
                        d0Var2.mo4002(mo3999, view8);
                        view6 = view8;
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(aVar4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) aVar4.get(sharedElementTargetNames2.get(0))) != null) {
                        x0.m3434(m4070(), new h(d0Var2, view4, rect2));
                        z7 = true;
                    }
                    d0Var2.mo4004(mo3999, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    d0Var = d0Var2;
                    d0Var2.mo4000(mo3999, null, null, null, null, mo3999, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    hashMap.put(eVar5, bool);
                    eVar6 = eVar2;
                    hashMap.put(eVar6, bool);
                    obj3 = mo3999;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar2 = aVar;
            z6 = z5;
            arrayList6 = arrayList3;
            d0Var2 = d0Var;
        }
        View view9 = view6;
        m.a aVar5 = aVar2;
        ArrayList<View> arrayList9 = arrayList6;
        g0.e eVar9 = eVar7;
        ArrayList<View> arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view10 = view5;
        d0 d0Var3 = d0Var2;
        g0.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (m mVar4 : list) {
            if (mVar4.m3980()) {
                hashMap.put(mVar4.m3978(), Boolean.FALSE);
                mVar4.m3977();
            } else {
                Object mo3992 = d0Var3.mo3992(mVar4.m3984());
                g0.e m3978 = mVar4.m3978();
                boolean z8 = obj3 != null && (m3978 == eVar9 || m3978 == eVar10);
                if (mo3992 == null) {
                    if (!z8) {
                        hashMap.put(m3978, Boolean.FALSE);
                        mVar4.m3977();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view10;
                    mo3994 = obj4;
                    eVar3 = eVar10;
                    view2 = view9;
                } else {
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj6 = obj4;
                    m3973(arrayList12, m3978.m4079().mView);
                    if (z8) {
                        if (m3978 == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        d0Var3.mo3988(mo3992, view10);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view10;
                        eVar4 = m3978;
                        obj2 = obj5;
                        eVar3 = eVar10;
                        obj = obj6;
                    } else {
                        d0Var3.mo3989(mo3992, arrayList12);
                        view = view10;
                        obj = obj6;
                        arrayList = arrayList10;
                        obj2 = obj5;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        d0Var3.mo4000(mo3992, mo3992, arrayList12, null, null, null, null);
                        if (m3978.m4078() == g0.e.c.GONE) {
                            eVar4 = m3978;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(eVar4.m4079().mView);
                            d0Var3.mo3998(mo3992, eVar4.m4079().mView, arrayList13);
                            x0.m3434(m4070(), new i(arrayList12));
                        } else {
                            eVar4 = m3978;
                        }
                    }
                    if (eVar4.m4078() == g0.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z7) {
                            d0Var3.mo4001(mo3992, rect3);
                        }
                        view2 = view9;
                    } else {
                        view2 = view9;
                        d0Var3.mo4002(mo3992, view2);
                    }
                    hashMap.put(eVar4, Boolean.TRUE);
                    if (mVar4.m3986()) {
                        obj5 = d0Var3.mo3994(obj2, mo3992, null);
                        mo3994 = obj;
                    } else {
                        mo3994 = d0Var3.mo3994(obj, mo3992, null);
                        obj5 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = mo3994;
                view9 = view2;
                view10 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList<View> arrayList14 = arrayList9;
        ArrayList<View> arrayList15 = arrayList10;
        g0.e eVar11 = eVar10;
        Object mo3993 = d0Var3.mo3993(obj5, obj4, obj3);
        for (m mVar5 : list) {
            if (!mVar5.m3980()) {
                Object m3984 = mVar5.m3984();
                g0.e m39782 = mVar5.m3978();
                boolean z9 = obj3 != null && (m39782 == eVar9 || m39782 == eVar11);
                if (m3984 != null || z9) {
                    if (f1.m2808(m4070())) {
                        d0Var3.mo4003(mVar5.m3978().m4079(), mo3993, mVar5.m3979(), new j(mVar5));
                    } else {
                        if (n.m4148(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m4070() + " has not been laid out. Completing operation " + m39782);
                        }
                        mVar5.m3977();
                    }
                }
            }
        }
        if (!f1.m2808(m4070())) {
            return hashMap;
        }
        w.m4362(arrayList11, 4);
        ArrayList<String> m4016 = d0Var3.m4016(arrayList14);
        d0Var3.mo3990(m4070(), mo3993);
        d0Var3.m4019(m4070(), arrayList15, arrayList14, m4016, aVar5);
        w.m4362(arrayList11, 0);
        d0Var3.mo3997(obj3, arrayList15, arrayList14);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0085  */
    @Override // androidx.fragment.app.g0
    /* renamed from: ˆ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo3971(java.util.List<androidx.fragment.app.g0.e> r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.g0$e r1 = (androidx.fragment.app.g0.e) r1
            androidx.fragment.app.e r3 = r1.m4079()
            android.view.View r3 = r3.mView
            androidx.fragment.app.g0$e$c r3 = androidx.fragment.app.g0.e.c.m4086(r3)
            int[] r4 = androidx.fragment.app.c.a.f3408
            androidx.fragment.app.g0$e$c r5 = r1.m4078()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            androidx.fragment.app.g0$e$c r2 = androidx.fragment.app.g0.e.c.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.g0$e$c r2 = androidx.fragment.app.g0.e.c.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L95
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.g0$e r4 = (androidx.fragment.app.g0.e) r4
            androidx.core.os.g r5 = new androidx.core.os.g
            r5.<init>()
            r4.m4083(r5)
            androidx.fragment.app.c$k r8 = new androidx.fragment.app.c$k
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            androidx.core.os.g r5 = new androidx.core.os.g
            r5.<init>()
            r4.m4083(r5)
            androidx.fragment.app.c$m r8 = new androidx.fragment.app.c$m
            r9 = 0
            if (r12 == 0) goto L83
            if (r4 != r6) goto L86
            goto L85
        L83:
            if (r4 != r7) goto L86
        L85:
            r9 = 1
        L86:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            androidx.fragment.app.c$b r5 = new androidx.fragment.app.c$b
            r5.<init>(r1, r4)
            r4.m4075(r5)
            goto L57
        L95:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.m3970(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.m3969(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        La9:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lb9
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.g0$e r12 = (androidx.fragment.app.g0.e) r12
            r10.m3972(r12)
            goto La9
        Lb9:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.mo3971(java.util.List, boolean):void");
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m3972(g0.e eVar) {
        eVar.m4078().m4087(eVar.m4079().mView);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m3973(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (e4.m2798(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt.getVisibility() == 0) {
                m3973(arrayList, childAt);
            }
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m3974(Map<String, View> map, View view) {
        String m2879 = f1.m2879(view);
        if (m2879 != null) {
            map.put(m2879, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    m3974(map, childAt);
                }
            }
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m3975(m.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(f1.m2879(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* compiled from: DefaultSpecialEffectsController.java */
    class e implements Animation.AnimationListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f3420;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ View f3421;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ k f3422;

        /* compiled from: DefaultSpecialEffectsController.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f3420.endViewTransition(eVar.f3421);
                e.this.f3422.m3977();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f3420 = viewGroup;
            this.f3421 = view;
            this.f3422 = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f3420.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
