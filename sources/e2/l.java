package e2;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* compiled from: RotatingPlane.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends d2.c {
    @Override // d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        m8224(m8196(rect));
    }

    @Override // d2.f
    /* renamed from: ᴵ */
    public ValueAnimator mo8219() {
        float[] fArr = {0.0f, 0.5f, 1.0f};
        return new b2.d(this).m5699(fArr, 0, -180, -180).m5700(fArr, 0, 0, -180).m5695(1200L).m5696(fArr).m5694();
    }
}
