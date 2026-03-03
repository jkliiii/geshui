package l1;

import android.graphics.Bitmap;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class h0 implements c1.j<Bitmap, Bitmap> {
    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(Bitmap bitmap, int i5, int i6, c1.h hVar) {
        return new a(bitmap);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(Bitmap bitmap, c1.h hVar) {
        return true;
    }

    /* compiled from: UnitBitmapDecoder.java */
    private static final class a implements e1.v<Bitmap> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final Bitmap f8965;

        a(Bitmap bitmap) {
            this.f8965 = bitmap;
        }

        @Override // e1.v
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f8965;
        }

        @Override // e1.v
        /* renamed from: ʼ */
        public int mo8411() {
            return y1.l.m12902(this.f8965);
        }

        @Override // e1.v
        /* renamed from: ʽ */
        public Class<Bitmap> mo8412() {
            return Bitmap.class;
        }

        @Override // e1.v
        /* renamed from: ʾ */
        public void mo8413() {
        }
    }
}
