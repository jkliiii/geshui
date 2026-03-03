package s4;

import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: CacheControl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: י, reason: contains not printable characters */
    public static final c f10910 = new a().m11782().m11780();

    /* renamed from: ـ, reason: contains not printable characters */
    public static final c f10911 = new a().m11783().m11781(Integer.MAX_VALUE, TimeUnit.SECONDS).m11780();

    /* renamed from: ʻ, reason: contains not printable characters */
    private final boolean f10912;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final boolean f10913;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f10914;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f10915;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f10916;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final boolean f10917;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final boolean f10918;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f10919;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f10920;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final boolean f10921;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final boolean f10922;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final boolean f10923;

    /* renamed from: ˑ, reason: contains not printable characters */
    @Nullable
    String f10924;

    /* compiled from: CacheControl.java */
    public static final class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        boolean f10925;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f10926;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f10927 = -1;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f10928 = -1;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f10929 = -1;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f10930;

        /* renamed from: ˈ, reason: contains not printable characters */
        boolean f10931;

        /* renamed from: ˉ, reason: contains not printable characters */
        boolean f10932;

        /* renamed from: ʻ, reason: contains not printable characters */
        public c m11780() {
            return new c(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public a m11781(int i5, TimeUnit timeUnit) {
            if (i5 >= 0) {
                long seconds = timeUnit.toSeconds(i5);
                this.f10928 = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i5);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public a m11782() {
            this.f10925 = true;
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public a m11783() {
            this.f10930 = true;
            return this;
        }
    }

    private c(boolean z5, boolean z6, int i5, int i6, boolean z7, boolean z8, boolean z9, int i7, int i8, boolean z10, boolean z11, boolean z12, @Nullable String str) {
        this.f10912 = z5;
        this.f10913 = z6;
        this.f10914 = i5;
        this.f10915 = i6;
        this.f10916 = z7;
        this.f10917 = z8;
        this.f10918 = z9;
        this.f10919 = i7;
        this.f10920 = i8;
        this.f10921 = z10;
        this.f10922 = z11;
        this.f10923 = z12;
        this.f10924 = str;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private String m11769() {
        StringBuilder sb = new StringBuilder();
        if (this.f10912) {
            sb.append("no-cache, ");
        }
        if (this.f10913) {
            sb.append("no-store, ");
        }
        if (this.f10914 != -1) {
            sb.append("max-age=");
            sb.append(this.f10914);
            sb.append(", ");
        }
        if (this.f10915 != -1) {
            sb.append("s-maxage=");
            sb.append(this.f10915);
            sb.append(", ");
        }
        if (this.f10916) {
            sb.append("private, ");
        }
        if (this.f10917) {
            sb.append("public, ");
        }
        if (this.f10918) {
            sb.append("must-revalidate, ");
        }
        if (this.f10919 != -1) {
            sb.append("max-stale=");
            sb.append(this.f10919);
            sb.append(", ");
        }
        if (this.f10920 != -1) {
            sb.append("min-fresh=");
            sb.append(this.f10920);
            sb.append(", ");
        }
        if (this.f10921) {
            sb.append("only-if-cached, ");
        }
        if (this.f10922) {
            sb.append("no-transform, ");
        }
        if (this.f10923) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s4.c m11770(s4.r r22) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.c.m11770(s4.r):s4.c");
    }

    public String toString() {
        String str = this.f10924;
        if (str != null) {
            return str;
        }
        String m11769 = m11769();
        this.f10924 = m11769;
        return m11769;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean m11771() {
        return this.f10916;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m11772() {
        return this.f10917;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m11773() {
        return this.f10914;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m11774() {
        return this.f10919;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m11775() {
        return this.f10920;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public boolean m11776() {
        return this.f10918;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m11777() {
        return this.f10912;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m11778() {
        return this.f10913;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m11779() {
        return this.f10921;
    }

    c(a aVar) {
        this.f10912 = aVar.f10925;
        this.f10913 = aVar.f10926;
        this.f10914 = aVar.f10927;
        this.f10915 = -1;
        this.f10916 = false;
        this.f10917 = false;
        this.f10918 = false;
        this.f10919 = aVar.f10928;
        this.f10920 = aVar.f10929;
        this.f10921 = aVar.f10930;
        this.f10922 = aVar.f10931;
        this.f10923 = aVar.f10932;
    }
}
