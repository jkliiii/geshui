package n1;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import e1.r;
import e1.v;

/* compiled from: DrawableResource.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class h<T extends Drawable> implements v<T>, r {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final T f9520;

    public h(T t5) {
        this.f9520 = (T) y1.k.m12893(t5);
    }

    @Override // e1.r
    /* renamed from: ʻ */
    public void mo8429() {
        T t5 = this.f9520;
        if (t5 instanceof BitmapDrawable) {
            ((BitmapDrawable) t5).getBitmap().prepareToDraw();
        } else if (t5 instanceof p1.c) {
            ((p1.c) t5).m11032().prepareToDraw();
        }
    }

    @Override // e1.v
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final T get() {
        Drawable.ConstantState constantState = this.f9520.getConstantState();
        return constantState == null ? this.f9520 : (T) constantState.newDrawable();
    }
}
