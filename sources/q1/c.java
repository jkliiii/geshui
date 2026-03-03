package q1;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c1.h;
import e1.v;

/* compiled from: DrawableBytesTranscoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c implements e<Drawable, byte[]> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final f1.d f10615;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final e<Bitmap, byte[]> f10616;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final e<p1.c, byte[]> f10617;

    public c(f1.d dVar, e<Bitmap, byte[]> eVar, e<p1.c, byte[]> eVar2) {
        this.f10615 = dVar;
        this.f10616 = eVar;
        this.f10617 = eVar2;
    }

    @Override // q1.e
    /* renamed from: ʻ */
    public v<byte[]> mo11467(v<Drawable> vVar, h hVar) {
        Drawable drawable = vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f10616.mo11467(l1.f.m9603(((BitmapDrawable) drawable).getBitmap(), this.f10615), hVar);
        }
        if (drawable instanceof p1.c) {
            return this.f10617.mo11467(m11468(vVar), hVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʼ, reason: contains not printable characters */
    private static v<p1.c> m11468(v<Drawable> vVar) {
        return vVar;
    }
}
