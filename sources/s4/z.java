package s4;

import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: RequestBody.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class z {

    /* compiled from: RequestBody.java */
    class a extends z {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ u f11238;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ int f11239;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ byte[] f11240;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ int f11241;

        a(u uVar, int i5, byte[] bArr, int i6) {
            this.f11238 = uVar;
            this.f11239 = i5;
            this.f11240 = bArr;
            this.f11241 = i6;
        }

        @Override // s4.z
        /* renamed from: ʻ */
        public long mo11867() {
            return this.f11239;
        }

        @Override // s4.z
        @Nullable
        /* renamed from: ʼ */
        public u mo11868() {
            return this.f11238;
        }

        @Override // s4.z
        /* renamed from: ʿ */
        public void mo11869(c5.d dVar) throws IOException {
            dVar.write(this.f11240, this.f11241, this.f11239);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static z m12021(@Nullable u uVar, byte[] bArr) {
        return m12022(uVar, bArr, 0, bArr.length);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static z m12022(@Nullable u uVar, byte[] bArr, int i5, int i6) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        t4.c.m12057(bArr.length, i5, i6);
        return new a(uVar, i6, bArr, i5);
    }

    /* renamed from: ʻ */
    public abstract long mo11867() throws IOException;

    @Nullable
    /* renamed from: ʼ */
    public abstract u mo11868();

    /* renamed from: ʿ */
    public abstract void mo11869(c5.d dVar) throws IOException;
}
