package r1;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import l1.y;

/* compiled from: FirstFrameWaiter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h implements i {

    /* renamed from: ʻ, reason: contains not printable characters */
    final Set<Activity> f10767 = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: ʼ, reason: contains not printable characters */
    volatile boolean f10768;

    /* compiled from: FirstFrameWaiter.java */
    class a implements ViewTreeObserver.OnDrawListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f10769;

        /* compiled from: FirstFrameWaiter.java */
        /* renamed from: r1.h$a$a, reason: collision with other inner class name */
        class RunnableC0153a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ ViewTreeObserver.OnDrawListener f10771;

            RunnableC0153a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.f10771 = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                y.m9712().m9718();
                h.this.f10768 = true;
                h.m11637(a.this.f10769, this.f10771);
                h.this.f10767.clear();
            }
        }

        a(View view) {
            this.f10769 = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            y1.l.m12915(new RunnableC0153a(this));
        }
    }

    h() {
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m11637(View view, ViewTreeObserver.OnDrawListener onDrawListener) {
        view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
    }

    @Override // r1.i
    /* renamed from: ʻ */
    public void mo11635(Activity activity) {
        if (!this.f10768 && this.f10767.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
