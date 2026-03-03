package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* compiled from: ImageViewCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s {

    /* compiled from: ImageViewCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static ColorStateList m3653(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static PorterDuff.Mode m3654(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3655(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3656(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʻ, reason: contains not printable characters */
    public static ColorStateList m3649(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m3653(imageView);
        }
        if (imageView instanceof s0) {
            return ((s0) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    public static PorterDuff.Mode m3650(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m3654(imageView);
        }
        if (imageView instanceof s0) {
            return ((s0) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3651(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            if (imageView instanceof s0) {
                ((s0) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        a.m3655(imageView, colorStateList);
        if (i5 != 21 || (drawable = imageView.getDrawable()) == null || a.m3653(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m3652(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 21) {
            if (imageView instanceof s0) {
                ((s0) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        a.m3656(imageView, mode);
        if (i5 != 21 || (drawable = imageView.getDrawable()) == null || a.m3653(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
