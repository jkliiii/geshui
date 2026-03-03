package r2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import k2.b0;
import k2.q;
import k2.s;
import l2.d;

/* compiled from: GZIPInputFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends g {

    /* renamed from: ˋ, reason: contains not printable characters */
    boolean f10835;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected CRC32 f10836;

    /* compiled from: GZIPInputFilter.java */
    class a implements b0.j<byte[]> {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f10837;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f10838;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ s f10839;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ b0 f10840;

        /* compiled from: GZIPInputFilter.java */
        /* renamed from: r2.f$a$a, reason: collision with other inner class name */
        class C0157a implements b0.j<byte[]> {

            /* compiled from: GZIPInputFilter.java */
            /* renamed from: r2.f$a$a$a, reason: collision with other inner class name */
            class C0158a implements b0.j<byte[]> {
                C0158a() {
                }

                @Override // k2.b0.j
                /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
                public void mo9384(byte[] bArr) {
                    a aVar = a.this;
                    if (aVar.f10838) {
                        f.this.f10836.update(bArr, 0, bArr.length);
                    }
                    a.this.m11687();
                }
            }

            C0157a() {
            }

            @Override // k2.b0.j
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo9384(byte[] bArr) {
                a aVar = a.this;
                if (aVar.f10838) {
                    f.this.f10836.update(bArr, 0, 2);
                }
                a.this.f10840.m9381(f.m11683(bArr, 0, ByteOrder.LITTLE_ENDIAN) & 65535, new C0158a());
            }
        }

        /* compiled from: GZIPInputFilter.java */
        class b implements l2.d {
            b() {
            }

            @Override // l2.d
            /* renamed from: ᵢ */
            public void mo9377(s sVar, q qVar) {
                if (a.this.f10838) {
                    while (qVar.m9484() > 0) {
                        ByteBuffer m9502 = qVar.m9502();
                        f.this.f10836.update(m9502.array(), m9502.arrayOffset() + m9502.position(), m9502.remaining());
                        q.m9482(m9502);
                    }
                }
                qVar.m9507();
                a.this.m11686();
            }
        }

        /* compiled from: GZIPInputFilter.java */
        class c implements b0.j<byte[]> {
            c() {
            }

            @Override // k2.b0.j
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo9384(byte[] bArr) {
                if (((short) f.this.f10836.getValue()) != f.m11683(bArr, 0, ByteOrder.LITTLE_ENDIAN)) {
                    f.this.mo9511(new IOException("CRC mismatch"));
                    return;
                }
                f.this.f10836.reset();
                a aVar = a.this;
                f fVar = f.this;
                fVar.f10835 = false;
                fVar.mo9512(aVar.f10839);
            }
        }

        a(s sVar, b0 b0Var) {
            this.f10839 = sVar;
            this.f10840 = b0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʾ, reason: contains not printable characters */
        public void m11686() {
            if (this.f10838) {
                this.f10840.m9381(2, new c());
                return;
            }
            f fVar = f.this;
            fVar.f10835 = false;
            fVar.mo9512(this.f10839);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ʿ, reason: contains not printable characters */
        public void m11687() {
            b0 b0Var = new b0(this.f10839);
            b bVar = new b();
            int i5 = this.f10837;
            if ((i5 & 8) != 0) {
                b0Var.m9382((byte) 0, bVar);
            } else if ((i5 & 16) != 0) {
                b0Var.m9382((byte) 0, bVar);
            } else {
                m11686();
            }
        }

        @Override // k2.b0.j
        /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9384(byte[] bArr) {
            short m11683 = f.m11683(bArr, 0, ByteOrder.LITTLE_ENDIAN);
            if (m11683 != -29921) {
                f.this.mo9511(new IOException(String.format(Locale.ENGLISH, "unknown format (magic number %x)", Short.valueOf(m11683))));
                this.f10839.mo9362(new d.a());
                return;
            }
            byte b6 = bArr[3];
            this.f10837 = b6;
            boolean z5 = (b6 & 2) != 0;
            this.f10838 = z5;
            if (z5) {
                f.this.f10836.update(bArr, 0, bArr.length);
            }
            if ((this.f10837 & 4) != 0) {
                this.f10840.m9381(2, new C0157a());
            } else {
                m11687();
            }
        }
    }

    public f() {
        super(new Inflater(true));
        this.f10835 = true;
        this.f10836 = new CRC32();
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    static short m11683(byte[] bArr, int i5, ByteOrder byteOrder) {
        int i6;
        byte b6;
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            i6 = bArr[i5] << 8;
            b6 = bArr[i5 + 1];
        } else {
            i6 = bArr[i5 + 1] << 8;
            b6 = bArr[i5];
        }
        return (short) ((b6 & 255) | i6);
    }

    @Override // r2.g, k2.x, l2.d
    /* renamed from: ᵢ */
    public void mo9377(s sVar, q qVar) {
        if (!this.f10835) {
            super.mo9377(sVar, qVar);
        } else {
            b0 b0Var = new b0(sVar);
            b0Var.m9381(10, new a(sVar, b0Var));
        }
    }
}
