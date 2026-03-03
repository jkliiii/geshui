package i1;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class k implements i {

    /* renamed from: ʽ, reason: contains not printable characters */
    private final Map<String, List<j>> f8492;

    /* renamed from: ʾ, reason: contains not printable characters */
    private volatile Map<String, String> f8493;

    /* compiled from: LazyHeaders.java */
    public static final class a {

        /* renamed from: ʾ, reason: contains not printable characters */
        private static final String f8494;

        /* renamed from: ʿ, reason: contains not printable characters */
        private static final Map<String, List<j>> f8495;

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f8496 = true;

        /* renamed from: ʼ, reason: contains not printable characters */
        private Map<String, List<j>> f8497 = f8495;

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean f8498 = true;

        static {
            String m9166 = m9166();
            f8494 = m9166;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(m9166)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(m9166)));
            }
            f8495 = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static String m9166() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = property.charAt(i5);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public k m9167() {
            this.f8496 = true;
            return new k(this.f8497);
        }
    }

    /* compiled from: LazyHeaders.java */
    static final class b implements j {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final String f8499;

        b(String str) {
            this.f8499 = str;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f8499.equals(((b) obj).f8499);
            }
            return false;
        }

        public int hashCode() {
            return this.f8499.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f8499 + "'}";
        }

        @Override // i1.j
        /* renamed from: ʻ */
        public String mo9163() {
            return this.f8499;
        }
    }

    k(Map<String, List<j>> map) {
        this.f8492 = Collections.unmodifiableMap(map);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private String m9164(List<j> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            String mo9163 = list.get(i5).mo9163();
            if (!TextUtils.isEmpty(mo9163)) {
                sb.append(mo9163);
                if (i5 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private Map<String, String> m9165() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<j>> entry : this.f8492.entrySet()) {
            String m9164 = m9164(entry.getValue());
            if (!TextUtils.isEmpty(m9164)) {
                hashMap.put(entry.getKey(), m9164);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f8492.equals(((k) obj).f8492);
        }
        return false;
    }

    public int hashCode() {
        return this.f8492.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f8492 + '}';
    }

    @Override // i1.i
    /* renamed from: ʻ */
    public Map<String, String> mo9162() {
        if (this.f8493 == null) {
            synchronized (this) {
                if (this.f8493 == null) {
                    this.f8493 = Collections.unmodifiableMap(m9165());
                }
            }
        }
        return this.f8493;
    }
}
