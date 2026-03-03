package l1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class m implements ImageHeaderParser {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final byte[] f8980 = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final int[] f8981 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    private static final class a implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ByteBuffer f8982;

        a(ByteBuffer byteBuffer) {
            this.f8982 = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // l1.m.c
        public long skip(long j5) {
            int min = (int) Math.min(this.f8982.remaining(), j5);
            ByteBuffer byteBuffer = this.f8982;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }

        @Override // l1.m.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public int mo9665(byte[] bArr, int i5) {
            int min = Math.min(i5, this.f8982.remaining());
            if (min == 0) {
                return -1;
            }
            this.f8982.get(bArr, 0, min);
            return min;
        }

        @Override // l1.m.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public short mo9666() throws c.a {
            if (this.f8982.remaining() >= 1) {
                return (short) (this.f8982.get() & 255);
            }
            throw new c.a();
        }

        @Override // l1.m.c
        /* renamed from: ʽ, reason: contains not printable characters */
        public int mo9667() throws c.a {
            return (mo9666() << 8) | mo9666();
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    private static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ByteBuffer f8983;

        b(byte[] bArr, int i5) {
            this.f8983 = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean m9668(int i5, int i6) {
            return this.f8983.remaining() - i5 >= i6;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        short m9669(int i5) {
            if (m9668(i5, 2)) {
                return this.f8983.getShort(i5);
            }
            return (short) -1;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        int m9670(int i5) {
            if (m9668(i5, 4)) {
                return this.f8983.getInt(i5);
            }
            return -1;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        int m9671() {
            return this.f8983.remaining();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m9672(ByteOrder byteOrder) {
            this.f8983.order(byteOrder);
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    private interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        public static final class a extends IOException {
            a() {
                super("Unexpectedly reached end of a file");
            }
        }

        long skip(long j5) throws IOException;

        /* renamed from: ʻ */
        int mo9665(byte[] bArr, int i5) throws IOException;

        /* renamed from: ʼ */
        short mo9666() throws IOException;

        /* renamed from: ʽ */
        int mo9667() throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    private static final class d implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final InputStream f8984;

        d(InputStream inputStream) {
            this.f8984 = inputStream;
        }

        @Override // l1.m.c
        public long skip(long j5) throws IOException {
            if (j5 < 0) {
                return 0L;
            }
            long j6 = j5;
            while (j6 > 0) {
                long skip = this.f8984.skip(j6);
                if (skip <= 0) {
                    if (this.f8984.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j6 -= skip;
            }
            return j5 - j6;
        }

        @Override // l1.m.c
        /* renamed from: ʻ */
        public int mo9665(byte[] bArr, int i5) throws IOException {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5 && (i7 = this.f8984.read(bArr, i6, i5 - i6)) != -1) {
                i6 += i7;
            }
            if (i6 == 0 && i7 == -1) {
                throw new c.a();
            }
            return i6;
        }

        @Override // l1.m.c
        /* renamed from: ʼ */
        public short mo9666() throws IOException {
            int read = this.f8984.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // l1.m.c
        /* renamed from: ʽ */
        public int mo9667() throws IOException {
            return (mo9666() << 8) | mo9666();
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m9656(int i5, int i6) {
        return i5 + 2 + (i6 * 12);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private int m9657(c cVar, f1.b bVar) throws IOException {
        try {
            int mo9667 = cVar.mo9667();
            if (!m9659(mo9667)) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + mo9667);
                }
                return -1;
            }
            int m9661 = m9661(cVar);
            if (m9661 == -1) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.mo8522(m9661, byte[].class);
            try {
                return m9663(cVar, bArr, m9661);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private ImageHeaderParser.ImageType m9658(c cVar) throws IOException {
        try {
            int mo9667 = cVar.mo9667();
            if (mo9667 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int mo9666 = (mo9667 << 8) | cVar.mo9666();
            if (mo9666 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int mo96662 = (mo9666 << 8) | cVar.mo9666();
            if (mo96662 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.mo9666() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (mo96662 != 1380533830) {
                return m9664(cVar, mo96662);
            }
            cVar.skip(4L);
            if (((cVar.mo9667() << 16) | cVar.mo9667()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int mo96672 = (cVar.mo9667() << 16) | cVar.mo9667();
            if ((mo96672 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i5 = mo96672 & 255;
            if (i5 == 88) {
                cVar.skip(4L);
                short mo96663 = cVar.mo9666();
                return (mo96663 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (mo96663 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (i5 != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            return (cVar.mo9666() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static boolean m9659(int i5) {
        return (i5 & 65496) == 65496 || i5 == 19789 || i5 == 18761;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean m9660(byte[] bArr, int i5) {
        boolean z5 = bArr != null && i5 > f8980.length;
        if (z5) {
            int i6 = 0;
            while (true) {
                byte[] bArr2 = f8980;
                if (i6 >= bArr2.length) {
                    break;
                }
                if (bArr[i6] != bArr2[i6]) {
                    return false;
                }
                i6++;
            }
        }
        return z5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m9661(c cVar) throws IOException {
        short mo9666;
        int mo9667;
        long j5;
        long skip;
        do {
            short mo96662 = cVar.mo9666();
            if (mo96662 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown segmentId=" + ((int) mo96662));
                }
                return -1;
            }
            mo9666 = cVar.mo9666();
            if (mo9666 == 218) {
                return -1;
            }
            if (mo9666 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo9667 = cVar.mo9667() - 2;
            if (mo9666 == 225) {
                return mo9667;
            }
            j5 = mo9667;
            skip = cVar.skip(j5);
        } while (skip == j5);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo9666) + ", wanted to skip: " + mo9667 + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static int m9662(b bVar) {
        ByteOrder byteOrder;
        short m9669 = bVar.m9669(6);
        if (m9669 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (m9669 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) m9669));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.m9672(byteOrder);
        int m9670 = bVar.m9670(10) + 6;
        short m96692 = bVar.m9669(m9670);
        for (int i5 = 0; i5 < m96692; i5++) {
            int m9656 = m9656(m9670, i5);
            short m96693 = bVar.m9669(m9656);
            if (m96693 == 274) {
                short m96694 = bVar.m9669(m9656 + 2);
                if (m96694 >= 1 && m96694 <= 12) {
                    int m96702 = bVar.m9670(m9656 + 4);
                    if (m96702 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got tagIndex=" + i5 + " tagType=" + ((int) m96693) + " formatCode=" + ((int) m96694) + " componentCount=" + m96702);
                        }
                        int i6 = m96702 + f8981[m96694];
                        if (i6 <= 4) {
                            int i7 = m9656 + 8;
                            if (i7 >= 0 && i7 <= bVar.m9671()) {
                                if (i6 >= 0 && i6 + i7 <= bVar.m9671()) {
                                    return bVar.m9669(i7);
                                }
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) m96693));
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i7 + " tagType=" + ((int) m96693));
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) m96694));
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) m96694));
                }
            }
        }
        return -1;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private int m9663(c cVar, byte[] bArr, int i5) throws IOException {
        int mo9665 = cVar.mo9665(bArr, i5);
        if (mo9665 == i5) {
            if (m9660(bArr, i5)) {
                return m9662(new b(bArr, i5));
            }
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i5 + ", actually read: " + mo9665);
        }
        return -1;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private ImageHeaderParser.ImageType m9664(c cVar, int i5) throws IOException {
        if (((cVar.mo9667() << 16) | cVar.mo9667()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int mo9667 = (cVar.mo9667() << 16) | cVar.mo9667();
        if (mo9667 == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i6 = 0;
        boolean z5 = mo9667 == 1635150182;
        cVar.skip(4L);
        int i7 = i5 - 16;
        if (i7 % 4 == 0) {
            while (i6 < 5 && i7 > 0) {
                int mo96672 = (cVar.mo9667() << 16) | cVar.mo9667();
                if (mo96672 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (mo96672 == 1635150182) {
                    z5 = true;
                }
                i6++;
                i7 -= 4;
            }
        }
        return z5 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʻ */
    public ImageHeaderParser.ImageType mo6110(ByteBuffer byteBuffer) throws IOException {
        return m9658(new a((ByteBuffer) y1.k.m12893(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʼ */
    public int mo6111(ByteBuffer byteBuffer, f1.b bVar) throws IOException {
        return m9657(new a((ByteBuffer) y1.k.m12893(byteBuffer)), (f1.b) y1.k.m12893(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʽ */
    public int mo6112(InputStream inputStream, f1.b bVar) throws IOException {
        return m9657(new d((InputStream) y1.k.m12893(inputStream)), (f1.b) y1.k.m12893(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʾ */
    public ImageHeaderParser.ImageType mo6113(InputStream inputStream) throws IOException {
        return m9658(new d((InputStream) y1.k.m12893(inputStream)));
    }
}
