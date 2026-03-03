package n;

import java.util.Arrays;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import n.b;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements b.a {

    /* renamed from: ˏ, reason: contains not printable characters */
    private static float f9400 = 0.001f;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final b f9402;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final c f9403;

    /* renamed from: ʻ, reason: contains not printable characters */
    int f9401 = 0;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f9404 = 8;

    /* renamed from: ʿ, reason: contains not printable characters */
    private i f9405 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int[] f9406 = new int[8];

    /* renamed from: ˈ, reason: contains not printable characters */
    private int[] f9407 = new int[8];

    /* renamed from: ˉ, reason: contains not printable characters */
    private float[] f9408 = new float[8];

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f9409 = -1;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f9410 = -1;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f9411 = false;

    a(b bVar, c cVar) {
        this.f9402 = bVar;
        this.f9403 = cVar;
    }

    @Override // n.b.a
    public final void clear() {
        int i5 = this.f9409;
        for (int i6 = 0; i5 != -1 && i6 < this.f9401; i6++) {
            i iVar = this.f9403.f9421[this.f9406[i5]];
            if (iVar != null) {
                iVar.m10387(this.f9402);
            }
            i5 = this.f9407[i5];
        }
        this.f9409 = -1;
        this.f9410 = -1;
        this.f9411 = false;
        this.f9401 = 0;
    }

    public String toString() {
        int i5 = this.f9409;
        String str = BuildConfig.FLAVOR;
        for (int i6 = 0; i5 != -1 && i6 < this.f9401; i6++) {
            str = ((str + " -> ") + this.f9408[i5] + " : ") + this.f9403.f9421[this.f9406[i5]];
            i5 = this.f9407[i5];
        }
        return str;
    }

    @Override // n.b.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public float mo10301(int i5) {
        int i6 = this.f9409;
        for (int i7 = 0; i6 != -1 && i7 < this.f9401; i7++) {
            if (i7 == i5) {
                return this.f9408[i6];
            }
            i6 = this.f9407[i6];
        }
        return 0.0f;
    }

    @Override // n.b.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo10302(i iVar, float f5, boolean z5) {
        float f6 = f9400;
        if (f5 <= (-f6) || f5 >= f6) {
            int i5 = this.f9409;
            if (i5 == -1) {
                this.f9409 = 0;
                this.f9408[0] = f5;
                this.f9406[0] = iVar.f9463;
                this.f9407[0] = -1;
                iVar.f9473++;
                iVar.m10385(this.f9402);
                this.f9401++;
                if (this.f9411) {
                    return;
                }
                int i6 = this.f9410 + 1;
                this.f9410 = i6;
                int[] iArr = this.f9406;
                if (i6 >= iArr.length) {
                    this.f9411 = true;
                    this.f9410 = iArr.length - 1;
                    return;
                }
                return;
            }
            int i7 = -1;
            for (int i8 = 0; i5 != -1 && i8 < this.f9401; i8++) {
                int i9 = this.f9406[i5];
                int i10 = iVar.f9463;
                if (i9 == i10) {
                    float[] fArr = this.f9408;
                    float f7 = fArr[i5] + f5;
                    float f8 = f9400;
                    if (f7 > (-f8) && f7 < f8) {
                        f7 = 0.0f;
                    }
                    fArr[i5] = f7;
                    if (f7 == 0.0f) {
                        if (i5 == this.f9409) {
                            this.f9409 = this.f9407[i5];
                        } else {
                            int[] iArr2 = this.f9407;
                            iArr2[i7] = iArr2[i5];
                        }
                        if (z5) {
                            iVar.m10387(this.f9402);
                        }
                        if (this.f9411) {
                            this.f9410 = i5;
                        }
                        iVar.f9473--;
                        this.f9401--;
                        return;
                    }
                    return;
                }
                if (i9 < i10) {
                    i7 = i5;
                }
                i5 = this.f9407[i5];
            }
            int i11 = this.f9410;
            int i12 = i11 + 1;
            if (this.f9411) {
                int[] iArr3 = this.f9406;
                if (iArr3[i11] != -1) {
                    i11 = iArr3.length;
                }
            } else {
                i11 = i12;
            }
            int[] iArr4 = this.f9406;
            if (i11 >= iArr4.length && this.f9401 < iArr4.length) {
                int i13 = 0;
                while (true) {
                    int[] iArr5 = this.f9406;
                    if (i13 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i13] == -1) {
                        i11 = i13;
                        break;
                    }
                    i13++;
                }
            }
            int[] iArr6 = this.f9406;
            if (i11 >= iArr6.length) {
                i11 = iArr6.length;
                int i14 = this.f9404 * 2;
                this.f9404 = i14;
                this.f9411 = false;
                this.f9410 = i11 - 1;
                this.f9408 = Arrays.copyOf(this.f9408, i14);
                this.f9406 = Arrays.copyOf(this.f9406, this.f9404);
                this.f9407 = Arrays.copyOf(this.f9407, this.f9404);
            }
            this.f9406[i11] = iVar.f9463;
            this.f9408[i11] = f5;
            if (i7 != -1) {
                int[] iArr7 = this.f9407;
                iArr7[i11] = iArr7[i7];
                iArr7[i7] = i11;
            } else {
                this.f9407[i11] = this.f9409;
                this.f9409 = i11;
            }
            iVar.f9473++;
            iVar.m10385(this.f9402);
            this.f9401++;
            if (!this.f9411) {
                this.f9410++;
            }
            int i15 = this.f9410;
            int[] iArr8 = this.f9406;
            if (i15 >= iArr8.length) {
                this.f9411 = true;
                this.f9410 = iArr8.length - 1;
            }
        }
    }

    @Override // n.b.a
    /* renamed from: ʽ, reason: contains not printable characters */
    public float mo10303(b bVar, boolean z5) {
        float mo10306 = mo10306(bVar.f9412);
        mo10310(bVar.f9412, z5);
        b.a aVar = bVar.f9416;
        int mo10305 = aVar.mo10305();
        for (int i5 = 0; i5 < mo10305; i5++) {
            i mo10308 = aVar.mo10308(i5);
            mo10302(mo10308, aVar.mo10306(mo10308) * mo10306, z5);
        }
        return mo10306;
    }

    @Override // n.b.a
    /* renamed from: ʾ, reason: contains not printable characters */
    public final void mo10304(i iVar, float f5) {
        if (f5 == 0.0f) {
            mo10310(iVar, true);
            return;
        }
        int i5 = this.f9409;
        if (i5 == -1) {
            this.f9409 = 0;
            this.f9408[0] = f5;
            this.f9406[0] = iVar.f9463;
            this.f9407[0] = -1;
            iVar.f9473++;
            iVar.m10385(this.f9402);
            this.f9401++;
            if (this.f9411) {
                return;
            }
            int i6 = this.f9410 + 1;
            this.f9410 = i6;
            int[] iArr = this.f9406;
            if (i6 >= iArr.length) {
                this.f9411 = true;
                this.f9410 = iArr.length - 1;
                return;
            }
            return;
        }
        int i7 = -1;
        for (int i8 = 0; i5 != -1 && i8 < this.f9401; i8++) {
            int i9 = this.f9406[i5];
            int i10 = iVar.f9463;
            if (i9 == i10) {
                this.f9408[i5] = f5;
                return;
            }
            if (i9 < i10) {
                i7 = i5;
            }
            i5 = this.f9407[i5];
        }
        int i11 = this.f9410;
        int i12 = i11 + 1;
        if (this.f9411) {
            int[] iArr2 = this.f9406;
            if (iArr2[i11] != -1) {
                i11 = iArr2.length;
            }
        } else {
            i11 = i12;
        }
        int[] iArr3 = this.f9406;
        if (i11 >= iArr3.length && this.f9401 < iArr3.length) {
            int i13 = 0;
            while (true) {
                int[] iArr4 = this.f9406;
                if (i13 >= iArr4.length) {
                    break;
                }
                if (iArr4[i13] == -1) {
                    i11 = i13;
                    break;
                }
                i13++;
            }
        }
        int[] iArr5 = this.f9406;
        if (i11 >= iArr5.length) {
            i11 = iArr5.length;
            int i14 = this.f9404 * 2;
            this.f9404 = i14;
            this.f9411 = false;
            this.f9410 = i11 - 1;
            this.f9408 = Arrays.copyOf(this.f9408, i14);
            this.f9406 = Arrays.copyOf(this.f9406, this.f9404);
            this.f9407 = Arrays.copyOf(this.f9407, this.f9404);
        }
        this.f9406[i11] = iVar.f9463;
        this.f9408[i11] = f5;
        if (i7 != -1) {
            int[] iArr6 = this.f9407;
            iArr6[i11] = iArr6[i7];
            iArr6[i7] = i11;
        } else {
            this.f9407[i11] = this.f9409;
            this.f9409 = i11;
        }
        iVar.f9473++;
        iVar.m10385(this.f9402);
        int i15 = this.f9401 + 1;
        this.f9401 = i15;
        if (!this.f9411) {
            this.f9410++;
        }
        int[] iArr7 = this.f9406;
        if (i15 >= iArr7.length) {
            this.f9411 = true;
        }
        if (this.f9410 >= iArr7.length) {
            this.f9411 = true;
            this.f9410 = iArr7.length - 1;
        }
    }

    @Override // n.b.a
    /* renamed from: ʿ, reason: contains not printable characters */
    public int mo10305() {
        return this.f9401;
    }

    @Override // n.b.a
    /* renamed from: ˆ, reason: contains not printable characters */
    public final float mo10306(i iVar) {
        int i5 = this.f9409;
        for (int i6 = 0; i5 != -1 && i6 < this.f9401; i6++) {
            if (this.f9406[i5] == iVar.f9463) {
                return this.f9408[i5];
            }
            i5 = this.f9407[i5];
        }
        return 0.0f;
    }

    @Override // n.b.a
    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean mo10307(i iVar) {
        int i5 = this.f9409;
        if (i5 == -1) {
            return false;
        }
        for (int i6 = 0; i5 != -1 && i6 < this.f9401; i6++) {
            if (this.f9406[i5] == iVar.f9463) {
                return true;
            }
            i5 = this.f9407[i5];
        }
        return false;
    }

    @Override // n.b.a
    /* renamed from: ˉ, reason: contains not printable characters */
    public i mo10308(int i5) {
        int i6 = this.f9409;
        for (int i7 = 0; i6 != -1 && i7 < this.f9401; i7++) {
            if (i7 == i5) {
                return this.f9403.f9421[this.f9406[i6]];
            }
            i6 = this.f9407[i6];
        }
        return null;
    }

    @Override // n.b.a
    /* renamed from: ˊ, reason: contains not printable characters */
    public void mo10309(float f5) {
        int i5 = this.f9409;
        for (int i6 = 0; i5 != -1 && i6 < this.f9401; i6++) {
            float[] fArr = this.f9408;
            fArr[i5] = fArr[i5] / f5;
            i5 = this.f9407[i5];
        }
    }

    @Override // n.b.a
    /* renamed from: ˋ, reason: contains not printable characters */
    public final float mo10310(i iVar, boolean z5) {
        if (this.f9405 == iVar) {
            this.f9405 = null;
        }
        int i5 = this.f9409;
        if (i5 == -1) {
            return 0.0f;
        }
        int i6 = 0;
        int i7 = -1;
        while (i5 != -1 && i6 < this.f9401) {
            if (this.f9406[i5] == iVar.f9463) {
                if (i5 == this.f9409) {
                    this.f9409 = this.f9407[i5];
                } else {
                    int[] iArr = this.f9407;
                    iArr[i7] = iArr[i5];
                }
                if (z5) {
                    iVar.m10387(this.f9402);
                }
                iVar.f9473--;
                this.f9401--;
                this.f9406[i5] = -1;
                if (this.f9411) {
                    this.f9410 = i5;
                }
                return this.f9408[i5];
            }
            i6++;
            i7 = i5;
            i5 = this.f9407[i5];
        }
        return 0.0f;
    }

    @Override // n.b.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo10311() {
        int i5 = this.f9409;
        for (int i6 = 0; i5 != -1 && i6 < this.f9401; i6++) {
            float[] fArr = this.f9408;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f9407[i5];
        }
    }
}
