package p3;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.IDN;

/* compiled from: DnsRequest.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends a {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f10322;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final String f10323;

    b(short s5, int i5, String str) {
        this(s5, 0, 1, i5, str);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    int m11143() {
        return this.f10322;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    byte[] m11144() throws IOException {
        String str = this.f10323;
        if (str == null || str.length() == 0) {
            throw new IOException("host can not empty");
        }
        int i5 = this.f10319;
        if (i5 != 0 && i5 != 1 && i5 != 2 && i5 != 5) {
            throw new IOException("opCode is not valid");
        }
        int i6 = this.f10320;
        if (i6 != 0 && i6 != 1) {
            throw new IOException("rd is not valid");
        }
        int i7 = this.f10322;
        if (i7 != 1 && i7 != 28 && i7 != 5 && i7 != 16) {
            throw new IOException("recordType is not valid");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeShort(this.f10318);
        dataOutputStream.writeByte((this.f10319 << 3) + this.f10320);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        for (String str2 : this.f10323.split("[.。．｡]")) {
            if (str2.length() > 63) {
                throw new IOException("host part is too long");
            }
            byte[] bytes = IDN.toASCII(str2).getBytes();
            dataOutputStream.write(bytes.length);
            dataOutputStream.write(bytes, 0, bytes.length);
        }
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(this.f10322);
        dataOutputStream.writeByte(0);
        dataOutputStream.writeByte(1);
        return byteArrayOutputStream.toByteArray();
    }

    b(short s5, int i5, int i6, int i7, String str) {
        this.f10318 = s5;
        this.f10319 = i5;
        this.f10320 = i6;
        this.f10322 = i7;
        this.f10323 = str;
    }
}
