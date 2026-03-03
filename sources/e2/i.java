package e2;

import android.animation.ValueAnimator;

/* compiled from: Pulse.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class i extends d2.b {
    public i() {
        m8197(0.0f);
    }

    @Override // d2.f
    /* renamed from: ᴵ */
    public ValueAnimator mo8219() {
        float[] fArr = {0.0f, 1.0f};
        return new b2.d(this).m5701(fArr, Float.valueOf(0.0f), Float.valueOf(1.0f)).m5693(fArr, 255, 0).m5695(1000L).m5696(fArr).m5694();
    }
}
