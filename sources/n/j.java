package n;

import java.util.Arrays;
import n.b;

/* compiled from: SolverVariableValues.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j implements b.a {

    /* renamed from: י, reason: contains not printable characters */
    private static float f9484 = 0.001f;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f9485 = -1;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f9486 = 16;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f9487 = 16;

    /* renamed from: ʾ, reason: contains not printable characters */
    int[] f9488 = new int[16];

    /* renamed from: ʿ, reason: contains not printable characters */
    int[] f9489 = new int[16];

    /* renamed from: ˆ, reason: contains not printable characters */
    int[] f9490 = new int[16];

    /* renamed from: ˈ, reason: contains not printable characters */
    float[] f9491 = new float[16];

    /* renamed from: ˉ, reason: contains not printable characters */
    int[] f9492 = new int[16];

    /* renamed from: ˊ, reason: contains not printable characters */
    int[] f9493 = new int[16];

    /* renamed from: ˋ, reason: contains not printable characters */
    int f9494 = 0;

    /* renamed from: ˎ, reason: contains not printable characters */
    int f9495 = -1;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final b f9496;

    /* renamed from: ˑ, reason: contains not printable characters */
    protected final c f9497;

    j(b bVar, c cVar) {
        this.f9496 = bVar;
        this.f9497 = cVar;
        clear();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m10392(i iVar, int i5) {
        int[] iArr;
        int i6 = iVar.f9463 % this.f9487;
        int[] iArr2 = this.f9488;
        int i7 = iArr2[i6];
        if (i7 == -1) {
            iArr2[i6] = i5;
        } else {
            while (true) {
                iArr = this.f9489;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    break;
                } else {
                    i7 = i8;
                }
            }
            iArr[i7] = i5;
        }
        this.f9489[i5] = -1;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m10393(int i5, i iVar, float f5) {
        this.f9490[i5] = iVar.f9463;
        this.f9491[i5] = f5;
        this.f9492[i5] = -1;
        this.f9493[i5] = -1;
        iVar.m10385(this.f9496);
        iVar.f9473++;
        this.f9494++;
    }

    /* renamed from: י, reason: contains not printable characters */
    private int m10394() {
        for (int i5 = 0; i5 < this.f9486; i5++) {
            if (this.f9490[i5] == -1) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m10395() {
        int i5 = this.f9486 * 2;
        this.f9490 = Arrays.copyOf(this.f9490, i5);
        this.f9491 = Arrays.copyOf(this.f9491, i5);
        this.f9492 = Arrays.copyOf(this.f9492, i5);
        this.f9493 = Arrays.copyOf(this.f9493, i5);
        this.f9489 = Arrays.copyOf(this.f9489, i5);
        for (int i6 = this.f9486; i6 < i5; i6++) {
            this.f9490[i6] = -1;
            this.f9489[i6] = -1;
        }
        this.f9486 = i5;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private void m10396(int i5, i iVar, float f5) {
        int m10394 = m10394();
        m10393(m10394, iVar, f5);
        if (i5 != -1) {
            this.f9492[m10394] = i5;
            int[] iArr = this.f9493;
            iArr[m10394] = iArr[i5];
            iArr[i5] = m10394;
        } else {
            this.f9492[m10394] = -1;
            if (this.f9494 > 0) {
                this.f9493[m10394] = this.f9495;
                this.f9495 = m10394;
            } else {
                this.f9493[m10394] = -1;
            }
        }
        int i6 = this.f9493[m10394];
        if (i6 != -1) {
            this.f9492[i6] = m10394;
        }
        m10392(iVar, m10394);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m10397(i iVar) {
        int[] iArr;
        int i5;
        int i6 = iVar.f9463;
        int i7 = i6 % this.f9487;
        int[] iArr2 = this.f9488;
        int i8 = iArr2[i7];
        if (i8 == -1) {
            return;
        }
        if (this.f9490[i8] == i6) {
            int[] iArr3 = this.f9489;
            iArr2[i7] = iArr3[i8];
            iArr3[i8] = -1;
            return;
        }
        while (true) {
            iArr = this.f9489;
            i5 = iArr[i8];
            if (i5 == -1 || this.f9490[i5] == i6) {
                break;
            } else {
                i8 = i5;
            }
        }
        if (i5 == -1 || this.f9490[i5] != i6) {
            return;
        }
        iArr[i8] = iArr[i5];
        iArr[i5] = -1;
    }

    @Override // n.b.a
    public void clear() {
        int i5 = this.f9494;
        for (int i6 = 0; i6 < i5; i6++) {
            i mo10308 = mo10308(i6);
            if (mo10308 != null) {
                mo10308.m10387(this.f9496);
            }
        }
        for (int i7 = 0; i7 < this.f9486; i7++) {
            this.f9490[i7] = -1;
            this.f9489[i7] = -1;
        }
        for (int i8 = 0; i8 < this.f9487; i8++) {
            this.f9488[i8] = -1;
        }
        this.f9494 = 0;
        this.f9495 = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i5 = this.f9494;
        for (int i6 = 0; i6 < i5; i6++) {
            i mo10308 = mo10308(i6);
            if (mo10308 != null) {
                String str2 = str + mo10308 + " = " + mo10301(i6) + " ";
                int m10398 = m10398(mo10308);
                String str3 = str2 + "[p: ";
                String str4 = (this.f9492[m10398] != -1 ? str3 + this.f9497.f9421[this.f9490[this.f9492[m10398]]] : str3 + "none") + ", n: ";
                str = (this.f9493[m10398] != -1 ? str4 + this.f9497.f9421[this.f9490[this.f9493[m10398]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // n.b.a
    /* renamed from: ʻ */
    public float mo10301(int i5) {
        int i6 = this.f9494;
        int i7 = this.f9495;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i5) {
                return this.f9491[i7];
            }
            i7 = this.f9493[i7];
            if (i7 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // n.b.a
    /* renamed from: ʼ */
    public void mo10302(i iVar, float f5, boolean z5) {
        float f6 = f9484;
        if (f5 <= (-f6) || f5 >= f6) {
            int m10398 = m10398(iVar);
            if (m10398 == -1) {
                mo10304(iVar, f5);
                return;
            }
            float[] fArr = this.f9491;
            float f7 = fArr[m10398] + f5;
            fArr[m10398] = f7;
            float f8 = f9484;
            if (f7 <= (-f8) || f7 >= f8) {
                return;
            }
            fArr[m10398] = 0.0f;
            mo10310(iVar, z5);
        }
    }

    @Override // n.b.a
    /* renamed from: ʽ */
    public float mo10303(b bVar, boolean z5) {
        float mo10306 = mo10306(bVar.f9412);
        mo10310(bVar.f9412, z5);
        j jVar = (j) bVar.f9416;
        int mo10305 = jVar.mo10305();
        int i5 = 0;
        int i6 = 0;
        while (i5 < mo10305) {
            int i7 = jVar.f9490[i6];
            if (i7 != -1) {
                mo10302(this.f9497.f9421[i7], jVar.f9491[i6] * mo10306, z5);
                i5++;
            }
            i6++;
        }
        return mo10306;
    }

    @Override // n.b.a
    /* renamed from: ʾ */
    public void mo10304(i iVar, float f5) {
        float f6 = f9484;
        if (f5 > (-f6) && f5 < f6) {
            mo10310(iVar, true);
            return;
        }
        if (this.f9494 == 0) {
            m10393(0, iVar, f5);
            m10392(iVar, 0);
            this.f9495 = 0;
            return;
        }
        int m10398 = m10398(iVar);
        if (m10398 != -1) {
            this.f9491[m10398] = f5;
            return;
        }
        if (this.f9494 + 1 >= this.f9486) {
            m10395();
        }
        int i5 = this.f9494;
        int i6 = this.f9495;
        int i7 = -1;
        for (int i8 = 0; i8 < i5; i8++) {
            int i9 = this.f9490[i6];
            int i10 = iVar.f9463;
            if (i9 == i10) {
                this.f9491[i6] = f5;
                return;
            }
            if (i9 < i10) {
                i7 = i6;
            }
            i6 = this.f9493[i6];
            if (i6 == -1) {
                break;
            }
        }
        m10396(i7, iVar, f5);
    }

    @Override // n.b.a
    /* renamed from: ʿ */
    public int mo10305() {
        return this.f9494;
    }

    @Override // n.b.a
    /* renamed from: ˆ */
    public float mo10306(i iVar) {
        int m10398 = m10398(iVar);
        if (m10398 != -1) {
            return this.f9491[m10398];
        }
        return 0.0f;
    }

    @Override // n.b.a
    /* renamed from: ˈ */
    public boolean mo10307(i iVar) {
        return m10398(iVar) != -1;
    }

    @Override // n.b.a
    /* renamed from: ˉ */
    public i mo10308(int i5) {
        int i6 = this.f9494;
        if (i6 == 0) {
            return null;
        }
        int i7 = this.f9495;
        for (int i8 = 0; i8 < i6; i8++) {
            if (i8 == i5 && i7 != -1) {
                return this.f9497.f9421[this.f9490[i7]];
            }
            i7 = this.f9493[i7];
            if (i7 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // n.b.a
    /* renamed from: ˊ */
    public void mo10309(float f5) {
        int i5 = this.f9494;
        int i6 = this.f9495;
        for (int i7 = 0; i7 < i5; i7++) {
            float[] fArr = this.f9491;
            fArr[i6] = fArr[i6] / f5;
            i6 = this.f9493[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    @Override // n.b.a
    /* renamed from: ˋ */
    public float mo10310(i iVar, boolean z5) {
        int m10398 = m10398(iVar);
        if (m10398 == -1) {
            return 0.0f;
        }
        m10397(iVar);
        float f5 = this.f9491[m10398];
        if (this.f9495 == m10398) {
            this.f9495 = this.f9493[m10398];
        }
        this.f9490[m10398] = -1;
        int[] iArr = this.f9492;
        int i5 = iArr[m10398];
        if (i5 != -1) {
            int[] iArr2 = this.f9493;
            iArr2[i5] = iArr2[m10398];
        }
        int i6 = this.f9493[m10398];
        if (i6 != -1) {
            iArr[i6] = iArr[m10398];
        }
        this.f9494--;
        iVar.f9473--;
        if (z5) {
            iVar.m10387(this.f9496);
        }
        return f5;
    }

    @Override // n.b.a
    /* renamed from: ˎ */
    public void mo10311() {
        int i5 = this.f9494;
        int i6 = this.f9495;
        for (int i7 = 0; i7 < i5; i7++) {
            float[] fArr = this.f9491;
            fArr[i6] = fArr[i6] * (-1.0f);
            i6 = this.f9493[i6];
            if (i6 == -1) {
                return;
            }
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public int m10398(i iVar) {
        if (this.f9494 != 0 && iVar != null) {
            int i5 = iVar.f9463;
            int i6 = this.f9488[i5 % this.f9487];
            if (i6 == -1) {
                return -1;
            }
            if (this.f9490[i6] == i5) {
                return i6;
            }
            do {
                i6 = this.f9489[i6];
                if (i6 == -1) {
                    break;
                }
            } while (this.f9490[i6] != i5);
            if (i6 != -1 && this.f9490[i6] == i5) {
                return i6;
            }
        }
        return -1;
    }
}
