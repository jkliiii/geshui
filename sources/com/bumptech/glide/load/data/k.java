package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.e;
import java.io.IOException;
import java.io.InputStream;
import l1.d0;

/* compiled from: InputStreamRewinder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k implements e<InputStream> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final d0 f5236;

    /* compiled from: InputStreamRewinder.java */
    public static final class a implements e.a<InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final f1.b f5237;

        public a(f1.b bVar) {
            this.f5237 = bVar;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʻ */
        public Class<InputStream> mo6129() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e<InputStream> mo6130(InputStream inputStream) {
            return new k(inputStream, this.f5237);
        }
    }

    public k(InputStream inputStream, f1.b bVar) {
        d0 d0Var = new d0(inputStream, bVar);
        this.f5236 = d0Var;
        d0Var.mark(5242880);
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: ʼ */
    public void mo6127() {
        this.f5236.m9598();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m6160() {
        this.f5236.m9597();
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InputStream mo6126() throws IOException {
        this.f5236.reset();
        return this.f5236;
    }
}
