package s2;

import java.nio.ByteBuffer;
import k2.q;
import k2.s;
import k2.x;

/* compiled from: BoundaryEmitter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends x {

    /* renamed from: ˉ, reason: contains not printable characters */
    private byte[] f10865;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f10866 = 2;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public String m11713() {
        byte[] bArr = this.f10865;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, 4, bArr.length - 4);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public String m11714() {
        byte[] bArr = this.f10865;
        return new String(bArr, 2, bArr.length - 2);
    }

    /* renamed from: ˈˈ */
    protected void mo10977() {
        throw null;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m11715(String str) {
        this.f10865 = ("\r\n--" + str).getBytes();
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public String m11716() {
        return m11714() + "--\r\n";
    }

    @Override // k2.x, l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        if (this.f10866 > 0) {
            ByteBuffer m9480 = q.m9480(this.f10865.length);
            m9480.put(this.f10865, 0, this.f10866);
            m9480.flip();
            qVar.m9486(m9480);
            this.f10866 = 0;
        }
        int m9500 = qVar.m9500();
        byte[] bArr = new byte[m9500];
        qVar.m9491(bArr);
        int i5 = 0;
        int i6 = 0;
        while (i5 < m9500) {
            int i7 = this.f10866;
            if (i7 >= 0) {
                byte b6 = bArr[i5];
                byte[] bArr2 = this.f10865;
                if (b6 == bArr2[i7]) {
                    int i8 = i7 + 1;
                    this.f10866 = i8;
                    if (i8 == bArr2.length) {
                        this.f10866 = -1;
                    }
                } else if (i7 > 0) {
                    i5 -= i7;
                    this.f10866 = 0;
                }
            } else if (i7 == -1) {
                byte b7 = bArr[i5];
                if (b7 == 13) {
                    this.f10866 = -4;
                    int length = (i5 - i6) - this.f10865.length;
                    if (i6 != 0 || length != 0) {
                        ByteBuffer put = q.m9480(length).put(bArr, i6, length);
                        put.flip();
                        q qVar2 = new q();
                        qVar2.m9483(put);
                        super.mo9377(this, qVar2);
                    }
                    mo10977();
                } else {
                    if (b7 != 45) {
                        mo9511(new c("Invalid multipart/form-data. Expected \r or -"));
                        return;
                    }
                    this.f10866 = -2;
                }
            } else if (i7 == -2) {
                if (bArr[i5] != 45) {
                    mo9511(new c("Invalid multipart/form-data. Expected -"));
                    return;
                }
                this.f10866 = -3;
            } else if (i7 == -3) {
                if (bArr[i5] != 13) {
                    mo9511(new c("Invalid multipart/form-data. Expected \r"));
                    return;
                }
                this.f10866 = -4;
                int i9 = i5 - i6;
                ByteBuffer put2 = q.m9480((i9 - this.f10865.length) - 2).put(bArr, i6, (i9 - this.f10865.length) - 2);
                put2.flip();
                q qVar3 = new q();
                qVar3.m9483(put2);
                super.mo9377(this, qVar3);
                mo10978();
            } else if (i7 != -4) {
                mo9511(new c("Invalid multipart/form-data. Unknown state?"));
            } else if (bArr[i5] == 10) {
                i6 = i5 + 1;
                this.f10866 = 0;
            } else {
                mo9511(new c("Invalid multipart/form-data. Expected \n"));
            }
            i5++;
        }
        if (i6 < m9500) {
            int max = (m9500 - i6) - Math.max(this.f10866, 0);
            ByteBuffer put3 = q.m9480(max).put(bArr, i6, max);
            put3.flip();
            q qVar4 = new q();
            qVar4.m9483(put3);
            super.mo9377(this, qVar4);
        }
    }

    /* renamed from: ˉˉ */
    protected void mo10978() {
    }
}
