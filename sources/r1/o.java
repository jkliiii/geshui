package r1;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.util.Collection;
import java.util.Map;
import l1.y;

/* compiled from: RequestManagerRetriever.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o implements Handler.Callback {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final b f10781 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private volatile com.bumptech.glide.l f10782;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final b f10783;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final m.a<View, androidx.fragment.app.e> f10784 = new m.a<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final i f10785;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final m f10786;

    /* compiled from: RequestManagerRetriever.java */
    class a implements b {
        a() {
        }

        @Override // r1.o.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public com.bumptech.glide.l mo11652(com.bumptech.glide.b bVar, j jVar, p pVar, Context context) {
            return new com.bumptech.glide.l(bVar, jVar, pVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever.java */
    public interface b {
        /* renamed from: ʻ */
        com.bumptech.glide.l mo11652(com.bumptech.glide.b bVar, j jVar, p pVar, Context context);
    }

    public o(b bVar) {
        bVar = bVar == null ? f10781 : bVar;
        this.f10783 = bVar;
        this.f10786 = new m(bVar);
        this.f10785 = m11642();
    }

    @TargetApi(17)
    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m11641(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static i m11642() {
        return (y.f9016 && y.f9015) ? new h() : new f();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Activity m11643(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m11643(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m11644(Collection<androidx.fragment.app.e> collection, Map<View, androidx.fragment.app.e> map) {
        if (collection == null) {
            return;
        }
        for (androidx.fragment.app.e eVar : collection) {
            if (eVar != null && eVar.getView() != null) {
                map.put(eVar.getView(), eVar);
                m11644(eVar.getChildFragmentManager().m4182(), map);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private androidx.fragment.app.e m11645(View view, androidx.fragment.app.f fVar) {
        this.f10784.clear();
        m11644(fVar.m4043().m4182(), this.f10784);
        View findViewById = fVar.findViewById(R.id.content);
        androidx.fragment.app.e eVar = null;
        while (!view.equals(findViewById) && (eVar = this.f10784.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f10784.clear();
        return eVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private com.bumptech.glide.l m11646(Context context) {
        if (this.f10782 == null) {
            synchronized (this) {
                if (this.f10782 == null) {
                    this.f10782 = this.f10783.mo11652(com.bumptech.glide.b.m6011(context.getApplicationContext()), new r1.a(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.f10782;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m11647(Context context) {
        Activity m11643 = m11643(context);
        return m11643 == null || !m11643.isFinishing();
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public com.bumptech.glide.l m11648(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (y1.l.m12912() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.f) {
                return m11651((androidx.fragment.app.f) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m11648(contextWrapper.getBaseContext());
                }
            }
        }
        return m11646(context);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public com.bumptech.glide.l m11649(View view) {
        if (y1.l.m12911()) {
            return m11648(view.getContext().getApplicationContext());
        }
        y1.k.m12893(view);
        y1.k.m12894(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity m11643 = m11643(view.getContext());
        if (m11643 == null) {
            return m11648(view.getContext().getApplicationContext());
        }
        if (!(m11643 instanceof androidx.fragment.app.f)) {
            return m11648(view.getContext().getApplicationContext());
        }
        androidx.fragment.app.f fVar = (androidx.fragment.app.f) m11643;
        androidx.fragment.app.e m11645 = m11645(view, fVar);
        return m11645 != null ? m11650(m11645) : m11651(fVar);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public com.bumptech.glide.l m11650(androidx.fragment.app.e eVar) {
        y1.k.m12894(eVar.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (y1.l.m12911()) {
            return m11648(eVar.getContext().getApplicationContext());
        }
        if (eVar.getActivity() != null) {
            this.f10785.mo11635(eVar.getActivity());
        }
        androidx.fragment.app.n childFragmentManager = eVar.getChildFragmentManager();
        Context context = eVar.getContext();
        return this.f10786.m11639(context, com.bumptech.glide.b.m6011(context.getApplicationContext()), eVar.getLifecycle(), childFragmentManager, eVar.isVisible());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public com.bumptech.glide.l m11651(androidx.fragment.app.f fVar) {
        if (y1.l.m12911()) {
            return m11648(fVar.getApplicationContext());
        }
        m11641(fVar);
        this.f10785.mo11635(fVar);
        boolean m11647 = m11647(fVar);
        return this.f10786.m11639(fVar, com.bumptech.glide.b.m6011(fVar.getApplicationContext()), fVar.getLifecycle(), fVar.m4043(), m11647);
    }
}
