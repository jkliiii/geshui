package s;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: CustomSupport.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* compiled from: CustomSupport.java */
    /* renamed from: s.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0159a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f10861;

        static {
            int[] iArr = new int[a.b.values().length];
            f10861 = iArr;
            try {
                iArr[a.b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10861[a.b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10861[a.b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10861[a.b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10861[a.b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10861[a.b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10861[a.b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m11693(int i5) {
        int i6 = (i5 & ((i5 >> 31) ^ (-1))) - 255;
        return (i6 & (i6 >> 31)) + 255;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m11694(androidx.constraintlayout.widget.a aVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + aVar.m1818();
        try {
            boolean z5 = true;
            switch (C0159a.f10861[aVar.m1819().ordinal()]) {
                case 1:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int m11693 = (m11693((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m11693((int) (fArr[3] * 255.0f)) << 24) | (m11693((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m11693((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(m11693);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, Integer.TYPE).invoke(view, Integer.valueOf((m11693((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m11693((int) (fArr[3] * 255.0f)) << 24) | (m11693((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m11693((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + aVar.m1818());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z5 = false;
                    }
                    objArr[0] = Boolean.valueOf(z5);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e5) {
            Log.e("CustomSupport", "cannot access method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.m1746(view) + "\"");
            e5.printStackTrace();
        } catch (NoSuchMethodException e6) {
            Log.e("CustomSupport", "no method " + str + " on View \"" + androidx.constraintlayout.motion.widget.a.m1746(view) + "\"");
            e6.printStackTrace();
        } catch (InvocationTargetException e7) {
            e7.printStackTrace();
        }
    }
}
