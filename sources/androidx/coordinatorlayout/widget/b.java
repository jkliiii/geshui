package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: ViewGroupUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<Matrix> f2528 = new ThreadLocal<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final ThreadLocal<RectF> f2529 = new ThreadLocal<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m1923(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m1925(viewGroup, view, rect);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static void m1924(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m1924(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static void m1925(ViewGroup viewGroup, View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = f2528;
        Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        m1924(viewGroup, view, matrix);
        ThreadLocal<RectF> threadLocal2 = f2529;
        RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
