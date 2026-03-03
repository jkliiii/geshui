package l1;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ExifInterfaceImageHeaderParser.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class w implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʻ */
    public ImageHeaderParser.ImageType mo6110(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʼ */
    public int mo6111(ByteBuffer byteBuffer, f1.b bVar) throws IOException {
        return mo6112(y1.a.m12868(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʽ */
    public int mo6112(InputStream inputStream, f1.b bVar) throws IOException {
        int m3911 = new androidx.exifinterface.media.b(inputStream).m3911("Orientation", 1);
        if (m3911 == 0) {
            return -1;
        }
        return m3911;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: ʾ */
    public ImageHeaderParser.ImageType mo6113(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
