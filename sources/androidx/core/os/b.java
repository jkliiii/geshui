package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: Bundle.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final b f2729 = new b();

    private b() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m2405(Bundle bundle, String str, IBinder iBinder) {
        f4.k.m8623(bundle, "bundle");
        f4.k.m8623(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
