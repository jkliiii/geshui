package m4;

import java.util.concurrent.CancellationException;

/* compiled from: Exceptions.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class p0 extends CancellationException {

    /* renamed from: ʾ, reason: contains not printable characters */
    public final transient o0 f9369;

    public p0(String str, Throwable th, o0 o0Var) {
        super(str);
        this.f9369 = o0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof p0) {
                p0 p0Var = (p0) obj;
                if (!f4.k.m8619(p0Var.getMessage(), getMessage()) || !f4.k.m8619(p0Var.f9369, this.f9369) || !f4.k.m8619(p0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        f4.k.m8620(message);
        int hashCode = ((message.hashCode() * 31) + this.f9369.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f9369;
    }
}
