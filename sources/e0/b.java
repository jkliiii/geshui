package e0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataList.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b extends c {
    /* renamed from: ˉ, reason: contains not printable characters */
    public static b m8269(ByteBuffer byteBuffer) {
        return m8270(byteBuffer, new b());
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static b m8270(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.m8271(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public b m8271(int i5, ByteBuffer byteBuffer) {
        m8272(i5, byteBuffer);
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m8272(int i5, ByteBuffer byteBuffer) {
        m8278(i5, byteBuffer);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public a m8273(a aVar, int i5) {
        int m8277 = m8277(6);
        if (m8277 != 0) {
            return aVar.m8260(m8276(m8279(m8277) + (i5 * 4)), this.f7342);
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public int m8274() {
        int m8277 = m8277(6);
        if (m8277 != 0) {
            return m8280(m8277);
        }
        return 0;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m8275() {
        int m8277 = m8277(4);
        if (m8277 != 0) {
            return this.f7342.getInt(m8277 + this.f7341);
        }
        return 0;
    }
}
