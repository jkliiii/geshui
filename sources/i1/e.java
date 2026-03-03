package i1;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import i1.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e<Model, Data> implements o<Model, Data> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final a<Data> f8462;

    /* compiled from: DataUrlLoader.java */
    public interface a<Data> {
        /* renamed from: ʻ, reason: contains not printable characters */
        Class<Data> mo9128();

        /* renamed from: ʼ, reason: contains not printable characters */
        void mo9129(Data data) throws IOException;

        /* renamed from: ʽ, reason: contains not printable characters */
        Data mo9130(String str) throws IllegalArgumentException;
    }

    /* compiled from: DataUrlLoader.java */
    public static final class c<Model> implements p<Model, InputStream> {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final a<InputStream> f8466 = new a();

        /* compiled from: DataUrlLoader.java */
        class a implements a<InputStream> {
            a() {
            }

            @Override // i1.e.a
            /* renamed from: ʻ */
            public Class<InputStream> mo9128() {
                return InputStream.class;
            }

            @Override // i1.e.a
            /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public void mo9129(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // i1.e.a
            /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public InputStream mo9130(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int indexOf = str.indexOf(44);
                if (indexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // i1.p
        /* renamed from: ʾ */
        public o<Model, InputStream> mo9118(s sVar) {
            return new e(this.f8466);
        }
    }

    public e(a<Data> aVar) {
        this.f8462 = aVar;
    }

    @Override // i1.o
    /* renamed from: ʻ */
    public o.a<Data> mo9113(Model model, int i5, int i6, c1.h hVar) {
        return new o.a<>(new x1.b(model), new b(model.toString(), this.f8462));
    }

    @Override // i1.o
    /* renamed from: ʼ */
    public boolean mo9114(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* compiled from: DataUrlLoader.java */
    private static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final String f8463;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final a<Data> f8464;

        /* renamed from: ˆ, reason: contains not printable characters */
        private Data f8465;

        b(String str, a<Data> aVar) {
            this.f8463 = str;
            this.f8464 = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʻ */
        public Class<Data> mo6132() {
            return this.f8464.mo9128();
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʼ */
        public void mo6137() {
            try {
                this.f8464.mo9129(this.f8465);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ʿ */
        public c1.a mo6140() {
            return c1.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        /* renamed from: ˆ */
        public void mo6141(com.bumptech.glide.g gVar, d.a<? super Data> aVar) {
            try {
                Data mo9130 = this.f8464.mo9130(this.f8463);
                this.f8465 = mo9130;
                aVar.mo6146(mo9130);
            } catch (IllegalArgumentException e5) {
                aVar.mo6145(e5);
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }
    }
}
