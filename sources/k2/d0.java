package k2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* compiled from: SocketChannelWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d0 extends r {

    /* renamed from: ʿ, reason: contains not printable characters */
    SocketChannel f8722;

    d0(SocketChannel socketChannel) throws IOException {
        super(socketChannel);
        this.f8722 = socketChannel;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f8722.read(byteBuffer);
    }

    @Override // k2.r
    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean mo9396() {
        return this.f8722.isConnected();
    }

    @Override // k2.r
    /* renamed from: ﹳ, reason: contains not printable characters */
    public void mo9397() {
        try {
            this.f8722.socket().shutdownOutput();
        } catch (Exception unused) {
        }
    }

    @Override // k2.r
    /* renamed from: ﹶ, reason: contains not printable characters */
    public int mo9398(ByteBuffer[] byteBufferArr) throws IOException {
        return (int) this.f8722.write(byteBufferArr);
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr) throws IOException {
        return this.f8722.read(byteBufferArr);
    }

    @Override // java.nio.channels.ScatteringByteChannel
    public long read(ByteBuffer[] byteBufferArr, int i5, int i6) throws IOException {
        return this.f8722.read(byteBufferArr, i5, i6);
    }
}
