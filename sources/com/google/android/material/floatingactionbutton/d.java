package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ImageMatrixProperty;
import com.google.android.material.animation.MatrixEvaluator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.StateListAnimator;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shadow.ShadowViewDelegate;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FloatingActionButtonImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    ShapeAppearanceModel f5762;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private ViewTreeObserver.OnPreDrawListener f5763;

    /* renamed from: ʼ, reason: contains not printable characters */
    MaterialShapeDrawable f5764;

    /* renamed from: ʽ, reason: contains not printable characters */
    Drawable f5765;

    /* renamed from: ʾ, reason: contains not printable characters */
    com.google.android.material.floatingactionbutton.c f5766;

    /* renamed from: ʿ, reason: contains not printable characters */
    Drawable f5767;

    /* renamed from: ˆ, reason: contains not printable characters */
    boolean f5768;

    /* renamed from: ˉ, reason: contains not printable characters */
    float f5770;

    /* renamed from: ˊ, reason: contains not printable characters */
    float f5771;

    /* renamed from: ˋ, reason: contains not printable characters */
    float f5772;

    /* renamed from: ˎ, reason: contains not printable characters */
    int f5773;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final StateListAnimator f5774;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Animator f5775;

    /* renamed from: י, reason: contains not printable characters */
    private MotionSpec f5776;

    /* renamed from: ـ, reason: contains not printable characters */
    private MotionSpec f5777;

    /* renamed from: ٴ, reason: contains not printable characters */
    private float f5778;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f5781;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private ArrayList<Animator.AnimatorListener> f5784;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private ArrayList<Animator.AnimatorListener> f5785;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private ArrayList<j> f5786;

    /* renamed from: ﹳ, reason: contains not printable characters */
    final FloatingActionButton f5787;

    /* renamed from: ﹶ, reason: contains not printable characters */
    final ShadowViewDelegate f5788;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    static final TimeInterpolator f5752 = AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final int f5751 = R.attr.motionDurationLong2;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private static final int f5754 = R.attr.motionEasingEmphasizedInterpolator;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private static final int f5753 = R.attr.motionDurationMedium1;

    /* renamed from: ــ, reason: contains not printable characters */
    private static final int f5761 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    static final int[] f5755 = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: ˉˉ, reason: contains not printable characters */
    static final int[] f5757 = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: ˈˈ, reason: contains not printable characters */
    static final int[] f5756 = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* renamed from: ˋˋ, reason: contains not printable characters */
    static final int[] f5759 = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* renamed from: ˊˊ, reason: contains not printable characters */
    static final int[] f5758 = {android.R.attr.state_enabled};

    /* renamed from: ˏˏ, reason: contains not printable characters */
    static final int[] f5760 = new int[0];

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f5769 = true;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private float f5779 = 1.0f;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f5783 = 0;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private final Rect f5789 = new Rect();

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private final RectF f5790 = new RectF();

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private final RectF f5780 = new RectF();

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final Matrix f5782 = new Matrix();

    /* compiled from: FloatingActionButtonImpl.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f5791;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ boolean f5792;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ k f5793;

        a(boolean z5, k kVar) {
            this.f5792 = z5;
            this.f5793 = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5791 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f5783 = 0;
            d.this.f5775 = null;
            if (this.f5791) {
                return;
            }
            FloatingActionButton floatingActionButton = d.this.f5787;
            boolean z5 = this.f5792;
            floatingActionButton.internalSetVisibility(z5 ? 8 : 4, z5);
            k kVar = this.f5793;
            if (kVar != null) {
                kVar.mo6812();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f5787.internalSetVisibility(0, this.f5792);
            d.this.f5783 = 1;
            d.this.f5775 = animator;
            this.f5791 = false;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class b extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ boolean f5795;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ k f5796;

        b(boolean z5, k kVar) {
            this.f5795 = z5;
            this.f5796 = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.f5783 = 0;
            d.this.f5775 = null;
            k kVar = this.f5796;
            if (kVar != null) {
                kVar.mo6811();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            d.this.f5787.internalSetVisibility(0, this.f5795);
            d.this.f5783 = 2;
            d.this.f5775 = animator;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class c extends MatrixEvaluator {
        c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.android.material.animation.MatrixEvaluator, android.animation.TypeEvaluator
        public Matrix evaluate(float f5, Matrix matrix, Matrix matrix2) {
            d.this.f5779 = f5;
            return super.evaluate(f5, matrix, matrix2);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    /* renamed from: com.google.android.material.floatingactionbutton.d$d, reason: collision with other inner class name */
    class C0082d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ float f5799;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f5800;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ float f5801;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ float f5802;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ float f5803;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ float f5804;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ float f5805;

        /* renamed from: ˎ, reason: contains not printable characters */
        final /* synthetic */ Matrix f5806;

        C0082d(float f5, float f6, float f7, float f8, float f9, float f10, float f11, Matrix matrix) {
            this.f5799 = f5;
            this.f5800 = f6;
            this.f5801 = f7;
            this.f5802 = f8;
            this.f5803 = f9;
            this.f5804 = f10;
            this.f5805 = f11;
            this.f5806 = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f5787.setAlpha(AnimationUtils.lerp(this.f5799, this.f5800, 0.0f, 0.2f, floatValue));
            d.this.f5787.setScaleX(AnimationUtils.lerp(this.f5801, this.f5802, floatValue));
            d.this.f5787.setScaleY(AnimationUtils.lerp(this.f5803, this.f5802, floatValue));
            d.this.f5779 = AnimationUtils.lerp(this.f5804, this.f5805, floatValue);
            d.this.m6840(AnimationUtils.lerp(this.f5804, this.f5805, floatValue), this.f5806);
            d.this.f5787.setImageMatrix(this.f5806);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class e implements TypeEvaluator<Float> {

        /* renamed from: ʻ, reason: contains not printable characters */
        FloatEvaluator f5808 = new FloatEvaluator();

        e() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float evaluate(float f5, Float f6, Float f7) {
            float floatValue = this.f5808.evaluate(f5, (Number) f6, (Number) f7).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    class f implements ViewTreeObserver.OnPreDrawListener {
        f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            d.this.m6864();
            return true;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class g extends m {
        g() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        /* renamed from: ʻ, reason: contains not printable characters */
        protected float mo6899() {
            return 0.0f;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class h extends m {
        h() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        /* renamed from: ʻ */
        protected float mo6899() {
            d dVar = d.this;
            return dVar.f5770 + dVar.f5771;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class i extends m {
        i() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        /* renamed from: ʻ */
        protected float mo6899() {
            d dVar = d.this;
            return dVar.f5770 + dVar.f5772;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface j {
        /* renamed from: ʻ */
        void mo6813();

        /* renamed from: ʼ */
        void mo6814();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    interface k {
        /* renamed from: ʻ */
        void mo6811();

        /* renamed from: ʼ */
        void mo6812();
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private class l extends m {
        l() {
            super(d.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.d.m
        /* renamed from: ʻ */
        protected float mo6899() {
            return d.this.f5770;
        }
    }

    /* compiled from: FloatingActionButtonImpl.java */
    private abstract class m extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f5815;

        /* renamed from: ʿ, reason: contains not printable characters */
        private float f5816;

        /* renamed from: ˆ, reason: contains not printable characters */
        private float f5817;

        private m() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d.this.m6857((int) this.f5817);
            this.f5815 = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f5815) {
                MaterialShapeDrawable materialShapeDrawable = d.this.f5764;
                this.f5816 = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.getElevation();
                this.f5817 = mo6899();
                this.f5815 = true;
            }
            d dVar = d.this;
            float f5 = this.f5816;
            dVar.m6857((int) (f5 + ((this.f5817 - f5) * valueAnimator.getAnimatedFraction())));
        }

        /* renamed from: ʻ */
        protected abstract float mo6899();

        /* synthetic */ m(d dVar, a aVar) {
            this();
        }
    }

    d(FloatingActionButton floatingActionButton, ShadowViewDelegate shadowViewDelegate) {
        this.f5787 = floatingActionButton;
        this.f5788 = shadowViewDelegate;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.f5774 = stateListAnimator;
        stateListAnimator.addState(f5755, m6843(new i()));
        stateListAnimator.addState(f5757, m6843(new h()));
        stateListAnimator.addState(f5756, m6843(new h()));
        stateListAnimator.addState(f5759, m6843(new h()));
        stateListAnimator.addState(f5758, m6843(new l()));
        stateListAnimator.addState(f5760, m6843(new g()));
        this.f5778 = floatingActionButton.getRotation();
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private boolean m6835() {
        return f1.m2808(this.f5787) && !this.f5787.isInEditMode();
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    private void m6836(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public void m6840(float f5, Matrix matrix) {
        matrix.reset();
        if (this.f5787.getDrawable() == null || this.f5781 == 0) {
            return;
        }
        RectF rectF = this.f5790;
        RectF rectF2 = this.f5780;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        int i5 = this.f5781;
        rectF2.set(0.0f, 0.0f, i5, i5);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i6 = this.f5781;
        matrix.postScale(f5, f5, i6 / 2.0f, i6 / 2.0f);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private AnimatorSet m6841(MotionSpec motionSpec, float f5, float f6, float f7) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f5787, (Property<FloatingActionButton, Float>) View.ALPHA, f5);
        motionSpec.getTiming("opacity").apply(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f5787, (Property<FloatingActionButton, Float>) View.SCALE_X, f6);
        motionSpec.getTiming("scale").apply(ofFloat2);
        m6836(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f5787, (Property<FloatingActionButton, Float>) View.SCALE_Y, f6);
        motionSpec.getTiming("scale").apply(ofFloat3);
        m6836(ofFloat3);
        arrayList.add(ofFloat3);
        m6840(f7, this.f5782);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f5787, new ImageMatrixProperty(), new c(), new Matrix(this.f5782));
        motionSpec.getTiming("iconScale").apply(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private AnimatorSet m6842(float f5, float f6, float f7, int i5, int i6) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new C0082d(this.f5787.getAlpha(), f5, this.f5787.getScaleX(), f6, this.f5787.getScaleY(), this.f5779, f7, new Matrix(this.f5782)));
        arrayList.add(ofFloat);
        AnimatorSetCompat.playTogether(animatorSet, arrayList);
        animatorSet.setDuration(MotionUtils.resolveThemeDuration(this.f5787.getContext(), i5, this.f5787.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(MotionUtils.resolveThemeInterpolator(this.f5787.getContext(), i6, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private ValueAnimator m6843(m mVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f5752);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mVar);
        valueAnimator.addUpdateListener(mVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private ViewTreeObserver.OnPreDrawListener m6844() {
        if (this.f5763 == null) {
            this.f5763 = new f();
        }
        return this.f5763;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    void m6845() {
        MaterialShapeDrawable materialShapeDrawable = this.f5764;
        if (materialShapeDrawable != null) {
            MaterialShapeUtils.setParentAbsoluteElevation(this.f5787, materialShapeDrawable);
        }
        if (mo6870()) {
            this.f5787.getViewTreeObserver().addOnPreDrawListener(m6844());
        }
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final void m6846(float f5) {
        if (this.f5772 != f5) {
            this.f5772 = f5;
            mo6860(this.f5770, this.f5771, f5);
        }
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    void mo6847(ColorStateList colorStateList) {
        Drawable drawable = this.f5765;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2210(drawable, RippleUtils.sanitizeRippleDrawableColor(colorStateList));
        }
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    void m6848(boolean z5) {
        this.f5769 = z5;
        m6856();
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    final void m6849(ShapeAppearanceModel shapeAppearanceModel) {
        this.f5762 = shapeAppearanceModel;
        MaterialShapeDrawable materialShapeDrawable = this.f5764;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModel);
        }
        Object obj = this.f5765;
        if (obj instanceof Shapeable) {
            ((Shapeable) obj).setShapeAppearanceModel(shapeAppearanceModel);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f5766;
        if (cVar != null) {
            cVar.m6833(shapeAppearanceModel);
        }
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    final void m6850(MotionSpec motionSpec) {
        this.f5776 = motionSpec;
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    boolean mo6851() {
        return true;
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    final boolean m6852() {
        return !this.f5768 || this.f5787.getSizeDimension() >= this.f5773;
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    void m6853(k kVar, boolean z5) {
        if (m6882()) {
            return;
        }
        Animator animator = this.f5775;
        if (animator != null) {
            animator.cancel();
        }
        boolean z6 = this.f5776 == null;
        if (!m6835()) {
            this.f5787.internalSetVisibility(0, z5);
            this.f5787.setAlpha(1.0f);
            this.f5787.setScaleY(1.0f);
            this.f5787.setScaleX(1.0f);
            m6893(1.0f);
            if (kVar != null) {
                kVar.mo6811();
                return;
            }
            return;
        }
        if (this.f5787.getVisibility() != 0) {
            this.f5787.setAlpha(0.0f);
            this.f5787.setScaleY(z6 ? 0.4f : 0.0f);
            this.f5787.setScaleX(z6 ? 0.4f : 0.0f);
            m6893(z6 ? 0.4f : 0.0f);
        }
        MotionSpec motionSpec = this.f5776;
        AnimatorSet m6841 = motionSpec != null ? m6841(motionSpec, 1.0f, 1.0f, 1.0f) : m6842(1.0f, 1.0f, 1.0f, f5751, f5754);
        m6841.addListener(new b(z5, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f5784;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m6841.addListener(it.next());
            }
        }
        m6841.start();
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    void mo6854() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f5778 % 90.0f != 0.0f) {
                if (this.f5787.getLayerType() != 1) {
                    this.f5787.setLayerType(1, null);
                }
            } else if (this.f5787.getLayerType() != 0) {
                this.f5787.setLayerType(0, null);
            }
        }
        MaterialShapeDrawable materialShapeDrawable = this.f5764;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShadowCompatRotation((int) this.f5778);
        }
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    final void m6855() {
        m6893(this.f5779);
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    final void m6856() {
        Rect rect = this.f5789;
        mo6884(rect);
        m6878(rect);
        this.f5788.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    void m6857(float f5) {
        MaterialShapeDrawable materialShapeDrawable = this.f5764;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f5);
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    void m6858() {
        ViewTreeObserver viewTreeObserver = this.f5787.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f5763;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f5763 = null;
        }
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    void mo6860(float f5, float f6, float f7) {
        mo6883();
        m6856();
        m6857(f5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public void m6861(Animator.AnimatorListener animatorListener) {
        if (this.f5785 == null) {
            this.f5785 = new ArrayList<>();
        }
        this.f5785.add(animatorListener);
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    void mo6862(int[] iArr) {
        this.f5774.setState(iArr);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    void m6863(Animator.AnimatorListener animatorListener) {
        if (this.f5784 == null) {
            this.f5784 = new ArrayList<>();
        }
        this.f5784.add(animatorListener);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    void m6864() {
        float rotation = this.f5787.getRotation();
        if (this.f5778 != rotation) {
            this.f5778 = rotation;
            mo6854();
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m6865(j jVar) {
        if (this.f5786 == null) {
            this.f5786 = new ArrayList<>();
        }
        this.f5786.add(jVar);
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    void m6866() {
        ArrayList<j> arrayList = this.f5786;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6813();
            }
        }
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    void m6867() {
        ArrayList<j> arrayList = this.f5786;
        if (arrayList != null) {
            Iterator<j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo6814();
            }
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    void m6868(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f5784;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m6869(Animator.AnimatorListener animatorListener) {
        ArrayList<Animator.AnimatorListener> arrayList = this.f5785;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(animatorListener);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    boolean mo6870() {
        return true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    MaterialShapeDrawable mo6871() {
        return new MaterialShapeDrawable((ShapeAppearanceModel) androidx.core.util.h.m2583(this.f5762));
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m6872(j jVar) {
        ArrayList<j> arrayList = this.f5786;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    final Drawable m6873() {
        return this.f5767;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m6874(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f5764;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.c cVar = this.f5766;
        if (cVar != null) {
            cVar.m6830(colorStateList);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    float mo6875() {
        return this.f5770;
    }

    /* renamed from: יי, reason: contains not printable characters */
    final void m6876(float f5) {
        if (this.f5770 != f5) {
            this.f5770 = f5;
            mo6860(f5, this.f5771, this.f5772);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    boolean m6877() {
        return this.f5768;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    void m6878(Rect rect) {
        androidx.core.util.h.m2584(this.f5767, "Didn't initialize content background");
        if (!mo6851()) {
            this.f5788.setBackgroundDrawable(this.f5767);
        } else {
            this.f5788.setBackgroundDrawable(new InsetDrawable(this.f5767, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    final MotionSpec m6879() {
        return this.f5777;
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    final void m6880(int i5) {
        if (this.f5781 != i5) {
            this.f5781 = i5;
            m6855();
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    float m6881() {
        return this.f5771;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    boolean m6882() {
        return this.f5787.getVisibility() != 0 ? this.f5783 == 2 : this.f5783 != 1;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    void mo6883() {
        this.f5774.jumpToCurrentState();
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void mo6884(Rect rect) {
        int m6892 = m6892();
        int max = Math.max(m6892, (int) Math.ceil(this.f5769 ? mo6875() + this.f5772 : 0.0f));
        int max2 = Math.max(m6892, (int) Math.ceil(r1 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    void m6885(boolean z5) {
        this.f5768 = z5;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    float m6886() {
        return this.f5772;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    void m6887(PorterDuff.Mode mode) {
        MaterialShapeDrawable materialShapeDrawable = this.f5764;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setTintMode(mode);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    final ShapeAppearanceModel m6888() {
        return this.f5762;
    }

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    final void m6889(MotionSpec motionSpec) {
        this.f5777 = motionSpec;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    final MotionSpec m6890() {
        return this.f5776;
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    final void m6891(float f5) {
        if (this.f5771 != f5) {
            this.f5771 = f5;
            mo6860(this.f5770, f5, this.f5772);
        }
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    int m6892() {
        if (this.f5768) {
            return Math.max((this.f5773 - this.f5787.getSizeDimension()) / 2, 0);
        }
        return 0;
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    final void m6893(float f5) {
        this.f5779 = f5;
        Matrix matrix = this.f5782;
        m6840(f5, matrix);
        this.f5787.setImageMatrix(matrix);
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m6894(k kVar, boolean z5) {
        if (m6897()) {
            return;
        }
        Animator animator = this.f5775;
        if (animator != null) {
            animator.cancel();
        }
        if (!m6835()) {
            this.f5787.internalSetVisibility(z5 ? 8 : 4, z5);
            if (kVar != null) {
                kVar.mo6812();
                return;
            }
            return;
        }
        MotionSpec motionSpec = this.f5777;
        AnimatorSet m6841 = motionSpec != null ? m6841(motionSpec, 0.0f, 0.0f, 0.0f) : m6842(0.0f, 0.4f, 0.4f, f5753, f5761);
        m6841.addListener(new a(z5, kVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.f5785;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                m6841.addListener(it.next());
            }
        }
        m6841.start();
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    void m6895(int i5) {
        this.f5773 = i5;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    void mo6896(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i5) {
        MaterialShapeDrawable mo6871 = mo6871();
        this.f5764 = mo6871;
        mo6871.setTintList(colorStateList);
        if (mode != null) {
            this.f5764.setTintMode(mode);
        }
        this.f5764.setShadowColor(-12303292);
        this.f5764.initializeElevationOverlay(this.f5787.getContext());
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.f5764.getShapeAppearanceModel());
        rippleDrawableCompat.setTintList(RippleUtils.sanitizeRippleDrawableColor(colorStateList2));
        this.f5765 = rippleDrawableCompat;
        this.f5767 = new LayerDrawable(new Drawable[]{(Drawable) androidx.core.util.h.m2583(this.f5764), rippleDrawableCompat});
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    boolean m6897() {
        return this.f5787.getVisibility() == 0 ? this.f5783 == 1 : this.f5783 != 2;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    void mo6859() {
    }
}
