package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultItemAnimator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends m {

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static TimeInterpolator f4197;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ArrayList<RecyclerView.f0> f4198 = new ArrayList<>();

    /* renamed from: ˊ, reason: contains not printable characters */
    private ArrayList<RecyclerView.f0> f4199 = new ArrayList<>();

    /* renamed from: ˋ, reason: contains not printable characters */
    private ArrayList<j> f4200 = new ArrayList<>();

    /* renamed from: ˎ, reason: contains not printable characters */
    private ArrayList<i> f4201 = new ArrayList<>();

    /* renamed from: ˏ, reason: contains not printable characters */
    ArrayList<ArrayList<RecyclerView.f0>> f4202 = new ArrayList<>();

    /* renamed from: ˑ, reason: contains not printable characters */
    ArrayList<ArrayList<j>> f4203 = new ArrayList<>();

    /* renamed from: י, reason: contains not printable characters */
    ArrayList<ArrayList<i>> f4204 = new ArrayList<>();

    /* renamed from: ـ, reason: contains not printable characters */
    ArrayList<RecyclerView.f0> f4205 = new ArrayList<>();

    /* renamed from: ٴ, reason: contains not printable characters */
    ArrayList<RecyclerView.f0> f4206 = new ArrayList<>();

    /* renamed from: ᐧ, reason: contains not printable characters */
    ArrayList<RecyclerView.f0> f4207 = new ArrayList<>();

    /* renamed from: ᴵ, reason: contains not printable characters */
    ArrayList<RecyclerView.f0> f4208 = new ArrayList<>();

    /* compiled from: DefaultItemAnimator.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4209;

        a(ArrayList arrayList) {
            this.f4209 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4209.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.m5103(jVar.f4243, jVar.f4244, jVar.f4245, jVar.f4246, jVar.f4247);
            }
            this.f4209.clear();
            c.this.f4203.remove(this.f4209);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4211;

        b(ArrayList arrayList) {
            this.f4211 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4211.iterator();
            while (it.hasNext()) {
                c.this.m5102((i) it.next());
            }
            this.f4211.clear();
            c.this.f4204.remove(this.f4211);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0060c implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ArrayList f4213;

        RunnableC0060c(ArrayList arrayList) {
            this.f4213 = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4213.iterator();
            while (it.hasNext()) {
                c.this.m5104((RecyclerView.f0) it.next());
            }
            this.f4213.clear();
            c.this.f4202.remove(this.f4213);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class d extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ RecyclerView.f0 f4215;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f4216;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f4217;

        d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4215 = f0Var;
            this.f4216 = viewPropertyAnimator;
            this.f4217 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4216.setListener(null);
            this.f4217.setAlpha(1.0f);
            c.this.m5200(this.f4215);
            c.this.f4207.remove(this.f4215);
            c.this.m5107();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.m5210(this.f4215);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class e extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ RecyclerView.f0 f4219;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f4220;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f4221;

        e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4219 = f0Var;
            this.f4220 = view;
            this.f4221 = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4220.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4221.setListener(null);
            c.this.m5211(this.f4219);
            c.this.f4205.remove(this.f4219);
            c.this.m5107();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.m5212(this.f4219);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class f extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ RecyclerView.f0 f4223;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f4224;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f4225;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f4226;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f4227;

        f(RecyclerView.f0 f0Var, int i5, View view, int i6, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4223 = f0Var;
            this.f4224 = i5;
            this.f4225 = view;
            this.f4226 = i6;
            this.f4227 = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4224 != 0) {
                this.f4225.setTranslationX(0.0f);
            }
            if (this.f4226 != 0) {
                this.f4225.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4227.setListener(null);
            c.this.m5198(this.f4223);
            c.this.f4206.remove(this.f4223);
            c.this.m5107();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.m5201(this.f4223);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class g extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ i f4229;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f4230;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f4231;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4229 = iVar;
            this.f4230 = viewPropertyAnimator;
            this.f4231 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4230.setListener(null);
            this.f4231.setAlpha(1.0f);
            this.f4231.setTranslationX(0.0f);
            this.f4231.setTranslationY(0.0f);
            c.this.m5197(this.f4229.f4237, true);
            c.this.f4208.remove(this.f4229.f4237);
            c.this.m5107();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.m5199(this.f4229.f4237, true);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    class h extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ i f4233;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ViewPropertyAnimator f4234;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f4235;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4233 = iVar;
            this.f4234 = viewPropertyAnimator;
            this.f4235 = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4234.setListener(null);
            this.f4235.setAlpha(1.0f);
            this.f4235.setTranslationX(0.0f);
            this.f4235.setTranslationY(0.0f);
            c.this.m5197(this.f4233.f4238, false);
            c.this.f4208.remove(this.f4233.f4238);
            c.this.m5107();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.m5199(this.f4233.f4238, false);
        }
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class j {

        /* renamed from: ʻ, reason: contains not printable characters */
        public RecyclerView.f0 f4243;

        /* renamed from: ʼ, reason: contains not printable characters */
        public int f4244;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f4245;

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f4246;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f4247;

        j(RecyclerView.f0 f0Var, int i5, int i6, int i7, int i8) {
            this.f4243 = f0Var;
            this.f4244 = i5;
            this.f4245 = i6;
            this.f4246 = i7;
            this.f4247 = i8;
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private boolean m5097(i iVar, RecyclerView.f0 f0Var) {
        boolean z5 = false;
        if (iVar.f4238 == f0Var) {
            iVar.f4238 = null;
        } else {
            if (iVar.f4237 != f0Var) {
                return false;
            }
            iVar.f4237 = null;
            z5 = true;
        }
        f0Var.itemView.setAlpha(1.0f);
        f0Var.itemView.setTranslationX(0.0f);
        f0Var.itemView.setTranslationY(0.0f);
        m5197(f0Var, z5);
        return true;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private void m5098(RecyclerView.f0 f0Var) {
        if (f4197 == null) {
            f4197 = new ValueAnimator().getInterpolator();
        }
        f0Var.itemView.animate().setInterpolator(f4197);
        mo4842(f0Var);
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private void m5099(List<i> list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (m5097(iVar, f0Var) && iVar.f4237 == null && iVar.f4238 == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private void m5100(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4207.add(f0Var);
        animate.setDuration(m4847()).alpha(0.0f).setListener(new d(f0Var, animate, view)).start();
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private void m5101(i iVar) {
        RecyclerView.f0 f0Var = iVar.f4237;
        if (f0Var != null) {
            m5097(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f4238;
        if (f0Var2 != null) {
            m5097(iVar, f0Var2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ˈ */
    public boolean mo4839(RecyclerView.f0 f0Var, List<Object> list) {
        return !list.isEmpty() || super.mo4839(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ˋ */
    public void mo4842(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        view.animate().cancel();
        int size = this.f4200.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f4200.get(size).f4243 == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m5198(f0Var);
                this.f4200.remove(size);
            }
        }
        m5099(this.f4201, f0Var);
        if (this.f4198.remove(f0Var)) {
            view.setAlpha(1.0f);
            m5200(f0Var);
        }
        if (this.f4199.remove(f0Var)) {
            view.setAlpha(1.0f);
            m5211(f0Var);
        }
        for (int size2 = this.f4204.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.f4204.get(size2);
            m5099(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f4204.remove(size2);
            }
        }
        for (int size3 = this.f4203.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.f4203.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (arrayList2.get(size4).f4243 == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m5198(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f4203.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f4202.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.f0> arrayList3 = this.f4202.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                m5211(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f4202.remove(size5);
                }
            }
        }
        this.f4207.remove(f0Var);
        this.f4205.remove(f0Var);
        this.f4208.remove(f0Var);
        this.f4206.remove(f0Var);
        m5107();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ˎ */
    public void mo4843() {
        int size = this.f4200.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f4200.get(size);
            View view = jVar.f4243.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m5198(jVar.f4243);
            this.f4200.remove(size);
        }
        for (int size2 = this.f4198.size() - 1; size2 >= 0; size2--) {
            m5200(this.f4198.get(size2));
            this.f4198.remove(size2);
        }
        int size3 = this.f4199.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = this.f4199.get(size3);
            f0Var.itemView.setAlpha(1.0f);
            m5211(f0Var);
            this.f4199.remove(size3);
        }
        for (int size4 = this.f4201.size() - 1; size4 >= 0; size4--) {
            m5101(this.f4201.get(size4));
        }
        this.f4201.clear();
        if (mo4848()) {
            for (int size5 = this.f4203.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.f4203.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f4243.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m5198(jVar2.f4243);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f4203.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f4202.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.f0> arrayList2 = this.f4202.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = arrayList2.get(size8);
                    f0Var2.itemView.setAlpha(1.0f);
                    m5211(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f4202.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f4204.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.f4204.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m5101(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f4204.remove(arrayList3);
                    }
                }
            }
            m5105(this.f4207);
            m5105(this.f4206);
            m5105(this.f4205);
            m5105(this.f4208);
            m4841();
        }
    }

    /* renamed from: יי, reason: contains not printable characters */
    void m5102(i iVar) {
        RecyclerView.f0 f0Var = iVar.f4237;
        View view = f0Var == null ? null : f0Var.itemView;
        RecyclerView.f0 f0Var2 = iVar.f4238;
        View view2 = f0Var2 != null ? f0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m4845());
            this.f4208.add(iVar.f4237);
            duration.translationX(iVar.f4241 - iVar.f4239);
            duration.translationY(iVar.f4242 - iVar.f4240);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f4208.add(iVar.f4238);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m4845()).alpha(1.0f).setListener(new h(iVar, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ٴ */
    public boolean mo4848() {
        return (this.f4199.isEmpty() && this.f4201.isEmpty() && this.f4200.isEmpty() && this.f4198.isEmpty() && this.f4206.isEmpty() && this.f4207.isEmpty() && this.f4205.isEmpty() && this.f4208.isEmpty() && this.f4203.isEmpty() && this.f4202.isEmpty() && this.f4204.isEmpty()) ? false : true;
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    void m5103(RecyclerView.f0 f0Var, int i5, int i6, int i7, int i8) {
        View view = f0Var.itemView;
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i10 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f4206.add(f0Var);
        animate.setDuration(m4846()).setListener(new f(f0Var, i9, view, i10, animate)).start();
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    void m5104(RecyclerView.f0 f0Var) {
        View view = f0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f4205.add(f0Var);
        animate.alpha(1.0f).setDuration(m4844()).setListener(new e(f0Var, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* renamed from: ᵢ */
    public void mo4853() {
        boolean z5 = !this.f4198.isEmpty();
        boolean z6 = !this.f4200.isEmpty();
        boolean z7 = !this.f4201.isEmpty();
        boolean z8 = !this.f4199.isEmpty();
        if (z5 || z6 || z8 || z7) {
            Iterator<RecyclerView.f0> it = this.f4198.iterator();
            while (it.hasNext()) {
                m5100(it.next());
            }
            this.f4198.clear();
            if (z6) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.f4200);
                this.f4203.add(arrayList);
                this.f4200.clear();
                a aVar = new a(arrayList);
                if (z5) {
                    f1.m2823(arrayList.get(0).f4243.itemView, aVar, m4847());
                } else {
                    aVar.run();
                }
            }
            if (z7) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.f4201);
                this.f4204.add(arrayList2);
                this.f4201.clear();
                b bVar = new b(arrayList2);
                if (z5) {
                    f1.m2823(arrayList2.get(0).f4237.itemView, bVar, m4847());
                } else {
                    bVar.run();
                }
            }
            if (z8) {
                ArrayList<RecyclerView.f0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.f4199);
                this.f4202.add(arrayList3);
                this.f4199.clear();
                RunnableC0060c runnableC0060c = new RunnableC0060c(arrayList3);
                if (z5 || z6 || z7) {
                    f1.m2823(arrayList3.get(0).itemView, runnableC0060c, (z5 ? m4847() : 0L) + Math.max(z6 ? m4846() : 0L, z7 ? m4845() : 0L));
                } else {
                    runnableC0060c.run();
                }
            }
        }
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    void m5105(List<RecyclerView.f0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.m
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﹳ, reason: contains not printable characters */
    public boolean mo5106(RecyclerView.f0 f0Var) {
        m5098(f0Var);
        f0Var.itemView.setAlpha(0.0f);
        this.f4199.add(f0Var);
        return true;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    void m5107() {
        if (mo4848()) {
            return;
        }
        m4841();
    }

    @Override // androidx.recyclerview.widget.m
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﹶ, reason: contains not printable characters */
    public boolean mo5108(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i5, int i6, int i7, int i8) {
        if (f0Var == f0Var2) {
            return mo5109(f0Var, i5, i6, i7, i8);
        }
        float translationX = f0Var.itemView.getTranslationX();
        float translationY = f0Var.itemView.getTranslationY();
        float alpha = f0Var.itemView.getAlpha();
        m5098(f0Var);
        int i9 = (int) ((i7 - i5) - translationX);
        int i10 = (int) ((i8 - i6) - translationY);
        f0Var.itemView.setTranslationX(translationX);
        f0Var.itemView.setTranslationY(translationY);
        f0Var.itemView.setAlpha(alpha);
        if (f0Var2 != null) {
            m5098(f0Var2);
            f0Var2.itemView.setTranslationX(-i9);
            f0Var2.itemView.setTranslationY(-i10);
            f0Var2.itemView.setAlpha(0.0f);
        }
        this.f4201.add(new i(f0Var, f0Var2, i5, i6, i7, i8));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﾞ, reason: contains not printable characters */
    public boolean mo5109(RecyclerView.f0 f0Var, int i5, int i6, int i7, int i8) {
        View view = f0Var.itemView;
        int translationX = i5 + ((int) view.getTranslationX());
        int translationY = i6 + ((int) f0Var.itemView.getTranslationY());
        m5098(f0Var);
        int i9 = i7 - translationX;
        int i10 = i8 - translationY;
        if (i9 == 0 && i10 == 0) {
            m5198(f0Var);
            return false;
        }
        if (i9 != 0) {
            view.setTranslationX(-i9);
        }
        if (i10 != 0) {
            view.setTranslationY(-i10);
        }
        this.f4200.add(new j(f0Var, translationX, translationY, i7, i8));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    @SuppressLint({"UnknownNullness"})
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean mo5110(RecyclerView.f0 f0Var) {
        m5098(f0Var);
        this.f4198.add(f0Var);
        return true;
    }

    /* compiled from: DefaultItemAnimator.java */
    private static class i {

        /* renamed from: ʻ, reason: contains not printable characters */
        public RecyclerView.f0 f4237;

        /* renamed from: ʼ, reason: contains not printable characters */
        public RecyclerView.f0 f4238;

        /* renamed from: ʽ, reason: contains not printable characters */
        public int f4239;

        /* renamed from: ʾ, reason: contains not printable characters */
        public int f4240;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f4241;

        /* renamed from: ˆ, reason: contains not printable characters */
        public int f4242;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f4237 = f0Var;
            this.f4238 = f0Var2;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4237 + ", newHolder=" + this.f4238 + ", fromX=" + this.f4239 + ", fromY=" + this.f4240 + ", toX=" + this.f4241 + ", toY=" + this.f4242 + '}';
        }

        i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i5, int i6, int i7, int i8) {
            this(f0Var, f0Var2);
            this.f4239 = i5;
            this.f4240 = i6;
            this.f4241 = i7;
            this.f4242 = i8;
        }
    }
}
