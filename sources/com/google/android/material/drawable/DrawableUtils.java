package com.google.android.material.drawable;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.core.graphics.drawable.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    private DrawableUtils() {
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2) {
        return compositeTwoLayeredDrawable(drawable, drawable2, -1, -1);
    }

    public static Drawable createTintableDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, false);
    }

    public static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        return createTintableMutatedDrawableIfNeeded(drawable, colorStateList, mode, Build.VERSION.SDK_INT < 23);
    }

    public static int[] getCheckedState(int[] iArr) {
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == 16842912) {
                return iArr;
            }
            if (i6 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i5] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    private static int getTopLayerIntrinsicHeight(Drawable drawable, Drawable drawable2) {
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        return intrinsicHeight != -1 ? intrinsicHeight : drawable.getIntrinsicHeight();
    }

    private static int getTopLayerIntrinsicWidth(Drawable drawable, Drawable drawable2) {
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        return intrinsicWidth != -1 ? intrinsicWidth : drawable.getIntrinsicWidth();
    }

    public static int[] getUncheckedState(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i5 = 0;
        for (int i6 : iArr) {
            if (i6 != 16842912) {
                iArr2[i5] = i6;
                i5++;
            }
        }
        return iArr2;
    }

    public static AttributeSet parseDrawableXml(Context context, int i5, CharSequence charSequence) {
        int next;
        try {
            XmlResourceParser xml = context.getResources().getXml(i5);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (TextUtils.equals(xml.getName(), charSequence)) {
                return Xml.asAttributeSet(xml);
            }
            throw new XmlPullParserException("Must have a <" + ((Object) charSequence) + "> start tag");
        } catch (IOException | XmlPullParserException e5) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i5));
            notFoundException.initCause(e5);
            throw notFoundException;
        }
    }

    public static void setOutlineToPath(Outline outline, Path path) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i5 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            if (i5 < 21 || !path.isConvex()) {
                return;
            }
            outline.setConvexPath(path);
        }
    }

    @TargetApi(21)
    public static void setRippleDrawableRadius(RippleDrawable rippleDrawable, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            rippleDrawable.setRadius(i5);
            return;
        }
        try {
            RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE).invoke(rippleDrawable, Integer.valueOf(i5));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
            throw new IllegalStateException("Couldn't set RippleDrawable radius", e5);
        }
    }

    public static void setTint(Drawable drawable, int i5) {
        boolean z5 = i5 != 0;
        if (Build.VERSION.SDK_INT == 21) {
            if (z5) {
                drawable.setColorFilter(i5, PorterDuff.Mode.SRC_IN);
                return;
            } else {
                drawable.setColorFilter(null);
                return;
            }
        }
        if (z5) {
            a.m2209(drawable, i5);
        } else {
            a.m2210(drawable, null);
        }
    }

    public static PorterDuffColorFilter updateTintFilter(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable drawable, Drawable drawable2, int i5, int i6) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i5 == -1) {
            i5 = getTopLayerIntrinsicWidth(drawable, drawable2);
        }
        if (i6 == -1) {
            i6 = getTopLayerIntrinsicHeight(drawable, drawable2);
        }
        if (i5 > drawable.getIntrinsicWidth() || i6 > drawable.getIntrinsicHeight()) {
            float f5 = i5 / i6;
            if (f5 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i6 = (int) (intrinsicWidth / f5);
                i5 = intrinsicWidth;
            } else {
                i6 = drawable.getIntrinsicHeight();
                i5 = (int) (f5 * i6);
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
            layerDrawable.setLayerSize(1, i5, i6);
            layerDrawable.setLayerGravity(1, 17);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable, new ScaledDrawableWrapper(drawable2, i5, i6).getDrawable()});
        int max = Math.max((drawable.getIntrinsicWidth() - i5) / 2, 0);
        int max2 = Math.max((drawable.getIntrinsicHeight() - i6) / 2, 0);
        layerDrawable2.setLayerInset(1, max, max2, max, max2);
        return layerDrawable2;
    }

    private static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode, boolean z5) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = a.m2213(drawable).mutate();
            if (mode != null) {
                a.m2211(drawable, mode);
            }
        } else if (z5) {
            drawable.mutate();
        }
        return drawable;
    }
}
