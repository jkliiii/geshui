package y0;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: RippleHelper.java */
@TargetApi(21)
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m12860(Drawable drawable, int i5) {
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i5));
        }
    }
}
