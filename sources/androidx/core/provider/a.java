package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* compiled from: CallbackWithHandler.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final g.c f2751;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Handler f2752;

    /* compiled from: CallbackWithHandler.java */
    /* renamed from: androidx.core.provider.a$a, reason: collision with other inner class name */
    class RunnableC0028a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g.c f2753;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Typeface f2754;

        RunnableC0028a(g.c cVar, Typeface typeface) {
            this.f2753 = cVar;
            this.f2754 = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2753.mo2327(this.f2754);
        }
    }

    /* compiled from: CallbackWithHandler.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ g.c f2756;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f2757;

        b(g.c cVar, int i5) {
            this.f2756 = cVar;
            this.f2757 = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2756.mo2326(this.f2757);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2751 = cVar;
        this.f2752 = handler;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m2447(int i5) {
        this.f2752.post(new b(this.f2751, i5));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m2448(Typeface typeface) {
        this.f2752.post(new RunnableC0028a(this.f2751, typeface));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m2449(f.e eVar) {
        if (eVar.m2476()) {
            m2448(eVar.f2780);
        } else {
            m2447(eVar.f2781);
        }
    }
}
