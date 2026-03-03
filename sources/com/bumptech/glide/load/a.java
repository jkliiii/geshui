package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import l1.d0;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0079a implements h {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ InputStream f5202;

        C0079a(InputStream inputStream) {
            this.f5202 = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        /* renamed from: ʻ, reason: contains not printable characters */
        public ImageHeaderParser.ImageType mo6123(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo6113(this.f5202);
            } finally {
                this.f5202.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class b implements h {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ByteBuffer f5203;

        b(ByteBuffer byteBuffer) {
            this.f5203 = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        /* renamed from: ʻ */
        public ImageHeaderParser.ImageType mo6123(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo6110(this.f5203);
            } finally {
                y1.a.m12865(this.f5203);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class c implements h {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ParcelFileDescriptorRewinder f5204;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ f1.b f5205;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, f1.b bVar) {
            this.f5204 = parcelFileDescriptorRewinder;
            this.f5205 = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        /* renamed from: ʻ */
        public ImageHeaderParser.ImageType mo6123(ImageHeaderParser imageHeaderParser) throws IOException {
            d0 d0Var;
            d0 d0Var2 = null;
            try {
                d0Var = new d0(new FileInputStream(this.f5204.mo6126().getFileDescriptor()), this.f5205);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType mo6113 = imageHeaderParser.mo6113(d0Var);
                d0Var.m9598();
                this.f5204.mo6126();
                return mo6113;
            } catch (Throwable th2) {
                th = th2;
                d0Var2 = d0Var;
                if (d0Var2 != null) {
                    d0Var2.m9598();
                }
                this.f5204.mo6126();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class d implements g {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ByteBuffer f5206;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ f1.b f5207;

        d(ByteBuffer byteBuffer, f1.b bVar) {
            this.f5206 = byteBuffer;
            this.f5207 = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        /* renamed from: ʻ, reason: contains not printable characters */
        public int mo6124(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo6111(this.f5206, this.f5207);
            } finally {
                y1.a.m12865(this.f5206);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class e implements g {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ InputStream f5208;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ f1.b f5209;

        e(InputStream inputStream, f1.b bVar) {
            this.f5208 = inputStream;
            this.f5209 = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        /* renamed from: ʻ */
        public int mo6124(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo6112(this.f5208, this.f5209);
            } finally {
                this.f5208.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class f implements g {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ParcelFileDescriptorRewinder f5210;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ f1.b f5211;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, f1.b bVar) {
            this.f5210 = parcelFileDescriptorRewinder;
            this.f5211 = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        /* renamed from: ʻ */
        public int mo6124(ImageHeaderParser imageHeaderParser) throws IOException {
            d0 d0Var;
            d0 d0Var2 = null;
            try {
                d0Var = new d0(new FileInputStream(this.f5210.mo6126().getFileDescriptor()), this.f5211);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int mo6112 = imageHeaderParser.mo6112(d0Var, this.f5211);
                d0Var.m9598();
                this.f5210.mo6126();
                return mo6112;
            } catch (Throwable th2) {
                th = th2;
                d0Var2 = d0Var;
                if (d0Var2 != null) {
                    d0Var2.m9598();
                }
                this.f5210.mo6126();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface g {
        /* renamed from: ʻ */
        int mo6124(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface h {
        /* renamed from: ʻ */
        ImageHeaderParser.ImageType mo6123(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m6115(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, f1.b bVar) throws IOException {
        return m6118(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m6116(List<ImageHeaderParser> list, InputStream inputStream, f1.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new d0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m6118(list, new e(inputStream, bVar));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m6117(List<ImageHeaderParser> list, ByteBuffer byteBuffer, f1.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m6118(list, new d(byteBuffer, bVar));
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int m6118(List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int mo6124 = gVar.mo6124(list.get(i5));
            if (mo6124 != -1) {
                return mo6124;
            }
        }
        return -1;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static ImageHeaderParser.ImageType m6119(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, f1.b bVar) throws IOException {
        return m6122(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static ImageHeaderParser.ImageType m6120(List<ImageHeaderParser> list, InputStream inputStream, f1.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new d0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return m6122(list, new C0079a(inputStream));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static ImageHeaderParser.ImageType m6121(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m6122(list, new b(byteBuffer));
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private static ImageHeaderParser.ImageType m6122(List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ImageHeaderParser.ImageType mo6123 = hVar.mo6123(list.get(i5));
            if (mo6123 != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo6123;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
