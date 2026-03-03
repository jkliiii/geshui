package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.os.t;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: MetadataRepo.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class l {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e0.b f3287;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final char[] f3288;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final a f3289 = new a(1024);

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Typeface f3290;

    /* compiled from: MetadataRepo.java */
    static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final SparseArray<a> f3291;

        /* renamed from: ʼ, reason: contains not printable characters */
        private g f3292;

        private a() {
            this(1);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        a m3862(int i5) {
            SparseArray<a> sparseArray = this.f3291;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        final g m3863() {
            return this.f3292;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m3864(g gVar, int i5, int i6) {
            a m3862 = m3862(gVar.m3810(i5));
            if (m3862 == null) {
                m3862 = new a();
                this.f3291.put(gVar.m3810(i5), m3862);
            }
            if (i6 > i5) {
                m3862.m3864(gVar, i5 + 1, i6);
            } else {
                m3862.f3292 = gVar;
            }
        }

        a(int i5) {
            this.f3291 = new SparseArray<>(i5);
        }
    }

    private l(Typeface typeface, e0.b bVar) {
        this.f3290 = typeface;
        this.f3287 = bVar;
        this.f3288 = new char[bVar.m8274() * 2];
        m3854(bVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m3854(e0.b bVar) {
        int m8274 = bVar.m8274();
        for (int i5 = 0; i5 < m8274; i5++) {
            g gVar = new g(this, i5);
            Character.toChars(gVar.m3814(), this.f3288, i5 * 2);
            m3861(gVar);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static l m3855(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            t.m2443("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.m3847(byteBuffer));
        } finally {
            t.m2444();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public char[] m3856() {
        return this.f3288;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public e0.b m3857() {
        return this.f3287;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    int m3858() {
        return this.f3287.m8275();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    a m3859() {
        return this.f3289;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    Typeface m3860() {
        return this.f3290;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m3861(g gVar) {
        androidx.core.util.h.m2584(gVar, "emoji metadata cannot be null");
        androidx.core.util.h.m2578(gVar.m3811() > 0, "invalid metadata codepoint length");
        this.f3289.m3864(gVar, 0, gVar.m3811() - 1);
    }
}
