package w4;

import javax.annotation.Nullable;
import s4.b0;
import s4.u;

/* compiled from: RealResponseBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class h extends b0 {

    /* renamed from: ʾ, reason: contains not printable characters */
    @Nullable
    private final String f12076;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final long f12077;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final c5.e f12078;

    public h(@Nullable String str, long j5, c5.e eVar) {
        this.f12076 = str;
        this.f12077 = j5;
        this.f12078 = eVar;
    }

    @Override // s4.b0
    /* renamed from: ᴵᴵ */
    public c5.e mo11766() {
        return this.f12078;
    }

    @Override // s4.b0
    /* renamed from: ﹶ */
    public long mo11767() {
        return this.f12077;
    }

    @Override // s4.b0
    /* renamed from: ﾞ */
    public u mo11768() {
        String str = this.f12076;
        if (str != null) {
            return u.m11947(str);
        }
        return null;
    }
}
