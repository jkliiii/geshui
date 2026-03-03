package l1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: ResourceBitmapDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e0 implements c1.j<Uri, Bitmap> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final n1.j f8951;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final f1.d f8952;

    public e0(n1.j jVar, f1.d dVar) {
        this.f8951 = jVar;
        this.f8952 = dVar;
    }

    @Override // c1.j
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public e1.v<Bitmap> mo5835(Uri uri, int i5, int i6, c1.h hVar) {
        e1.v<Drawable> mo5835 = this.f8951.mo5835(uri, i5, i6, hVar);
        if (mo5835 == null) {
            return null;
        }
        return u.m9707(this.f8952, mo5835.get(), i5, i6);
    }

    @Override // c1.j
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public boolean mo5836(Uri uri, c1.h hVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
