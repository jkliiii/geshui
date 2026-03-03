package d2;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: RingSprite.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends e {
    @Override // d2.e
    /* renamed from: ˉˉ */
    public void mo8191(Canvas canvas, Paint paint) {
        if (m8200() != null) {
            paint.setStyle(Paint.Style.STROKE);
            int min = Math.min(m8200().width(), m8200().height()) / 2;
            paint.setStrokeWidth(min / 12);
            canvas.drawCircle(m8200().centerX(), m8200().centerY(), min, paint);
        }
    }
}
