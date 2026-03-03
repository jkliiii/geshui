package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f1;
import java.util.Map;

/* compiled from: ChangeBounds.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends q {

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final String[] f4443 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: ˉ, reason: contains not printable characters */
    private static final Property<Drawable, PointF> f4444 = new b(PointF.class, "boundsOrigin");

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final Property<k, PointF> f4445 = new C0065c(PointF.class, "topLeft");

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final Property<k, PointF> f4446 = new d(PointF.class, "bottomRight");

    /* renamed from: ˎ, reason: contains not printable characters */
    private static final Property<View, PointF> f4447 = new e(PointF.class, "bottomRight");

    /* renamed from: ˏ, reason: contains not printable characters */
    private static final Property<View, PointF> f4448 = new f(PointF.class, "topLeft");

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final Property<View, PointF> f4449 = new g(PointF.class, "position");

    /* renamed from: י, reason: contains not printable characters */
    private static n f4450 = new n();

    /* renamed from: ʾ, reason: contains not printable characters */
    private int[] f4451 = new int[2];

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean f4452 = false;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f4453 = false;

    /* compiled from: ChangeBounds.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f4454;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ BitmapDrawable f4455;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ View f4456;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ float f4457;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f5) {
            this.f4454 = viewGroup;
            this.f4455 = bitmapDrawable;
            this.f4456 = view;
            this.f4457 = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f0.m5351(this.f4454).remove(this.f4455);
            f0.m5356(this.f4456, this.f4457);
        }
    }

    /* compiled from: ChangeBounds.java */
    static class b extends Property<Drawable, PointF> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Rect f4459;

        b(Class cls, String str) {
            super(cls, str);
            this.f4459 = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f4459);
            Rect rect = this.f4459;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f4459);
            this.f4459.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4459);
        }
    }

    /* compiled from: ChangeBounds.java */
    /* renamed from: androidx.transition.c$c, reason: collision with other inner class name */
    static class C0065c extends Property<k, PointF> {
        C0065c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m5340(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.m5339(pointF);
        }
    }

    /* compiled from: ChangeBounds.java */
    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            f0.m5355(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* compiled from: ChangeBounds.java */
    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            f0.m5355(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* compiled from: ChangeBounds.java */
    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            f0.m5355(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* compiled from: ChangeBounds.java */
    class h extends AnimatorListenerAdapter {
        private k mViewBounds;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ k f4460;

        h(k kVar) {
            this.f4460 = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* compiled from: ChangeBounds.java */
    class i extends AnimatorListenerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f4462;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ View f4463;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ Rect f4464;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ int f4465;

        /* renamed from: ˉ, reason: contains not printable characters */
        final /* synthetic */ int f4466;

        /* renamed from: ˊ, reason: contains not printable characters */
        final /* synthetic */ int f4467;

        /* renamed from: ˋ, reason: contains not printable characters */
        final /* synthetic */ int f4468;

        i(View view, Rect rect, int i5, int i6, int i7, int i8) {
            this.f4463 = view;
            this.f4464 = rect;
            this.f4465 = i5;
            this.f4466 = i6;
            this.f4467 = i7;
            this.f4468 = i8;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4462 = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4462) {
                return;
            }
            f1.m2839(this.f4463, this.f4464);
            f0.m5355(this.f4463, this.f4465, this.f4466, this.f4467, this.f4468);
        }
    }

    /* compiled from: ChangeBounds.java */
    class j extends r {

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f4470 = false;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f4471;

        j(ViewGroup viewGroup) {
            this.f4471 = viewGroup;
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo5334(q qVar) {
            c0.m5343(this.f4471, false);
            this.f4470 = true;
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʽ, reason: contains not printable characters */
        public void mo5335(q qVar) {
            c0.m5343(this.f4471, false);
        }

        @Override // androidx.transition.r, androidx.transition.q.g
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo5336(q qVar) {
            c0.m5343(this.f4471, true);
        }

        @Override // androidx.transition.q.g
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo5337(q qVar) {
            if (!this.f4470) {
                c0.m5343(this.f4471, false);
            }
            qVar.removeListener(this);
        }
    }

    /* compiled from: ChangeBounds.java */
    private static class k {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f4473;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f4474;

        /* renamed from: ʽ, reason: contains not printable characters */
        private int f4475;

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f4476;

        /* renamed from: ʿ, reason: contains not printable characters */
        private View f4477;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f4478;

        /* renamed from: ˈ, reason: contains not printable characters */
        private int f4479;

        k(View view) {
            this.f4477 = view;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m5338() {
            f0.m5355(this.f4477, this.f4473, this.f4474, this.f4475, this.f4476);
            this.f4478 = 0;
            this.f4479 = 0;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m5339(PointF pointF) {
            this.f4475 = Math.round(pointF.x);
            this.f4476 = Math.round(pointF.y);
            int i5 = this.f4479 + 1;
            this.f4479 = i5;
            if (this.f4478 == i5) {
                m5338();
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m5340(PointF pointF) {
            this.f4473 = Math.round(pointF.x);
            this.f4474 = Math.round(pointF.y);
            int i5 = this.f4478 + 1;
            this.f4478 = i5;
            if (i5 == this.f4479) {
                m5338();
            }
        }
    }

    private void captureValues(x xVar) {
        View view = xVar.f4581;
        if (!f1.m2808(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        xVar.f4580.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        xVar.f4580.put("android:changeBounds:parent", xVar.f4581.getParent());
        if (this.f4453) {
            xVar.f4581.getLocationInWindow(this.f4451);
            xVar.f4580.put("android:changeBounds:windowX", Integer.valueOf(this.f4451[0]));
            xVar.f4580.put("android:changeBounds:windowY", Integer.valueOf(this.f4451[1]));
        }
        if (this.f4452) {
            xVar.f4580.put("android:changeBounds:clip", f1.m2900(view));
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m5321(View view, View view2) {
        if (!this.f4453) {
            return true;
        }
        x matchedTransitionValues = getMatchedTransitionValues(view, true);
        if (matchedTransitionValues == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == matchedTransitionValues.f4581) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.q
    public void captureEndValues(x xVar) {
        captureValues(xVar);
    }

    @Override // androidx.transition.q
    public void captureStartValues(x xVar) {
        captureValues(xVar);
    }

    @Override // androidx.transition.q
    public Animator createAnimator(ViewGroup viewGroup, x xVar, x xVar2) {
        int i5;
        View view;
        int i6;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator m5423;
        if (xVar == null || xVar2 == null) {
            return null;
        }
        Map<String, Object> map = xVar.f4580;
        Map<String, Object> map2 = xVar2.f4580;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = xVar2.f4581;
        if (!m5321(viewGroup2, viewGroup3)) {
            int intValue = ((Integer) xVar.f4580.get("android:changeBounds:windowX")).intValue();
            int intValue2 = ((Integer) xVar.f4580.get("android:changeBounds:windowY")).intValue();
            int intValue3 = ((Integer) xVar2.f4580.get("android:changeBounds:windowX")).intValue();
            int intValue4 = ((Integer) xVar2.f4580.get("android:changeBounds:windowY")).intValue();
            if (intValue == intValue3 && intValue2 == intValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.f4451);
            Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(createBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
            float m5352 = f0.m5352(view2);
            f0.m5356(view2, 0.0f);
            f0.m5351(viewGroup).add(bitmapDrawable);
            androidx.transition.h pathMotion = getPathMotion();
            int[] iArr = this.f4451;
            int i7 = iArr[0];
            int i8 = iArr[1];
            ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, l.m5378(f4444, pathMotion.getPath(intValue - i7, intValue2 - i8, intValue3 - i7, intValue4 - i8)));
            ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, m5352));
            return ofPropertyValuesHolder;
        }
        Rect rect2 = (Rect) xVar.f4580.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) xVar2.f4580.get("android:changeBounds:bounds");
        int i9 = rect2.left;
        int i10 = rect3.left;
        int i11 = rect2.top;
        int i12 = rect3.top;
        int i13 = rect2.right;
        int i14 = rect3.right;
        int i15 = rect2.bottom;
        int i16 = rect3.bottom;
        int i17 = i13 - i9;
        int i18 = i15 - i11;
        int i19 = i14 - i10;
        int i20 = i16 - i12;
        Rect rect4 = (Rect) xVar.f4580.get("android:changeBounds:clip");
        Rect rect5 = (Rect) xVar2.f4580.get("android:changeBounds:clip");
        if ((i17 == 0 || i18 == 0) && (i19 == 0 || i20 == 0)) {
            i5 = 0;
        } else {
            i5 = (i9 == i10 && i11 == i12) ? 0 : 1;
            if (i13 != i14 || i15 != i16) {
                i5++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i5++;
        }
        if (i5 <= 0) {
            return null;
        }
        if (this.f4452) {
            view = view2;
            f0.m5355(view, i9, i11, Math.max(i17, i19) + i9, Math.max(i18, i20) + i11);
            ObjectAnimator m5364 = (i9 == i10 && i11 == i12) ? null : androidx.transition.g.m5364(view, f4449, getPathMotion().getPath(i9, i11, i10, i12));
            if (rect4 == null) {
                i6 = 0;
                rect = new Rect(0, 0, i17, i18);
            } else {
                i6 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i6, i6, i19, i20) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                f1.m2839(view, rect);
                n nVar = f4450;
                Object[] objArr = new Object[2];
                objArr[i6] = rect;
                objArr[1] = rect6;
                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", nVar, objArr);
                ofObject.addListener(new i(view, rect5, i10, i12, i14, i16));
                objectAnimator = ofObject;
            }
            m5423 = w.m5423(m5364, objectAnimator);
        } else {
            view = view2;
            f0.m5355(view, i9, i11, i13, i15);
            if (i5 != 2) {
                m5423 = (i9 == i10 && i11 == i12) ? androidx.transition.g.m5364(view, f4447, getPathMotion().getPath(i13, i15, i14, i16)) : androidx.transition.g.m5364(view, f4448, getPathMotion().getPath(i9, i11, i10, i12));
            } else if (i17 == i19 && i18 == i20) {
                m5423 = androidx.transition.g.m5364(view, f4449, getPathMotion().getPath(i9, i11, i10, i12));
            } else {
                k kVar = new k(view);
                ObjectAnimator m53642 = androidx.transition.g.m5364(kVar, f4445, getPathMotion().getPath(i9, i11, i10, i12));
                ObjectAnimator m53643 = androidx.transition.g.m5364(kVar, f4446, getPathMotion().getPath(i13, i15, i14, i16));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(m53642, m53643);
                animatorSet.addListener(new h(kVar));
                m5423 = animatorSet;
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            c0.m5343(viewGroup4, true);
            addListener(new j(viewGroup4));
        }
        return m5423;
    }

    @Override // androidx.transition.q
    public String[] getTransitionProperties() {
        return f4443;
    }
}
