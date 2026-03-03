package c5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: InflaterSource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k implements s {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final e f5026;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Inflater f5027;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f5028;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f5029;

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f5026 = eVar;
        this.f5027 = inflater;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m5951() throws IOException {
        int i5 = this.f5028;
        if (i5 == 0) {
            return;
        }
        int remaining = i5 - this.f5027.getRemaining();
        this.f5028 -= remaining;
        this.f5026.skip(remaining);
    }

    @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f5029) {
            return;
        }
        this.f5027.end();
        this.f5029 = true;
        this.f5026.close();
    }

    @Override // c5.s
    /* renamed from: ʼ */
    public t mo5868() {
        return this.f5026.mo5868();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final boolean m5952() throws IOException {
        if (!this.f5027.needsInput()) {
            return false;
        }
        m5951();
        if (this.f5027.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f5026.mo5890()) {
            return true;
        }
        o oVar = this.f5026.mo5872().f5010;
        int i5 = oVar.f5045;
        int i6 = oVar.f5044;
        int i7 = i5 - i6;
        this.f5028 = i7;
        this.f5027.setInput(oVar.f5043, i6, i7);
        return false;
    }

    @Override // c5.s
    /* renamed from: י */
    public long mo5869(c cVar, long j5) throws IOException {
        boolean m5952;
        if (j5 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j5);
        }
        if (this.f5029) {
            throw new IllegalStateException("closed");
        }
        if (j5 == 0) {
            return 0L;
        }
        do {
            m5952 = m5952();
            try {
                o m5882 = cVar.m5882(1);
                int inflate = this.f5027.inflate(m5882.f5043, m5882.f5045, (int) Math.min(j5, 8192 - m5882.f5045));
                if (inflate > 0) {
                    m5882.f5045 += inflate;
                    long j6 = inflate;
                    cVar.f5011 += j6;
                    return j6;
                }
                if (!this.f5027.finished() && !this.f5027.needsDictionary()) {
                }
                m5951();
                if (m5882.f5044 != m5882.f5045) {
                    return -1L;
                }
                cVar.f5010 = m5882.m5967();
                p.m5972(m5882);
                return -1L;
            } catch (DataFormatException e5) {
                throw new IOException(e5);
            }
        } while (!m5952);
        throw new EOFException("source exhausted prematurely");
    }
}
