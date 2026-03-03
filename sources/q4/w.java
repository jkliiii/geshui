package q4;

import m4.y0;

/* compiled from: ThreadContext.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class w {

    /* renamed from: ʻ, reason: contains not printable characters */
    public final x3.e f10665;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Object[] f10666;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final y0<Object>[] f10667;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f10668;

    public w(x3.e eVar, int i5) {
        this.f10665 = eVar;
        this.f10666 = new Object[i5];
        this.f10667 = new y0[i5];
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final void m11555(y0<?> y0Var, Object obj) {
        Object[] objArr = this.f10666;
        int i5 = this.f10668;
        objArr[i5] = obj;
        y0<Object>[] y0VarArr = this.f10667;
        this.f10668 = i5 + 1;
        f4.k.m8621(y0Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        y0VarArr[i5] = y0Var;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m11556(x3.e eVar) {
        int length = this.f10667.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i5 = length - 1;
            y0<Object> y0Var = this.f10667[length];
            f4.k.m8620(y0Var);
            y0Var.m10289(eVar, this.f10666[length]);
            if (i5 < 0) {
                return;
            } else {
                length = i5;
            }
        }
    }
}
