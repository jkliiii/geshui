package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import y1.f;

/* compiled from: GlideContext.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d extends ContextWrapper {

    /* renamed from: ˎ, reason: contains not printable characters */
    static final m<?, ?> f5127 = new a();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.b f5128;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f.b<i> f5129;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final v1.f f5130;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final b.a f5131;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final List<u1.f<Object>> f5132;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final Map<Class<?>, m<?, ?>> f5133;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final e1.k f5134;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final e f5135;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f5136;

    /* renamed from: ˋ, reason: contains not printable characters */
    private u1.g f5137;

    public d(Context context, f1.b bVar, f.b<i> bVar2, v1.f fVar, b.a aVar, Map<Class<?>, m<?, ?>> map, List<u1.f<Object>> list, e1.k kVar, e eVar, int i5) {
        super(context.getApplicationContext());
        this.f5128 = bVar;
        this.f5130 = fVar;
        this.f5131 = aVar;
        this.f5132 = list;
        this.f5133 = map;
        this.f5134 = kVar;
        this.f5135 = eVar;
        this.f5136 = i5;
        this.f5129 = y1.f.m12877(bVar2);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public <X> v1.i<ImageView, X> m6033(ImageView imageView, Class<X> cls) {
        return this.f5130.m12295(imageView, cls);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public f1.b m6034() {
        return this.f5128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public List<u1.f<Object>> m6035() {
        return this.f5132;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized u1.g m6036() {
        if (this.f5137 == null) {
            this.f5137 = this.f5131.build().m12123();
        }
        return this.f5137;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public <T> m<?, T> m6037(Class<T> cls) {
        m<?, T> mVar = (m) this.f5133.get(cls);
        if (mVar == null) {
            for (Map.Entry<Class<?>, m<?, ?>> entry : this.f5133.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    mVar = (m) entry.getValue();
                }
            }
        }
        return mVar == null ? (m<?, T>) f5127 : mVar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public e1.k m6038() {
        return this.f5134;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public e m6039() {
        return this.f5135;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m6040() {
        return this.f5136;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public i m6041() {
        return this.f5129.get();
    }
}
