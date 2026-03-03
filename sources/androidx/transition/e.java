package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FragmentTransitionSupport.java */
@SuppressLint({"RestrictedApi"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class e extends androidx.fragment.app.d0 {

    /* compiled from: FragmentTransitionSupport.java */
    class a extends q.f {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Rect f4486;

        a(Rect rect) {
            this.f4486 = rect;
        }

        @Override // androidx.transition.q.f
        /* renamed from: ʻ, reason: contains not printable characters */
        public Rect mo5347(q qVar) {
            return this.f4486;
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class c extends r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Object f4491;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4492;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ Object f4493;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4494;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ Object f4495;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4496;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4491 = obj;
            this.f4492 = arrayList;
            this.f4493 = obj2;
            this.f4494 = arrayList2;
            this.f4495 = obj3;
            this.f4496 = arrayList3;
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʻ */
        public void mo5348(q qVar) {
            Object obj = this.f4491;
            if (obj != null) {
                e.this.mo3996(obj, this.f4492, null);
            }
            Object obj2 = this.f4493;
            if (obj2 != null) {
                e.this.mo3996(obj2, this.f4494, null);
            }
            Object obj3 = this.f4495;
            if (obj3 != null) {
                e.this.mo3996(obj3, this.f4496, null);
            }
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            qVar.removeListener(this);
        }
    }

    /* compiled from: FragmentTransitionSupport.java */
    class d extends q.f {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Rect f4498;

        d(Rect rect) {
            this.f4498 = rect;
        }

        @Override // androidx.transition.q.f
        /* renamed from: ʻ */
        public Rect mo5347(q qVar) {
            Rect rect = this.f4498;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4498;
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private static boolean m5346(q qVar) {
        return (androidx.fragment.app.d0.m4012(qVar.getTargetIds()) && androidx.fragment.app.d0.m4012(qVar.getTargetNames()) && androidx.fragment.app.d0.m4012(qVar.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʻ */
    public void mo3988(Object obj, View view) {
        if (obj != null) {
            ((q) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʼ */
    public void mo3989(Object obj, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        if (qVar == null) {
            return;
        }
        int i5 = 0;
        if (qVar instanceof u) {
            u uVar = (u) qVar;
            int m5409 = uVar.m5409();
            while (i5 < m5409) {
                mo3989(uVar.m5408(i5), arrayList);
                i5++;
            }
            return;
        }
        if (m5346(qVar) || !androidx.fragment.app.d0.m4012(qVar.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i5 < size) {
            qVar.addTarget(arrayList.get(i5));
            i5++;
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʽ */
    public void mo3990(ViewGroup viewGroup, Object obj) {
        s.m5393(viewGroup, (q) obj);
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ʿ */
    public boolean mo3991(Object obj) {
        return obj instanceof q;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ˈ */
    public Object mo3992(Object obj) {
        if (obj != null) {
            return ((q) obj).mo5389clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ˑ */
    public Object mo3993(Object obj, Object obj2, Object obj3) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        q qVar3 = (q) obj3;
        if (qVar != null && qVar2 != null) {
            qVar = new u().m5407(qVar).m5407(qVar2).m5417(1);
        } else if (qVar == null) {
            qVar = qVar2 != null ? qVar2 : null;
        }
        if (qVar3 == null) {
            return qVar;
        }
        u uVar = new u();
        if (qVar != null) {
            uVar.m5407(qVar);
        }
        uVar.m5407(qVar3);
        return uVar;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: י */
    public Object mo3994(Object obj, Object obj2, Object obj3) {
        u uVar = new u();
        if (obj != null) {
            uVar.m5407((q) obj);
        }
        if (obj2 != null) {
            uVar.m5407((q) obj2);
        }
        if (obj3 != null) {
            uVar.m5407((q) obj3);
        }
        return uVar;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ٴ */
    public void mo3995(Object obj, View view) {
        if (obj != null) {
            ((q) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᐧ */
    public void mo3996(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        int i5 = 0;
        if (qVar instanceof u) {
            u uVar = (u) qVar;
            int m5409 = uVar.m5409();
            while (i5 < m5409) {
                mo3996(uVar.m5408(i5), arrayList, arrayList2);
                i5++;
            }
            return;
        }
        if (m5346(qVar)) {
            return;
        }
        List<View> targets = qVar.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i5 < size) {
                qVar.addTarget(arrayList2.get(i5));
                i5++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                qVar.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᐧᐧ */
    public void mo3997(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        u uVar = (u) obj;
        if (uVar != null) {
            uVar.getTargets().clear();
            uVar.getTargets().addAll(arrayList2);
            mo3996(uVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᴵ */
    public void mo3998(Object obj, View view, ArrayList<View> arrayList) {
        ((q) obj).addListener(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᴵᴵ */
    public Object mo3999(Object obj) {
        if (obj == null) {
            return null;
        }
        u uVar = new u();
        uVar.m5407((q) obj);
        return uVar;
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᵔ */
    public void mo4000(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((q) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ᵢ */
    public void mo4001(Object obj, Rect rect) {
        if (obj != null) {
            ((q) obj).setEpicenterCallback(new d(rect));
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ⁱ */
    public void mo4002(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m4015(view, rect);
            ((q) obj).setEpicenterCallback(new a(rect));
        }
    }

    @Override // androidx.fragment.app.d0
    /* renamed from: ﾞﾞ */
    public void mo4004(Object obj, View view, ArrayList<View> arrayList) {
        u uVar = (u) obj;
        List<View> targets = uVar.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.fragment.app.d0.m4009(targets, arrayList.get(i5));
        }
        targets.add(view);
        arrayList.add(view);
        mo3989(uVar, arrayList);
    }

    /* compiled from: FragmentTransitionSupport.java */
    class b implements q.g {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f4488;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4489;

        b(View view, ArrayList arrayList) {
            this.f4488 = view;
            this.f4489 = arrayList;
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            qVar.removeListener(this);
            this.f4488.setVisibility(8);
            int size = this.f4489.size();
            for (int i5 = 0; i5 < size; i5++) {
                ((View) this.f4489.get(i5)).setVisibility(0);
            }
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo5348(q qVar) {
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʼ */
        public void mo5334(q qVar) {
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʽ */
        public void mo5335(q qVar) {
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʾ */
        public void mo5336(q qVar) {
        }
    }
}
