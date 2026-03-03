package n2;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: Headers.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class s {

    /* renamed from: ʻ, reason: contains not printable characters */
    final w f9669 = new a();

    /* compiled from: Headers.java */
    class a extends w {
        a() {
        }

        @Override // n2.w
        /* renamed from: ʿ, reason: contains not printable characters */
        protected List<String> mo10560() {
            return new v2.i();
        }
    }

    public s() {
    }

    public String toString() {
        return m10559().toString();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public s m10551(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.US);
        this.f9669.m10574(lowerCase, str2);
        ((v2.i) this.f9669.get(lowerCase)).m12368(str);
        return this;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public s m10552(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m10551(str, it.next());
        }
        return this;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public s m10553(String str) {
        if (str != null) {
            String[] split = str.trim().split(":", 2);
            if (split.length == 2) {
                m10551(split[0].trim(), split[1].trim());
            } else {
                m10551(split[0].trim(), BuildConfig.FLAVOR);
            }
        }
        return this;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public String m10554(String str) {
        return this.f9669.m10576(str.toLowerCase(Locale.US));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public w m10555() {
        return this.f9669;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public List<String> m10556(String str) {
        return this.f9669.remove(str.toLowerCase(Locale.US));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public s m10557(String str, String str2) {
        if (str2 != null && (str2.contains("\n") || str2.contains("\r"))) {
            throw new IllegalArgumentException("value must not contain a new line or line feed");
        }
        String lowerCase = str.toLowerCase(Locale.US);
        this.f9669.m10577(lowerCase, str2);
        ((v2.i) this.f9669.get(lowerCase)).m12368(str);
        return this;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public String m10558(String str) {
        return m10559().insert(0, str + "\r\n").toString();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public StringBuilder m10559() {
        StringBuilder sb = new StringBuilder(256);
        Iterator<String> it = this.f9669.keySet().iterator();
        while (it.hasNext()) {
            v2.i iVar = (v2.i) this.f9669.get(it.next());
            Iterator<T> it2 = iVar.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                sb.append((String) iVar.m12366());
                sb.append(": ");
                sb.append(str);
                sb.append("\r\n");
            }
        }
        sb.append("\r\n");
        return sb;
    }

    public s(Map<String, List<String>> map) {
        for (String str : map.keySet()) {
            m10552(str, map.get(str));
        }
    }
}
