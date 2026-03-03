package e0;

import java.nio.ByteBuffer;

/* compiled from: MetadataItem.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a extends c {
    /* renamed from: ˆ, reason: contains not printable characters */
    public a m8260(int i5, ByteBuffer byteBuffer) {
        m8261(i5, byteBuffer);
        return this;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m8261(int i5, ByteBuffer byteBuffer) {
        m8278(i5, byteBuffer);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m8262(int i5) {
        int m8277 = m8277(16);
        if (m8277 != 0) {
            return this.f7342.getInt(m8279(m8277) + (i5 * 4));
        }
        return 0;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public int m8263() {
        int m8277 = m8277(16);
        if (m8277 != 0) {
            return m8280(m8277);
        }
        return 0;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m8264() {
        int m8277 = m8277(6);
        return (m8277 == 0 || this.f7342.get(m8277 + this.f7341) == 0) ? false : true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public short m8265() {
        int m8277 = m8277(14);
        if (m8277 != 0) {
            return this.f7342.getShort(m8277 + this.f7341);
        }
        return (short) 0;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m8266() {
        int m8277 = m8277(4);
        if (m8277 != 0) {
            return this.f7342.getInt(m8277 + this.f7341);
        }
        return 0;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public short m8267() {
        int m8277 = m8277(8);
        if (m8277 != 0) {
            return this.f7342.getShort(m8277 + this.f7341);
        }
        return (short) 0;
    }

    /* renamed from: י, reason: contains not printable characters */
    public short m8268() {
        int m8277 = m8277(12);
        if (m8277 != 0) {
            return this.f7342.getShort(m8277 + this.f7341);
        }
        return (short) 0;
    }
}
