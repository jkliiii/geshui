package k2;

import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/* compiled from: AsyncNetworkSocket.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements l {

    /* renamed from: ʻ, reason: contains not printable characters */
    InetSocketAddress f8671;

    /* renamed from: ʼ, reason: contains not printable characters */
    private r f8672;

    /* renamed from: ʽ, reason: contains not printable characters */
    private SelectionKey f8673;

    /* renamed from: ʾ, reason: contains not printable characters */
    private k f8674;

    /* renamed from: ˆ, reason: contains not printable characters */
    v2.a f8676;

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f8677;

    /* renamed from: ˉ, reason: contains not printable characters */
    l2.g f8678;

    /* renamed from: ˊ, reason: contains not printable characters */
    l2.d f8679;

    /* renamed from: ˋ, reason: contains not printable characters */
    l2.a f8680;

    /* renamed from: ˎ, reason: contains not printable characters */
    boolean f8681;

    /* renamed from: ˏ, reason: contains not printable characters */
    Exception f8682;

    /* renamed from: ˑ, reason: contains not printable characters */
    private l2.a f8683;

    /* renamed from: ʿ, reason: contains not printable characters */
    private q f8675 = new q();

    /* renamed from: י, reason: contains not printable characters */
    boolean f8684 = false;

    /* compiled from: AsyncNetworkSocket.java */
    /* renamed from: k2.a$a, reason: collision with other inner class name */
    class RunnableC0124a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ q f8685;

        RunnableC0124a(q qVar) {
            this.f8685 = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.mo9361(this.f8685);
        }
    }

    /* compiled from: AsyncNetworkSocket.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.mo9359();
        }
    }

    /* compiled from: AsyncNetworkSocket.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.mo9365();
        }
    }

    a() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m9355() {
        this.f8673.cancel();
        try {
            this.f8672.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m9356(int i5) throws IOException {
        if (!this.f8673.isValid()) {
            throw new IOException(new CancelledKeyException());
        }
        if (i5 > 0) {
            SelectionKey selectionKey = this.f8673;
            selectionKey.interestOps(selectionKey.interestOps() | 4);
        } else {
            SelectionKey selectionKey2 = this.f8673;
            selectionKey2.interestOps(selectionKey2.interestOps() & (-5));
        }
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private void m9357() {
        if (this.f8675.m9499()) {
            f0.m9422(this, this.f8675);
        }
    }

    @Override // k2.s
    public void close() {
        m9355();
        m9369(null);
    }

    @Override // k2.u
    public void end() {
        this.f8672.mo9397();
    }

    @Override // k2.u
    public boolean isOpen() {
        return this.f8672.mo9396() && this.f8673.isValid();
    }

    @Override // k2.l, k2.s, k2.u
    /* renamed from: ʻ, reason: contains not printable characters */
    public k mo9358() {
        return this.f8674;
    }

    @Override // k2.s
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo9359() {
        if (this.f8674.m9455() != Thread.currentThread()) {
            this.f8674.m9459(new b());
        } else {
            if (this.f8684) {
                return;
            }
            this.f8684 = true;
            try {
                SelectionKey selectionKey = this.f8673;
                selectionKey.interestOps(selectionKey.interestOps() & (-2));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m9360(SocketChannel socketChannel, InetSocketAddress inetSocketAddress) throws IOException {
        this.f8671 = inetSocketAddress;
        this.f8676 = new v2.a();
        this.f8672 = new d0(socketChannel);
    }

    @Override // k2.u
    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo9361(q qVar) {
        if (this.f8674.m9455() != Thread.currentThread()) {
            this.f8674.m9459(new RunnableC0124a(qVar));
            return;
        }
        if (this.f8672.mo9396()) {
            try {
                int m9500 = qVar.m9500();
                ByteBuffer[] m9494 = qVar.m9494();
                this.f8672.mo9398(m9494);
                qVar.m9485(m9494);
                m9356(qVar.m9500());
                this.f8674.m9461(m9500 - qVar.m9500());
            } catch (IOException e5) {
                m9355();
                m9373(e5);
                m9369(e5);
            }
        }
    }

    @Override // k2.s
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo9362(l2.d dVar) {
        this.f8679 = dVar;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m9363() {
        if (!this.f8672.m9509()) {
            SelectionKey selectionKey = this.f8673;
            selectionKey.interestOps(selectionKey.interestOps() & (-5));
        }
        l2.g gVar = this.f8678;
        if (gVar != null) {
            gVar.mo9413();
        }
    }

    @Override // k2.u
    /* renamed from: י, reason: contains not printable characters */
    public void mo9364(l2.g gVar) {
        this.f8678 = gVar;
    }

    @Override // k2.s
    /* renamed from: ـ, reason: contains not printable characters */
    public void mo9365() {
        if (this.f8674.m9455() != Thread.currentThread()) {
            this.f8674.m9459(new c());
            return;
        }
        if (this.f8684) {
            this.f8684 = false;
            try {
                SelectionKey selectionKey = this.f8673;
                selectionKey.interestOps(selectionKey.interestOps() | 1);
            } catch (Exception unused) {
            }
            m9357();
            if (isOpen()) {
                return;
            }
            m9373(this.f8682);
        }
    }

    @Override // k2.s
    /* renamed from: ᐧ, reason: contains not printable characters */
    public void mo9366(l2.a aVar) {
        this.f8683 = aVar;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    int m9367() {
        long j5;
        int i5;
        m9357();
        boolean z5 = false;
        if (this.f8684) {
            return 0;
        }
        ByteBuffer m12311 = this.f8676.m12311();
        try {
            j5 = this.f8672.read(m12311);
        } catch (Exception e5) {
            m9355();
            m9373(e5);
            m9369(e5);
            j5 = -1;
        }
        if (j5 < 0) {
            m9355();
            z5 = true;
            i5 = 0;
        } else {
            i5 = (int) (0 + j5);
        }
        if (j5 > 0) {
            this.f8676.m12316(j5);
            m12311.flip();
            this.f8675.m9483(m12311);
            f0.m9422(this, this.f8675);
        } else {
            q.m9482(m12311);
        }
        if (z5) {
            m9373(null);
            m9369(null);
        }
        return i5;
    }

    @Override // k2.u
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public void mo9368(l2.a aVar) {
        this.f8680 = aVar;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    protected void m9369(Exception exc) {
        if (this.f8677) {
            return;
        }
        this.f8677 = true;
        l2.a aVar = this.f8680;
        if (aVar != null) {
            aVar.mo9412(exc);
            this.f8680 = null;
        }
    }

    @Override // k2.s
    /* renamed from: ᵔ, reason: contains not printable characters */
    public boolean mo9370() {
        return this.f8684;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m9371(Exception exc) {
        if (this.f8681) {
            return;
        }
        this.f8681 = true;
        l2.a aVar = this.f8683;
        if (aVar != null) {
            aVar.mo9412(exc);
        } else if (exc != null) {
            Log.e("NIO", "Unhandled exception", exc);
        }
    }

    @Override // k2.s
    /* renamed from: ⁱ, reason: contains not printable characters */
    public String mo9372() {
        return null;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    void m9373(Exception exc) {
        if (this.f8675.m9499()) {
            this.f8682 = exc;
        } else {
            m9371(exc);
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m9374(k kVar, SelectionKey selectionKey) {
        this.f8674 = kVar;
        this.f8673 = selectionKey;
    }

    @Override // k2.s
    /* renamed from: ﾞ, reason: contains not printable characters */
    public l2.d mo9375() {
        return this.f8679;
    }
}
