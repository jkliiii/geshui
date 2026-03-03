package i1;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import i1.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g<Data> implements o<File, Data> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final d<Data> f8478;

    /* compiled from: FileLoader.java */
    public static class a<Data> implements p<File, Data> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final d<Data> f8479;

        public a(d<Data> dVar) {
            this.f8479 = dVar;
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public final o<File, Data> mo9118(s sVar) {
            return new g(this.f8479);
        }
    }

    /* compiled from: FileLoader.java */
    public static class b extends a<ParcelFileDescriptor> {

        /* compiled from: FileLoader.java */
        class a implements d<ParcelFileDescriptor> {
            a() {
            }

            @Override // i1.g.d
            /* renamed from: ʻ, reason: contains not printable characters */
            public Class<ParcelFileDescriptor> mo9149() {
                return ParcelFileDescriptor.class;
            }

            @Override // i1.g.d
            /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo9150(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // i1.g.d
            /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public ParcelFileDescriptor mo9151(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* compiled from: FileLoader.java */
    public interface d<Data> {
        /* renamed from: ʻ */
        Class<Data> mo9149();

        /* renamed from: ʼ */
        void mo9150(Data data) throws IOException;

        /* renamed from: ʽ */
        Data mo9151(File file) throws FileNotFoundException;
    }

    /* compiled from: FileLoader.java */
    public static class e extends a<InputStream> {

        /* compiled from: FileLoader.java */
        class a implements d<InputStream> {
            a() {
            }

            @Override // i1.g.d
            /* renamed from: ʻ */
            public Class<InputStream> mo9149() {
                return InputStream.class;
            }

            @Override // i1.g.d
            /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo9150(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // i1.g.d
            /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public InputStream mo9151(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public g(d<Data> dVar) {
        this.f8478 = dVar;
    }

    @Override // i1.o
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public o.a<Data> mo9113(File file, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(file), new c(file, this.f8478));
    }

    @Override // i1.o
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo9114(File file) {
        return true;
    }

    /* compiled from: FileLoader.java */
    private static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final File f8480;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final d<Data> f8481;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Data f8482;

        c(File file, d<Data> dVar) {
            this.f8480 = file;
            this.f8481 = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<Data> mo6132() {
            return this.f8481.mo9149();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
            Data data = this.f8482;
            if (data != null) {
                try {
                    this.f8481.mo9150(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data mo9151 = this.f8481.mo9151(this.f8480);
                this.f8482 = mo9151;
                aVar.mo6146(mo9151);
            } catch (FileNotFoundException e5) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e5);
                }
                aVar.mo6145(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
