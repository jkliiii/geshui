package u2;

import java.io.IOException;
import java.io.InputStream;
import k2.q;

/* compiled from: ByteBufferListInputStream.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends InputStream {

    /* renamed from: ʾ, reason: contains not printable characters */
    q f11521;

    public a(q qVar) {
        this.f11521 = qVar;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f11521.m9500() <= 0) {
            return -1;
        }
        return this.f11521.m9488() & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i5, int i6) throws IOException {
        if (this.f11521.m9500() <= 0) {
            return -1;
        }
        int min = Math.min(i6, this.f11521.m9500());
        this.f11521.m9492(bArr, i5, min);
        return min;
    }
}
