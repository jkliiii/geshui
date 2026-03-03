package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class q extends n0 {

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final o0.b f3672 = new a();

    /* renamed from: ˈ, reason: contains not printable characters */
    private final boolean f3676;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final HashMap<String, e> f3673 = new HashMap<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private final HashMap<String, q> f3674 = new HashMap<>();

    /* renamed from: ˆ, reason: contains not printable characters */
    private final HashMap<String, r0> f3675 = new HashMap<>();

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f3677 = false;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f3678 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f3679 = false;

    /* compiled from: FragmentManagerViewModel.java */
    class a implements o0.b {
        a() {
        }

        @Override // androidx.lifecycle.o0.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public <T extends n0> T mo4286(Class<T> cls) {
            return new q(true);
        }

        @Override // androidx.lifecycle.o0.b
        /* renamed from: ʼ, reason: contains not printable characters */
        public /* synthetic */ n0 mo4287(Class cls, j0.a aVar) {
            return p0.m4475(this, cls, aVar);
        }
    }

    q(boolean z5) {
        this.f3676 = z5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static q m4274(r0 r0Var) {
        return (q) new o0(r0Var, f3672).m4465(q.class);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f3673.equals(qVar.f3673) && this.f3674.equals(qVar.f3674) && this.f3675.equals(qVar.f3675);
    }

    public int hashCode() {
        return (((this.f3673.hashCode() * 31) + this.f3674.hashCode()) * 31) + this.f3675.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<e> it = this.f3673.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f3674.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f3675.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.lifecycle.n0
    /* renamed from: ʾ, reason: contains not printable characters */
    protected void mo4275() {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f3677 = true;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m4276(e eVar) {
        if (this.f3679) {
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f3673.containsKey(eVar.mWho)) {
                return;
            }
            this.f3673.put(eVar.mWho, eVar);
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + eVar);
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m4277(e eVar) {
        if (n.m4148(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + eVar);
        }
        q qVar = this.f3674.get(eVar.mWho);
        if (qVar != null) {
            qVar.mo4275();
            this.f3674.remove(eVar.mWho);
        }
        r0 r0Var = this.f3675.get(eVar.mWho);
        if (r0Var != null) {
            r0Var.m4492();
            this.f3675.remove(eVar.mWho);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    e m4278(String str) {
        return this.f3673.get(str);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    q m4279(e eVar) {
        q qVar = this.f3674.get(eVar.mWho);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.f3676);
        this.f3674.put(eVar.mWho, qVar2);
        return qVar2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    Collection<e> m4280() {
        return new ArrayList(this.f3673.values());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    r0 m4281(e eVar) {
        r0 r0Var = this.f3675.get(eVar.mWho);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        this.f3675.put(eVar.mWho, r0Var2);
        return r0Var2;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    boolean m4282() {
        return this.f3677;
    }

    /* renamed from: י, reason: contains not printable characters */
    void m4283(e eVar) {
        if (this.f3679) {
            if (n.m4148(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f3673.remove(eVar.mWho) != null) && n.m4148(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + eVar);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m4284(boolean z5) {
        this.f3679 = z5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    boolean m4285(e eVar) {
        if (this.f3673.containsKey(eVar.mWho)) {
            return this.f3676 ? this.f3677 : !this.f3678;
        }
        return true;
    }
}
