package s4;

import java.io.Closeable;
import javax.annotation.Nullable;
import s4.r;

/* compiled from: Response.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a0 implements Closeable {

    /* renamed from: ʾ, reason: contains not printable characters */
    final y f10881;

    /* renamed from: ʿ, reason: contains not printable characters */
    final w f10882;

    /* renamed from: ˆ, reason: contains not printable characters */
    final int f10883;

    /* renamed from: ˈ, reason: contains not printable characters */
    final String f10884;

    /* renamed from: ˉ, reason: contains not printable characters */
    @Nullable
    final q f10885;

    /* renamed from: ˊ, reason: contains not printable characters */
    final r f10886;

    /* renamed from: ˋ, reason: contains not printable characters */
    @Nullable
    final b0 f10887;

    /* renamed from: ˎ, reason: contains not printable characters */
    @Nullable
    final a0 f10888;

    /* renamed from: ˏ, reason: contains not printable characters */
    @Nullable
    final a0 f10889;

    /* renamed from: ˑ, reason: contains not printable characters */
    @Nullable
    final a0 f10890;

    /* renamed from: י, reason: contains not printable characters */
    final long f10891;

    /* renamed from: ـ, reason: contains not printable characters */
    final long f10892;

    /* renamed from: ٴ, reason: contains not printable characters */
    @Nullable
    private volatile c f10893;

    a0(a aVar) {
        this.f10881 = aVar.f10894;
        this.f10882 = aVar.f10895;
        this.f10883 = aVar.f10896;
        this.f10884 = aVar.f10897;
        this.f10885 = aVar.f10898;
        this.f10886 = aVar.f10899.m11887();
        this.f10887 = aVar.f10900;
        this.f10888 = aVar.f10901;
        this.f10889 = aVar.f10902;
        this.f10890 = aVar.f10903;
        this.f10891 = aVar.f10904;
        this.f10892 = aVar.f10905;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f10887;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public String toString() {
        return "Response{protocol=" + this.f10882 + ", code=" + this.f10883 + ", message=" + this.f10884 + ", url=" + this.f10881.m12011() + '}';
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public a m11729() {
        return new a(this);
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public long m11730() {
        return this.f10892;
    }

    @Nullable
    /* renamed from: ʽ, reason: contains not printable characters */
    public b0 m11731() {
        return this.f10887;
    }

    @Nullable
    /* renamed from: ʽʽ, reason: contains not printable characters */
    public a0 m11732() {
        return this.f10890;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public long m11733() {
        return this.f10891;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public y m11734() {
        return this.f10881;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public c m11735() {
        c cVar = this.f10893;
        if (cVar != null) {
            return cVar;
        }
        c m11770 = c.m11770(this.f10886);
        this.f10893 = m11770;
        return m11770;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public r m11736() {
        return this.f10886;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean m11737() {
        int i5 = this.f10883;
        return i5 >= 200 && i5 < 300;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public int m11738() {
        return this.f10883;
    }

    @Nullable
    /* renamed from: ﹶ, reason: contains not printable characters */
    public q m11739() {
        return this.f10885;
    }

    @Nullable
    /* renamed from: ﾞ, reason: contains not printable characters */
    public String m11740(String str) {
        return m11741(str, null);
    }

    @Nullable
    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public String m11741(String str, @Nullable String str2) {
        String m11878 = this.f10886.m11878(str);
        return m11878 != null ? m11878 : str2;
    }

    /* compiled from: Response.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        @Nullable
        y f10894;

        /* renamed from: ʼ, reason: contains not printable characters */
        @Nullable
        w f10895;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f10896;

        /* renamed from: ʾ, reason: contains not printable characters */
        String f10897;

        /* renamed from: ʿ, reason: contains not printable characters */
        @Nullable
        q f10898;

        /* renamed from: ˆ, reason: contains not printable characters */
        r.a f10899;

        /* renamed from: ˈ, reason: contains not printable characters */
        @Nullable
        b0 f10900;

        /* renamed from: ˉ, reason: contains not printable characters */
        @Nullable
        a0 f10901;

        /* renamed from: ˊ, reason: contains not printable characters */
        @Nullable
        a0 f10902;

        /* renamed from: ˋ, reason: contains not printable characters */
        @Nullable
        a0 f10903;

        /* renamed from: ˎ, reason: contains not printable characters */
        long f10904;

        /* renamed from: ˏ, reason: contains not printable characters */
        long f10905;

        public a() {
            this.f10896 = -1;
            this.f10899 = new r.a();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private void m11742(a0 a0Var) {
            if (a0Var.f10887 != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private void m11743(String str, a0 a0Var) {
            if (a0Var.f10887 != null) {
                throw new IllegalArgumentException(str + ".body != null");
            }
            if (a0Var.f10888 != null) {
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            if (a0Var.f10889 != null) {
                throw new IllegalArgumentException(str + ".cacheResponse != null");
            }
            if (a0Var.f10890 == null) {
                return;
            }
            throw new IllegalArgumentException(str + ".priorResponse != null");
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public a m11744(String str, String str2) {
            this.f10899.m11884(str, str2);
            return this;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public a m11745(@Nullable b0 b0Var) {
            this.f10900 = b0Var;
            return this;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public a0 m11746() {
            if (this.f10894 == null) {
                throw new IllegalStateException("request == null");
            }
            if (this.f10895 == null) {
                throw new IllegalStateException("protocol == null");
            }
            if (this.f10896 >= 0) {
                if (this.f10897 != null) {
                    return new a0(this);
                }
                throw new IllegalStateException("message == null");
            }
            throw new IllegalStateException("code < 0: " + this.f10896);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public a m11747(@Nullable a0 a0Var) {
            if (a0Var != null) {
                m11743("cacheResponse", a0Var);
            }
            this.f10902 = a0Var;
            return this;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public a m11748(int i5) {
            this.f10896 = i5;
            return this;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public a m11749(@Nullable q qVar) {
            this.f10898 = qVar;
            return this;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public a m11750(String str, String str2) {
            this.f10899.m11889(str, str2);
            return this;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public a m11751(r rVar) {
            this.f10899 = rVar.m11880();
            return this;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public a m11752(String str) {
            this.f10897 = str;
            return this;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public a m11753(@Nullable a0 a0Var) {
            if (a0Var != null) {
                m11743("networkResponse", a0Var);
            }
            this.f10901 = a0Var;
            return this;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public a m11754(@Nullable a0 a0Var) {
            if (a0Var != null) {
                m11742(a0Var);
            }
            this.f10903 = a0Var;
            return this;
        }

        /* renamed from: י, reason: contains not printable characters */
        public a m11755(w wVar) {
            this.f10895 = wVar;
            return this;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public a m11756(long j5) {
            this.f10905 = j5;
            return this;
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        public a m11757(y yVar) {
            this.f10894 = yVar;
            return this;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        public a m11758(long j5) {
            this.f10904 = j5;
            return this;
        }

        a(a0 a0Var) {
            this.f10896 = -1;
            this.f10894 = a0Var.f10881;
            this.f10895 = a0Var.f10882;
            this.f10896 = a0Var.f10883;
            this.f10897 = a0Var.f10884;
            this.f10898 = a0Var.f10885;
            this.f10899 = a0Var.f10886.m11880();
            this.f10900 = a0Var.f10887;
            this.f10901 = a0Var.f10888;
            this.f10902 = a0Var.f10889;
            this.f10903 = a0Var.f10890;
            this.f10904 = a0Var.f10891;
            this.f10905 = a0Var.f10892;
        }
    }
}
