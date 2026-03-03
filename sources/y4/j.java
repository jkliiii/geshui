package y4;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import y4.d;

/* compiled from: Http2Writer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class j implements Closeable {

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Logger f12644 = Logger.getLogger(e.class.getName());

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c5.d f12645;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f12646;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final c5.c f12647;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f12648;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f12649;

    /* renamed from: ˊ, reason: contains not printable characters */
    final d.b f12650;

    j(c5.d dVar, boolean z5) {
        this.f12645 = dVar;
        this.f12646 = z5;
        c5.c cVar = new c5.c();
        this.f12647 = cVar;
        this.f12650 = new d.b(cVar);
        this.f12648 = 16384;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m13065(int i5, long j5) throws IOException {
        while (j5 > 0) {
            int min = (int) Math.min(this.f12648, j5);
            long j6 = min;
            j5 -= j6;
            m13079(i5, min, (byte) 9, j5 == 0 ? (byte) 4 : (byte) 0);
            this.f12645.mo5867(this.f12647, j6);
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private static void m13066(c5.d dVar, int i5) throws IOException {
        dVar.writeByte((i5 >>> 16) & 255);
        dVar.writeByte((i5 >>> 8) & 255);
        dVar.writeByte(i5 & 255);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f12649 = true;
        this.f12645.close();
    }

    public synchronized void flush() throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        this.f12645.flush();
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public synchronized void m13067(boolean z5, int i5, int i6) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        m13079(0, 8, (byte) 6, z5 ? (byte) 1 : (byte) 0);
        this.f12645.writeInt(i5);
        this.f12645.writeInt(i6);
        this.f12645.flush();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public synchronized void m13068(int i5, b bVar) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        if (bVar.f12497 == -1) {
            throw new IllegalArgumentException();
        }
        m13079(i5, 4, (byte) 3, (byte) 0);
        this.f12645.writeInt(bVar.f12497);
        this.f12645.flush();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public synchronized void m13069(m mVar) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        this.f12648 = mVar.m13096(this.f12648);
        if (mVar.m13093() != -1) {
            this.f12650.m12963(mVar.m13093());
        }
        m13079(0, 0, (byte) 4, (byte) 1);
        this.f12645.flush();
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public synchronized void m13070(int i5, int i6, List<c> list) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        this.f12650.m12965(list);
        long size = this.f12647.size();
        int min = (int) Math.min(this.f12648 - 4, size);
        long j5 = min;
        m13079(i5, min + 4, (byte) 5, size == j5 ? (byte) 4 : (byte) 0);
        this.f12645.writeInt(i6 & Integer.MAX_VALUE);
        this.f12645.mo5867(this.f12647, j5);
        if (size > j5) {
            m13065(i5, size - j5);
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public synchronized void m13071(boolean z5, int i5, int i6, List<c> list) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        m13075(z5, i5, list);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public synchronized void m13072(m mVar) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        int i5 = 0;
        m13079(0, mVar.m13100() * 6, (byte) 4, (byte) 0);
        while (i5 < 10) {
            if (mVar.m13097(i5)) {
                this.f12645.writeShort(i5 == 4 ? 3 : i5 == 7 ? 4 : i5);
                this.f12645.writeInt(mVar.m13092(i5));
            }
            i5++;
        }
        this.f12645.flush();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public synchronized void m13073() throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        if (this.f12646) {
            Logger logger = f12644;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(t4.c.m12072(">> CONNECTION %s", e.f12527.mo5925()));
            }
            this.f12645.write(e.f12527.mo5934());
            this.f12645.flush();
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public synchronized void m13074(int i5, long j5) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        if (j5 == 0 || j5 > 2147483647L) {
            throw e.m12969("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j5));
        }
        m13079(i5, 4, (byte) 8, (byte) 0);
        this.f12645.writeInt((int) j5);
        this.f12645.flush();
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    void m13075(boolean z5, int i5, List<c> list) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        this.f12650.m12965(list);
        long size = this.f12647.size();
        int min = (int) Math.min(this.f12648, size);
        long j5 = min;
        byte b6 = size == j5 ? (byte) 4 : (byte) 0;
        if (z5) {
            b6 = (byte) (b6 | 1);
        }
        m13079(i5, min, (byte) 1, b6);
        this.f12645.mo5867(this.f12647, j5);
        if (size > j5) {
            m13065(i5, size - j5);
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public int m13076() {
        return this.f12648;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public synchronized void m13077(boolean z5, int i5, c5.c cVar, int i6) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        m13078(i5, z5 ? (byte) 1 : (byte) 0, cVar, i6);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m13078(int i5, byte b6, c5.c cVar, int i6) throws IOException {
        m13079(i5, i6, (byte) 0, b6);
        if (i6 > 0) {
            this.f12645.mo5867(cVar, i6);
        }
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m13079(int i5, int i6, byte b6, byte b7) throws IOException {
        Logger logger = f12644;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.m12968(false, i5, i6, b6, b7));
        }
        int i7 = this.f12648;
        if (i6 > i7) {
            throw e.m12969("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i7), Integer.valueOf(i6));
        }
        if ((Integer.MIN_VALUE & i5) != 0) {
            throw e.m12969("reserved bit set: %s", Integer.valueOf(i5));
        }
        m13066(this.f12645, i6);
        this.f12645.writeByte(b6 & 255);
        this.f12645.writeByte(b7 & 255);
        this.f12645.writeInt(i5 & Integer.MAX_VALUE);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public synchronized void m13080(int i5, b bVar, byte[] bArr) throws IOException {
        if (this.f12649) {
            throw new IOException("closed");
        }
        if (bVar.f12497 == -1) {
            throw e.m12969("errorCode.httpCode == -1", new Object[0]);
        }
        m13079(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f12645.writeInt(i5);
        this.f12645.writeInt(bVar.f12497);
        if (bArr.length > 0) {
            this.f12645.write(bArr);
        }
        this.f12645.flush();
    }
}
