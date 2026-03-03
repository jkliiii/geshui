package s4;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: RealCall.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class x implements d {

    /* renamed from: ʾ, reason: contains not printable characters */
    final v f11217;

    /* renamed from: ʿ, reason: contains not printable characters */
    final w4.j f11218;

    /* renamed from: ˆ, reason: contains not printable characters */
    final c5.a f11219;

    /* renamed from: ˈ, reason: contains not printable characters */
    @Nullable
    private o f11220;

    /* renamed from: ˉ, reason: contains not printable characters */
    final y f11221;

    /* renamed from: ˊ, reason: contains not printable characters */
    final boolean f11222;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f11223;

    /* compiled from: RealCall.java */
    class a extends c5.a {
        a() {
        }

        @Override // c5.a
        /* renamed from: ᵔ */
        protected void mo5865() {
            x.this.cancel();
        }
    }

    /* compiled from: RealCall.java */
    final class b extends t4.b {

        /* renamed from: ʿ, reason: contains not printable characters */
        private final e f11225;

        b(e eVar) {
            super("OkHttp %s", x.this.m11997());
            this.f11225 = eVar;
        }

        @Override // t4.b
        /* renamed from: ˎ, reason: contains not printable characters */
        protected void mo12000() {
            Throwable th;
            boolean z5;
            IOException e5;
            x.this.f11219.m5858();
            try {
                try {
                    z5 = true;
                } catch (IOException e6) {
                    e5 = e6;
                    z5 = false;
                } catch (Throwable th2) {
                    th = th2;
                    z5 = false;
                }
                try {
                    this.f11225.mo10836(x.this, x.this.m11996());
                } catch (IOException e7) {
                    e5 = e7;
                    IOException m11998 = x.this.m11998(e5);
                    if (z5) {
                        z4.k.m13239().mo13216(4, "Callback failure for " + x.this.m11999(), m11998);
                    } else {
                        x.this.f11220.m11846(x.this, m11998);
                        this.f11225.mo10835(x.this, m11998);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    x.this.cancel();
                    if (!z5) {
                        this.f11225.mo10835(x.this, new IOException("canceled due to " + th));
                    }
                    throw th;
                }
            } finally {
                x.this.f11217.m11959().m11842(this);
            }
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        void m12001(ExecutorService executorService) {
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e5) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e5);
                    x.this.f11220.m11846(x.this, interruptedIOException);
                    this.f11225.mo10835(x.this, interruptedIOException);
                    x.this.f11217.m11959().m11842(this);
                }
            } catch (Throwable th) {
                x.this.f11217.m11959().m11842(this);
                throw th;
            }
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        x m12002() {
            return x.this;
        }

        /* renamed from: י, reason: contains not printable characters */
        String m12003() {
            return x.this.f11221.m12011().m11912();
        }
    }

    private x(v vVar, y yVar, boolean z5) {
        this.f11217 = vVar;
        this.f11221 = yVar;
        this.f11222 = z5;
        this.f11218 = new w4.j(vVar, z5);
        a aVar = new a();
        this.f11219 = aVar;
        aVar.mo5944(vVar.m11952(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m11993() {
        this.f11218.m12625(z4.k.m13239().mo13214("response.body().close()"));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static x m11994(v vVar, y yVar, boolean z5) {
        x xVar = new x(vVar, yVar, z5);
        xVar.f11220 = vVar.m11961().mo11865(xVar);
        return xVar;
    }

    @Override // s4.d
    public void cancel() {
        this.f11218.m12623();
    }

    @Override // s4.d
    /* renamed from: ʽ */
    public void mo11788(e eVar) {
        synchronized (this) {
            if (this.f11223) {
                throw new IllegalStateException("Already Executed");
            }
            this.f11223 = true;
        }
        m11993();
        this.f11220.m11847(this);
        this.f11217.m11959().m11840(new b(eVar));
    }

    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public x clone() {
        return m11994(this.f11217, this.f11221, this.f11222);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    a0 m11996() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f11217.m11965());
        arrayList.add(this.f11218);
        arrayList.add(new w4.a(this.f11217.m11958()));
        this.f11217.m11966();
        arrayList.add(new u4.a(null));
        arrayList.add(new v4.a(this.f11217));
        if (!this.f11222) {
            arrayList.addAll(this.f11217.m11968());
        }
        arrayList.add(new w4.b(this.f11222));
        a0 mo11944 = new w4.g(arrayList, null, null, null, 0, this.f11221, this, this.f11220, this.f11217.m11955(), this.f11217.m11976(), this.f11217.m11953()).mo11944(this.f11221);
        if (!this.f11218.m12624()) {
            return mo11944;
        }
        t4.c.m12059(mo11944);
        throw new IOException("Canceled");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    String m11997() {
        return this.f11221.m12011().m11916();
    }

    @Override // s4.d
    /* renamed from: ˉ */
    public boolean mo11789() {
        return this.f11218.m12624();
    }

    @Nullable
    /* renamed from: ˊ, reason: contains not printable characters */
    IOException m11998(@Nullable IOException iOException) {
        if (!this.f11219.m5861()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    String m11999() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo11789() ? "canceled " : BuildConfig.FLAVOR);
        sb.append(this.f11222 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(m11997());
        return sb.toString();
    }
}
