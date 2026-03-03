package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;

/* compiled from: Bundle.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final e f2730 = new e();

    private e() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m2408(Bundle bundle, String str, Size size) {
        f4.k.m8623(bundle, "bundle");
        f4.k.m8623(str, "key");
        bundle.putSize(str, size);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final void m2409(Bundle bundle, String str, SizeF sizeF) {
        f4.k.m8623(bundle, "bundle");
        f4.k.m8623(str, "key");
        bundle.putSizeF(str, sizeF);
    }
}
