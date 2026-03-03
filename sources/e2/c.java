package e2;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* compiled from: CubeGrid.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends d2.g {

    /* compiled from: CubeGrid.java */
    private class b extends d2.c {
        private b() {
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.35f, 0.7f, 1.0f};
            b2.d dVar = new b2.d(this);
            Float valueOf = Float.valueOf(1.0f);
            return dVar.m5701(fArr, valueOf, Float.valueOf(0.0f), valueOf, valueOf).m5695(1300L).m5696(fArr).m5694();
        }
    }

    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m8196 = m8196(rect);
        int width = (int) (m8196.width() * 0.33f);
        int height = (int) (m8196.height() * 0.33f);
        for (int i5 = 0; i5 < m8252(); i5++) {
            int i6 = m8196.left + ((i5 % 3) * width);
            int i7 = m8196.top + ((i5 / 3) * height);
            m8251(i5).m8223(i6, i7, i6 + width, i7 + height);
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        int[] iArr = {200, 300, 400, 100, 200, 300, 0, 100, 200};
        b[] bVarArr = new b[9];
        for (int i5 = 0; i5 < 9; i5++) {
            b bVar = new b();
            bVarArr[i5] = bVar;
            bVar.m8222(iArr[i5]);
        }
        return bVarArr;
    }
}
