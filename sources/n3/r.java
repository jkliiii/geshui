package n3;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import s4.p;
import s4.v;
import s4.y;

/* compiled from: Http.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class r {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final s4.v f9969 = new v.b().m11990(true).m11989(new f()).m11988();

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final Handler f9970 = new Handler(Looper.getMainLooper());

    /* renamed from: ʻ, reason: contains not printable characters */
    private final y.a f9971 = new y.a();

    /* compiled from: Http.java */
    class a implements s4.e {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ c f9972;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ g f9973;

        a(c cVar, g gVar) {
            this.f9972 = cVar;
            this.f9973 = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Exception] */
        @Override // s4.e
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo10835(s4.d dVar, IOException iOException) {
            r rVar = r.this;
            c cVar = this.f9972;
            IOException iOException2 = iOException;
            if (iOException == null) {
                iOException2 = new Exception("failed");
            }
            rVar.m10818(cVar, null, iOException2);
        }

        @Override // s4.e
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo10836(s4.d dVar, s4.a0 a0Var) {
            if (a0Var == null || !a0Var.m11737()) {
                r.this.m10818(this.f9972, null, new Exception("failed resp"));
            } else {
                this.f9973.mo10805(a0Var);
            }
        }
    }

    /* compiled from: Http.java */
    public static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final p.a f9975;

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʽ, reason: contains not printable characters */
        public s4.z m10838() {
            return this.f9975.m11871();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public b m10839(String str, String str2) {
            this.f9975.m11870(str, str2);
            return this;
        }

        private b() {
            this.f9975 = new p.a();
        }
    }

    /* compiled from: Http.java */
    public interface c<TRes> {
        /* renamed from: ʻ */
        void mo8741(TRes tres, Exception exc);
    }

    /* compiled from: Http.java */
    public static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final s4.d f9976;

        /* synthetic */ d(s4.d dVar, a aVar) {
            this(dVar);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m10840() {
            this.f9976.cancel();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m10841() {
            return this.f9976.mo11789();
        }

        private d(s4.d dVar) {
            this.f9976 = dVar;
        }
    }

    /* compiled from: Http.java */
    public interface e {
        /* renamed from: ʻ */
        void mo8887(long j5, long j6, boolean z5);
    }

    /* compiled from: Http.java */
    private static class f implements s4.n {

        /* renamed from: ʼ, reason: contains not printable characters */
        private final o3.a f9977;

        f() {
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("223.5.5.5");
            arrayList.add("119.29.29.29");
            arrayList.add("223.6.6.6");
            int size = arrayList.size();
            o3.c[] cVarArr = new o3.c[size + 3];
            Collections.shuffle(arrayList);
            for (int i5 = 0; i5 < size; i5++) {
                cVarArr[i5] = new p3.e((String) arrayList.get(i5));
            }
            int i6 = size + 1;
            cVarArr[size] = new p3.e("8.8.8.8");
            cVarArr[i6] = new p3.f("https://dns.alidns.com/dns-query");
            cVarArr[i6 + 1] = new p3.f("https://1.12.12.12/dns-query");
            this.f9977 = new o3.a(o3.e.f10111, cVarArr);
        }

        @Override // s4.n
        /* renamed from: ʻ, reason: contains not printable characters */
        public List<InetAddress> mo10842(String str) throws UnknownHostException {
            try {
                o3.f[] m10993 = this.f9977.m10993(str);
                if (m10993 != null && m10993.length > 0) {
                    ArrayList arrayList = new ArrayList(m10993.length);
                    for (o3.f fVar : m10993) {
                        if (fVar != null && (fVar.m11000() || fVar.m11001())) {
                            arrayList.add(InetAddress.getByName(fVar.f10118));
                        }
                    }
                    if (arrayList.size() > 0) {
                        return arrayList;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            return s4.n.f11116.mo10842(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Http.java */
    interface g {
        /* renamed from: ʻ */
        void mo10805(s4.a0 a0Var);
    }

    private r() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static b m10817() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˑ, reason: contains not printable characters */
    public <TRes> void m10818(final c<TRes> cVar, final TRes tres, final Exception exc) {
        if (cVar != null) {
            f9970.post(new Runnable() { // from class: n3.p
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.mo8741(tres, exc);
                }
            });
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m10819(long j5, long j6, boolean z5, e eVar) {
        if (eVar != null) {
            eVar.mo8887(j5, j6, z5);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private <TRes> d m10820(c<TRes> cVar, g gVar) {
        s4.d m11970 = f9969.m11970(this.f9971.m12012());
        m11970.mo11788(new a(cVar, gVar));
        return new d(m11970, null);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static r m10821(String str) {
        r rVar = new r();
        rVar.f9971.m12019(str).m12013();
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:3:0x001a  */
    /* renamed from: ᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void m10822(com.google.gson.reflect.TypeToken r3, n3.r.c r4, s4.a0 r5) {
        /*
            r2 = this;
            s4.b0 r0 = r5.m11731()
            r1 = 0
            if (r0 == 0) goto L1a
            s4.b0 r5 = r5.m11731()     // Catch: java.lang.Exception -> L1a
            java.lang.String r5 = r5.m11763()     // Catch: java.lang.Exception -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L1a
            if (r0 != 0) goto L1a
            java.lang.Object r3 = n3.z1.m10945(r5, r3)     // Catch: java.lang.Exception -> L1a
            goto L1b
        L1a:
            r3 = r1
        L1b:
            r2.m10818(r4, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.r.m10822(com.google.gson.reflect.TypeToken, n3.r$c, s4.a0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵎ, reason: contains not printable characters */
    public /* synthetic */ void m10823(c cVar, s4.a0 a0Var) {
        byte[] m11765;
        if (cVar == null) {
            return;
        }
        if (a0Var.m11731() != null) {
            try {
                m11765 = a0Var.m11731().m11765();
            } catch (Exception unused) {
            }
        } else {
            m11765 = null;
        }
        m10818(cVar, m11765, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ᵔ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ void m10824(n3.r.c r19, java.io.File r20, n3.r.e r21, s4.a0 r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            s4.b0 r0 = r22.m11731()
            r10 = 0
            if (r0 != 0) goto L16
            java.lang.Exception r0 = new java.lang.Exception
            java.lang.String r1 = "failed response"
            r0.<init>(r1)
            r8.m10818(r9, r10, r0)
            return
        L16:
            java.io.File r0 = r20.getParentFile()
            if (r0 == 0) goto L2d
            java.io.File r0 = r20.getParentFile()
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2d
            java.io.File r0 = r20.getParentFile()
            r0.mkdirs()
        L2d:
            s4.b0 r0 = r22.m11731()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            long r11 = r0.mo11767()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            s4.b0 r0 = r22.m11731()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            java.io.InputStream r13 = r0.m11764()     // Catch: java.lang.Throwable -> L86 java.lang.Exception -> L89
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81
            r15 = r20
            r14.<init>(r15)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7e
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La7
            r1 = 0
            r2 = r1
        L4b:
            int r1 = r13.read(r0)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La7
            r4 = -1
            if (r1 == r4) goto L67
            r4 = 0
            r14.write(r0, r4, r1)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La7
            long r4 = (long) r1     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La7
            long r16 = r2 + r4
            r6 = 0
            r1 = r18
            r2 = r16
            r4 = r11
            r7 = r21
            r1.m10819(r2, r4, r6, r7)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La7
            r2 = r16
            goto L4b
        L67:
            r6 = 1
            r1 = r18
            r4 = r11
            r7 = r21
            r1.m10819(r2, r4, r6, r7)     // Catch: java.lang.Exception -> L7a java.lang.Throwable -> La7
            r13.close()     // Catch: java.lang.Exception -> L73
        L73:
            r14.close()     // Catch: java.lang.Exception -> L77
            goto L78
        L77:
        L78:
            r0 = r10
            goto L9f
        L7a:
            r0 = move-exception
            goto L8e
        L7c:
            r0 = move-exception
            goto L84
        L7e:
            r0 = move-exception
            r14 = r10
            goto La8
        L81:
            r0 = move-exception
            r15 = r20
        L84:
            r14 = r10
            goto L8e
        L86:
            r0 = move-exception
            r14 = r10
            goto La9
        L89:
            r0 = move-exception
            r15 = r20
            r13 = r10
            r14 = r13
        L8e:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> La7
            if (r13 == 0) goto L98
            r13.close()     // Catch: java.lang.Exception -> L97
            goto L98
        L97:
        L98:
            if (r14 == 0) goto L9f
            r14.close()     // Catch: java.lang.Exception -> L9e
            goto L9f
        L9e:
        L9f:
            if (r0 != 0) goto La2
            goto La3
        La2:
            r15 = r10
        La3:
            r8.m10818(r9, r15, r0)
            return
        La7:
            r0 = move-exception
        La8:
            r10 = r13
        La9:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Exception -> Laf
            goto Lb0
        Laf:
        Lb0:
            if (r14 == 0) goto Lb5
            r14.close()     // Catch: java.lang.Exception -> Lb5
        Lb5:
            goto Lb7
        Lb6:
            throw r0
        Lb7:
            goto Lb6
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.r.m10824(n3.r$c, java.io.File, n3.r$e, s4.a0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᵢ, reason: contains not printable characters */
    public /* synthetic */ void m10825(c cVar, s4.a0 a0Var) {
        String m11763;
        if (a0Var.m11731() != null) {
            try {
                m11763 = a0Var.m11731().m11763();
            } catch (Exception unused) {
            }
        } else {
            m11763 = null;
        }
        m10818(cVar, m11763, null);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static r m10827(String str, b bVar) {
        r rVar = new r();
        rVar.f9971.m12019(str).m12017(bVar == null ? null : bVar.m10838());
        return rVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public <TRes> d m10828(final TypeToken<TRes> typeToken, final c<TRes> cVar) {
        return m10820(cVar, new g() { // from class: n3.q
            @Override // n3.r.g
            /* renamed from: ʻ */
            public final void mo10805(s4.a0 a0Var) {
                this.f9964.m10822(typeToken, cVar, a0Var);
            }
        });
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public d m10829(final c<byte[]> cVar) {
        return m10820(cVar, new g() { // from class: n3.m
            @Override // n3.r.g
            /* renamed from: ʻ, reason: contains not printable characters */
            public final void mo10805(s4.a0 a0Var) {
                this.f9942.m10823(cVar, a0Var);
            }
        });
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public d m10830(final File file, final c<File> cVar, final e eVar) {
        return m10820(cVar, new g() { // from class: n3.o
            @Override // n3.r.g
            /* renamed from: ʻ */
            public final void mo10805(s4.a0 a0Var) {
                this.f9950.m10824(cVar, file, eVar, a0Var);
            }
        });
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public d m10831() {
        return m10829(null);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public d m10832(final c<String> cVar) {
        return m10820(cVar, new g() { // from class: n3.n
            @Override // n3.r.g
            /* renamed from: ʻ */
            public final void mo10805(s4.a0 a0Var) {
                this.f9945.m10825(cVar, a0Var);
            }
        });
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public r m10833(String str, String str2) {
        this.f9971.m12014(str, str2);
        return this;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public r m10834(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            str.charAt(i5);
        }
        return m10833("User-Agent", str);
    }
}
