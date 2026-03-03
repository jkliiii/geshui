package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h extends b<AssetFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.data.d
    /* renamed from: ʻ */
    public Class<AssetFileDescriptor> mo6132() {
        return AssetFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo6138(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.b
    /* renamed from: ˉ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public AssetFileDescriptor mo6139(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
