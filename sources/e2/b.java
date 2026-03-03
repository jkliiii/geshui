package e2;

import android.animation.ValueAnimator;
import android.os.Build;

/* compiled from: Circle.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends d2.a {

    /* compiled from: Circle.java */
    private class a extends d2.b {
        a() {
            m8197(0.0f);
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.5f, 1.0f};
            b2.d dVar = new b2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.m5701(fArr, valueOf, Float.valueOf(1.0f), valueOf).m5695(1200L).m5696(fArr).m5694();
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        a[] aVarArr = new a[12];
        for (int i5 = 0; i5 < 12; i5++) {
            a aVar = new a();
            aVarArr[i5] = aVar;
            if (Build.VERSION.SDK_INT >= 24) {
                aVar.m8222(i5 * 100);
            } else {
                aVar.m8222((i5 * 100) - 1200);
            }
        }
        return aVarArr;
    }
}
