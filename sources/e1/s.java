package e1;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class s {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<c1.f, l<?>> f7539 = new HashMap();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Map<c1.f, l<?>> f7540 = new HashMap();

    s() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private Map<c1.f, l<?>> m8430(boolean z5) {
        return z5 ? this.f7540 : this.f7539;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    l<?> m8431(c1.f fVar, boolean z5) {
        return m8430(z5).get(fVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m8432(c1.f fVar, l<?> lVar) {
        m8430(lVar.m8400()).put(fVar, lVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m8433(c1.f fVar, l<?> lVar) {
        Map<c1.f, l<?>> m8430 = m8430(lVar.m8400());
        if (lVar.equals(m8430.get(fVar))) {
            m8430.remove(fVar);
        }
    }
}
