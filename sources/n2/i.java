package n2;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import k2.a0;
import k2.e;
import k2.f0;
import n2.d;

/* compiled from: AsyncSSLSocketMiddleware.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends o {

    /* renamed from: ˋ, reason: contains not printable characters */
    protected SSLContext f9612;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected TrustManager[] f9613;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected HostnameVerifier f9614;

    /* renamed from: ˑ, reason: contains not printable characters */
    protected List<h> f9615;

    /* compiled from: AsyncSSLSocketMiddleware.java */
    class a implements e.h {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l2.b f9616;

        a(l2.b bVar) {
            this.f9616 = bVar;
        }

        @Override // k2.e.h
        /* renamed from: ʻ */
        public void mo9414(Exception exc, k2.c cVar) {
            this.f9616.mo9724(exc, cVar);
        }
    }

    /* compiled from: AsyncSSLSocketMiddleware.java */
    class b implements l2.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l2.b f9618;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ boolean f9619;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ d.a f9620;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ Uri f9621;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ int f9622;

        /* compiled from: AsyncSSLSocketMiddleware.java */
        class a implements l2.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ k2.l f9624;

            /* compiled from: AsyncSSLSocketMiddleware.java */
            /* renamed from: n2.i$b$a$a, reason: collision with other inner class name */
            class C0138a implements a0.a {

                /* renamed from: ʻ, reason: contains not printable characters */
                String f9626;

                C0138a() {
                }

                @Override // k2.a0.a
                /* renamed from: ʻ */
                public void mo9378(String str) {
                    b.this.f9620.f9584.m10514(str);
                    if (this.f9626 != null) {
                        if (TextUtils.isEmpty(str.trim())) {
                            a.this.f9624.mo9362(null);
                            a.this.f9624.mo9366(null);
                            a aVar = a.this;
                            b bVar = b.this;
                            i.this.m10530(aVar.f9624, bVar.f9620, bVar.f9621, bVar.f9622, bVar.f9618);
                            return;
                        }
                        return;
                    }
                    String trim = str.trim();
                    this.f9626 = trim;
                    if (trim.matches("HTTP/1.\\d 2\\d\\d .*")) {
                        return;
                    }
                    a.this.f9624.mo9362(null);
                    a.this.f9624.mo9366(null);
                    b.this.f9618.mo9724(new IOException("non 2xx status line: " + this.f9626), a.this.f9624);
                }
            }

            /* compiled from: AsyncSSLSocketMiddleware.java */
            /* renamed from: n2.i$b$a$b, reason: collision with other inner class name */
            class C0139b implements l2.a {
                C0139b() {
                }

                @Override // l2.a
                /* renamed from: ʻ */
                public void mo9412(Exception exc) {
                    if (!a.this.f9624.isOpen() && exc == null) {
                        exc = new IOException("socket closed before proxy connect response");
                    }
                    a aVar = a.this;
                    b.this.f9618.mo9724(exc, aVar.f9624);
                }
            }

            a(k2.l lVar) {
                this.f9624 = lVar;
            }

            @Override // l2.a
            /* renamed from: ʻ */
            public void mo9412(Exception exc) {
                if (exc != null) {
                    b.this.f9618.mo9724(exc, this.f9624);
                    return;
                }
                k2.a0 a0Var = new k2.a0();
                a0Var.m9376(new C0138a());
                this.f9624.mo9362(a0Var);
                this.f9624.mo9366(new C0139b());
            }
        }

        b(l2.b bVar, boolean z5, d.a aVar, Uri uri, int i5) {
            this.f9618 = bVar;
            this.f9619 = z5;
            this.f9620 = aVar;
            this.f9621 = uri;
            this.f9622 = i5;
        }

        @Override // l2.b
        /* renamed from: ʻ */
        public void mo9724(Exception exc, k2.l lVar) {
            if (exc != null) {
                this.f9618.mo9724(exc, lVar);
                return;
            }
            if (!this.f9619) {
                i.this.m10530(lVar, this.f9620, this.f9621, this.f9622, this.f9618);
                return;
            }
            String format = String.format(Locale.ENGLISH, "CONNECT %s:%s HTTP/1.1\r\nHost: %s\r\n\r\n", this.f9621.getHost(), Integer.valueOf(this.f9622), this.f9621.getHost());
            this.f9620.f9584.m10514("Proxying: " + format);
            f0.m9429(lVar, format.getBytes(), new a(lVar));
        }
    }

    public i(n2.a aVar) {
        super(aVar, "https", 443);
        this.f9615 = new ArrayList();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    protected SSLEngine m10525(d.a aVar, String str, int i5) {
        SSLContext m10526 = m10526();
        Iterator<h> it = this.f9615.iterator();
        SSLEngine sSLEngine = null;
        while (it.hasNext() && (sSLEngine = it.next().mo10474(m10526, str, i5)) == null) {
        }
        Iterator<h> it2 = this.f9615.iterator();
        while (it2.hasNext()) {
            it2.next().mo10475(sSLEngine, aVar, str, i5);
        }
        return sSLEngine;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public SSLContext m10526() {
        SSLContext sSLContext = this.f9612;
        return sSLContext != null ? sSLContext : k2.e.m9403();
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    protected e.h m10527(d.a aVar, l2.b bVar) {
        return new a(bVar);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m10528(SSLContext sSLContext) {
        this.f9612 = sSLContext;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m10529(HostnameVerifier hostnameVerifier) {
        this.f9614 = hostnameVerifier;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    protected void m10530(k2.l lVar, d.a aVar, Uri uri, int i5, l2.b bVar) {
        k2.e.m9405(lVar, uri.getHost(), i5, m10525(aVar, uri.getHost(), i5), this.f9613, this.f9614, true, m10527(aVar, bVar));
    }

    @Override // n2.o
    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    protected l2.b mo10531(d.a aVar, Uri uri, int i5, boolean z5, l2.b bVar) {
        return new b(bVar, z5, aVar, uri, i5);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m10532(h hVar) {
        this.f9615.add(hVar);
    }
}
