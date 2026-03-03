package y1;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkEnforcingInputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends FilterInputStream {

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f12458;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f12458 = RecyclerView.UNDEFINED_DURATION;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private long m12887(long j5) {
        int i5 = this.f12458;
        if (i5 == 0) {
            return -1L;
        }
        return (i5 == Integer.MIN_VALUE || j5 <= ((long) i5)) ? j5 : i5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m12888(long j5) {
        int i5 = this.f12458;
        if (i5 == Integer.MIN_VALUE || j5 == -1) {
            return;
        }
        this.f12458 = (int) (i5 - j5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i5 = this.f12458;
        return i5 == Integer.MIN_VALUE ? super.available() : Math.min(i5, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i5) {
        super.mark(i5);
        this.f12458 = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m12887(1L) == -1) {
            return -1;
        }
        int read = super.read();
        m12888(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f12458 = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j5) throws IOException {
        long m12887 = m12887(j5);
        if (m12887 == -1) {
            return 0L;
        }
        long skip = super.skip(m12887);
        m12888(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        int m12887 = (int) m12887(i6);
        if (m12887 == -1) {
            return -1;
        }
        int read = super.read(bArr, i5, m12887);
        m12888(read);
        return read;
    }
}
