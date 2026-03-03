package o;

import java.text.DecimalFormat;

/* compiled from: SplineSet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected a f10049;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected int[] f10050 = new int[10];

    /* renamed from: ʽ, reason: contains not printable characters */
    protected float[] f10051 = new float[10];

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f10052;

    /* renamed from: ʿ, reason: contains not printable characters */
    private String f10053;

    public String toString() {
        String str = this.f10053;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i5 = 0; i5 < this.f10052; i5++) {
            str = str + "[" + this.f10050[i5] + " , " + decimalFormat.format(this.f10051[i5]) + "] ";
        }
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public float m10971(float f5) {
        return (float) this.f10049.m10963(f5, 0);
    }
}
