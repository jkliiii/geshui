package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.l;
import java.lang.reflect.Field;

/* compiled from: ImmLeaksCleaner.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class o implements androidx.lifecycle.n {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static int f251;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static Field f252;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Field f253;

    /* renamed from: ʿ, reason: contains not printable characters */
    private static Field f254;

    /* renamed from: ʻ, reason: contains not printable characters */
    private Activity f255;

    o(Activity activity) {
        this.f255 = activity;
    }

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m401() {
        try {
            f251 = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f253 = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f254 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f252 = declaredField3;
            declaredField3.setAccessible(true);
            f251 = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.n
    /* renamed from: ʿ */
    public void mo389(androidx.lifecycle.p pVar, l.a aVar) {
        if (aVar != l.a.ON_DESTROY) {
            return;
        }
        if (f251 == 0) {
            m401();
        }
        if (f251 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f255.getSystemService("input_method");
            try {
                Object obj = f252.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f253.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f254.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (ClassCastException unused2) {
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
