package o3;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Network.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String f10109 = "";

    /* renamed from: ʻ, reason: contains not printable characters */
    public static String m10997() {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            datagramSocket.connect(InetAddress.getByName("114.114.114.114"), 53);
            InetAddress localAddress = datagramSocket.getLocalAddress();
            datagramSocket.close();
            return localAddress.getHostAddress();
        } catch (IOException e5) {
            e5.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static synchronized boolean m10998() {
        synchronized (d.class) {
            String m10997 = m10997();
            if (m10997.equals(f10109)) {
                return false;
            }
            f10109 = m10997;
            return true;
        }
    }
}
