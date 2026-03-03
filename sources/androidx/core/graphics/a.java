package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.core.graphics.c;

/* compiled from: BlendModeColorFilterCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* compiled from: BlendModeColorFilterCompat.java */
    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    static class C0026a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static ColorFilter m2164(int i5, Object obj) {
            return new BlendModeColorFilter(i5, (BlendMode) obj);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static ColorFilter m2163(int i5, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object m2170 = c.b.m2170(bVar);
            if (m2170 != null) {
                return C0026a.m2164(i5, m2170);
            }
            return null;
        }
        PorterDuff.Mode m2169 = c.m2169(bVar);
        if (m2169 != null) {
            return new PorterDuffColorFilter(i5, m2169);
        }
        return null;
    }
}
