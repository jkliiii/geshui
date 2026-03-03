package y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: AndroidDistinguishedNameParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final String f12468;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f12469;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f12470;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f12471;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f12472;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f12473;

    /* renamed from: ˈ, reason: contains not printable characters */
    private char[] f12474;

    public b(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f12468 = name;
        this.f12469 = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        r1 = r8.f12474;
        r2 = r8.f12471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.f12473 - r2);
     */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m12924() {
        /*
            r8 = this;
            int r0 = r8.f12470
            r8.f12471 = r0
            r8.f12472 = r0
        L6:
            int r0 = r8.f12470
            int r1 = r8.f12469
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f12474
            int r2 = r8.f12471
            int r3 = r8.f12472
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f12474
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f12472
            int r4 = r3 + 1
            r8.f12472 = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f12470 = r0
            goto L6
        L3e:
            int r0 = r8.f12472
            int r2 = r0 + 1
            r8.f12472 = r2
            char r2 = r8.m12926()
            r1[r0] = r2
            int r0 = r8.f12470
            int r0 = r0 + 1
            r8.f12470 = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f12471
            int r3 = r8.f12472
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f12472
            r8.f12473 = r2
            int r0 = r0 + 1
            r8.f12470 = r0
            int r0 = r2 + 1
            r8.f12472 = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f12470
            int r1 = r8.f12469
            if (r0 >= r1) goto L83
            char[] r2 = r8.f12474
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f12472
            int r7 = r1 + 1
            r8.f12472 = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f12470 = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f12474
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f12474
            int r2 = r8.f12471
            int r3 = r8.f12473
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.b.m12924():java.lang.String");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private int m12925(int i5) {
        int i6;
        int i7;
        int i8 = i5 + 1;
        if (i8 >= this.f12469) {
            throw new IllegalStateException("Malformed DN: " + this.f12468);
        }
        char[] cArr = this.f12474;
        char c6 = cArr[i5];
        if (c6 >= '0' && c6 <= '9') {
            i6 = c6 - '0';
        } else if (c6 >= 'a' && c6 <= 'f') {
            i6 = c6 - 'W';
        } else {
            if (c6 < 'A' || c6 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f12468);
            }
            i6 = c6 - '7';
        }
        char c7 = cArr[i8];
        if (c7 >= '0' && c7 <= '9') {
            i7 = c7 - '0';
        } else if (c7 >= 'a' && c7 <= 'f') {
            i7 = c7 - 'W';
        } else {
            if (c7 < 'A' || c7 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f12468);
            }
            i7 = c7 - '7';
        }
        return (i6 << 4) + i7;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private char m12926() {
        int i5 = this.f12470 + 1;
        this.f12470 = i5;
        if (i5 == this.f12469) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f12468);
        }
        char c6 = this.f12474[i5];
        if (c6 == ' ' || c6 == '%' || c6 == '\\' || c6 == '_' || c6 == '\"' || c6 == '#') {
            return c6;
        }
        switch (c6) {
            case '*':
            case '+':
            case ',':
                return c6;
            default:
                switch (c6) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c6;
                    default:
                        return m12927();
                }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private char m12927() {
        int i5;
        int i6;
        int m12925 = m12925(this.f12470);
        this.f12470++;
        if (m12925 < 128) {
            return (char) m12925;
        }
        if (m12925 < 192 || m12925 > 247) {
            return '?';
        }
        if (m12925 <= 223) {
            i5 = m12925 & 31;
            i6 = 1;
        } else if (m12925 <= 239) {
            i5 = m12925 & 15;
            i6 = 2;
        } else {
            i5 = m12925 & 7;
            i6 = 3;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int i8 = this.f12470 + 1;
            this.f12470 = i8;
            if (i8 == this.f12469 || this.f12474[i8] != '\\') {
                return '?';
            }
            int i9 = i8 + 1;
            this.f12470 = i9;
            int m129252 = m12925(i9);
            this.f12470++;
            if ((m129252 & 192) != 128) {
                return '?';
            }
            i5 = (i5 << 6) + (m129252 & 63);
        }
        return (char) i5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private String m12928() {
        int i5;
        char[] cArr;
        char c6;
        int i6 = this.f12470;
        if (i6 + 4 >= this.f12469) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f12468);
        }
        this.f12471 = i6;
        this.f12470 = i6 + 1;
        while (true) {
            i5 = this.f12470;
            if (i5 == this.f12469 || (c6 = (cArr = this.f12474)[i5]) == '+' || c6 == ',' || c6 == ';') {
                break;
            }
            if (c6 == ' ') {
                this.f12472 = i5;
                this.f12470 = i5 + 1;
                while (true) {
                    int i7 = this.f12470;
                    if (i7 >= this.f12469 || this.f12474[i7] != ' ') {
                        break;
                    }
                    this.f12470 = i7 + 1;
                }
            } else {
                if (c6 >= 'A' && c6 <= 'F') {
                    cArr[i5] = (char) (c6 + ' ');
                }
                this.f12470 = i5 + 1;
            }
        }
        this.f12472 = i5;
        int i8 = this.f12472;
        int i9 = this.f12471;
        int i10 = i8 - i9;
        if (i10 < 5 || (i10 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f12468);
        }
        int i11 = i10 / 2;
        byte[] bArr = new byte[i11];
        int i12 = i9 + 1;
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) m12925(i12);
            i12 += 2;
        }
        return new String(this.f12474, this.f12471, i10);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private String m12929() {
        int i5;
        int i6;
        int i7;
        int i8;
        char c6;
        int i9;
        int i10;
        char c7;
        char c8;
        while (true) {
            i5 = this.f12470;
            i6 = this.f12469;
            if (i5 >= i6 || this.f12474[i5] != ' ') {
                break;
            }
            this.f12470 = i5 + 1;
        }
        if (i5 == i6) {
            return null;
        }
        this.f12471 = i5;
        this.f12470 = i5 + 1;
        while (true) {
            i7 = this.f12470;
            i8 = this.f12469;
            if (i7 >= i8 || (c8 = this.f12474[i7]) == '=' || c8 == ' ') {
                break;
            }
            this.f12470 = i7 + 1;
        }
        if (i7 >= i8) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f12468);
        }
        this.f12472 = i7;
        if (this.f12474[i7] == ' ') {
            while (true) {
                i9 = this.f12470;
                i10 = this.f12469;
                if (i9 >= i10 || (c7 = this.f12474[i9]) == '=' || c7 != ' ') {
                    break;
                }
                this.f12470 = i9 + 1;
            }
            if (this.f12474[i9] != '=' || i9 == i10) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f12468);
            }
        }
        this.f12470++;
        while (true) {
            int i11 = this.f12470;
            if (i11 >= this.f12469 || this.f12474[i11] != ' ') {
                break;
            }
            this.f12470 = i11 + 1;
        }
        int i12 = this.f12472;
        int i13 = this.f12471;
        if (i12 - i13 > 4) {
            char[] cArr = this.f12474;
            if (cArr[i13 + 3] == '.' && (((c6 = cArr[i13]) == 'O' || c6 == 'o') && ((cArr[i13 + 1] == 'I' || cArr[i13 + 1] == 'i') && (cArr[i13 + 2] == 'D' || cArr[i13 + 2] == 'd')))) {
                this.f12471 = i13 + 4;
            }
        }
        char[] cArr2 = this.f12474;
        int i14 = this.f12471;
        return new String(cArr2, i14, i12 - i14);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private String m12930() {
        int i5 = this.f12470 + 1;
        this.f12470 = i5;
        this.f12471 = i5;
        this.f12472 = i5;
        while (true) {
            int i6 = this.f12470;
            if (i6 == this.f12469) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f12468);
            }
            char[] cArr = this.f12474;
            char c6 = cArr[i6];
            if (c6 == '\"') {
                this.f12470 = i6 + 1;
                while (true) {
                    int i7 = this.f12470;
                    if (i7 >= this.f12469 || this.f12474[i7] != ' ') {
                        break;
                    }
                    this.f12470 = i7 + 1;
                }
                char[] cArr2 = this.f12474;
                int i8 = this.f12471;
                return new String(cArr2, i8, this.f12472 - i8);
            }
            if (c6 == '\\') {
                cArr[this.f12472] = m12926();
            } else {
                cArr[this.f12472] = c6;
            }
            this.f12470++;
            this.f12472++;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public List<String> m12931(String str) {
        this.f12470 = 0;
        this.f12471 = 0;
        this.f12472 = 0;
        this.f12473 = 0;
        this.f12474 = this.f12468.toCharArray();
        List<String> emptyList = Collections.emptyList();
        String m12929 = m12929();
        if (m12929 == null) {
            return emptyList;
        }
        do {
            int i5 = this.f12470;
            if (i5 < this.f12469) {
                char c6 = this.f12474[i5];
                String m12924 = c6 != '\"' ? c6 != '#' ? (c6 == '+' || c6 == ',' || c6 == ';') ? BuildConfig.FLAVOR : m12924() : m12928() : m12930();
                if (str.equalsIgnoreCase(m12929)) {
                    if (emptyList.isEmpty()) {
                        emptyList = new ArrayList<>();
                    }
                    emptyList.add(m12924);
                }
                int i6 = this.f12470;
                if (i6 < this.f12469) {
                    char c7 = this.f12474[i6];
                    if (c7 != ',' && c7 != ';' && c7 != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.f12468);
                    }
                    this.f12470 = i6 + 1;
                    m12929 = m12929();
                }
            }
            return emptyList;
        } while (m12929 != null);
        throw new IllegalStateException("Malformed DN: " + this.f12468);
    }
}
