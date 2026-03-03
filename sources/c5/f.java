package c5;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: ˈ, reason: contains not printable characters */
    static final char[] f5013 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final f f5014 = m5921(new byte[0]);

    /* renamed from: ʾ, reason: contains not printable characters */
    final byte[] f5015;

    /* renamed from: ʿ, reason: contains not printable characters */
    transient int f5016;

    /* renamed from: ˆ, reason: contains not printable characters */
    transient String f5017;

    f(byte[] bArr) {
        this.f5015 = bArr;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static int m5916(String str, int i5) {
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            if (i7 == i5) {
                return i6;
            }
            int codePointAt = str.codePointAt(i6);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i7++;
            i6 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static f m5917(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i5 * 2;
            bArr[i5] = (byte) ((m5918(str.charAt(i6)) << 4) + m5918(str.charAt(i6 + 1)));
        }
        return m5921(bArr);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m5918(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        char c7 = 'a';
        if (c6 < 'a' || c6 > 'f') {
            c7 = 'A';
            if (c6 < 'A' || c6 > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c6);
            }
        }
        return (c6 - c7) + 10;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private f m5919(String str) {
        try {
            return m5921(MessageDigest.getInstance(str).digest(this.f5015));
        } catch (NoSuchAlgorithmException e5) {
            throw new AssertionError(e5);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static f m5920(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        f fVar = new f(str.getBytes(u.f5058));
        fVar.f5017 = str;
        return fVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static f m5921(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int mo5930 = fVar.mo5930();
            byte[] bArr = this.f5015;
            if (mo5930 == bArr.length && fVar.mo5927(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i5 = this.f5016;
        if (i5 != 0) {
            return i5;
        }
        int hashCode = Arrays.hashCode(this.f5015);
        this.f5016 = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f5015.length == 0) {
            return "[size=0]";
        }
        String mo5935 = mo5935();
        int m5916 = m5916(mo5935, 64);
        if (m5916 == -1) {
            if (this.f5015.length <= 64) {
                return "[hex=" + mo5925() + "]";
            }
            return "[size=" + this.f5015.length + " hex=" + mo5932(0, 64).mo5925() + "…]";
        }
        String replace = mo5935.substring(0, m5916).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (m5916 >= mo5935.length()) {
            return "[text=" + replace + "]";
        }
        return "[size=" + this.f5015.length + " text=" + replace + "…]";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public String mo5922() {
        return b.m5870(this.f5015);
    }

    @Override // java.lang.Comparable
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int mo5930 = mo5930();
        int mo59302 = fVar.mo5930();
        int min = Math.min(mo5930, mo59302);
        for (int i5 = 0; i5 < min; i5++) {
            int mo5924 = mo5924(i5) & 255;
            int mo59242 = fVar.mo5924(i5) & 255;
            if (mo5924 != mo59242) {
                return mo5924 < mo59242 ? -1 : 1;
            }
        }
        if (mo5930 == mo59302) {
            return 0;
        }
        return mo5930 < mo59302 ? -1 : 1;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public byte mo5924(int i5) {
        return this.f5015[i5];
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public String mo5925() {
        byte[] bArr = this.f5015;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (byte b6 : bArr) {
            int i6 = i5 + 1;
            char[] cArr2 = f5013;
            cArr[i5] = cArr2[(b6 >> 4) & 15];
            i5 = i6 + 1;
            cArr[i6] = cArr2[b6 & 15];
        }
        return new String(cArr);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean mo5926(int i5, f fVar, int i6, int i7) {
        return fVar.mo5927(i6, this.f5015, i5, i7);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean mo5927(int i5, byte[] bArr, int i6, int i7) {
        if (i5 >= 0) {
            byte[] bArr2 = this.f5015;
            if (i5 <= bArr2.length - i7 && i6 >= 0 && i6 <= bArr.length - i7 && u.m5977(bArr2, i5, bArr, i6, i7)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public f mo5928() {
        return m5919("SHA-1");
    }

    /* renamed from: י, reason: contains not printable characters */
    public f mo5929() {
        return m5919("SHA-256");
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public int mo5930() {
        return this.f5015.length;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public final boolean m5931(f fVar) {
        return mo5926(0, fVar, 0, fVar.mo5930());
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public f mo5932(int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f5015;
        if (i6 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f5015.length + ")");
        }
        int i7 = i6 - i5;
        if (i7 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i5 == 0 && i6 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, i5, bArr2, 0, i7);
        return new f(bArr2);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public f mo5933() {
        int i5 = 0;
        while (true) {
            byte[] bArr = this.f5015;
            if (i5 >= bArr.length) {
                return this;
            }
            byte b6 = bArr[i5];
            if (b6 >= 65 && b6 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i5] = (byte) (b6 + 32);
                for (int i6 = i5 + 1; i6 < bArr2.length; i6++) {
                    byte b7 = bArr2[i6];
                    if (b7 >= 65 && b7 <= 90) {
                        bArr2[i6] = (byte) (b7 + 32);
                    }
                }
                return new f(bArr2);
            }
            i5++;
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public byte[] mo5934() {
        return (byte[]) this.f5015.clone();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public String mo5935() {
        String str = this.f5017;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f5015, u.f5058);
        this.f5017 = str2;
        return str2;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void mo5936(c cVar) {
        byte[] bArr = this.f5015;
        cVar.write(bArr, 0, bArr.length);
    }
}
