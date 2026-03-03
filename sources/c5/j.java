package c5;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* compiled from: GzipSource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j implements s {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final e f5022;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Inflater f5023;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final k f5024;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f5021 = 0;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final CRC32 f5025 = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f5023 = inflater;
        e m5954 = l.m5954(sVar);
        this.f5022 = m5954;
        this.f5024 = new k(m5954, inflater);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5947(String str, int i5, int i6) throws IOException {
        if (i6 != i5) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i6), Integer.valueOf(i5)));
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m5948() throws IOException {
        this.f5022.mo5899(10L);
        byte m5900 = this.f5022.mo5872().m5900(3L);
        boolean z5 = ((m5900 >> 1) & 1) == 1;
        if (z5) {
            m5950(this.f5022.mo5872(), 0L, 10L);
        }
        m5947("ID1ID2", 8075, this.f5022.readShort());
        this.f5022.skip(8L);
        if (((m5900 >> 2) & 1) == 1) {
            this.f5022.mo5899(2L);
            if (z5) {
                m5950(this.f5022.mo5872(), 0L, 2L);
            }
            long mo5895 = this.f5022.mo5872().mo5895();
            this.f5022.mo5899(mo5895);
            if (z5) {
                m5950(this.f5022.mo5872(), 0L, mo5895);
            }
            this.f5022.skip(mo5895);
        }
        if (((m5900 >> 3) & 1) == 1) {
            long mo5903 = this.f5022.mo5903((byte) 0);
            if (mo5903 == -1) {
                throw new EOFException();
            }
            if (z5) {
                m5950(this.f5022.mo5872(), 0L, mo5903 + 1);
            }
            this.f5022.skip(mo5903 + 1);
        }
        if (((m5900 >> 4) & 1) == 1) {
            long mo59032 = this.f5022.mo5903((byte) 0);
            if (mo59032 == -1) {
                throw new EOFException();
            }
            if (z5) {
                m5950(this.f5022.mo5872(), 0L, mo59032 + 1);
            }
            this.f5022.skip(mo59032 + 1);
        }
        if (z5) {
            m5947("FHCRC", this.f5022.mo5895(), (short) this.f5025.getValue());
            this.f5025.reset();
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private void m5949() throws IOException {
        m5947("CRC", this.f5022.mo5888(), (int) this.f5025.getValue());
        m5947("ISIZE", this.f5022.mo5888(), (int) this.f5023.getBytesWritten());
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m5950(c cVar, long j5, long j6) {
        o oVar = cVar.f5010;
        while (true) {
            int i5 = oVar.f5045;
            int i6 = oVar.f5044;
            if (j5 < i5 - i6) {
                break;
            }
            j5 -= i5 - i6;
            oVar = oVar.f5048;
        }
        while (j6 > 0) {
            int min = (int) Math.min(oVar.f5045 - r7, j6);
            this.f5025.update(oVar.f5043, (int) (oVar.f5044 + j5), min);
            j6 -= min;
            oVar = oVar.f5048;
            j5 = 0;
        }
    }

    @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5024.close();
    }

    @Override // c5.s
    /* renamed from: ʼ */
    public t mo5868() {
        return this.f5022.mo5868();
    }

    @Override // c5.s
    /* renamed from: י */
    public long mo5869(c cVar, long j5) throws IOException {
        if (j5 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j5);
        }
        if (j5 == 0) {
            return 0L;
        }
        if (this.f5021 == 0) {
            m5948();
            this.f5021 = 1;
        }
        if (this.f5021 == 1) {
            long j6 = cVar.f5011;
            long mo5869 = this.f5024.mo5869(cVar, j5);
            if (mo5869 != -1) {
                m5950(cVar, j6, mo5869);
                return mo5869;
            }
            this.f5021 = 2;
        }
        if (this.f5021 == 2) {
            m5949();
            this.f5021 = 3;
            if (!this.f5022.mo5890()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
