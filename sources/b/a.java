package b;

import android.content.Context;
import f4.k;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: ContextAwareHelper.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Set<b> f4798 = new CopyOnWriteArraySet();

    /* renamed from: ʼ, reason: contains not printable characters */
    private volatile Context f4799;

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m5631(b bVar) {
        k.m8623(bVar, "listener");
        Context context = this.f4799;
        if (context != null) {
            bVar.mo370(context);
        }
        this.f4798.add(bVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m5632() {
        this.f4799 = null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m5633(Context context) {
        k.m8623(context, "context");
        this.f4799 = context;
        Iterator<b> it = this.f4798.iterator();
        while (it.hasNext()) {
            it.next().mo370(context);
        }
    }
}
