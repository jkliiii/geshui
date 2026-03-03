package l0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: MultiDexExtractor.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class c implements Closeable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final File f8923;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final long f8924;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final File f8925;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final RandomAccessFile f8926;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final FileChannel f8927;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final FileLock f8928;

    /* compiled from: MultiDexExtractor.java */
    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    /* compiled from: MultiDexExtractor.java */
    private static class b extends File {

        /* renamed from: ʾ, reason: contains not printable characters */
        public long f8930;

        public b(File file, String str) {
            super(file, str);
            this.f8930 = -1L;
        }
    }

    c(File file, File file2) throws IOException {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f8923 = file;
        this.f8925 = file2;
        this.f8924 = m9579(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f8926 = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f8927 = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f8928 = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e5) {
                e = e5;
                m9574(this.f8927);
                throw e;
            } catch (Error e6) {
                e = e6;
                m9574(this.f8927);
                throw e;
            } catch (RuntimeException e7) {
                e = e7;
                m9574(this.f8927);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e8) {
            m9574(this.f8926);
            throw e8;
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private List<b> m9570(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f8923.getName() + ".classes";
        SharedPreferences m9577 = m9577(context);
        int i5 = m9577.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i5 + (-1));
        int i6 = 2;
        while (i6 <= i5) {
            b bVar = new b(this.f8925, str2 + i6 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f8930 = m9579(bVar);
            long j5 = m9577.getLong(str + "dex.crc." + i6, -1L);
            long j6 = m9577.getLong(str + "dex.time." + i6, -1L);
            long lastModified = bVar.lastModified();
            if (j6 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = m9577;
                if (j5 == bVar.f8930) {
                    arrayList.add(bVar);
                    i6++;
                    m9577 = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j6 + ", modification time: " + lastModified + ", expected crc: " + j5 + ", file crc: " + bVar.f8930);
        }
        return arrayList;
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static void m9571(Context context, String str, long j5, long j6, List<b> list) {
        SharedPreferences.Editor edit = m9577(context).edit();
        edit.putLong(str + "timestamp", j5);
        edit.putLong(str + "crc", j6);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i5 = 2;
        for (b bVar : list) {
            edit.putLong(str + "dex.crc." + i5, bVar.f8930);
            edit.putLong(str + "dex.time." + i5, bVar.lastModified());
            i5++;
        }
        edit.commit();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m9572() {
        File[] listFiles = this.f8925.listFiles(new a());
        if (listFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f8925.getPath() + ").");
            return;
        }
        for (File file : listFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private List<b> m9573() throws IOException {
        boolean z5;
        String str = this.f8923.getName() + ".classes";
        m9572();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f8923);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i5 = 2;
            while (entry != null) {
                b bVar = new b(this.f8925, str + i5 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i6 = 0;
                boolean z6 = false;
                while (i6 < 3 && !z6) {
                    int i7 = i6 + 1;
                    m9576(zipFile, entry, bVar, str);
                    try {
                        bVar.f8930 = m9579(bVar);
                        z5 = true;
                    } catch (IOException e5) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e5);
                        z5 = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z5 ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(bVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(bVar.length());
                    sb.append(" - crc: ");
                    sb.append(bVar.f8930);
                    Log.i("MultiDex", sb.toString());
                    if (!z5) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z6 = z5;
                    i6 = i7;
                }
                if (!z6) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i5 + ")");
                }
                i5++;
                entry = zipFile.getEntry("classes" + i5 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e6) {
                Log.w("MultiDex", "Failed to close resource", e6);
            }
            return arrayList;
        } finally {
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static void m9574(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e5) {
            Log.w("MultiDex", "Failed to close resource", e5);
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static boolean m9575(Context context, File file, long j5, String str) {
        SharedPreferences m9577 = m9577(context);
        if (m9577.getLong(str + "timestamp", -1L) == m9578(file)) {
            if (m9577.getLong(str + "crc", -1L) == j5) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private static void m9576(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + createTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            m9574(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private static SharedPreferences m9577(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private static long m9578(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static long m9579(File file) throws IOException {
        long m9583 = d.m9583(file);
        return m9583 == -1 ? m9583 - 1 : m9583;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8928.release();
        this.f8927.close();
        this.f8926.close();
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    List<? extends File> m9580(Context context, String str, boolean z5) throws IOException {
        List<b> m9573;
        List<b> list;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f8923.getPath() + ", " + z5 + ", " + str + ")");
        if (!this.f8928.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z5 && !m9575(context, this.f8923, this.f8924, str)) {
            try {
                list = m9570(context, str);
            } catch (IOException e5) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e5);
                m9573 = m9573();
                m9571(context, str, m9578(this.f8923), this.f8924, m9573);
            }
            Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
            return list;
        }
        if (z5) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        m9573 = m9573();
        m9571(context, str, m9578(this.f8923), this.f8924, m9573);
        list = m9573;
        Log.i("MultiDex", "load found " + list.size() + " secondary dex files");
        return list;
    }
}
