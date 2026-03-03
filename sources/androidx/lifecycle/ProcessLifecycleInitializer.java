package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.a0;
import java.util.List;

/* compiled from: ProcessLifecycleInitializer.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class ProcessLifecycleInitializer implements o0.a<p> {
    @Override // o0.a
    /* renamed from: ʻ */
    public List<Class<? extends o0.a<?>>> mo3747() {
        return w3.n.m12562();
    }

    @Override // o0.a
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public p mo3748(Context context) {
        f4.k.m8623(context, "context");
        androidx.startup.a m5241 = androidx.startup.a.m5241(context);
        f4.k.m8622(m5241, "getInstance(context)");
        if (!m5241.m5246(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
        }
        m.m4460(context);
        a0.b bVar = a0.f3774;
        bVar.m4390(context);
        return bVar.m4389();
    }
}
