package r1;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import r1.b;
import y1.f;

/* compiled from: SingletonConnectivityReceiver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class r {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static volatile r f10790;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c f10791;

    /* renamed from: ʼ, reason: contains not printable characters */
    final Set<b.a> f10792 = new HashSet();

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean f10793;

    /* compiled from: SingletonConnectivityReceiver.java */
    class a implements f.b<ConnectivityManager> {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ Context f10794;

        a(Context context) {
            this.f10794 = context;
        }

        @Override // y1.f.b
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f10794.getSystemService("connectivity");
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    class b implements b.a {
        b() {
        }

        @Override // r1.b.a
        /* renamed from: ʻ */
        public void mo6109(boolean z5) {
            ArrayList arrayList;
            y1.l.m12895();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f10792);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).mo6109(z5);
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private interface c {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo11666();

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean mo11667();
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private static final class d implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f10797;

        /* renamed from: ʼ, reason: contains not printable characters */
        final b.a f10798;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final f.b<ConnectivityManager> f10799;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ConnectivityManager.NetworkCallback f10800 = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        class a extends ConnectivityManager.NetworkCallback {

            /* compiled from: SingletonConnectivityReceiver.java */
            /* renamed from: r1.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0154a implements Runnable {

                /* renamed from: ʾ, reason: contains not printable characters */
                final /* synthetic */ boolean f10802;

                RunnableC0154a(boolean z5) {
                    this.f10802 = z5;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.m11669(this.f10802);
                }
            }

            a() {
            }

            /* renamed from: ʼ, reason: contains not printable characters */
            private void m11668(boolean z5) {
                y1.l.m12915(new RunnableC0154a(z5));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                m11668(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                m11668(false);
            }

            /* renamed from: ʻ, reason: contains not printable characters */
            void m11669(boolean z5) {
                y1.l.m12895();
                d dVar = d.this;
                boolean z6 = dVar.f10797;
                dVar.f10797 = z5;
                if (z6 != z5) {
                    dVar.f10798.mo6109(z5);
                }
            }
        }

        d(f.b<ConnectivityManager> bVar, b.a aVar) {
            this.f10799 = bVar;
            this.f10798 = aVar;
        }

        @Override // r1.r.c
        /* renamed from: ʻ */
        public void mo11666() {
            this.f10799.get().unregisterNetworkCallback(this.f10800);
        }

        @Override // r1.r.c
        @SuppressLint({"MissingPermission"})
        /* renamed from: ʼ */
        public boolean mo11667() {
            this.f10797 = this.f10799.get().getActiveNetwork() != null;
            try {
                this.f10799.get().registerDefaultNetworkCallback(this.f10800);
                return true;
            } catch (RuntimeException e5) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e5);
                }
                return false;
            }
        }
    }

    /* compiled from: SingletonConnectivityReceiver.java */
    private static final class e implements c {

        /* renamed from: ˈ, reason: contains not printable characters */
        static final Executor f10804 = AsyncTask.SERIAL_EXECUTOR;

        /* renamed from: ʻ, reason: contains not printable characters */
        final Context f10805;

        /* renamed from: ʼ, reason: contains not printable characters */
        final b.a f10806;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final f.b<ConnectivityManager> f10807;

        /* renamed from: ʾ, reason: contains not printable characters */
        volatile boolean f10808;

        /* renamed from: ʿ, reason: contains not printable characters */
        volatile boolean f10809;

        /* renamed from: ˆ, reason: contains not printable characters */
        final BroadcastReceiver f10810 = new a();

        /* compiled from: SingletonConnectivityReceiver.java */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e.this.m11672();
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f10808 = eVar.m11670();
                try {
                    e eVar2 = e.this;
                    eVar2.f10805.registerReceiver(eVar2.f10810, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f10809 = true;
                } catch (SecurityException e5) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e5);
                    }
                    e.this.f10809 = false;
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f10809) {
                    e.this.f10809 = false;
                    e eVar = e.this;
                    eVar.f10805.unregisterReceiver(eVar.f10810);
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z5 = e.this.f10808;
                e eVar = e.this;
                eVar.f10808 = eVar.m11670();
                if (z5 != e.this.f10808) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f10808);
                    }
                    e eVar2 = e.this;
                    eVar2.m11671(eVar2.f10808);
                }
            }
        }

        /* compiled from: SingletonConnectivityReceiver.java */
        /* renamed from: r1.r$e$e, reason: collision with other inner class name */
        class RunnableC0155e implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ boolean f10815;

            RunnableC0155e(boolean z5) {
                this.f10815 = z5;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f10806.mo6109(this.f10815);
            }
        }

        e(Context context, f.b<ConnectivityManager> bVar, b.a aVar) {
            this.f10805 = context.getApplicationContext();
            this.f10807 = bVar;
            this.f10806 = aVar;
        }

        @Override // r1.r.c
        /* renamed from: ʻ */
        public void mo11666() {
            f10804.execute(new c());
        }

        @Override // r1.r.c
        /* renamed from: ʼ */
        public boolean mo11667() {
            f10804.execute(new b());
            return true;
        }

        @SuppressLint({"MissingPermission"})
        /* renamed from: ʽ, reason: contains not printable characters */
        boolean m11670() {
            try {
                NetworkInfo activeNetworkInfo = this.f10807.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e5) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e5);
                }
                return true;
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m11671(boolean z5) {
            y1.l.m12915(new RunnableC0155e(z5));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m11672() {
            f10804.execute(new d());
        }
    }

    private r(Context context) {
        f.b m12877 = y1.f.m12877(new a(context));
        b bVar = new b();
        this.f10791 = Build.VERSION.SDK_INT >= 24 ? new d(m12877, bVar) : new e(context, m12877, bVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static r m11660(Context context) {
        if (f10790 == null) {
            synchronized (r.class) {
                if (f10790 == null) {
                    f10790 = new r(context.getApplicationContext());
                }
            }
        }
        return f10790;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m11661() {
        if (this.f10793 || this.f10792.isEmpty()) {
            return;
        }
        this.f10793 = this.f10791.mo11667();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m11662() {
        if (this.f10793 && this.f10792.isEmpty()) {
            this.f10791.mo11666();
            this.f10793 = false;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    synchronized void m11663(b.a aVar) {
        this.f10792.add(aVar);
        m11661();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    synchronized void m11664(b.a aVar) {
        this.f10792.remove(aVar);
        m11662();
    }
}
