package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;
import n0.d;

/* compiled from: SavedStateHandleSupport.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i0 implements d.c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final n0.d f3816;

    /* renamed from: ʼ, reason: contains not printable characters */
    private boolean f3817;

    /* renamed from: ʽ, reason: contains not printable characters */
    private Bundle f3818;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final v3.e f3819;

    /* compiled from: SavedStateHandleSupport.kt */
    static final class a extends f4.l implements e4.a<j0> {

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ s0 f3820;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var) {
            super(0);
            this.f3820 = s0Var;
        }

        @Override // e4.a
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final j0 mo368() {
            return h0.m4431(this.f3820);
        }
    }

    public i0(n0.d dVar, s0 s0Var) {
        f4.k.m8623(dVar, "savedStateRegistry");
        f4.k.m8623(s0Var, "viewModelStoreOwner");
        this.f3816 = dVar;
        this.f3819 = v3.g.m12375(new a(s0Var));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private final j0 m4433() {
        return (j0) this.f3819.getValue();
    }

    @Override // n0.d.c
    /* renamed from: ʻ */
    public Bundle mo369() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3818;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, e0> entry : m4433().m4437().entrySet()) {
            String key = entry.getKey();
            Bundle mo369 = entry.getValue().m4419().mo369();
            if (!f4.k.m8619(mo369, Bundle.EMPTY)) {
                bundle.putBundle(key, mo369);
            }
        }
        this.f3817 = false;
        return bundle;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final Bundle m4434(String str) {
        f4.k.m8623(str, "key");
        m4435();
        Bundle bundle = this.f3818;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.f3818;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f3818;
        boolean z5 = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z5 = true;
        }
        if (z5) {
            this.f3818 = null;
        }
        return bundle2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m4435() {
        if (this.f3817) {
            return;
        }
        Bundle m10403 = this.f3816.m10403("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f3818;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (m10403 != null) {
            bundle.putAll(m10403);
        }
        this.f3818 = bundle;
        this.f3817 = true;
        m4433();
    }
}
