package o3;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DnsManager.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c[] f10098;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final r3.a<String, f[]> f10099;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final q3.a f10100;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final g f10101;

    /* renamed from: ʿ, reason: contains not printable characters */
    private volatile e f10102;

    /* renamed from: ˆ, reason: contains not printable characters */
    private volatile int f10103;

    public a(e eVar, c[] cVarArr) {
        this(eVar, cVarArr, null);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static f[] m10989(f[] fVarArr) {
        String str;
        if (fVarArr == null || fVarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            if (fVar != null && (str = fVar.f10118) != null && str.length() > 0 && !fVar.m11003()) {
                arrayList.add(fVar);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private f[] m10990(o3.b bVar) throws IOException {
        f[] m10989;
        f[] m109892;
        if (bVar.f10108 && (m109892 = m10989(this.f10100.m11476(bVar, this.f10102))) != null && m109892.length > 0) {
            return m109892;
        }
        synchronized (this.f10099) {
            if (this.f10102.equals(e.f10111) && d.m10998()) {
                this.f10099.clear();
                synchronized (this.f10098) {
                    this.f10103 = 0;
                }
            } else {
                f[] m109893 = m10989(this.f10099.get(bVar.f10105));
                if (m109893 != null && m109893.length > 0) {
                    return m109893;
                }
            }
            int i5 = this.f10103;
            f[] fVarArr = null;
            IOException e5 = null;
            int i6 = 0;
            while (true) {
                c[] cVarArr = this.f10098;
                if (i6 >= cVarArr.length) {
                    break;
                }
                int length = (i5 + i6) % cVarArr.length;
                e eVar = this.f10102;
                String m10997 = d.m10997();
                try {
                    fVarArr = this.f10098[length].mo10996(bVar, this.f10102);
                } catch (IOException e6) {
                    e5 = e6;
                    e5.printStackTrace();
                } catch (Exception e7) {
                    IOException iOException = new IOException(e7);
                    e7.printStackTrace();
                    e5 = iOException;
                }
                String m109972 = d.m10997();
                if (this.f10102 != eVar || ((fVarArr != null && fVarArr.length != 0) || !m10997.equals(m109972))) {
                    break;
                }
                synchronized (this.f10098) {
                    if (this.f10103 == i5) {
                        this.f10103++;
                        if (this.f10103 == this.f10098.length) {
                            this.f10103 = 0;
                        }
                    }
                }
                i6++;
            }
            if (fVarArr != null && fVarArr.length != 0) {
                f[] m10991 = m10991(fVarArr);
                if (m10991.length == 0) {
                    throw new UnknownHostException("no A/AAAA records");
                }
                synchronized (this.f10099) {
                    this.f10099.put(bVar.f10105, m10991);
                }
                return m10991;
            }
            if (!bVar.f10108 && (m10989 = m10989(this.f10100.m11476(bVar, this.f10102))) != null && m10989.length != 0) {
                return m10989;
            }
            if (e5 == null) {
                throw new UnknownHostException(bVar.f10105);
            }
            throw e5;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static f[] m10991(f[] fVarArr) {
        ArrayList arrayList = new ArrayList(fVarArr.length);
        for (f fVar : fVarArr) {
            if (fVar != null && (fVar.m11000() || fVar.m11001())) {
                arrayList.add(fVar);
            }
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static boolean m10992(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains("-")) {
            return false;
        }
        try {
            int indexOf = str.indexOf(46);
            if (indexOf != -1 && Integer.parseInt(str.substring(0, indexOf)) > 255) {
                return false;
            }
            int i5 = indexOf + 1;
            int indexOf2 = str.indexOf(46, i5);
            if (indexOf2 != -1 && Integer.parseInt(str.substring(i5, indexOf2)) > 255) {
                return false;
            }
            int i6 = indexOf2 + 1;
            int indexOf3 = str.indexOf(46, i6);
            if (indexOf3 != -1 && Integer.parseInt(str.substring(i6, indexOf3)) > 255 && Integer.parseInt(str.substring(indexOf3 + 1, str.length() - 1)) > 255) {
                if (str.charAt(str.length() - 1) != '.') {
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public f[] m10993(String str) throws IOException {
        return m10994(new o3.b(str));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public f[] m10994(o3.b bVar) throws IOException {
        if (bVar == null) {
            throw new IOException("null domain");
        }
        String str = bVar.f10105;
        if (str != null && str.trim().length() != 0) {
            return m10992(bVar.f10105) ? new f[]{new f(bVar.f10105, 1, -1, new Date().getTime(), 0)} : this.f10101.mo10995(m10990(bVar));
        }
        throw new IOException("empty domain " + bVar.f10105);
    }

    public a(e eVar, c[] cVarArr, g gVar) {
        this.f10100 = new q3.a();
        this.f10102 = null;
        this.f10103 = 0;
        this.f10102 = eVar == null ? e.f10111 : eVar;
        this.f10098 = (c[]) cVarArr.clone();
        this.f10099 = new r3.a<>();
        this.f10101 = gVar == null ? new b() : gVar;
    }

    /* compiled from: DnsManager.java */
    private static class b implements g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private AtomicInteger f10104;

        private b() {
            this.f10104 = new AtomicInteger();
        }

        @Override // o3.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public f[] mo10995(f[] fVarArr) {
            return fVarArr;
        }
    }
}
