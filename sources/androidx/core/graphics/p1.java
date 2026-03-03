package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.core.provider.g;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class p1 {

    /* compiled from: TypefaceCompatUtil.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static ParcelFileDescriptor m2362(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m2354(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ByteBuffer m2355(Context context, Resources resources, int i5) {
        File m2358 = m2358(context);
        if (m2358 == null) {
            return null;
        }
        try {
            if (m2356(m2358, resources, i5)) {
                return m2360(m2358);
            }
            return null;
        } finally {
            m2358.delete();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m2356(File file, Resources resources, int i5) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i5);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m2357 = m2357(file, inputStream);
            m2354(inputStream);
            return m2357;
        } catch (Throwable th2) {
            th = th2;
            m2354(inputStream);
            throw th;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m2357(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m2354(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m2354(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m2354(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e6) {
            e = e6;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static File m2358(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i5 = 0; i5 < 100; i5++) {
            File file = new File(cacheDir, str + i5);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static ByteBuffer m2359(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m2362 = a.m2362(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m2362 == null) {
                if (m2362 != null) {
                    m2362.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(m2362.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    m2362.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private static ByteBuffer m2360(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static Map<Uri, ByteBuffer> m2361(Context context, g.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (g.b bVar : bVarArr) {
            if (bVar.m2484() == 0) {
                Uri m2486 = bVar.m2486();
                if (!hashMap.containsKey(m2486)) {
                    hashMap.put(m2486, m2359(context, cancellationSignal, m2486));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
