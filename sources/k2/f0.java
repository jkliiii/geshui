package k2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: Util.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f0 {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean f8759 = false;

    /* compiled from: Util.java */
    static class a implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f8760;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ l2.a f8761;

        a(l2.a aVar) {
            this.f8761 = aVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (this.f8760) {
                return;
            }
            this.f8760 = true;
            this.f8761.mo9412(exc);
        }
    }

    /* compiled from: Util.java */
    static class b implements l2.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        int f8762 = 0;

        /* renamed from: ʼ, reason: contains not printable characters */
        q f8763 = new q();

        /* renamed from: ʽ, reason: contains not printable characters */
        v2.a f8764;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ u f8765;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ InputStream f8766;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ long f8767;

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ l2.a f8768;

        b(u uVar, InputStream inputStream, long j5, l2.a aVar) {
            this.f8765 = uVar;
            this.f8766 = inputStream;
            this.f8767 = j5;
            this.f8768 = aVar;
            this.f8764 = new v2.a().m12315((int) Math.min(1048576L, j5));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        private void m9430() {
            this.f8765.mo9368(null);
            this.f8765.mo9364(null);
            this.f8763.m9507();
            v2.h.m12364(this.f8766);
        }

        @Override // l2.g
        /* renamed from: ʻ */
        public void mo9413() {
            do {
                try {
                    if (!this.f8763.m9499()) {
                        ByteBuffer m12311 = this.f8764.m12311();
                        int read = this.f8766.read(m12311.array(), 0, (int) Math.min(this.f8767 - this.f8762, m12311.capacity()));
                        if (read != -1 && this.f8762 != this.f8767) {
                            this.f8764.m12316(read);
                            this.f8762 += read;
                            m12311.position(0);
                            m12311.limit(read);
                            this.f8763.m9483(m12311);
                        }
                        m9430();
                        this.f8768.mo9412(null);
                        return;
                    }
                    this.f8765.mo9361(this.f8763);
                } catch (Exception e5) {
                    m9430();
                    this.f8768.mo9412(e5);
                    return;
                }
            } while (!this.f8763.m9499());
        }
    }

    /* compiled from: Util.java */
    static class c implements l2.d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ u f8769;

        c(u uVar) {
            this.f8769 = uVar;
        }

        @Override // l2.d
        /* renamed from: ᵢ */
        public void mo9377(s sVar, q qVar) {
            this.f8769.mo9361(qVar);
            if (qVar.m9500() > 0) {
                sVar.mo9359();
            }
        }
    }

    /* compiled from: Util.java */
    static class d implements l2.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ s f8770;

        d(s sVar) {
            this.f8770 = sVar;
        }

        @Override // l2.g
        /* renamed from: ʻ */
        public void mo9413() {
            this.f8770.mo9365();
        }
    }

    /* compiled from: Util.java */
    static class e implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f8771;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ s f8772;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ u f8773;

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ l2.a f8774;

        e(s sVar, u uVar, l2.a aVar) {
            this.f8772 = sVar;
            this.f8773 = uVar;
            this.f8774 = aVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (this.f8771) {
                return;
            }
            this.f8771 = true;
            this.f8772.mo9362(null);
            this.f8772.mo9366(null);
            this.f8773.mo9368(null);
            this.f8773.mo9364(null);
            this.f8774.mo9412(exc);
        }
    }

    /* compiled from: Util.java */
    static class f implements l2.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ l2.a f8775;

        f(l2.a aVar) {
            this.f8775 = aVar;
        }

        @Override // l2.a
        /* renamed from: ʻ */
        public void mo9412(Exception exc) {
            if (exc == null) {
                exc = new IOException("sink was closed before emitter ended");
            }
            this.f8775.mo9412(exc);
        }
    }

    /* compiled from: Util.java */
    static class g implements l2.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ u f8776;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ q f8777;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ l2.a f8778;

        g(u uVar, q qVar, l2.a aVar) {
            this.f8776 = uVar;
            this.f8777 = qVar;
            this.f8778 = aVar;
        }

        @Override // l2.g
        /* renamed from: ʻ */
        public void mo9413() {
            this.f8776.mo9361(this.f8777);
            if (this.f8777.m9500() != 0 || this.f8778 == null) {
                return;
            }
            this.f8776.mo9364(null);
            this.f8778.mo9412(null);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m9422(s sVar, q qVar) {
        int m9500;
        l2.d dVar = null;
        while (!sVar.mo9370() && (dVar = sVar.mo9375()) != null && (m9500 = qVar.m9500()) > 0) {
            dVar.mo9377(sVar, qVar);
            if (m9500 == qVar.m9500() && dVar == sVar.mo9375() && !sVar.mo9370()) {
                System.out.println("handler: " + dVar);
                qVar.m9507();
                if (!f8759) {
                    throw new RuntimeException("mDataHandler failed to consume data, yet remains the mDataHandler.");
                }
                return;
            }
        }
        if (qVar.m9500() == 0 || sVar.mo9370()) {
            return;
        }
        System.out.println("handler: " + dVar);
        System.out.println("emitter: " + sVar);
        qVar.m9507();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m9423(l2.a aVar, Exception exc) {
        if (aVar != null) {
            aVar.mo9412(exc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T extends k2.l, java.lang.Object, k2.l] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [T extends k2.l, java.lang.Object, k2.l] */
    /* renamed from: ʽ, reason: contains not printable characters */
    public static <T extends l> T m9424(l lVar, Class<T> cls) {
        if (cls.isInstance(lVar)) {
            return lVar;
        }
        while (lVar instanceof w2.a) {
            lVar = (T) ((w2.a) lVar).mo9409();
            if (cls.isInstance(lVar)) {
                return lVar;
            }
        }
        return null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m9425(InputStream inputStream, long j5, u uVar, l2.a aVar) {
        a aVar2 = new a(aVar);
        b bVar = new b(uVar, inputStream, j5, aVar2);
        uVar.mo9364(bVar);
        uVar.mo9368(aVar2);
        bVar.mo9413();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m9426(InputStream inputStream, u uVar, l2.a aVar) {
        m9425(inputStream, 2147483647L, uVar, aVar);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static void m9427(s sVar, u uVar, l2.a aVar) {
        sVar.mo9362(new c(uVar));
        uVar.mo9364(new d(sVar));
        e eVar = new e(sVar, uVar, aVar);
        sVar.mo9366(eVar);
        uVar.mo9368(new f(eVar));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m9428(u uVar, q qVar, l2.a aVar) {
        g gVar = new g(uVar, qVar, aVar);
        uVar.mo9364(gVar);
        gVar.mo9413();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static void m9429(u uVar, byte[] bArr, l2.a aVar) {
        ByteBuffer m9480 = q.m9480(bArr.length);
        m9480.put(bArr);
        m9480.flip();
        q qVar = new q();
        qVar.m9483(m9480);
        m9428(uVar, qVar, aVar);
    }
}
