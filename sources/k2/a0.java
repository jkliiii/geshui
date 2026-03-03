package k2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: LineEmitter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a0 implements l2.d {

    /* renamed from: ʻ, reason: contains not printable characters */
    Charset f8689;

    /* renamed from: ʼ, reason: contains not printable characters */
    q f8690;

    /* renamed from: ʽ, reason: contains not printable characters */
    a f8691;

    /* compiled from: LineEmitter.java */
    public interface a {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo9378(String str);
    }

    public a0() {
        this(null);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m9376(a aVar) {
        this.f8691 = aVar;
    }

    @Override // l2.d
    /* renamed from: ᵢ, reason: contains not printable characters */
    public void mo9377(s sVar, q qVar) {
        ByteBuffer allocate = ByteBuffer.allocate(qVar.m9500());
        while (qVar.m9500() > 0) {
            byte m9488 = qVar.m9488();
            if (m9488 == 10) {
                allocate.flip();
                this.f8690.m9483(allocate);
                this.f8691.mo9378(this.f8690.m9506(this.f8689));
                this.f8690 = new q();
                return;
            }
            allocate.put(m9488);
        }
        allocate.flip();
        this.f8690.m9483(allocate);
    }

    public a0(Charset charset) {
        this.f8690 = new q();
        this.f8689 = charset;
    }
}
