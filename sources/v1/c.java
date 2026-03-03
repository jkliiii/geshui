package v1;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import y1.l;

/* compiled from: CustomTarget.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class c<T> implements h<T> {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f11671;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f11672;

    /* renamed from: ˆ, reason: contains not printable characters */
    private u1.d f11673;

    public c() {
        this(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    }

    @Override // v1.h
    /* renamed from: ʻ, reason: contains not printable characters */
    public final void mo12287(g gVar) {
        gVar.mo12199(this.f11671, this.f11672);
    }

    @Override // v1.h
    /* renamed from: ʿ, reason: contains not printable characters */
    public final u1.d mo12288() {
        return this.f11673;
    }

    @Override // v1.h
    /* renamed from: ˈ, reason: contains not printable characters */
    public final void mo12289(u1.d dVar) {
        this.f11673 = dVar;
    }

    public c(int i5, int i6) {
        if (l.m12914(i5, i6)) {
            this.f11671 = i5;
            this.f11672 = i6;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i5 + " and height: " + i6);
    }

    @Override // v1.h
    /* renamed from: ˆ */
    public void mo12283(Drawable drawable) {
    }

    @Override // v1.h
    /* renamed from: ˊ */
    public void mo12284(Drawable drawable) {
    }

    @Override // v1.h
    /* renamed from: ˎ, reason: contains not printable characters */
    public final void mo12290(g gVar) {
    }

    @Override // r1.l
    /* renamed from: ʼ */
    public void mo6091() {
    }

    @Override // r1.l
    /* renamed from: ʽ */
    public void mo6092() {
    }

    @Override // r1.l
    /* renamed from: ʾ */
    public void mo6093() {
    }
}
