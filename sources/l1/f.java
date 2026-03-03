package l1;

import android.graphics.Bitmap;

/* compiled from: BitmapResource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f implements e1.v<Bitmap>, e1.r {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Bitmap f8953;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final f1.d f8954;

    public f(Bitmap bitmap, f1.d dVar) {
        this.f8953 = (Bitmap) y1.k.m12894(bitmap, "Bitmap must not be null");
        this.f8954 = (f1.d) y1.k.m12894(dVar, "BitmapPool must not be null");
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static f m9603(Bitmap bitmap, f1.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new f(bitmap, dVar);
    }

    @Override // e1.r
    /* renamed from: ʻ */
    public void mo8429() {
        this.f8953.prepareToDraw();
    }

    @Override // e1.v
    /* renamed from: ʼ */
    public int mo8411() {
        return y1.l.m12902(this.f8953);
    }

    @Override // e1.v
    /* renamed from: ʽ */
    public Class<Bitmap> mo8412() {
        return Bitmap.class;
    }

    @Override // e1.v
    /* renamed from: ʾ */
    public void mo8413() {
        this.f8954.mo8529(this.f8953);
    }

    @Override // e1.v
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f8953;
    }
}
