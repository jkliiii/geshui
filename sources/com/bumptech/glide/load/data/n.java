package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʻ */
    public Class<InputStream> mo6132() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo6138(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: ˉ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public InputStream mo6139(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
