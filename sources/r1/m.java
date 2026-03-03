package r1;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r1.o;

/* compiled from: LifecycleRequestManagerRetriever.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class m {

    /* renamed from: ʻ, reason: contains not printable characters */
    final Map<androidx.lifecycle.l, com.bumptech.glide.l> f10775 = new HashMap();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final o.b f10776;

    /* compiled from: LifecycleRequestManagerRetriever.java */
    private final class b implements p {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.fragment.app.n f10779;

        b(androidx.fragment.app.n nVar) {
            this.f10779 = nVar;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m11640(androidx.fragment.app.n nVar, Set<com.bumptech.glide.l> set) {
            List<androidx.fragment.app.e> m4182 = nVar.m4182();
            int size = m4182.size();
            for (int i5 = 0; i5 < size; i5++) {
                androidx.fragment.app.e eVar = m4182.get(i5);
                m11640(eVar.getChildFragmentManager(), set);
                com.bumptech.glide.l m11638 = m.this.m11638(eVar.getLifecycle());
                if (m11638 != null) {
                    set.add(m11638);
                }
            }
        }

        @Override // r1.p
        /* renamed from: ʻ */
        public Set<com.bumptech.glide.l> mo11636() {
            HashSet hashSet = new HashSet();
            m11640(this.f10779, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f10776 = bVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    com.bumptech.glide.l m11638(androidx.lifecycle.l lVar) {
        y1.l.m12895();
        return this.f10775.get(lVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    com.bumptech.glide.l m11639(Context context, com.bumptech.glide.b bVar, androidx.lifecycle.l lVar, androidx.fragment.app.n nVar, boolean z5) {
        y1.l.m12895();
        com.bumptech.glide.l m11638 = m11638(lVar);
        if (m11638 != null) {
            return m11638;
        }
        k kVar = new k(lVar);
        com.bumptech.glide.l mo11652 = this.f10776.mo11652(bVar, kVar, new b(nVar), context);
        this.f10775.put(lVar, mo11652);
        kVar.mo11631(new a(lVar));
        if (z5) {
            mo11652.mo6091();
        }
        return mo11652;
    }

    /* compiled from: LifecycleRequestManagerRetriever.java */
    class a implements l {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ androidx.lifecycle.l f10777;

        a(androidx.lifecycle.l lVar) {
            this.f10777 = lVar;
        }

        @Override // r1.l
        /* renamed from: ʾ */
        public void mo6093() {
            m.this.f10775.remove(this.f10777);
        }

        @Override // r1.l
        /* renamed from: ʼ */
        public void mo6091() {
        }

        @Override // r1.l
        /* renamed from: ʽ */
        public void mo6092() {
        }
    }
}
