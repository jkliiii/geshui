package o;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: KeyCycleOscillator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private a f10041;

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f10042;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f10043 = 0;

    /* renamed from: ʾ, reason: contains not printable characters */
    private String f10044 = null;

    /* renamed from: ʿ, reason: contains not printable characters */
    public int f10045 = 0;

    /* renamed from: ˆ, reason: contains not printable characters */
    ArrayList<b> f10046 = new ArrayList<>();

    /* compiled from: KeyCycleOscillator.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public double m10970(float f5) {
            throw null;
        }
    }

    /* compiled from: KeyCycleOscillator.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f10047;

        /* renamed from: ʼ, reason: contains not printable characters */
        float f10048;
    }

    public String toString() {
        String str = this.f10042;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<b> it = this.f10046.iterator();
        while (it.hasNext()) {
            str = str + "[" + it.next().f10047 + " , " + decimalFormat.format(r3.f10048) + "] ";
        }
        return str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public float m10969(float f5) {
        return (float) this.f10041.m10970(f5);
    }
}
