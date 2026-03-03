package l1;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class g implements c1.l<Bitmap> {
    @Override // c1.l
    /* renamed from: ʼ */
    public final e1.v<Bitmap> mo5838(Context context, e1.v<Bitmap> vVar, int i5, int i6) {
        if (!y1.l.m12914(i5, i6)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i5 + " or height: " + i6 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        f1.d m6021 = com.bumptech.glide.b.m6011(context).m6021();
        Bitmap bitmap = vVar.get();
        if (i5 == Integer.MIN_VALUE) {
            i5 = bitmap.getWidth();
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getHeight();
        }
        Bitmap mo9609 = mo9609(m6021, bitmap, i5, i6);
        return bitmap.equals(mo9609) ? vVar : f.m9603(mo9609, m6021);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected abstract Bitmap mo9609(f1.d dVar, Bitmap bitmap, int i5, int i6);
}
