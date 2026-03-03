package k2;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: FileDataEmitter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class w extends t {

    /* renamed from: ʾ, reason: contains not printable characters */
    k f8849;

    /* renamed from: ʿ, reason: contains not printable characters */
    File f8850;

    /* renamed from: ˆ, reason: contains not printable characters */
    l2.d f8851;

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f8852;

    /* renamed from: ˊ, reason: contains not printable characters */
    FileChannel f8854;

    /* renamed from: ˉ, reason: contains not printable characters */
    q f8853 = new q();

    /* renamed from: ˋ, reason: contains not printable characters */
    Runnable f8855 = new a();

    /* compiled from: FileDataEmitter.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                w wVar = w.this;
                if (wVar.f8854 == null) {
                    wVar.f8854 = new FileInputStream(w.this.f8850).getChannel();
                }
                if (!w.this.f8853.m9501()) {
                    w wVar2 = w.this;
                    f0.m9422(wVar2, wVar2.f8853);
                    if (!w.this.f8853.m9501()) {
                        return;
                    }
                }
                do {
                    ByteBuffer m9480 = q.m9480(8192);
                    if (-1 == w.this.f8854.read(m9480)) {
                        w.this.mo9511(null);
                        return;
                    }
                    m9480.flip();
                    w.this.f8853.m9483(m9480);
                    w wVar3 = w.this;
                    f0.m9422(wVar3, wVar3.f8853);
                    if (w.this.f8853.m9500() != 0) {
                        return;
                    }
                } while (!w.this.mo9370());
            } catch (Exception e5) {
                w.this.mo9511(e5);
            }
        }
    }

    public w(k kVar, File file) {
        this.f8849 = kVar;
        this.f8850 = file;
        boolean z5 = !kVar.m9458();
        this.f8852 = z5;
        if (z5) {
            return;
        }
        m9515();
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m9515() {
        this.f8849.m9462(this.f8855);
    }

    @Override // k2.s
    public void close() {
        try {
            this.f8854.close();
        } catch (Exception unused) {
        }
    }

    @Override // k2.s, k2.u
    /* renamed from: ʻ */
    public k mo9358() {
        return this.f8849;
    }

    @Override // k2.s
    /* renamed from: ʽ */
    public void mo9359() {
        this.f8852 = true;
    }

    @Override // k2.t
    /* renamed from: ʿʿ */
    protected void mo9511(Exception exc) {
        v2.h.m12364(this.f8854);
        super.mo9511(exc);
    }

    @Override // k2.t, k2.s
    /* renamed from: ˎ */
    public void mo9362(l2.d dVar) {
        this.f8851 = dVar;
    }

    @Override // k2.s
    /* renamed from: ـ */
    public void mo9365() {
        this.f8852 = false;
        m9515();
    }

    @Override // k2.s
    /* renamed from: ᵔ */
    public boolean mo9370() {
        return this.f8852;
    }

    @Override // k2.t, k2.s
    /* renamed from: ﾞ */
    public l2.d mo9375() {
        return this.f8851;
    }
}
