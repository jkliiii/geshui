package l1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b implements c1.k<BitmapDrawable> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.d f8936;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c1.k<Bitmap> f8937;

    public b(f1.d dVar, c1.k<Bitmap> kVar) {
        this.f8936 = dVar;
        this.f8937 = kVar;
    }

    @Override // c1.k
    /* renamed from: ʼ */
    public c1.c mo5837(c1.h hVar) {
        return this.f8937.mo5837(hVar);
    }

    @Override // c1.d
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5820(e1.v<BitmapDrawable> vVar, File file, c1.h hVar) {
        return this.f8937.mo5820(new f(vVar.get().getBitmap(), this.f8936), file, hVar);
    }
}
