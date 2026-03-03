package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: KeyEventDispatcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean f3014 = false;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static Method f3015 = null;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean f3016 = false;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static Field f3017;

    /* compiled from: KeyEventDispatcher.java */
    public interface a {
        /* renamed from: ʾ */
        boolean mo738(KeyEvent keyEvent);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static boolean m3307(ActionBar actionBar, KeyEvent keyEvent) {
        if (!f3014) {
            try {
                f3015 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            f3014 = true;
        }
        Method method = f3015;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static boolean m3308(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && m3307(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (f1.m2874(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static boolean m3309(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener m3312 = m3312(dialog);
        if (m3312 != null && m3312.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (f1.m2874(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static boolean m3310(View view, KeyEvent keyEvent) {
        return f1.m2876(view, keyEvent);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: ʿ, reason: contains not printable characters */
    public static boolean m3311(a aVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (aVar == null) {
            return false;
        }
        return Build.VERSION.SDK_INT >= 28 ? aVar.mo738(keyEvent) : callback instanceof Activity ? m3308((Activity) callback, keyEvent) : callback instanceof Dialog ? m3309((Dialog) callback, keyEvent) : (view != null && f1.m2874(view, keyEvent)) || aVar.mo738(keyEvent);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static DialogInterface.OnKeyListener m3312(Dialog dialog) {
        if (!f3016) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f3017 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3016 = true;
        }
        Field field = f3017;
        if (field == null) {
            return null;
        }
        try {
            return (DialogInterface.OnKeyListener) field.get(dialog);
        } catch (IllegalAccessException unused2) {
            return null;
        }
    }
}
