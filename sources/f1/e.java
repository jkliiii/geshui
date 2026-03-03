package f1;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements d {
    @Override // f1.d
    /* renamed from: ʽ */
    public Bitmap mo8528(int i5, int i6, Bitmap.Config config) {
        return Bitmap.createBitmap(i5, i6, config);
    }

    @Override // f1.d
    /* renamed from: ʾ */
    public void mo8529(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // f1.d
    /* renamed from: ʿ */
    public Bitmap mo8530(int i5, int i6, Bitmap.Config config) {
        return mo8528(i5, i6, config);
    }

    @Override // f1.d
    /* renamed from: ʻ */
    public void mo8526(int i5) {
    }

    @Override // f1.d
    /* renamed from: ʼ */
    public void mo8527() {
    }
}
