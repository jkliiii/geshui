package androidx.emoji2.text;

import android.content.Context;
import androidx.core.os.t;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: E:\78999\cookie_5123796.dex */
public class EmojiCompatInitializer implements o0.a<Boolean> {

    class a implements androidx.lifecycle.e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ androidx.lifecycle.l f3210;

        a(androidx.lifecycle.l lVar) {
            this.f3210 = lVar;
        }

        @Override // androidx.lifecycle.e
        public /* synthetic */ void onDestroy(p pVar) {
            androidx.lifecycle.d.m4412(this, pVar);
        }

        @Override // androidx.lifecycle.e
        public /* synthetic */ void onStart(p pVar) {
            androidx.lifecycle.d.m4414(this, pVar);
        }

        @Override // androidx.lifecycle.e
        public /* synthetic */ void onStop(p pVar) {
            androidx.lifecycle.d.m4415(this, pVar);
        }

        @Override // androidx.lifecycle.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo3752(p pVar) {
            EmojiCompatInitializer.this.m3751();
            this.f3210.mo4446(this);
        }

        @Override // androidx.lifecycle.e
        /* renamed from: ʼ, reason: contains not printable characters */
        public /* synthetic */ void mo3753(p pVar) {
            androidx.lifecycle.d.m4411(this, pVar);
        }

        @Override // androidx.lifecycle.e
        /* renamed from: ˆ, reason: contains not printable characters */
        public /* synthetic */ void mo3754(p pVar) {
            androidx.lifecycle.d.m4413(this, pVar);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            m3806(1);
        }
    }

    static class c implements e.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f3212;

        class a extends e.h {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ e.h f3213;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ ThreadPoolExecutor f3214;

            a(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3213 = hVar;
                this.f3214 = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.h
            /* renamed from: ʻ, reason: contains not printable characters */
            public void mo3759(Throwable th) {
                try {
                    this.f3213.mo3759(th);
                } finally {
                    this.f3214.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.h
            /* renamed from: ʼ, reason: contains not printable characters */
            public void mo3760(l lVar) {
                try {
                    this.f3213.mo3760(lVar);
                } finally {
                    this.f3214.shutdown();
                }
            }
        }

        c(Context context) {
            this.f3212 = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo3757(final e.h hVar) {
            final ThreadPoolExecutor m3762 = androidx.emoji2.text.b.m3762("EmojiCompatInitializer");
            m3762.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f3252.m3756(hVar, m3762);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void m3756(e.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i m3766 = androidx.emoji2.text.c.m3766(this.f3212);
                if (m3766 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                m3766.m3837(threadPoolExecutor);
                m3766.m3805().mo3757(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.mo3759(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                t.m2443("EmojiCompat.EmojiCompatInitializer.run");
                if (e.m3785()) {
                    e.m3781().m3791();
                }
            } finally {
                t.m2444();
            }
        }
    }

    @Override // o0.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public List<Class<? extends o0.a<?>>> mo3747() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // o0.a
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Boolean mo3748(Context context) {
        e.m3784(new b(context));
        m3750(context);
        return Boolean.TRUE;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m3750(Context context) {
        androidx.lifecycle.l lifecycle = ((p) androidx.startup.a.m5241(context).m5245(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo4444(new a(lifecycle));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m3751() {
        androidx.emoji2.text.b.m3764().postDelayed(new d(), 500L);
    }
}
