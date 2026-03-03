package com.bumptech.glide.load;

import f1.b;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: E:\78999\cookie_5123796.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* renamed from: ʾ, reason: contains not printable characters */
        private final boolean f5200;

        ImageType(boolean z5) {
            this.f5200 = z5;
        }

        public boolean hasAlpha() {
            return this.f5200;
        }

        public boolean isWebp() {
            int i5 = a.f5201[ordinal()];
            return i5 == 1 || i5 == 2 || i5 == 3;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f5201;

        static {
            int[] iArr = new int[ImageType.values().length];
            f5201 = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5201[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5201[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    ImageType mo6110(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: ʼ, reason: contains not printable characters */
    int mo6111(ByteBuffer byteBuffer, b bVar) throws IOException;

    /* renamed from: ʽ, reason: contains not printable characters */
    int mo6112(InputStream inputStream, b bVar) throws IOException;

    /* renamed from: ʾ, reason: contains not printable characters */
    ImageType mo6113(InputStream inputStream) throws IOException;
}
