package s4;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import s4.s;

/* compiled from: Address.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    final s f10870;

    /* renamed from: ʼ, reason: contains not printable characters */
    final n f10871;

    /* renamed from: ʽ, reason: contains not printable characters */
    final SocketFactory f10872;

    /* renamed from: ʾ, reason: contains not printable characters */
    final b f10873;

    /* renamed from: ʿ, reason: contains not printable characters */
    final List<w> f10874;

    /* renamed from: ˆ, reason: contains not printable characters */
    final List<j> f10875;

    /* renamed from: ˈ, reason: contains not printable characters */
    final ProxySelector f10876;

    /* renamed from: ˉ, reason: contains not printable characters */
    @Nullable
    final Proxy f10877;

    /* renamed from: ˊ, reason: contains not printable characters */
    @Nullable
    final SSLSocketFactory f10878;

    /* renamed from: ˋ, reason: contains not printable characters */
    @Nullable
    final HostnameVerifier f10879;

    /* renamed from: ˎ, reason: contains not printable characters */
    @Nullable
    final f f10880;

    public a(String str, int i5, n nVar, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable f fVar, b bVar, @Nullable Proxy proxy, List<w> list, List<j> list2, ProxySelector proxySelector) {
        this.f10870 = new s.a().m11938(sSLSocketFactory != null ? "https" : "http").m11933(str).m11936(i5).m11930();
        if (nVar == null) {
            throw new NullPointerException("dns == null");
        }
        this.f10871 = nVar;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f10872 = socketFactory;
        if (bVar == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f10873 = bVar;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f10874 = t4.c.m12076(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f10875 = t4.c.m12076(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f10876 = proxySelector;
        this.f10877 = proxy;
        this.f10878 = sSLSocketFactory;
        this.f10879 = hostnameVerifier;
        this.f10880 = fVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f10870.equals(aVar.f10870) && m11720(aVar)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((527 + this.f10870.hashCode()) * 31) + this.f10871.hashCode()) * 31) + this.f10873.hashCode()) * 31) + this.f10874.hashCode()) * 31) + this.f10875.hashCode()) * 31) + this.f10876.hashCode()) * 31;
        Proxy proxy = this.f10877;
        int hashCode2 = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f10878;
        int hashCode3 = (hashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f10879;
        int hashCode4 = (hashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        f fVar = this.f10880;
        return hashCode4 + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f10870.m11912());
        sb.append(":");
        sb.append(this.f10870.m11918());
        if (this.f10877 != null) {
            sb.append(", proxy=");
            sb.append(this.f10877);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f10876);
        }
        sb.append("}");
        return sb.toString();
    }

    @Nullable
    /* renamed from: ʻ, reason: contains not printable characters */
    public f m11717() {
        return this.f10880;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public List<j> m11718() {
        return this.f10875;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public n m11719() {
        return this.f10871;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    boolean m11720(a aVar) {
        return this.f10871.equals(aVar.f10871) && this.f10873.equals(aVar.f10873) && this.f10874.equals(aVar.f10874) && this.f10875.equals(aVar.f10875) && this.f10876.equals(aVar.f10876) && t4.c.m12071(this.f10877, aVar.f10877) && t4.c.m12071(this.f10878, aVar.f10878) && t4.c.m12071(this.f10879, aVar.f10879) && t4.c.m12071(this.f10880, aVar.f10880) && m11728().m11918() == aVar.m11728().m11918();
    }

    @Nullable
    /* renamed from: ʿ, reason: contains not printable characters */
    public HostnameVerifier m11721() {
        return this.f10879;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public List<w> m11722() {
        return this.f10874;
    }

    @Nullable
    /* renamed from: ˈ, reason: contains not printable characters */
    public Proxy m11723() {
        return this.f10877;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public b m11724() {
        return this.f10873;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public ProxySelector m11725() {
        return this.f10876;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public SocketFactory m11726() {
        return this.f10872;
    }

    @Nullable
    /* renamed from: ˎ, reason: contains not printable characters */
    public SSLSocketFactory m11727() {
        return this.f10878;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public s m11728() {
        return this.f10870;
    }
}
