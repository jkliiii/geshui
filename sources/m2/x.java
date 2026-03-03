package m2;

/* compiled from: TransformFuture.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class x<T, F> extends t<T> implements g<F> {
    @Override // m2.g
    /* renamed from: ʻ */
    public void mo8740(Exception exc, F f5) {
        if (isCancelled()) {
            return;
        }
        if (exc != null) {
            mo9911(exc);
            return;
        }
        try {
            mo9912(f5);
        } catch (Exception e5) {
            mo9911(e5);
        }
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    protected void mo9911(Exception exc) {
        m9905(exc);
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    protected abstract void mo9912(F f5) throws Exception;
}
