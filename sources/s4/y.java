package s4;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import s4.r;

/* compiled from: Request.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class y {

    /* renamed from: ʻ, reason: contains not printable characters */
    final s f11227;

    /* renamed from: ʼ, reason: contains not printable characters */
    final String f11228;

    /* renamed from: ʽ, reason: contains not printable characters */
    final r f11229;

    /* renamed from: ʾ, reason: contains not printable characters */
    @Nullable
    final z f11230;

    /* renamed from: ʿ, reason: contains not printable characters */
    final Map<Class<?>, Object> f11231;

    /* renamed from: ˆ, reason: contains not printable characters */
    @Nullable
    private volatile c f11232;

    y(a aVar) {
        this.f11227 = aVar.f11233;
        this.f11228 = aVar.f11234;
        this.f11229 = aVar.f11235.m11887();
        this.f11230 = aVar.f11236;
        this.f11231 = t4.c.m12078(aVar.f11237);
    }

    public String toString() {
        return "Request{method=" + this.f11228 + ", url=" + this.f11227 + ", tags=" + this.f11231 + '}';
    }

    @Nullable
    /* renamed from: ʻ, reason: contains not printable characters */
    public z m12004() {
        return this.f11230;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public c m12005() {
        c cVar = this.f11232;
        if (cVar != null) {
            return cVar;
        }
        c m11770 = c.m11770(this.f11229);
        this.f11232 = m11770;
        return m11770;
    }

    @Nullable
    /* renamed from: ʽ, reason: contains not printable characters */
    public String m12006(String str) {
        return this.f11229.m11878(str);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public r m12007() {
        return this.f11229;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public boolean m12008() {
        return this.f11227.m11913();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public String m12009() {
        return this.f11228;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public a m12010() {
        return new a(this);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public s m12011() {
        return this.f11227;
    }

    /* compiled from: Request.java */
    public static class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        @Nullable
        s f11233;

        /* renamed from: ʼ, reason: contains not printable characters */
        String f11234;

        /* renamed from: ʽ, reason: contains not printable characters */
        r.a f11235;

        /* renamed from: ʾ, reason: contains not printable characters */
        @Nullable
        z f11236;

        /* renamed from: ʿ, reason: contains not printable characters */
        Map<Class<?>, Object> f11237;

        public a() {
            this.f11237 = Collections.emptyMap();
            this.f11234 = "GET";
            this.f11235 = new r.a();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public y m12012() {
            if (this.f11233 != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public a m12013() {
            return m12016("GET", null);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public a m12014(String str, String str2) {
            this.f11235.m11889(str, str2);
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public a m12015(r rVar) {
            this.f11235 = rVar.m11880();
            return this;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public a m12016(String str, @Nullable z zVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            }
            if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            }
            if (zVar != null && !w4.f.m12603(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            }
            if (zVar != null || !w4.f.m12606(str)) {
                this.f11234 = str;
                this.f11236 = zVar;
                return this;
            }
            throw new IllegalArgumentException("method " + str + " must have a request body.");
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public a m12017(z zVar) {
            return m12016("POST", zVar);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public a m12018(String str) {
            this.f11235.m11888(str);
            return this;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public a m12019(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return m12020(s.m11895(str));
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public a m12020(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f11233 = sVar;
            return this;
        }

        a(y yVar) {
            Map<Class<?>, Object> linkedHashMap;
            this.f11237 = Collections.emptyMap();
            this.f11233 = yVar.f11227;
            this.f11234 = yVar.f11228;
            this.f11236 = yVar.f11230;
            if (yVar.f11231.isEmpty()) {
                linkedHashMap = Collections.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap<>(yVar.f11231);
            }
            this.f11237 = linkedHashMap;
            this.f11235 = yVar.f11229.m11880();
        }
    }
}
