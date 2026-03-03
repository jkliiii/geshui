package e1;

import com.bumptech.glide.i;
import e1.h;
import i1.o;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class g<Transcode> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<o.a<?>> f7373 = new ArrayList();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<c1.f> f7374 = new ArrayList();

    /* renamed from: ʽ, reason: contains not printable characters */
    private com.bumptech.glide.d f7375;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Object f7376;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f7377;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f7378;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Class<?> f7379;

    /* renamed from: ˉ, reason: contains not printable characters */
    private h.e f7380;

    /* renamed from: ˊ, reason: contains not printable characters */
    private c1.h f7381;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Map<Class<?>, c1.l<?>> f7382;

    /* renamed from: ˎ, reason: contains not printable characters */
    private Class<Transcode> f7383;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f7384;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f7385;

    /* renamed from: י, reason: contains not printable characters */
    private c1.f f7386;

    /* renamed from: ـ, reason: contains not printable characters */
    private com.bumptech.glide.g f7387;

    /* renamed from: ٴ, reason: contains not printable characters */
    private j f7388;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f7389;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f7390;

    g() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m8295() {
        this.f7375 = null;
        this.f7376 = null;
        this.f7386 = null;
        this.f7379 = null;
        this.f7383 = null;
        this.f7381 = null;
        this.f7387 = null;
        this.f7382 = null;
        this.f7388 = null;
        this.f7373.clear();
        this.f7384 = false;
        this.f7374.clear();
        this.f7385 = false;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    f1.b m8296() {
        return this.f7375.m6034();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    List<c1.f> m8297() {
        if (!this.f7385) {
            this.f7385 = true;
            this.f7374.clear();
            List<o.a<?>> m8301 = m8301();
            int size = m8301.size();
            for (int i5 = 0; i5 < size; i5++) {
                o.a<?> aVar = m8301.get(i5);
                if (!this.f7374.contains(aVar.f8511)) {
                    this.f7374.add(aVar.f8511);
                }
                for (int i6 = 0; i6 < aVar.f8512.size(); i6++) {
                    if (!this.f7374.contains(aVar.f8512.get(i6))) {
                        this.f7374.add(aVar.f8512.get(i6));
                    }
                }
            }
        }
        return this.f7374;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    g1.a m8298() {
        return this.f7380.mo8355();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    j m8299() {
        return this.f7388;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    int m8300() {
        return this.f7378;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    List<o.a<?>> m8301() {
        if (!this.f7384) {
            this.f7384 = true;
            this.f7373.clear();
            List m6055 = this.f7375.m6041().m6055(this.f7376);
            int size = m6055.size();
            for (int i5 = 0; i5 < size; i5++) {
                o.a<?> mo9113 = ((i1.o) m6055.get(i5)).mo9113(this.f7376, this.f7377, this.f7378, this.f7381);
                if (mo9113 != null) {
                    this.f7373.add(mo9113);
                }
            }
        }
        return this.f7373;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    <Data> t<Data, ?, Transcode> m8302(Class<Data> cls) {
        return this.f7375.m6041().m6054(cls, this.f7379, this.f7383);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    Class<?> m8303() {
        return this.f7376.getClass();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    List<i1.o<File, ?>> m8304(File file) throws i.c {
        return this.f7375.m6041().m6055(file);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    c1.h m8305() {
        return this.f7381;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    com.bumptech.glide.g m8306() {
        return this.f7387;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    List<Class<?>> m8307() {
        return this.f7375.m6041().m6056(this.f7376.getClass(), this.f7379, this.f7383);
    }

    /* renamed from: י, reason: contains not printable characters */
    <Z> c1.k<Z> m8308(v<Z> vVar) {
        return this.f7375.m6041().m6057(vVar);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    <T> com.bumptech.glide.load.data.e<T> m8309(T t5) {
        return this.f7375.m6041().m6058(t5);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    c1.f m8310() {
        return this.f7386;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    <X> c1.d<X> m8311(X x5) throws i.e {
        return this.f7375.m6041().m6059(x5);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    Class<?> m8312() {
        return this.f7383;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    <Z> c1.l<Z> m8313(Class<Z> cls) {
        c1.l<Z> lVar = (c1.l) this.f7382.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, c1.l<?>>> it = this.f7382.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, c1.l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    lVar = (c1.l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f7382.isEmpty() || !this.f7389) {
            return k1.p.m9354();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    int m8314() {
        return this.f7377;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᵢ, reason: contains not printable characters */
    boolean m8315(Class<?> cls) {
        return m8302(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ⁱ, reason: contains not printable characters */
    <R> void m8316(com.bumptech.glide.d dVar, Object obj, c1.f fVar, int i5, int i6, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, c1.h hVar, Map<Class<?>, c1.l<?>> map, boolean z5, boolean z6, h.e eVar) {
        this.f7375 = dVar;
        this.f7376 = obj;
        this.f7386 = fVar;
        this.f7377 = i5;
        this.f7378 = i6;
        this.f7388 = jVar;
        this.f7379 = cls;
        this.f7380 = eVar;
        this.f7383 = cls2;
        this.f7387 = gVar;
        this.f7381 = hVar;
        this.f7382 = map;
        this.f7389 = z5;
        this.f7390 = z6;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    boolean m8317(v<?> vVar) {
        return this.f7375.m6041().m6060(vVar);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    boolean m8318() {
        return this.f7390;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    boolean m8319(c1.f fVar) {
        List<o.a<?>> m8301 = m8301();
        int size = m8301.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (m8301.get(i5).f8511.equals(fVar)) {
                return true;
            }
        }
        return false;
    }
}
