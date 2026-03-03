package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import g1.a;
import g1.i;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import r1.o;

/* compiled from: GlideBuilder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʽ, reason: contains not printable characters */
    private e1.k f5111;

    /* renamed from: ʾ, reason: contains not printable characters */
    private f1.d f5112;

    /* renamed from: ʿ, reason: contains not printable characters */
    private f1.b f5113;

    /* renamed from: ˆ, reason: contains not printable characters */
    private g1.h f5114;

    /* renamed from: ˈ, reason: contains not printable characters */
    private h1.a f5115;

    /* renamed from: ˉ, reason: contains not printable characters */
    private h1.a f5116;

    /* renamed from: ˊ, reason: contains not printable characters */
    private a.InterfaceC0107a f5117;

    /* renamed from: ˋ, reason: contains not printable characters */
    private g1.i f5118;

    /* renamed from: ˎ, reason: contains not printable characters */
    private r1.c f5119;

    /* renamed from: י, reason: contains not printable characters */
    private o.b f5122;

    /* renamed from: ـ, reason: contains not printable characters */
    private h1.a f5123;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f5124;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private List<u1.f<Object>> f5125;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<Class<?>, m<?, ?>> f5109 = new m.a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final e.a f5110 = new e.a();

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f5120 = 4;

    /* renamed from: ˑ, reason: contains not printable characters */
    private b.a f5121 = new a();

    /* compiled from: GlideBuilder.java */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        public u1.g build() {
            return new u1.g();
        }
    }

    /* compiled from: GlideBuilder.java */
    static final class b {
        b() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    public static final class C0078c {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    com.bumptech.glide.b m6031(Context context, List<s1.b> list, s1.a aVar) {
        if (this.f5115 == null) {
            this.f5115 = h1.a.m8756();
        }
        if (this.f5116 == null) {
            this.f5116 = h1.a.m8758();
        }
        if (this.f5123 == null) {
            this.f5123 = h1.a.m8762();
        }
        if (this.f5118 == null) {
            this.f5118 = new i.a(context).m8684();
        }
        if (this.f5119 == null) {
            this.f5119 = new r1.e();
        }
        if (this.f5112 == null) {
            int m8682 = this.f5118.m8682();
            if (m8682 > 0) {
                this.f5112 = new f1.k(m8682);
            } else {
                this.f5112 = new f1.e();
            }
        }
        if (this.f5113 == null) {
            this.f5113 = new f1.i(this.f5118.m8681());
        }
        if (this.f5114 == null) {
            this.f5114 = new g1.g(this.f5118.m8683());
        }
        if (this.f5117 == null) {
            this.f5117 = new g1.f(context);
        }
        if (this.f5111 == null) {
            this.f5111 = new e1.k(this.f5114, this.f5117, this.f5116, this.f5115, h1.a.m8755(), this.f5123, this.f5124);
        }
        List<u1.f<Object>> list2 = this.f5125;
        if (list2 == null) {
            this.f5125 = Collections.emptyList();
        } else {
            this.f5125 = Collections.unmodifiableList(list2);
        }
        return new com.bumptech.glide.b(context, this.f5111, this.f5114, this.f5112, this.f5113, new o(this.f5122), this.f5119, this.f5120, this.f5121, this.f5109, this.f5125, list, aVar, this.f5110.m6044());
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m6032(o.b bVar) {
        this.f5122 = bVar;
    }
}
