package v1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTargetFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f {
    /* renamed from: ʻ, reason: contains not printable characters */
    public <Z> i<ImageView, Z> m12295(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new d(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
