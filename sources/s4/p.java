package s4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

/* compiled from: FormBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class p extends z {

    /* renamed from: ʽ, reason: contains not printable characters */
    private static final u f11119 = u.m11946("application/x-www-form-urlencoded");

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<String> f11120;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<String> f11121;

    /* compiled from: FormBody.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final List<String> f11122;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final List<String> f11123;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final Charset f11124;

        public a() {
            this(null);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public a m11870(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (str2 == null) {
                throw new NullPointerException("value == null");
            }
            this.f11122.add(s.m11892(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f11124));
            this.f11123.add(s.m11892(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, this.f11124));
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public p m11871() {
            return new p(this.f11122, this.f11123);
        }

        public a(Charset charset) {
            this.f11122 = new ArrayList();
            this.f11123 = new ArrayList();
            this.f11124 = charset;
        }
    }

    p(List<String> list, List<String> list2) {
        this.f11120 = t4.c.m12076(list);
        this.f11121 = t4.c.m12076(list2);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private long m11866(@Nullable c5.d dVar, boolean z5) {
        c5.c cVar = z5 ? new c5.c() : dVar.mo5872();
        int size = this.f11120.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                cVar.writeByte(38);
            }
            cVar.mo5901(this.f11120.get(i5));
            cVar.writeByte(61);
            cVar.mo5901(this.f11121.get(i5));
        }
        if (!z5) {
            return 0L;
        }
        long size2 = cVar.size();
        cVar.m5911();
        return size2;
    }

    @Override // s4.z
    /* renamed from: ʻ, reason: contains not printable characters */
    public long mo11867() {
        return m11866(null, true);
    }

    @Override // s4.z
    /* renamed from: ʼ, reason: contains not printable characters */
    public u mo11868() {
        return f11119;
    }

    @Override // s4.z
    /* renamed from: ʿ, reason: contains not printable characters */
    public void mo11869(c5.d dVar) throws IOException {
        m11866(dVar, false);
    }
}
