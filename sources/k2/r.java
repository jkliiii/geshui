package k2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.spi.AbstractSelectableChannel;

/* compiled from: ChannelWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class r implements ReadableByteChannel, ScatteringByteChannel {

    /* renamed from: ʾ, reason: contains not printable characters */
    private AbstractSelectableChannel f8845;

    r(AbstractSelectableChannel abstractSelectableChannel) throws IOException {
        abstractSelectableChannel.configureBlocking(false);
        this.f8845 = abstractSelectableChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f8845.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f8845.isOpen();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m9509() {
        return false;
    }

    /* renamed from: ˉ */
    public abstract boolean mo9396();

    /* renamed from: ﹳ */
    public abstract void mo9397();

    /* renamed from: ﹶ */
    public abstract int mo9398(ByteBuffer[] byteBufferArr) throws IOException;
}
