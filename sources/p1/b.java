package p1;

import android.graphics.Bitmap;
import b1.a;

/* compiled from: GifBitmapProvider.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b implements a.InterfaceC0069a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.d f10172;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f1.b f10173;

    public b(f1.d dVar, f1.b bVar) {
        this.f10172 = dVar;
        this.f10173 = bVar;
    }

    @Override // b1.a.InterfaceC0069a
    /* renamed from: ʻ */
    public Bitmap mo5642(int i5, int i6, Bitmap.Config config) {
        return this.f10172.mo8530(i5, i6, config);
    }

    @Override // b1.a.InterfaceC0069a
    /* renamed from: ʼ */
    public void mo5643(byte[] bArr) {
        f1.b bVar = this.f10173;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // b1.a.InterfaceC0069a
    /* renamed from: ʽ */
    public byte[] mo5644(int i5) {
        f1.b bVar = this.f10173;
        return bVar == null ? new byte[i5] : (byte[]) bVar.mo8522(i5, byte[].class);
    }

    @Override // b1.a.InterfaceC0069a
    /* renamed from: ʾ */
    public void mo5645(int[] iArr) {
        f1.b bVar = this.f10173;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    @Override // b1.a.InterfaceC0069a
    /* renamed from: ʿ */
    public int[] mo5646(int i5) {
        f1.b bVar = this.f10173;
        return bVar == null ? new int[i5] : (int[]) bVar.mo8522(i5, int[].class);
    }

    @Override // b1.a.InterfaceC0069a
    /* renamed from: ˆ */
    public void mo5647(Bitmap bitmap) {
        this.f10172.mo8529(bitmap);
    }
}
