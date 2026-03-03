package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModelStore.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class r0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<String, n0> f3871 = new LinkedHashMap();

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m4492() {
        Iterator<n0> it = this.f3871.values().iterator();
        while (it.hasNext()) {
            it.next().m4462();
        }
        this.f3871.clear();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final n0 m4493(String str) {
        f4.k.m8623(str, "key");
        return this.f3871.get(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final Set<String> m4494() {
        return new HashSet(this.f3871.keySet());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m4495(String str, n0 n0Var) {
        f4.k.m8623(str, "key");
        f4.k.m8623(n0Var, "viewModel");
        n0 put = this.f3871.put(str, n0Var);
        if (put != null) {
            put.mo4275();
        }
    }
}
