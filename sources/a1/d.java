package a1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: Util.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final Charset f89 = Charset.forName("US-ASCII");

    /* renamed from: ʼ, reason: contains not printable characters */
    static final Charset f90 = Charset.forName("UTF-8");

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m178(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static void m179(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m179(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}
