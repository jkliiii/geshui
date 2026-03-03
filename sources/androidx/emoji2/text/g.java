package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: EmojiMetadata.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g {

    /* renamed from: ʾ, reason: contains not printable characters */
    private static final ThreadLocal<e0.a> f3255 = new ThreadLocal<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f3256;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final l f3257;

    /* renamed from: ʽ, reason: contains not printable characters */
    private volatile int f3258 = 0;

    g(l lVar, int i5) {
        this.f3257 = lVar;
        this.f3256 = i5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private e0.a m3808() {
        ThreadLocal<e0.a> threadLocal = f3255;
        e0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new e0.a();
            threadLocal.set(aVar);
        }
        this.f3257.m3857().m8273(aVar, this.f3256);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(m3814()));
        sb.append(", codepoints:");
        int m3811 = m3811();
        for (int i5 = 0; i5 < m3811; i5++) {
            sb.append(Integer.toHexString(m3810(i5)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m3809(Canvas canvas, float f5, float f6, Paint paint) {
        Typeface m3860 = this.f3257.m3860();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m3860);
        canvas.drawText(this.f3257.m3856(), this.f3256 * 2, 2, f5, f6, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m3810(int i5) {
        return m3808().m8262(i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m3811() {
        return m3808().m8263();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: ʾ, reason: contains not printable characters */
    public int m3812() {
        return this.f3258;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public short m3813() {
        return m3808().m8265();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m3814() {
        return m3808().m8266();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public short m3815() {
        return m3808().m8267();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public short m3816() {
        return m3808().m8268();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m3817() {
        return m3808().m8264();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m3818(boolean z5) {
        this.f3258 = z5 ? 2 : 1;
    }
}
