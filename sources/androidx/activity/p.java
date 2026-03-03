package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: OnBackPressedCallback.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class p {

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f256;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final CopyOnWriteArrayList<c> f257 = new CopyOnWriteArrayList<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private e4.a<v3.p> f258;

    public p(boolean z5) {
        this.f256 = z5;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m402(c cVar) {
        f4.k.m8623(cVar, "cancellable");
        this.f257.add(cVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final e4.a<v3.p> m403() {
        return this.f258;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public abstract void mo405();

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m406(b bVar) {
        f4.k.m8623(bVar, "backEvent");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m407(b bVar) {
        f4.k.m8623(bVar, "backEvent");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final boolean m408() {
        return this.f256;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m409() {
        Iterator<T> it = this.f257.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m410(c cVar) {
        f4.k.m8623(cVar, "cancellable");
        this.f257.remove(cVar);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m411(boolean z5) {
        this.f256 = z5;
        e4.a<v3.p> aVar = this.f258;
        if (aVar != null) {
            aVar.mo368();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m412(e4.a<v3.p> aVar) {
        this.f258 = aVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m404() {
    }
}
