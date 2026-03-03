package s4;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* compiled from: ResponseBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b0 implements Closeable {

    /* compiled from: ResponseBody.java */
    class a extends b0 {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ u f10907;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ long f10908;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ c5.e f10909;

        a(u uVar, long j5, c5.e eVar) {
            this.f10907 = uVar;
            this.f10908 = j5;
            this.f10909 = eVar;
        }

        @Override // s4.b0
        /* renamed from: ᴵᴵ */
        public c5.e mo11766() {
            return this.f10909;
        }

        @Override // s4.b0
        /* renamed from: ﹶ */
        public long mo11767() {
            return this.f10908;
        }

        @Override // s4.b0
        @Nullable
        /* renamed from: ﾞ */
        public u mo11768() {
            return this.f10907;
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public static b0 m11760(@Nullable u uVar, byte[] bArr) {
        return m11762(uVar, bArr.length, new c5.c().write(bArr));
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private Charset m11761() {
        u mo11768 = mo11768();
        return mo11768 != null ? mo11768.m11948(t4.c.f11332) : t4.c.f11332;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public static b0 m11762(@Nullable u uVar, long j5, c5.e eVar) {
        if (eVar != null) {
            return new a(uVar, j5, eVar);
        }
        throw new NullPointerException("source == null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t4.c.m12059(mo11766());
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public final String m11763() throws IOException {
        c5.e mo11766 = mo11766();
        try {
            return mo11766.mo5907(t4.c.m12053(mo11766, m11761()));
        } finally {
            t4.c.m12059(mo11766);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final InputStream m11764() {
        return mo11766().mo5909();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final byte[] m11765() throws IOException {
        long mo11767 = mo11767();
        if (mo11767 > 2147483647L) {
            throw new IOException("Cannot buffer entire body for content length: " + mo11767);
        }
        c5.e mo11766 = mo11766();
        try {
            byte[] mo5886 = mo11766.mo5886();
            t4.c.m12059(mo11766);
            if (mo11767 == -1 || mo11767 == mo5886.length) {
                return mo5886;
            }
            throw new IOException("Content-Length (" + mo11767 + ") and stream length (" + mo5886.length + ") disagree");
        } catch (Throwable th) {
            t4.c.m12059(mo11766);
            throw th;
        }
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public abstract c5.e mo11766();

    /* renamed from: ﹶ, reason: contains not printable characters */
    public abstract long mo11767();

    @Nullable
    /* renamed from: ﾞ, reason: contains not printable characters */
    public abstract u mo11768();
}
