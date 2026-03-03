package o2;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import k2.f0;
import k2.u;
import n2.x;

/* compiled from: StreamPart.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class e extends d {
    public e(String str, long j5, List<x> list) {
        super(str, j5, list);
    }

    @Override // o2.d
    /* renamed from: ʿ */
    public void mo10987(u uVar, l2.a aVar) {
        try {
            f0.m9426(mo10976(), uVar, aVar);
        } catch (Exception e5) {
            aVar.mo9412(e5);
        }
    }

    /* renamed from: ˆ */
    protected abstract InputStream mo10976() throws IOException;
}
