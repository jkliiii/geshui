package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CheckedTextView;

/* compiled from: CheckedTextViewCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* compiled from: CheckedTextViewCompat.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static Drawable m3551(CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    /* compiled from: CheckedTextViewCompat.java */
    /* renamed from: androidx.core.widget.b$b, reason: collision with other inner class name */
    private static class C0039b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m3552(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m3553(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Drawable m3548(CheckedTextView checkedTextView) {
        return a.m3551(checkedTextView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m3549(CheckedTextView checkedTextView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0039b.m3552(checkedTextView, colorStateList);
        } else if (checkedTextView instanceof p0) {
            ((p0) checkedTextView).setSupportCheckMarkTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3550(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0039b.m3553(checkedTextView, mode);
        } else if (checkedTextView instanceof p0) {
            ((p0) checkedTextView).setSupportCheckMarkTintMode(mode);
        }
    }
}
