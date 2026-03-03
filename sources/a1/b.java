package a1;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: DiskLruCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements Closeable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final File f51;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final File f52;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final File f53;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final File f54;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f55;

    /* renamed from: ˊ, reason: contains not printable characters */
    private long f56;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final int f57;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Writer f59;

    /* renamed from: י, reason: contains not printable characters */
    private int f61;

    /* renamed from: ˎ, reason: contains not printable characters */
    private long f58 = 0;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final LinkedHashMap<String, d> f60 = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: ـ, reason: contains not printable characters */
    private long f62 = 0;

    /* renamed from: ٴ, reason: contains not printable characters */
    final ThreadPoolExecutor f63 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0006b(null));

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final Callable<Void> f64 = new a();

    /* compiled from: DiskLruCache.java */
    class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                if (b.this.f59 == null) {
                    return null;
                }
                b.this.m143();
                if (b.this.m135()) {
                    b.this.m142();
                    b.this.f61 = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* renamed from: a1.b$b, reason: collision with other inner class name */
    private static final class ThreadFactoryC0006b implements ThreadFactory {
        private ThreadFactoryC0006b() {
        }

        /* synthetic */ ThreadFactoryC0006b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final d f66;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean[] f67;

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean f68;

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m155() throws IOException {
            b.this.m127(this, false);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m156() {
            if (this.f68) {
                return;
            }
            try {
                m155();
            } catch (IOException unused) {
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public void m157() throws IOException {
            b.this.m127(this, true);
            this.f68 = true;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public File m158(int i5) throws IOException {
            File m171;
            synchronized (b.this) {
                if (this.f66.f75 != this) {
                    throw new IllegalStateException();
                }
                if (!this.f66.f74) {
                    this.f67[i5] = true;
                }
                m171 = this.f66.m171(i5);
                b.this.f51.mkdirs();
            }
            return m171;
        }

        private c(d dVar) {
            this.f66 = dVar;
            this.f67 = dVar.f74 ? null : new boolean[b.this.f57];
        }
    }

    /* compiled from: DiskLruCache.java */
    private final class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f70;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final long[] f71;

        /* renamed from: ʽ, reason: contains not printable characters */
        File[] f72;

        /* renamed from: ʾ, reason: contains not printable characters */
        File[] f73;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f74;

        /* renamed from: ˆ, reason: contains not printable characters */
        private c f75;

        /* renamed from: ˈ, reason: contains not printable characters */
        private long f76;

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        private IOException m168(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: י, reason: contains not printable characters */
        public void m169(String[] strArr) throws IOException {
            if (strArr.length != b.this.f57) {
                throw m168(strArr);
            }
            for (int i5 = 0; i5 < strArr.length; i5++) {
                try {
                    this.f71[i5] = Long.parseLong(strArr[i5]);
                } catch (NumberFormatException unused) {
                    throw m168(strArr);
                }
            }
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public File m170(int i5) {
            return this.f72[i5];
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public File m171(int i5) {
            return this.f73[i5];
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public String m172() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j5 : this.f71) {
                sb.append(' ');
                sb.append(j5);
            }
            return sb.toString();
        }

        private d(String str) {
            this.f70 = str;
            this.f71 = new long[b.this.f57];
            this.f72 = new File[b.this.f57];
            this.f73 = new File[b.this.f57];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i5 = 0; i5 < b.this.f57; i5++) {
                sb.append(i5);
                this.f72[i5] = new File(b.this.f51, sb.toString());
                sb.append(".tmp");
                this.f73[i5] = new File(b.this.f51, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    public final class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f78;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final long f79;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final long[] f80;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final File[] f81;

        /* synthetic */ e(b bVar, String str, long j5, File[] fileArr, long[] jArr, a aVar) {
            this(str, j5, fileArr, jArr);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public File m173(int i5) {
            return this.f81[i5];
        }

        private e(String str, long j5, File[] fileArr, long[] jArr) {
            this.f78 = str;
            this.f79 = j5;
            this.f81 = fileArr;
            this.f80 = jArr;
        }
    }

    private b(File file, int i5, int i6, long j5) {
        this.f51 = file;
        this.f55 = i5;
        this.f52 = new File(file, "journal");
        this.f53 = new File(file, "journal.tmp");
        this.f54 = new File(file, "journal.bkp");
        this.f57 = i6;
        this.f56 = j5;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private void m126() {
        if (this.f59 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    public synchronized void m127(c cVar, boolean z5) throws IOException {
        d dVar = cVar.f66;
        if (dVar.f75 != cVar) {
            throw new IllegalStateException();
        }
        if (z5 && !dVar.f74) {
            for (int i5 = 0; i5 < this.f57; i5++) {
                if (!cVar.f67[i5]) {
                    cVar.m155();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i5);
                }
                if (!dVar.m171(i5).exists()) {
                    cVar.m155();
                    return;
                }
            }
        }
        for (int i6 = 0; i6 < this.f57; i6++) {
            File m171 = dVar.m171(i6);
            if (!z5) {
                m130(m171);
            } else if (m171.exists()) {
                File m170 = dVar.m170(i6);
                m171.renameTo(m170);
                long j5 = dVar.f71[i6];
                long length = m170.length();
                dVar.f71[i6] = length;
                this.f58 = (this.f58 - j5) + length;
            }
        }
        this.f61++;
        dVar.f75 = null;
        if (dVar.f74 || z5) {
            dVar.f74 = true;
            this.f59.append((CharSequence) "CLEAN");
            this.f59.append(' ');
            this.f59.append((CharSequence) dVar.f70);
            this.f59.append((CharSequence) dVar.m172());
            this.f59.append('\n');
            if (z5) {
                long j6 = this.f62;
                this.f62 = 1 + j6;
                dVar.f76 = j6;
            }
        } else {
            this.f60.remove(dVar.f70);
            this.f59.append((CharSequence) "REMOVE");
            this.f59.append(' ');
            this.f59.append((CharSequence) dVar.f70);
            this.f59.append('\n');
        }
        m133(this.f59);
        if (this.f58 > this.f56 || m135()) {
            this.f63.submit(this.f64);
        }
    }

    @TargetApi(26)
    /* renamed from: ʽʽ, reason: contains not printable characters */
    private static void m129(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private static void m130(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private synchronized c m131(String str, long j5) throws IOException {
        m126();
        d dVar = this.f60.get(str);
        a aVar = null;
        if (j5 != -1 && (dVar == null || dVar.f76 != j5)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f60.put(str, dVar);
        } else if (dVar.f75 != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f75 = cVar;
        this.f59.append((CharSequence) "DIRTY");
        this.f59.append(' ');
        this.f59.append((CharSequence) str);
        this.f59.append('\n');
        m133(this.f59);
        return cVar;
    }

    @TargetApi(26)
    /* renamed from: ˉˉ, reason: contains not printable characters */
    private static void m133(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public static b m134(File file, int i5, int i6, long j5) throws IOException {
        if (j5 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i6 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m141(file2, file3, false);
            }
        }
        b bVar = new b(file, i5, i6, j5);
        if (bVar.f52.exists()) {
            try {
                bVar.m136();
                bVar.m137();
                return bVar;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                bVar.m148();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i5, i6, j5);
        bVar2.m142();
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˋˋ, reason: contains not printable characters */
    public boolean m135() {
        int i5 = this.f61;
        return i5 >= 2000 && i5 >= this.f60.size();
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private void m136() throws IOException {
        a1.c cVar = new a1.c(new FileInputStream(this.f52), a1.d.f89);
        try {
            String m177 = cVar.m177();
            String m1772 = cVar.m177();
            String m1773 = cVar.m177();
            String m1774 = cVar.m177();
            String m1775 = cVar.m177();
            if (!"libcore.io.DiskLruCache".equals(m177) || !"1".equals(m1772) || !Integer.toString(this.f55).equals(m1773) || !Integer.toString(this.f57).equals(m1774) || !BuildConfig.FLAVOR.equals(m1775)) {
                throw new IOException("unexpected journal header: [" + m177 + ", " + m1772 + ", " + m1774 + ", " + m1775 + "]");
            }
            int i5 = 0;
            while (true) {
                try {
                    m138(cVar.m177());
                    i5++;
                } catch (EOFException unused) {
                    this.f61 = i5 - this.f60.size();
                    if (cVar.m176()) {
                        m142();
                    } else {
                        this.f59 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f52, true), a1.d.f89));
                    }
                    a1.d.m178(cVar);
                    return;
                }
            }
        } catch (Throwable th) {
            a1.d.m178(cVar);
            throw th;
        }
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private void m137() throws IOException {
        m130(this.f53);
        Iterator<d> it = this.f60.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i5 = 0;
            if (next.f75 == null) {
                while (i5 < this.f57) {
                    this.f58 += next.f71[i5];
                    i5++;
                }
            } else {
                next.f75 = null;
                while (i5 < this.f57) {
                    m130(next.m170(i5));
                    m130(next.m171(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private void m138(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i5 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i5);
        if (indexOf2 == -1) {
            substring = str.substring(i5);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f60.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i5, indexOf2);
        }
        d dVar = this.f60.get(substring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, substring, aVar);
            this.f60.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f74 = true;
            dVar.f75 = null;
            dVar.m169(split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f75 = new c(this, dVar, aVar);
            return;
        }
        if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private static void m141(File file, File file2, boolean z5) throws IOException {
        if (z5) {
            m130(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public synchronized void m142() throws IOException {
        Writer writer = this.f59;
        if (writer != null) {
            m129(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f53), a1.d.f89));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f55));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f57));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f60.values()) {
                if (dVar.f75 != null) {
                    bufferedWriter.write("DIRTY " + dVar.f70 + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f70 + dVar.m172() + '\n');
                }
            }
            m129(bufferedWriter);
            if (this.f52.exists()) {
                m141(this.f52, this.f54, true);
            }
            m141(this.f53, this.f52, false);
            this.f54.delete();
            this.f59 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f52, true), a1.d.f89));
        } catch (Throwable th) {
            m129(bufferedWriter);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    public void m143() throws IOException {
        while (this.f58 > this.f56) {
            m150(this.f60.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f59 == null) {
            return;
        }
        Iterator it = new ArrayList(this.f60.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f75 != null) {
                dVar.f75.m155();
            }
        }
        m143();
        m129(this.f59);
        this.f59 = null;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m148() throws IOException {
        close();
        a1.d.m179(this.f51);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public synchronized e m149(String str) throws IOException {
        m126();
        d dVar = this.f60.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f74) {
            return null;
        }
        for (File file : dVar.f72) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f61++;
        this.f59.append((CharSequence) "READ");
        this.f59.append(' ');
        this.f59.append((CharSequence) str);
        this.f59.append('\n');
        if (m135()) {
            this.f63.submit(this.f64);
        }
        return new e(this, str, dVar.f76, dVar.f72, dVar.f71, null);
    }

    /* renamed from: יי, reason: contains not printable characters */
    public synchronized boolean m150(String str) throws IOException {
        m126();
        d dVar = this.f60.get(str);
        if (dVar != null && dVar.f75 == null) {
            for (int i5 = 0; i5 < this.f57; i5++) {
                File m170 = dVar.m170(i5);
                if (m170.exists() && !m170.delete()) {
                    throw new IOException("failed to delete " + m170);
                }
                this.f58 -= dVar.f71[i5];
                dVar.f71[i5] = 0;
            }
            this.f61++;
            this.f59.append((CharSequence) "REMOVE");
            this.f59.append(' ');
            this.f59.append((CharSequence) str);
            this.f59.append('\n');
            this.f60.remove(str);
            if (m135()) {
                this.f63.submit(this.f64);
            }
            return true;
        }
        return false;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public c m151(String str) throws IOException {
        return m131(str, -1L);
    }
}
