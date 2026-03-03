package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataListReader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class k {

    /* compiled from: MetadataListReader.java */
    private static class a implements c {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final ByteBuffer f3284;

        a(ByteBuffer byteBuffer) {
            this.f3284 = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.f3284.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() throws IOException {
            return k.m3849(this.f3284.getShort());
        }

        @Override // androidx.emoji2.text.k.c
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo3850(int i5) throws IOException {
            ByteBuffer byteBuffer = this.f3284;
            byteBuffer.position(byteBuffer.position() + i5);
        }

        @Override // androidx.emoji2.text.k.c
        /* renamed from: ʼ, reason: contains not printable characters */
        public long mo3851() throws IOException {
            return k.m3848(this.f3284.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        /* renamed from: ʽ, reason: contains not printable characters */
        public int mo3852() throws IOException {
            return this.f3284.getInt();
        }
    }

    /* compiled from: MetadataListReader.java */
    private static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final long f3285;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final long f3286;

        b(long j5, long j6) {
            this.f3285 = j5;
            this.f3286 = j6;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        long m3853() {
            return this.f3285;
        }
    }

    /* compiled from: MetadataListReader.java */
    private interface c {
        long getPosition();

        int readUnsignedShort() throws IOException;

        /* renamed from: ʻ */
        void mo3850(int i5) throws IOException;

        /* renamed from: ʼ */
        long mo3851() throws IOException;

        /* renamed from: ʽ */
        int mo3852() throws IOException;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static b m3846(c cVar) throws IOException {
        long j5;
        cVar.mo3850(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.mo3850(6);
        int i5 = 0;
        while (true) {
            if (i5 >= readUnsignedShort) {
                j5 = -1;
                break;
            }
            int mo3852 = cVar.mo3852();
            cVar.mo3850(4);
            j5 = cVar.mo3851();
            cVar.mo3850(4);
            if (1835365473 == mo3852) {
                break;
            }
            i5++;
        }
        if (j5 != -1) {
            cVar.mo3850((int) (j5 - cVar.getPosition()));
            cVar.mo3850(12);
            long mo3851 = cVar.mo3851();
            for (int i6 = 0; i6 < mo3851; i6++) {
                int mo38522 = cVar.mo3852();
                long mo38512 = cVar.mo3851();
                long mo38513 = cVar.mo3851();
                if (1164798569 == mo38522 || 1701669481 == mo38522) {
                    return new b(mo38512 + j5, mo38513);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static e0.b m3847(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m3846(new a(duplicate)).m3853());
        return e0.b.m8269(duplicate);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static long m3848(int i5) {
        return i5 & 4294967295L;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static int m3849(short s5) {
        return s5 & 65535;
    }
}
