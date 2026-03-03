package l1;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c0 implements c1.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final t f8943;

    public c0(t tVar) {
        this.f8943 = tVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m9591(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(ParcelFileDescriptor parcelFileDescriptor, int i5, int i6, c1.h hVar) throws IOException {
        return this.f8943.m9701(parcelFileDescriptor, i5, i6, hVar);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(ParcelFileDescriptor parcelFileDescriptor, c1.h hVar) {
        return m9591(parcelFileDescriptor) && this.f8943.m9704(parcelFileDescriptor);
    }
}
