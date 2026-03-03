package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f1;
import androidx.core.view.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: FragmentTransition.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class w {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final int[] f3731 = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: ʼ, reason: contains not printable characters */
    static final d0 f3732;

    /* renamed from: ʽ, reason: contains not printable characters */
    static final d0 f3733;

    /* compiled from: FragmentTransition.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g f3734;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3735;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.os.g f3736;

        a(g gVar, androidx.fragment.app.e eVar, androidx.core.os.g gVar2) {
            this.f3734 = gVar;
            this.f3735 = eVar;
            this.f3736 = gVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3734.mo4260(this.f3735, this.f3736);
        }
    }

    /* compiled from: FragmentTransition.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3737;

        b(ArrayList arrayList) {
            this.f3737 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.m4362(this.f3737, 4);
        }
    }

    /* compiled from: FragmentTransition.java */
    class c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g f3738;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3739;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ androidx.core.os.g f3740;

        c(g gVar, androidx.fragment.app.e eVar, androidx.core.os.g gVar2) {
            this.f3738 = gVar;
            this.f3739 = eVar;
            this.f3740 = gVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3738.mo4260(this.f3739, this.f3740);
        }
    }

    /* compiled from: FragmentTransition.java */
    class d implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Object f3741;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ d0 f3742;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f3743;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3744;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3745;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3746;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3747;

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ Object f3748;

        d(Object obj, d0 d0Var, View view, androidx.fragment.app.e eVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3741 = obj;
            this.f3742 = d0Var;
            this.f3743 = view;
            this.f3744 = eVar;
            this.f3745 = arrayList;
            this.f3746 = arrayList2;
            this.f3747 = arrayList3;
            this.f3748 = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f3741;
            if (obj != null) {
                this.f3742.mo3995(obj, this.f3743);
                this.f3746.addAll(w.m4355(this.f3742, this.f3741, this.f3744, this.f3745, this.f3743));
            }
            if (this.f3747 != null) {
                if (this.f3748 != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f3743);
                    this.f3742.mo3996(this.f3748, this.f3747, arrayList);
                }
                this.f3747.clear();
                this.f3747.add(this.f3743);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    class e implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3749;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3750;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ boolean f3751;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ m.a f3752;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ View f3753;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ d0 f3754;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ Rect f3755;

        e(androidx.fragment.app.e eVar, androidx.fragment.app.e eVar2, boolean z5, m.a aVar, View view, d0 d0Var, Rect rect) {
            this.f3749 = eVar;
            this.f3750 = eVar2;
            this.f3751 = z5;
            this.f3752 = aVar;
            this.f3753 = view;
            this.f3754 = d0Var;
            this.f3755 = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.m4350(this.f3749, this.f3750, this.f3751, this.f3752, false);
            View view = this.f3753;
            if (view != null) {
                this.f3754.m4015(view, this.f3755);
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    class f implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d0 f3756;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ m.a f3757;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ Object f3758;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ h f3759;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3760;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ View f3761;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3762;

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3763;

        /* renamed from: ˏ, reason: contains not printable characters */
        final /* synthetic */ boolean f3764;

        /* renamed from: ˑ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f3765;

        /* renamed from: י, reason: contains not printable characters */
        final /* synthetic */ Object f3766;

        /* renamed from: ـ, reason: contains not printable characters */
        final /* synthetic */ Rect f3767;

        f(d0 d0Var, m.a aVar, Object obj, h hVar, ArrayList arrayList, View view, androidx.fragment.app.e eVar, androidx.fragment.app.e eVar2, boolean z5, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3756 = d0Var;
            this.f3757 = aVar;
            this.f3758 = obj;
            this.f3759 = hVar;
            this.f3760 = arrayList;
            this.f3761 = view;
            this.f3762 = eVar;
            this.f3763 = eVar2;
            this.f3764 = z5;
            this.f3765 = arrayList2;
            this.f3766 = obj2;
            this.f3767 = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.a<String, View> m4352 = w.m4352(this.f3756, this.f3757, this.f3758, this.f3759);
            if (m4352 != null) {
                this.f3760.addAll(m4352.values());
                this.f3760.add(this.f3761);
            }
            w.m4350(this.f3762, this.f3763, this.f3764, m4352, false);
            Object obj = this.f3758;
            if (obj != null) {
                this.f3756.mo3997(obj, this.f3765, this.f3760);
                View m4365 = w.m4365(m4352, this.f3759, this.f3766, this.f3764);
                if (m4365 != null) {
                    this.f3756.m4015(m4365, this.f3767);
                }
            }
        }
    }

    /* compiled from: FragmentTransition.java */
    interface g {
        /* renamed from: ʻ */
        void mo4260(androidx.fragment.app.e eVar, androidx.core.os.g gVar);

        /* renamed from: ʼ */
        void mo4261(androidx.fragment.app.e eVar, androidx.core.os.g gVar);
    }

    /* compiled from: FragmentTransition.java */
    static class h {

        /* renamed from: ʻ, reason: contains not printable characters */
        public androidx.fragment.app.e f3768;

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean f3769;

        /* renamed from: ʽ, reason: contains not printable characters */
        public androidx.fragment.app.a f3770;

        /* renamed from: ʾ, reason: contains not printable characters */
        public androidx.fragment.app.e f3771;

        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean f3772;

        /* renamed from: ˆ, reason: contains not printable characters */
        public androidx.fragment.app.a f3773;

        h() {
        }
    }

    static {
        f3732 = Build.VERSION.SDK_INT >= 21 ? new c0() : null;
        f3733 = m4369();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m4345(ArrayList<View> arrayList, m.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View m9834 = aVar.m9834(size);
            if (collection.contains(f1.m2879(m9834))) {
                arrayList.add(m9834);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0084  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m4346(androidx.fragment.app.a r8, androidx.fragment.app.v.a r9, android.util.SparseArray<androidx.fragment.app.w.h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.m4346(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m4347(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z5) {
        int size = aVar.f3706.size();
        for (int i5 = 0; i5 < size; i5++) {
            m4346(aVar, aVar.f3706.get(i5), sparseArray, false, z5);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static m.a<String, String> m4348(int i5, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i6, int i7) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        m.a<String, String> aVar = new m.a<>();
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i8);
            if (aVar2.m3962(i5)) {
                boolean booleanValue = arrayList2.get(i8).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3719;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3719;
                        arrayList4 = aVar2.f3720;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f3719;
                        arrayList3 = aVar2.f3720;
                        arrayList4 = arrayList6;
                    }
                    for (int i9 = 0; i9 < size; i9++) {
                        String str = arrayList4.get(i9);
                        String str2 = arrayList3.get(i9);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m4349(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z5) {
        if (aVar.f3391.m4179().mo4008()) {
            for (int size = aVar.f3706.size() - 1; size >= 0; size--) {
                m4346(aVar, aVar.f3706.get(size), sparseArray, true, z5);
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static void m4350(androidx.fragment.app.e eVar, androidx.fragment.app.e eVar2, boolean z5, m.a<String, View> aVar, boolean z6) {
        if (z5) {
            eVar2.getEnterTransitionCallback();
        } else {
            eVar.getEnterTransitionCallback();
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static boolean m4351(d0 d0Var, List<Object> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!d0Var.mo3991(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static m.a<String, View> m4352(d0 d0Var, m.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        androidx.fragment.app.e eVar = hVar.f3768;
        View view = eVar.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        m.a<String, View> aVar2 = new m.a<>();
        d0Var.m4014(aVar2, view);
        androidx.fragment.app.a aVar3 = hVar.f3770;
        if (hVar.f3769) {
            eVar.getExitTransitionCallback();
            arrayList = aVar3.f3719;
        } else {
            eVar.getEnterTransitionCallback();
            arrayList = aVar3.f3720;
        }
        if (arrayList != null) {
            aVar2.m9767(arrayList);
            aVar2.m9767(aVar.values());
        }
        m4370(aVar, aVar2);
        return aVar2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static m.a<String, View> m4353(d0 d0Var, m.a<String, String> aVar, Object obj, h hVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        androidx.fragment.app.e eVar = hVar.f3771;
        m.a<String, View> aVar2 = new m.a<>();
        d0Var.m4014(aVar2, eVar.requireView());
        androidx.fragment.app.a aVar3 = hVar.f3773;
        if (hVar.f3772) {
            eVar.getEnterTransitionCallback();
            arrayList = aVar3.f3720;
        } else {
            eVar.getExitTransitionCallback();
            arrayList = aVar3.f3719;
        }
        if (arrayList != null) {
            aVar2.m9767(arrayList);
        }
        aVar.m9767(aVar2.keySet());
        return aVar2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static d0 m4354(androidx.fragment.app.e eVar, androidx.fragment.app.e eVar2) {
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            Object exitTransition = eVar.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = eVar.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = eVar.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (eVar2 != null) {
            Object enterTransition = eVar2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = eVar2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = eVar2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        d0 d0Var = f3732;
        if (d0Var != null && m4351(d0Var, arrayList)) {
            return d0Var;
        }
        d0 d0Var2 = f3733;
        if (d0Var2 != null && m4351(d0Var2, arrayList)) {
            return d0Var2;
        }
        if (d0Var == null && d0Var2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static ArrayList<View> m4355(d0 d0Var, Object obj, androidx.fragment.app.e eVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = eVar.getView();
        if (view2 != null) {
            d0Var.m4013(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        d0Var.mo3989(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private static Object m4356(d0 d0Var, ViewGroup viewGroup, View view, m.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m4366;
        m.a<String, String> aVar2;
        Object obj3;
        Rect rect;
        androidx.fragment.app.e eVar = hVar.f3768;
        androidx.fragment.app.e eVar2 = hVar.f3771;
        if (eVar == null || eVar2 == null) {
            return null;
        }
        boolean z5 = hVar.f3769;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            m4366 = null;
        } else {
            m4366 = m4366(d0Var, eVar, eVar2, z5);
            aVar2 = aVar;
        }
        m.a<String, View> m4353 = m4353(d0Var, aVar2, m4366, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m4353.values());
            obj3 = m4366;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4350(eVar, eVar2, z5, m4353, true);
        if (obj3 != null) {
            rect = new Rect();
            d0Var.mo4004(obj3, view, arrayList);
            m4372(d0Var, obj3, obj2, m4353, hVar.f3772, hVar.f3773);
            if (obj != null) {
                d0Var.mo4001(obj, rect);
            }
        } else {
            rect = null;
        }
        x0.m3434(viewGroup, new f(d0Var, aVar, obj3, hVar, arrayList2, view, eVar, eVar2, z5, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static Object m4357(d0 d0Var, ViewGroup viewGroup, View view, m.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        androidx.fragment.app.e eVar = hVar.f3768;
        androidx.fragment.app.e eVar2 = hVar.f3771;
        if (eVar != null) {
            eVar.requireView().setVisibility(0);
        }
        if (eVar == null || eVar2 == null) {
            return null;
        }
        boolean z5 = hVar.f3769;
        Object m4366 = aVar.isEmpty() ? null : m4366(d0Var, eVar, eVar2, z5);
        m.a<String, View> m4353 = m4353(d0Var, aVar, m4366, hVar);
        m.a<String, View> m4352 = m4352(d0Var, aVar, m4366, hVar);
        if (aVar.isEmpty()) {
            if (m4353 != null) {
                m4353.clear();
            }
            if (m4352 != null) {
                m4352.clear();
            }
            obj3 = null;
        } else {
            m4345(arrayList, m4353, aVar.keySet());
            m4345(arrayList2, m4352, aVar.values());
            obj3 = m4366;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m4350(eVar, eVar2, z5, m4353, true);
        if (obj3 != null) {
            arrayList2.add(view);
            d0Var.mo4004(obj3, view, arrayList);
            m4372(d0Var, obj3, obj2, m4353, hVar.f3772, hVar.f3773);
            Rect rect2 = new Rect();
            View m4365 = m4365(m4352, hVar, obj, z5);
            if (m4365 != null) {
                d0Var.mo4001(obj, rect2);
            }
            rect = rect2;
            view2 = m4365;
        } else {
            view2 = null;
            rect = null;
        }
        x0.m3434(viewGroup, new e(eVar, eVar2, z5, m4352, view2, d0Var, rect));
        return obj3;
    }

    /* renamed from: י, reason: contains not printable characters */
    private static void m4358(ViewGroup viewGroup, h hVar, View view, m.a<String, String> aVar, g gVar) {
        Object obj;
        androidx.fragment.app.e eVar = hVar.f3768;
        androidx.fragment.app.e eVar2 = hVar.f3771;
        d0 m4354 = m4354(eVar2, eVar);
        if (m4354 == null) {
            return;
        }
        boolean z5 = hVar.f3769;
        boolean z6 = hVar.f3772;
        Object m4361 = m4361(m4354, eVar, z5);
        Object m4363 = m4363(m4354, eVar2, z6);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m4356 = m4356(m4354, viewGroup, view, aVar, hVar, arrayList, arrayList2, m4361, m4363);
        if (m4361 == null && m4356 == null) {
            obj = m4363;
            if (obj == null) {
                return;
            }
        } else {
            obj = m4363;
        }
        ArrayList<View> m4355 = m4355(m4354, obj, eVar2, arrayList, view);
        if (m4355 == null || m4355.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        m4354.mo3988(m4361, view);
        Object m4367 = m4367(m4354, m4361, obj2, m4356, eVar, hVar.f3769);
        if (eVar2 != null && m4355 != null && (m4355.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.g gVar2 = new androidx.core.os.g();
            gVar.mo4261(eVar2, gVar2);
            m4354.mo4003(eVar2, m4367, gVar2, new c(gVar, eVar2, gVar2));
        }
        if (m4367 != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m4354.mo4000(m4367, m4361, arrayList3, obj2, m4355, m4356, arrayList2);
            m4371(m4354, viewGroup, eVar, view, arrayList2, m4361, arrayList3, obj2, m4355);
            m4354.m4018(viewGroup, arrayList2, aVar);
            m4354.mo3990(viewGroup, m4367);
            m4354.m4017(viewGroup, arrayList2, aVar);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static void m4359(ViewGroup viewGroup, h hVar, View view, m.a<String, String> aVar, g gVar) {
        Object obj;
        androidx.fragment.app.e eVar = hVar.f3768;
        androidx.fragment.app.e eVar2 = hVar.f3771;
        d0 m4354 = m4354(eVar2, eVar);
        if (m4354 == null) {
            return;
        }
        boolean z5 = hVar.f3769;
        boolean z6 = hVar.f3772;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m4361 = m4361(m4354, eVar, z5);
        Object m4363 = m4363(m4354, eVar2, z6);
        Object m4357 = m4357(m4354, viewGroup, view, aVar, hVar, arrayList2, arrayList, m4361, m4363);
        if (m4361 == null && m4357 == null) {
            obj = m4363;
            if (obj == null) {
                return;
            }
        } else {
            obj = m4363;
        }
        ArrayList<View> m4355 = m4355(m4354, obj, eVar2, arrayList2, view);
        ArrayList<View> m43552 = m4355(m4354, m4361, eVar, arrayList, view);
        m4362(m43552, 4);
        Object m4367 = m4367(m4354, m4361, obj, m4357, eVar, z5);
        if (eVar2 != null && m4355 != null && (m4355.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.g gVar2 = new androidx.core.os.g();
            gVar.mo4261(eVar2, gVar2);
            m4354.mo4003(eVar2, m4367, gVar2, new a(gVar, eVar2, gVar2));
        }
        if (m4367 != null) {
            m4368(m4354, obj, eVar2, m4355);
            ArrayList<String> m4016 = m4354.m4016(arrayList);
            m4354.mo4000(m4367, m4361, m43552, obj, m4355, m4357, arrayList);
            m4354.mo3990(viewGroup, m4367);
            m4354.m4019(viewGroup, arrayList2, arrayList, m4016, aVar);
            m4362(m43552, 0);
            m4354.mo3997(m4357, arrayList2, arrayList);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private static h m4360(h hVar, SparseArray<h> sparseArray, int i5) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i5, hVar2);
        return hVar2;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static Object m4361(d0 d0Var, androidx.fragment.app.e eVar, boolean z5) {
        if (eVar == null) {
            return null;
        }
        return d0Var.mo3992(z5 ? eVar.getReenterTransition() : eVar.getEnterTransition());
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    static void m4362(ArrayList<View> arrayList, int i5) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i5);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static Object m4363(d0 d0Var, androidx.fragment.app.e eVar, boolean z5) {
        if (eVar == null) {
            return null;
        }
        return d0Var.mo3992(z5 ? eVar.getReturnTransition() : eVar.getExitTransition());
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    static void m4364(Context context, androidx.fragment.app.h hVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i5, int i6, boolean z5, g gVar) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i7 = i5; i7 < i6; i7++) {
            androidx.fragment.app.a aVar = arrayList.get(i7);
            if (arrayList2.get(i7).booleanValue()) {
                m4349(aVar, sparseArray, z5);
            } else {
                m4347(aVar, sparseArray, z5);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i8 = 0; i8 < size; i8++) {
                int keyAt = sparseArray.keyAt(i8);
                m.a<String, String> m4348 = m4348(keyAt, arrayList, arrayList2, i5, i6);
                h hVar2 = (h) sparseArray.valueAt(i8);
                if (hVar.mo4008() && (viewGroup = (ViewGroup) hVar.mo4007(keyAt)) != null) {
                    if (z5) {
                        m4359(viewGroup, hVar2, view, m4348, gVar);
                    } else {
                        m4358(viewGroup, hVar2, view, m4348, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    static View m4365(m.a<String, View> aVar, h hVar, Object obj, boolean z5) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f3770;
        if (obj == null || aVar == null || (arrayList = aVar2.f3719) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get(z5 ? aVar2.f3719.get(0) : aVar2.f3720.get(0));
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private static Object m4366(d0 d0Var, androidx.fragment.app.e eVar, androidx.fragment.app.e eVar2, boolean z5) {
        if (eVar == null || eVar2 == null) {
            return null;
        }
        return d0Var.mo3999(d0Var.mo3992(z5 ? eVar2.getSharedElementReturnTransition() : eVar.getSharedElementEnterTransition()));
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static Object m4367(d0 d0Var, Object obj, Object obj2, Object obj3, androidx.fragment.app.e eVar, boolean z5) {
        return (obj == null || obj2 == null || eVar == null) ? true : z5 ? eVar.getAllowReturnTransitionOverlap() : eVar.getAllowEnterTransitionOverlap() ? d0Var.mo3994(obj2, obj, obj3) : d0Var.mo3993(obj2, obj, obj3);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static void m4368(d0 d0Var, Object obj, androidx.fragment.app.e eVar, ArrayList<View> arrayList) {
        if (eVar != null && obj != null && eVar.mAdded && eVar.mHidden && eVar.mHiddenChanged) {
            eVar.setHideReplaced(true);
            d0Var.mo3998(obj, eVar.getView(), arrayList);
            x0.m3434(eVar.mContainer, new b(arrayList));
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static d0 m4369() {
        try {
            return (d0) androidx.transition.e.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    static void m4370(m.a<String, String> aVar, m.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m9834(size))) {
                aVar.mo9832(size);
            }
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private static void m4371(d0 d0Var, ViewGroup viewGroup, androidx.fragment.app.e eVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        x0.m3434(viewGroup, new d(obj, d0Var, view, eVar, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static void m4372(d0 d0Var, Object obj, Object obj2, m.a<String, View> aVar, boolean z5, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.f3719;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get(z5 ? aVar2.f3720.get(0) : aVar2.f3719.get(0));
        d0Var.mo4002(obj, view);
        if (obj2 != null) {
            d0Var.mo4002(obj2, view);
        }
    }
}
