package u4;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import s4.a0;
import s4.r;
import s4.y;
import w4.d;
import w4.e;

/* compiled from: CacheStrategy.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    @Nullable
    public final y f11583;

    /* renamed from: ʼ, reason: contains not printable characters */
    @Nullable
    public final a0 f11584;

    /* compiled from: CacheStrategy.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final long f11585;

        /* renamed from: ʼ, reason: contains not printable characters */
        final y f11586;

        /* renamed from: ʽ, reason: contains not printable characters */
        final a0 f11587;

        /* renamed from: ʾ, reason: contains not printable characters */
        private Date f11588;

        /* renamed from: ʿ, reason: contains not printable characters */
        private String f11589;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Date f11590;

        /* renamed from: ˈ, reason: contains not printable characters */
        private String f11591;

        /* renamed from: ˉ, reason: contains not printable characters */
        private Date f11592;

        /* renamed from: ˊ, reason: contains not printable characters */
        private long f11593;

        /* renamed from: ˋ, reason: contains not printable characters */
        private long f11594;

        /* renamed from: ˎ, reason: contains not printable characters */
        private String f11595;

        /* renamed from: ˏ, reason: contains not printable characters */
        private int f11596;

        public a(long j5, y yVar, a0 a0Var) {
            this.f11596 = -1;
            this.f11585 = j5;
            this.f11586 = yVar;
            this.f11587 = a0Var;
            if (a0Var != null) {
                this.f11593 = a0Var.m11733();
                this.f11594 = a0Var.m11730();
                r m11736 = a0Var.m11736();
                int m11881 = m11736.m11881();
                for (int i5 = 0; i5 < m11881; i5++) {
                    String m11879 = m11736.m11879(i5);
                    String m11882 = m11736.m11882(i5);
                    if ("Date".equalsIgnoreCase(m11879)) {
                        this.f11588 = d.m12593(m11882);
                        this.f11589 = m11882;
                    } else if ("Expires".equalsIgnoreCase(m11879)) {
                        this.f11592 = d.m12593(m11882);
                    } else if ("Last-Modified".equalsIgnoreCase(m11879)) {
                        this.f11590 = d.m12593(m11882);
                        this.f11591 = m11882;
                    } else if ("ETag".equalsIgnoreCase(m11879)) {
                        this.f11595 = m11882;
                    } else if ("Age".equalsIgnoreCase(m11879)) {
                        this.f11596 = e.m12598(m11882, -1);
                    }
                }
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private long m12220() {
            Date date = this.f11588;
            long max = date != null ? Math.max(0L, this.f11594 - date.getTime()) : 0L;
            int i5 = this.f11596;
            if (i5 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i5));
            }
            long j5 = this.f11594;
            return max + (j5 - this.f11593) + (this.f11585 - j5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private long m12221() {
            if (this.f11587.m11735().m11773() != -1) {
                return TimeUnit.SECONDS.toMillis(r0.m11773());
            }
            if (this.f11592 != null) {
                Date date = this.f11588;
                long time = this.f11592.getTime() - (date != null ? date.getTime() : this.f11594);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f11590 == null || this.f11587.m11734().m12011().m11919() != null) {
                return 0L;
            }
            Date date2 = this.f11588;
            long time2 = (date2 != null ? date2.getTime() : this.f11593) - this.f11590.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private b m12222() {
            String str;
            if (this.f11587 == null) {
                return new b(this.f11586, null);
            }
            if (this.f11586.m12008() && this.f11587.m11739() == null) {
                return new b(this.f11586, null);
            }
            if (!b.m12219(this.f11587, this.f11586)) {
                return new b(this.f11586, null);
            }
            s4.c m12005 = this.f11586.m12005();
            if (m12005.m11777() || m12223(this.f11586)) {
                return new b(this.f11586, null);
            }
            s4.c m11735 = this.f11587.m11735();
            long m12220 = m12220();
            long m12221 = m12221();
            if (m12005.m11773() != -1) {
                m12221 = Math.min(m12221, TimeUnit.SECONDS.toMillis(m12005.m11773()));
            }
            long j5 = 0;
            long millis = m12005.m11775() != -1 ? TimeUnit.SECONDS.toMillis(m12005.m11775()) : 0L;
            if (!m11735.m11776() && m12005.m11774() != -1) {
                j5 = TimeUnit.SECONDS.toMillis(m12005.m11774());
            }
            if (!m11735.m11777()) {
                long j6 = millis + m12220;
                if (j6 < j5 + m12221) {
                    a0.a m11729 = this.f11587.m11729();
                    if (j6 >= m12221) {
                        m11729.m11744("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (m12220 > 86400000 && m12224()) {
                        m11729.m11744("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new b(null, m11729.m11746());
                }
            }
            String str2 = this.f11595;
            if (str2 != null) {
                str = "If-None-Match";
            } else {
                if (this.f11590 != null) {
                    str2 = this.f11591;
                } else {
                    if (this.f11588 == null) {
                        return new b(this.f11586, null);
                    }
                    str2 = this.f11589;
                }
                str = "If-Modified-Since";
            }
            r.a m11880 = this.f11586.m12007().m11880();
            t4.a.f11321.mo11978(m11880, str, str2);
            return new b(this.f11586.m12010().m12015(m11880.m11887()).m12012(), this.f11587);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private static boolean m12223(y yVar) {
            return (yVar.m12006("If-Modified-Since") == null && yVar.m12006("If-None-Match") == null) ? false : true;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean m12224() {
            return this.f11587.m11735().m11773() == -1 && this.f11592 == null;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public b m12225() {
            b m12222 = m12222();
            return (m12222.f11583 == null || !this.f11586.m12005().m11779()) ? m12222 : new b(null, null);
        }
    }

    b(y yVar, a0 a0Var) {
        this.f11583 = yVar;
        this.f11584 = a0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r3.m11735().m11771() == false) goto L33;
     */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m12219(s4.a0 r3, s4.y r4) {
        /*
            int r0 = r3.m11738()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L5a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L5a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L5a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L5a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L5a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L5a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L31
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L5a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L5a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L5a
            switch(r0) {
                case 300: goto L5a;
                case 301: goto L5a;
                case 302: goto L31;
                default: goto L30;
            }
        L30:
            goto L59
        L31:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.m11740(r0)
            if (r0 != 0) goto L5a
            s4.c r0 = r3.m11735()
            int r0 = r0.m11773()
            r1 = -1
            if (r0 != r1) goto L5a
            s4.c r0 = r3.m11735()
            boolean r0 = r0.m11772()
            if (r0 != 0) goto L5a
            s4.c r0 = r3.m11735()
            boolean r0 = r0.m11771()
            if (r0 == 0) goto L59
            goto L5a
        L59:
            return r2
        L5a:
            s4.c r3 = r3.m11735()
            boolean r3 = r3.m11778()
            if (r3 != 0) goto L6f
            s4.c r3 = r4.m12005()
            boolean r3 = r3.m11778()
            if (r3 != 0) goto L6f
            r2 = 1
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.b.m12219(s4.a0, s4.y):boolean");
    }
}
