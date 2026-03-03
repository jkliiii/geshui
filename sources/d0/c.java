package d0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import androidx.emoji2.text.g;

/* compiled from: TypefaceEmojiSpan.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c extends a {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static Paint f6835;

    public c(g gVar) {
        super(gVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Paint m8169() {
        if (f6835 == null) {
            TextPaint textPaint = new TextPaint();
            f6835 = textPaint;
            textPaint.setColor(androidx.emoji2.text.e.m3781().m3788());
            f6835.setStyle(Paint.Style.FILL);
        }
        return f6835;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i5, int i6, float f5, int i7, int i8, int i9, Paint paint) {
        if (androidx.emoji2.text.e.m3781().m3790()) {
            canvas.drawRect(f5, i7, f5 + m8156(), i9, m8169());
        }
        m8155().m3809(canvas, f5, i8, paint);
    }
}
