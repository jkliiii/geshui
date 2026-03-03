package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

/* compiled from: MenuItemCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l0 {

    /* compiled from: MenuItemCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m3185(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static CharSequence m3186(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static ColorStateList m3187(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static PorterDuff.Mode m3188(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static int m3189(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static CharSequence m3190(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static MenuItem m3191(MenuItem menuItem, char c6, int i5) {
            return menuItem.setAlphabeticShortcut(c6, i5);
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        static MenuItem m3192(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        static MenuItem m3193(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        static MenuItem m3194(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        static MenuItem m3195(MenuItem menuItem, char c6, int i5) {
            return menuItem.setNumericShortcut(c6, i5);
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        static MenuItem m3196(MenuItem menuItem, char c6, char c7, int i5, int i6) {
            return menuItem.setShortcut(c6, c7, i5, i6);
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        static MenuItem m3197(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static MenuItem m3178(MenuItem menuItem, b bVar) {
        if (menuItem instanceof v.b) {
            return ((v.b) menuItem).mo893(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m3179(MenuItem menuItem, char c6, int i5) {
        if (menuItem instanceof v.b) {
            ((v.b) menuItem).setAlphabeticShortcut(c6, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3191(menuItem, c6, i5);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3180(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof v.b) {
            ((v.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3192(menuItem, charSequence);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m3181(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof v.b) {
            ((v.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3193(menuItem, colorStateList);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m3182(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof v.b) {
            ((v.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3194(menuItem, mode);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m3183(MenuItem menuItem, char c6, int i5) {
        if (menuItem instanceof v.b) {
            ((v.b) menuItem).setNumericShortcut(c6, i5);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3195(menuItem, c6, i5);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m3184(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof v.b) {
            ((v.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m3197(menuItem, charSequence);
        }
    }
}
