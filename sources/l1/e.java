package l1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e implements c1.j<ImageDecoder.Source, Bitmap> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.d f8950 = new f1.e();

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(ImageDecoder.Source source, int i5, int i6, c1.h hVar) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new k1.n(i5, i6, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i5 + "x" + i6 + "]");
        }
        return new f(decodeBitmap, this.f8950);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(ImageDecoder.Source source, c1.h hVar) throws IOException {
        return true;
    }
}
