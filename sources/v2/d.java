package v2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/* compiled from: FileCache.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static String f11701 = "MD5";

    /* renamed from: ˋ, reason: contains not printable characters */
    static MessageDigest f11702;

    /* renamed from: ʻ, reason: contains not printable characters */
    boolean f11703;

    /* renamed from: ʿ, reason: contains not printable characters */
    File f11707;

    /* renamed from: ˆ, reason: contains not printable characters */
    long f11708;

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean f11710;

    /* renamed from: ʼ, reason: contains not printable characters */
    Random f11704 = new Random();

    /* renamed from: ʽ, reason: contains not printable characters */
    long f11705 = 4096;

    /* renamed from: ˈ, reason: contains not printable characters */
    Comparator<File> f11709 = new a();

    /* renamed from: ʾ, reason: contains not printable characters */
    C0168d f11706 = new C0168d();

    /* compiled from: FileCache.java */
    class a implements Comparator<File> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long lastModified = file.lastModified();
            long lastModified2 = file2.lastModified();
            if (lastModified < lastModified2) {
                return -1;
            }
            return lastModified2 > lastModified ? 1 : 0;
        }
    }

    /* compiled from: FileCache.java */
    class b extends Thread {
        b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            d.this.m12339();
        }
    }

    /* compiled from: FileCache.java */
    class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final long f11713;

        public c(File file) {
            this.f11713 = file.length();
        }
    }

    /* compiled from: FileCache.java */
    /* renamed from: v2.d$d, reason: collision with other inner class name */
    class C0168d extends g<String, c> {
        public C0168d() {
            super(d.this.f11708);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // v2.g
        /* renamed from: ˎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo12344(boolean z5, String str, c cVar, c cVar2) {
            super.mo12344(z5, str, cVar, cVar2);
            if (cVar2 == null && !d.this.f11710) {
                new File(d.this.f11707, str).delete();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // v2.g
        /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public long mo12345(String str, c cVar) {
            return Math.max(d.this.f11705, cVar.f11713);
        }
    }

    static {
        try {
            f11702 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e5) {
            MessageDigest m12327 = m12327();
            f11702 = m12327;
            if (m12327 == null) {
                throw new RuntimeException(e5);
            }
        }
        try {
            f11702 = (MessageDigest) f11702.clone();
        } catch (CloneNotSupportedException unused) {
        }
    }

    public d(File file, long j5, boolean z5) {
        this.f11707 = file;
        this.f11708 = j5;
        this.f11703 = z5;
        file.mkdirs();
        m12326();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m12326() {
        if (this.f11703) {
            new b().start();
        } else {
            m12339();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static MessageDigest m12327() {
        MessageDigest messageDigest;
        if (!"MD5".equals(f11701)) {
            return null;
        }
        for (Provider provider : Security.getProviders()) {
            Iterator<Provider.Service> it = provider.getServices().iterator();
            while (it.hasNext()) {
                String algorithm = it.next().getAlgorithm();
                f11701 = algorithm;
                try {
                    messageDigest = MessageDigest.getInstance(algorithm);
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
        }
        return null;
    }

    /* renamed from: י, reason: contains not printable characters */
    public static void m12328(File... fileArr) {
        if (fileArr == null) {
            return;
        }
        for (File file : fileArr) {
            file.delete();
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static synchronized String m12329(Object... objArr) {
        String bigInteger;
        synchronized (d.class) {
            f11702.reset();
            for (Object obj : objArr) {
                f11702.update(obj.toString().getBytes());
            }
            bigInteger = new BigInteger(1, f11702.digest()).toString(16);
        }
        return bigInteger;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m12330(String str, File... fileArr) {
        m12341(str);
        for (int i5 = 0; i5 < fileArr.length; i5++) {
            File file = fileArr[i5];
            File m12335 = m12335(str, i5);
            if (!file.renameTo(m12335)) {
                m12328(fileArr);
                m12340(str);
                return;
            } else {
                m12340(file.getName());
                this.f11706.m12361(m12336(str, i5), new c(m12335));
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m12331(String str) {
        return m12335(str, 0).exists();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public FileInputStream m12332(String str) throws IOException {
        return new FileInputStream(m12342(m12335(str, 0)));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public FileInputStream[] m12333(String str, int i5) throws IOException {
        FileInputStream[] fileInputStreamArr = new FileInputStream[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            try {
                fileInputStreamArr[i6] = new FileInputStream(m12342(m12335(str, i6)));
            } catch (IOException e5) {
                for (int i7 = 0; i7 < i5; i7++) {
                    h.m12364(fileInputStreamArr[i7]);
                }
                m12340(str);
                throw e5;
            }
        }
        return fileInputStreamArr;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public File m12334(String str) {
        return m12342(m12335(str, 0));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    File m12335(String str, int i5) {
        return new File(this.f11707, m12336(str, i5));
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    String m12336(String str, int i5) {
        return str + "." + i5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public File m12337() {
        File file;
        do {
            file = new File(this.f11707, new BigInteger(128, this.f11704).toString(16));
        } while (file.exists());
        return file;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public File[] m12338(int i5) {
        File[] fileArr = new File[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            fileArr[i6] = m12337();
        }
        return fileArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void m12339() {
        this.f11710 = true;
        try {
            File[] listFiles = this.f11707.listFiles();
            if (listFiles == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, listFiles);
            Collections.sort(arrayList, this.f11709);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String name = file.getName();
                this.f11706.m12361(name, new c(file));
                this.f11706.m12359(name);
            }
        } finally {
            this.f11710 = false;
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m12340(String str) {
        for (int i5 = 0; this.f11706.m12362(m12336(str, i5)) != null; i5++) {
        }
        m12341(str);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    void m12341(String str) {
        int i5 = 0;
        while (true) {
            File m12335 = m12335(str, i5);
            if (!m12335.exists()) {
                return;
            }
            m12335.delete();
            i5++;
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public File m12342(File file) {
        this.f11706.m12359(file.getName());
        file.setLastModified(System.currentTimeMillis());
        return file;
    }
}
