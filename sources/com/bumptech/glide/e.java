package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<Class<?>, Object> f5138;

    /* compiled from: GlideExperiments.java */
    static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Map<Class<?>, Object> f5139 = new HashMap();

        a() {
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        e m6044() {
            return new e(this);
        }
    }

    e(a aVar) {
        this.f5138 = Collections.unmodifiableMap(new HashMap(aVar.f5139));
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m6042(Class<Object> cls) {
        return this.f5138.containsKey(cls);
    }
}
