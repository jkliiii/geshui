package l1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b0 implements e1.v<BitmapDrawable>, e1.r {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Resources f8938;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final e1.v<Bitmap> f8939;

    private b0(Resources resources, e1.v<Bitmap> vVar) {
        this.f8938 = (Resources) y1.k.m12893(resources);
        this.f8939 = (e1.v) y1.k.m12893(vVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static e1.v<BitmapDrawable> m9587(Resources resources, e1.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new b0(resources, vVar);
    }

    @Override // e1.r
    /* renamed from: ʻ */
    public void mo8429() {
        e1.v<Bitmap> vVar = this.f8939;
        if (vVar instanceof e1.r) {
            ((e1.r) vVar).mo8429();
        }
    }

    @Override // e1.v
    /* renamed from: ʼ */
    public int mo8411() {
        return this.f8939.mo8411();
    }

    @Override // e1.v
    /* renamed from: ʽ */
    public Class<BitmapDrawable> mo8412() {
        return BitmapDrawable.class;
    }

    @Override // e1.v
    /* renamed from: ʾ */
    public void mo8413() {
        this.f8939.mo8413();
    }

    @Override // e1.v
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f8938, this.f8939.get());
    }
}
