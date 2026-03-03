package com.google.android.material.color.utilities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class QuantizerWu {
    private static final int INDEX_BITS = 5;
    private static final int INDEX_COUNT = 33;
    private static final int TOTAL_SIZE = 35937;
    b[] cubes;
    double[] moments;
    int[] momentsB;
    int[] momentsG;
    int[] momentsR;
    int[] weights;

    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f5528;

        static {
            int[] iArr = new int[d.values().length];
            f5528 = iArr;
            try {
                iArr[d.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5528[d.GREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5528[d.BLUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f5536;

        c(int i5, int i6) {
            this.f5536 = i6;
        }
    }

    private enum d {
        RED,
        GREEN,
        BLUE
    }

    private static final class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f5541;

        /* renamed from: ʼ, reason: contains not printable characters */
        double f5542;

        e(int i5, double d6) {
            this.f5541 = i5;
            this.f5542 = d6;
        }
    }

    static int bottom(b bVar, d dVar, int[] iArr) {
        int i5;
        int i6;
        int i7 = a.f5528[dVar.ordinal()];
        if (i7 == 1) {
            i5 = (-iArr[getIndex(bVar.f5529, bVar.f5532, bVar.f5534)]) + iArr[getIndex(bVar.f5529, bVar.f5532, bVar.f5533)] + iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5534)];
            i6 = iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5533)];
        } else if (i7 == 2) {
            i5 = (-iArr[getIndex(bVar.f5530, bVar.f5531, bVar.f5534)]) + iArr[getIndex(bVar.f5530, bVar.f5531, bVar.f5533)] + iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5534)];
            i6 = iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5533)];
        } else {
            if (i7 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i5 = (-iArr[getIndex(bVar.f5530, bVar.f5532, bVar.f5533)]) + iArr[getIndex(bVar.f5530, bVar.f5531, bVar.f5533)] + iArr[getIndex(bVar.f5529, bVar.f5532, bVar.f5533)];
            i6 = iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5533)];
        }
        return i5 - i6;
    }

    static int getIndex(int i5, int i6, int i7) {
        return (i5 << 10) + (i5 << 6) + i5 + (i6 << 5) + i6 + i7;
    }

    static int top(b bVar, d dVar, int i5, int[] iArr) {
        int i6;
        int i7;
        int i8 = a.f5528[dVar.ordinal()];
        if (i8 == 1) {
            i6 = (iArr[getIndex(i5, bVar.f5532, bVar.f5534)] - iArr[getIndex(i5, bVar.f5532, bVar.f5533)]) - iArr[getIndex(i5, bVar.f5531, bVar.f5534)];
            i7 = iArr[getIndex(i5, bVar.f5531, bVar.f5533)];
        } else if (i8 == 2) {
            i6 = (iArr[getIndex(bVar.f5530, i5, bVar.f5534)] - iArr[getIndex(bVar.f5530, i5, bVar.f5533)]) - iArr[getIndex(bVar.f5529, i5, bVar.f5534)];
            i7 = iArr[getIndex(bVar.f5529, i5, bVar.f5533)];
        } else {
            if (i8 != 3) {
                throw new IllegalArgumentException("unexpected direction " + dVar);
            }
            i6 = (iArr[getIndex(bVar.f5530, bVar.f5532, i5)] - iArr[getIndex(bVar.f5530, bVar.f5531, i5)]) - iArr[getIndex(bVar.f5529, bVar.f5532, i5)];
            i7 = iArr[getIndex(bVar.f5529, bVar.f5531, i5)];
        }
        return i6 + i7;
    }

    static int volume(b bVar, int[] iArr) {
        return ((((((iArr[getIndex(bVar.f5530, bVar.f5532, bVar.f5534)] - iArr[getIndex(bVar.f5530, bVar.f5532, bVar.f5533)]) - iArr[getIndex(bVar.f5530, bVar.f5531, bVar.f5534)]) + iArr[getIndex(bVar.f5530, bVar.f5531, bVar.f5533)]) - iArr[getIndex(bVar.f5529, bVar.f5532, bVar.f5534)]) + iArr[getIndex(bVar.f5529, bVar.f5532, bVar.f5533)]) + iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5534)]) - iArr[getIndex(bVar.f5529, bVar.f5531, bVar.f5533)];
    }

    void constructHistogram(Map<Integer, Integer> map) {
        this.weights = new int[TOTAL_SIZE];
        this.momentsR = new int[TOTAL_SIZE];
        this.momentsG = new int[TOTAL_SIZE];
        this.momentsB = new int[TOTAL_SIZE];
        this.moments = new double[TOTAL_SIZE];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            int redFromArgb = ColorUtils.redFromArgb(intValue);
            int greenFromArgb = ColorUtils.greenFromArgb(intValue);
            int blueFromArgb = ColorUtils.blueFromArgb(intValue);
            int index = getIndex((redFromArgb >> 3) + 1, (greenFromArgb >> 3) + 1, (blueFromArgb >> 3) + 1);
            int[] iArr = this.weights;
            iArr[index] = iArr[index] + intValue2;
            int[] iArr2 = this.momentsR;
            iArr2[index] = iArr2[index] + (redFromArgb * intValue2);
            int[] iArr3 = this.momentsG;
            iArr3[index] = iArr3[index] + (greenFromArgb * intValue2);
            int[] iArr4 = this.momentsB;
            iArr4[index] = iArr4[index] + (blueFromArgb * intValue2);
            double[] dArr = this.moments;
            double d6 = dArr[index];
            double d7 = intValue2 * ((redFromArgb * redFromArgb) + (greenFromArgb * greenFromArgb) + (blueFromArgb * blueFromArgb));
            Double.isNaN(d7);
            dArr[index] = d6 + d7;
        }
    }

    c createBoxes(int i5) {
        int i6;
        this.cubes = new b[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            this.cubes[i7] = new b(null);
        }
        double[] dArr = new double[i5];
        b bVar = this.cubes[0];
        bVar.f5530 = 32;
        bVar.f5532 = 32;
        bVar.f5534 = 32;
        int i8 = 1;
        int i9 = 0;
        while (true) {
            if (i8 >= i5) {
                i6 = i5;
                break;
            }
            b[] bVarArr = this.cubes;
            if (cut(bVarArr[i9], bVarArr[i8]).booleanValue()) {
                b bVar2 = this.cubes[i9];
                dArr[i9] = bVar2.f5535 > 1 ? variance(bVar2) : 0.0d;
                b bVar3 = this.cubes[i8];
                dArr[i8] = bVar3.f5535 > 1 ? variance(bVar3) : 0.0d;
            } else {
                dArr[i9] = 0.0d;
                i8--;
            }
            double d6 = dArr[0];
            int i10 = 0;
            for (int i11 = 1; i11 <= i8; i11++) {
                double d7 = dArr[i11];
                if (d7 > d6) {
                    i10 = i11;
                    d6 = d7;
                }
            }
            if (d6 <= 0.0d) {
                i6 = i8 + 1;
                break;
            }
            i8++;
            i9 = i10;
        }
        return new c(i5, i6);
    }

    void createMoments() {
        int i5 = 1;
        while (true) {
            int i6 = 33;
            if (i5 >= 33) {
                return;
            }
            int[] iArr = new int[33];
            int[] iArr2 = new int[33];
            int[] iArr3 = new int[33];
            int[] iArr4 = new int[33];
            double[] dArr = new double[33];
            int i7 = 1;
            while (i7 < i6) {
                int i8 = 0;
                double d6 = 0.0d;
                int i9 = 1;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i9 < i6) {
                    int index = getIndex(i5, i7, i9);
                    int i13 = i8 + this.weights[index];
                    i10 += this.momentsR[index];
                    i11 += this.momentsG[index];
                    i12 += this.momentsB[index];
                    d6 += this.moments[index];
                    iArr[i9] = iArr[i9] + i13;
                    iArr2[i9] = iArr2[i9] + i10;
                    iArr3[i9] = iArr3[i9] + i11;
                    iArr4[i9] = iArr4[i9] + i12;
                    dArr[i9] = dArr[i9] + d6;
                    int index2 = getIndex(i5 - 1, i7, i9);
                    int[] iArr5 = this.weights;
                    iArr5[index] = iArr5[index2] + iArr[i9];
                    int[] iArr6 = this.momentsR;
                    iArr6[index] = iArr6[index2] + iArr2[i9];
                    int[] iArr7 = this.momentsG;
                    iArr7[index] = iArr7[index2] + iArr3[i9];
                    int[] iArr8 = this.momentsB;
                    iArr8[index] = iArr8[index2] + iArr4[i9];
                    double[] dArr2 = this.moments;
                    dArr2[index] = dArr2[index2] + dArr[i9];
                    i9++;
                    i8 = i13;
                    i6 = 33;
                }
                i7++;
                i6 = 33;
            }
            i5++;
        }
    }

    List<Integer> createResult(int i5) {
        ArrayList arrayList = new ArrayList();
        for (int i6 = 0; i6 < i5; i6++) {
            b bVar = this.cubes[i6];
            int volume = volume(bVar, this.weights);
            if (volume > 0) {
                int volume2 = volume(bVar, this.momentsR) / volume;
                int volume3 = volume(bVar, this.momentsG) / volume;
                arrayList.add(Integer.valueOf(((volume(bVar, this.momentsB) / volume) & 255) | ((volume2 & 255) << 16) | (-16777216) | ((volume3 & 255) << 8)));
            }
        }
        return arrayList;
    }

    Boolean cut(b bVar, b bVar2) {
        int volume = volume(bVar, this.momentsR);
        int volume2 = volume(bVar, this.momentsG);
        int volume3 = volume(bVar, this.momentsB);
        int volume4 = volume(bVar, this.weights);
        d dVar = d.RED;
        e maximize = maximize(bVar, dVar, bVar.f5529 + 1, bVar.f5530, volume, volume2, volume3, volume4);
        d dVar2 = d.GREEN;
        e maximize2 = maximize(bVar, dVar2, bVar.f5531 + 1, bVar.f5532, volume, volume2, volume3, volume4);
        d dVar3 = d.BLUE;
        e maximize3 = maximize(bVar, dVar3, bVar.f5533 + 1, bVar.f5534, volume, volume2, volume3, volume4);
        double d6 = maximize.f5542;
        double d7 = maximize2.f5542;
        double d8 = maximize3.f5542;
        if (d6 < d7 || d6 < d8) {
            dVar = (d7 < d6 || d7 < d8) ? dVar3 : dVar2;
        } else if (maximize.f5541 < 0) {
            return Boolean.FALSE;
        }
        bVar2.f5530 = bVar.f5530;
        bVar2.f5532 = bVar.f5532;
        bVar2.f5534 = bVar.f5534;
        int i5 = a.f5528[dVar.ordinal()];
        if (i5 == 1) {
            int i6 = maximize.f5541;
            bVar.f5530 = i6;
            bVar2.f5529 = i6;
            bVar2.f5531 = bVar.f5531;
            bVar2.f5533 = bVar.f5533;
        } else if (i5 == 2) {
            int i7 = maximize2.f5541;
            bVar.f5532 = i7;
            bVar2.f5529 = bVar.f5529;
            bVar2.f5531 = i7;
            bVar2.f5533 = bVar.f5533;
        } else if (i5 == 3) {
            int i8 = maximize3.f5541;
            bVar.f5534 = i8;
            bVar2.f5529 = bVar.f5529;
            bVar2.f5531 = bVar.f5531;
            bVar2.f5533 = i8;
        }
        bVar.f5535 = (bVar.f5530 - bVar.f5529) * (bVar.f5532 - bVar.f5531) * (bVar.f5534 - bVar.f5533);
        bVar2.f5535 = (bVar2.f5530 - bVar2.f5529) * (bVar2.f5532 - bVar2.f5531) * (bVar2.f5534 - bVar2.f5533);
        return Boolean.TRUE;
    }

    e maximize(b bVar, d dVar, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11;
        QuantizerWu quantizerWu = this;
        b bVar2 = bVar;
        d dVar2 = dVar;
        int bottom = bottom(bVar2, dVar2, quantizerWu.momentsR);
        int bottom2 = bottom(bVar2, dVar2, quantizerWu.momentsG);
        int bottom3 = bottom(bVar2, dVar2, quantizerWu.momentsB);
        int bottom4 = bottom(bVar2, dVar2, quantizerWu.weights);
        double d6 = 0.0d;
        int i12 = -1;
        int i13 = i5;
        while (i13 < i6) {
            int pVar = top(bVar2, dVar2, i13, quantizerWu.momentsR) + bottom;
            int pVar2 = top(bVar2, dVar2, i13, quantizerWu.momentsG) + bottom2;
            int pVar3 = top(bVar2, dVar2, i13, quantizerWu.momentsB) + bottom3;
            int pVar4 = top(bVar2, dVar2, i13, quantizerWu.weights) + bottom4;
            if (pVar4 == 0) {
                i11 = bottom;
            } else {
                double d7 = (pVar * pVar) + (pVar2 * pVar2) + (pVar3 * pVar3);
                i11 = bottom;
                double d8 = pVar4;
                Double.isNaN(d7);
                Double.isNaN(d8);
                double d9 = d7 / d8;
                int i14 = i7 - pVar;
                int i15 = i8 - pVar2;
                int i16 = i9 - pVar3;
                int i17 = i10 - pVar4;
                if (i17 != 0) {
                    double d10 = (i14 * i14) + (i15 * i15) + (i16 * i16);
                    double d11 = i17;
                    Double.isNaN(d10);
                    Double.isNaN(d11);
                    double d12 = d9 + (d10 / d11);
                    if (d12 > d6) {
                        d6 = d12;
                        i12 = i13;
                    }
                }
            }
            i13++;
            quantizerWu = this;
            bVar2 = bVar;
            dVar2 = dVar;
            bottom = i11;
        }
        return new e(i12, d6);
    }

    public QuantizerResult quantize(int[] iArr, int i5) {
        constructHistogram(new QuantizerMap().quantize(iArr, i5).colorToCount);
        createMoments();
        List<Integer> createResult = createResult(createBoxes(i5).f5536);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = createResult.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(Integer.valueOf(it.next().intValue()), 0);
        }
        return new QuantizerResult(linkedHashMap);
    }

    double variance(b bVar) {
        int volume = volume(bVar, this.momentsR);
        int volume2 = volume(bVar, this.momentsG);
        int volume3 = volume(bVar, this.momentsB);
        double d6 = ((((((this.moments[getIndex(bVar.f5530, bVar.f5532, bVar.f5534)] - this.moments[getIndex(bVar.f5530, bVar.f5532, bVar.f5533)]) - this.moments[getIndex(bVar.f5530, bVar.f5531, bVar.f5534)]) + this.moments[getIndex(bVar.f5530, bVar.f5531, bVar.f5533)]) - this.moments[getIndex(bVar.f5529, bVar.f5532, bVar.f5534)]) + this.moments[getIndex(bVar.f5529, bVar.f5532, bVar.f5533)]) + this.moments[getIndex(bVar.f5529, bVar.f5531, bVar.f5534)]) - this.moments[getIndex(bVar.f5529, bVar.f5531, bVar.f5533)];
        double d7 = (volume * volume) + (volume2 * volume2) + (volume3 * volume3);
        double volume4 = volume(bVar, this.weights);
        Double.isNaN(d7);
        Double.isNaN(volume4);
        return d6 - (d7 / volume4);
    }

    private static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f5529;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f5530;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f5531;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f5532;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f5533;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f5534;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f5535;

        private b() {
            this.f5529 = 0;
            this.f5530 = 0;
            this.f5531 = 0;
            this.f5532 = 0;
            this.f5533 = 0;
            this.f5534 = 0;
            this.f5535 = 0;
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }
}
