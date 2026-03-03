package h3;

import android.os.Handler;
import android.os.Looper;
import com.lt.app.App;
import java.util.concurrent.Executors;

/* compiled from: LTCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class z {

    /* compiled from: LTCache.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d f8427;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Handler f8428;

        /* compiled from: LTCache.java */
        /* renamed from: h3.z$a$a, reason: collision with other inner class name */
        class RunnableC0113a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ long f8429;

            RunnableC0113a(long j5) {
                this.f8429 = j5;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f8427.mo8982(this.f8429);
            }
        }

        a(d dVar, Handler handler) {
            this.f8427 = dVar;
            this.f8428 = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            App m7835 = App.m7835();
            long m10917 = n3.z1.m10917(m7835.getCacheDir()) + n3.z1.m10917(m7835.getExternalCacheDir());
            if (this.f8427 != null) {
                this.f8428.post(new RunnableC0113a(m10917));
            }
        }
    }

    /* compiled from: LTCache.java */
    class b implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ c f8431;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ Handler f8432;

        /* compiled from: LTCache.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f8431.mo8744();
            }
        }

        b(c cVar, Handler handler) {
            this.f8431 = cVar;
            this.f8432 = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            App m7835 = App.m7835();
            n3.z1.m10944(m7835.getCacheDir(), false);
            n3.z1.m10944(m7835.getExternalCacheDir(), false);
            if (this.f8431 != null) {
                this.f8432.post(new a());
            }
        }
    }

    /* compiled from: LTCache.java */
    public interface c {
        /* renamed from: ʻ */
        void mo8744();
    }

    /* compiled from: LTCache.java */
    public interface d {
        /* renamed from: ʻ */
        void mo8982(long j5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m9099(c cVar, j2.f fVar) {
        Executors.newSingleThreadExecutor().execute(new b(cVar, new Handler(Looper.getMainLooper())));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m9100(d dVar) {
        Executors.newSingleThreadExecutor().execute(new a(dVar, new Handler(Looper.getMainLooper())));
    }
}
