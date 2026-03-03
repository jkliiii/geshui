package n4;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import m4.u;
import x3.e;

/* compiled from: AndroidExceptionPreHandler.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a extends x3.a implements u {
    private volatile Object _preHandler;

    public a() {
        super(u.f9392);
        this._preHandler = this;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Method m10962() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            boolean z5 = false;
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", new Class[0]);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    z5 = true;
                }
            }
            if (z5) {
                method = declaredMethod;
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // m4.u
    /* renamed from: ʿ */
    public void mo10276(e eVar, Throwable th) {
        int i5 = Build.VERSION.SDK_INT;
        if (26 <= i5 && i5 < 28) {
            Method m10962 = m10962();
            Object invoke = m10962 != null ? m10962.invoke(null, new Object[0]) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
