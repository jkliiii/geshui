package e2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.animation.LinearInterpolator;

/* compiled from: FoldingCube.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends d2.g {

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private boolean f7585 = false;

    /* compiled from: FoldingCube.java */
    private class a extends d2.c {
        a() {
            setAlpha(0);
            m8218(-180);
        }

        @Override // d2.f
        /* renamed from: ᴵ */
        public ValueAnimator mo8219() {
            float[] fArr = {0.0f, 0.1f, 0.25f, 0.75f, 0.9f, 1.0f};
            return new b2.d(this).m5693(fArr, 0, 0, 255, 255, 0, 0).m5699(fArr, -180, -180, 0, 0, 0, 0).m5700(fArr, 0, 0, 0, 0, 180, 180).m5695(2400L).m5697(new LinearInterpolator()).m5694();
        }
    }

    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m8196 = m8196(rect);
        int min = Math.min(m8196.width(), m8196.height());
        if (this.f7585) {
            min = (int) Math.sqrt((min * min) / 2);
            int width = (m8196.width() - min) / 2;
            int height = (m8196.height() - min) / 2;
            m8196 = new Rect(m8196.left + width, m8196.top + height, m8196.right - width, m8196.bottom - height);
        }
        int i5 = min / 2;
        int i6 = m8196.left + i5 + 1;
        int i7 = m8196.top + i5 + 1;
        for (int i8 = 0; i8 < m8252(); i8++) {
            d2.f m8251 = m8251(i8);
            m8251.m8223(m8196.left, m8196.top, i6, i7);
            m8251.m8225(m8251.m8200().right);
            m8251.m8226(m8251.m8200().bottom);
        }
    }

    @Override // d2.g
    /* renamed from: ˉˉ */
    public void mo8190(Canvas canvas) {
        Rect m8196 = m8196(getBounds());
        for (int i5 = 0; i5 < m8252(); i5++) {
            int save = canvas.save();
            canvas.rotate((i5 * 90) + 45, m8196.centerX(), m8196.centerY());
            m8251(i5).draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // d2.g
    /* renamed from: ˎˎ */
    public d2.f[] mo8253() {
        a[] aVarArr = new a[4];
        for (int i5 = 0; i5 < 4; i5++) {
            a aVar = new a();
            aVarArr[i5] = aVar;
            if (Build.VERSION.SDK_INT >= 24) {
                aVar.m8222(i5 * 300);
            } else {
                aVar.m8222((i5 * 300) - 1200);
            }
        }
        return aVarArr;
    }
}
