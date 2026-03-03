package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* compiled from: ActionBarBackgroundDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends Drawable {

    /* renamed from: ʻ, reason: contains not printable characters */
    final ActionBarContainer f1161;

    /* compiled from: ActionBarBackgroundDrawable.java */
    private static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static void m1139(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public b(ActionBarContainer actionBarContainer) {
        this.f1161 = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1161;
        if (actionBarContainer.f972) {
            Drawable drawable = actionBarContainer.f971;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f969;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1161;
        Drawable drawable3 = actionBarContainer2.f970;
        if (drawable3 == null || !actionBarContainer2.f973) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1161;
        if (actionBarContainer.f972) {
            if (actionBarContainer.f971 != null) {
                a.m1139(actionBarContainer.f969, outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f969;
            if (drawable != null) {
                a.m1139(drawable, outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
