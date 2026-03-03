package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* compiled from: BundleCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m {

    /* compiled from: BundleCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static IBinder m1970(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1971(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static IBinder m1969(Bundle bundle, String str) {
        return a.m1970(bundle, str);
    }
}
