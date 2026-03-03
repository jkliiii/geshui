package p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: RawHeaders.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class c {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final Comparator<String> f10216 = new a();

    /* renamed from: ʼ, reason: contains not printable characters */
    private String f10218;

    /* renamed from: ʿ, reason: contains not printable characters */
    private String f10221;

    /* renamed from: ʻ, reason: contains not printable characters */
    private final List<String> f10217 = new ArrayList(20);

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f10219 = 1;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f10220 = -1;

    /* compiled from: RawHeaders.java */
    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            if (str == str2) {
                return 0;
            }
            if (str == null) {
                return -1;
            }
            if (str2 == null) {
                return 1;
            }
            return String.CASE_INSENSITIVE_ORDER.compare(str, str2);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static c m11071(Map<String, List<String>> map) {
        c cVar = new c();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (key != null) {
                cVar.m11073(key, value);
            } else if (!value.isEmpty()) {
                cVar.m11085(value.get(value.size() - 1));
            }
        }
        return cVar;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m11072(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("fieldName == null");
        }
        if (str2 != null) {
            this.f10217.add(str);
            this.f10217.add(str2.trim());
            return;
        }
        System.err.println("Ignoring HTTP header field '" + str + "' because its value is null");
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m11073(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m11072(str, it.next());
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m11074(String str) {
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            m11072(BuildConfig.FLAVOR, str);
        } else {
            m11072(str.substring(0, indexOf), str.substring(indexOf + 1));
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public String m11075(String str) {
        for (int size = this.f10217.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase(this.f10217.get(size))) {
                return this.f10217.get(size + 1);
            }
        }
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public c m11076(Set<String> set) {
        c cVar = new c();
        for (int i5 = 0; i5 < this.f10217.size(); i5 += 2) {
            String str = this.f10217.get(i5);
            if (set.contains(str)) {
                cVar.m11072(str, this.f10217.get(i5 + 1));
            }
        }
        return cVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public String m11077(int i5) {
        int i6 = i5 * 2;
        if (i6 < 0 || i6 >= this.f10217.size()) {
            return null;
        }
        return this.f10217.get(i6);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public int m11078() {
        return this.f10220;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public String m11079() {
        return this.f10221;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public String m11080() {
        return this.f10218;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public String m11081(int i5) {
        int i6 = (i5 * 2) + 1;
        if (i6 < 0 || i6 >= this.f10217.size()) {
            return null;
        }
        return this.f10217.get(i6);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m11082() {
        return this.f10217.size() / 2;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public void m11083(String str) {
        for (int i5 = 0; i5 < this.f10217.size(); i5 += 2) {
            if (str.equalsIgnoreCase(this.f10217.get(i5))) {
                this.f10217.remove(i5);
                this.f10217.remove(i5);
            }
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    public void m11084(String str, String str2) {
        m11083(str);
        m11072(str, str2);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m11085(String str) {
        String trim = str.trim();
        this.f10218 = trim;
        if (trim == null || !trim.startsWith("HTTP/")) {
            return;
        }
        String trim2 = trim.trim();
        int indexOf = trim2.indexOf(" ") + 1;
        if (indexOf == 0) {
            return;
        }
        if (trim2.charAt(indexOf - 2) != '1') {
            this.f10219 = 0;
        }
        int i5 = indexOf + 3;
        if (i5 > trim2.length()) {
            i5 = trim2.length();
        }
        this.f10220 = Integer.parseInt(trim2.substring(indexOf, i5));
        int i6 = i5 + 1;
        if (i6 <= trim2.length()) {
            this.f10221 = trim2.substring(i6);
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public String m11086() {
        StringBuilder sb = new StringBuilder(256);
        sb.append(this.f10218);
        sb.append("\r\n");
        for (int i5 = 0; i5 < this.f10217.size(); i5 += 2) {
            sb.append(this.f10217.get(i5));
            sb.append(": ");
            sb.append(this.f10217.get(i5 + 1));
            sb.append("\r\n");
        }
        sb.append("\r\n");
        return sb.toString();
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public Map<String, List<String>> m11087() {
        TreeMap treeMap = new TreeMap(f10216);
        for (int i5 = 0; i5 < this.f10217.size(); i5 += 2) {
            String str = this.f10217.get(i5);
            String str2 = this.f10217.get(i5 + 1);
            ArrayList arrayList = new ArrayList();
            List list = (List) treeMap.get(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            arrayList.add(str2);
            treeMap.put(str, Collections.unmodifiableList(arrayList));
        }
        String str3 = this.f10218;
        if (str3 != null) {
            treeMap.put(null, Collections.unmodifiableList(Collections.singletonList(str3)));
        }
        return Collections.unmodifiableMap(treeMap);
    }
}
