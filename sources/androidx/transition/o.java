package androidx.transition;

import android.view.ViewGroup;

/* compiled from: Scene.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o {

    /* renamed from: ʻ, reason: contains not printable characters */
    private ViewGroup f4519;

    /* renamed from: ʼ, reason: contains not printable characters */
    private Runnable f4520;

    /* renamed from: ʼ, reason: contains not printable characters */
    public static o m5384(ViewGroup viewGroup) {
        return (o) viewGroup.getTag(m.f4516);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m5385(ViewGroup viewGroup, o oVar) {
        viewGroup.setTag(m.f4516, oVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m5386() {
        Runnable runnable;
        if (m5384(this.f4519) != this || (runnable = this.f4520) == null) {
            return;
        }
        runnable.run();
    }
}
