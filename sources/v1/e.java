package v1;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import w1.b;

/* compiled from: ImageViewTarget.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class e<Z> extends i<ImageView, Z> implements b.a {

    /* renamed from: ˎ, reason: contains not printable characters */
    private Animatable f11674;

    public e(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m12292(Z z5) {
        if (!(z5 instanceof Animatable)) {
            this.f11674 = null;
            return;
        }
        Animatable animatable = (Animatable) z5;
        this.f11674 = animatable;
        animatable.start();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m12293(Z z5) {
        mo12285(z5);
        m12292(z5);
    }

    @Override // v1.a, r1.l
    /* renamed from: ʼ */
    public void mo6091() {
        Animatable animatable = this.f11674;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // v1.a, r1.l
    /* renamed from: ʽ */
    public void mo6092() {
        Animatable animatable = this.f11674;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // v1.a, v1.h
    /* renamed from: ˆ */
    public void mo12283(Drawable drawable) {
        super.mo12283(drawable);
        m12293(null);
        m12294(drawable);
    }

    @Override // v1.h
    /* renamed from: ˉ */
    public void mo9533(Z z5, w1.b<? super Z> bVar) {
        if (bVar == null || !bVar.mo12502(z5, this)) {
            m12293(z5);
        } else {
            m12292(z5);
        }
    }

    @Override // v1.i, v1.a, v1.h
    /* renamed from: ˊ */
    public void mo12284(Drawable drawable) {
        super.mo12284(drawable);
        m12293(null);
        m12294(drawable);
    }

    @Override // v1.i, v1.a, v1.h
    /* renamed from: ˋ */
    public void mo9534(Drawable drawable) {
        super.mo9534(drawable);
        Animatable animatable = this.f11674;
        if (animatable != null) {
            animatable.stop();
        }
        m12293(null);
        m12294(drawable);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m12294(Drawable drawable) {
        ((ImageView) this.f11677).setImageDrawable(drawable);
    }

    /* renamed from: ᴵ */
    protected abstract void mo12285(Z z5);
}
