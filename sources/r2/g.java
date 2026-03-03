package r2;

import java.nio.ByteBuffer;
import java.util.zip.Inflater;
import k2.f0;
import k2.q;
import k2.s;
import k2.x;

/* compiled from: InflaterInputFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends x {

    /* renamed from: ˉ, reason: contains not printable characters */
    private Inflater f10846;

    /* renamed from: ˊ, reason: contains not printable characters */
    q f10847;

    public g() {
        this(new Inflater());
    }

    @Override // k2.t
    /* renamed from: ʿʿ */
    protected void mo9511(Exception exc) {
        this.f10846.end();
        if (exc != null && this.f10846.getRemaining() > 0) {
            exc = new e("data still remaining in inflater", exc);
        }
        super.mo9511(exc);
    }

    @Override // k2.x, l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        try {
            ByteBuffer m9480 = q.m9480(qVar.m9500() * 2);
            while (qVar.m9484() > 0) {
                ByteBuffer m9502 = qVar.m9502();
                if (m9502.hasRemaining()) {
                    m9502.remaining();
                    this.f10846.setInput(m9502.array(), m9502.arrayOffset() + m9502.position(), m9502.remaining());
                    do {
                        m9480.position(m9480.position() + this.f10846.inflate(m9480.array(), m9480.arrayOffset() + m9480.position(), m9480.remaining()));
                        if (!m9480.hasRemaining()) {
                            m9480.flip();
                            this.f10847.m9483(m9480);
                            m9480 = q.m9480(m9480.capacity() * 2);
                        }
                        if (!this.f10846.needsInput()) {
                        }
                    } while (!this.f10846.finished());
                }
                q.m9482(m9502);
            }
            m9480.flip();
            this.f10847.m9483(m9480);
            f0.m9422(this, this.f10847);
        } catch (Exception e5) {
            mo9511(e5);
        }
    }

    public g(Inflater inflater) {
        this.f10847 = new q();
        this.f10846 = inflater;
    }
}
