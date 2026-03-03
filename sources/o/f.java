package o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* compiled from: TimeCycleSplineSet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected a f10054;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected int f10058;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected String f10059;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected long f10062;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected int f10055 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    protected int[] f10056 = new int[10];

    /* renamed from: ʾ, reason: contains not printable characters */
    protected float[][] f10057 = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* renamed from: ˈ, reason: contains not printable characters */
    protected float[] f10060 = new float[3];

    /* renamed from: ˉ, reason: contains not printable characters */
    protected boolean f10061 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected float f10063 = Float.NaN;

    public String toString() {
        String str = this.f10059;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i5 = 0; i5 < this.f10058; i5++) {
            str = str + "[" + this.f10056[i5] + " , " + decimalFormat.format(this.f10057[i5]) + "] ";
        }
        return str;
    }
}
