package n;

import java.util.Arrays;
import java.util.HashSet;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: SolverVariable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i implements Comparable<i> {

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static int f9460 = 1;

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean f9461;

    /* renamed from: ʿ, reason: contains not printable characters */
    private String f9462;

    /* renamed from: ˊ, reason: contains not printable characters */
    public float f9466;

    /* renamed from: ˑ, reason: contains not printable characters */
    a f9470;

    /* renamed from: ˆ, reason: contains not printable characters */
    public int f9463 = -1;

    /* renamed from: ˈ, reason: contains not printable characters */
    int f9464 = -1;

    /* renamed from: ˉ, reason: contains not printable characters */
    public int f9465 = 0;

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean f9467 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    float[] f9468 = new float[9];

    /* renamed from: ˏ, reason: contains not printable characters */
    float[] f9469 = new float[9];

    /* renamed from: י, reason: contains not printable characters */
    b[] f9471 = new b[16];

    /* renamed from: ـ, reason: contains not printable characters */
    int f9472 = 0;

    /* renamed from: ٴ, reason: contains not printable characters */
    public int f9473 = 0;

    /* renamed from: ᐧ, reason: contains not printable characters */
    boolean f9474 = false;

    /* renamed from: ᴵ, reason: contains not printable characters */
    int f9475 = -1;

    /* renamed from: ᵎ, reason: contains not printable characters */
    float f9476 = 0.0f;

    /* renamed from: ᵔ, reason: contains not printable characters */
    HashSet<b> f9477 = null;

    /* compiled from: SolverVariable.java */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f9470 = aVar;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m10384() {
        f9460++;
    }

    public String toString() {
        if (this.f9462 != null) {
            return BuildConfig.FLAVOR + this.f9462;
        }
        return BuildConfig.FLAVOR + this.f9463;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m10385(b bVar) {
        int i5 = 0;
        while (true) {
            int i6 = this.f9472;
            if (i5 >= i6) {
                b[] bVarArr = this.f9471;
                if (i6 >= bVarArr.length) {
                    this.f9471 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f9471;
                int i7 = this.f9472;
                bVarArr2[i7] = bVar;
                this.f9472 = i7 + 1;
                return;
            }
            if (this.f9471[i5] == bVar) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f9463 - iVar.f9463;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final void m10387(b bVar) {
        int i5 = this.f9472;
        int i6 = 0;
        while (i6 < i5) {
            if (this.f9471[i6] == bVar) {
                while (i6 < i5 - 1) {
                    b[] bVarArr = this.f9471;
                    int i7 = i6 + 1;
                    bVarArr[i6] = bVarArr[i7];
                    i6 = i7;
                }
                this.f9472--;
                return;
            }
            i6++;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m10388() {
        this.f9462 = null;
        this.f9470 = a.UNKNOWN;
        this.f9465 = 0;
        this.f9463 = -1;
        this.f9464 = -1;
        this.f9466 = 0.0f;
        this.f9467 = false;
        this.f9474 = false;
        this.f9475 = -1;
        this.f9476 = 0.0f;
        int i5 = this.f9472;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f9471[i6] = null;
        }
        this.f9472 = 0;
        this.f9473 = 0;
        this.f9461 = false;
        Arrays.fill(this.f9469, 0.0f);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m10389(d dVar, float f5) {
        this.f9466 = f5;
        this.f9467 = true;
        this.f9474 = false;
        this.f9475 = -1;
        this.f9476 = 0.0f;
        int i5 = this.f9472;
        this.f9464 = -1;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f9471[i6].m10333(dVar, this, false);
        }
        this.f9472 = 0;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m10390(a aVar, String str) {
        this.f9470 = aVar;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final void m10391(d dVar, b bVar) {
        int i5 = this.f9472;
        for (int i6 = 0; i6 < i5; i6++) {
            this.f9471[i6].mo10335(dVar, bVar, false);
        }
        this.f9472 = 0;
    }
}
