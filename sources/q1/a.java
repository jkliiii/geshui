package q1;

import android.graphics.Bitmap;
import c1.h;
import e1.v;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Bitmap.CompressFormat f10612;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f10613;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // q1.e
    /* renamed from: ʻ, reason: contains not printable characters */
    public v<byte[]> mo11467(v<Bitmap> vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f10612, this.f10613, byteArrayOutputStream);
        vVar.mo8413();
        return new m1.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i5) {
        this.f10612 = compressFormat;
        this.f10613 = i5;
    }
}
