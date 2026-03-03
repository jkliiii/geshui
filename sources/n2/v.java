package n2;

/* compiled from: HttpUtil.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v {

    /* compiled from: HttpUtil.java */
    static class a extends k2.x {

        /* compiled from: HttpUtil.java */
        /* renamed from: n2.v$a$a, reason: collision with other inner class name */
        static class RunnableC0140a implements Runnable {

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ Exception f9681;

            RunnableC0140a(Exception exc) {
                this.f9681 = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.mo9511(this.f9681);
            }
        }

        private a() {
        }

        /* renamed from: ــ, reason: contains not printable characters */
        public static a m10570(k2.k kVar, Exception exc) {
            a aVar = new a();
            kVar.m9462(aVar.new RunnableC0140a(exc));
            return aVar;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static long m10565(s sVar) {
        String m10554 = sVar.m10554("Content-Length");
        if (m10554 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(m10554);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k2.s m10566(k2.s r5, n2.y r6, n2.s r7, boolean r8) {
        /*
            r0 = -1
            java.lang.String r6 = "Content-Length"
            java.lang.String r6 = r7.m10554(r6)     // Catch: java.lang.NumberFormatException -> Lf
            if (r6 == 0) goto L10
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Lf
            goto L11
        Lf:
        L10:
            r2 = r0
        L11:
            r6 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L48
            r0 = 0
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 >= 0) goto L2f
            k2.k r6 = r5.mo9358()
            n2.q r7 = new n2.q
            java.lang.String r8 = "not using chunked encoding, and no content-length found."
            r7.<init>(r8)
            n2.v$a r6 = n2.v.a.m10570(r6, r7)
            r6.mo9512(r5)
            return r6
        L2f:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L3f
            k2.k r7 = r5.mo9358()
            n2.v$a r6 = n2.v.a.m10570(r7, r6)
            r6.mo9512(r5)
            return r6
        L3f:
            r2.d r6 = new r2.d
            r6.<init>(r2)
            r6.mo9512(r5)
            goto L5e
        L48:
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r0 = r7.m10554(r0)
            java.lang.String r1 = "chunked"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L60
            r2.b r6 = new r2.b
            r6.<init>()
            r6.mo9512(r5)
        L5e:
            r5 = r6
            goto L6e
        L60:
            if (r8 == 0) goto L6e
            k2.k r7 = r5.mo9358()
            n2.v$a r6 = n2.v.a.m10570(r7, r6)
            r6.mo9512(r5)
            return r6
        L6e:
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r8 = r7.m10554(r6)
            java.lang.String r0 = "gzip"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L86
            r2.f r6 = new r2.f
            r6.<init>()
            r6.mo9512(r5)
        L84:
            r5 = r6
            goto L9b
        L86:
            java.lang.String r8 = "deflate"
            java.lang.String r6 = r7.m10554(r6)
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L9b
            r2.g r6 = new r2.g
            r6.<init>()
            r6.mo9512(r5)
            goto L84
        L9b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.v.m10566(k2.s, n2.y, n2.s, boolean):k2.s");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static boolean m10567(String str, s sVar) {
        String m10554 = sVar.m10554("Connection");
        return m10554 == null ? y.m10579(str) == y.f9685 : "keep-alive".equalsIgnoreCase(m10554);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m10568(y yVar, s sVar) {
        String m10554 = sVar.m10554("Connection");
        return m10554 == null ? yVar == y.f9685 : "keep-alive".equalsIgnoreCase(m10554);
    }
}
