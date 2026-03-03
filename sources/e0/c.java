package e0;

import java.nio.ByteBuffer;

/* compiled from: Table.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected int f7341;

    /* renamed from: ʼ, reason: contains not printable characters */
    protected ByteBuffer f7342;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f7343;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f7344;

    /* renamed from: ʿ, reason: contains not printable characters */
    d f7345 = d.m8281();

    /* renamed from: ʻ, reason: contains not printable characters */
    protected int m8276(int i5) {
        return i5 + this.f7342.getInt(i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected int m8277(int i5) {
        if (i5 < this.f7344) {
            return this.f7342.getShort(this.f7343 + i5);
        }
        return 0;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected void m8278(int i5, ByteBuffer byteBuffer) {
        this.f7342 = byteBuffer;
        if (byteBuffer == null) {
            this.f7341 = 0;
            this.f7343 = 0;
            this.f7344 = 0;
        } else {
            this.f7341 = i5;
            int i6 = i5 - byteBuffer.getInt(i5);
            this.f7343 = i6;
            this.f7344 = this.f7342.getShort(i6);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected int m8279(int i5) {
        int i6 = i5 + this.f7341;
        return i6 + this.f7342.getInt(i6) + 4;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected int m8280(int i5) {
        int i6 = i5 + this.f7341;
        return this.f7342.getInt(i6 + this.f7342.getInt(i6));
    }
}
