package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.q;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u extends q {

    /* renamed from: ˆ, reason: contains not printable characters */
    int f4571;

    /* renamed from: ʾ, reason: contains not printable characters */
    private ArrayList<q> f4569 = new ArrayList<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f4570 = true;

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f4572 = false;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f4573 = 0;

    /* compiled from: TransitionSet.java */
    class a extends r {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ q f4574;

        a(q qVar) {
            this.f4574 = qVar;
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            this.f4574.runAnimators();
            qVar.removeListener(this);
        }
    }

    /* compiled from: TransitionSet.java */
    static class b extends r {

        /* renamed from: ʾ, reason: contains not printable characters */
        u f4576;

        b(u uVar) {
            this.f4576 = uVar;
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʻ */
        public void mo5348(q qVar) {
            u uVar = this.f4576;
            if (uVar.f4572) {
                return;
            }
            uVar.start();
            this.f4576.f4572 = true;
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ */
        public void mo5337(q qVar) {
            u uVar = this.f4576;
            int i5 = uVar.f4571 - 1;
            uVar.f4571 = i5;
            if (i5 == 0) {
                uVar.f4572 = false;
                uVar.end();
            }
            qVar.removeListener(this);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m5400(q qVar) {
        this.f4569.add(qVar);
        qVar.mParent = this;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private void m5401() {
        b bVar = new b(this);
        Iterator<q> it = this.f4569.iterator();
        while (it.hasNext()) {
            it.next().addListener(bVar);
        }
        this.f4571 = this.f4569.size();
    }

    @Override // androidx.transition.q
    protected void cancel() {
        super.cancel();
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).cancel();
        }
    }

    @Override // androidx.transition.q
    public void captureEndValues(x xVar) {
        if (isValidTarget(xVar.f4581)) {
            Iterator<q> it = this.f4569.iterator();
            while (it.hasNext()) {
                q next = it.next();
                if (next.isValidTarget(xVar.f4581)) {
                    next.captureEndValues(xVar);
                    xVar.f4582.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.q
    void capturePropagationValues(x xVar) {
        super.capturePropagationValues(xVar);
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).capturePropagationValues(xVar);
        }
    }

    @Override // androidx.transition.q
    public void captureStartValues(x xVar) {
        if (isValidTarget(xVar.f4581)) {
            Iterator<q> it = this.f4569.iterator();
            while (it.hasNext()) {
                q next = it.next();
                if (next.isValidTarget(xVar.f4581)) {
                    next.captureStartValues(xVar);
                    xVar.f4582.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.q
    protected void createAnimators(ViewGroup viewGroup, y yVar, y yVar2, ArrayList<x> arrayList, ArrayList<x> arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            q qVar = this.f4569.get(i5);
            if (startDelay > 0 && (this.f4570 || i5 == 0)) {
                long startDelay2 = qVar.getStartDelay();
                if (startDelay2 > 0) {
                    qVar.setStartDelay(startDelay2 + startDelay);
                } else {
                    qVar.setStartDelay(startDelay);
                }
            }
            qVar.createAnimators(viewGroup, yVar, yVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.q
    public q excludeTarget(View view, boolean z5) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).excludeTarget(view, z5);
        }
        return super.excludeTarget(view, z5);
    }

    @Override // androidx.transition.q
    void forceToEnd(ViewGroup viewGroup) {
        super.forceToEnd(viewGroup);
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).forceToEnd(viewGroup);
        }
    }

    @Override // androidx.transition.q
    public void pause(View view) {
        super.pause(view);
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).pause(view);
        }
    }

    @Override // androidx.transition.q
    public void resume(View view) {
        super.resume(view);
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).resume(view);
        }
    }

    @Override // androidx.transition.q
    protected void runAnimators() {
        if (this.f4569.isEmpty()) {
            start();
            end();
            return;
        }
        m5401();
        if (this.f4570) {
            Iterator<q> it = this.f4569.iterator();
            while (it.hasNext()) {
                it.next().runAnimators();
            }
            return;
        }
        for (int i5 = 1; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5 - 1).addListener(new a(this.f4569.get(i5)));
        }
        q qVar = this.f4569.get(0);
        if (qVar != null) {
            qVar.runAnimators();
        }
    }

    @Override // androidx.transition.q
    void setCanRemoveViews(boolean z5) {
        super.setCanRemoveViews(z5);
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).setCanRemoveViews(z5);
        }
    }

    @Override // androidx.transition.q
    public void setEpicenterCallback(q.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f4573 |= 8;
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).setEpicenterCallback(fVar);
        }
    }

    @Override // androidx.transition.q
    public void setPathMotion(h hVar) {
        super.setPathMotion(hVar);
        this.f4573 |= 4;
        if (this.f4569 != null) {
            for (int i5 = 0; i5 < this.f4569.size(); i5++) {
                this.f4569.get(i5).setPathMotion(hVar);
            }
        }
    }

    @Override // androidx.transition.q
    public void setPropagation(t tVar) {
        super.setPropagation(tVar);
        this.f4573 |= 2;
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).setPropagation(tVar);
        }
    }

    @Override // androidx.transition.q
    String toString(String str) {
        String qVar = super.toString(str);
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            StringBuilder sb = new StringBuilder();
            sb.append(qVar);
            sb.append("\n");
            sb.append(this.f4569.get(i5).toString(str + "  "));
            qVar = sb.toString();
        }
        return qVar;
    }

    @Override // androidx.transition.q
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u addListener(q.g gVar) {
        return (u) super.addListener(gVar);
    }

    @Override // androidx.transition.q
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u addTarget(int i5) {
        for (int i6 = 0; i6 < this.f4569.size(); i6++) {
            this.f4569.get(i6).addTarget(i5);
        }
        return (u) super.addTarget(i5);
    }

    @Override // androidx.transition.q
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u addTarget(View view) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).addTarget(view);
        }
        return (u) super.addTarget(view);
    }

    @Override // androidx.transition.q
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u addTarget(Class<?> cls) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).addTarget(cls);
        }
        return (u) super.addTarget(cls);
    }

    @Override // androidx.transition.q
    /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u addTarget(String str) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).addTarget(str);
        }
        return (u) super.addTarget(str);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public u m5407(q qVar) {
        m5400(qVar);
        long j5 = this.mDuration;
        if (j5 >= 0) {
            qVar.setDuration(j5);
        }
        if ((this.f4573 & 1) != 0) {
            qVar.setInterpolator(getInterpolator());
        }
        if ((this.f4573 & 2) != 0) {
            getPropagation();
            qVar.setPropagation(null);
        }
        if ((this.f4573 & 4) != 0) {
            qVar.setPathMotion(getPathMotion());
        }
        if ((this.f4573 & 8) != 0) {
            qVar.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public q m5408(int i5) {
        if (i5 < 0 || i5 >= this.f4569.size()) {
            return null;
        }
        return this.f4569.get(i5);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m5409() {
        return this.f4569.size();
    }

    @Override // androidx.transition.q
    /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u removeListener(q.g gVar) {
        return (u) super.removeListener(gVar);
    }

    @Override // androidx.transition.q
    /* renamed from: ˑ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u removeTarget(int i5) {
        for (int i6 = 0; i6 < this.f4569.size(); i6++) {
            this.f4569.get(i6).removeTarget(i5);
        }
        return (u) super.removeTarget(i5);
    }

    @Override // androidx.transition.q
    /* renamed from: י, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u removeTarget(View view) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).removeTarget(view);
        }
        return (u) super.removeTarget(view);
    }

    @Override // androidx.transition.q
    /* renamed from: ـ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u removeTarget(Class<?> cls) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).removeTarget(cls);
        }
        return (u) super.removeTarget(cls);
    }

    @Override // androidx.transition.q
    /* renamed from: ٴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u removeTarget(String str) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).removeTarget(str);
        }
        return (u) super.removeTarget(str);
    }

    @Override // androidx.transition.q
    /* renamed from: ᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u setDuration(long j5) {
        ArrayList<q> arrayList;
        super.setDuration(j5);
        if (this.mDuration >= 0 && (arrayList = this.f4569) != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f4569.get(i5).setDuration(j5);
            }
        }
        return this;
    }

    @Override // androidx.transition.q
    /* renamed from: ᴵ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u setInterpolator(TimeInterpolator timeInterpolator) {
        this.f4573 |= 1;
        ArrayList<q> arrayList = this.f4569;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f4569.get(i5).setInterpolator(timeInterpolator);
            }
        }
        return (u) super.setInterpolator(timeInterpolator);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public u m5417(int i5) {
        if (i5 == 0) {
            this.f4570 = true;
        } else {
            if (i5 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i5);
            }
            this.f4570 = false;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.transition.q
    /* renamed from: ᵔ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u setSceneRoot(ViewGroup viewGroup) {
        super.setSceneRoot(viewGroup);
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f4569.get(i5).setSceneRoot(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.q
    /* renamed from: ᵢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public u setStartDelay(long j5) {
        return (u) super.setStartDelay(j5);
    }

    @Override // androidx.transition.q
    /* renamed from: clone */
    public q mo5389clone() {
        u uVar = (u) super.mo5389clone();
        uVar.f4569 = new ArrayList<>();
        int size = this.f4569.size();
        for (int i5 = 0; i5 < size; i5++) {
            uVar.m5400(this.f4569.get(i5).mo5389clone());
        }
        return uVar;
    }

    @Override // androidx.transition.q
    public q excludeTarget(String str, boolean z5) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).excludeTarget(str, z5);
        }
        return super.excludeTarget(str, z5);
    }

    @Override // androidx.transition.q
    public q excludeTarget(int i5, boolean z5) {
        for (int i6 = 0; i6 < this.f4569.size(); i6++) {
            this.f4569.get(i6).excludeTarget(i5, z5);
        }
        return super.excludeTarget(i5, z5);
    }

    @Override // androidx.transition.q
    public q excludeTarget(Class<?> cls, boolean z5) {
        for (int i5 = 0; i5 < this.f4569.size(); i5++) {
            this.f4569.get(i5).excludeTarget(cls, z5);
        }
        return super.excludeTarget(cls, z5);
    }
}
