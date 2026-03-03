package c5;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: BufferedSource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface e extends s, ReadableByteChannel {
    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    short readShort() throws IOException;

    void skip(long j5) throws IOException;

    /* renamed from: ʻ */
    c mo5872();

    /* renamed from: ʿ */
    f mo5878(long j5) throws IOException;

    /* renamed from: ˆ */
    boolean mo5880(long j5, f fVar) throws IOException;

    /* renamed from: ˊ */
    String mo5884() throws IOException;

    /* renamed from: ˋ */
    byte[] mo5886() throws IOException;

    /* renamed from: ˎ */
    int mo5888() throws IOException;

    /* renamed from: ˏ */
    boolean mo5890() throws IOException;

    /* renamed from: ˑ */
    byte[] mo5892(long j5) throws IOException;

    /* renamed from: ـ */
    short mo5895() throws IOException;

    /* renamed from: ٴ */
    String mo5897(long j5) throws IOException;

    /* renamed from: ᐧ */
    void mo5899(long j5) throws IOException;

    /* renamed from: ᵎ */
    long mo5903(byte b6) throws IOException;

    /* renamed from: ᵔ */
    long mo5905() throws IOException;

    /* renamed from: ᵢ */
    String mo5907(Charset charset) throws IOException;

    /* renamed from: ⁱ */
    InputStream mo5909();
}
