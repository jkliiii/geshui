package y4;

import c5.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Hpack.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    static final c[] f12507;

    /* renamed from: ʼ, reason: contains not printable characters */
    static final Map<c5.f, Integer> f12508;

    /* compiled from: Hpack.java */
    static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final List<c> f12509;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final c5.e f12510;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f12511;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f12512;

        /* renamed from: ʿ, reason: contains not printable characters */
        c[] f12513;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f12514;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f12515;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f12516;

        a(int i5, s sVar) {
            this(i5, i5, sVar);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m12942() {
            int i5 = this.f12512;
            int i6 = this.f12516;
            if (i5 < i6) {
                if (i5 == 0) {
                    m12943();
                } else {
                    m12945(i6 - i5);
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m12943() {
            Arrays.fill(this.f12513, (Object) null);
            this.f12514 = this.f12513.length - 1;
            this.f12515 = 0;
            this.f12516 = 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private int m12944(int i5) {
            return this.f12514 + 1 + i5;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private int m12945(int i5) {
            int i6;
            int i7 = 0;
            if (i5 > 0) {
                int length = this.f12513.length;
                while (true) {
                    length--;
                    i6 = this.f12514;
                    if (length < i6 || i5 <= 0) {
                        break;
                    }
                    int i8 = this.f12513[length].f12506;
                    i5 -= i8;
                    this.f12516 -= i8;
                    this.f12515--;
                    i7++;
                }
                c[] cVarArr = this.f12513;
                System.arraycopy(cVarArr, i6 + 1, cVarArr, i6 + 1 + i7, this.f12515);
                this.f12514 += i7;
            }
            return i7;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private c5.f m12946(int i5) throws IOException {
            if (m12948(i5)) {
                return d.f12507[i5].f12504;
            }
            int m12944 = m12944(i5 - d.f12507.length);
            if (m12944 >= 0) {
                c[] cVarArr = this.f12513;
                if (m12944 < cVarArr.length) {
                    return cVarArr[m12944].f12504;
                }
            }
            throw new IOException("Header index too large " + (i5 + 1));
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m12947(int i5, c cVar) {
            this.f12509.add(cVar);
            int i6 = cVar.f12506;
            if (i5 != -1) {
                i6 -= this.f12513[m12944(i5)].f12506;
            }
            int i7 = this.f12512;
            if (i6 > i7) {
                m12943();
                return;
            }
            int m12945 = m12945((this.f12516 + i6) - i7);
            if (i5 == -1) {
                int i8 = this.f12515 + 1;
                c[] cVarArr = this.f12513;
                if (i8 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f12514 = this.f12513.length - 1;
                    this.f12513 = cVarArr2;
                }
                int i9 = this.f12514;
                this.f12514 = i9 - 1;
                this.f12513[i9] = cVar;
                this.f12515++;
            } else {
                this.f12513[i5 + m12944(i5) + m12945] = cVar;
            }
            this.f12516 += i6;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        private boolean m12948(int i5) {
            return i5 >= 0 && i5 <= d.f12507.length - 1;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        private int m12949() throws IOException {
            return this.f12510.readByte() & 255;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        private void m12950(int i5) throws IOException {
            if (m12948(i5)) {
                this.f12509.add(d.f12507[i5]);
                return;
            }
            int m12944 = m12944(i5 - d.f12507.length);
            if (m12944 >= 0) {
                c[] cVarArr = this.f12513;
                if (m12944 < cVarArr.length) {
                    this.f12509.add(cVarArr[m12944]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i5 + 1));
        }

        /* renamed from: י, reason: contains not printable characters */
        private void m12951(int i5) throws IOException {
            m12947(-1, new c(m12946(i5), m12956()));
        }

        /* renamed from: ـ, reason: contains not printable characters */
        private void m12952() throws IOException {
            m12947(-1, new c(d.m12940(m12956()), m12956()));
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        private void m12953(int i5) throws IOException {
            this.f12509.add(new c(m12946(i5), m12956()));
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        private void m12954() throws IOException {
            this.f12509.add(new c(d.m12940(m12956()), m12956()));
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public List<c> m12955() {
            ArrayList arrayList = new ArrayList(this.f12509);
            this.f12509.clear();
            return arrayList;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        c5.f m12956() throws IOException {
            int m12949 = m12949();
            boolean z5 = (m12949 & 128) == 128;
            int m12958 = m12958(m12949, 127);
            return z5 ? c5.f.m5921(k.m13083().m13084(this.f12510.mo5892(m12958))) : this.f12510.mo5878(m12958);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        void m12957() throws IOException {
            while (!this.f12510.mo5890()) {
                int readByte = this.f12510.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                }
                if ((readByte & 128) == 128) {
                    m12950(m12958(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m12952();
                } else if ((readByte & 64) == 64) {
                    m12951(m12958(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m12958 = m12958(readByte, 31);
                    this.f12512 = m12958;
                    if (m12958 < 0 || m12958 > this.f12511) {
                        throw new IOException("Invalid dynamic table size update " + this.f12512);
                    }
                    m12942();
                } else if (readByte == 16 || readByte == 0) {
                    m12954();
                } else {
                    m12953(m12958(readByte, 15) - 1);
                }
            }
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        int m12958(int i5, int i6) throws IOException {
            int i7 = i5 & i6;
            if (i7 < i6) {
                return i7;
            }
            int i8 = 0;
            while (true) {
                int m12949 = m12949();
                if ((m12949 & 128) == 0) {
                    return i6 + (m12949 << i8);
                }
                i6 += (m12949 & 127) << i8;
                i8 += 7;
            }
        }

        a(int i5, int i6, s sVar) {
            this.f12509 = new ArrayList();
            this.f12513 = new c[8];
            this.f12514 = r0.length - 1;
            this.f12515 = 0;
            this.f12516 = 0;
            this.f12511 = i5;
            this.f12512 = i6;
            this.f12510 = c5.l.m5954(sVar);
        }
    }

    /* compiled from: Hpack.java */
    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final c5.c f12517;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final boolean f12518;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f12519;

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f12520;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f12521;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f12522;

        /* renamed from: ˈ, reason: contains not printable characters */
        c[] f12523;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f12524;

        /* renamed from: ˊ, reason: contains not printable characters */
        int f12525;

        /* renamed from: ˋ, reason: contains not printable characters */
        int f12526;

        b(c5.c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m12959() {
            int i5 = this.f12522;
            int i6 = this.f12526;
            if (i5 < i6) {
                if (i5 == 0) {
                    m12960();
                } else {
                    m12961(i6 - i5);
                }
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m12960() {
            Arrays.fill(this.f12523, (Object) null);
            this.f12524 = this.f12523.length - 1;
            this.f12525 = 0;
            this.f12526 = 0;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private int m12961(int i5) {
            int i6;
            int i7 = 0;
            if (i5 > 0) {
                int length = this.f12523.length;
                while (true) {
                    length--;
                    i6 = this.f12524;
                    if (length < i6 || i5 <= 0) {
                        break;
                    }
                    int i8 = this.f12523[length].f12506;
                    i5 -= i8;
                    this.f12526 -= i8;
                    this.f12525--;
                    i7++;
                }
                c[] cVarArr = this.f12523;
                System.arraycopy(cVarArr, i6 + 1, cVarArr, i6 + 1 + i7, this.f12525);
                c[] cVarArr2 = this.f12523;
                int i9 = this.f12524;
                Arrays.fill(cVarArr2, i9 + 1, i9 + 1 + i7, (Object) null);
                this.f12524 += i7;
            }
            return i7;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private void m12962(c cVar) {
            int i5 = cVar.f12506;
            int i6 = this.f12522;
            if (i5 > i6) {
                m12960();
                return;
            }
            m12961((this.f12526 + i5) - i6);
            int i7 = this.f12525 + 1;
            c[] cVarArr = this.f12523;
            if (i7 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f12524 = this.f12523.length - 1;
                this.f12523 = cVarArr2;
            }
            int i8 = this.f12524;
            this.f12524 = i8 - 1;
            this.f12523[i8] = cVar;
            this.f12525++;
            this.f12526 += i5;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        void m12963(int i5) {
            this.f12521 = i5;
            int min = Math.min(i5, 16384);
            int i6 = this.f12522;
            if (i6 == min) {
                return;
            }
            if (min < i6) {
                this.f12519 = Math.min(this.f12519, min);
            }
            this.f12520 = true;
            this.f12522 = min;
            m12959();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        void m12964(c5.f fVar) throws IOException {
            if (!this.f12518 || k.m13083().m13086(fVar) >= fVar.mo5930()) {
                m12966(fVar.mo5930(), 127, 0);
                this.f12517.m5887(fVar);
                return;
            }
            c5.c cVar = new c5.c();
            k.m13083().m13085(fVar, cVar);
            c5.f m5875 = cVar.m5875();
            m12966(m5875.mo5930(), 127, 128);
            this.f12517.m5887(m5875);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x006a  */
        /* renamed from: ˈ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void m12965(java.util.List<y4.c> r14) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y4.d.b.m12965(java.util.List):void");
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        void m12966(int i5, int i6, int i7) {
            if (i5 < i6) {
                this.f12517.writeByte(i5 | i7);
                return;
            }
            this.f12517.writeByte(i7 | i6);
            int i8 = i5 - i6;
            while (i8 >= 128) {
                this.f12517.writeByte(128 | (i8 & 127));
                i8 >>>= 7;
            }
            this.f12517.writeByte(i8);
        }

        b(int i5, boolean z5, c5.c cVar) {
            this.f12519 = Integer.MAX_VALUE;
            this.f12523 = new c[8];
            this.f12524 = r0.length - 1;
            this.f12525 = 0;
            this.f12526 = 0;
            this.f12521 = i5;
            this.f12522 = i5;
            this.f12518 = z5;
            this.f12517 = cVar;
        }
    }

    static {
        c5.f fVar = c.f12500;
        c5.f fVar2 = c.f12501;
        c5.f fVar3 = c.f12502;
        c5.f fVar4 = c.f12499;
        f12507 = new c[]{new c(c.f12503, BuildConfig.FLAVOR), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, "http"), new c(fVar3, "https"), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", BuildConfig.FLAVOR), new c("accept-encoding", "gzip, deflate"), new c("accept-language", BuildConfig.FLAVOR), new c("accept-ranges", BuildConfig.FLAVOR), new c("accept", BuildConfig.FLAVOR), new c("access-control-allow-origin", BuildConfig.FLAVOR), new c("age", BuildConfig.FLAVOR), new c("allow", BuildConfig.FLAVOR), new c("authorization", BuildConfig.FLAVOR), new c("cache-control", BuildConfig.FLAVOR), new c("content-disposition", BuildConfig.FLAVOR), new c("content-encoding", BuildConfig.FLAVOR), new c("content-language", BuildConfig.FLAVOR), new c("content-length", BuildConfig.FLAVOR), new c("content-location", BuildConfig.FLAVOR), new c("content-range", BuildConfig.FLAVOR), new c("content-type", BuildConfig.FLAVOR), new c("cookie", BuildConfig.FLAVOR), new c("date", BuildConfig.FLAVOR), new c("etag", BuildConfig.FLAVOR), new c("expect", BuildConfig.FLAVOR), new c("expires", BuildConfig.FLAVOR), new c("from", BuildConfig.FLAVOR), new c("host", BuildConfig.FLAVOR), new c("if-match", BuildConfig.FLAVOR), new c("if-modified-since", BuildConfig.FLAVOR), new c("if-none-match", BuildConfig.FLAVOR), new c("if-range", BuildConfig.FLAVOR), new c("if-unmodified-since", BuildConfig.FLAVOR), new c("last-modified", BuildConfig.FLAVOR), new c("link", BuildConfig.FLAVOR), new c("location", BuildConfig.FLAVOR), new c("max-forwards", BuildConfig.FLAVOR), new c("proxy-authenticate", BuildConfig.FLAVOR), new c("proxy-authorization", BuildConfig.FLAVOR), new c("range", BuildConfig.FLAVOR), new c("referer", BuildConfig.FLAVOR), new c("refresh", BuildConfig.FLAVOR), new c("retry-after", BuildConfig.FLAVOR), new c("server", BuildConfig.FLAVOR), new c("set-cookie", BuildConfig.FLAVOR), new c("strict-transport-security", BuildConfig.FLAVOR), new c("transfer-encoding", BuildConfig.FLAVOR), new c("user-agent", BuildConfig.FLAVOR), new c("vary", BuildConfig.FLAVOR), new c("via", BuildConfig.FLAVOR), new c("www-authenticate", BuildConfig.FLAVOR)};
        f12508 = m12941();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static c5.f m12940(c5.f fVar) throws IOException {
        int mo5930 = fVar.mo5930();
        for (int i5 = 0; i5 < mo5930; i5++) {
            byte mo5924 = fVar.mo5924(i5);
            if (mo5924 >= 65 && mo5924 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.mo5935());
            }
        }
        return fVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Map<c5.f, Integer> m12941() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f12507.length);
        int i5 = 0;
        while (true) {
            c[] cVarArr = f12507;
            if (i5 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i5].f12504)) {
                linkedHashMap.put(cVarArr[i5].f12504, Integer.valueOf(i5));
            }
            i5++;
        }
    }
}
