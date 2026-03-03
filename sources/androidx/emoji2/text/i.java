package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.graphics.p1;
import androidx.core.os.t;
import androidx.core.provider.g;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: FontRequestEmojiCompatConfig.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends e.c {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final a f3272 = new a();

    /* compiled from: FontRequestEmojiCompatConfig.java */
    public static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public Typeface m3838(Context context, g.b bVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.g.m2477(context, null, new g.b[]{bVar});
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public g.a m3839(Context context, androidx.core.provider.e eVar) throws PackageManager.NameNotFoundException {
            return androidx.core.provider.g.m2478(context, null, eVar);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m3840(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FontRequestEmojiCompatConfig.java */
    static class b implements e.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Context f3273;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final androidx.core.provider.e f3274;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final a f3275;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Object f3276 = new Object();

        /* renamed from: ʿ, reason: contains not printable characters */
        private Handler f3277;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Executor f3278;

        /* renamed from: ˈ, reason: contains not printable characters */
        private ThreadPoolExecutor f3279;

        /* renamed from: ˉ, reason: contains not printable characters */
        e.h f3280;

        /* renamed from: ˊ, reason: contains not printable characters */
        private ContentObserver f3281;

        /* renamed from: ˋ, reason: contains not printable characters */
        private Runnable f3282;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.h.m2584(context, "Context cannot be null");
            androidx.core.util.h.m2584(eVar, "FontRequest cannot be null");
            this.f3273 = context.getApplicationContext();
            this.f3274 = eVar;
            this.f3275 = aVar;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m3841() {
            synchronized (this.f3276) {
                this.f3280 = null;
                ContentObserver contentObserver = this.f3281;
                if (contentObserver != null) {
                    this.f3275.m3840(this.f3273, contentObserver);
                    this.f3281 = null;
                }
                Handler handler = this.f3277;
                if (handler != null) {
                    handler.removeCallbacks(this.f3282);
                }
                this.f3277 = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3279;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3278 = null;
                this.f3279 = null;
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private g.b m3842() {
            try {
                g.a m3839 = this.f3275.m3839(this.f3273, this.f3274);
                if (m3839.m2482() == 0) {
                    g.b[] m2481 = m3839.m2481();
                    if (m2481 == null || m2481.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return m2481[0];
                }
                throw new RuntimeException("fetchFonts failed (" + m3839.m2482() + ")");
            } catch (PackageManager.NameNotFoundException e5) {
                throw new RuntimeException("provider not found", e5);
            }
        }

        @Override // androidx.emoji2.text.e.g
        /* renamed from: ʻ */
        public void mo3757(e.h hVar) {
            androidx.core.util.h.m2584(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3276) {
                this.f3280 = hVar;
            }
            m3844();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m3843() {
            synchronized (this.f3276) {
                if (this.f3280 == null) {
                    return;
                }
                try {
                    g.b m3842 = m3842();
                    int m2484 = m3842.m2484();
                    if (m2484 == 2) {
                        synchronized (this.f3276) {
                        }
                    }
                    if (m2484 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + m2484 + ")");
                    }
                    try {
                        t.m2443("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        Typeface m3838 = this.f3275.m3838(this.f3273, m3842);
                        ByteBuffer m2359 = p1.m2359(this.f3273, null, m3842.m2486());
                        if (m2359 == null || m3838 == null) {
                            throw new RuntimeException("Unable to open file.");
                        }
                        l m3855 = l.m3855(m3838, m2359);
                        t.m2444();
                        synchronized (this.f3276) {
                            e.h hVar = this.f3280;
                            if (hVar != null) {
                                hVar.mo3760(m3855);
                            }
                        }
                        m3841();
                    } catch (Throwable th) {
                        t.m2444();
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (this.f3276) {
                        e.h hVar2 = this.f3280;
                        if (hVar2 != null) {
                            hVar2.mo3759(th2);
                        }
                        m3841();
                    }
                }
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m3844() {
            synchronized (this.f3276) {
                if (this.f3280 == null) {
                    return;
                }
                if (this.f3278 == null) {
                    ThreadPoolExecutor m3762 = androidx.emoji2.text.b.m3762("emojiCompat");
                    this.f3279 = m3762;
                    this.f3278 = m3762;
                }
                this.f3278.execute(new Runnable() { // from class: androidx.emoji2.text.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3283.m3843();
                    }
                });
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void m3845(Executor executor) {
            synchronized (this.f3276) {
                this.f3278 = executor;
            }
        }
    }

    public i(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f3272));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public i m3837(Executor executor) {
        ((b) m3805()).m3845(executor);
        return this;
    }
}
