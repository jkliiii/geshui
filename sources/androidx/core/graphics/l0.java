package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PathParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l0 {

    /* compiled from: PathParser.java */
    private static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f2703;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f2704;

        a() {
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static void m2301(ArrayList<b> arrayList, char c6, float[] fArr) {
        arrayList.add(new b(c6, fArr));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m2302(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            b bVar = bVarArr[i5];
            char c6 = bVar.f2705;
            b bVar2 = bVarArr2[i5];
            if (c6 != bVar2.f2705 || bVar.f2706.length != bVar2.f2706.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static float[] m2303(float[] fArr, int i5, int i6) {
        if (i5 > i6) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i5 < 0 || i5 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i7 = i6 - i5;
        int min = Math.min(i7, length - i5);
        float[] fArr2 = new float[i7];
        System.arraycopy(fArr, i5, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static b[] m2304(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 1;
        int i6 = 0;
        while (i5 < str.length()) {
            int m2309 = m2309(str, i5);
            String trim = str.substring(i6, m2309).trim();
            if (trim.length() > 0) {
                m2301(arrayList, trim.charAt(0), m2308(trim));
            }
            i6 = m2309;
            i5 = m2309 + 1;
        }
        if (i5 - i6 == 1 && i6 < str.length()) {
            m2301(arrayList, str.charAt(i6), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[arrayList.size()]);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static Path m2305(String str) {
        Path path = new Path();
        b[] m2304 = m2304(str);
        if (m2304 == null) {
            return null;
        }
        try {
            b.m2314(m2304, path);
            return path;
        } catch (RuntimeException e5) {
            throw new RuntimeException("Error in parsing " + str, e5);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static b[] m2306(b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            bVarArr2[i5] = new b(bVarArr[i5]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[LOOP:0: B:2:0x0007->B:14:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* renamed from: ˈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m2307(java.lang.String r8, int r9, androidx.core.graphics.l0.a r10) {
        /*
            r0 = 0
            r10.f2704 = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L37
        L27:
            r10.f2704 = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f2704 = r7
            goto L35
        L31:
            r2 = 0
            goto L37
        L33:
            r2 = 1
            goto L37
        L35:
            r2 = 0
            r4 = 1
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f2703 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.l0.m2307(java.lang.String, int, androidx.core.graphics.l0$a):void");
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static float[] m2308(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i5 = 1;
            int i6 = 0;
            while (i5 < length) {
                m2307(str, i5, aVar);
                int i7 = aVar.f2703;
                if (i5 < i7) {
                    fArr[i6] = Float.parseFloat(str.substring(i5, i7));
                    i6++;
                }
                i5 = aVar.f2704 ? i7 : i7 + 1;
            }
            return m2303(fArr, 0, i6);
        } catch (NumberFormatException e5) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e5);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static int m2309(String str, int i5) {
        while (i5 < str.length()) {
            char charAt = str.charAt(i5);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i5;
            }
            i5++;
        }
        return i5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m2310(b[] bVarArr, b[] bVarArr2) {
        for (int i5 = 0; i5 < bVarArr2.length; i5++) {
            bVarArr[i5].f2705 = bVarArr2[i5].f2705;
            int i6 = 0;
            while (true) {
                float[] fArr = bVarArr2[i5].f2706;
                if (i6 < fArr.length) {
                    bVarArr[i5].f2706[i6] = fArr[i6];
                    i6++;
                }
            }
        }
    }

    /* compiled from: PathParser.java */
    public static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        public char f2705;

        /* renamed from: ʼ, reason: contains not printable characters */
        public float[] f2706;

        b(char c6, float[] fArr) {
            this.f2705 = c6;
            this.f2706 = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: ʻ, reason: contains not printable characters */
        private static void m2311(Path path, float[] fArr, char c6, char c7, float[] fArr2) {
            int i5;
            int i6;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            char c8 = c7;
            float f13 = fArr[0];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i5 = 7;
                    break;
                case 'C':
                case 'c':
                    i5 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i5 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                    i5 = 2;
                    break;
            }
            float f19 = f13;
            float f20 = f14;
            float f21 = f17;
            float f22 = f18;
            int i7 = 0;
            char c9 = c6;
            while (i7 < fArr2.length) {
                if (c8 != 'A') {
                    if (c8 == 'C') {
                        i6 = i7;
                        int i8 = i6 + 2;
                        int i9 = i6 + 3;
                        int i10 = i6 + 4;
                        int i11 = i6 + 5;
                        path.cubicTo(fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                        f19 = fArr2[i10];
                        float f23 = fArr2[i11];
                        float f24 = fArr2[i8];
                        float f25 = fArr2[i9];
                        f20 = f23;
                        f16 = f25;
                        f15 = f24;
                    } else if (c8 == 'H') {
                        i6 = i7;
                        int i12 = i6 + 0;
                        path.lineTo(fArr2[i12], f20);
                        f19 = fArr2[i12];
                    } else if (c8 == 'Q') {
                        i6 = i7;
                        int i13 = i6 + 0;
                        int i14 = i6 + 1;
                        int i15 = i6 + 2;
                        int i16 = i6 + 3;
                        path.quadTo(fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f26 = fArr2[i13];
                        float f27 = fArr2[i14];
                        f19 = fArr2[i15];
                        f20 = fArr2[i16];
                        f15 = f26;
                        f16 = f27;
                    } else if (c8 == 'V') {
                        i6 = i7;
                        int i17 = i6 + 0;
                        path.lineTo(f19, fArr2[i17]);
                        f20 = fArr2[i17];
                    } else if (c8 != 'a') {
                        if (c8 != 'c') {
                            if (c8 == 'h') {
                                int i18 = i7 + 0;
                                path.rLineTo(fArr2[i18], 0.0f);
                                f19 += fArr2[i18];
                            } else if (c8 != 'q') {
                                if (c8 == 'v') {
                                    int i19 = i7 + 0;
                                    path.rLineTo(0.0f, fArr2[i19]);
                                    f8 = fArr2[i19];
                                } else if (c8 == 'L') {
                                    int i20 = i7 + 0;
                                    int i21 = i7 + 1;
                                    path.lineTo(fArr2[i20], fArr2[i21]);
                                    f19 = fArr2[i20];
                                    f20 = fArr2[i21];
                                } else if (c8 == 'M') {
                                    f19 = fArr2[i7 + 0];
                                    f20 = fArr2[i7 + 1];
                                    if (i7 > 0) {
                                        path.lineTo(f19, f20);
                                    } else {
                                        path.moveTo(f19, f20);
                                        i6 = i7;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c8 == 'S') {
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    float f28 = f20;
                                    int i22 = i7 + 0;
                                    int i23 = i7 + 1;
                                    int i24 = i7 + 2;
                                    int i25 = i7 + 3;
                                    path.cubicTo(f19, f28, fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                    f5 = fArr2[i22];
                                    f6 = fArr2[i23];
                                    f19 = fArr2[i24];
                                    f20 = fArr2[i25];
                                    f15 = f5;
                                    f16 = f6;
                                } else if (c8 == 'T') {
                                    if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                        f19 = (f19 * 2.0f) - f15;
                                        f20 = (f20 * 2.0f) - f16;
                                    }
                                    int i26 = i7 + 0;
                                    int i27 = i7 + 1;
                                    path.quadTo(f19, f20, fArr2[i26], fArr2[i27]);
                                    float f29 = fArr2[i26];
                                    float f30 = fArr2[i27];
                                    i6 = i7;
                                    f16 = f20;
                                    f15 = f19;
                                    f19 = f29;
                                    f20 = f30;
                                } else if (c8 == 'l') {
                                    int i28 = i7 + 0;
                                    int i29 = i7 + 1;
                                    path.rLineTo(fArr2[i28], fArr2[i29]);
                                    f19 += fArr2[i28];
                                    f8 = fArr2[i29];
                                } else if (c8 == 'm') {
                                    float f31 = fArr2[i7 + 0];
                                    f19 += f31;
                                    float f32 = fArr2[i7 + 1];
                                    f20 += f32;
                                    if (i7 > 0) {
                                        path.rLineTo(f31, f32);
                                    } else {
                                        path.rMoveTo(f31, f32);
                                        i6 = i7;
                                        f22 = f20;
                                        f21 = f19;
                                    }
                                } else if (c8 == 's') {
                                    if (c9 == 'c' || c9 == 's' || c9 == 'C' || c9 == 'S') {
                                        float f33 = f19 - f15;
                                        f9 = f20 - f16;
                                        f10 = f33;
                                    } else {
                                        f10 = 0.0f;
                                        f9 = 0.0f;
                                    }
                                    int i30 = i7 + 0;
                                    int i31 = i7 + 1;
                                    int i32 = i7 + 2;
                                    int i33 = i7 + 3;
                                    path.rCubicTo(f10, f9, fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f5 = fArr2[i30] + f19;
                                    f6 = fArr2[i31] + f20;
                                    f19 += fArr2[i32];
                                    f7 = fArr2[i33];
                                } else if (c8 == 't') {
                                    if (c9 == 'q' || c9 == 't' || c9 == 'Q' || c9 == 'T') {
                                        f11 = f19 - f15;
                                        f12 = f20 - f16;
                                    } else {
                                        f12 = 0.0f;
                                        f11 = 0.0f;
                                    }
                                    int i34 = i7 + 0;
                                    int i35 = i7 + 1;
                                    path.rQuadTo(f11, f12, fArr2[i34], fArr2[i35]);
                                    float f34 = f11 + f19;
                                    float f35 = f12 + f20;
                                    f19 += fArr2[i34];
                                    f20 += fArr2[i35];
                                    f16 = f35;
                                    f15 = f34;
                                }
                                f20 += f8;
                            } else {
                                int i36 = i7 + 0;
                                int i37 = i7 + 1;
                                int i38 = i7 + 2;
                                int i39 = i7 + 3;
                                path.rQuadTo(fArr2[i36], fArr2[i37], fArr2[i38], fArr2[i39]);
                                f5 = fArr2[i36] + f19;
                                f6 = fArr2[i37] + f20;
                                f19 += fArr2[i38];
                                f7 = fArr2[i39];
                            }
                            i6 = i7;
                        } else {
                            int i40 = i7 + 2;
                            int i41 = i7 + 3;
                            int i42 = i7 + 4;
                            int i43 = i7 + 5;
                            path.rCubicTo(fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                            f5 = fArr2[i40] + f19;
                            f6 = fArr2[i41] + f20;
                            f19 += fArr2[i42];
                            f7 = fArr2[i43];
                        }
                        f20 += f7;
                        f15 = f5;
                        f16 = f6;
                        i6 = i7;
                    } else {
                        int i44 = i7 + 5;
                        int i45 = i7 + 6;
                        i6 = i7;
                        m2313(path, f19, f20, fArr2[i44] + f19, fArr2[i45] + f20, fArr2[i7 + 0], fArr2[i7 + 1], fArr2[i7 + 2], fArr2[i7 + 3] != 0.0f, fArr2[i7 + 4] != 0.0f);
                        f19 += fArr2[i44];
                        f20 += fArr2[i45];
                    }
                    i7 = i6 + i5;
                    c9 = c7;
                    c8 = c9;
                } else {
                    i6 = i7;
                    int i46 = i6 + 5;
                    int i47 = i6 + 6;
                    m2313(path, f19, f20, fArr2[i46], fArr2[i47], fArr2[i6 + 0], fArr2[i6 + 1], fArr2[i6 + 2], fArr2[i6 + 3] != 0.0f, fArr2[i6 + 4] != 0.0f);
                    f19 = fArr2[i46];
                    f20 = fArr2[i47];
                }
                f16 = f20;
                f15 = f19;
                i7 = i6 + i5;
                c9 = c7;
                c8 = c9;
            }
            fArr[0] = f19;
            fArr[1] = f20;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f21;
            fArr[5] = f22;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private static void m2312(Path path, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
            double d15 = d8;
            int ceil = (int) Math.ceil(Math.abs((d14 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d12);
            double sin = Math.sin(d12);
            double cos2 = Math.cos(d13);
            double sin2 = Math.sin(d13);
            double d16 = -d15;
            double d17 = d16 * cos;
            double d18 = d9 * sin;
            double d19 = (d17 * sin2) - (d18 * cos2);
            double d20 = d16 * sin;
            double d21 = d9 * cos;
            double d22 = (sin2 * d20) + (cos2 * d21);
            double d23 = ceil;
            Double.isNaN(d23);
            double d24 = d14 / d23;
            double d25 = d13;
            double d26 = d22;
            double d27 = d19;
            int i5 = 0;
            double d28 = d10;
            double d29 = d11;
            while (i5 < ceil) {
                double d30 = d25 + d24;
                double sin3 = Math.sin(d30);
                double cos3 = Math.cos(d30);
                double d31 = (d6 + ((d15 * cos) * cos3)) - (d18 * sin3);
                double d32 = d7 + (d15 * sin * cos3) + (d21 * sin3);
                double d33 = (d17 * sin3) - (d18 * cos3);
                double d34 = (sin3 * d20) + (cos3 * d21);
                double d35 = d30 - d25;
                double tan = Math.tan(d35 / 2.0d);
                double sin4 = (Math.sin(d35) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d36 = d28 + (d27 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d36, (float) (d29 + (d26 * sin4)), (float) (d31 - (sin4 * d33)), (float) (d32 - (sin4 * d34)), (float) d31, (float) d32);
                i5++;
                d24 = d24;
                sin = sin;
                d28 = d31;
                d20 = d20;
                cos = cos;
                d25 = d30;
                d26 = d34;
                d27 = d33;
                ceil = ceil;
                d29 = d32;
                d15 = d8;
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private static void m2313(Path path, float f5, float f6, float f7, float f8, float f9, float f10, float f11, boolean z5, boolean z6) {
            double d6;
            double d7;
            double radians = Math.toRadians(f11);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d8 = f5;
            Double.isNaN(d8);
            double d9 = d8 * cos;
            double d10 = f6;
            Double.isNaN(d10);
            double d11 = f9;
            Double.isNaN(d11);
            double d12 = (d9 + (d10 * sin)) / d11;
            double d13 = -f5;
            Double.isNaN(d13);
            Double.isNaN(d10);
            double d14 = (d13 * sin) + (d10 * cos);
            double d15 = f10;
            Double.isNaN(d15);
            double d16 = d14 / d15;
            double d17 = f7;
            Double.isNaN(d17);
            double d18 = f8;
            Double.isNaN(d18);
            Double.isNaN(d11);
            double d19 = ((d17 * cos) + (d18 * sin)) / d11;
            double d20 = -f7;
            Double.isNaN(d20);
            Double.isNaN(d18);
            Double.isNaN(d15);
            double d21 = ((d20 * sin) + (d18 * cos)) / d15;
            double d22 = d12 - d19;
            double d23 = d16 - d21;
            double d24 = (d12 + d19) / 2.0d;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d22 * d22) + (d23 * d23);
            if (d26 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d27 = (1.0d / d26) - 0.25d;
            if (d27 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d26);
                float sqrt = (float) (Math.sqrt(d26) / 1.99999d);
                m2313(path, f5, f6, f7, f8, f9 * sqrt, f10 * sqrt, f11, z5, z6);
                return;
            }
            double sqrt2 = Math.sqrt(d27);
            double d28 = d22 * sqrt2;
            double d29 = sqrt2 * d23;
            if (z5 == z6) {
                d6 = d24 - d29;
                d7 = d25 + d28;
            } else {
                d6 = d24 + d29;
                d7 = d25 - d28;
            }
            double atan2 = Math.atan2(d16 - d7, d12 - d6);
            double atan22 = Math.atan2(d21 - d7, d19 - d6) - atan2;
            if (z6 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d11);
            double d30 = d6 * d11;
            Double.isNaN(d15);
            double d31 = d7 * d15;
            m2312(path, (d30 * cos) - (d31 * sin), (d30 * sin) + (d31 * cos), d11, d15, d8, d10, radians, atan2, atan22);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public static void m2314(b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c6 = 'm';
            for (int i5 = 0; i5 < bVarArr.length; i5++) {
                b bVar = bVarArr[i5];
                m2311(path, fArr, c6, bVar.f2705, bVar.f2706);
                c6 = bVarArr[i5].f2705;
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public void m2315(b bVar, b bVar2, float f5) {
            this.f2705 = bVar.f2705;
            int i5 = 0;
            while (true) {
                float[] fArr = bVar.f2706;
                if (i5 >= fArr.length) {
                    return;
                }
                this.f2706[i5] = (fArr[i5] * (1.0f - f5)) + (bVar2.f2706[i5] * f5);
                i5++;
            }
        }

        b(b bVar) {
            this.f2705 = bVar.f2705;
            float[] fArr = bVar.f2706;
            this.f2706 = l0.m2303(fArr, 0, fArr.length);
        }
    }
}
