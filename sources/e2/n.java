package e2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: WanderingCubes.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n extends d2.g {

    /* compiled from: WanderingCubes.java */
    private class a extends d2.c {

        /* renamed from: ˈˈ, reason: contains not printable characters */
        int f7588;

        public a(int i5) {
            this.f7588 = i5;
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.25f, 0.5f, 0.51f, 0.75f, 1.0f};
            b2.d m5698 = new b2.d(this).m5698(fArr, 0, -90, -179, -180, -270, -360);
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(0.75f);
            b2.d m5705 = m5698.m5704(fArr, valueOf, valueOf2, valueOf2, valueOf2, valueOf, valueOf).m5705(fArr, valueOf, valueOf, valueOf2, valueOf2, valueOf2, valueOf);
            Float valueOf3 = Float.valueOf(1.0f);
            Float valueOf4 = Float.valueOf(0.5f);
            b2.d m5696 = m5705.m5701(fArr, valueOf3, valueOf4, valueOf3, valueOf3, valueOf4, valueOf3).m5695(1800L).m5696(fArr);
            if (Build.VERSION.SDK_INT >= 24) {
                m5696.m5703(this.f7588);
            }
            return m5696.m5694();
        }
    }

    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Rect m8196 = m8196(rect);
        super.onBoundsChange(m8196);
        for (int i5 = 0; i5 < m8252(); i5++) {
            d2.f m8251 = m8251(i5);
            int i6 = m8196.left;
            m8251.m8223(i6, m8196.top, (m8196.width() / 4) + i6, m8196.top + (m8196.height() / 4));
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        return new d2.f[]{new a(0), new a(3)};
    }

    @Override // d2.g
    /* renamed from: ˏˏ */
    public void mo8254(d2.f... fVarArr) {
        super.mo8254(fVarArr);
        if (Build.VERSION.SDK_INT < 24) {
            fVarArr[1].m8222(-900);
        }
    }
}
