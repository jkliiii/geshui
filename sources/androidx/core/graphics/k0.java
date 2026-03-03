package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: PaintCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<androidx.core.util.d<Rect, Rect>> f2702 = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m2298(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m2296(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.m2298(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f5 = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i5 = 0;
            while (i5 < length) {
                int charCount = Character.charCount(str.codePointAt(i5)) + i5;
                f5 += paint.measureText(str, i5, charCount);
                i5 = charCount;
            }
            if (measureText3 >= f5) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        androidx.core.util.d<Rect, Rect> m2297 = m2297();
        paint.getTextBounds("\udfffd", 0, 2, m2297.f2843);
        paint.getTextBounds(str, 0, length, m2297.f2844);
        return !m2297.f2843.equals(m2297.f2844);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static androidx.core.util.d<Rect, Rect> m2297() {
        ThreadLocal<androidx.core.util.d<Rect, Rect>> threadLocal = f2702;
        androidx.core.util.d<Rect, Rect> dVar = threadLocal.get();
        if (dVar == null) {
            androidx.core.util.d<Rect, Rect> dVar2 = new androidx.core.util.d<>(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        dVar.f2843.setEmpty();
        dVar.f2844.setEmpty();
        return dVar;
    }
}
