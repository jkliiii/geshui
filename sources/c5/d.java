package c5;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* compiled from: BufferedSink.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface d extends r, WritableByteChannel {
    @Override // c5.r, java.io.Flushable
    void flush() throws IOException;

    d write(byte[] bArr) throws IOException;

    d write(byte[] bArr, int i5, int i6) throws IOException;

    d writeByte(int i5) throws IOException;

    d writeInt(int i5) throws IOException;

    d writeShort(int i5) throws IOException;

    /* renamed from: ʻ */
    c mo5872();

    /* renamed from: ʾ */
    d mo5876(long j5) throws IOException;

    /* renamed from: ᴵ */
    d mo5901(String str) throws IOException;
}
