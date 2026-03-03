package l1;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;
import l1.t;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f0 implements c1.j<InputStream, Bitmap> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final t f8955;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f1.b f8956;

    /* compiled from: StreamBitmapDecoder.java */
    static class a implements t.b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final d0 f8957;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final y1.d f8958;

        a(d0 d0Var, y1.d dVar) {
            this.f8957 = d0Var;
            this.f8958 = dVar;
        }

        @Override // l1.t.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo9607(f1.d dVar, Bitmap bitmap) throws IOException {
            IOException m12872 = this.f8958.m12872();
            if (m12872 != null) {
                if (bitmap == null) {
                    throw m12872;
                }
                dVar.mo8529(bitmap);
                throw m12872;
            }
        }

        @Override // l1.t.b
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo9608() {
            this.f8957.m9597();
        }
    }

    public f0(t tVar, f1.b bVar) {
        this.f8955 = tVar;
        this.f8956 = bVar;
    }

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(InputStream inputStream, int i5, int i6, c1.h hVar) throws IOException {
        d0 d0Var;
        boolean z5;
        if (inputStream instanceof d0) {
            d0Var = (d0) inputStream;
            z5 = false;
        } else {
            d0Var = new d0(inputStream, this.f8956);
            z5 = true;
        }
        y1.d m12871 = y1.d.m12871(d0Var);
        try {
            return this.f8955.m9702(new y1.i(m12871), i5, i6, hVar, new a(d0Var, m12871));
        } finally {
            m12871.m12873();
            if (z5) {
                d0Var.m9598();
            }
        }
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(InputStream inputStream, c1.h hVar) {
        return this.f8955.m9705(inputStream);
    }
}
