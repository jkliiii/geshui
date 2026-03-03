package g1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import y1.k;
import y1.l;
import z1.a;

/* compiled from: SafeKeyGenerator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final y1.h<c1.f, String> f7870 = new y1.h<>(1000);

    /* renamed from: ʼ, reason: contains not printable characters */
    private final androidx.core.util.e<b> f7871 = z1.a.m13137(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    class a implements a.d<b> {
        a() {
        }

        @Override // z1.a.d
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public b mo8383() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e5) {
                throw new RuntimeException(e5);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    private static final class b implements a.f {

        /* renamed from: ʾ, reason: contains not printable characters */
        final MessageDigest f7873;

        /* renamed from: ʿ, reason: contains not printable characters */
        private final z1.c f7874 = z1.c.m13149();

        b(MessageDigest messageDigest) {
            this.f7873 = messageDigest;
        }

        @Override // z1.a.f
        /* renamed from: ˆ */
        public z1.c mo8343() {
            return this.f7874;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private String m8687(c1.f fVar) {
        b bVar = (b) k.m12893(this.f7871.mo2575());
        try {
            fVar.mo5821(bVar.f7873);
            return l.m12917(bVar.f7873.digest());
        } finally {
            this.f7871.mo2574(bVar);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public String m8688(c1.f fVar) {
        String m12882;
        synchronized (this.f7870) {
            m12882 = this.f7870.m12882(fVar);
        }
        if (m12882 == null) {
            m12882 = m8687(fVar);
        }
        synchronized (this.f7870) {
            this.f7870.m12884(fVar, m12882);
        }
        return m12882;
    }
}
