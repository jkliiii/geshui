package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e;
import androidx.fragment.app.g;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.lifecycle.l;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import c.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: FragmentManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class n {

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private static boolean f3599 = false;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    static boolean f3600 = true;

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean f3603;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private boolean f3604;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private boolean f3606;

    /* renamed from: ʾ, reason: contains not printable characters */
    ArrayList<androidx.fragment.app.a> f3607;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private boolean f3608;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ArrayList<androidx.fragment.app.e> f3609;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private boolean f3610;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private ArrayList<androidx.fragment.app.a> f3612;

    /* renamed from: ˈ, reason: contains not printable characters */
    private androidx.activity.q f3613;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private ArrayList<androidx.fragment.app.e> f3614;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private ArrayList<Boolean> f3616;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private q f3618;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private ArrayList<p> f3620;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ArrayList<m> f3622;

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean f3627;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private c.c<c.f> f3630;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private androidx.fragment.app.k<?> f3631;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private c.c<String[]> f3632;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private androidx.fragment.app.h f3633;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private androidx.fragment.app.e f3634;

    /* renamed from: ᵢ, reason: contains not printable characters */
    androidx.fragment.app.e f3635;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private c.c<Intent> f3640;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ArrayList<InterfaceC0048n> f3601 = new ArrayList<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final u f3605 = new u();

    /* renamed from: ˆ, reason: contains not printable characters */
    private final androidx.fragment.app.l f3611 = new androidx.fragment.app.l(this);

    /* renamed from: ˉ, reason: contains not printable characters */
    private final androidx.activity.p f3615 = new c(false);

    /* renamed from: ˊ, reason: contains not printable characters */
    private final AtomicInteger f3617 = new AtomicInteger();

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Map<String, Bundle> f3619 = Collections.synchronizedMap(new HashMap());

    /* renamed from: ˎ, reason: contains not printable characters */
    private final Map<String, Object> f3621 = Collections.synchronizedMap(new HashMap());

    /* renamed from: ˑ, reason: contains not printable characters */
    private Map<androidx.fragment.app.e, HashSet<androidx.core.os.g>> f3624 = Collections.synchronizedMap(new HashMap());

    /* renamed from: י, reason: contains not printable characters */
    private final w.g f3625 = new d();

    /* renamed from: ـ, reason: contains not printable characters */
    private final androidx.fragment.app.m f3626 = new androidx.fragment.app.m(this);

    /* renamed from: ٴ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<r> f3628 = new CopyOnWriteArrayList<>();

    /* renamed from: ᐧ, reason: contains not printable characters */
    int f3629 = -1;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private androidx.fragment.app.j f3636 = null;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private androidx.fragment.app.j f3637 = new e();

    /* renamed from: ﹶ, reason: contains not printable characters */
    private h0 f3638 = null;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private h0 f3639 = new f();

    /* renamed from: ʻʻ, reason: contains not printable characters */
    ArrayDeque<l> f3602 = new ArrayDeque<>();

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private Runnable f3623 = new g();

    /* compiled from: FragmentManager.java */
    class a implements c.b<c.a> {
        a() {
        }

        @Override // c.b
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4257(c.a aVar) {
            l pollFirst = n.this.f3602.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.f3655;
            int i5 = pollFirst.f3656;
            androidx.fragment.app.e m4320 = n.this.f3605.m4320(str);
            if (m4320 != null) {
                m4320.onActivityResult(i5, aVar.m5722(), aVar.m5721());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    class b implements c.b<Map<String, Boolean>> {
        b() {
        }

        @Override // c.b
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4257(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                iArr[i5] = ((Boolean) arrayList.get(i5)).booleanValue() ? 0 : -1;
            }
            l pollFirst = n.this.f3602.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.f3655;
            int i6 = pollFirst.f3656;
            androidx.fragment.app.e m4320 = n.this.f3605.m4320(str);
            if (m4320 != null) {
                m4320.onRequestPermissionsResult(i6, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    class c extends androidx.activity.p {
        c(boolean z5) {
            super(z5);
        }

        @Override // androidx.activity.p
        /* renamed from: ʾ */
        public void mo405() {
            n.this.m4191();
        }
    }

    /* compiled from: FragmentManager.java */
    class d implements w.g {
        d() {
        }

        @Override // androidx.fragment.app.w.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo4260(androidx.fragment.app.e eVar, androidx.core.os.g gVar) {
            if (gVar.m2413()) {
                return;
            }
            n.this.m4215(eVar, gVar);
        }

        @Override // androidx.fragment.app.w.g
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo4261(androidx.fragment.app.e eVar, androidx.core.os.g gVar) {
            n.this.m4225(eVar, gVar);
        }
    }

    /* compiled from: FragmentManager.java */
    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        /* renamed from: ʻ */
        public androidx.fragment.app.e mo4117(ClassLoader classLoader, String str) {
            return n.this.m4183().m4088(n.this.m4183().m4119(), str, null);
        }
    }

    /* compiled from: FragmentManager.java */
    class f implements h0 {
        f() {
        }

        @Override // androidx.fragment.app.h0
        /* renamed from: ʻ */
        public g0 mo4089(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* compiled from: FragmentManager.java */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.m4172(true);
        }
    }

    /* compiled from: FragmentManager.java */
    class h extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f3648;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f3649;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3650;

        h(ViewGroup viewGroup, View view, androidx.fragment.app.e eVar) {
            this.f3648 = viewGroup;
            this.f3649 = view;
            this.f3650 = eVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3648.endViewTransition(this.f3649);
            animator.removeListener(this);
            androidx.fragment.app.e eVar = this.f3650;
            View view = eVar.mView;
            if (view == null || !eVar.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* compiled from: FragmentManager.java */
    class i implements r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ androidx.fragment.app.e f3652;

        i(androidx.fragment.app.e eVar) {
            this.f3652 = eVar;
        }

        @Override // androidx.fragment.app.r
        /* renamed from: ʻ */
        public void mo4044(n nVar, androidx.fragment.app.e eVar) {
            this.f3652.onAttachFragment(eVar);
        }
    }

    /* compiled from: FragmentManager.java */
    class j implements c.b<c.a> {
        j() {
        }

        @Override // c.b
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4257(c.a aVar) {
            l pollFirst = n.this.f3602.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.f3655;
            int i5 = pollFirst.f3656;
            androidx.fragment.app.e m4320 = n.this.f3605.m4320(str);
            if (m4320 != null) {
                m4320.onActivityResult(i5, aVar.m5722(), aVar.m5721());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: FragmentManager.java */
    static class k extends d.a<c.f, c.a> {
        k() {
        }

        @Override // d.a
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Intent mo4263(Context context, c.f fVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent m5739 = fVar.m5739();
            if (m5739 != null && (bundleExtra = m5739.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                m5739.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (m5739.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    fVar = new f.a(fVar.m5742()).m5744(null).m5745(fVar.m5741(), fVar.m5740()).m5743();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", fVar);
            if (n.m4148(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // d.a
        /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public c.a mo4264(int i5, Intent intent) {
            return new c.a(i5, intent);
        }
    }

    /* compiled from: FragmentManager.java */
    public interface m {
        void onBackStackChanged();
    }

    /* compiled from: FragmentManager.java */
    /* renamed from: androidx.fragment.app.n$n, reason: collision with other inner class name */
    interface InterfaceC0048n {
        /* renamed from: ʻ */
        boolean mo3943(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManager.java */
    private class o implements InterfaceC0048n {

        /* renamed from: ʻ, reason: contains not printable characters */
        final String f3657;

        /* renamed from: ʼ, reason: contains not printable characters */
        final int f3658;

        /* renamed from: ʽ, reason: contains not printable characters */
        final int f3659;

        o(String str, int i5, int i6) {
            this.f3657 = str;
            this.f3658 = i5;
            this.f3659 = i6;
        }

        @Override // androidx.fragment.app.n.InterfaceC0048n
        /* renamed from: ʻ */
        public boolean mo3943(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            androidx.fragment.app.e eVar = n.this.f3635;
            if (eVar == null || this.f3658 >= 0 || this.f3657 != null || !eVar.getChildFragmentManager().m4212()) {
                return n.this.m4214(arrayList, arrayList2, this.f3657, this.f3658, this.f3659);
            }
            return false;
        }
    }

    /* compiled from: FragmentManager.java */
    static class p implements e.m {

        /* renamed from: ʻ, reason: contains not printable characters */
        final boolean f3661;

        /* renamed from: ʼ, reason: contains not printable characters */
        final androidx.fragment.app.a f3662;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f3663;

        p(androidx.fragment.app.a aVar, boolean z5) {
            this.f3661 = z5;
            this.f3662 = aVar;
        }

        @Override // androidx.fragment.app.e.m
        /* renamed from: ʻ */
        public void mo4025() {
            int i5 = this.f3663 - 1;
            this.f3663 = i5;
            if (i5 != 0) {
                return;
            }
            this.f3662.f3391.m4220();
        }

        @Override // androidx.fragment.app.e.m
        /* renamed from: ʼ */
        public void mo4026() {
            this.f3663++;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m4269() {
            androidx.fragment.app.a aVar = this.f3662;
            aVar.f3391.m4247(aVar, this.f3661, false, false);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m4270() {
            boolean z5 = this.f3663 > 0;
            for (androidx.fragment.app.e eVar : this.f3662.f3391.m4182()) {
                eVar.setOnStartEnterTransitionListener(null);
                if (z5 && eVar.isPostponed()) {
                    eVar.startPostponedEnterTransition();
                }
            }
            androidx.fragment.app.a aVar = this.f3662;
            aVar.f3391.m4247(aVar, this.f3661, !z5, true);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean m4271() {
            return this.f3663 == 0;
        }
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static void m4139(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i5, int i6) {
        while (i5 < i6) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue()) {
                aVar.m3953(-1);
                aVar.m3959(i5 == i6 + (-1));
            } else {
                aVar.m3953(1);
                aVar.m3958();
            }
            i5++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* renamed from: ʻʿ, reason: contains not printable characters */
    private void m4140(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i5, int i6) {
        ?? r12;
        boolean z5;
        int i7;
        int i8;
        ArrayList<Boolean> arrayList3;
        int i9;
        int i10;
        ArrayList<Boolean> arrayList4;
        int i11;
        boolean z6;
        boolean z7 = arrayList.get(i5).f3721;
        ArrayList<androidx.fragment.app.e> arrayList5 = this.f3614;
        if (arrayList5 == null) {
            this.f3614 = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f3614.addAll(this.f3605.m4325());
        androidx.fragment.app.e m4187 = m4187();
        boolean z8 = false;
        for (int i12 = i5; i12 < i6; i12++) {
            androidx.fragment.app.a aVar = arrayList.get(i12);
            m4187 = !arrayList2.get(i12).booleanValue() ? aVar.m3960(this.f3614, m4187) : aVar.m3945(this.f3614, m4187);
            z8 = z8 || aVar.f3712;
        }
        this.f3614.clear();
        if (z7 || this.f3629 < 1) {
            r12 = 1;
        } else if (f3600) {
            for (int i13 = i5; i13 < i6; i13++) {
                Iterator<v.a> it = arrayList.get(i13).f3706.iterator();
                while (it.hasNext()) {
                    androidx.fragment.app.e eVar = it.next().f3724;
                    if (eVar != null && eVar.mFragmentManager != null) {
                        this.f3605.m4327(m4250(eVar));
                    }
                }
            }
            r12 = 1;
        } else {
            r12 = 1;
            w.m4364(this.f3631.m4119(), this.f3633, arrayList, arrayList2, i5, i6, false, this.f3625);
        }
        m4139(arrayList, arrayList2, i5, i6);
        if (f3600) {
            boolean booleanValue = arrayList2.get(i6 - 1).booleanValue();
            for (int i14 = i5; i14 < i6; i14++) {
                androidx.fragment.app.a aVar2 = arrayList.get(i14);
                if (booleanValue) {
                    for (int size = aVar2.f3706.size() - r12; size >= 0; size--) {
                        androidx.fragment.app.e eVar2 = aVar2.f3706.get(size).f3724;
                        if (eVar2 != null) {
                            m4250(eVar2).m4303();
                        }
                    }
                } else {
                    Iterator<v.a> it2 = aVar2.f3706.iterator();
                    while (it2.hasNext()) {
                        androidx.fragment.app.e eVar3 = it2.next().f3724;
                        if (eVar3 != null) {
                            m4250(eVar3).m4303();
                        }
                    }
                }
            }
            m4203(this.f3629, r12);
            for (g0 g0Var : m4164(arrayList, i5, i6)) {
                g0Var.m4072(booleanValue);
                g0Var.m4071();
                g0Var.m4066();
            }
            i11 = i6;
            arrayList4 = arrayList2;
        } else {
            if (z7) {
                m.b bVar = new m.b();
                m4146(bVar);
                i9 = 1;
                z5 = z7;
                i7 = i6;
                i8 = i5;
                arrayList3 = arrayList2;
                i10 = m4152(arrayList, arrayList2, i5, i6, bVar);
                m4150(bVar);
            } else {
                z5 = z7;
                i7 = i6;
                i8 = i5;
                arrayList3 = arrayList2;
                i9 = 1;
                i10 = i7;
            }
            if (i10 == i8 || !z5) {
                arrayList4 = arrayList3;
                i11 = i7;
            } else {
                if (this.f3629 >= i9) {
                    arrayList4 = arrayList3;
                    int i15 = i10;
                    i11 = i7;
                    z6 = true;
                    w.m4364(this.f3631.m4119(), this.f3633, arrayList, arrayList2, i5, i15, true, this.f3625);
                } else {
                    arrayList4 = arrayList3;
                    i11 = i7;
                    z6 = true;
                }
                m4203(this.f3629, z6);
            }
        }
        for (int i16 = i5; i16 < i11; i16++) {
            androidx.fragment.app.a aVar3 = arrayList.get(i16);
            if (arrayList4.get(i16).booleanValue() && aVar3.f3393 >= 0) {
                aVar3.f3393 = -1;
            }
            aVar3.m3944();
        }
        if (z8) {
            m4154();
        }
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private void m4141(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<p> arrayList3 = this.f3620;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i5 = 0;
        while (i5 < size) {
            p pVar = this.f3620.get(i5);
            if (arrayList != null && !pVar.f3661 && (indexOf2 = arrayList.indexOf(pVar.f3662)) != -1 && arrayList2 != null && arrayList2.get(indexOf2).booleanValue()) {
                this.f3620.remove(i5);
                i5--;
                size--;
                pVar.m4269();
            } else if (pVar.m4271() || (arrayList != null && pVar.f3662.m3963(arrayList, 0, arrayList.size()))) {
                this.f3620.remove(i5);
                i5--;
                size--;
                if (arrayList == null || pVar.f3661 || (indexOf = arrayList.indexOf(pVar.f3662)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                    pVar.m4270();
                } else {
                    pVar.m4269();
                }
            }
            i5++;
        }
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    private void m4142() {
        if (f3600) {
            Iterator<g0> it = m4163().iterator();
            while (it.hasNext()) {
                it.next().m4068();
            }
        } else if (this.f3620 != null) {
            while (!this.f3620.isEmpty()) {
                this.f3620.remove(0).m4270();
            }
        }
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private boolean m4143(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3601) {
            if (this.f3601.isEmpty()) {
                return false;
            }
            int size = this.f3601.size();
            boolean z5 = false;
            for (int i5 = 0; i5 < size; i5++) {
                z5 |= this.f3601.get(i5).mo3943(arrayList, arrayList2);
            }
            this.f3601.clear();
            this.f3631.m4120().removeCallbacks(this.f3623);
            return z5;
        }
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    private q m4144(androidx.fragment.app.e eVar) {
        return this.f3618.m4279(eVar);
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    private ViewGroup m4145(androidx.fragment.app.e eVar) {
        ViewGroup viewGroup = eVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (eVar.mContainerId > 0 && this.f3633.mo4008()) {
            View mo4007 = this.f3633.mo4007(eVar.mContainerId);
            if (mo4007 instanceof ViewGroup) {
                return (ViewGroup) mo4007;
            }
        }
        return null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m4146(m.b<androidx.fragment.app.e> bVar) {
        int i5 = this.f3629;
        if (i5 < 1) {
            return;
        }
        int min = Math.min(i5, 5);
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar.mState < min) {
                m4205(eVar, min);
                if (eVar.mView != null && !eVar.mHidden && eVar.mIsNewlyAdded) {
                    bVar.add(eVar);
                }
            }
        }
    }

    /* renamed from: ʼʻ, reason: contains not printable characters */
    static androidx.fragment.app.e m4147(View view) {
        Object tag = view.getTag(g0.b.f7826);
        if (tag instanceof androidx.fragment.app.e) {
            return (androidx.fragment.app.e) tag;
        }
        return null;
    }

    /* renamed from: ʼˉ, reason: contains not printable characters */
    static boolean m4148(int i5) {
        return f3599 || Log.isLoggable("FragmentManager", i5);
    }

    /* renamed from: ʼˊ, reason: contains not printable characters */
    private boolean m4149(androidx.fragment.app.e eVar) {
        return (eVar.mHasMenu && eVar.mMenuVisible) || eVar.mChildFragmentManager.m4241();
    }

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    private void m4150(m.b<androidx.fragment.app.e> bVar) {
        int size = bVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            androidx.fragment.app.e m9784 = bVar.m9784(i5);
            if (!m9784.mAdded) {
                View requireView = m9784.requireView();
                m9784.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private boolean m4151(String str, int i5, int i6) {
        m4172(false);
        m4170(true);
        androidx.fragment.app.e eVar = this.f3635;
        if (eVar != null && i5 < 0 && str == null && eVar.getChildFragmentManager().m4212()) {
            return true;
        }
        boolean m4214 = m4214(this.f3612, this.f3616, str, i5, i6);
        if (m4214) {
            this.f3603 = true;
            try {
                m4153(this.f3612, this.f3616);
            } finally {
                m4162();
            }
        }
        m4158();
        m4168();
        this.f3605.m4313();
        return m4214;
    }

    /* renamed from: ʽˆ, reason: contains not printable characters */
    private int m4152(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i5, int i6, m.b<androidx.fragment.app.e> bVar) {
        int i7 = i6;
        for (int i8 = i6 - 1; i8 >= i5; i8--) {
            androidx.fragment.app.a aVar = arrayList.get(i8);
            boolean booleanValue = arrayList2.get(i8).booleanValue();
            if (aVar.m3955() && !aVar.m3963(arrayList, i8 + 1, i6)) {
                if (this.f3620 == null) {
                    this.f3620 = new ArrayList<>();
                }
                p pVar = new p(aVar, booleanValue);
                this.f3620.add(pVar);
                aVar.m3946(pVar);
                if (booleanValue) {
                    aVar.m3958();
                } else {
                    aVar.m3959(false);
                }
                i7--;
                if (i8 != i7) {
                    arrayList.remove(i8);
                    arrayList.add(i7, aVar);
                }
                m4146(bVar);
            }
        }
        return i7;
    }

    /* renamed from: ʽˊ, reason: contains not printable characters */
    private void m4153(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m4141(arrayList, arrayList2);
        int size = arrayList.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            if (!arrayList.get(i5).f3721) {
                if (i6 != i5) {
                    m4140(arrayList, arrayList2, i6, i5);
                }
                i6 = i5 + 1;
                if (arrayList2.get(i5).booleanValue()) {
                    while (i6 < size && arrayList2.get(i6).booleanValue() && !arrayList.get(i6).f3721) {
                        i6++;
                    }
                }
                m4140(arrayList, arrayList2, i5, i6);
                i5 = i6 - 1;
            }
            i5++;
        }
        if (i6 != size) {
            m4140(arrayList, arrayList2, i6, size);
        }
    }

    /* renamed from: ʽˎ, reason: contains not printable characters */
    private void m4154() {
        if (this.f3622 != null) {
            for (int i5 = 0; i5 < this.f3622.size(); i5++) {
                this.f3622.get(i5).onBackStackChanged();
            }
        }
    }

    /* renamed from: ʽˑ, reason: contains not printable characters */
    static int m4155(int i5) {
        if (i5 == 4097) {
            return 8194;
        }
        if (i5 != 4099) {
            return i5 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: ʽᵎ, reason: contains not printable characters */
    private void m4156(androidx.fragment.app.e eVar) {
        ViewGroup m4145 = m4145(eVar);
        if (m4145 == null || eVar.getEnterAnim() + eVar.getExitAnim() + eVar.getPopEnterAnim() + eVar.getPopExitAnim() <= 0) {
            return;
        }
        int i5 = g0.b.f7828;
        if (m4145.getTag(i5) == null) {
            m4145.setTag(i5, eVar);
        }
        ((androidx.fragment.app.e) m4145.getTag(i5)).setPopDirection(eVar.getPopDirection());
    }

    /* renamed from: ʽᵢ, reason: contains not printable characters */
    private void m4157() {
        Iterator<t> it = this.f3605.m4322().iterator();
        while (it.hasNext()) {
            m4208(it.next());
        }
    }

    /* renamed from: ʽⁱ, reason: contains not printable characters */
    private void m4158() {
        synchronized (this.f3601) {
            if (this.f3601.isEmpty()) {
                this.f3615.m411(m4178() > 0 && m4196(this.f3634));
            } else {
                this.f3615.m411(true);
            }
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m4159(androidx.fragment.app.e eVar) {
        if (eVar == null || !eVar.equals(m4174(eVar.mWho))) {
            return;
        }
        eVar.performPrimaryNavigationFragmentChanged();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m4160(androidx.fragment.app.e eVar) {
        HashSet<androidx.core.os.g> hashSet = this.f3624.get(eVar);
        if (hashSet != null) {
            Iterator<androidx.core.os.g> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m2412();
            }
            hashSet.clear();
            m4167(eVar);
            this.f3624.remove(eVar);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m4161() {
        if (m4198()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m4162() {
        this.f3603 = false;
        this.f3616.clear();
        this.f3612.clear();
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private Set<g0> m4163() {
        HashSet hashSet = new HashSet();
        Iterator<t> it = this.f3605.m4322().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().m4302().mContainer;
            if (viewGroup != null) {
                hashSet.add(g0.m4060(viewGroup, m4188()));
            }
        }
        return hashSet;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Set<g0> m4164(ArrayList<androidx.fragment.app.a> arrayList, int i5, int i6) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i5 < i6) {
            Iterator<v.a> it = arrayList.get(i5).f3706.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.e eVar = it.next().f3724;
                if (eVar != null && (viewGroup = eVar.mContainer) != null) {
                    hashSet.add(g0.m4059(viewGroup, this));
                }
            }
            i5++;
        }
        return hashSet;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m4165(androidx.fragment.app.e eVar) {
        Animator animator;
        if (eVar.mView != null) {
            g.d m4054 = androidx.fragment.app.g.m4054(this.f3631.m4119(), eVar, !eVar.mHidden, eVar.getPopDirection());
            if (m4054 == null || (animator = m4054.f3551) == null) {
                if (m4054 != null) {
                    eVar.mView.startAnimation(m4054.f3550);
                    m4054.f3550.start();
                }
                eVar.mView.setVisibility((!eVar.mHidden || eVar.isHideReplaced()) ? 0 : 8);
                if (eVar.isHideReplaced()) {
                    eVar.setHideReplaced(false);
                }
            } else {
                animator.setTarget(eVar.mView);
                if (!eVar.mHidden) {
                    eVar.mView.setVisibility(0);
                } else if (eVar.isHideReplaced()) {
                    eVar.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = eVar.mContainer;
                    View view = eVar.mView;
                    viewGroup.startViewTransition(view);
                    m4054.f3551.addListener(new h(viewGroup, view, eVar));
                }
                m4054.f3551.start();
            }
        }
        m4193(eVar);
        eVar.mHiddenChanged = false;
        eVar.onHiddenChanged(eVar.mHidden);
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m4166(int i5) {
        try {
            this.f3603 = true;
            this.f3605.m4315(i5);
            m4203(i5, false);
            if (f3600) {
                Iterator<g0> it = m4163().iterator();
                while (it.hasNext()) {
                    it.next().m4067();
                }
            }
            this.f3603 = false;
            m4172(true);
        } catch (Throwable th) {
            this.f3603 = false;
            throw th;
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m4167(androidx.fragment.app.e eVar) {
        eVar.performDestroyView();
        this.f3626.m4137(eVar, false);
        eVar.mContainer = null;
        eVar.mView = null;
        eVar.mViewLifecycleOwner = null;
        eVar.mViewLifecycleOwnerLiveData.mo4511(null);
        eVar.mInLayout = false;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private void m4168() {
        if (this.f3627) {
            this.f3627 = false;
            m4157();
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private void m4169() {
        if (f3600) {
            Iterator<g0> it = m4163().iterator();
            while (it.hasNext()) {
                it.next().m4067();
            }
        } else {
            if (this.f3624.isEmpty()) {
                return;
            }
            for (androidx.fragment.app.e eVar : this.f3624.keySet()) {
                m4160(eVar);
                m4204(eVar);
            }
        }
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private void m4170(boolean z5) {
        if (this.f3603) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f3631 == null) {
            if (!this.f3608) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f3631.m4120().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z5) {
            m4161();
        }
        if (this.f3612 == null) {
            this.f3612 = new ArrayList<>();
            this.f3616 = new ArrayList<>();
        }
        this.f3603 = true;
        try {
            m4141(null, null);
        } finally {
            this.f3603 = false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        androidx.fragment.app.e eVar = this.f3634;
        if (eVar != null) {
            sb.append(eVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f3634)));
            sb.append("}");
        } else {
            androidx.fragment.app.k<?> kVar = this.f3631;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f3631)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    void m4171() {
        this.f3608 = true;
        m4172(true);
        m4169();
        m4166(-1);
        this.f3631 = null;
        this.f3633 = null;
        this.f3634 = null;
        if (this.f3613 != null) {
            this.f3615.m409();
            this.f3613 = null;
        }
        c.c<Intent> cVar = this.f3640;
        if (cVar != null) {
            cVar.mo4024();
            this.f3630.mo4024();
            this.f3632.mo4024();
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    boolean m4172(boolean z5) {
        m4170(z5);
        boolean z6 = false;
        while (m4143(this.f3612, this.f3616)) {
            z6 = true;
            this.f3603 = true;
            try {
                m4153(this.f3612, this.f3616);
            } finally {
                m4162();
            }
        }
        m4158();
        m4168();
        this.f3605.m4313();
        return z6;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void m4173(InterfaceC0048n interfaceC0048n, boolean z5) {
        if (z5 && (this.f3631 == null || this.f3608)) {
            return;
        }
        m4170(z5);
        if (interfaceC0048n.mo3943(this.f3612, this.f3616)) {
            this.f3603 = true;
            try {
                m4153(this.f3612, this.f3616);
            } finally {
                m4162();
            }
        }
        m4158();
        m4168();
        this.f3605.m4313();
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    androidx.fragment.app.e m4174(String str) {
        return this.f3605.m4317(str);
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public androidx.fragment.app.e m4175(int i5) {
        return this.f3605.m4318(i5);
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    public androidx.fragment.app.e m4176(String str) {
        return this.f3605.m4319(str);
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    androidx.fragment.app.e m4177(String str) {
        return this.f3605.m4320(str);
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    public int m4178() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f3607;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    androidx.fragment.app.h m4179() {
        return this.f3633;
    }

    /* renamed from: ʻᐧ, reason: contains not printable characters */
    public androidx.fragment.app.j m4180() {
        androidx.fragment.app.j jVar = this.f3636;
        if (jVar != null) {
            return jVar;
        }
        androidx.fragment.app.e eVar = this.f3634;
        return eVar != null ? eVar.mFragmentManager.m4180() : this.f3637;
    }

    /* renamed from: ʻᴵ, reason: contains not printable characters */
    u m4181() {
        return this.f3605;
    }

    /* renamed from: ʻᵎ, reason: contains not printable characters */
    public List<androidx.fragment.app.e> m4182() {
        return this.f3605.m4325();
    }

    /* renamed from: ʻᵔ, reason: contains not printable characters */
    androidx.fragment.app.k<?> m4183() {
        return this.f3631;
    }

    /* renamed from: ʻᵢ, reason: contains not printable characters */
    LayoutInflater.Factory2 m4184() {
        return this.f3611;
    }

    /* renamed from: ʻⁱ, reason: contains not printable characters */
    androidx.fragment.app.m m4185() {
        return this.f3626;
    }

    /* renamed from: ʻﹳ, reason: contains not printable characters */
    androidx.fragment.app.e m4186() {
        return this.f3634;
    }

    /* renamed from: ʻﹶ, reason: contains not printable characters */
    public androidx.fragment.app.e m4187() {
        return this.f3635;
    }

    /* renamed from: ʻﾞ, reason: contains not printable characters */
    h0 m4188() {
        h0 h0Var = this.f3638;
        if (h0Var != null) {
            return h0Var;
        }
        androidx.fragment.app.e eVar = this.f3634;
        return eVar != null ? eVar.mFragmentManager.m4188() : this.f3639;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    void m4189() {
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null) {
                eVar.performLowMemory();
            }
        }
    }

    /* renamed from: ʼʽ, reason: contains not printable characters */
    r0 m4190(androidx.fragment.app.e eVar) {
        return this.f3618.m4281(eVar);
    }

    /* renamed from: ʼʾ, reason: contains not printable characters */
    void m4191() {
        m4172(true);
        if (this.f3615.m408()) {
            m4212();
        } else {
            this.f3613.m427();
        }
    }

    /* renamed from: ʼʿ, reason: contains not printable characters */
    void m4192(androidx.fragment.app.e eVar) {
        if (m4148(2)) {
            Log.v("FragmentManager", "hide: " + eVar);
        }
        if (eVar.mHidden) {
            return;
        }
        eVar.mHidden = true;
        eVar.mHiddenChanged = true ^ eVar.mHiddenChanged;
        m4156(eVar);
    }

    /* renamed from: ʼˆ, reason: contains not printable characters */
    void m4193(androidx.fragment.app.e eVar) {
        if (eVar.mAdded && m4149(eVar)) {
            this.f3606 = true;
        }
    }

    /* renamed from: ʼˈ, reason: contains not printable characters */
    public boolean m4194() {
        return this.f3608;
    }

    /* renamed from: ʼˋ, reason: contains not printable characters */
    boolean m4195(androidx.fragment.app.e eVar) {
        if (eVar == null) {
            return true;
        }
        return eVar.isMenuVisible();
    }

    /* renamed from: ʼˎ, reason: contains not printable characters */
    boolean m4196(androidx.fragment.app.e eVar) {
        if (eVar == null) {
            return true;
        }
        n nVar = eVar.mFragmentManager;
        return eVar.equals(nVar.m4187()) && m4196(nVar.f3634);
    }

    /* renamed from: ʼˏ, reason: contains not printable characters */
    boolean m4197(int i5) {
        return this.f3629 >= i5;
    }

    /* renamed from: ʼˑ, reason: contains not printable characters */
    public boolean m4198() {
        return this.f3604 || this.f3610;
    }

    /* renamed from: ʼי, reason: contains not printable characters */
    void m4199(androidx.fragment.app.e eVar, String[] strArr, int i5) {
        if (this.f3632 == null) {
            this.f3631.m4121(eVar, strArr, i5);
            return;
        }
        this.f3602.addLast(new l(eVar.mWho, i5));
        this.f3632.m5725(strArr);
    }

    /* renamed from: ʼـ, reason: contains not printable characters */
    void m4200(androidx.fragment.app.e eVar, @SuppressLint({"UnknownNullness"}) Intent intent, int i5, Bundle bundle) {
        if (this.f3640 == null) {
            this.f3631.m4122(eVar, intent, i5, bundle);
            return;
        }
        this.f3602.addLast(new l(eVar.mWho, i5));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f3640.m5725(intent);
    }

    /* renamed from: ʼٴ, reason: contains not printable characters */
    void m4201(androidx.fragment.app.e eVar, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i5, Intent intent, int i6, int i7, int i8, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f3630 == null) {
            this.f3631.m4123(eVar, intentSender, i5, intent, i6, i7, i8, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (m4148(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + eVar);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        c.f m5743 = new f.a(intentSender).m5744(intent2).m5745(i7, i6).m5743();
        this.f3602.addLast(new l(eVar.mWho, i5));
        if (m4148(2)) {
            Log.v("FragmentManager", "Fragment " + eVar + "is launching an IntentSender for result ");
        }
        this.f3630.m5725(m5743);
    }

    /* renamed from: ʼᴵ, reason: contains not printable characters */
    void m4202(androidx.fragment.app.e eVar) {
        if (!this.f3605.m4314(eVar.mWho)) {
            if (m4148(3)) {
                Log.d("FragmentManager", "Ignoring moving " + eVar + " to state " + this.f3629 + "since it is not added to " + this);
                return;
            }
            return;
        }
        m4204(eVar);
        View view = eVar.mView;
        if (view != null && eVar.mIsNewlyAdded && eVar.mContainer != null) {
            float f5 = eVar.mPostponedAlpha;
            if (f5 > 0.0f) {
                view.setAlpha(f5);
            }
            eVar.mPostponedAlpha = 0.0f;
            eVar.mIsNewlyAdded = false;
            g.d m4054 = androidx.fragment.app.g.m4054(this.f3631.m4119(), eVar, true, eVar.getPopDirection());
            if (m4054 != null) {
                Animation animation = m4054.f3550;
                if (animation != null) {
                    eVar.mView.startAnimation(animation);
                } else {
                    m4054.f3551.setTarget(eVar.mView);
                    m4054.f3551.start();
                }
            }
        }
        if (eVar.mHiddenChanged) {
            m4165(eVar);
        }
    }

    /* renamed from: ʼᵎ, reason: contains not printable characters */
    void m4203(int i5, boolean z5) {
        androidx.fragment.app.k<?> kVar;
        if (this.f3631 == null && i5 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z5 || i5 != this.f3629) {
            this.f3629 = i5;
            if (f3600) {
                this.f3605.m4329();
            } else {
                Iterator<androidx.fragment.app.e> it = this.f3605.m4325().iterator();
                while (it.hasNext()) {
                    m4202(it.next());
                }
                for (t tVar : this.f3605.m4322()) {
                    androidx.fragment.app.e m4302 = tVar.m4302();
                    if (!m4302.mIsNewlyAdded) {
                        m4202(m4302);
                    }
                    if (m4302.mRemoving && !m4302.isInBackStack()) {
                        this.f3605.m4328(tVar);
                    }
                }
            }
            m4157();
            if (this.f3606 && (kVar = this.f3631) != null && this.f3629 == 7) {
                kVar.mo4049();
                this.f3606 = false;
            }
        }
    }

    /* renamed from: ʼᵔ, reason: contains not printable characters */
    void m4204(androidx.fragment.app.e eVar) {
        m4205(eVar, this.f3629);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /* renamed from: ʼᵢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m4205(androidx.fragment.app.e r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.m4205(androidx.fragment.app.e, int):void");
    }

    /* renamed from: ʼⁱ, reason: contains not printable characters */
    void m4206() {
        if (this.f3631 == null) {
            return;
        }
        this.f3604 = false;
        this.f3610 = false;
        this.f3618.m4284(false);
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null) {
                eVar.noteStateNotSaved();
            }
        }
    }

    /* renamed from: ʼﹳ, reason: contains not printable characters */
    void m4207(FragmentContainerView fragmentContainerView) {
        View view;
        for (t tVar : this.f3605.m4322()) {
            androidx.fragment.app.e m4302 = tVar.m4302();
            if (m4302.mContainerId == fragmentContainerView.getId() && (view = m4302.mView) != null && view.getParent() == null) {
                m4302.mContainer = fragmentContainerView;
                tVar.m4293();
            }
        }
    }

    /* renamed from: ʼﹶ, reason: contains not printable characters */
    void m4208(t tVar) {
        androidx.fragment.app.e m4302 = tVar.m4302();
        if (m4302.mDeferStart) {
            if (this.f3603) {
                this.f3627 = true;
                return;
            }
            m4302.mDeferStart = false;
            if (f3600) {
                tVar.m4303();
            } else {
                m4204(m4302);
            }
        }
    }

    /* renamed from: ʼﾞ, reason: contains not printable characters */
    public void m4209() {
        m4245(new o(null, -1, 0), false);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m4210(androidx.fragment.app.a aVar) {
        if (this.f3607 == null) {
            this.f3607 = new ArrayList<>();
        }
        this.f3607.add(aVar);
    }

    /* renamed from: ʽʻ, reason: contains not printable characters */
    public void m4211(int i5, int i6) {
        if (i5 >= 0) {
            m4245(new o(null, i5, i6), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i5);
    }

    /* renamed from: ʽʼ, reason: contains not printable characters */
    public boolean m4212() {
        return m4151(null, -1, 0);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    void m4213() {
        m4166(1);
    }

    /* renamed from: ʽʿ, reason: contains not printable characters */
    boolean m4214(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i5, int i6) {
        int i7;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f3607;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i5 < 0 && (i6 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3607.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i5 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f3607.get(size2);
                    if ((str != null && str.equals(aVar.m3961())) || (i5 >= 0 && i5 == aVar.f3393)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i6 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f3607.get(size2);
                        if (str == null || !str.equals(aVar2.m3961())) {
                            if (i5 < 0 || i5 != aVar2.f3393) {
                                break;
                            }
                        }
                    }
                }
                i7 = size2;
            } else {
                i7 = -1;
            }
            if (i7 == this.f3607.size() - 1) {
                return false;
            }
            for (int size3 = this.f3607.size() - 1; size3 > i7; size3--) {
                arrayList.add(this.f3607.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    /* renamed from: ʽˈ, reason: contains not printable characters */
    void m4215(androidx.fragment.app.e eVar, androidx.core.os.g gVar) {
        HashSet<androidx.core.os.g> hashSet = this.f3624.get(eVar);
        if (hashSet != null && hashSet.remove(gVar) && hashSet.isEmpty()) {
            this.f3624.remove(eVar);
            if (eVar.mState < 5) {
                m4167(eVar);
                m4204(eVar);
            }
        }
    }

    /* renamed from: ʽˉ, reason: contains not printable characters */
    void m4216(androidx.fragment.app.e eVar) {
        if (m4148(2)) {
            Log.v("FragmentManager", "remove: " + eVar + " nesting=" + eVar.mBackStackNesting);
        }
        boolean z5 = !eVar.isInBackStack();
        if (!eVar.mDetached || z5) {
            this.f3605.m4330(eVar);
            if (m4149(eVar)) {
                this.f3606 = true;
            }
            eVar.mRemoving = true;
            m4156(eVar);
        }
    }

    /* renamed from: ʽˋ, reason: contains not printable characters */
    void m4217(androidx.fragment.app.e eVar) {
        this.f3618.m4283(eVar);
    }

    /* renamed from: ʽˏ, reason: contains not printable characters */
    void m4218(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.f3664 == null) {
            return;
        }
        this.f3605.m4331();
        Iterator<s> it = pVar.f3664.iterator();
        while (it.hasNext()) {
            s next = it.next();
            if (next != null) {
                androidx.fragment.app.e m4278 = this.f3618.m4278(next.f3681);
                if (m4278 != null) {
                    if (m4148(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + m4278);
                    }
                    tVar = new t(this.f3626, this.f3605, m4278, next);
                } else {
                    tVar = new t(this.f3626, this.f3605, this.f3631.m4119().getClassLoader(), m4180(), next);
                }
                androidx.fragment.app.e m4302 = tVar.m4302();
                m4302.mFragmentManager = this;
                if (m4148(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + m4302.mWho + "): " + m4302);
                }
                tVar.m4305(this.f3631.m4119().getClassLoader());
                this.f3605.m4327(tVar);
                tVar.m4309(this.f3629);
            }
        }
        for (androidx.fragment.app.e eVar : this.f3618.m4280()) {
            if (!this.f3605.m4314(eVar.mWho)) {
                if (m4148(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + eVar + " that was not found in the set of active Fragments " + pVar.f3664);
                }
                this.f3618.m4283(eVar);
                eVar.mFragmentManager = this;
                t tVar2 = new t(this.f3626, this.f3605, eVar);
                tVar2.m4309(1);
                tVar2.m4303();
                eVar.mRemoving = true;
                tVar2.m4303();
            }
        }
        this.f3605.m4332(pVar.f3665);
        if (pVar.f3666 != null) {
            this.f3607 = new ArrayList<>(pVar.f3666.length);
            int i5 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.f3666;
                if (i5 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a m3965 = bVarArr[i5].m3965(this);
                if (m4148(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i5 + " (index " + m3965.f3393 + "): " + m3965);
                    PrintWriter printWriter = new PrintWriter(new f0("FragmentManager"));
                    m3965.m3957("  ", printWriter, false);
                    printWriter.close();
                }
                this.f3607.add(m3965);
                i5++;
            }
        } else {
            this.f3607 = null;
        }
        this.f3617.set(pVar.f3667);
        String str = pVar.f3668;
        if (str != null) {
            androidx.fragment.app.e m4174 = m4174(str);
            this.f3635 = m4174;
            m4159(m4174);
        }
        ArrayList<String> arrayList = pVar.f3669;
        if (arrayList != null) {
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                Bundle bundle = pVar.f3670.get(i6);
                bundle.setClassLoader(this.f3631.m4119().getClassLoader());
                this.f3619.put(arrayList.get(i6), bundle);
            }
        }
        this.f3602 = new ArrayDeque<>(pVar.f3671);
    }

    /* renamed from: ʽי, reason: contains not printable characters */
    Parcelable m4219() {
        int size;
        m4142();
        m4169();
        m4172(true);
        this.f3604 = true;
        this.f3618.m4284(true);
        ArrayList<s> m4333 = this.f3605.m4333();
        androidx.fragment.app.b[] bVarArr = null;
        if (m4333.isEmpty()) {
            if (m4148(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> m4334 = this.f3605.m4334();
        ArrayList<androidx.fragment.app.a> arrayList = this.f3607;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i5 = 0; i5 < size; i5++) {
                bVarArr[i5] = new androidx.fragment.app.b(this.f3607.get(i5));
                if (m4148(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i5 + ": " + this.f3607.get(i5));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f3664 = m4333;
        pVar.f3665 = m4334;
        pVar.f3666 = bVarArr;
        pVar.f3667 = this.f3617.get();
        androidx.fragment.app.e eVar = this.f3635;
        if (eVar != null) {
            pVar.f3668 = eVar.mWho;
        }
        pVar.f3669.addAll(this.f3619.keySet());
        pVar.f3670.addAll(this.f3619.values());
        pVar.f3671 = new ArrayList<>(this.f3602);
        return pVar;
    }

    /* renamed from: ʽـ, reason: contains not printable characters */
    void m4220() {
        synchronized (this.f3601) {
            ArrayList<p> arrayList = this.f3620;
            boolean z5 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z6 = this.f3601.size() == 1;
            if (z5 || z6) {
                this.f3631.m4120().removeCallbacks(this.f3623);
                this.f3631.m4120().post(this.f3623);
                m4158();
            }
        }
    }

    /* renamed from: ʽٴ, reason: contains not printable characters */
    void m4221(androidx.fragment.app.e eVar, boolean z5) {
        ViewGroup m4145 = m4145(eVar);
        if (m4145 == null || !(m4145 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m4145).setDrawDisappearingViewsLast(!z5);
    }

    /* renamed from: ʽᐧ, reason: contains not printable characters */
    void m4222(androidx.fragment.app.e eVar, l.b bVar) {
        if (eVar.equals(m4174(eVar.mWho)) && (eVar.mHost == null || eVar.mFragmentManager == this)) {
            eVar.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + eVar + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: ʽᴵ, reason: contains not printable characters */
    void m4223(androidx.fragment.app.e eVar) {
        if (eVar == null || (eVar.equals(m4174(eVar.mWho)) && (eVar.mHost == null || eVar.mFragmentManager == this))) {
            androidx.fragment.app.e eVar2 = this.f3635;
            this.f3635 = eVar;
            m4159(eVar2);
            m4159(this.f3635);
            return;
        }
        throw new IllegalArgumentException("Fragment " + eVar + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: ʽᵔ, reason: contains not printable characters */
    void m4224(androidx.fragment.app.e eVar) {
        if (m4148(2)) {
            Log.v("FragmentManager", "show: " + eVar);
        }
        if (eVar.mHidden) {
            eVar.mHidden = false;
            eVar.mHiddenChanged = !eVar.mHiddenChanged;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m4225(androidx.fragment.app.e eVar, androidx.core.os.g gVar) {
        if (this.f3624.get(eVar) == null) {
            this.f3624.put(eVar, new HashSet<>());
        }
        this.f3624.get(eVar).add(gVar);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    void m4226(androidx.fragment.app.e eVar) {
        Iterator<r> it = this.f3628.iterator();
        while (it.hasNext()) {
            it.next().mo4044(this, eVar);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    t m4227(androidx.fragment.app.e eVar) {
        if (m4148(2)) {
            Log.v("FragmentManager", "add: " + eVar);
        }
        t m4250 = m4250(eVar);
        eVar.mFragmentManager = this;
        this.f3605.m4327(m4250);
        if (!eVar.mDetached) {
            this.f3605.m4312(eVar);
            eVar.mRemoving = false;
            if (eVar.mView == null) {
                eVar.mHiddenChanged = false;
            }
            if (m4149(eVar)) {
                this.f3606 = true;
            }
        }
        return m4250;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    void m4228(boolean z5) {
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null) {
                eVar.performMultiWindowModeChanged(z5);
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m4229(r rVar) {
        this.f3628.add(rVar);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    void m4230(Menu menu) {
        if (this.f3629 < 1) {
            return;
        }
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null) {
                eVar.performOptionsMenuClosed(menu);
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m4231(androidx.fragment.app.e eVar) {
        this.f3618.m4276(eVar);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m4232() {
        m4166(5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    int m4233() {
        return this.f3617.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* renamed from: ˊ, reason: contains not printable characters */
    void m4234(androidx.fragment.app.k<?> kVar, androidx.fragment.app.h hVar, androidx.fragment.app.e eVar) {
        String str;
        if (this.f3631 != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f3631 = kVar;
        this.f3633 = hVar;
        this.f3634 = eVar;
        if (eVar != null) {
            m4229(new i(eVar));
        } else if (kVar instanceof r) {
            m4229((r) kVar);
        }
        if (this.f3634 != null) {
            m4158();
        }
        if (kVar instanceof androidx.activity.s) {
            androidx.activity.s sVar = (androidx.activity.s) kVar;
            androidx.activity.q onBackPressedDispatcher = sVar.getOnBackPressedDispatcher();
            this.f3613 = onBackPressedDispatcher;
            androidx.lifecycle.p pVar = sVar;
            if (eVar != null) {
                pVar = eVar;
            }
            onBackPressedDispatcher.m425(pVar, this.f3615);
        }
        if (eVar != null) {
            this.f3618 = eVar.mFragmentManager.m4144(eVar);
        } else if (kVar instanceof s0) {
            this.f3618 = q.m4274(((s0) kVar).getViewModelStore());
        } else {
            this.f3618 = new q(false);
        }
        this.f3618.m4284(m4198());
        this.f3605.m4335(this.f3618);
        Object obj = this.f3631;
        if (obj instanceof c.e) {
            c.d mo383 = ((c.e) obj).mo383();
            if (eVar != null) {
                str = eVar.mWho + ":";
            } else {
                str = BuildConfig.FLAVOR;
            }
            String str2 = "FragmentManager:" + str;
            this.f3640 = mo383.m5735(str2 + "StartActivityForResult", new d.c(), new j());
            this.f3630 = mo383.m5735(str2 + "StartIntentSenderForResult", new k(), new a());
            this.f3632 = mo383.m5735(str2 + "RequestPermissions", new d.b(), new b());
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    boolean m4235(Menu menu) {
        boolean z5 = false;
        if (this.f3629 < 1) {
            return false;
        }
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null && m4195(eVar) && eVar.performPrepareOptionsMenu(menu)) {
                z5 = true;
            }
        }
        return z5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    void m4236(androidx.fragment.app.e eVar) {
        if (m4148(2)) {
            Log.v("FragmentManager", "attach: " + eVar);
        }
        if (eVar.mDetached) {
            eVar.mDetached = false;
            if (eVar.mAdded) {
                return;
            }
            this.f3605.m4312(eVar);
            if (m4148(2)) {
                Log.v("FragmentManager", "add from attach: " + eVar);
            }
            if (m4149(eVar)) {
                this.f3606 = true;
            }
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    void m4237(boolean z5) {
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null) {
                eVar.performPictureInPictureModeChanged(z5);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public v m4238() {
        return new androidx.fragment.app.a(this);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    void m4239() {
        this.f3604 = false;
        this.f3610 = false;
        this.f3618.m4284(false);
        m4166(7);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m4240() {
        m4158();
        m4159(this.f3635);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    boolean m4241() {
        boolean z5 = false;
        for (androidx.fragment.app.e eVar : this.f3605.m4323()) {
            if (eVar != null) {
                z5 = m4149(eVar);
            }
            if (z5) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m4242() {
        this.f3604 = false;
        this.f3610 = false;
        this.f3618.m4284(false);
        m4166(5);
    }

    /* renamed from: יי, reason: contains not printable characters */
    void m4243() {
        this.f3610 = true;
        this.f3618.m4284(true);
        m4166(4);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    boolean m4244(MenuItem menuItem) {
        if (this.f3629 < 1) {
            return false;
        }
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null && eVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    void m4245(InterfaceC0048n interfaceC0048n, boolean z5) {
        if (!z5) {
            if (this.f3631 == null) {
                if (!this.f3608) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            m4161();
        }
        synchronized (this.f3601) {
            if (this.f3631 == null) {
                if (!z5) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f3601.add(interfaceC0048n);
                m4220();
            }
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m4246() {
        this.f3604 = false;
        this.f3610 = false;
        this.f3618.m4284(false);
        m4166(1);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m4247(androidx.fragment.app.a aVar, boolean z5, boolean z6, boolean z7) {
        if (z5) {
            aVar.m3959(z7);
        } else {
            aVar.m3958();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z5));
        if (z6 && this.f3629 >= 1) {
            w.m4364(this.f3631.m4119(), this.f3633, arrayList, arrayList2, 0, 1, true, this.f3625);
        }
        if (z7) {
            m4203(this.f3629, true);
        }
        for (androidx.fragment.app.e eVar : this.f3605.m4323()) {
            if (eVar != null && eVar.mView != null && eVar.mIsNewlyAdded && aVar.m3962(eVar.mContainerId)) {
                float f5 = eVar.mPostponedAlpha;
                if (f5 > 0.0f) {
                    eVar.mView.setAlpha(f5);
                }
                if (z7) {
                    eVar.mPostponedAlpha = 0.0f;
                } else {
                    eVar.mPostponedAlpha = -1.0f;
                    eVar.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    boolean m4248(Menu menu, MenuInflater menuInflater) {
        if (this.f3629 < 1) {
            return false;
        }
        ArrayList<androidx.fragment.app.e> arrayList = null;
        boolean z5 = false;
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null && m4195(eVar) && eVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(eVar);
                z5 = true;
            }
        }
        if (this.f3609 != null) {
            for (int i5 = 0; i5 < this.f3609.size(); i5++) {
                androidx.fragment.app.e eVar2 = this.f3609.get(i5);
                if (arrayList == null || !arrayList.contains(eVar2)) {
                    eVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3609 = arrayList;
        return z5;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    void m4249() {
        m4166(2);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    t m4250(androidx.fragment.app.e eVar) {
        t m4324 = this.f3605.m4324(eVar.mWho);
        if (m4324 != null) {
            return m4324;
        }
        t tVar = new t(this.f3626, this.f3605, eVar);
        tVar.m4305(this.f3631.m4119().getClassLoader());
        tVar.m4309(this.f3629);
        return tVar;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m4251(androidx.fragment.app.e eVar) {
        if (m4148(2)) {
            Log.v("FragmentManager", "detach: " + eVar);
        }
        if (eVar.mDetached) {
            return;
        }
        eVar.mDetached = true;
        if (eVar.mAdded) {
            if (m4148(2)) {
                Log.v("FragmentManager", "remove from detach: " + eVar);
            }
            this.f3605.m4330(eVar);
            if (m4149(eVar)) {
                this.f3606 = true;
            }
            m4156(eVar);
        }
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    public void m4252(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f3605.m4316(str, fileDescriptor, printWriter, strArr);
        ArrayList<androidx.fragment.app.e> arrayList = this.f3609;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size2; i5++) {
                androidx.fragment.app.e eVar = this.f3609.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(eVar.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f3607;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size; i6++) {
                androidx.fragment.app.a aVar = this.f3607.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.m3956(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f3617.get());
        synchronized (this.f3601) {
            int size3 = this.f3601.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i7 = 0; i7 < size3; i7++) {
                    InterfaceC0048n interfaceC0048n = this.f3601.get(i7);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i7);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0048n);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3631);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3633);
        if (this.f3634 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3634);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3629);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3604);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3610);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3608);
        if (this.f3606) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3606);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m4253() {
        this.f3604 = false;
        this.f3610 = false;
        this.f3618.m4284(false);
        m4166(4);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m4254() {
        this.f3604 = false;
        this.f3610 = false;
        this.f3618.m4284(false);
        m4166(0);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void m4255(Configuration configuration) {
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null) {
                eVar.performConfigurationChanged(configuration);
            }
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    boolean m4256(MenuItem menuItem) {
        if (this.f3629 < 1) {
            return false;
        }
        for (androidx.fragment.app.e eVar : this.f3605.m4325()) {
            if (eVar != null && eVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* compiled from: FragmentManager.java */
    @SuppressLint({"BanParcelableUsage"})
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        String f3655;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f3656;

        /* compiled from: FragmentManager.java */
        class a implements Parcelable.Creator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public l[] newArray(int i5) {
                return new l[i5];
            }
        }

        l(String str, int i5) {
            this.f3655 = str;
            this.f3656 = i5;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            parcel.writeString(this.f3655);
            parcel.writeInt(this.f3656);
        }

        l(Parcel parcel) {
            this.f3655 = parcel.readString();
            this.f3656 = parcel.readInt();
        }
    }
}
