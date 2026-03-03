package l1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* compiled from: BitmapDrawableDecoder.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a<DataType> implements c1.j<DataType, BitmapDrawable> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c1.j<DataType, Bitmap> f8933;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final Resources f8934;

    public a(Resources resources, c1.j<DataType, Bitmap> jVar) {
        this.f8934 = (Resources) y1.k.m12893(resources);
        this.f8933 = (c1.j) y1.k.m12893(jVar);
    }

    @Override // c1.j
    /* renamed from: ʻ */
    public e1.v<BitmapDrawable> mo5835(DataType datatype, int i5, int i6, c1.h hVar) throws IOException {
        return b0.m9587(this.f8934, this.f8933.mo5835(datatype, i5, i6, hVar));
    }

    @Override // c1.j
    /* renamed from: ʼ */
    public boolean mo5836(DataType datatype, c1.h hVar) throws IOException {
        return this.f8933.mo5836(datatype, hVar);
    }
}
