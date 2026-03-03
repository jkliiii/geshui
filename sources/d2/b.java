package d2;

import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: CircleSprite.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends e {
    @Override // d2.e
    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void mo8191(Canvas canvas, Paint paint) {
        if (m8200() != null) {
            canvas.drawCircle(m8200().centerX(), m8200().centerY(), Math.min(m8200().width(), m8200().height()) / 2, paint);
        }
    }
}
