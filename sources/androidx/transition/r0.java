package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class r0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static Method f4541;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean f4542;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Field f4543;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static boolean f4544;

    r0() {
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: ʼ, reason: contains not printable characters */
    private void m5392() {
        if (f4542) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            f4541 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e5) {
            Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e5);
        }
        f4542 = true;
    }

    /* renamed from: ʻ */
    public void mo5369(View view) {
        throw null;
    }

    /* renamed from: ʽ */
    public float mo5370(View view) {
        throw null;
    }

    /* renamed from: ʾ */
    public void mo5371(View view) {
        throw null;
    }

    /* renamed from: ʿ */
    public void mo5383(View view, int i5, int i6, int i7, int i8) {
        m5392();
        Method method = f4541;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e5) {
                throw new RuntimeException(e5.getCause());
            }
        }
    }

    /* renamed from: ˆ */
    public void mo5372(View view, float f5) {
        throw null;
    }

    /* renamed from: ˈ */
    public void mo5388(View view, int i5) {
        if (!f4544) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4543 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4544 = true;
        }
        Field field = f4543;
        if (field != null) {
            try {
                f4543.setInt(view, i5 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: ˉ */
    public void mo5379(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo5379((View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    /* renamed from: ˊ */
    public void mo5380(View view, Matrix matrix) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            mo5380((View) parent, matrix);
            matrix.postTranslate(r0.getScrollX(), r0.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
