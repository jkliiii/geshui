package androidx.core.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: ViewConfigurationCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class y3 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Method f3073;

    /* compiled from: ViewConfigurationCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static float m3451(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static float m3452(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    /* compiled from: ViewConfigurationCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m3453(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m3454(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f3073 = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static float m3446(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f3073) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static float m3447(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.m3451(viewConfiguration) : m3446(viewConfiguration, context);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m3448(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.m3453(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static float m3449(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.m3452(viewConfiguration) : m3446(viewConfiguration, context);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static boolean m3450(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.m3454(viewConfiguration);
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
