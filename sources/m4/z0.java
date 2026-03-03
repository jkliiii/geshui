package m4;

/* compiled from: EventLoop.common.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class z0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final z0 f9398 = new z0();

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final ThreadLocal<e0> f9399 = q4.t.m11541(new q4.o("ThreadLocalEventLoop"));

    private z0() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final e0 m10291() {
        ThreadLocal<e0> threadLocal = f9399;
        e0 e0Var = threadLocal.get();
        if (e0Var != null) {
            return e0Var;
        }
        e0 m10182 = h0.m10182();
        threadLocal.set(m10182);
        return m10182;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m10292() {
        f9399.set(null);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m10293(e0 e0Var) {
        f9399.set(e0Var);
    }
}
