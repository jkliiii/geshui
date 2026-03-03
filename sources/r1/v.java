package r1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class v implements l {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Set<v1.h<?>> f10817 = Collections.newSetFromMap(new WeakHashMap());

    @Override // r1.l
    /* renamed from: ʼ */
    public void mo6091() {
        Iterator it = y1.l.m12904(this.f10817).iterator();
        while (it.hasNext()) {
            ((v1.h) it.next()).mo6091();
        }
    }

    @Override // r1.l
    /* renamed from: ʽ */
    public void mo6092() {
        Iterator it = y1.l.m12904(this.f10817).iterator();
        while (it.hasNext()) {
            ((v1.h) it.next()).mo6092();
        }
    }

    @Override // r1.l
    /* renamed from: ʾ */
    public void mo6093() {
        Iterator it = y1.l.m12904(this.f10817).iterator();
        while (it.hasNext()) {
            ((v1.h) it.next()).mo6093();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public void m11676() {
        this.f10817.clear();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public List<v1.h<?>> m11677() {
        return y1.l.m12904(this.f10817);
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m11678(v1.h<?> hVar) {
        this.f10817.add(hVar);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m11679(v1.h<?> hVar) {
        this.f10817.remove(hVar);
    }
}
