package v4;

import java.io.IOException;

/* compiled from: RouteException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e extends RuntimeException {

    /* renamed from: ʾ, reason: contains not printable characters */
    private IOException f11756;

    /* renamed from: ʿ, reason: contains not printable characters */
    private IOException f11757;

    public e(IOException iOException) {
        super(iOException);
        this.f11756 = iOException;
        this.f11757 = iOException;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m12411(IOException iOException) {
        t4.c.m12049(this.f11756, iOException);
        this.f11757 = iOException;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public IOException m12412() {
        return this.f11756;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public IOException m12413() {
        return this.f11757;
    }
}
