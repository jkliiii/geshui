package r2;

import java.nio.ByteBuffer;
import k2.q;
import k2.u;
import k2.y;

/* compiled from: ChunkedOutputFilter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class c extends y {
    public c(u uVar) {
        super(uVar);
    }

    @Override // k2.p, k2.u
    public void end() {
        m9476(Integer.MAX_VALUE);
        mo9361(new q());
        m9476(0);
    }

    @Override // k2.y
    /* renamed from: ˏ */
    public q mo9516(q qVar) {
        qVar.m9486(ByteBuffer.wrap((Integer.toString(qVar.m9500(), 16) + "\r\n").getBytes()));
        qVar.m9483(ByteBuffer.wrap("\r\n".getBytes()));
        return qVar;
    }
}
