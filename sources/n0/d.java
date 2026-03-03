package n0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import f4.k;
import java.util.Iterator;
import java.util.Map;
import n0.b;

/* compiled from: SavedStateRegistry.kt */
@SuppressLint({"RestrictedApi"})
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final b f9503 = new b(null);

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean f9505;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Bundle f9506;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f9507;

    /* renamed from: ʿ, reason: contains not printable characters */
    private b.C0135b f9508;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final j.b<String, c> f9504 = new j.b<>();

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f9509 = true;

    /* compiled from: SavedStateRegistry.kt */
    public interface a {
        /* renamed from: ʻ */
        void mo4441(f fVar);
    }

    /* compiled from: SavedStateRegistry.kt */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(f4.g gVar) {
            this();
        }
    }

    /* compiled from: SavedStateRegistry.kt */
    public interface c {
        /* renamed from: ʻ */
        Bundle mo369();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static final void m10402(d dVar, p pVar, l.a aVar) {
        k.m8623(dVar, "this$0");
        k.m8623(pVar, "<anonymous parameter 0>");
        k.m8623(aVar, "event");
        if (aVar == l.a.ON_START) {
            dVar.f9509 = true;
        } else if (aVar == l.a.ON_STOP) {
            dVar.f9509 = false;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final Bundle m10403(String str) {
        k.m8623(str, "key");
        if (!this.f9507) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f9506;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f9506;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f9506;
        boolean z5 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z5 = true;
        }
        if (!z5) {
            this.f9506 = null;
        }
        return bundle2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final c m10404(String str) {
        k.m8623(str, "key");
        Iterator<Map.Entry<String, c>> it = this.f9504.iterator();
        while (it.hasNext()) {
            Map.Entry<String, c> next = it.next();
            k.m8622(next, "components");
            String key = next.getKey();
            c value = next.getValue();
            if (k.m8619(key, str)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final void m10405(l lVar) {
        k.m8623(lVar, "lifecycle");
        if (!(!this.f9505)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lVar.mo4444(new n() { // from class: n0.c
            @Override // androidx.lifecycle.n
            /* renamed from: ʿ */
            public final void mo389(p pVar, l.a aVar) {
                d.m10402(this.f9502, pVar, aVar);
            }
        });
        this.f9505 = true;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public final void m10406(Bundle bundle) {
        if (!this.f9505) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f9507)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f9506 = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f9507 = true;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public final void m10407(Bundle bundle) {
        k.m8623(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f9506;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        j.b<String, c>.d m9266 = this.f9504.m9266();
        k.m8622(m9266, "this.components.iteratorWithAdditions()");
        while (m9266.hasNext()) {
            Map.Entry next = m9266.next();
            bundle2.putBundle((String) next.getKey(), ((c) next.getValue()).mo369());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m10408(String str, c cVar) {
        k.m8623(str, "key");
        k.m8623(cVar, "provider");
        if (!(this.f9504.mo9262(str, cVar) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m10409(Class<? extends a> cls) {
        k.m8623(cls, "clazz");
        if (!this.f9509) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        b.C0135b c0135b = this.f9508;
        if (c0135b == null) {
            c0135b = new b.C0135b(this);
        }
        this.f9508 = c0135b;
        try {
            cls.getDeclaredConstructor(new Class[0]);
            b.C0135b c0135b2 = this.f9508;
            if (c0135b2 != null) {
                String name = cls.getName();
                k.m8622(name, "clazz.name");
                c0135b2.m10400(name);
            }
        } catch (NoSuchMethodException e5) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
        }
    }
}
