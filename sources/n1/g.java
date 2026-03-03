package n1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: DrawableDecoderCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static volatile boolean f9519 = true;

    /* renamed from: ʻ, reason: contains not printable characters */
    public static Drawable m10433(Context context, int i5, Resources.Theme theme) {
        return m10435(context, context, i5, theme);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static Drawable m10434(Context context, Context context2, int i5) {
        return m10435(context, context2, i5, null);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Drawable m10435(Context context, Context context2, int i5, Resources.Theme theme) {
        try {
            if (f9519) {
                return m10437(context2, i5, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e5) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e5;
            }
            return androidx.core.content.a.m1993(context2, i5);
        } catch (NoClassDefFoundError unused2) {
            f9519 = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m10436(context2, i5, theme);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Drawable m10436(Context context, int i5, Resources.Theme theme) {
        return androidx.core.content.res.i.m2110(context.getResources(), i5, theme);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Drawable m10437(Context context, int i5, Resources.Theme theme) {
        if (theme != null && Build.VERSION.SDK_INT >= 21) {
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, theme);
            dVar.m841(theme.getResources().getConfiguration());
            context = dVar;
        }
        return f.a.m8475(context, i5);
    }
}
