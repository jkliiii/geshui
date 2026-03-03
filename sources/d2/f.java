package d2;

import android.animation.ValueAnimator;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: Sprite.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class f extends Drawable implements ValueAnimator.AnimatorUpdateListener, Animatable, Drawable.Callback {

    /* renamed from: ˈ, reason: contains not printable characters */
    private float f6867;

    /* renamed from: ˉ, reason: contains not printable characters */
    private float f6868;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f6869;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f6870;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f6871;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f6872;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f6873;

    /* renamed from: י, reason: contains not printable characters */
    private int f6874;

    /* renamed from: ـ, reason: contains not printable characters */
    private float f6875;

    /* renamed from: ٴ, reason: contains not printable characters */
    private float f6876;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private ValueAnimator f6877;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static final Rect f6859 = new Rect();

    /* renamed from: ﹳ, reason: contains not printable characters */
    public static final Property<f, Integer> f6860 = new c("rotateX");

    /* renamed from: ﹶ, reason: contains not printable characters */
    public static final Property<f, Integer> f6861 = new d("rotate");

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static final Property<f, Integer> f6862 = new e("rotateY");

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static final Property<f, Integer> f6863 = new C0099f("translateX");

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static final Property<f, Integer> f6857 = new g("translateY");

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public static final Property<f, Float> f6858 = new h("translateXPercentage");

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public static final Property<f, Float> f6852 = new i("translateYPercentage");

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public static final Property<f, Float> f6854 = new j("scaleX");

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static final Property<f, Float> f6853 = new k("scaleY");

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public static final Property<f, Float> f6856 = new a("scale");

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public static final Property<f, Integer> f6855 = new b("alpha");

    /* renamed from: ʾ, reason: contains not printable characters */
    private float f6864 = 1.0f;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f6865 = 1.0f;

    /* renamed from: ˆ, reason: contains not printable characters */
    private float f6866 = 1.0f;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f6878 = 255;

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected Rect f6879 = f6859;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Camera f6880 = new Camera();

    /* renamed from: ᵢ, reason: contains not printable characters */
    private Matrix f6881 = new Matrix();

    /* compiled from: Sprite.java */
    static class a extends b2.b<f> {
        a(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.m8209());
        }

        @Override // b2.b
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5687(f fVar, float f5) {
            fVar.m8197(f5);
        }
    }

    /* compiled from: Sprite.java */
    static class b extends b2.c<f> {
        b(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.getAlpha());
        }

        @Override // b2.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5689(f fVar, int i5) {
            fVar.setAlpha(i5);
        }
    }

    /* compiled from: Sprite.java */
    static class c extends b2.c<f> {
        c(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m8207());
        }

        @Override // b2.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5689(f fVar, int i5) {
            fVar.m8218(i5);
        }
    }

    /* compiled from: Sprite.java */
    static class d extends b2.c<f> {
        d(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m8206());
        }

        @Override // b2.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5689(f fVar, int i5) {
            fVar.m8227(i5);
        }
    }

    /* compiled from: Sprite.java */
    static class e extends b2.c<f> {
        e(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m8208());
        }

        @Override // b2.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5689(f fVar, int i5) {
            fVar.m8220(i5);
        }
    }

    /* compiled from: Sprite.java */
    /* renamed from: d2.f$f, reason: collision with other inner class name */
    static class C0099f extends b2.c<f> {
        C0099f(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m8212());
        }

        @Override // b2.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5689(f fVar, int i5) {
            fVar.m8203(i5);
        }
    }

    /* compiled from: Sprite.java */
    static class g extends b2.c<f> {
        g(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Integer get(f fVar) {
            return Integer.valueOf(fVar.m8214());
        }

        @Override // b2.c
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5689(f fVar, int i5) {
            fVar.m8215(i5);
        }
    }

    /* compiled from: Sprite.java */
    static class h extends b2.b<f> {
        h(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.m8213());
        }

        @Override // b2.b
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5687(f fVar, float f5) {
            fVar.m8201(f5);
        }
    }

    /* compiled from: Sprite.java */
    static class i extends b2.b<f> {
        i(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.m8216());
        }

        @Override // b2.b
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5687(f fVar, float f5) {
            fVar.m8205(f5);
        }
    }

    /* compiled from: Sprite.java */
    static class j extends b2.b<f> {
        j(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.m8210());
        }

        @Override // b2.b
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5687(f fVar, float f5) {
            fVar.m8199(f5);
        }
    }

    /* compiled from: Sprite.java */
    static class k extends b2.b<f> {
        k(String str) {
            super(str);
        }

        @Override // android.util.Property
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.m8211());
        }

        @Override // b2.b
        /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo5687(f fVar, float f5) {
            fVar.m8198(f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int m8212 = m8212();
        if (m8212 == 0) {
            m8212 = (int) (getBounds().width() * m8213());
        }
        int m8214 = m8214();
        if (m8214 == 0) {
            m8214 = (int) (getBounds().height() * m8216());
        }
        canvas.translate(m8212, m8214);
        canvas.scale(m8210(), m8211(), m8202(), m8204());
        canvas.rotate(m8206(), m8202(), m8204());
        if (m8207() != 0 || m8208() != 0) {
            this.f6880.save();
            this.f6880.rotateX(m8207());
            this.f6880.rotateY(m8208());
            this.f6880.getMatrix(this.f6881);
            this.f6881.preTranslate(-m8202(), -m8204());
            this.f6881.postTranslate(m8202(), m8204());
            this.f6880.restore();
            canvas.concat(this.f6881);
        }
        mo8193(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6878;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return b2.a.m5680(this.f6877);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m8224(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f6878 = i5;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (b2.a.m5682(this.f6877)) {
            return;
        }
        ValueAnimator m8217 = m8217();
        this.f6877 = m8217;
        if (m8217 == null) {
            return;
        }
        b2.a.m5683(m8217);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (b2.a.m5682(this.f6877)) {
            this.f6877.removeAllUpdateListeners();
            this.f6877.end();
            m8221();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public Rect m8196(Rect rect) {
        int min = Math.min(rect.width(), rect.height());
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i5 = min / 2;
        return new Rect(centerX - i5, centerY - i5, centerX + i5, centerY + i5);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void m8197(float f5) {
        this.f6864 = f5;
        m8199(f5);
        m8198(f5);
    }

    /* renamed from: ʼ */
    protected abstract void mo8193(Canvas canvas);

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void m8198(float f5) {
        this.f6866 = f5;
    }

    /* renamed from: ʽ */
    public abstract int mo8194();

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m8199(float f5) {
        this.f6865 = f5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public Rect m8200() {
        return this.f6879;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m8201(float f5) {
        this.f6875 = f5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public float m8202() {
        return this.f6867;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m8203(int i5) {
        this.f6872 = i5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public float m8204() {
        return this.f6868;
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public void m8205(float f5) {
        this.f6876 = f5;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public int m8206() {
        return this.f6874;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m8207() {
        return this.f6870;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m8208() {
        return this.f6871;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public float m8209() {
        return this.f6864;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public float m8210() {
        return this.f6865;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public float m8211() {
        return this.f6866;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public int m8212() {
        return this.f6872;
    }

    /* renamed from: י, reason: contains not printable characters */
    public float m8213() {
        return this.f6875;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public int m8214() {
        return this.f6873;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public void m8215(int i5) {
        this.f6873 = i5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public float m8216() {
        return this.f6876;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public ValueAnimator m8217() {
        if (this.f6877 == null) {
            this.f6877 = mo8219();
        }
        ValueAnimator valueAnimator = this.f6877;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(this);
            this.f6877.setStartDelay(this.f6869);
        }
        return this.f6877;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public void m8218(int i5) {
        this.f6870 = i5;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public abstract ValueAnimator mo8219();

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void m8220(int i5) {
        this.f6871 = i5;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m8221() {
        this.f6864 = 1.0f;
        this.f6870 = 0;
        this.f6871 = 0;
        this.f6872 = 0;
        this.f6873 = 0;
        this.f6874 = 0;
        this.f6875 = 0.0f;
        this.f6876 = 0.0f;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public f m8222(int i5) {
        this.f6869 = i5;
        return this;
    }

    /* renamed from: ᵢ */
    public abstract void mo8195(int i5);

    /* renamed from: ⁱ, reason: contains not printable characters */
    public void m8223(int i5, int i6, int i7, int i8) {
        this.f6879 = new Rect(i5, i6, i7, i8);
        m8225(m8200().centerX());
        m8226(m8200().centerY());
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public void m8224(Rect rect) {
        m8223(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m8225(float f5) {
        this.f6867 = f5;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public void m8226(float f5) {
        this.f6868 = f5;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m8227(int i5) {
        this.f6874 = i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
    }
}
