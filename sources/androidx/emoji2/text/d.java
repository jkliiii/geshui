package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.core.graphics.k0;
import androidx.emoji2.text.e;

/* compiled from: DefaultGlyphChecker.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d implements e.d {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final ThreadLocal<StringBuilder> f3218 = new ThreadLocal<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final TextPaint f3219;

    d() {
        TextPaint textPaint = new TextPaint();
        this.f3219 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static StringBuilder m3778() {
        ThreadLocal<StringBuilder> threadLocal = f3218;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo3779(CharSequence charSequence, int i5, int i6, int i7) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 23 && i7 > i8) {
            return false;
        }
        StringBuilder m3778 = m3778();
        m3778.setLength(0);
        while (i5 < i6) {
            m3778.append(charSequence.charAt(i5));
            i5++;
        }
        return k0.m2296(this.f3219, m3778.toString());
    }
}
