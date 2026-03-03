package c;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ActivityResultRegistry.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<Integer, String> f4879 = new HashMap();

    /* renamed from: ʼ, reason: contains not printable characters */
    final Map<String, Integer> f4880 = new HashMap();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Map<String, e> f4881 = new HashMap();

    /* renamed from: ʾ, reason: contains not printable characters */
    ArrayList<String> f4882 = new ArrayList<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    final transient Map<String, C0072d<?>> f4883 = new HashMap();

    /* renamed from: ˆ, reason: contains not printable characters */
    final Map<String, Object> f4884 = new HashMap();

    /* renamed from: ˈ, reason: contains not printable characters */
    final Bundle f4885 = new Bundle();

    /* compiled from: ActivityResultRegistry.java */
    class a implements n {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f4886;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ c.b f4887;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ d.a f4888;

        a(String str, c.b bVar, d.a aVar) {
            this.f4886 = str;
            this.f4887 = bVar;
            this.f4888 = aVar;
        }

        @Override // androidx.lifecycle.n
        /* renamed from: ʿ */
        public void mo389(p pVar, l.a aVar) {
            if (!l.a.ON_START.equals(aVar)) {
                if (l.a.ON_STOP.equals(aVar)) {
                    d.this.f4883.remove(this.f4886);
                    return;
                } else {
                    if (l.a.ON_DESTROY.equals(aVar)) {
                        d.this.m5736(this.f4886);
                        return;
                    }
                    return;
                }
            }
            d.this.f4883.put(this.f4886, new C0072d<>(this.f4887, this.f4888));
            if (d.this.f4884.containsKey(this.f4886)) {
                Object obj = d.this.f4884.get(this.f4886);
                d.this.f4884.remove(this.f4886);
                this.f4887.mo4257(obj);
            }
            c.a aVar2 = (c.a) d.this.f4885.getParcelable(this.f4886);
            if (aVar2 != null) {
                d.this.f4885.remove(this.f4886);
                this.f4887.mo4257(this.f4888.mo4264(aVar2.m5722(), aVar2.m5721()));
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: ActivityResultRegistry.java */
    class b<I> extends c.c<I> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f4890;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ d.a f4891;

        b(String str, d.a aVar) {
            this.f4890 = str;
            this.f4891 = aVar;
        }

        @Override // c.c
        /* renamed from: ʼ */
        public void mo4023(I i5, androidx.core.app.f fVar) {
            Integer num = d.this.f4880.get(this.f4890);
            if (num != null) {
                d.this.f4882.add(this.f4890);
                try {
                    d.this.mo388(num.intValue(), this.f4891, i5, fVar);
                    return;
                } catch (Exception e5) {
                    d.this.f4882.remove(this.f4890);
                    throw e5;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f4891 + " and input " + i5 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // c.c
        /* renamed from: ʽ */
        public void mo4024() {
            d.this.m5736(this.f4890);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* compiled from: ActivityResultRegistry.java */
    class c<I> extends c.c<I> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ String f4893;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ d.a f4894;

        c(String str, d.a aVar) {
            this.f4893 = str;
            this.f4894 = aVar;
        }

        @Override // c.c
        /* renamed from: ʼ */
        public void mo4023(I i5, androidx.core.app.f fVar) {
            Integer num = d.this.f4880.get(this.f4893);
            if (num != null) {
                d.this.f4882.add(this.f4893);
                try {
                    d.this.mo388(num.intValue(), this.f4894, i5, fVar);
                    return;
                } catch (Exception e5) {
                    d.this.f4882.remove(this.f4893);
                    throw e5;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f4894 + " and input " + i5 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // c.c
        /* renamed from: ʽ */
        public void mo4024() {
            d.this.m5736(this.f4893);
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    /* renamed from: c.d$d, reason: collision with other inner class name */
    private static class C0072d<O> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final c.b<O> f4896;

        /* renamed from: ʼ, reason: contains not printable characters */
        final d.a<?, O> f4897;

        C0072d(c.b<O> bVar, d.a<?, O> aVar) {
            this.f4896 = bVar;
            this.f4897 = aVar;
        }
    }

    /* compiled from: ActivityResultRegistry.java */
    private static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final l f4898;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final ArrayList<n> f4899 = new ArrayList<>();

        e(l lVar) {
            this.f4898 = lVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5737(n nVar) {
            this.f4898.mo4444(nVar);
            this.f4899.add(nVar);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m5738() {
            Iterator<n> it = this.f4899.iterator();
            while (it.hasNext()) {
                this.f4898.mo4446(it.next());
            }
            this.f4899.clear();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m5726(int i5, String str) {
        this.f4879.put(Integer.valueOf(i5), str);
        this.f4880.put(str, Integer.valueOf(i5));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private <O> void m5727(String str, int i5, Intent intent, C0072d<O> c0072d) {
        if (c0072d == null || c0072d.f4896 == null || !this.f4882.contains(str)) {
            this.f4884.remove(str);
            this.f4885.putParcelable(str, new c.a(i5, intent));
        } else {
            c0072d.f4896.mo4257(c0072d.f4897.mo4264(i5, intent));
            this.f4882.remove(str);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private int m5728() {
        int mo8750 = g4.c.f8103.mo8750(2147418112);
        while (true) {
            int i5 = mo8750 + 65536;
            if (!this.f4879.containsKey(Integer.valueOf(i5))) {
                return i5;
            }
            mo8750 = g4.c.f8103.mo8750(2147418112);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m5729(String str) {
        if (this.f4880.get(str) != null) {
            return;
        }
        m5726(m5728(), str);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final boolean m5730(int i5, int i6, Intent intent) {
        String str = this.f4879.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        m5727(str, i6, intent, this.f4883.get(str));
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final <O> boolean m5731(int i5, @SuppressLint({"UnknownNullness"}) O o5) {
        c.b<?> bVar;
        String str = this.f4879.get(Integer.valueOf(i5));
        if (str == null) {
            return false;
        }
        C0072d<?> c0072d = this.f4883.get(str);
        if (c0072d == null || (bVar = c0072d.f4896) == null) {
            this.f4885.remove(str);
            this.f4884.put(str, o5);
            return true;
        }
        if (!this.f4882.remove(str)) {
            return true;
        }
        bVar.mo4257(o5);
        return true;
    }

    /* renamed from: ˆ */
    public abstract <I, O> void mo388(int i5, d.a<I, O> aVar, @SuppressLint({"UnknownNullness"}) I i6, androidx.core.app.f fVar);

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m5732(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f4882 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f4885.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i5 = 0; i5 < stringArrayList.size(); i5++) {
            String str = stringArrayList.get(i5);
            if (this.f4880.containsKey(str)) {
                Integer remove = this.f4880.remove(str);
                if (!this.f4885.containsKey(str)) {
                    this.f4879.remove(remove);
                }
            }
            m5726(integerArrayList.get(i5).intValue(), stringArrayList.get(i5));
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m5733(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f4880.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f4880.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f4882));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f4885.clone());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final <I, O> c.c<I> m5734(String str, p pVar, d.a<I, O> aVar, c.b<O> bVar) {
        l lifecycle = pVar.getLifecycle();
        if (lifecycle.mo4445().m4455(l.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.mo4445() + ". LifecycleOwners must call register before they are STARTED.");
        }
        m5729(str);
        e eVar = this.f4881.get(str);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        eVar.m5737(new a(str, bVar, aVar));
        this.f4881.put(str, eVar);
        return new b(str, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˋ, reason: contains not printable characters */
    public final <I, O> c.c<I> m5735(String str, d.a<I, O> aVar, c.b<O> bVar) {
        m5729(str);
        this.f4883.put(str, new C0072d<>(bVar, aVar));
        if (this.f4884.containsKey(str)) {
            Object obj = this.f4884.get(str);
            this.f4884.remove(str);
            bVar.mo4257(obj);
        }
        c.a aVar2 = (c.a) this.f4885.getParcelable(str);
        if (aVar2 != null) {
            this.f4885.remove(str);
            bVar.mo4257(aVar.mo4264(aVar2.m5722(), aVar2.m5721()));
        }
        return new c(str, aVar);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    final void m5736(String str) {
        Integer remove;
        if (!this.f4882.contains(str) && (remove = this.f4880.remove(str)) != null) {
            this.f4879.remove(remove);
        }
        this.f4883.remove(str);
        if (this.f4884.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f4884.get(str));
            this.f4884.remove(str);
        }
        if (this.f4885.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f4885.getParcelable(str));
            this.f4885.remove(str);
        }
        e eVar = this.f4881.get(str);
        if (eVar != null) {
            eVar.m5738();
            this.f4881.remove(str);
        }
    }
}
