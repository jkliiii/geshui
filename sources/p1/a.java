package p1;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import b1.a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import k1.p;
import y1.l;

/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements c1.j<ByteBuffer, c> {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final C0147a f10164 = new C0147a();

    /* renamed from: ˈ, reason: contains not printable characters */
    private static final b f10165 = new b();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f10166;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<ImageHeaderParser> f10167;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final b f10168;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final C0147a f10169;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final p1.b f10170;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: p1.a$a, reason: collision with other inner class name */
    static class C0147a {
        C0147a() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        b1.a m11020(a.InterfaceC0069a interfaceC0069a, b1.c cVar, ByteBuffer byteBuffer, int i5) {
            return new b1.e(interfaceC0069a, cVar, byteBuffer, i5);
        }
    }

    /* compiled from: ByteBufferGifDecoder.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Queue<b1.d> f10171 = l.m12900(0);

        b() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        synchronized b1.d m11021(ByteBuffer byteBuffer) {
            b1.d poll;
            poll = this.f10171.poll();
            if (poll == null) {
                poll = new b1.d();
            }
            return poll.m5669(byteBuffer);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        synchronized void m11022(b1.d dVar) {
            dVar.m5667();
            this.f10171.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, f1.d dVar, f1.b bVar) {
        this(context, list, dVar, bVar, f10165, f10164);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private e m11016(ByteBuffer byteBuffer, int i5, int i6, b1.d dVar, c1.h hVar) {
        long m12879 = y1.g.m12879();
        try {
            b1.c m5668 = dVar.m5668();
            if (m5668.m5649() > 0 && m5668.m5650() == 0) {
                Bitmap.Config config = hVar.m5831(i.f10211) == c1.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                b1.a m11020 = this.f10169.m11020(this.f10170, m5668, byteBuffer, m11017(m5668, i5, i6));
                m11020.mo5640(config);
                m11020.mo5636();
                Bitmap mo5635 = m11020.mo5635();
                if (mo5635 == null) {
                    return null;
                }
                e eVar = new e(new c(this.f10166, m11020, p.m9354(), i5, i6, mo5635));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + y1.g.m12878(m12879));
                }
                return eVar;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + y1.g.m12878(m12879));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + y1.g.m12878(m12879));
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static int m11017(b1.c cVar, int i5, int i6) {
        int min = Math.min(cVar.m5648() / i6, cVar.m5651() / i5);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i5 + "x" + i6 + "], actual dimens: [" + cVar.m5651() + "x" + cVar.m5648() + "]");
        }
        return max;
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e mo5835(ByteBuffer byteBuffer, int i5, int i6, c1.h hVar) {
        b1.d m11021 = this.f10168.m11021(byteBuffer);
        try {
            return m11016(byteBuffer, i5, i6, m11021, hVar);
        } finally {
            this.f10168.m11022(m11021);
        }
    }

    @Override // c1.j
    /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(ByteBuffer byteBuffer, c1.h hVar) throws IOException {
        return !((Boolean) hVar.m5831(i.f10212)).booleanValue() && com.bumptech.glide.load.a.m6121(this.f10167, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    a(Context context, List<ImageHeaderParser> list, f1.d dVar, f1.b bVar, b bVar2, C0147a c0147a) {
        this.f10166 = context.getApplicationContext();
        this.f10167 = list;
        this.f10169 = c0147a;
        this.f10170 = new p1.b(dVar, bVar);
        this.f10168 = bVar2;
    }
}
