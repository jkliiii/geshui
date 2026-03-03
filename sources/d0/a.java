package d0;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.h;
import androidx.emoji2.text.g;

/* compiled from: EmojiSpan.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class a extends ReplacementSpan {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final g f6827;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Paint.FontMetricsInt f6826 = new Paint.FontMetricsInt();

    /* renamed from: ˆ, reason: contains not printable characters */
    private short f6828 = -1;

    /* renamed from: ˈ, reason: contains not printable characters */
    private short f6829 = -1;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f6830 = 1.0f;

    a(g gVar) {
        h.m2584(gVar, "metadata cannot be null");
        this.f6827 = gVar;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i5, int i6, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f6826);
        Paint.FontMetricsInt fontMetricsInt2 = this.f6826;
        this.f6830 = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f6827.m3813();
        this.f6829 = (short) (this.f6827.m3813() * this.f6830);
        short m3816 = (short) (this.f6827.m3816() * this.f6830);
        this.f6828 = m3816;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f6826;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return m3816;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final g m8155() {
        return this.f6827;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    final int m8156() {
        return this.f6828;
    }
}
