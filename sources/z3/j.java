package z3;

import f4.k;
import f4.r;

/* compiled from: ContinuationImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class j extends i implements f4.h<Object> {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f12804;

    public j(int i5, x3.c<Object> cVar) {
        super(cVar);
        this.f12804 = i5;
    }

    @Override // z3.a
    public String toString() {
        if (m13184() != null) {
            return super.toString();
        }
        String m8637 = r.m8637(this);
        k.m8622(m8637, "renderLambdaToString(this)");
        return m8637;
    }

    @Override // f4.h
    /* renamed from: ʿ */
    public int mo8618() {
        return this.f12804;
    }
}
