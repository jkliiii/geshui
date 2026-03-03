package com.google.android.material.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.l0;
import androidx.transition.q;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;

/* compiled from: TransitionUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final RectF f6515 = new RectF();

    /* compiled from: TransitionUtils.java */
    class a implements b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ RectF f6516;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ RectF f6517;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ float f6518;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ float f6519;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ float f6520;

        a(RectF rectF, RectF rectF2, float f5, float f6, float f7) {
            this.f6516 = rectF;
            this.f6517 = rectF2;
            this.f6518 = f5;
            this.f6519 = f6;
            this.f6520 = f7;
        }

        @Override // com.google.android.material.transition.k.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public CornerSize mo7709(CornerSize cornerSize, CornerSize cornerSize2) {
            return new AbsoluteCornerSize(k.m7698(cornerSize.getCornerSize(this.f6516), cornerSize2.getCornerSize(this.f6517), this.f6518, this.f6519, this.f6520));
        }
    }

    /* compiled from: TransitionUtils.java */
    interface b {
        /* renamed from: ʻ */
        CornerSize mo7709(CornerSize cornerSize, CornerSize cornerSize2);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static float m7687(RectF rectF) {
        return rectF.width() * rectF.height();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static ShapeAppearanceModel m7688(ShapeAppearanceModel shapeAppearanceModel, final RectF rectF) {
        return shapeAppearanceModel.withTransformedCornerSizes(new ShapeAppearanceModel.CornerSizeUnaryOperator() { // from class: com.google.android.material.transition.j
            @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
            public final CornerSize apply(CornerSize cornerSize) {
                return RelativeCornerSize.createFromCornerSize(rectF, cornerSize);
            }
        });
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static Shader m7689(int i5) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i5, i5, Shader.TileMode.CLAMP);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static <T> T m7690(T t5, T t6) {
        return t5 != null ? t5 : t6;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static View m7691(View view, int i5) {
        String resourceName = view.getResources().getResourceName(i5);
        while (view != null) {
            if (view.getId() != i5) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } else {
                return view;
            }
        }
        throw new IllegalArgumentException(resourceName + " is not a valid ancestor");
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static View m7692(View view, int i5) {
        View findViewById = view.findViewById(i5);
        return findViewById != null ? findViewById : m7691(view, i5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static RectF m7693(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new RectF(iArr[0], iArr[1], view.getWidth() + r1, view.getHeight() + r0);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static RectF m7694(View view) {
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static boolean m7695(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        return (shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getTopRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(rectF) == 0.0f && shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(rectF) == 0.0f) ? false : true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static float m7697(float f5, float f6, float f7) {
        return f5 + (f7 * (f6 - f5));
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static float m7698(float f5, float f6, float f7, float f8, float f9) {
        return m7699(f5, f6, f7, f8, f9, false);
    }

    /* renamed from: י, reason: contains not printable characters */
    static float m7699(float f5, float f6, float f7, float f8, float f9, boolean z5) {
        return (!z5 || (f9 >= 0.0f && f9 <= 1.0f)) ? f9 < f7 ? f5 : f9 > f8 ? f6 : m7697(f5, f6, (f9 - f7) / (f8 - f7)) : m7697(f5, f6, f9);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    static int m7700(int i5, int i6, float f5, float f6, float f7) {
        return f7 < f5 ? i5 : f7 > f6 ? i6 : (int) m7697(i5, i6, (f7 - f5) / (f6 - f5));
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    static ShapeAppearanceModel m7701(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, float f5, float f6, float f7) {
        return f7 < f5 ? shapeAppearanceModel : f7 > f6 ? shapeAppearanceModel2 : m7708(shapeAppearanceModel, shapeAppearanceModel2, rectF, new a(rectF, rectF2, f5, f6, f7));
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    static boolean m7702(q qVar, Context context, int i5) {
        int resolveThemeDuration;
        if (i5 == 0 || qVar.getDuration() != -1 || (resolveThemeDuration = MotionUtils.resolveThemeDuration(context, i5, -1)) == -1) {
            return false;
        }
        qVar.setDuration(resolveThemeDuration);
        return true;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    static boolean m7703(q qVar, Context context, int i5, TimeInterpolator timeInterpolator) {
        if (i5 == 0 || qVar.getInterpolator() != null) {
            return false;
        }
        qVar.setInterpolator(MotionUtils.resolveThemeInterpolator(context, i5, timeInterpolator));
        return true;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    static boolean m7704(q qVar, Context context, int i5) {
        androidx.transition.h m7705;
        if (i5 == 0 || (m7705 = m7705(context, i5)) == null) {
            return false;
        }
        qVar.setPathMotion(m7705);
        return true;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    static androidx.transition.h m7705(Context context, int i5) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.type;
        if (i6 != 16) {
            if (i6 == 3) {
                return new androidx.transition.j(l0.m2305(String.valueOf(typedValue.string)));
            }
            throw new IllegalArgumentException("Motion path theme attribute must either be an enum value or path data string");
        }
        int i7 = typedValue.data;
        if (i7 == 0) {
            return null;
        }
        if (i7 == 1) {
            return new MaterialArcMotion();
        }
        throw new IllegalArgumentException("Invalid motion path type: " + i7);
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private static int m7706(Canvas canvas, Rect rect, int i5) {
        RectF rectF = f6515;
        rectF.set(rect);
        return Build.VERSION.SDK_INT >= 21 ? canvas.saveLayerAlpha(rectF, i5) : canvas.saveLayerAlpha(rectF.left, rectF.top, rectF.right, rectF.bottom, i5, 31);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    static void m7707(Canvas canvas, Rect rect, float f5, float f6, float f7, int i5, CanvasCompat.CanvasOperation canvasOperation) {
        if (i5 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(f5, f6);
        canvas.scale(f7, f7);
        if (i5 < 255) {
            m7706(canvas, rect, i5);
        }
        canvasOperation.run(canvas);
        canvas.restoreToCount(save);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    static ShapeAppearanceModel m7708(ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, b bVar) {
        return (m7695(shapeAppearanceModel, rectF) ? shapeAppearanceModel : shapeAppearanceModel2).toBuilder().setTopLeftCornerSize(bVar.mo7709(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel2.getTopLeftCornerSize())).setTopRightCornerSize(bVar.mo7709(shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel2.getTopRightCornerSize())).setBottomLeftCornerSize(bVar.mo7709(shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel2.getBottomLeftCornerSize())).setBottomRightCornerSize(bVar.mo7709(shapeAppearanceModel.getBottomRightCornerSize(), shapeAppearanceModel2.getBottomRightCornerSize())).build();
    }
}
