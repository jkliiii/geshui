package u2;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import k2.k;
import k2.q;
import k2.u;
import l2.g;

/* compiled from: OutputStreamDataSink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d implements u {

    /* renamed from: ʻ, reason: contains not printable characters */
    k f11536;

    /* renamed from: ʼ, reason: contains not printable characters */
    OutputStream f11537;

    /* renamed from: ʽ, reason: contains not printable characters */
    g f11538;

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean f11539;

    /* renamed from: ʿ, reason: contains not printable characters */
    Exception f11540;

    /* renamed from: ˆ, reason: contains not printable characters */
    l2.a f11541;

    public d(k kVar) {
        this(kVar, null);
    }

    @Override // k2.u
    public void end() {
        try {
            OutputStream outputStream = this.f11537;
            if (outputStream != null) {
                outputStream.close();
            }
            m12209(null);
        } catch (IOException e5) {
            m12209(e5);
        }
    }

    @Override // k2.u
    /* renamed from: ʻ */
    public k mo9358() {
        return this.f11536;
    }

    /* renamed from: ʼ */
    public OutputStream mo12205() throws IOException {
        return this.f11537;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m12209(Exception exc) {
        if (this.f11539) {
            return;
        }
        this.f11539 = true;
        this.f11540 = exc;
        l2.a aVar = this.f11541;
        if (aVar != null) {
            aVar.mo9412(exc);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m12210(OutputStream outputStream) {
        this.f11537 = outputStream;
    }

    @Override // k2.u
    /* renamed from: ˋ */
    public void mo9361(q qVar) {
        while (qVar.m9484() > 0) {
            try {
                try {
                    ByteBuffer m9502 = qVar.m9502();
                    mo12205().write(m9502.array(), m9502.arrayOffset() + m9502.position(), m9502.remaining());
                    q.m9482(m9502);
                } catch (IOException e5) {
                    m12209(e5);
                }
            } finally {
                qVar.m9507();
            }
        }
    }

    @Override // k2.u
    /* renamed from: י */
    public void mo9364(g gVar) {
        this.f11538 = gVar;
    }

    @Override // k2.u
    /* renamed from: ᴵᴵ */
    public void mo9368(l2.a aVar) {
        this.f11541 = aVar;
    }

    public d(k kVar, OutputStream outputStream) {
        this.f11536 = kVar;
        m12210(outputStream);
    }
}
