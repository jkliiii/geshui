package l1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j implements c1.j<ByteBuffer, Bitmap> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e f8966 = new e();

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(ByteBuffer byteBuffer, int i5, int i6, c1.h hVar) throws IOException {
        return this.f8966.mo5835(ImageDecoder.createSource(byteBuffer), i5, i6, hVar);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(ByteBuffer byteBuffer, c1.h hVar) throws IOException {
        return true;
    }
}
