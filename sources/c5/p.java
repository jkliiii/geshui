package c5;

import javax.annotation.Nullable;

/* compiled from: SegmentPool.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class p {

    /* renamed from: ʻ, reason: contains not printable characters */
    @Nullable
    static o f5050;

    /* renamed from: ʼ, reason: contains not printable characters */
    static long f5051;

    private p() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static void m5972(o oVar) {
        if (oVar.f5048 != null || oVar.f5049 != null) {
            throw new IllegalArgumentException();
        }
        if (oVar.f5046) {
            return;
        }
        synchronized (p.class) {
            long j5 = f5051;
            if (j5 + 8192 > 65536) {
                return;
            }
            f5051 = j5 + 8192;
            oVar.f5048 = f5050;
            oVar.f5045 = 0;
            oVar.f5044 = 0;
            f5050 = oVar;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static o m5973() {
        synchronized (p.class) {
            o oVar = f5050;
            if (oVar == null) {
                return new o();
            }
            f5050 = oVar.f5048;
            oVar.f5048 = null;
            f5051 -= 8192;
            return oVar;
        }
    }
}
