package e1;

import g1.a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e<DataType> implements a.b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final c1.d<DataType> f7370;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final DataType f7371;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final c1.h f7372;

    e(c1.d<DataType> dVar, DataType datatype, c1.h hVar) {
        this.f7370 = dVar;
        this.f7371 = datatype;
        this.f7372 = hVar;
    }

    @Override // g1.a.b
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo8291(File file) {
        return this.f7370.mo5820(this.f7371, file, this.f7372);
    }
}
