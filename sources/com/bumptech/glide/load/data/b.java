package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b<T> implements d<T> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final String f5214;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final AssetManager f5215;

    /* renamed from: ˆ, reason: contains not printable characters */
    private T f5216;

    public b(AssetManager assetManager, String str) {
        this.f5215 = assetManager;
        this.f5214 = str;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʼ, reason: contains not printable characters */
    public void mo6137() {
        T t5 = this.f5216;
        if (t5 == null) {
            return;
        }
        try {
            mo6138(t5);
        } catch (IOException unused) {
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected abstract void mo6138(T t5) throws IOException;

    /* renamed from: ʾ, reason: contains not printable characters */
    protected abstract T mo6139(AssetManager assetManager, String str) throws IOException;

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʿ, reason: contains not printable characters */
    public c1.a mo6140() {
        return c1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ˆ, reason: contains not printable characters */
    public void mo6141(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T mo6139 = mo6139(this.f5215, this.f5214);
            this.f5216 = mo6139;
            aVar.mo6146(mo6139);
        } catch (IOException e5) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e5);
            }
            aVar.mo6145(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
