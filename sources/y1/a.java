package y1;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ByteBufferUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final AtomicReference<byte[]> f12435 = new AtomicReference<>();

    /* compiled from: ByteBufferUtil.java */
    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final int f12438;

        /* renamed from: ʼ, reason: contains not printable characters */
        final int f12439;

        /* renamed from: ʽ, reason: contains not printable characters */
        final byte[] f12440;

        b(byte[] bArr, int i5, int i6) {
            this.f12440 = bArr;
            this.f12438 = i5;
            this.f12439 = i6;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static ByteBuffer m12862(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new RandomAccessFile(file, "r");
            try {
                fileChannel = randomAccessFile.getChannel();
                MappedByteBuffer load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    fileChannel.close();
                } catch (IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                return load;
            } catch (Throwable th) {
                th = th;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (IOException unused3) {
                    }
                }
                if (randomAccessFile == null) {
                    throw th;
                }
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ByteBuffer m12863(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] andSet = f12435.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(andSet);
            if (read < 0) {
                f12435.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return m12865(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
            byteArrayOutputStream.write(andSet, 0, read);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static b m12864(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static ByteBuffer m12865(ByteBuffer byteBuffer) {
        return (ByteBuffer) byteBuffer.position(0);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static byte[] m12866(ByteBuffer byteBuffer) {
        b m12864 = m12864(byteBuffer);
        if (m12864 != null && m12864.f12438 == 0 && m12864.f12439 == m12864.f12440.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        m12865(asReadOnlyBuffer);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12867(ByteBuffer byteBuffer, File file) throws IOException {
        RandomAccessFile randomAccessFile;
        m12865(byteBuffer);
        FileChannel fileChannel = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (Throwable th) {
            th = th;
            randomAccessFile = null;
        }
        try {
            fileChannel = randomAccessFile.getChannel();
            fileChannel.write(byteBuffer);
            fileChannel.force(false);
            fileChannel.close();
            randomAccessFile.close();
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            th = th2;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused3) {
                }
            }
            if (randomAccessFile == null) {
                throw th;
            }
            try {
                randomAccessFile.close();
                throw th;
            } catch (IOException unused4) {
                throw th;
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static InputStream m12868(ByteBuffer byteBuffer) {
        return new C0180a(byteBuffer);
    }

    /* compiled from: ByteBufferUtil.java */
    /* renamed from: y1.a$a, reason: collision with other inner class name */
    private static class C0180a extends InputStream {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ByteBuffer f12436;

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f12437 = -1;

        C0180a(ByteBuffer byteBuffer) {
            this.f12436 = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f12436.remaining();
        }

        @Override // java.io.InputStream
        public synchronized void mark(int i5) {
            this.f12437 = this.f12436.position();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f12436.hasRemaining()) {
                return this.f12436.get() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public synchronized void reset() throws IOException {
            int i5 = this.f12437;
            if (i5 == -1) {
                throw new IOException("Cannot reset to unset mark position");
            }
            this.f12436.position(i5);
        }

        @Override // java.io.InputStream
        public long skip(long j5) {
            if (!this.f12436.hasRemaining()) {
                return -1L;
            }
            long min = Math.min(j5, available());
            this.f12436.position((int) (r0.position() + min));
            return min;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i5, int i6) {
            if (!this.f12436.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i6, available());
            this.f12436.get(bArr, i5, min);
            return min;
        }
    }
}
