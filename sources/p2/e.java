package p2;

import android.net.Uri;
import android.util.Base64;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.CacheResponse;
import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k2.f0;
import k2.k;
import k2.l;
import k2.q;
import k2.s;
import k2.x;
import n2.c0;
import n2.d;

/* compiled from: ResponseCacheMiddleware.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e extends c0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f10241 = true;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f10242;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f10243;

    /* renamed from: ʾ, reason: contains not printable characters */
    private v2.d f10244;

    /* renamed from: ʿ, reason: contains not printable characters */
    private k f10245;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f10246;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f10247;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f10248;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f10249;

    /* compiled from: ResponseCacheMiddleware.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ d.a f10250;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ f f10251;

        a(d.a aVar, f fVar) {
            this.f10250 = aVar;
            this.f10251 = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f10250.f9575.mo9724(null, this.f10251);
            this.f10251.m11112();
        }
    }

    /* compiled from: ResponseCacheMiddleware.java */
    private static class b extends x {

        /* renamed from: ˉ, reason: contains not printable characters */
        i f10253;

        /* renamed from: ˊ, reason: contains not printable characters */
        q f10254;

        private b() {
        }

        @Override // k2.x, k2.s
        public void close() {
            m11109();
            super.close();
        }

        /* renamed from: ʾʾ, reason: contains not printable characters */
        public void m11109() {
            i iVar = this.f10253;
            if (iVar != null) {
                iVar.m11120();
                this.f10253 = null;
            }
        }

        @Override // k2.t
        /* renamed from: ʿʿ */
        protected void mo9511(Exception exc) {
            super.mo9511(exc);
            if (exc != null) {
                m11109();
            }
        }

        /* renamed from: ــ, reason: contains not printable characters */
        public void m11110() {
            i iVar = this.f10253;
            if (iVar != null) {
                iVar.m11121();
                this.f10253 = null;
            }
        }

        @Override // k2.x, l2.d
        /* renamed from: ᵢ */
        public void mo9377(s sVar, q qVar) {
            q qVar2 = this.f10254;
            if (qVar2 != null) {
                super.mo9377(sVar, qVar2);
                if (this.f10254.m9500() > 0) {
                    return;
                } else {
                    this.f10254 = null;
                }
            }
            q qVar3 = new q();
            try {
                try {
                    i iVar = this.f10253;
                    if (iVar != null) {
                        FileOutputStream m11122 = iVar.m11122(1);
                        if (m11122 != null) {
                            while (!qVar.m9501()) {
                                ByteBuffer m9502 = qVar.m9502();
                                try {
                                    q.m9477(m11122, m9502);
                                    qVar3.m9483(m9502);
                                } catch (Throwable th) {
                                    qVar3.m9483(m9502);
                                    throw th;
                                }
                            }
                        } else {
                            m11109();
                        }
                    }
                } catch (Exception unused) {
                    m11109();
                }
                super.mo9377(sVar, qVar);
                if (this.f10253 == null || qVar.m9500() <= 0) {
                    return;
                }
                q qVar4 = new q();
                this.f10254 = qVar4;
                qVar.m9489(qVar4);
            } finally {
                qVar.m9489(qVar3);
                qVar3.m9489(qVar);
            }
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: ResponseCacheMiddleware.java */
    public static class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        FileInputStream[] f10255;

        /* renamed from: ʼ, reason: contains not printable characters */
        h f10256;

        /* renamed from: ʽ, reason: contains not printable characters */
        long f10257;

        /* renamed from: ʾ, reason: contains not printable characters */
        p2.f f10258;
    }

    /* compiled from: ResponseCacheMiddleware.java */
    private static class d extends x {

        /* renamed from: ˉ, reason: contains not printable characters */
        h f10259;

        /* renamed from: ˋ, reason: contains not printable characters */
        private boolean f10261;

        /* renamed from: ˏ, reason: contains not printable characters */
        boolean f10263;

        /* renamed from: ˊ, reason: contains not printable characters */
        q f10260 = new q();

        /* renamed from: ˎ, reason: contains not printable characters */
        private v2.a f10262 = new v2.a();

        /* renamed from: ˑ, reason: contains not printable characters */
        Runnable f10264 = new a();

        /* compiled from: ResponseCacheMiddleware.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.m11112();
            }
        }

        /* compiled from: ResponseCacheMiddleware.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.close();
            }
        }

        public d(h hVar, long j5) {
            this.f10259 = hVar;
            this.f10262.m12314((int) j5);
        }

        @Override // k2.x, k2.s
        public void close() {
            if (mo9358().m9455() != Thread.currentThread()) {
                mo9358().m9462(new b());
                return;
            }
            this.f10260.m9507();
            v2.h.m12364(this.f10259.getBody());
            super.close();
        }

        /* renamed from: ʾʾ, reason: contains not printable characters */
        void m11111() {
            mo9358().m9462(this.f10264);
        }

        @Override // k2.t
        /* renamed from: ʿʿ */
        protected void mo9511(Exception exc) {
            if (this.f10263) {
                v2.h.m12364(this.f10259.getBody());
                super.mo9511(exc);
            }
        }

        @Override // k2.x, k2.s
        /* renamed from: ـ */
        public void mo9365() {
            this.f10261 = false;
            m11111();
        }

        /* renamed from: ــ, reason: contains not printable characters */
        void m11112() {
            if (this.f10260.m9500() > 0) {
                super.mo9377(this, this.f10260);
                if (this.f10260.m9500() > 0) {
                    return;
                }
            }
            try {
                ByteBuffer m12311 = this.f10262.m12311();
                int read = this.f10259.getBody().read(m12311.array(), m12311.arrayOffset(), m12311.capacity());
                if (read == -1) {
                    q.m9482(m12311);
                    this.f10263 = true;
                    mo9511(null);
                    return;
                }
                this.f10262.m12316(read);
                m12311.limit(read);
                this.f10260.m9483(m12311);
                super.mo9377(this, this.f10260);
                if (this.f10260.m9500() > 0) {
                    return;
                }
                mo9358().m9463(this.f10264, 10L);
            } catch (IOException e5) {
                this.f10263 = true;
                mo9511(e5);
            }
        }

        @Override // k2.x, k2.s
        /* renamed from: ᵔ */
        public boolean mo9370() {
            return this.f10261;
        }
    }

    /* compiled from: ResponseCacheMiddleware.java */
    /* renamed from: p2.e$e, reason: collision with other inner class name */
    private class C0149e extends f implements k2.c {
        public C0149e(h hVar, long j5) {
            super(hVar, j5);
        }
    }

    /* compiled from: ResponseCacheMiddleware.java */
    static class h extends CacheResponse {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final g f10279;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final FileInputStream f10280;

        public h(g gVar, FileInputStream fileInputStream) {
            this.f10279 = gVar;
            this.f10280 = fileInputStream;
        }

        @Override // java.net.CacheResponse
        public Map<String, List<String>> getHeaders() {
            return this.f10279.f10275.m11087();
        }

        @Override // java.net.CacheResponse
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public FileInputStream getBody() {
            return this.f10280;
        }
    }

    /* compiled from: ResponseCacheMiddleware.java */
    class i {

        /* renamed from: ʻ, reason: contains not printable characters */
        String f10281;

        /* renamed from: ʼ, reason: contains not printable characters */
        File[] f10282;

        /* renamed from: ʽ, reason: contains not printable characters */
        FileOutputStream[] f10283 = new FileOutputStream[2];

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f10284;

        public i(String str) {
            this.f10281 = str;
            this.f10282 = e.this.f10244.m12338(2);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m11120() {
            v2.h.m12364(this.f10283);
            v2.d.m12328(this.f10282);
            if (this.f10284) {
                return;
            }
            e.m11106(e.this);
            this.f10284 = true;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        void m11121() {
            v2.h.m12364(this.f10283);
            if (this.f10284) {
                return;
            }
            e.this.f10244.m12330(this.f10281, this.f10282);
            e.m11105(e.this);
            this.f10284 = true;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        FileOutputStream m11122(int i5) throws IOException {
            FileOutputStream[] fileOutputStreamArr = this.f10283;
            if (fileOutputStreamArr[i5] == null) {
                fileOutputStreamArr[i5] = new FileOutputStream(this.f10282[i5]);
            }
            return this.f10283[i5];
        }
    }

    private e() {
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static /* synthetic */ int m11105(e eVar) {
        int i5 = eVar.f10242;
        eVar.f10242 = i5 + 1;
        return i5;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static /* synthetic */ int m11106(e eVar) {
        int i5 = eVar.f10243;
        eVar.f10243 = i5 + 1;
        return i5;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static e m11107(n2.a aVar, File file, long j5) throws IOException {
        Iterator<n2.d> it = aVar.m10463().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof e) {
                throw new IOException("Response cache already added to http client");
            }
        }
        e eVar = new e();
        eVar.f10245 = aVar.m10465();
        eVar.f10244 = new v2.d(file, j5, false);
        aVar.m10467(eVar);
        return eVar;
    }

    @Override // n2.c0, n2.d
    /* renamed from: ʼ */
    public void mo10477(d.b bVar) {
        if (((f) f0.m9424(bVar.f9579, f.class)) != null) {
            bVar.f9580.mo10484().m10557("X-Served-From", "cache");
            return;
        }
        c cVar = (c) bVar.f9583.m12369("cache-data");
        p2.c m11071 = p2.c.m11071(bVar.f9580.mo10484().m10555());
        m11071.m11083("Content-Length");
        m11071.m11085(String.format(Locale.ENGLISH, "%s %s %s", bVar.f9580.mo10488(), Integer.valueOf(bVar.f9580.mo10482()), bVar.f9580.mo10485()));
        p2.f fVar = new p2.f(bVar.f9584.m10509(), m11071);
        bVar.f9583.m12370("response-headers", fVar);
        if (cVar != null) {
            if (cVar.f10258.m11139(fVar)) {
                bVar.f9584.m10513("Serving response from conditional cache");
                p2.f m11134 = cVar.f10258.m11134(fVar);
                bVar.f9580.mo10486(new n2.s(m11134.m11135().m11087()));
                bVar.f9580.mo10491(m11134.m11135().m11078());
                bVar.f9580.mo10490(m11134.m11135().m11079());
                bVar.f9580.mo10484().m10557("X-Served-From", "conditional-cache");
                this.f10246++;
                d dVar = new d(cVar.f10256, cVar.f10257);
                dVar.mo9512(bVar.f9578);
                bVar.f9578 = dVar;
                dVar.m11111();
                return;
            }
            bVar.f9583.m12371("cache-data");
            v2.h.m12364(cVar.f10255);
        }
        if (this.f10241) {
            p2.d dVar2 = (p2.d) bVar.f9583.m12369("request-headers");
            if (dVar2 == null || !fVar.m11137(dVar2) || !bVar.f9584.m10503().equals("GET")) {
                this.f10248++;
                bVar.f9584.m10511("Response is not cacheable");
                return;
            }
            String m12329 = v2.d.m12329(bVar.f9584.m10509());
            g gVar = new g(bVar.f9584.m10509(), dVar2.m11094().m11076(fVar.m11136()), bVar.f9584, fVar.m11135());
            b bVar2 = new b(null);
            i iVar = new i(m12329);
            try {
                gVar.m11118(iVar);
                iVar.m11122(1);
                bVar2.f10253 = iVar;
                bVar2.mo9512(bVar.f9578);
                bVar.f9578 = bVar2;
                bVar.f9583.m12370("body-cacher", bVar2);
                bVar.f9584.m10511("Caching response");
                this.f10249++;
            } catch (Exception unused) {
                iVar.m11120();
                this.f10248++;
            }
        }
    }

    @Override // n2.c0, n2.d
    /* renamed from: ʿ */
    public void mo10480(d.g gVar) {
        FileInputStream[] fileInputStreamArr;
        c cVar = (c) gVar.f9583.m12369("cache-data");
        if (cVar != null && (fileInputStreamArr = cVar.f10255) != null) {
            v2.h.m12364(fileInputStreamArr);
        }
        f fVar = (f) f0.m9424(gVar.f9579, f.class);
        if (fVar != null) {
            v2.h.m12364(fVar.f10259.getBody());
        }
        b bVar = (b) gVar.f9583.m12369("body-cacher");
        if (bVar != null) {
            if (gVar.f9585 != null) {
                bVar.m11109();
            } else {
                bVar.m11110();
            }
        }
    }

    @Override // n2.c0, n2.d
    /* renamed from: ˉ */
    public m2.a mo5707(d.a aVar) {
        FileInputStream[] fileInputStreamArr;
        p2.d dVar = new p2.d(aVar.f9584.m10509(), p2.c.m11071(aVar.f9584.m10502().m10555()));
        aVar.f9583.m12370("request-headers", dVar);
        if (this.f10244 == null || !this.f10241 || dVar.m11100()) {
            this.f10248++;
            return null;
        }
        try {
            fileInputStreamArr = this.f10244.m12333(v2.d.m12329(aVar.f9584.m10509()), 2);
            try {
                if (fileInputStreamArr == null) {
                    this.f10248++;
                    return null;
                }
                long available = fileInputStreamArr[1].available();
                g gVar = new g(fileInputStreamArr[0]);
                if (!gVar.m11117(aVar.f9584.m10509(), aVar.f9584.m10503(), aVar.f9584.m10502().m10555())) {
                    this.f10248++;
                    v2.h.m12364(fileInputStreamArr);
                    return null;
                }
                h hVar = new h(gVar, fileInputStreamArr[1]);
                try {
                    Map<String, List<String>> headers = hVar.getHeaders();
                    FileInputStream body = hVar.getBody();
                    if (headers == null || body == null) {
                        this.f10248++;
                        v2.h.m12364(fileInputStreamArr);
                        return null;
                    }
                    p2.c m11071 = p2.c.m11071(headers);
                    p2.f fVar = new p2.f(aVar.f9584.m10509(), m11071);
                    m11071.m11084("Content-Length", String.valueOf(available));
                    m11071.m11083("Content-Encoding");
                    m11071.m11083("Transfer-Encoding");
                    fVar.m11138(System.currentTimeMillis(), System.currentTimeMillis());
                    p2.g m11133 = fVar.m11133(System.currentTimeMillis(), dVar);
                    if (m11133 == p2.g.CACHE) {
                        aVar.f9584.m10513("Response retrieved from cache");
                        f c0149e = gVar.m11115() ? new C0149e(hVar, available) : new f(hVar, available);
                        c0149e.f10260.m9483(ByteBuffer.wrap(m11071.m11086().getBytes()));
                        this.f10245.m9462(new a(aVar, c0149e));
                        this.f10247++;
                        aVar.f9583.m12370("socket-owner", this);
                        m2.k kVar = new m2.k();
                        kVar.mo9875();
                        return kVar;
                    }
                    if (m11133 != p2.g.CONDITIONAL_CACHE) {
                        aVar.f9584.m10511("Response can not be served from cache");
                        this.f10248++;
                        v2.h.m12364(fileInputStreamArr);
                        return null;
                    }
                    aVar.f9584.m10513("Response may be served from conditional cache");
                    c cVar = new c();
                    cVar.f10255 = fileInputStreamArr;
                    cVar.f10257 = available;
                    cVar.f10258 = fVar;
                    cVar.f10256 = hVar;
                    aVar.f9583.m12370("cache-data", cVar);
                    return null;
                } catch (Exception unused) {
                    this.f10248++;
                    v2.h.m12364(fileInputStreamArr);
                    return null;
                }
            } catch (IOException unused2) {
                this.f10248++;
                v2.h.m12364(fileInputStreamArr);
                return null;
            }
        } catch (IOException unused3) {
            fileInputStreamArr = null;
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public v2.d m11108() {
        return this.f10244;
    }

    /* compiled from: ResponseCacheMiddleware.java */
    private static final class g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f10272;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final p2.c f10273;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final String f10274;

        /* renamed from: ʾ, reason: contains not printable characters */
        private final p2.c f10275;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final String f10276;

        /* renamed from: ˆ, reason: contains not printable characters */
        private final Certificate[] f10277;

        /* renamed from: ˈ, reason: contains not printable characters */
        private final Certificate[] f10278;

        public g(InputStream inputStream) throws IOException {
            p2.h hVar;
            Throwable th;
            try {
                hVar = new p2.h(inputStream, v2.c.f11698);
            } catch (Throwable th2) {
                hVar = null;
                th = th2;
            }
            try {
                this.f10272 = hVar.m11142();
                this.f10274 = hVar.m11142();
                this.f10273 = new p2.c();
                int readInt = hVar.readInt();
                for (int i5 = 0; i5 < readInt; i5++) {
                    this.f10273.m11074(hVar.m11142());
                }
                p2.c cVar = new p2.c();
                this.f10275 = cVar;
                cVar.m11085(hVar.m11142());
                int readInt2 = hVar.readInt();
                for (int i6 = 0; i6 < readInt2; i6++) {
                    this.f10275.m11074(hVar.m11142());
                }
                this.f10276 = null;
                this.f10277 = null;
                this.f10278 = null;
                v2.h.m12364(hVar, inputStream);
            } catch (Throwable th3) {
                th = th3;
                v2.h.m12364(hVar, inputStream);
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean m11115() {
            return this.f10272.startsWith("https://");
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private void m11116(Writer writer, Certificate[] certificateArr) throws IOException {
            if (certificateArr == null) {
                writer.write("-1\n");
                return;
            }
            try {
                writer.write(Integer.toString(certificateArr.length) + '\n');
                for (Certificate certificate : certificateArr) {
                    writer.write(Base64.encodeToString(certificate.getEncoded(), 0) + '\n');
                }
            } catch (CertificateEncodingException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean m11117(Uri uri, String str, Map<String, List<String>> map) {
            return this.f10272.equals(uri.toString()) && this.f10274.equals(str) && new p2.f(uri, this.f10275).m11140(this.f10273.m11087(), map);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public void m11118(i iVar) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(iVar.m11122(0), v2.c.f11699));
            bufferedWriter.write(this.f10272 + '\n');
            bufferedWriter.write(this.f10274 + '\n');
            bufferedWriter.write(Integer.toString(this.f10273.m11082()) + '\n');
            for (int i5 = 0; i5 < this.f10273.m11082(); i5++) {
                bufferedWriter.write(this.f10273.m11077(i5) + ": " + this.f10273.m11081(i5) + '\n');
            }
            bufferedWriter.write(this.f10275.m11080() + '\n');
            bufferedWriter.write(Integer.toString(this.f10275.m11082()) + '\n');
            for (int i6 = 0; i6 < this.f10275.m11082(); i6++) {
                bufferedWriter.write(this.f10275.m11077(i6) + ": " + this.f10275.m11081(i6) + '\n');
            }
            if (m11115()) {
                bufferedWriter.write(10);
                bufferedWriter.write(this.f10276 + '\n');
                m11116(bufferedWriter, this.f10277);
                m11116(bufferedWriter, this.f10278);
            }
            bufferedWriter.close();
        }

        public g(Uri uri, p2.c cVar, n2.e eVar, p2.c cVar2) {
            this.f10272 = uri.toString();
            this.f10273 = cVar;
            this.f10274 = eVar.m10503();
            this.f10275 = cVar2;
            this.f10276 = null;
            this.f10277 = null;
            this.f10278 = null;
        }
    }

    /* compiled from: ResponseCacheMiddleware.java */
    private class f extends d implements l {

        /* renamed from: י, reason: contains not printable characters */
        boolean f10268;

        /* renamed from: ـ, reason: contains not printable characters */
        boolean f10269;

        /* renamed from: ٴ, reason: contains not printable characters */
        l2.a f10270;

        public f(h hVar, long j5) {
            super(hVar, j5);
            this.f10263 = true;
        }

        @Override // p2.e.d, k2.x, k2.s
        public void close() {
            this.f10269 = false;
        }

        @Override // k2.u
        public boolean isOpen() {
            return this.f10269;
        }

        @Override // k2.x, k2.s, k2.u
        /* renamed from: ʻ */
        public k mo9358() {
            return e.this.f10245;
        }

        @Override // p2.e.d, k2.t
        /* renamed from: ʿʿ */
        protected void mo9511(Exception exc) {
            super.mo9511(exc);
            if (this.f10268) {
                return;
            }
            this.f10268 = true;
            l2.a aVar = this.f10270;
            if (aVar != null) {
                aVar.mo9412(exc);
            }
        }

        @Override // k2.u
        /* renamed from: ˋ */
        public void mo9361(q qVar) {
            qVar.m9507();
        }

        @Override // k2.u
        /* renamed from: ᴵᴵ */
        public void mo9368(l2.a aVar) {
            this.f10270 = aVar;
        }

        @Override // k2.u
        /* renamed from: י */
        public void mo9364(l2.g gVar) {
        }

        @Override // k2.u
        public void end() {
        }
    }
}
