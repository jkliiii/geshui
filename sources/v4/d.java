package v4;

import java.util.LinkedHashSet;
import java.util.Set;
import s4.c0;

/* compiled from: RouteDatabase.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<c0> f11755 = new LinkedHashSet();

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized void m12408(c0 c0Var) {
        this.f11755.remove(c0Var);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized void m12409(c0 c0Var) {
        this.f11755.add(c0Var);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public synchronized boolean m12410(c0 c0Var) {
        return this.f11755.contains(c0Var);
    }
}
