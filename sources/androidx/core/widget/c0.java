package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.a0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: TextViewCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c0 {

    /* compiled from: TextViewCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m3574(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3575(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m3576(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* compiled from: TextViewCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable[] m3577(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m3578(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m3579(View view) {
            return view.getTextDirection();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static Locale m3580(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m3581(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static void m3582(TextView textView, int i5, int i6, int i7, int i8) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i5, i6, i7, i8);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m3583(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m3584(View view, int i5) {
            view.setTextDirection(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m3585(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static ColorStateList m3586(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static PorterDuff.Mode m3587(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static int m3588(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m3589(TextView textView, int i5) {
            textView.setBreakStrategy(i5);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static void m3590(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m3591(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static void m3592(TextView textView, int i5) {
            textView.setHyphenationFrequency(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    static class d {
        /* renamed from: ʻ, reason: contains not printable characters */
        static DecimalFormatSymbols m3593(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* compiled from: TextViewCompat.java */
    static class e {
        /* renamed from: ʻ, reason: contains not printable characters */
        static String[] m3594(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static PrecomputedText.Params m3595(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3596(TextView textView, int i5) {
            textView.setFirstBaselineToTopHeight(i5);
        }
    }

    /* compiled from: TextViewCompat.java */
    private static class f implements ActionMode.Callback {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ActionMode.Callback f3135;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final TextView f3136;

        /* renamed from: ʽ, reason: contains not printable characters */
        private Class<?> f3137;

        /* renamed from: ʾ, reason: contains not printable characters */
        private Method f3138;

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean f3139;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f3140 = false;

        f(ActionMode.Callback callback, TextView textView) {
            this.f3135 = callback;
            this.f3136 = textView;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private Intent m3597() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private Intent m3598(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m3597().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3600(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        private List<ResolveInfo> m3599(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m3597(), 0)) {
                if (m3601(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private boolean m3600(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean m3601(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        private void m3602(Menu menu) {
            Context context = this.f3136.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3140) {
                this.f3140 = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3137 = cls;
                    this.f3138 = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f3139 = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3137 = null;
                    this.f3138 = null;
                    this.f3139 = false;
                }
            }
            try {
                Method declaredMethod = (this.f3139 && this.f3137.isInstance(menu)) ? this.f3138 : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> m3599 = m3599(context, packageManager);
                for (int i5 = 0; i5 < m3599.size(); i5++) {
                    ResolveInfo resolveInfo = m3599.get(i5);
                    menu.add(0, 0, i5 + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3598(resolveInfo, this.f3136)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3135.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3135.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3135.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m3602(menu);
            return this.f3135.onPrepareActionMode(actionMode, menu);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        ActionMode.Callback m3603() {
            return this.f3135;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Drawable[] m3556(TextView textView) {
        return b.m3577(textView);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m3557(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m3558(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static int m3559(TextView textView) {
        return a.m3575(textView);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m3560(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static TextDirectionHeuristic m3561(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(e.m3594(d.m3593(b.m3580(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z5 = b.m3578(textView) == 1;
        switch (b.m3579(textView)) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z5) {
                    break;
                } else {
                    break;
                }
        }
        return TextDirectionHeuristics.LTR;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static a0.a m3562(TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            return new a0.a(e.m3595(textView));
        }
        a0.a.C0031a c0031a = new a0.a.C0031a(new TextPaint(textView.getPaint()));
        if (i5 >= 23) {
            c0031a.m2523(c.m3585(textView));
            c0031a.m2524(c.m3588(textView));
        }
        c0031a.m2525(m3561(textView));
        return c0031a.m2522();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m3563(TextView textView, ColorStateList colorStateList) {
        androidx.core.util.h.m2583(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m3590(textView, colorStateList);
        } else if (textView instanceof r0) {
            ((r0) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˊ, reason: contains not printable characters */
    public static void m3564(TextView textView, PorterDuff.Mode mode) {
        androidx.core.util.h.m2583(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            c.m3591(textView, mode);
        } else if (textView instanceof r0) {
            ((r0) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m3565(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        b.m3581(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m3566(TextView textView, int i5) {
        androidx.core.util.h.m2580(i5);
        if (Build.VERSION.SDK_INT >= 28) {
            e.m3596(textView, i5);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = a.m3574(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i5 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), i5 + i6, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m3567(TextView textView, int i5) {
        androidx.core.util.h.m2580(i5);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i6 = a.m3574(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i5 > Math.abs(i6)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i5 - i6);
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public static void m3568(TextView textView, int i5) {
        androidx.core.util.h.m2580(i5);
        if (i5 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i5 - r0, 1.0f);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public static void m3569(TextView textView, androidx.core.text.a0 a0Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(a0Var.m2516());
        } else {
            if (!m3562(textView).m2517(a0Var.m2515())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(a0Var);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public static void m3570(TextView textView, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i5);
        } else {
            textView.setTextAppearance(textView.getContext(), i5);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public static void m3571(TextView textView, a0.a aVar) {
        int i5 = Build.VERSION.SDK_INT;
        b.m3584(textView, m3560(aVar.m2520()));
        if (i5 >= 23) {
            textView.getPaint().set(aVar.m2521());
            c.m3589(textView, aVar.m2518());
            c.m3592(textView, aVar.m2519());
        } else {
            float textScaleX = aVar.m2521().getTextScaleX();
            textView.getPaint().set(aVar.m2521());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public static ActionMode.Callback m3572(ActionMode.Callback callback) {
        return (!(callback instanceof f) || Build.VERSION.SDK_INT < 26) ? callback : ((f) callback).m3603();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public static ActionMode.Callback m3573(TextView textView, ActionMode.Callback callback) {
        int i5 = Build.VERSION.SDK_INT;
        return (i5 < 26 || i5 > 27 || (callback instanceof f) || callback == null) ? callback : new f(callback, textView);
    }
}
