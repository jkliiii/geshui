package l1;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l extends g {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final byte[] f8979 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(c1.f.f4978);

    @Override // c1.f
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // c1.f
    public int hashCode() {
        return -670243078;
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        messageDigest.update(f8979);
    }

    @Override // l1.g
    /* renamed from: ʽ */
    protected Bitmap mo9609(f1.d dVar, Bitmap bitmap, int i5, int i6) {
        return g0.m9612(dVar, bitmap, i5, i6);
    }
}
