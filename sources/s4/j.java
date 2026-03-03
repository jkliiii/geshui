package s4;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpec.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class j {

    /* renamed from: ʿ, reason: contains not printable characters */
    private static final g[] f11081;

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final g[] f11082;

    /* renamed from: ˈ, reason: contains not printable characters */
    public static final j f11083;

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final j f11084;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final j f11085;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final j f11086;

    /* renamed from: ʻ, reason: contains not printable characters */
    final boolean f11087;

    /* renamed from: ʼ, reason: contains not printable characters */
    final boolean f11088;

    /* renamed from: ʽ, reason: contains not printable characters */
    @Nullable
    final String[] f11089;

    /* renamed from: ʾ, reason: contains not printable characters */
    @Nullable
    final String[] f11090;

    static {
        g gVar = g.f11023;
        g gVar2 = g.f11024;
        g gVar3 = g.f11025;
        g gVar4 = g.f11026;
        g gVar5 = g.f11027;
        g gVar6 = g.f11009;
        g gVar7 = g.f11013;
        g gVar8 = g.f11010;
        g gVar9 = g.f11014;
        g gVar10 = g.f11020;
        g gVar11 = g.f11019;
        g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11};
        f11081 = gVarArr;
        g[] gVarArr2 = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, g.f10992, g.f10993, g.f10962, g.f10963, g.f11029, g.f11035, g.f11042};
        f11082 = gVarArr2;
        a m11820 = new a(true).m11820(gVarArr);
        d0 d0Var = d0.TLS_1_3;
        d0 d0Var2 = d0.TLS_1_2;
        f11083 = m11820.m11823(d0Var, d0Var2).m11821(true).m11818();
        a m118202 = new a(true).m11820(gVarArr2);
        d0 d0Var3 = d0.TLS_1_0;
        f11084 = m118202.m11823(d0Var, d0Var2, d0.TLS_1_1, d0Var3).m11821(true).m11818();
        f11085 = new a(true).m11820(gVarArr2).m11823(d0Var3).m11821(true).m11818();
        f11086 = new a(false).m11818();
    }

    j(a aVar) {
        this.f11087 = aVar.f11091;
        this.f11089 = aVar.f11092;
        this.f11090 = aVar.f11093;
        this.f11088 = aVar.f11094;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private j m11811(SSLSocket sSLSocket, boolean z5) {
        String[] m12082 = this.f11089 != null ? t4.c.m12082(g.f10976, sSLSocket.getEnabledCipherSuites(), this.f11089) : sSLSocket.getEnabledCipherSuites();
        String[] m120822 = this.f11090 != null ? t4.c.m12082(t4.c.f11339, sSLSocket.getEnabledProtocols(), this.f11090) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int m12079 = t4.c.m12079(g.f10976, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z5 && m12079 != -1) {
            m12082 = t4.c.m12062(m12082, supportedCipherSuites[m12079]);
        }
        return new a(this).m11819(m12082).m11822(m120822).m11818();
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        j jVar = (j) obj;
        boolean z5 = this.f11087;
        if (z5 != jVar.f11087) {
            return false;
        }
        return !z5 || (Arrays.equals(this.f11089, jVar.f11089) && Arrays.equals(this.f11090, jVar.f11090) && this.f11088 == jVar.f11088);
    }

    public int hashCode() {
        if (this.f11087) {
            return ((((527 + Arrays.hashCode(this.f11089)) * 31) + Arrays.hashCode(this.f11090)) * 31) + (!this.f11088 ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f11087) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f11089 != null ? m11813().toString() : "[all enabled]") + ", tlsVersions=" + (this.f11090 != null ? m11817().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f11088 + ")";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m11812(SSLSocket sSLSocket, boolean z5) {
        j m11811 = m11811(sSLSocket, z5);
        String[] strArr = m11811.f11090;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = m11811.f11089;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    @Nullable
    /* renamed from: ʼ, reason: contains not printable characters */
    public List<g> m11813() {
        String[] strArr = this.f11089;
        if (strArr != null) {
            return g.m11801(strArr);
        }
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m11814(SSLSocket sSLSocket) {
        if (!this.f11087) {
            return false;
        }
        String[] strArr = this.f11090;
        if (strArr != null && !t4.c.m12073(t4.c.f11339, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f11089;
        return strArr2 == null || t4.c.m12073(g.f10976, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m11815() {
        return this.f11087;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public boolean m11816() {
        return this.f11088;
    }

    @Nullable
    /* renamed from: ˈ, reason: contains not printable characters */
    public List<d0> m11817() {
        String[] strArr = this.f11090;
        if (strArr != null) {
            return d0.m11791(strArr);
        }
        return null;
    }

    /* compiled from: ConnectionSpec.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f11091;

        /* renamed from: ʼ, reason: contains not printable characters */
        @Nullable
        String[] f11092;

        /* renamed from: ʽ, reason: contains not printable characters */
        @Nullable
        String[] f11093;

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f11094;

        a(boolean z5) {
            this.f11091 = z5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public j m11818() {
            return new j(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public a m11819(String... strArr) {
            if (!this.f11091) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f11092 = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public a m11820(g... gVarArr) {
            if (!this.f11091) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[gVarArr.length];
            for (int i5 = 0; i5 < gVarArr.length; i5++) {
                strArr[i5] = gVarArr[i5].f11072;
            }
            return m11819(strArr);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public a m11821(boolean z5) {
            if (!this.f11091) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f11094 = z5;
            return this;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public a m11822(String... strArr) {
            if (!this.f11091) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f11093 = (String[]) strArr.clone();
            return this;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public a m11823(d0... d0VarArr) {
            if (!this.f11091) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[d0VarArr.length];
            for (int i5 = 0; i5 < d0VarArr.length; i5++) {
                strArr[i5] = d0VarArr[i5].f10942;
            }
            return m11822(strArr);
        }

        public a(j jVar) {
            this.f11091 = jVar.f11087;
            this.f11092 = jVar.f11089;
            this.f11093 = jVar.f11090;
            this.f11094 = jVar.f11088;
        }
    }
}
