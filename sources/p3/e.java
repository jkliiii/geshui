package p3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import p3.c;

/* compiled from: DnsUdpResolver.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e extends c {

    /* compiled from: DnsUdpResolver.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ DatagramSocket f10360;

        a(DatagramSocket datagramSocket) {
            this.f10360 = datagramSocket;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f10360.disconnect();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            try {
                this.f10360.close();
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    public e(String str) {
        super(str);
    }

    @Override // p3.c
    /* renamed from: ʿ */
    d mo11148(c.C0150c c0150c, String str, String str2, int i5) throws IOException {
        DatagramSocket datagramSocket;
        b bVar = new b((short) (Math.random() * 65535.0d), i5, str2);
        byte[] m11144 = bVar.m11144();
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket2 = null;
        try {
            datagramSocket = new DatagramSocket();
        } catch (Throwable th) {
            th = th;
        }
        try {
            DatagramPacket datagramPacket = new DatagramPacket(m11144, m11144.length, byName, 53);
            datagramSocket.setSoTimeout(this.f10329 * 1000);
            c0150c.m11149(new a(datagramSocket));
            datagramSocket.send(datagramPacket);
            DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
            datagramSocket.receive(datagramPacket2);
            d dVar = new d(str, 4, bVar, datagramPacket2.getData());
            datagramSocket.close();
            return dVar;
        } catch (Throwable th2) {
            th = th2;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
    }
}
