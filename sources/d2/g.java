package d2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* compiled from: SpriteContainer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class g extends f {

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private int f6882;

    /* renamed from: ــ, reason: contains not printable characters */
    private f[] f6883 = mo8253();

    public g() {
        m8250();
        mo8254(this.f6883);
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private void m8250() {
        f[] fVarArr = this.f6883;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setCallback(this);
            }
        }
    }

    @Override // d2.f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo8190(canvas);
    }

    @Override // d2.f, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return b2.a.m5681(this.f6883) || super.isRunning();
    }

    @Override // d2.f, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (f fVar : this.f6883) {
            fVar.setBounds(rect);
        }
    }

    @Override // d2.f, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        b2.a.m5684(this.f6883);
    }

    @Override // d2.f, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        b2.a.m5685(this.f6883);
    }

    @Override // d2.f
    /* renamed from: ʽ */
    public int mo8194() {
        return this.f6882;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public f m8251(int i5) {
        f[] fVarArr = this.f6883;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i5];
    }

    /* renamed from: ˉˉ */
    public void mo8190(Canvas canvas) {
        f[] fVarArr = this.f6883;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                int save = canvas.save();
                fVar.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public int m8252() {
        f[] fVarArr = this.f6883;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public abstract f[] mo8253();

    @Override // d2.f
    /* renamed from: ᴵ */
    public ValueAnimator mo8219() {
        return null;
    }

    @Override // d2.f
    /* renamed from: ᵢ */
    public void mo8195(int i5) {
        this.f6882 = i5;
        for (int i6 = 0; i6 < m8252(); i6++) {
            m8251(i6).mo8195(i5);
        }
    }

    @Override // d2.f
    /* renamed from: ʼ */
    protected void mo8193(Canvas canvas) {
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    public void mo8254(f... fVarArr) {
    }
}
