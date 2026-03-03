package e1;

/* compiled from: CallbackException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b extends RuntimeException {
    b(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
