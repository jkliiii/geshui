package p1;

import android.content.Context;
import android.graphics.Bitmap;
import c1.l;
import e1.v;
import java.security.MessageDigest;
import y1.k;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f implements l<c> {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final l<Bitmap> f10186;

    public f(l<Bitmap> lVar) {
        this.f10186 = (l) k.m12893(lVar);
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f10186.equals(((f) obj).f10186);
        }
        return false;
    }

    @Override // c1.f
    public int hashCode() {
        return this.f10186.hashCode();
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        this.f10186.mo5821(messageDigest);
    }

    @Override // c1.l
    /* renamed from: ʼ */
    public v<c> mo5838(Context context, v<c> vVar, int i5, int i6) {
        c cVar = vVar.get();
        v<Bitmap> fVar = new l1.f(cVar.m11032(), com.bumptech.glide.b.m6011(context).m6021());
        v<Bitmap> mo5838 = this.f10186.mo5838(context, fVar, i5, i6);
        if (!fVar.equals(mo5838)) {
            fVar.mo8413();
        }
        cVar.m11037(this.f10186, mo5838.get());
        return vVar;
    }
}
