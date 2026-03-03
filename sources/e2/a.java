package e2;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;

/* compiled from: ChasingDots.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends d2.g {

    /* compiled from: ChasingDots.java */
    /* renamed from: e2.a$a, reason: collision with other inner class name */
    private class C0104a extends d2.b {
        C0104a() {
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

    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m8196 = m8196(rect);
        int width = (int) (m8196.width() * 0.6f);
        d2.f m8251 = m8251(0);
        int i5 = m8196.right;
        int i6 = m8196.top;
        m8251.m8223(i5 - width, i6, i5, i6 + width);
        d2.f m82512 = m8251(1);
        int i7 = m8196.right;
        int i8 = m8196.bottom;
        m82512.m8223(i7 - width, i8 - width, i7, i8);
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        return new d2.f[]{new C0104a(), new C0104a()};
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

    @Override // d2.g, d2.f
    /* renamed from: ᴵ */
    public ValueAnimator mo8219() {
        return new b2.d(this).m5698(new float[]{0.0f, 1.0f}, 0, 360).m5695(2000L).m5697(new LinearInterpolator()).m5694();
    }
}
