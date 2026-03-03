package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class l<T> implements d<T> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Uri f5238;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final ContentResolver f5239;

    /* renamed from: ˆ, reason: contains not printable characters */
    private T f5240;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f5239 = contentResolver;
        this.f5238 = uri;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʼ */
    public void mo6137() {
        T t5 = this.f5240;
        if (t5 != null) {
            try {
                mo6133(t5);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ʽ */
    protected abstract void mo6133(T t5) throws IOException;

    /* renamed from: ʾ */
    protected abstract T mo6134(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʿ */
    public c1.a mo6140() {
        return c1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ˆ */
    public final void mo6141(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T mo6134 = mo6134(this.f5238, this.f5239);
            this.f5240 = mo6134;
            aVar.mo6146(mo6134);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e5);
            }
            aVar.mo6145(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
