package e2;

import android.animation.ValueAnimator;
import android.graphics.Rect;

/* compiled from: ThreeBounce.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m extends d2.g {

    /* compiled from: ThreeBounce.java */
    private class a extends d2.b {
        a() {
            m8197(0.0f);
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.4f, 0.8f, 1.0f};
            b2.d dVar = new b2.d(this);
            Float valueOf = Float.valueOf(0.0f);
            return dVar.m5701(fArr, valueOf, Float.valueOf(1.0f), valueOf, valueOf).m5695(1400L).m5696(fArr).m5694();
        }
    }

    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m8196 = m8196(rect);
        int width = m8196.width() / 8;
        int centerY = m8196.centerY() - width;
        int centerY2 = m8196.centerY() + width;
        for (int i5 = 0; i5 < m8252(); i5++) {
            int width2 = ((m8196.width() * i5) / 3) + m8196.left;
            m8251(i5).m8223(width2, centerY, (width * 2) + width2, centerY2);
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        return new d2.f[]{new a(), new a(), new a()};
    }

    @Override // d2.g
    /* renamed from: ˏˏ */
    public void mo8254(d2.f... fVarArr) {
        super.mo8254(fVarArr);
        fVarArr[1].m8222(160);
        fVarArr[2].m8222(320);
    }
}
