package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r1.b;
import r1.p;
import r1.q;
import r1.v;

/* compiled from: RequestManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l implements ComponentCallbacks2, r1.l {

    /* renamed from: ٴ, reason: contains not printable characters */
    private static final u1.g f5182 = u1.g.m12174(Bitmap.class).m12123();

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static final u1.g f5183 = u1.g.m12174(p1.c.class).m12123();

    /* renamed from: ᴵ, reason: contains not printable characters */
    private static final u1.g f5184 = u1.g.m12175(e1.j.f7452).m12145(g.LOW).m12105(true);

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final com.bumptech.glide.b f5185;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected final Context f5186;

    /* renamed from: ˆ, reason: contains not printable characters */
    final r1.j f5187;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final q f5188;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final p f5189;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final v f5190;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final Runnable f5191;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final r1.b f5192;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<u1.f<Object>> f5193;

    /* renamed from: ˑ, reason: contains not printable characters */
    private u1.g f5194;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f5195;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f5196;

    /* compiled from: RequestManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f5187.mo11631(lVar);
        }
    }

    /* compiled from: RequestManager.java */
    private class b implements b.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final q f5198;

        b(q qVar) {
            this.f5198 = qVar;
        }

        @Override // r1.b.a
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo6109(boolean z5) {
            if (z5) {
                synchronized (l.this) {
                    this.f5198.m11657();
                }
            }
        }
    }

    public l(com.bumptech.glide.b bVar, r1.j jVar, p pVar, Context context) {
        this(bVar, jVar, pVar, new q(), bVar.m6022(), context);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private synchronized void m6089() {
        Iterator<v1.h<?>> it = this.f5190.m11677().iterator();
        while (it.hasNext()) {
            m6097(it.next());
        }
        this.f5190.m11676();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m6090(v1.h<?> hVar) {
        boolean m6099 = m6099(hVar);
        u1.d mo12288 = hVar.mo12288();
        if (m6099 || this.f5185.m6028(hVar) || mo12288 == null) {
            return;
        }
        hVar.mo12289(null);
        mo12288.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        if (i5 == 60 && this.f5195) {
            m6104();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f5188 + ", treeNode=" + this.f5189 + "}";
    }

    @Override // r1.l
    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized void mo6091() {
        m6106();
        this.f5190.mo6091();
    }

    @Override // r1.l
    /* renamed from: ʽ, reason: contains not printable characters */
    public synchronized void mo6092() {
        this.f5190.mo6092();
        if (this.f5196) {
            m6089();
        } else {
            m6105();
        }
    }

    @Override // r1.l
    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized void mo6093() {
        this.f5190.mo6093();
        m6089();
        this.f5188.m11654();
        this.f5187.mo11630(this);
        this.f5187.mo11630(this.f5192);
        y1.l.m12916(this.f5191);
        this.f5185.m6030(this);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public <ResourceType> k<ResourceType> m6094(Class<ResourceType> cls) {
        return new k<>(this.f5185, this, cls, this.f5186);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public k<Bitmap> m6095() {
        return m6094(Bitmap.class).mo6079(f5182);
    }

    /* renamed from: י, reason: contains not printable characters */
    public k<Drawable> m6096() {
        return m6094(Drawable.class);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m6097(v1.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        m6090(hVar);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    List<u1.f<Object>> m6098() {
        return this.f5193;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    synchronized boolean m6099(v1.h<?> hVar) {
        u1.d mo12288 = hVar.mo12288();
        if (mo12288 == null) {
            return true;
        }
        if (!this.f5188.m11653(mo12288)) {
            return false;
        }
        this.f5190.m11679(hVar);
        hVar.mo12289(null);
        return true;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    synchronized u1.g m6100() {
        return this.f5194;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    <T> m<?, T> m6101(Class<T> cls) {
        return this.f5185.m6024().m6037(cls);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public k<Drawable> m6102(String str) {
        return m6096().m6087(str);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public synchronized void m6103() {
        this.f5188.m11655();
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public synchronized void m6104() {
        m6103();
        Iterator<l> it = this.f5189.mo11636().iterator();
        while (it.hasNext()) {
            it.next().m6103();
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public synchronized void m6105() {
        this.f5188.m11656();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public synchronized void m6106() {
        this.f5188.m11658();
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    protected synchronized void m6107(u1.g gVar) {
        this.f5194 = gVar.clone().m12112();
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    synchronized void m6108(v1.h<?> hVar, u1.d dVar) {
        this.f5190.m11678(hVar);
        this.f5188.m11659(dVar);
    }

    l(com.bumptech.glide.b bVar, r1.j jVar, p pVar, q qVar, r1.c cVar, Context context) {
        this.f5190 = new v();
        a aVar = new a();
        this.f5191 = aVar;
        this.f5185 = bVar;
        this.f5187 = jVar;
        this.f5189 = pVar;
        this.f5188 = qVar;
        this.f5186 = context;
        r1.b mo11632 = cVar.mo11632(context.getApplicationContext(), new b(qVar));
        this.f5192 = mo11632;
        bVar.m6027(this);
        if (y1.l.m12911()) {
            y1.l.m12915(aVar);
        } else {
            jVar.mo11631(this);
        }
        jVar.mo11631(mo11632);
        this.f5193 = new CopyOnWriteArrayList<>(bVar.m6024().m6035());
        m6107(bVar.m6024().m6036());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }
}
