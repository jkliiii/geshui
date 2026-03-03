package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c3 extends s2 {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final WeakReference<Context> f1205;

    public c3(Context context, Resources resources) {
        super(resources);
        this.f1205 = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i5) throws Resources.NotFoundException {
        Drawable m1547 = m1547(i5);
        Context context = this.f1205.get();
        if (m1547 != null && context != null) {
            r2.m1522().m1538(context, i5, m1547);
        }
        return m1547;
    }
}
