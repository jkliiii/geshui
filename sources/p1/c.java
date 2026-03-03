package p1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import c1.l;
import java.nio.ByteBuffer;
import java.util.List;
import p1.g;
import y1.k;

/* compiled from: GifDrawable.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends Drawable implements g.b, Animatable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final a f10174;

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f10175;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f10176;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f10177;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f10178;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f10179;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f10180;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f10181;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Paint f10182;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Rect f10183;

    /* renamed from: י, reason: contains not printable characters */
    private List<androidx.vectordrawable.graphics.drawable.b> f10184;

    /* compiled from: GifDrawable.java */
    static final class a extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        final g f10185;

        a(g gVar) {
            this.f10185 = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }
    }

    public c(Context context, b1.a aVar, l<Bitmap> lVar, int i5, int i6, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.m6011(context), aVar, i5, i6, lVar, bitmap)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    private Drawable.Callback m11023() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Rect m11024() {
        if (this.f10183 == null) {
            this.f10183 = new Rect();
        }
        return this.f10183;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private Paint m11025() {
        if (this.f10182 == null) {
            this.f10182 = new Paint(2);
        }
        return this.f10182;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m11026() {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f10184;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f10184.get(i5).mo5425(this);
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m11027() {
        this.f10179 = 0;
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m11028() {
        k.m12890(!this.f10177, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f10174.f10185.m11050() == 1) {
            invalidateSelf();
        } else {
            if (this.f10175) {
                return;
            }
            this.f10175 = true;
            this.f10174.f10185.m11056(this);
            invalidateSelf();
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m11029() {
        this.f10175 = false;
        this.f10174.f10185.m11057(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f10177) {
            return;
        }
        if (this.f10181) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m11024());
            this.f10181 = false;
        }
        canvas.drawBitmap(this.f10174.f10185.m11047(), (Rect) null, m11024(), m11025());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f10174;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10174.f10185.m11051();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10174.f10185.m11053();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f10175;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10181 = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        m11025().setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m11025().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        k.m12890(!this.f10177, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f10178 = z5;
        if (!z5) {
            m11029();
        } else if (this.f10176) {
            m11028();
        }
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f10176 = true;
        m11027();
        if (this.f10178) {
            m11028();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f10176 = false;
        m11029();
    }

    @Override // p1.g.b
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo11030() {
        if (m11023() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m11034() == m11033() - 1) {
            this.f10179++;
        }
        int i5 = this.f10180;
        if (i5 == -1 || this.f10179 < i5) {
            return;
        }
        m11026();
        stop();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public ByteBuffer m11031() {
        return this.f10174.f10185.m11046();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Bitmap m11032() {
        return this.f10174.f10185.m11049();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m11033() {
        return this.f10174.f10185.m11050();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m11034() {
        return this.f10174.f10185.m11048();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m11035() {
        return this.f10174.f10185.m11052();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m11036() {
        this.f10177 = true;
        this.f10174.f10185.m11045();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m11037(l<Bitmap> lVar, Bitmap bitmap) {
        this.f10174.f10185.m11055(lVar, bitmap);
    }

    c(a aVar) {
        this.f10178 = true;
        this.f10180 = -1;
        this.f10174 = (a) k.m12893(aVar);
    }
}
