package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.t6;
import androidx.core.view.u0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    public interface OnApplyWindowInsetsListener {
        f5 onApplyWindowInsets(View view, f5 f5Var, RelativePadding relativePadding);
    }

    class a implements OnApplyWindowInsetsListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ boolean f5850;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ boolean f5851;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ boolean f5852;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ OnApplyWindowInsetsListener f5853;

        a(boolean z5, boolean z6, boolean z7, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            this.f5850 = z5;
            this.f5851 = z6;
            this.f5852 = z7;
            this.f5853 = onApplyWindowInsetsListener;
        }

        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public f5 onApplyWindowInsets(View view, f5 f5Var, RelativePadding relativePadding) {
            if (this.f5850) {
                relativePadding.bottom += f5Var.m3073();
            }
            boolean isLayoutRtl = ViewUtils.isLayoutRtl(view);
            if (this.f5851) {
                if (isLayoutRtl) {
                    relativePadding.end += f5Var.m3074();
                } else {
                    relativePadding.start += f5Var.m3074();
                }
            }
            if (this.f5852) {
                if (isLayoutRtl) {
                    relativePadding.start += f5Var.m3075();
                } else {
                    relativePadding.end += f5Var.m3075();
                }
            }
            relativePadding.applyToView(view);
            OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f5853;
            return onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(view, f5Var, relativePadding) : f5Var;
        }
    }

    class b implements u0 {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ OnApplyWindowInsetsListener f5854;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ RelativePadding f5855;

        b(OnApplyWindowInsetsListener onApplyWindowInsetsListener, RelativePadding relativePadding) {
            this.f5854 = onApplyWindowInsetsListener;
            this.f5855 = relativePadding;
        }

        @Override // androidx.core.view.u0
        /* renamed from: ʻ */
        public f5 mo691(View view, f5 f5Var) {
            return this.f5854.onApplyWindowInsets(view, f5Var, new RelativePadding(this.f5855));
        }
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static Rect calculateOffsetRectFromBounds(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i6 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i7 = i5 - iArr2[0];
        int i8 = i6 - iArr2[1];
        return new Rect(i7, i8, view2.getWidth() + i7, view2.getHeight() + i8);
    }

    public static Rect calculateRectFromBounds(View view) {
        return calculateRectFromBounds(view, 0);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i5, int i6) {
        doOnApplyWindowInsets(view, attributeSet, i5, i6, null);
    }

    public static float dpToPx(Context context, int i5) {
        return TypedValue.applyDimension(1, i5, context.getResources().getDisplayMetrics());
    }

    public static Integer getBackgroundColor(View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    public static List<View> getChildren(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                arrayList.add(viewGroup.getChildAt(i5));
            }
        }
        return arrayList;
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    private static InputMethodManager getInputMethodManager(View view) {
        return (InputMethodManager) androidx.core.content.a.m1997(view.getContext(), InputMethodManager.class);
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new l(view);
    }

    public static float getParentAbsoluteElevation(View view) {
        float f5 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f5 += f1.m2904((View) parent);
        }
        return f5;
    }

    public static void hideKeyboard(View view) {
        hideKeyboard(view, true);
    }

    public static boolean isLayoutRtl(View view) {
        return f1.m2834(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i5, PorterDuff.Mode mode) {
        if (i5 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i5 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i5 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i5) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        if (f1.m2903(view)) {
            f1.m2827(view);
        } else {
            view.addOnAttachStateChangeListener(new c());
        }
    }

    public static void requestFocusAndShowKeyboard(View view) {
        requestFocusAndShowKeyboard(view, true);
    }

    public static void setBoundsFromRect(View view, Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void showKeyboard(View view) {
        showKeyboard(view, true);
    }

    public static Rect calculateRectFromBounds(View view, int i5) {
        return new Rect(view.getLeft(), view.getTop() + i5, view.getRight(), view.getBottom() + i5);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i5, int i6, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.Insets, i5, i6);
        boolean z5 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z6 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z7 = obtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new a(z5, z6, z7, onApplyWindowInsetsListener));
    }

    public static void hideKeyboard(View view, boolean z5) {
        t6 m2881;
        if (z5 && (m2881 = f1.m2881(view)) != null) {
            m2881.m3330(f5.m.m3128());
            return;
        }
        InputMethodManager inputMethodManager = getInputMethodManager(view);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestFocusAndShowKeyboard(final View view, final boolean z5) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.showKeyboard(view, z5);
            }
        });
    }

    public static void showKeyboard(View view, boolean z5) {
        t6 m2881;
        if (!z5 || (m2881 = f1.m2881(view)) == null) {
            getInputMethodManager(view).showSoftInput(view, 1);
        } else {
            m2881.m3335(f5.m.m3128());
        }
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;

        /* renamed from: top, reason: collision with root package name */
        public int f12851top;

        public RelativePadding(int i5, int i6, int i7, int i8) {
            this.start = i5;
            this.f12851top = i6;
            this.end = i7;
            this.bottom = i8;
        }

        public void applyToView(View view) {
            f1.m2847(view, this.start, this.f12851top, this.end, this.bottom);
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.f12851top = relativePadding.f12851top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f1.m2846(view, new b(onApplyWindowInsetsListener, new RelativePadding(f1.m2871(view), view.getPaddingTop(), f1.m2867(view), view.getPaddingBottom())));
        requestApplyInsetsWhenAttached(view);
    }

    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            f1.m2827(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
