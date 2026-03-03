package s;

import android.view.View;
import o.f;

/* compiled from: ViewTimeCycle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d extends f {

    /* compiled from: ViewTimeCycle.java */
    public static class a extends d {
        @Override // s.d
        /* renamed from: ʼ */
        public boolean mo11700(View view, float f5, long j5, o.c cVar) {
            return this.f10061;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean m11701(View view, o.c cVar, float f5, long j5, double d6, double d7) {
            view.setRotation(m11699(f5, j5, view, cVar) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
            return this.f10061;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public float m11699(float f5, long j5, View view, o.c cVar) {
        this.f10054.m10965(f5, this.f10060);
        float[] fArr = this.f10060;
        float f6 = fArr[1];
        if (f6 == 0.0f) {
            this.f10061 = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f10063)) {
            throw null;
        }
        long j6 = j5 - this.f10062;
        double d6 = this.f10063;
        double d7 = j6;
        Double.isNaN(d7);
        double d8 = f6;
        Double.isNaN(d8);
        Double.isNaN(d6);
        this.f10063 = (float) ((d6 + ((d7 * 1.0E-9d) * d8)) % 1.0d);
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract boolean mo11700(View view, float f5, long j5, o.c cVar);
}
