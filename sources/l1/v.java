package l1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class v implements c1.l<Drawable> {

    /* renamed from: ʼ, reason: contains not printable characters */
    private final c1.l<Bitmap> f9012;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final boolean f9013;

    public v(c1.l<Bitmap> lVar, boolean z5) {
        this.f9012 = lVar;
        this.f9013 = z5;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private e1.v<Drawable> m9709(Context context, e1.v<Bitmap> vVar) {
        return b0.m9587(context.getResources(), vVar);
    }

    @Override // c1.f
    public boolean equals(Object obj) {
        if (obj instanceof v) {
            return this.f9012.equals(((v) obj).f9012);
        }
        return false;
    }

    @Override // c1.f
    public int hashCode() {
        return this.f9012.hashCode();
    }

    @Override // c1.f
    /* renamed from: ʻ */
    public void mo5821(MessageDigest messageDigest) {
        this.f9012.mo5821(messageDigest);
    }

    @Override // c1.l
    /* renamed from: ʼ */
    public e1.v<Drawable> mo5838(Context context, e1.v<Drawable> vVar, int i5, int i6) {
        f1.d m6021 = com.bumptech.glide.b.m6011(context).m6021();
        Drawable drawable = vVar.get();
        e1.v<Bitmap> m9707 = u.m9707(m6021, drawable, i5, i6);
        if (m9707 != null) {
            e1.v<Bitmap> mo5838 = this.f9012.mo5838(context, m9707, i5, i6);
            if (!mo5838.equals(m9707)) {
                return m9709(context, mo5838);
            }
            mo5838.mo8413();
            return vVar;
        }
        if (!this.f9013) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public c1.l<BitmapDrawable> m9710() {
        return this;
    }
}
