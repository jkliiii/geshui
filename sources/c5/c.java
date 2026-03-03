package c5;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Buffer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final byte[] f5009 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: ʾ, reason: contains not printable characters */
    @Nullable
    o f5010;

    /* renamed from: ʿ, reason: contains not printable characters */
    long f5011;

    /* compiled from: Buffer.java */
    class a extends InputStream {
        a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f5011, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f5011 > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return c.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) {
            return c.this.read(bArr, i5, i6);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j5 = this.f5011;
        if (j5 != cVar.f5011) {
            return false;
        }
        long j6 = 0;
        if (j5 == 0) {
            return true;
        }
        o oVar = this.f5010;
        o oVar2 = cVar.f5010;
        int i5 = oVar.f5044;
        int i6 = oVar2.f5044;
        while (j6 < this.f5011) {
            long min = Math.min(oVar.f5045 - i5, oVar2.f5045 - i6);
            int i7 = 0;
            while (i7 < min) {
                int i8 = i5 + 1;
                int i9 = i6 + 1;
                if (oVar.f5043[i5] != oVar2.f5043[i6]) {
                    return false;
                }
                i7++;
                i5 = i8;
                i6 = i9;
            }
            if (i5 == oVar.f5045) {
                oVar = oVar.f5048;
                i5 = oVar.f5044;
            }
            if (i6 == oVar2.f5045) {
                oVar2 = oVar2.f5048;
                i6 = oVar2.f5044;
            }
            j6 += min;
        }
        return true;
    }

    public int hashCode() {
        o oVar = this.f5010;
        if (oVar == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i6 = oVar.f5045;
            for (int i7 = oVar.f5044; i7 < i6; i7++) {
                i5 = (i5 * 31) + oVar.f5043[i7];
            }
            oVar = oVar.f5048;
        } while (oVar != this.f5010);
        return i5;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public int read(byte[] bArr, int i5, int i6) {
        u.m5978(bArr.length, i5, i6);
        o oVar = this.f5010;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(i6, oVar.f5045 - oVar.f5044);
        System.arraycopy(oVar.f5043, oVar.f5044, bArr, i5, min);
        int i7 = oVar.f5044 + min;
        oVar.f5044 = i7;
        this.f5011 -= min;
        if (i7 == oVar.f5045) {
            this.f5010 = oVar.m5967();
            p.m5972(oVar);
        }
        return min;
    }

    @Override // c5.e
    public byte readByte() {
        long j5 = this.f5011;
        if (j5 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f5010;
        int i5 = oVar.f5044;
        int i6 = oVar.f5045;
        int i7 = i5 + 1;
        byte b6 = oVar.f5043[i5];
        this.f5011 = j5 - 1;
        if (i7 == i6) {
            this.f5010 = oVar.m5967();
            p.m5972(oVar);
        } else {
            oVar.f5044 = i7;
        }
        return b6;
    }

    @Override // c5.e
    public void readFully(byte[] bArr) throws EOFException {
        int i5 = 0;
        while (i5 < bArr.length) {
            int read = read(bArr, i5, bArr.length - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
    }

    @Override // c5.e
    public int readInt() {
        long j5 = this.f5011;
        if (j5 < 4) {
            throw new IllegalStateException("size < 4: " + this.f5011);
        }
        o oVar = this.f5010;
        int i5 = oVar.f5044;
        int i6 = oVar.f5045;
        if (i6 - i5 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f5043;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & 255) << 24) | ((bArr[i7] & 255) << 16);
        int i10 = i8 + 1;
        int i11 = i9 | ((bArr[i8] & 255) << 8);
        int i12 = i10 + 1;
        int i13 = i11 | (bArr[i10] & 255);
        this.f5011 = j5 - 4;
        if (i12 == i6) {
            this.f5010 = oVar.m5967();
            p.m5972(oVar);
        } else {
            oVar.f5044 = i12;
        }
        return i13;
    }

    @Override // c5.e
    public short readShort() {
        long j5 = this.f5011;
        if (j5 < 2) {
            throw new IllegalStateException("size < 2: " + this.f5011);
        }
        o oVar = this.f5010;
        int i5 = oVar.f5044;
        int i6 = oVar.f5045;
        if (i6 - i5 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f5043;
        int i7 = i5 + 1;
        int i8 = i7 + 1;
        int i9 = ((bArr[i5] & 255) << 8) | (bArr[i7] & 255);
        this.f5011 = j5 - 2;
        if (i8 == i6) {
            this.f5010 = oVar.m5967();
            p.m5972(oVar);
        } else {
            oVar.f5044 = i8;
        }
        return (short) i9;
    }

    public final long size() {
        return this.f5011;
    }

    @Override // c5.e
    public void skip(long j5) throws EOFException {
        while (j5 > 0) {
            if (this.f5010 == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j5, r0.f5045 - r0.f5044);
            long j6 = min;
            this.f5011 -= j6;
            j5 -= j6;
            o oVar = this.f5010;
            int i5 = oVar.f5044 + min;
            oVar.f5044 = i5;
            if (i5 == oVar.f5045) {
                this.f5010 = oVar.m5967();
                p.m5972(oVar);
            }
        }
    }

    public String toString() {
        return m5881().toString();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public boolean m5873(long j5, f fVar, int i5, int i6) {
        if (j5 < 0 || i5 < 0 || i6 < 0 || this.f5011 - j5 < i6 || fVar.mo5930() - i5 < i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (m5900(i7 + j5) != fVar.mo5924(i5 + i7)) {
                return false;
            }
        }
        return true;
    }

    @Override // c5.s
    /* renamed from: ʼ */
    public t mo5868() {
        return t.f5054;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public String m5874(long j5, Charset charset) throws EOFException {
        u.m5978(this.f5011, 0L, j5);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j5 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j5);
        }
        if (j5 == 0) {
            return BuildConfig.FLAVOR;
        }
        o oVar = this.f5010;
        int i5 = oVar.f5044;
        if (i5 + j5 > oVar.f5045) {
            return new String(mo5892(j5), charset);
        }
        String str = new String(oVar.f5043, i5, (int) j5, charset);
        int i6 = (int) (oVar.f5044 + j5);
        oVar.f5044 = i6;
        this.f5011 -= j5;
        if (i6 == oVar.f5045) {
            this.f5010 = oVar.m5967();
            p.m5972(oVar);
        }
        return str;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public f m5875() {
        return new f(mo5886());
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public String m5877(long j5) throws EOFException {
        return m5874(j5, u.f5058);
    }

    @Override // c5.e
    /* renamed from: ʿ, reason: contains not printable characters */
    public f mo5878(long j5) throws EOFException {
        return new f(mo5892(j5));
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public String m5879() {
        try {
            return m5874(this.f5011, u.f5058);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // c5.e
    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean mo5880(long j5, f fVar) {
        return m5873(j5, fVar, 0, fVar.mo5930());
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public final f m5881() {
        long j5 = this.f5011;
        if (j5 <= 2147483647L) {
            return m5883((int) j5);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f5011);
    }

    @Override // c5.r
    /* renamed from: ˈ */
    public void mo5867(c cVar, long j5) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        u.m5978(cVar.f5011, 0L, j5);
        while (j5 > 0) {
            o oVar = cVar.f5010;
            if (j5 < oVar.f5045 - oVar.f5044) {
                o oVar2 = this.f5010;
                o oVar3 = oVar2 != null ? oVar2.f5049 : null;
                if (oVar3 != null && oVar3.f5047) {
                    if ((oVar3.f5045 + j5) - (oVar3.f5046 ? 0 : oVar3.f5044) <= 8192) {
                        oVar.m5971(oVar3, (int) j5);
                        cVar.f5011 -= j5;
                        this.f5011 += j5;
                        return;
                    }
                }
                cVar.f5010 = oVar.m5970((int) j5);
            }
            o oVar4 = cVar.f5010;
            long j6 = oVar4.f5045 - oVar4.f5044;
            cVar.f5010 = oVar4.m5967();
            o oVar5 = this.f5010;
            if (oVar5 == null) {
                this.f5010 = oVar4;
                oVar4.f5049 = oVar4;
                oVar4.f5048 = oVar4;
            } else {
                oVar5.f5049.m5968(oVar4).m5966();
            }
            cVar.f5011 -= j6;
            this.f5011 += j6;
            j5 -= j6;
        }
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    o m5882(int i5) {
        if (i5 < 1 || i5 > 8192) {
            throw new IllegalArgumentException();
        }
        o oVar = this.f5010;
        if (oVar != null) {
            o oVar2 = oVar.f5049;
            return (oVar2.f5045 + i5 > 8192 || !oVar2.f5047) ? oVar2.m5968(p.m5973()) : oVar2;
        }
        o m5973 = p.m5973();
        this.f5010 = m5973;
        m5973.f5049 = m5973;
        m5973.f5048 = m5973;
        return m5973;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public final f m5883(int i5) {
        return i5 == 0 ? f.f5014 : new q(this, i5);
    }

    @Override // c5.e
    /* renamed from: ˊ, reason: contains not printable characters */
    public String mo5884() throws EOFException {
        return mo5897(Long.MAX_VALUE);
    }

    @Override // c5.d
    /* renamed from: ˊˊ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // c5.e
    /* renamed from: ˋ, reason: contains not printable characters */
    public byte[] mo5886() {
        try {
            return mo5892(this.f5011);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public c m5887(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.mo5936(this);
        return this;
    }

    @Override // c5.e
    /* renamed from: ˎ, reason: contains not printable characters */
    public int mo5888() {
        return u.m5979(readInt());
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public long m5889(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j5 = 0;
        while (true) {
            long mo5869 = sVar.mo5869(this, 8192L);
            if (mo5869 == -1) {
                return j5;
            }
            j5 += mo5869;
        }
    }

    @Override // c5.e
    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean mo5890() {
        return this.f5011 == 0;
    }

    @Override // c5.d
    /* renamed from: ˏˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i5, int i6) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j5 = i6;
        u.m5978(bArr.length, i5, j5);
        int i7 = i6 + i5;
        while (i5 < i7) {
            o m5882 = m5882(1);
            int min = Math.min(i7 - i5, 8192 - m5882.f5045);
            System.arraycopy(bArr, i5, m5882.f5043, m5882.f5045, min);
            i5 += min;
            m5882.f5045 += min;
        }
        this.f5011 += j5;
        return this;
    }

    @Override // c5.e
    /* renamed from: ˑ, reason: contains not printable characters */
    public byte[] mo5892(long j5) throws EOFException {
        u.m5978(this.f5011, 0L, j5);
        if (j5 <= 2147483647L) {
            byte[] bArr = new byte[(int) j5];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j5);
    }

    @Override // c5.d
    /* renamed from: ˑˑ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c writeByte(int i5) {
        o m5882 = m5882(1);
        byte[] bArr = m5882.f5043;
        int i6 = m5882.f5045;
        m5882.f5045 = i6 + 1;
        bArr[i6] = (byte) i5;
        this.f5011++;
        return this;
    }

    @Override // c5.s
    /* renamed from: י */
    public long mo5869(c cVar, long j5) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j5 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j5);
        }
        long j6 = this.f5011;
        if (j6 == 0) {
            return -1L;
        }
        if (j5 > j6) {
            j5 = j6;
        }
        cVar.mo5867(this, j5);
        return j5;
    }

    @Override // c5.d
    /* renamed from: יי, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c writeInt(int i5) {
        o m5882 = m5882(4);
        byte[] bArr = m5882.f5043;
        int i6 = m5882.f5045;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 24) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((i5 >>> 16) & 255);
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((i5 >>> 8) & 255);
        bArr[i9] = (byte) (i5 & 255);
        m5882.f5045 = i9 + 1;
        this.f5011 += 4;
        return this;
    }

    @Override // c5.e
    /* renamed from: ـ, reason: contains not printable characters */
    public short mo5895() {
        return u.m5980(readShort());
    }

    /* renamed from: ــ, reason: contains not printable characters */
    String m5896(long j5) throws EOFException {
        if (j5 > 0) {
            long j6 = j5 - 1;
            if (m5900(j6) == 13) {
                String m5877 = m5877(j6);
                skip(2L);
                return m5877;
            }
        }
        String m58772 = m5877(j5);
        skip(1L);
        return m58772;
    }

    @Override // c5.e
    /* renamed from: ٴ, reason: contains not printable characters */
    public String mo5897(long j5) throws EOFException {
        if (j5 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j5);
        }
        long j6 = j5 != Long.MAX_VALUE ? j5 + 1 : Long.MAX_VALUE;
        long m5902 = m5902((byte) 10, 0L, j6);
        if (m5902 != -1) {
            return m5896(m5902);
        }
        if (j6 < size() && m5900(j6 - 1) == 13 && m5900(j6) == 10) {
            return m5896(j6);
        }
        c cVar = new c();
        m5915(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j5) + " content=" + cVar.m5875().mo5925() + (char) 8230);
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    public c m5898(int i5) {
        if (i5 < 128) {
            writeByte(i5);
        } else if (i5 < 2048) {
            writeByte((i5 >> 6) | 192);
            writeByte((i5 & 63) | 128);
        } else if (i5 < 65536) {
            if (i5 < 55296 || i5 > 57343) {
                writeByte((i5 >> 12) | 224);
                writeByte(((i5 >> 6) & 63) | 128);
                writeByte((i5 & 63) | 128);
            } else {
                writeByte(63);
            }
        } else {
            if (i5 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i5));
            }
            writeByte((i5 >> 18) | 240);
            writeByte(((i5 >> 12) & 63) | 128);
            writeByte(((i5 >> 6) & 63) | 128);
            writeByte((i5 & 63) | 128);
        }
        return this;
    }

    @Override // c5.e
    /* renamed from: ᐧ, reason: contains not printable characters */
    public void mo5899(long j5) throws EOFException {
        if (this.f5011 < j5) {
            throw new EOFException();
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public final byte m5900(long j5) {
        int i5;
        u.m5978(this.f5011, j5, 1L);
        long j6 = this.f5011;
        if (j6 - j5 <= j5) {
            long j7 = j5 - j6;
            o oVar = this.f5010;
            do {
                oVar = oVar.f5049;
                int i6 = oVar.f5045;
                i5 = oVar.f5044;
                j7 += i6 - i5;
            } while (j7 < 0);
            return oVar.f5043[i5 + ((int) j7)];
        }
        o oVar2 = this.f5010;
        while (true) {
            int i7 = oVar2.f5045;
            int i8 = oVar2.f5044;
            long j8 = i7 - i8;
            if (j5 < j8) {
                return oVar2.f5043[i8 + ((int) j5)];
            }
            j5 -= j8;
            oVar2 = oVar2.f5048;
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public long m5902(byte b6, long j5, long j6) {
        o oVar;
        long j7 = 0;
        if (j5 < 0 || j6 < j5) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f5011), Long.valueOf(j5), Long.valueOf(j6)));
        }
        long j8 = this.f5011;
        long j9 = j6 > j8 ? j8 : j6;
        if (j5 == j9 || (oVar = this.f5010) == null) {
            return -1L;
        }
        if (j8 - j5 < j5) {
            while (j8 > j5) {
                oVar = oVar.f5049;
                j8 -= oVar.f5045 - oVar.f5044;
            }
        } else {
            while (true) {
                long j10 = (oVar.f5045 - oVar.f5044) + j7;
                if (j10 >= j5) {
                    break;
                }
                oVar = oVar.f5048;
                j7 = j10;
            }
            j8 = j7;
        }
        long j11 = j5;
        while (j8 < j9) {
            byte[] bArr = oVar.f5043;
            int min = (int) Math.min(oVar.f5045, (oVar.f5044 + j9) - j8);
            for (int i5 = (int) ((oVar.f5044 + j11) - j8); i5 < min; i5++) {
                if (bArr[i5] == b6) {
                    return (i5 - oVar.f5044) + j8;
                }
            }
            j8 += oVar.f5045 - oVar.f5044;
            oVar = oVar.f5048;
            j11 = j8;
        }
        return -1L;
    }

    @Override // c5.e
    /* renamed from: ᵎ, reason: contains not printable characters */
    public long mo5903(byte b6) {
        return m5902(b6, 0L, Long.MAX_VALUE);
    }

    @Override // c5.d
    /* renamed from: ᵎᵎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c writeShort(int i5) {
        o m5882 = m5882(2);
        byte[] bArr = m5882.f5043;
        int i6 = m5882.f5045;
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((i5 >>> 8) & 255);
        bArr[i7] = (byte) (i5 & 255);
        m5882.f5045 = i7 + 1;
        this.f5011 += 2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[EDGE_INSN: B:41:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:4:0x000b->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // c5.e
    /* renamed from: ᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo5905() {
        /*
            r15 = this;
            long r0 = r15.f5011
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lac
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            c5.o r6 = r15.f5010
            byte[] r7 = r6.f5043
            int r8 = r6.f5044
            int r9 = r6.f5045
        L13:
            if (r8 >= r9) goto L91
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L72
            r11 = 70
            if (r10 > r11) goto L72
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L4a:
            c5.c r0 = new c5.c
            r0.<init>()
            c5.c r0 = r0.mo5876(r4)
            c5.c r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.m5879()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            if (r0 == 0) goto L76
            r1 = 1
            goto L91
        L76:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L91:
            if (r8 != r9) goto L9d
            c5.o r7 = r6.m5967()
            r15.f5010 = r7
            c5.p.m5972(r6)
            goto L9f
        L9d:
            r6.f5044 = r8
        L9f:
            if (r1 != 0) goto La5
            c5.o r6 = r15.f5010
            if (r6 != 0) goto Lb
        La5:
            long r1 = r15.f5011
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f5011 = r1
            return r4
        Lac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            goto Lb5
        Lb4:
            throw r0
        Lb5:
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.c.mo5905():long");
    }

    @Override // c5.d
    /* renamed from: ᵔᵔ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c mo5876(long j5) {
        if (j5 == 0) {
            return writeByte(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j5)) / 4) + 1;
        o m5882 = m5882(numberOfTrailingZeros);
        byte[] bArr = m5882.f5043;
        int i5 = m5882.f5045;
        for (int i6 = (i5 + numberOfTrailingZeros) - 1; i6 >= i5; i6--) {
            bArr[i6] = f5009[(int) (15 & j5)];
            j5 >>>= 4;
        }
        m5882.f5045 += numberOfTrailingZeros;
        this.f5011 += numberOfTrailingZeros;
        return this;
    }

    @Override // c5.e
    /* renamed from: ᵢ, reason: contains not printable characters */
    public String mo5907(Charset charset) {
        try {
            return m5874(this.f5011, charset);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public c m5908(String str, int i5, int i6, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i5 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i5);
        }
        if (i6 < i5) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i6 + " < " + i5);
        }
        if (i6 <= str.length()) {
            if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            }
            if (charset.equals(u.f5058)) {
                return m5912(str, i5, i6);
            }
            byte[] bytes = str.substring(i5, i6).getBytes(charset);
            return write(bytes, 0, bytes.length);
        }
        throw new IllegalArgumentException("endIndex > string.length: " + i6 + " > " + str.length());
    }

    @Override // c5.e
    /* renamed from: ⁱ, reason: contains not printable characters */
    public InputStream mo5909() {
        return new a();
    }

    @Override // c5.d
    /* renamed from: ⁱⁱ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c mo5901(String str) {
        return m5912(str, 0, str.length());
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public final void m5911() {
        try {
            skip(this.f5011);
        } catch (EOFException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    public c m5912(String str, int i5, int i6) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i5);
        }
        if (i6 < i5) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i6 + " < " + i5);
        }
        if (i6 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i6 + " > " + str.length());
        }
        while (i5 < i6) {
            char charAt = str.charAt(i5);
            if (charAt < 128) {
                o m5882 = m5882(1);
                byte[] bArr = m5882.f5043;
                int i7 = m5882.f5045 - i5;
                int min = Math.min(i6, 8192 - i7);
                int i8 = i5 + 1;
                bArr[i5 + i7] = (byte) charAt;
                while (i8 < min) {
                    char charAt2 = str.charAt(i8);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i8 + i7] = (byte) charAt2;
                    i8++;
                }
                int i9 = m5882.f5045;
                int i10 = (i7 + i8) - i9;
                m5882.f5045 = i9 + i10;
                this.f5011 += i10;
                i5 = i8;
            } else {
                if (charAt < 2048) {
                    writeByte((charAt >> 6) | 192);
                    writeByte((charAt & '?') | 128);
                } else if (charAt < 55296 || charAt > 57343) {
                    writeByte((charAt >> '\f') | 224);
                    writeByte(((charAt >> 6) & 63) | 128);
                    writeByte((charAt & '?') | 128);
                } else {
                    int i11 = i5 + 1;
                    char charAt3 = i11 < i6 ? str.charAt(i11) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        writeByte(63);
                        i5 = i11;
                    } else {
                        int i12 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        writeByte((i12 >> 18) | 240);
                        writeByte(((i12 >> 12) & 63) | 128);
                        writeByte(((i12 >> 6) & 63) | 128);
                        writeByte((i12 & 63) | 128);
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
        return this;
    }

    /* renamed from: ﹶ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f5011 == 0) {
            return cVar;
        }
        o m5969 = this.f5010.m5969();
        cVar.f5010 = m5969;
        m5969.f5049 = m5969;
        m5969.f5048 = m5969;
        o oVar = this.f5010;
        while (true) {
            oVar = oVar.f5048;
            if (oVar == this.f5010) {
                cVar.f5011 = this.f5011;
                return cVar;
            }
            cVar.f5010.f5049.m5968(oVar.m5969());
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public final long m5914() {
        long j5 = this.f5011;
        if (j5 == 0) {
            return 0L;
        }
        o oVar = this.f5010.f5049;
        return (oVar.f5045 >= 8192 || !oVar.f5047) ? j5 : j5 - (r3 - oVar.f5044);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public final c m5915(c cVar, long j5, long j6) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        u.m5978(this.f5011, j5, j6);
        if (j6 == 0) {
            return this;
        }
        cVar.f5011 += j6;
        o oVar = this.f5010;
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
            o m5969 = oVar.m5969();
            int i7 = (int) (m5969.f5044 + j5);
            m5969.f5044 = i7;
            m5969.f5045 = Math.min(i7 + ((int) j6), m5969.f5045);
            o oVar2 = cVar.f5010;
            if (oVar2 == null) {
                m5969.f5049 = m5969;
                m5969.f5048 = m5969;
                cVar.f5010 = m5969;
            } else {
                oVar2.f5049.m5968(m5969);
            }
            j6 -= m5969.f5045 - m5969.f5044;
            oVar = oVar.f5048;
            j5 = 0;
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i5 = remaining;
            while (i5 > 0) {
                o m5882 = m5882(1);
                int min = Math.min(i5, 8192 - m5882.f5045);
                byteBuffer.get(m5882.f5043, m5882.f5045, min);
                i5 -= min;
                m5882.f5045 += min;
            }
            this.f5011 += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f5010;
        if (oVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), oVar.f5045 - oVar.f5044);
        byteBuffer.put(oVar.f5043, oVar.f5044, min);
        int i5 = oVar.f5044 + min;
        oVar.f5044 = i5;
        this.f5011 -= min;
        if (i5 == oVar.f5045) {
            this.f5010 = oVar.m5967();
            p.m5972(oVar);
        }
        return min;
    }

    @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c5.d, c5.r, java.io.Flushable
    public void flush() {
    }

    @Override // c5.e, c5.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public c mo5872() {
        return this;
    }
}
