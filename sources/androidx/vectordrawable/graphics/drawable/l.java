package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* compiled from: ArgbEvaluator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l implements TypeEvaluator {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final l f4618 = new l();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static l m5465() {
        return f4618;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f5, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f6 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f7 = f6 + (((((intValue2 >> 24) & 255) / 255.0f) - f6) * f5);
        float pow5 = pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f5);
        float pow6 = pow3 + (f5 * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f5), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f7 * 255.0f) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f));
    }
}
