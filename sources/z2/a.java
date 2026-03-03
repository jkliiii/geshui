package z2;

/* compiled from: BitmapDecodeException.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends Exception {

    /* renamed from: ʾ, reason: contains not printable characters */
    public final int f12767;

    /* renamed from: ʿ, reason: contains not printable characters */
    public final int f12768;

    public a(int i5, int i6) {
        this.f12767 = i5;
        this.f12768 = i6;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + " size=" + this.f12767 + 'x' + this.f12768;
    }
}
