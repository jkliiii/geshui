package i1;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import i1.o;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferFileLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d implements o<File, ByteBuffer> {

    /* compiled from: ByteBufferFileLoader.java */
    public static class b implements p<File, ByteBuffer> {
        @Override // i1.p
        /* renamed from: ʾ */
        public o<File, ByteBuffer> mo9118(s sVar) {
            return new d();
        }
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<ByteBuffer> mo9113(File file, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(file), new a(file));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(File file) {
        return true;
    }

    /* compiled from: ByteBufferFileLoader.java */
    private static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final File f8461;

        a(File file) {
            this.f8461 = file;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<ByteBuffer> mo6132() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.mo6146(y1.a.m12862(this.f8461));
            } catch (IOException e5) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e5);
                }
                aVar.mo6145(e5);
            }
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
