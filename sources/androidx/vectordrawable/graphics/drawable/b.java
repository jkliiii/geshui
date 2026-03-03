package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: Animatable2Compat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    Animatable2.AnimationCallback f4600;

    /* compiled from: Animatable2Compat.java */
    class a extends Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            b.this.mo5425(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            b.this.mo5426(drawable);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    Animatable2.AnimationCallback m5424() {
        if (this.f4600 == null) {
            this.f4600 = new a();
        }
        return this.f4600;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo5425(Drawable drawable) {
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo5426(Drawable drawable) {
    }
}
