package i1;

import com.bumptech.glide.load.data.d;
import i1.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ByteArrayLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b<Data> implements o<byte[], Data> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final InterfaceC0116b<Data> f8456;

    /* compiled from: ByteArrayLoader.java */
    public static class a implements p<byte[], ByteBuffer> {

        /* compiled from: ByteArrayLoader.java */
        /* renamed from: i1.b$a$a, reason: collision with other inner class name */
        class C0115a implements InterfaceC0116b<ByteBuffer> {
            C0115a() {
            }

            @Override // i1.b.InterfaceC0116b
            /* renamed from: ʻ, reason: contains not printable characters */
            public Class<ByteBuffer> mo9121() {
                return ByteBuffer.class;
            }

            @Override // i1.b.InterfaceC0116b
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public ByteBuffer mo9122(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<byte[], ByteBuffer> mo9118(s sVar) {
            return new b(new C0115a());
        }
    }

    /* compiled from: ByteArrayLoader.java */
    /* renamed from: i1.b$b, reason: collision with other inner class name */
    public interface InterfaceC0116b<Data> {
        /* renamed from: ʻ */
        Class<Data> mo9121();

        /* renamed from: ʼ */
        Data mo9122(byte[] bArr);
    }

    /* compiled from: ByteArrayLoader.java */
    public static class d implements p<byte[], InputStream> {

        /* compiled from: ByteArrayLoader.java */
        class a implements InterfaceC0116b<InputStream> {
            a() {
            }

            @Override // i1.b.InterfaceC0116b
            /* renamed from: ʻ */
            public Class<InputStream> mo9121() {
                return InputStream.class;
            }

            @Override // i1.b.InterfaceC0116b
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public InputStream mo9122(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<byte[], InputStream> mo9118(s sVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0116b<Data> interfaceC0116b) {
        this.f8456 = interfaceC0116b;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(byte[] bArr, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(bArr), new c(bArr, this.f8456));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(byte[] bArr) {
        return true;
    }

    /* compiled from: ByteArrayLoader.java */
    private static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final byte[] f8458;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final InterfaceC0116b<Data> f8459;

        c(byte[] bArr, InterfaceC0116b<Data> interfaceC0116b) {
            this.f8458 = bArr;
            this.f8459 = interfaceC0116b;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<Data> mo6132() {
            return this.f8459.mo9121();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            aVar.mo6146(this.f8459.mo9122(this.f8458));
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
        }
    }
}
