package w4;

import java.io.IOException;
import java.util.List;
import s4.a0;
import s4.o;
import s4.t;
import s4.y;

/* compiled from: RealInterceptorChain.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class g implements t.a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<t> f12064;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final v4.g f12065;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final c f12066;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final v4.c f12067;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f12068;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final y f12069;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final s4.d f12070;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final o f12071;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f12072;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final int f12073;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f12074;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f12075;

    public g(List<t> list, v4.g gVar, c cVar, v4.c cVar2, int i5, y yVar, s4.d dVar, o oVar, int i6, int i7, int i8) {
        this.f12064 = list;
        this.f12067 = cVar2;
        this.f12065 = gVar;
        this.f12066 = cVar;
        this.f12068 = i5;
        this.f12069 = yVar;
        this.f12070 = dVar;
        this.f12071 = oVar;
        this.f12072 = i6;
        this.f12073 = i7;
        this.f12074 = i8;
    }

    @Override // s4.t.a
    /* renamed from: ʻ */
    public int mo11941() {
        return this.f12072;
    }

    @Override // s4.t.a
    /* renamed from: ʼ */
    public int mo11942() {
        return this.f12073;
    }

    @Override // s4.t.a
    /* renamed from: ʽ */
    public int mo11943() {
        return this.f12074;
    }

    @Override // s4.t.a
    /* renamed from: ʾ */
    public a0 mo11944(y yVar) throws IOException {
        return m12611(yVar, this.f12065, this.f12066, this.f12067);
    }

    @Override // s4.t.a
    /* renamed from: ʿ */
    public y mo11945() {
        return this.f12069;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public s4.d m12607() {
        return this.f12070;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public s4.h m12608() {
        return this.f12067;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public o m12609() {
        return this.f12071;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public c m12610() {
        return this.f12066;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public a0 m12611(y yVar, v4.g gVar, c cVar, v4.c cVar2) throws IOException {
        if (this.f12068 >= this.f12064.size()) {
            throw new AssertionError();
        }
        this.f12075++;
        if (this.f12066 != null && !this.f12067.m12407(yVar.m12011())) {
            throw new IllegalStateException("network interceptor " + this.f12064.get(this.f12068 - 1) + " must retain the same host and port");
        }
        if (this.f12066 != null && this.f12075 > 1) {
            throw new IllegalStateException("network interceptor " + this.f12064.get(this.f12068 - 1) + " must call proceed() exactly once");
        }
        g gVar2 = new g(this.f12064, gVar, cVar, cVar2, this.f12068 + 1, yVar, this.f12070, this.f12071, this.f12072, this.f12073, this.f12074);
        t tVar = this.f12064.get(this.f12068);
        a0 mo11940 = tVar.mo11940(gVar2);
        if (cVar != null && this.f12068 + 1 < this.f12064.size() && gVar2.f12075 != 1) {
            throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
        }
        if (mo11940 == null) {
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        if (mo11940.m11731() != null) {
            return mo11940;
        }
        throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public v4.g m12612() {
        return this.f12065;
    }
}
