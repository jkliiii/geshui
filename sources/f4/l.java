package f4;

import java.io.Serializable;

/* compiled from: Lambda.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class l<R> implements h<R>, Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f7795;

    public l(int i5) {
        this.f7795 = i5;
    }

    public String toString() {
        String m8638 = r.m8638(this);
        k.m8622(m8638, "renderLambdaToString(this)");
        return m8638;
    }

    @Override // f4.h
    /* renamed from: ʿ */
    public int mo8618() {
        return this.f7795;
    }
}
