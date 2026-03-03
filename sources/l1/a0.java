package l1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a0 implements c1.j<InputStream, Bitmap> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f8935 = new e();

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(InputStream inputStream, int i5, int i6, c1.h hVar) throws IOException {
        return this.f8935.mo5835(ImageDecoder.createSource(y1.a.m12863(inputStream)), i5, i6, hVar);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(InputStream inputStream, c1.h hVar) throws IOException {
        return true;
    }
}
