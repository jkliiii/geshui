package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ProfileInstallerInitializer implements o0.a<c> {

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        /* renamed from: ʽ, reason: contains not printable characters */
        public static void m4550(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.n
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j5) {
                    runnable.run();
                }
            });
        }
    }

    private static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static Handler m4551(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m4544(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: androidx.profileinstaller.m
            @Override // java.lang.Runnable
            public final void run() {
                j.m4599(context);
            }
        });
    }

    @Override // o0.a
    /* renamed from: ʻ */
    public List<Class<? extends o0.a<?>>> mo3747() {
        return Collections.emptyList();
    }

    @Override // o0.a
    /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c mo3748(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        m4546(context.getApplicationContext());
        return new c();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m4546(final Context context) {
        a.m4550(new Runnable() { // from class: androidx.profileinstaller.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f3948.m4541(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ˉ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void m4541(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.m4551(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: androidx.profileinstaller.l
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.m4544(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
