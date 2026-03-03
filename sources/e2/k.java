package e2;

import android.animation.ValueAnimator;

/* compiled from: RotatingCircle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class k extends d2.b {
    @Override // d2.f
    /* renamed from: ᴵ */
    public ValueAnimator mo8219() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new b2.d(this).m5699(fArr, 0, -180, -180).m5700(fArr, 0, 0, -180).m5695(1200L).m5696(fArr).m5694();
    }
}
