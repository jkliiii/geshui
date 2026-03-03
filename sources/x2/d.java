package x2;

import android.graphics.Bitmap;

/* compiled from: BitmapInfoToBitmap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class d extends m2.x<Bitmap, z2.b> {

    /* renamed from: י, reason: contains not printable characters */
    n f12163;

    public d(n nVar) {
        this.f12163 = nVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m2.x
    /* renamed from: ٴٴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public void mo9912(z2.b bVar) throws Exception {
        if (this.f12163.mo12694() != null) {
            cancel();
            return;
        }
        Exception exc = bVar.f12775;
        if (exc != null) {
            m9905(exc);
        } else {
            m9906(bVar.f12774);
        }
    }
}
