package n1;

import android.graphics.drawable.Drawable;
import e1.v;

/* compiled from: NonOwnedDrawableResource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class i extends h<Drawable> {
    private i(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static v<Drawable> m10439(Drawable drawable) {
        if (drawable != null) {
            return new i(drawable);
        }
        return null;
    }

    @Override // e1.v
    /* renamed from: ʼ */
    public int mo8411() {
        return Math.max(1, this.f9520.getIntrinsicWidth() * this.f9520.getIntrinsicHeight() * 4);
    }

    @Override // e1.v
    /* renamed from: ʽ */
    public Class<Drawable> mo8412() {
        return this.f9520.getClass();
    }

    @Override // e1.v
    /* renamed from: ʾ */
    public void mo8413() {
    }
}
