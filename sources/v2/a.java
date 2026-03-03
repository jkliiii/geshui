package v2;

import java.nio.ByteBuffer;
import k2.q;

/* compiled from: Allocator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a {

    /* renamed from: ʼ, reason: contains not printable characters */
    int f11689 = 0;

    /* renamed from: ʽ, reason: contains not printable characters */
    int f11690 = 4096;

    /* renamed from: ʻ, reason: contains not printable characters */
    final int f11688 = q.f8837;

    /* renamed from: ʻ, reason: contains not printable characters */
    public ByteBuffer m12311() {
        return m12312(this.f11689);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public ByteBuffer m12312(int i5) {
        return q.m9480(Math.min(Math.max(i5, this.f11690), this.f11688));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m12313() {
        return this.f11690;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m12314(int i5) {
        this.f11689 = i5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public a m12315(int i5) {
        this.f11690 = Math.max(0, i5);
        return this;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m12316(long j5) {
        this.f11689 = ((int) j5) * 2;
    }
}
