package e2;

import android.animation.ValueAnimator;

/* compiled from: PulseRing.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends d2.d {
    public j() {
        m8197(0.0f);
    }

    @Override // d2.f
    /* renamed from: ᴵ */
    public ValueAnimator mo8219() {
        float[] fArr = {0.0f, 0.7f, 1.0f};
        b2.d dVar = new b2.d(this);
        Float valueOf = Float.valueOf(1.0f);
        return dVar.m5701(fArr, Float.valueOf(0.0f), valueOf, valueOf).m5693(fArr, 255, 178, 0).m5695(1000L).m5697(c2.b.m5841(0.21f, 0.53f, 0.56f, 0.8f, fArr)).m5694();
    }
}
