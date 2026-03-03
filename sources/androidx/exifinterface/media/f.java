package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: ExifInterfaceUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f {

    /* compiled from: ExifInterfaceUtils.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3936(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static FileDescriptor m3937(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static long m3938(FileDescriptor fileDescriptor, long j5, int i5) throws ErrnoException {
            return Os.lseek(fileDescriptor, j5, i5);
        }
    }

    /* compiled from: ExifInterfaceUtils.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3939(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static String m3933(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b6 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b6)));
        }
        return sb.toString();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static long[] m3934(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i5 = 0; i5 < iArr.length; i5++) {
            jArr[i5] = iArr[i5];
        }
        return jArr;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static boolean m3935(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            if (bArr[i5] != bArr2[i5]) {
                return false;
            }
        }
        return true;
    }
}
