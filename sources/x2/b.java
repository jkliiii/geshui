package x2;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: BitmapDrawableFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface b {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final b f12136 = new a();

    /* compiled from: BitmapDrawableFactory.java */
    static class a implements b {
        a() {
        }

        @Override // x2.b
        /* renamed from: ʻ */
        public Drawable mo12682(Resources resources, Bitmap bitmap) {
            return new BitmapDrawable(resources, bitmap);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    Drawable mo12682(Resources resources, Bitmap bitmap);
}
