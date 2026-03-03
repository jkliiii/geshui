package y4;

import c5.s;
import c5.t;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import y4.d;

/* compiled from: Http2Reader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class h implements Closeable {

    /* renamed from: ˉ, reason: contains not printable characters */
    static final Logger f12611 = Logger.getLogger(e.class.getName());

    /* renamed from: ʾ, reason: contains not printable characters */
    private final c5.e f12612;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final a f12613;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final boolean f12614;

    /* renamed from: ˈ, reason: contains not printable characters */
    final d.a f12615;

    /* compiled from: Http2Reader.java */
    interface b {
        /* renamed from: ʻ */
        void mo13013(int i5, y4.b bVar, c5.f fVar);

        /* renamed from: ʼ */
        void mo13014();

        /* renamed from: ʽ */
        void mo13015(boolean z5, m mVar);

        /* renamed from: ʾ */
        void mo13016(boolean z5, int i5, c5.e eVar, int i6) throws IOException;

        /* renamed from: ʿ */
        void mo13017(boolean z5, int i5, int i6);

        /* renamed from: ˆ */
        void mo13018(int i5, int i6, int i7, boolean z5);

        /* renamed from: ˈ */
        void mo13019(boolean z5, int i5, int i6, List<c> list);

        /* renamed from: ˉ */
        void mo13020(int i5, y4.b bVar);

        /* renamed from: ˊ */
        void mo13021(int i5, long j5);

        /* renamed from: ˋ */
        void mo13022(int i5, int i6, List<c> list) throws IOException;
    }

    h(c5.e eVar, boolean z5) {
        this.f12612 = eVar;
        this.f12614 = z5;
        a aVar = new a(eVar);
        this.f12613 = aVar;
        this.f12615 = new d.a(4096, aVar);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m13024(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i5 != 8) {
            throw e.m12970("TYPE_PING length != 8: %s", Integer.valueOf(i5));
        }
        if (i6 != 0) {
            throw e.m12970("TYPE_PING streamId != 0", new Object[0]);
        }
        bVar.mo13017((b6 & 1) != 0, this.f12612.readInt(), this.f12612.readInt());
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private void m13025(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i5 != 5) {
            throw e.m12970("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i5));
        }
        if (i6 == 0) {
            throw e.m12970("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        m13027(bVar, i6);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static int m13026(int i5, byte b6, short s5) throws IOException {
        if ((b6 & 8) != 0) {
            i5--;
        }
        if (s5 <= i5) {
            return (short) (i5 - s5);
        }
        throw e.m12970("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s5), Integer.valueOf(i5));
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private void m13027(b bVar, int i5) throws IOException {
        int readInt = this.f12612.readInt();
        bVar.mo13018(i5, readInt & Integer.MAX_VALUE, (this.f12612.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m13028(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i5 != 4) {
            throw e.m12970("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i5));
        }
        if (i6 == 0) {
            throw e.m12970("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int readInt = this.f12612.readInt();
        y4.b m12939 = y4.b.m12939(readInt);
        if (m12939 == null) {
            throw e.m12970("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
        }
        bVar.mo13020(i6, m12939);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m13029(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i6 == 0) {
            throw e.m12970("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short readByte = (b6 & 8) != 0 ? (short) (this.f12612.readByte() & 255) : (short) 0;
        bVar.mo13022(i6, this.f12612.readInt() & Integer.MAX_VALUE, m13036(m13026(i5 - 4, b6, readByte), readByte, b6, i6));
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private void m13030(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i5 != 4) {
            throw e.m12970("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i5));
        }
        long readInt = this.f12612.readInt() & 2147483647L;
        if (readInt == 0) {
            throw e.m12970("windowSizeIncrement was 0", Long.valueOf(readInt));
        }
        bVar.mo13021(i6, readInt);
    }

    /* renamed from: ــ, reason: contains not printable characters */
    private void m13031(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i6 != 0) {
            throw e.m12970("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((b6 & 1) != 0) {
            if (i5 != 0) {
                throw e.m12970("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
            bVar.mo13014();
            return;
        }
        if (i5 % 6 != 0) {
            throw e.m12970("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i5));
        }
        m mVar = new m();
        for (int i7 = 0; i7 < i5; i7 += 6) {
            int readShort = this.f12612.readShort() & 65535;
            int readInt = this.f12612.readInt();
            if (readShort != 2) {
                if (readShort == 3) {
                    readShort = 4;
                } else if (readShort == 4) {
                    if (readInt < 0) {
                        throw e.m12970("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                    }
                    readShort = 7;
                } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                    throw e.m12970("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                }
            } else if (readInt != 0 && readInt != 1) {
                throw e.m12970("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
            mVar.m13099(readShort, readInt);
        }
        bVar.mo13015(false, mVar);
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private void m13032(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i6 == 0) {
            throw e.m12970("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        boolean z5 = (b6 & 1) != 0;
        short readByte = (b6 & 8) != 0 ? (short) (this.f12612.readByte() & 255) : (short) 0;
        if ((b6 & 32) != 0) {
            m13027(bVar, i6);
            i5 -= 5;
        }
        bVar.mo13019(z5, i6, -1, m13036(m13026(i5, b6, readByte), readByte, b6, i6));
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    static int m13033(c5.e eVar) throws IOException {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << 16) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m13034(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i6 == 0) {
            throw e.m12970("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        boolean z5 = (b6 & 1) != 0;
        if ((b6 & 32) != 0) {
            throw e.m12970("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        short readByte = (b6 & 8) != 0 ? (short) (this.f12612.readByte() & 255) : (short) 0;
        bVar.mo13016(z5, i6, this.f12612, m13026(i5, b6, readByte));
        this.f12612.skip(readByte);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m13035(b bVar, int i5, byte b6, int i6) throws IOException {
        if (i5 < 8) {
            throw e.m12970("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i5));
        }
        if (i6 != 0) {
            throw e.m12970("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int readInt = this.f12612.readInt();
        int readInt2 = this.f12612.readInt();
        int i7 = i5 - 8;
        y4.b m12939 = y4.b.m12939(readInt2);
        if (m12939 == null) {
            throw e.m12970("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        }
        c5.f fVar = c5.f.f5014;
        if (i7 > 0) {
            fVar = this.f12612.mo5878(i7);
        }
        bVar.mo13013(readInt, m12939, fVar);
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private List<c> m13036(int i5, short s5, byte b6, int i6) throws IOException {
        a aVar = this.f12613;
        aVar.f12620 = i5;
        aVar.f12617 = i5;
        aVar.f12621 = s5;
        aVar.f12618 = b6;
        aVar.f12619 = i6;
        this.f12615.m12957();
        return this.f12615.m12955();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12612.close();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m13037(boolean z5, b bVar) throws IOException {
        try {
            this.f12612.mo5899(9L);
            int m13033 = m13033(this.f12612);
            if (m13033 < 0 || m13033 > 16384) {
                throw e.m12970("FRAME_SIZE_ERROR: %s", Integer.valueOf(m13033));
            }
            byte readByte = (byte) (this.f12612.readByte() & 255);
            if (z5 && readByte != 4) {
                throw e.m12970("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            }
            byte readByte2 = (byte) (this.f12612.readByte() & 255);
            int readInt = this.f12612.readInt() & Integer.MAX_VALUE;
            Logger logger = f12611;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.m12968(true, readInt, m13033, readByte, readByte2));
            }
            switch (readByte) {
                case 0:
                    m13034(bVar, m13033, readByte2, readInt);
                    return true;
                case 1:
                    m13032(bVar, m13033, readByte2, readInt);
                    return true;
                case 2:
                    m13025(bVar, m13033, readByte2, readInt);
                    return true;
                case 3:
                    m13028(bVar, m13033, readByte2, readInt);
                    return true;
                case 4:
                    m13031(bVar, m13033, readByte2, readInt);
                    return true;
                case 5:
                    m13029(bVar, m13033, readByte2, readInt);
                    return true;
                case 6:
                    m13024(bVar, m13033, readByte2, readInt);
                    return true;
                case 7:
                    m13035(bVar, m13033, readByte2, readInt);
                    return true;
                case 8:
                    m13030(bVar, m13033, readByte2, readInt);
                    return true;
                default:
                    this.f12612.skip(m13033);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m13038(b bVar) throws IOException {
        if (this.f12614) {
            if (!m13037(true, bVar)) {
                throw e.m12970("Required SETTINGS preface not received", new Object[0]);
            }
            return;
        }
        c5.e eVar = this.f12612;
        c5.f fVar = e.f12527;
        c5.f mo5878 = eVar.mo5878(fVar.mo5930());
        Logger logger = f12611;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(t4.c.m12072("<< CONNECTION %s", mo5878.mo5925()));
        }
        if (!fVar.equals(mo5878)) {
            throw e.m12970("Expected a connection header but was %s", mo5878.mo5935());
        }
    }

    /* compiled from: Http2Reader.java */
    static final class a implements s {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final c5.e f12616;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f12617;

        /* renamed from: ˆ, reason: contains not printable characters */
        byte f12618;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f12619;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f12620;

        /* renamed from: ˊ, reason: contains not printable characters */
        short f12621;

        a(c5.e eVar) {
            this.f12616 = eVar;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private void m13039() throws IOException {
            int i5 = this.f12619;
            int m13033 = h.m13033(this.f12616);
            this.f12620 = m13033;
            this.f12617 = m13033;
            byte readByte = (byte) (this.f12616.readByte() & 255);
            this.f12618 = (byte) (this.f12616.readByte() & 255);
            Logger logger = h.f12611;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(e.m12968(true, this.f12619, this.f12617, readByte, this.f12618));
            }
            int readInt = this.f12616.readInt() & Integer.MAX_VALUE;
            this.f12619 = readInt;
            if (readByte != 9) {
                throw e.m12970("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            }
            if (readInt != i5) {
                throw e.m12970("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        @Override // c5.s
        /* renamed from: ʼ */
        public t mo5868() {
            return this.f12616.mo5868();
        }

        @Override // c5.s
        /* renamed from: י */
        public long mo5869(c5.c cVar, long j5) throws IOException {
            while (true) {
                int i5 = this.f12620;
                if (i5 != 0) {
                    long mo5869 = this.f12616.mo5869(cVar, Math.min(j5, i5));
                    if (mo5869 == -1) {
                        return -1L;
                    }
                    this.f12620 = (int) (this.f12620 - mo5869);
                    return mo5869;
                }
                this.f12616.skip(this.f12621);
                this.f12621 = (short) 0;
                if ((this.f12618 & 4) != 0) {
                    return -1L;
                }
                m13039();
            }
        }

        @Override // c5.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }
}
