package k2;

import android.annotation.TargetApi;
import android.os.Looper;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/* compiled from: ByteBufferList.java */
@TargetApi(9)
/* loaded from: E:\78999\cookie_5123796.dex */
public class q {

    /* renamed from: ʾ, reason: contains not printable characters */
    static PriorityQueue<ByteBuffer> f8835 = new PriorityQueue<>(8, new a());

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int f8836 = 1048576;

    /* renamed from: ˆ, reason: contains not printable characters */
    public static int f8837 = 262144;

    /* renamed from: ˈ, reason: contains not printable characters */
    static int f8838 = 0;

    /* renamed from: ˉ, reason: contains not printable characters */
    static int f8839 = 0;

    /* renamed from: ˊ, reason: contains not printable characters */
    private static final Object f8840 = new Object();

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final ByteBuffer f8841 = ByteBuffer.allocate(0);

    /* renamed from: ʻ, reason: contains not printable characters */
    v2.b<ByteBuffer> f8842 = new v2.b<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    ByteOrder f8843 = ByteOrder.BIG_ENDIAN;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f8844 = 0;

    /* compiled from: ByteBufferList.java */
    static class a implements Comparator<ByteBuffer> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            if (byteBuffer.capacity() == byteBuffer2.capacity()) {
                return 0;
            }
            return byteBuffer.capacity() > byteBuffer2.capacity() ? 1 : -1;
        }
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public static void m9477(OutputStream outputStream, ByteBuffer byteBuffer) throws IOException {
        byte[] array;
        int remaining;
        int i5;
        if (byteBuffer.isDirect()) {
            array = new byte[byteBuffer.remaining()];
            remaining = byteBuffer.remaining();
            byteBuffer.get(array);
            i5 = 0;
        } else {
            array = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            remaining = byteBuffer.remaining();
            i5 = arrayOffset;
        }
        outputStream.write(array, i5, remaining);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m9478(int i5) {
        if (m9500() >= 0) {
            this.f8844 += i5;
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private static PriorityQueue<ByteBuffer> m9479() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null || Thread.currentThread() != mainLooper.getThread()) {
            return f8835;
        }
        return null;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public static ByteBuffer m9480(int i5) {
        PriorityQueue<ByteBuffer> m9479;
        if (i5 <= f8839 && (m9479 = m9479()) != null) {
            synchronized (f8840) {
                while (m9479.size() > 0) {
                    ByteBuffer remove = m9479.remove();
                    if (m9479.size() == 0) {
                        f8839 = 0;
                    }
                    f8838 -= remove.capacity();
                    if (remove.capacity() >= i5) {
                        return remove;
                    }
                }
            }
        }
        return ByteBuffer.allocate(Math.max(8192, i5));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private ByteBuffer m9481(int i5) {
        ByteBuffer byteBuffer;
        if (m9500() < i5) {
            throw new IllegalArgumentException("count : " + m9500() + "/" + i5);
        }
        ByteBuffer peek = this.f8842.peek();
        while (peek != null && !peek.hasRemaining()) {
            m9482(this.f8842.remove());
            peek = this.f8842.peek();
        }
        if (peek == null) {
            return f8841;
        }
        if (peek.remaining() >= i5) {
            return peek.order(this.f8843);
        }
        ByteBuffer m9480 = m9480(i5);
        m9480.limit(i5);
        byte[] array = m9480.array();
        int i6 = 0;
        loop1: while (true) {
            byteBuffer = null;
            while (i6 < i5) {
                byteBuffer = this.f8842.remove();
                int min = Math.min(i5 - i6, byteBuffer.remaining());
                byteBuffer.get(array, i6, min);
                i6 += min;
                if (byteBuffer.remaining() == 0) {
                    break;
                }
            }
            m9482(byteBuffer);
        }
        if (byteBuffer != null && byteBuffer.remaining() > 0) {
            this.f8842.addFirst(byteBuffer);
        }
        this.f8842.addFirst(m9480);
        return m9480.order(this.f8843);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public static void m9482(ByteBuffer byteBuffer) {
        PriorityQueue<ByteBuffer> m9479;
        if (byteBuffer == null || byteBuffer.isDirect() || byteBuffer.arrayOffset() != 0 || byteBuffer.array().length != byteBuffer.capacity() || byteBuffer.capacity() < 8192 || byteBuffer.capacity() > f8837 || (m9479 = m9479()) == null) {
            return;
        }
        synchronized (f8840) {
            while (f8838 > f8836 && m9479.size() > 0 && m9479.peek().capacity() < byteBuffer.capacity()) {
                f8838 -= m9479.remove().capacity();
            }
            if (f8838 > f8836) {
                return;
            }
            byteBuffer.position(0);
            byteBuffer.limit(byteBuffer.capacity());
            f8838 += byteBuffer.capacity();
            m9479.add(byteBuffer);
            f8839 = Math.max(f8839, byteBuffer.capacity());
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public q m9483(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            m9482(byteBuffer);
            return this;
        }
        m9478(byteBuffer.remaining());
        if (this.f8842.size() > 0) {
            ByteBuffer last = this.f8842.getLast();
            if (last.capacity() - last.limit() >= byteBuffer.remaining()) {
                last.mark();
                last.position(last.limit());
                last.limit(last.capacity());
                last.put(byteBuffer);
                last.limit(last.position());
                last.reset();
                m9482(byteBuffer);
                m9487();
                return this;
            }
        }
        this.f8842.add(byteBuffer);
        m9487();
        return this;
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public int m9484() {
        return this.f8842.size();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public q m9485(ByteBuffer... byteBufferArr) {
        for (ByteBuffer byteBuffer : byteBufferArr) {
            m9483(byteBuffer);
        }
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m9486(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= 0) {
            m9482(byteBuffer);
            return;
        }
        m9478(byteBuffer.remaining());
        if (this.f8842.size() > 0) {
            ByteBuffer first = this.f8842.getFirst();
            if (first.position() >= byteBuffer.remaining()) {
                first.position(first.position() - byteBuffer.remaining());
                first.mark();
                first.put(byteBuffer);
                first.reset();
                m9482(byteBuffer);
                return;
            }
        }
        this.f8842.addFirst(byteBuffer);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m9487() {
        m9481(0);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public byte m9488() {
        byte b6 = m9481(1).get();
        this.f8844--;
        return b6;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m9489(q qVar) {
        m9490(qVar, m9500());
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m9490(q qVar, int i5) {
        if (m9500() < i5) {
            throw new IllegalArgumentException("length");
        }
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            ByteBuffer remove = this.f8842.remove();
            int remaining = remove.remaining();
            if (remaining == 0) {
                m9482(remove);
            } else {
                int i7 = remaining + i6;
                if (i7 > i5) {
                    int i8 = i5 - i6;
                    ByteBuffer m9480 = m9480(i8);
                    m9480.limit(i8);
                    remove.get(m9480.array(), 0, i8);
                    qVar.m9483(m9480);
                    this.f8842.addFirst(remove);
                    break;
                }
                qVar.m9483(remove);
                i6 = i7;
            }
        }
        this.f8844 -= i5;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m9491(byte[] bArr) {
        m9492(bArr, 0, bArr.length);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m9492(byte[] bArr, int i5, int i6) {
        if (m9500() < i6) {
            throw new IllegalArgumentException("length");
        }
        int i7 = i6;
        while (i7 > 0) {
            ByteBuffer peek = this.f8842.peek();
            int min = Math.min(peek.remaining(), i7);
            if (bArr != null) {
                peek.get(bArr, i5, min);
            } else {
                peek.position(peek.position() + min);
            }
            i7 -= min;
            i5 += min;
            if (peek.remaining() == 0) {
                this.f8842.remove();
                m9482(peek);
            }
        }
        this.f8844 -= i6;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public ByteBuffer m9493() {
        if (m9500() == 0) {
            return f8841;
        }
        m9481(m9500());
        return m9502();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public ByteBuffer[] m9494() {
        ByteBuffer[] byteBufferArr = (ByteBuffer[]) this.f8842.toArray(new ByteBuffer[this.f8842.size()]);
        this.f8842.clear();
        this.f8844 = 0;
        return byteBufferArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public char m9495() {
        char c6 = (char) m9481(1).get();
        this.f8844--;
        return c6;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public int m9496() {
        int i5 = m9481(4).getInt();
        this.f8844 -= 4;
        return i5;
    }

    /* renamed from: י, reason: contains not printable characters */
    public long m9497() {
        long j5 = m9481(8).getLong();
        this.f8844 -= 8;
        return j5;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public short m9498() {
        short s5 = m9481(2).getShort();
        this.f8844 -= 2;
        return s5;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public boolean m9499() {
        return m9500() > 0;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public int m9500() {
        return this.f8844;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public boolean m9501() {
        return this.f8844 == 0;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public ByteBuffer m9502() {
        ByteBuffer remove = this.f8842.remove();
        this.f8844 -= remove.remaining();
        return remove;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public q m9503(ByteOrder byteOrder) {
        this.f8843 = byteOrder;
        return this;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public String m9504() {
        return m9505(null);
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public String m9505(Charset charset) {
        byte[] array;
        int remaining;
        int i5;
        if (charset == null) {
            charset = v2.c.f11699;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<ByteBuffer> it = this.f8842.iterator();
        while (it.hasNext()) {
            ByteBuffer next = it.next();
            if (next.isDirect()) {
                array = new byte[next.remaining()];
                remaining = next.remaining();
                next.get(array);
                i5 = 0;
            } else {
                array = next.array();
                int arrayOffset = next.arrayOffset() + next.position();
                remaining = next.remaining();
                i5 = arrayOffset;
            }
            sb.append(new String(array, i5, remaining, charset));
        }
        return sb.toString();
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public String m9506(Charset charset) {
        String m9505 = m9505(charset);
        m9507();
        return m9505;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public void m9507() {
        while (this.f8842.size() > 0) {
            m9482(this.f8842.remove());
        }
        this.f8844 = 0;
    }
}
