package d2;

import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: CircleLayoutContainer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a extends g {
    @Override // d2.g, d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect m8196 = m8196(rect);
        double width = m8196.width();
        Double.isNaN(width);
        double m8252 = m8252();
        Double.isNaN(m8252);
        int i5 = (int) (((width * 3.141592653589793d) / 3.5999999046325684d) / m8252);
        int centerX = m8196.centerX() - i5;
        int centerX2 = m8196.centerX() + i5;
        for (int i6 = 0; i6 < m8252(); i6++) {
            f m8251 = m8251(i6);
            int i7 = m8196.top;
            m8251.m8223(centerX, i7, centerX2, (i5 * 2) + i7);
        }
    }

    @Override // d2.g
    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void mo8190(Canvas canvas) {
        for (int i5 = 0; i5 < m8252(); i5++) {
            f m8251 = m8251(i5);
            int save = canvas.save();
            canvas.rotate((i5 * 360) / m8252(), getBounds().centerX(), getBounds().centerY());
            m8251.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
}
