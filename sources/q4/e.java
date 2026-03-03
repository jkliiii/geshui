package q4;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e extends RuntimeException {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final transient x3.e f10629;

    public e(x3.e eVar) {
        this.f10629 = eVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f10629.toString();
    }
}
