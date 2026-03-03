package k2;

/* compiled from: AsyncSSLException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends Exception {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f8692;

    public b(Throwable th) {
        super("Peer not trusted by any of the system trust managers.", th);
        this.f8692 = false;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m9379() {
        return this.f8692;
    }
}
