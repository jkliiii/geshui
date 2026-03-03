package s4;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* compiled from: Dns.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface n {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final n f11116 = new a();

    /* compiled from: Dns.java */
    class a implements n {
        a() {
        }

        @Override // s4.n
        /* renamed from: ʻ */
        public List<InetAddress> mo10842(String str) throws UnknownHostException {
            if (str == null) {
                throw new UnknownHostException("hostname == null");
            }
            try {
                return Arrays.asList(InetAddress.getAllByName(str));
            } catch (NullPointerException e5) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                unknownHostException.initCause(e5);
                throw unknownHostException;
            }
        }
    }

    /* renamed from: ʻ */
    List<InetAddress> mo10842(String str) throws UnknownHostException;
}
