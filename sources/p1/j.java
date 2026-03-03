package p1;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import e1.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j implements c1.j<InputStream, c> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<ImageHeaderParser> f10213;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c1.j<ByteBuffer, c> f10214;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final f1.b f10215;

    public j(List<ImageHeaderParser> list, c1.j<ByteBuffer, c> jVar, f1.b bVar) {
        this.f10213 = list;
        this.f10214 = jVar;
        this.f10215 = bVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static byte[] m11062(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e5) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e5);
            return null;
        }
    }

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v<c> mo5835(InputStream inputStream, int i5, int i6, c1.h hVar) throws IOException {
        byte[] m11062 = m11062(inputStream);
        if (m11062 == null) {
            return null;
        }
        return this.f10214.mo5835(ByteBuffer.wrap(m11062), i5, i6, hVar);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(InputStream inputStream, c1.h hVar) throws IOException {
        return !((Boolean) hVar.m5831(i.f10212)).booleanValue() && com.bumptech.glide.load.a.m6120(this.f10213, inputStream, this.f10215) == ImageHeaderParser.ImageType.GIF;
    }
}
