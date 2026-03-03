package e2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: Wave.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o extends d2.g {

    /* compiled from: Wave.java */
    private class a extends d2.c {
        a() {
            m8198(0.4f);
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.2f, 0.4f, 1.0f};
            b2.d dVar = new b2.d(this);
            Float valueOf = Float.valueOf(0.4f);
            return dVar.m5702(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).m5695(1200L).m5696(fArr).m5694();
        }
    }

    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m8196 = m8196(rect);
        int width = m8196.width() / m8252();
        int width2 = ((m8196.width() / 5) * 3) / 5;
        for (int i5 = 0; i5 < m8252(); i5++) {
            d2.f m8251 = m8251(i5);
            int i6 = m8196.left + (i5 * width) + (width / 5);
            m8251.m8223(i6, m8196.top, i6 + width2, m8196.bottom);
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        a[] aVarArr = new a[5];
        for (int i5 = 0; i5 < 5; i5++) {
            a aVar = new a();
            aVarArr[i5] = aVar;
            if (Build.VERSION.SDK_INT >= 24) {
                aVar.m8222((i5 * 100) + 600);
            } else {
                aVar.m8222((i5 * 100) - 1200);
            }
        }
        return aVarArr;
    }
}
