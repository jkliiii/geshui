package g1;

import g1.a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class d implements a.InterfaceC0107a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final long f7846;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final a f7847;

    /* compiled from: DiskLruCacheFactory.java */
    public interface a {
        /* renamed from: ʻ, reason: contains not printable characters */
        File mo8666();
    }

    public d(a aVar, long j5) {
        this.f7846 = j5;
        this.f7847 = aVar;
    }

    @Override // g1.a.InterfaceC0107a
    public g1.a build() {
        File mo8666 = this.f7847.mo8666();
        if (mo8666 == null) {
            return null;
        }
        if (mo8666.isDirectory() || mo8666.mkdirs()) {
            return e.m8667(mo8666, this.f7846);
        }
        return null;
    }
}
