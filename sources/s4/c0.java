package s4;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: Route.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    final a f10933;

    /* renamed from: ʼ, reason: contains not printable characters */
    final Proxy f10934;

    /* renamed from: ʽ, reason: contains not printable characters */
    final InetSocketAddress f10935;

    public c0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f10933 = aVar;
        this.f10934 = proxy;
        this.f10935 = inetSocketAddress;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (c0Var.f10933.equals(this.f10933) && c0Var.f10934.equals(this.f10934) && c0Var.f10935.equals(this.f10935)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f10933.hashCode()) * 31) + this.f10934.hashCode()) * 31) + this.f10935.hashCode();
    }

    public String toString() {
        return "Route{" + this.f10935 + "}";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public a m11784() {
        return this.f10933;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public Proxy m11785() {
        return this.f10934;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m11786() {
        return this.f10933.f10878 != null && this.f10934.type() == Proxy.Type.HTTP;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public InetSocketAddress m11787() {
        return this.f10935;
    }
}
