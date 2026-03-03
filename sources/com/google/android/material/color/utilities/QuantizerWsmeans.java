package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class QuantizerWsmeans {
    private static final int MAX_ITERATIONS = 10;
    private static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    private static final class a implements Comparable<a> {

        /* renamed from: ʾ, reason: contains not printable characters */
        int f5526 = -1;

        /* renamed from: ʿ, reason: contains not printable characters */
        double f5527 = -1.0d;

        a() {
        }

        @Override // java.lang.Comparable
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Double.valueOf(this.f5527).compareTo(Double.valueOf(aVar.f5527));
        }
    }

    private QuantizerWsmeans() {
    }

    public static Map<Integer, Integer> quantize(int[] iArr, int[] iArr2, int i5) {
        int[] iArr3;
        int i6;
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr4 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i7 = 0;
        for (int i8 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i8));
            if (num == null) {
                dArr[i7] = pointProviderLab.fromInt(i8);
                iArr4[i7] = i8;
                i7++;
                linkedHashMap.put(Integer.valueOf(i8), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i8), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr5 = new int[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            iArr5[i9] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr4[i9]))).intValue();
        }
        int min = Math.min(i5, i7);
        if (iArr2.length != 0) {
            min = Math.min(min, iArr2.length);
        }
        double[][] dArr2 = new double[min][];
        int i10 = 0;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            dArr2[i11] = pointProviderLab.fromInt(iArr2[i11]);
            i10++;
        }
        int i12 = min - i10;
        if (i12 > 0) {
            for (int i13 = 0; i13 < i12; i13++) {
            }
        }
        int[] iArr6 = new int[i7];
        for (int i14 = 0; i14 < i7; i14++) {
            iArr6[i14] = random.nextInt(min);
        }
        int[][] iArr7 = new int[min][];
        for (int i15 = 0; i15 < min; i15++) {
            iArr7[i15] = new int[min];
        }
        a[][] aVarArr = new a[min][];
        for (int i16 = 0; i16 < min; i16++) {
            aVarArr[i16] = new a[min];
            for (int i17 = 0; i17 < min; i17++) {
                aVarArr[i16][i17] = new a();
            }
        }
        int[] iArr8 = new int[min];
        int i18 = 0;
        while (true) {
            if (i18 >= 10) {
                iArr3 = iArr8;
                break;
            }
            int i19 = 0;
            while (i19 < min) {
                int i20 = i19 + 1;
                int i21 = i20;
                while (i21 < min) {
                    int[] iArr9 = iArr8;
                    double distance = pointProviderLab.distance(dArr2[i19], dArr2[i21]);
                    a aVar = aVarArr[i21][i19];
                    aVar.f5527 = distance;
                    aVar.f5526 = i19;
                    a aVar2 = aVarArr[i19][i21];
                    aVar2.f5527 = distance;
                    aVar2.f5526 = i21;
                    i21++;
                    iArr8 = iArr9;
                }
                int[] iArr10 = iArr8;
                Arrays.sort(aVarArr[i19]);
                for (int i22 = 0; i22 < min; i22++) {
                    iArr7[i19][i22] = aVarArr[i19][i22].f5526;
                }
                iArr8 = iArr10;
                i19 = i20;
            }
            int[] iArr11 = iArr8;
            int i23 = 0;
            int i24 = 0;
            while (i23 < i7) {
                double[] dArr3 = dArr[i23];
                int i25 = iArr6[i23];
                double distance2 = pointProviderLab.distance(dArr3, dArr2[i25]);
                int[][] iArr12 = iArr7;
                int[] iArr13 = iArr5;
                double d6 = distance2;
                int i26 = -1;
                int i27 = 0;
                while (i27 < min) {
                    a[][] aVarArr2 = aVarArr;
                    int i28 = i7;
                    if (aVarArr[i25][i27].f5527 < 4.0d * distance2) {
                        double distance3 = pointProviderLab.distance(dArr3, dArr2[i27]);
                        if (distance3 < d6) {
                            i26 = i27;
                            d6 = distance3;
                        }
                    }
                    i27++;
                    i7 = i28;
                    aVarArr = aVarArr2;
                }
                a[][] aVarArr3 = aVarArr;
                int i29 = i7;
                if (i26 != -1 && Math.abs(Math.sqrt(d6) - Math.sqrt(distance2)) > 3.0d) {
                    i24++;
                    iArr6[i23] = i26;
                }
                i23++;
                iArr7 = iArr12;
                iArr5 = iArr13;
                i7 = i29;
                aVarArr = aVarArr3;
            }
            int[] iArr14 = iArr5;
            int[][] iArr15 = iArr7;
            a[][] aVarArr4 = aVarArr;
            int i30 = i7;
            if (i24 == 0 && i18 != 0) {
                iArr3 = iArr11;
                break;
            }
            double[] dArr4 = new double[min];
            double[] dArr5 = new double[min];
            double[] dArr6 = new double[min];
            char c6 = 0;
            Arrays.fill(iArr11, 0);
            int i31 = 0;
            while (true) {
                i6 = i30;
                if (i31 >= i6) {
                    break;
                }
                int i32 = iArr6[i31];
                double[] dArr7 = dArr[i31];
                int i33 = iArr14[i31];
                iArr11[i32] = iArr11[i32] + i33;
                double d7 = dArr4[i32];
                double d8 = dArr7[c6];
                double d9 = i33;
                Double.isNaN(d9);
                dArr4[i32] = d7 + (d8 * d9);
                double d10 = dArr5[i32];
                double d11 = dArr7[1];
                Double.isNaN(d9);
                dArr5[i32] = d10 + (d11 * d9);
                double d12 = dArr6[i32];
                double d13 = dArr7[2];
                Double.isNaN(d9);
                dArr6[i32] = d12 + (d13 * d9);
                i31++;
                i18 = i18;
                i30 = i6;
                c6 = 0;
            }
            int i34 = i18;
            for (int i35 = 0; i35 < min; i35++) {
                int i36 = iArr11[i35];
                if (i36 == 0) {
                    dArr2[i35] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d14 = dArr4[i35];
                    double d15 = i36;
                    Double.isNaN(d15);
                    double d16 = d14 / d15;
                    double d17 = dArr5[i35];
                    Double.isNaN(d15);
                    double d18 = d17 / d15;
                    double d19 = dArr6[i35];
                    Double.isNaN(d15);
                    double d20 = d19 / d15;
                    double[] dArr8 = dArr2[i35];
                    dArr8[0] = d16;
                    dArr8[1] = d18;
                    dArr8[2] = d20;
                }
            }
            iArr7 = iArr15;
            i18 = i34 + 1;
            iArr8 = iArr11;
            i7 = i6;
            iArr5 = iArr14;
            aVarArr = aVarArr4;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i37 = 0; i37 < min; i37++) {
            int i38 = iArr3[i37];
            if (i38 != 0) {
                int i39 = pointProviderLab.toInt(dArr2[i37]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i39))) {
                    linkedHashMap2.put(Integer.valueOf(i39), Integer.valueOf(i38));
                }
            }
        }
        return linkedHashMap2;
    }
}
