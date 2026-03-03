package z3;

/* compiled from: ContinuationImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class i extends a {
    public i(x3.c<Object> cVar) {
        super(cVar);
        if (cVar != null) {
            if (!(cVar.getContext() == x3.f.f12391)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // x3.c
    public x3.e getContext() {
        return x3.f.f12391;
    }
}
