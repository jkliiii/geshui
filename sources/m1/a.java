package m1;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements e<ByteBuffer> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ByteBuffer f9105;

    /* compiled from: ByteBufferRewinder.java */
    /* renamed from: m1.a$a, reason: collision with other inner class name */
    public static class C0132a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʻ */
        public Class<ByteBuffer> mo6129() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public e<ByteBuffer> mo6130(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f9105 = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public ByteBuffer mo6126() {
        this.f9105.position(0);
        return this.f9105;
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: ʼ */
    public void mo6127() {
    }
}
