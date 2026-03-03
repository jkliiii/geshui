package v4;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import s4.c0;
import s4.o;
import s4.s;

/* compiled from: RouteSelector.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class f {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final s4.a f11758;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final d f11759;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final s4.d f11760;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final o f11761;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f11763;

    /* renamed from: ʿ, reason: contains not printable characters */
    private List<Proxy> f11762 = Collections.emptyList();

    /* renamed from: ˈ, reason: contains not printable characters */
    private List<InetSocketAddress> f11764 = Collections.emptyList();

    /* renamed from: ˉ, reason: contains not printable characters */
    private final List<c0> f11765 = new ArrayList();

    /* compiled from: RouteSelector.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final List<c0> f11766;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int f11767 = 0;

        a(List<c0> list) {
            this.f11766 = list;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public List<c0> m12422() {
            return new ArrayList(this.f11766);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean m12423() {
            return this.f11767 < this.f11766.size();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public c0 m12424() {
            if (!m12423()) {
                throw new NoSuchElementException();
            }
            List<c0> list = this.f11766;
            int i5 = this.f11767;
            this.f11767 = i5 + 1;
            return list.get(i5);
        }
    }

    public f(s4.a aVar, d dVar, s4.d dVar2, o oVar) {
        this.f11758 = aVar;
        this.f11759 = dVar;
        this.f11760 = dVar2;
        this.f11761 = oVar;
        m12418(aVar.m11728(), aVar.m11723());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static String m12414(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m12415() {
        return this.f11763 < this.f11762.size();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private Proxy m12416() throws IOException {
        if (m12415()) {
            List<Proxy> list = this.f11762;
            int i5 = this.f11763;
            this.f11763 = i5 + 1;
            Proxy proxy = list.get(i5);
            m12417(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f11758.m11728().m11912() + "; exhausted proxy configurations: " + this.f11762);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m12417(Proxy proxy) throws IOException {
        String m11912;
        int m11918;
        this.f11764 = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            m11912 = this.f11758.m11728().m11912();
            m11918 = this.f11758.m11728().m11918();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            m11912 = m12414(inetSocketAddress);
            m11918 = inetSocketAddress.getPort();
        }
        if (m11918 < 1 || m11918 > 65535) {
            throw new SocketException("No route to " + m11912 + ":" + m11918 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f11764.add(InetSocketAddress.createUnresolved(m11912, m11918));
            return;
        }
        this.f11761.m11854(this.f11760, m11912);
        List<InetAddress> mo10842 = this.f11758.m11719().mo10842(m11912);
        if (mo10842.isEmpty()) {
            throw new UnknownHostException(this.f11758.m11719() + " returned no addresses for " + m11912);
        }
        this.f11761.m11853(this.f11760, m11912, mo10842);
        int size = mo10842.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f11764.add(new InetSocketAddress(mo10842.get(i5), m11918));
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m12418(s sVar, Proxy proxy) {
        if (proxy != null) {
            this.f11762 = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f11758.m11725().select(sVar.m11905());
            this.f11762 = (select == null || select.isEmpty()) ? t4.c.m12077(Proxy.NO_PROXY) : t4.c.m12076(select);
        }
        this.f11763 = 0;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m12419(c0 c0Var, IOException iOException) {
        if (c0Var.m11785().type() != Proxy.Type.DIRECT && this.f11758.m11725() != null) {
            this.f11758.m11725().connectFailed(this.f11758.m11728().m11905(), c0Var.m11785().address(), iOException);
        }
        this.f11759.m12409(c0Var);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m12420() {
        return m12415() || !this.f11765.isEmpty();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public a m12421() throws IOException {
        if (!m12420()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m12415()) {
            Proxy m12416 = m12416();
            int size = this.f11764.size();
            for (int i5 = 0; i5 < size; i5++) {
                c0 c0Var = new c0(this.f11758, m12416, this.f11764.get(i5));
                if (this.f11759.m12410(c0Var)) {
                    this.f11765.add(c0Var);
                } else {
                    arrayList.add(c0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f11765);
            this.f11765.clear();
        }
        return new a(arrayList);
    }
}
