package h3;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.lt.app.App;
import java.lang.ref.WeakReference;
import w0.f;

/* compiled from: Updater.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Updater.java */
    static class a extends Handler {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final WeakReference<Activity> f8367;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final String f8368;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final String f8369;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final boolean f8370;

        a(Activity activity, String str, String str2, boolean z5) {
            super(Looper.getMainLooper());
            this.f8367 = new WeakReference<>(activity);
            this.f8368 = str;
            this.f8369 = str2;
            this.f8370 = z5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾ, reason: contains not printable characters */
        public /* synthetic */ void m9046(Activity activity, w0.f fVar, w0.b bVar) {
            s2.m9042(activity, this.f8369);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ˆ, reason: contains not printable characters */
        public /* synthetic */ void m9048(final Activity activity) {
            f.e m12491 = new f.e(activity).m12497(2131820777).m12486(this.f8368).m12483(false).m12492(2131820860).m12491(new f.h() { // from class: h3.q2
                @Override // w0.f.h
                /* renamed from: ʻ */
                public final void mo8884(w0.f fVar, w0.b bVar) {
                    this.f8351.m9046(activity, fVar, bVar);
                }
            });
            if (this.f8370) {
                m12491.m12488(2131820576);
                m12491.m12490(new f.h() { // from class: h3.r2
                    @Override // w0.f.h
                    /* renamed from: ʻ */
                    public final void mo8884(w0.f fVar, w0.b bVar) {
                        System.exit(0);
                    }
                });
            } else {
                m12491.m12488(2131820859);
            }
            m12491.m12496();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            final Activity activity;
            WeakReference<Activity> weakReference = this.f8367;
            if (weakReference == null || (activity = weakReference.get()) == null || activity.isFinishing()) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: h3.p2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8346.m9048(activity);
                }
            });
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m9041(Activity activity) {
        l3.i iVar;
        l3.a m7827 = App.m7827();
        if (m7827 == null || (iVar = m7827.ver) == null) {
            return;
        }
        int i5 = iVar.code;
        if (i5 == 0 || i5 > App.m7835().m7851()) {
            l3.i iVar2 = m7827.ver;
            new a(activity, iVar2.msg, iVar2.apk, iVar2.force).sendEmptyMessageDelayed(0, 6000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m9042(Context context, String str) {
        new j(context, str).m8895(context.getString(2131820777));
    }
}
