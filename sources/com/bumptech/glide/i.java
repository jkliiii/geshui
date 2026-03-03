package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import e1.t;
import e1.v;
import i1.o;
import i1.p;
import i1.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: Registry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final q f5151;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final t1.a f5152;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final t1.e f5153;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final t1.f f5154;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final com.bumptech.glide.load.data.f f5155;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final q1.f f5156;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final t1.b f5157;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final t1.d f5158 = new t1.d();

    /* renamed from: ˊ, reason: contains not printable characters */
    private final t1.c f5159 = new t1.c();

    /* renamed from: ˋ, reason: contains not printable characters */
    private final androidx.core.util.e<List<Throwable>> f5160;

    /* compiled from: Registry.java */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Registry.java */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry.java */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m5, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m5);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry.java */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry.java */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        androidx.core.util.e<List<Throwable>> m13138 = z1.a.m13138();
        this.f5160 = m13138;
        this.f5151 = new q(m13138);
        this.f5152 = new t1.a();
        this.f5153 = new t1.e();
        this.f5154 = new t1.f();
        this.f5155 = new com.bumptech.glide.load.data.f();
        this.f5156 = new q1.f();
        this.f5157 = new t1.b();
        m6064(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private <Data, TResource, Transcode> List<e1.i<Data, TResource, Transcode>> m6047(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f5153.m12039(cls, cls2)) {
            for (Class cls5 : this.f5156.m11470(cls4, cls3)) {
                arrayList.add(new e1.i(cls, cls4, cls5, this.f5153.m12038(cls, cls4), this.f5156.m11469(cls4, cls5), this.f5160));
            }
        }
        return arrayList;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public <Data> i m6048(Class<Data> cls, c1.d<Data> dVar) {
        this.f5152.m12025(cls, dVar);
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public <TResource> i m6049(Class<TResource> cls, c1.k<TResource> kVar) {
        this.f5154.m12042(cls, kVar);
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public <Data, TResource> i m6050(Class<Data> cls, Class<TResource> cls2, c1.j<Data, TResource> jVar) {
        m6052("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public <Model, Data> i m6051(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        this.f5151.m9179(cls, cls2, pVar);
        return this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public <Data, TResource> i m6052(String str, Class<Data> cls, Class<TResource> cls2, c1.j<Data, TResource> jVar) {
        this.f5153.m12037(str, jVar, cls, cls2);
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public List<ImageHeaderParser> m6053() {
        List<ImageHeaderParser> m12029 = this.f5157.m12029();
        if (m12029.isEmpty()) {
            throw new b();
        }
        return m12029;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public <Data, TResource, Transcode> t<Data, TResource, Transcode> m6054(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> m12031 = this.f5159.m12031(cls, cls2, cls3);
        if (this.f5159.m12032(m12031)) {
            return null;
        }
        if (m12031 == null) {
            List<e1.i<Data, TResource, Transcode>> m6047 = m6047(cls, cls2, cls3);
            m12031 = m6047.isEmpty() ? null : new t<>(cls, cls2, cls3, m6047, this.f5160);
            this.f5159.m12033(cls, cls2, cls3, m12031);
        }
        return m12031;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public <Model> List<o<Model, ?>> m6055(Model model) {
        return this.f5151.m9181(model);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public <Model, TResource, Transcode> List<Class<?>> m6056(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m12034 = this.f5158.m12034(cls, cls2, cls3);
        if (m12034 == null) {
            m12034 = new ArrayList<>();
            Iterator<Class<?>> it = this.f5151.m9180(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f5153.m12039(it.next(), cls2)) {
                    if (!this.f5156.m11470(cls4, cls3).isEmpty() && !m12034.contains(cls4)) {
                        m12034.add(cls4);
                    }
                }
            }
            this.f5158.m12035(cls, cls2, cls3, Collections.unmodifiableList(m12034));
        }
        return m12034;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public <X> c1.k<X> m6057(v<X> vVar) throws d {
        c1.k<X> m12043 = this.f5154.m12043(vVar.mo8412());
        if (m12043 != null) {
            return m12043;
        }
        throw new d(vVar.mo8412());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public <X> com.bumptech.glide.load.data.e<X> m6058(X x5) {
        return this.f5155.m6147(x5);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public <X> c1.d<X> m6059(X x5) throws e {
        c1.d<X> m12026 = this.f5152.m12026(x5.getClass());
        if (m12026 != null) {
            return m12026;
        }
        throw new e(x5.getClass());
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m6060(v<?> vVar) {
        return this.f5154.m12043(vVar.mo8412()) != null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public i m6061(ImageHeaderParser imageHeaderParser) {
        this.f5157.m12028(imageHeaderParser);
        return this;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public i m6062(e.a<?> aVar) {
        this.f5155.m6148(aVar);
        return this;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public <TResource, Transcode> i m6063(Class<TResource> cls, Class<Transcode> cls2, q1.e<TResource, Transcode> eVar) {
        this.f5156.m11471(cls, cls2, eVar);
        return this;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public final i m6064(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add("legacy_append");
        this.f5153.m12040(arrayList);
        return this;
    }
}
