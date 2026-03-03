package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* compiled from: WindowIdApi18.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class t0 implements u0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final WindowId f4568;

    t0(View view) {
        this.f4568 = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof t0) && ((t0) obj).f4568.equals(this.f4568);
    }

    public int hashCode() {
        return this.f4568.hashCode();
    }
}
