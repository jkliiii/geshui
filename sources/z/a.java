package z;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f4;
import androidx.core.view.g4;
import f4.k;
import java.util.Iterator;

/* compiled from: PoolingContainer.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final int f12662 = d.f12666;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final int f12663 = d.f12665;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final void m13101(View view) {
        k.m8623(view, "<this>");
        Iterator<View> it = g4.m3141(view).iterator();
        while (it.hasNext()) {
            m13103(it.next()).m13106();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final void m13102(ViewGroup viewGroup) {
        k.m8623(viewGroup, "<this>");
        Iterator<View> it = f4.m3054(viewGroup).iterator();
        while (it.hasNext()) {
            m13103(it.next()).m13106();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final c m13103(View view) {
        int i5 = f12662;
        c cVar = (c) view.getTag(i5);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        view.setTag(i5, cVar2);
        return cVar2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final void m13104(View view, boolean z5) {
        k.m8623(view, "<this>");
        view.setTag(f12663, Boolean.valueOf(z5));
    }
}
