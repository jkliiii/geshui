package l0;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* compiled from: ZipUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {

    /* compiled from: ZipUtil.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        long f8931;

        /* renamed from: ʼ, reason: contains not printable characters */
        long f8932;

        a() {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static long m9581(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j5 = aVar.f8932;
        randomAccessFile.seek(aVar.f8931);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j5));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j5 -= read;
            if (j5 == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j5));
        }
        return crc32.getValue();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static a m9582(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j5 = length - 65536;
        long j6 = j5 >= 0 ? j5 : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f8932 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f8931 = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j6);
        throw new ZipException("End Of Central Directory signature not found");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static long m9583(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m9581(randomAccessFile, m9582(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
