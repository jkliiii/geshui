package y0;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import w0.e;
import w0.f;

/* compiled from: DialogUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* compiled from: DialogUtils.java */
    /* renamed from: y0.a$a, reason: collision with other inner class name */
    static class RunnableC0179a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ f f12431;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ f.e f12432;

        RunnableC0179a(f fVar, f.e eVar) {
            this.f12431 = fVar;
            this.f12432 = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12431.m12471().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f12432.m12487().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f12431.m12471(), 1);
            }
        }
    }

    /* compiled from: DialogUtils.java */
    static /* synthetic */ class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f12433;

        static {
            int[] iArr = new int[e.values().length];
            f12433 = iArr;
            try {
                iArr[e.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12433[e.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m12838(int i5, float f5) {
        return Color.argb(Math.round(Color.alpha(i5) * f5), Color.red(i5), Color.green(i5), Color.blue(i5));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static ColorStateList m12839(Context context, int i5) {
        int m12849 = m12849(context, R.attr.textColorPrimary);
        if (i5 == 0) {
            i5 = m12849;
        }
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[0]}, new int[]{m12838(i5, 0.4f), i5});
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m12840(Context context, int i5) {
        return androidx.core.content.a.m1991(context, i5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static int m12841(Context context) {
        return m12838(m12844(m12849(context, R.attr.textColorPrimary)) ? -16777216 : -1, 0.3f);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m12842(e eVar) {
        int i5 = b.f12433[eVar.ordinal()];
        int i6 = 1;
        if (i5 != 1) {
            i6 = 2;
            if (i5 != 2) {
                return 0;
            }
        }
        return i6;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m12843(DialogInterface dialogInterface, f.e eVar) {
        InputMethodManager inputMethodManager;
        f fVar = (f) dialogInterface;
        if (fVar.m12471() == null || (inputMethodManager = (InputMethodManager) eVar.m12487().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = fVar.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : fVar.m12474() != null ? fVar.m12474().getWindowToken() : null;
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static boolean m12844(int i5) {
        double red = Color.red(i5);
        Double.isNaN(red);
        double green = Color.green(i5);
        Double.isNaN(green);
        double d6 = (red * 0.299d) + (green * 0.587d);
        double blue = Color.blue(i5);
        Double.isNaN(blue);
        return 1.0d - ((d6 + (blue * 0.114d)) / 255.0d) >= 0.5d;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static <T> boolean m12845(T t5, T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            for (T t6 : tArr) {
                if (t6.equals(t5)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static ColorStateList m12846(Context context, int i5, ColorStateList colorStateList) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            TypedValue peekValue = obtainStyledAttributes.peekValue(0);
            if (peekValue == null) {
                return colorStateList;
            }
            int i6 = peekValue.type;
            if (i6 >= 28 && i6 <= 31) {
                return m12839(context, peekValue.data);
            }
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(0);
            return colorStateList2 != null ? colorStateList2 : colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m12847(Context context, int i5) {
        return m12848(context, i5, false);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static boolean m12848(Context context, int i5, boolean z5) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            return obtainStyledAttributes.getBoolean(0, z5);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static int m12849(Context context, int i5) {
        return m12850(context, i5, 0);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static int m12850(Context context, int i5, int i6) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            return obtainStyledAttributes.getColor(0, i6);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public static int m12851(Context context, int i5) {
        return m12852(context, i5, -1);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static int m12852(Context context, int i5, int i6) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            return obtainStyledAttributes.getDimensionPixelSize(0, i6);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static Drawable m12853(Context context, int i5) {
        return m12854(context, i5, null);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private static Drawable m12854(Context context, int i5, Drawable drawable) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null || drawable == null) {
                drawable = drawable2;
            }
            return drawable;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static e m12855(Context context, int i5, e eVar) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i5});
        try {
            int i6 = obtainStyledAttributes.getInt(0, m12842(eVar));
            return i6 != 1 ? i6 != 2 ? e.START : e.END : e.CENTER;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static String m12856(Context context, int i5) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i5, typedValue, true);
        return (String) typedValue.string;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public static void m12857(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public static void m12858(DialogInterface dialogInterface, f.e eVar) {
        f fVar = (f) dialogInterface;
        if (fVar.m12471() == null) {
            return;
        }
        fVar.m12471().post(new RunnableC0179a(fVar, eVar));
    }
}
