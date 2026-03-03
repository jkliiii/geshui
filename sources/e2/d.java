package e2;

import android.animation.ValueAnimator;
import android.os.Build;

/* compiled from: DoubleBounce.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends d2.g {

    /* compiled from: DoubleBounce.java */
    private class a extends d2.b {
        a() {
            setAlpha(153);
            m8197(0.0f);
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            b2.d dVar = new b2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.m5701(fArr, valueOf, Float.valueOf(1.0f), valueOf).m5695(2000L).m5696(fArr).m5694();
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        return new d2.f[]{new a(), new a()};
    }

    @Override // d2.g
    /* renamed from: ˏˏ */
    public void mo8254(d2.f... fVarArr) {
        super.mo8254(fVarArr);
        if (Build.VERSION.SDK_INT >= 24) {
            fVarArr[1].m8222(1000);
        } else {
            fVarArr[1].m8222(-1000);
        }
    }
}
