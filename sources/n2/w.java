package n2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: Multimap.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class w extends LinkedHashMap<String, List<String>> implements Iterable<x> {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final c f9682 = new a();

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final c f9683 = new b();

    /* compiled from: Multimap.java */
    static class a implements c {
        a() {
        }

        @Override // n2.w.c
        /* renamed from: ʽ, reason: contains not printable characters */
        public String mo10578(String str) {
            return Uri.decode(str);
        }
    }

    /* compiled from: Multimap.java */
    static class b implements c {
        b() {
        }

        @Override // n2.w.c
        /* renamed from: ʽ */
        public String mo10578(String str) {
            return URLDecoder.decode(str);
        }
    }

    /* compiled from: Multimap.java */
    public interface c {
        /* renamed from: ʽ */
        String mo10578(String str);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static w m10571(String str, String str2, String str3, boolean z5, c cVar) {
        w wVar = new w();
        if (str == null) {
            return wVar;
        }
        for (String str4 : str.split(str2)) {
            String[] split = str4.split(str3, 2);
            String trim = split[0].trim();
            if (!TextUtils.isEmpty(trim)) {
                String str5 = split.length > 1 ? split[1] : null;
                if (str5 != null && z5 && str5.endsWith("\"") && str5.startsWith("\"")) {
                    str5 = str5.substring(1, str5.length() - 1);
                }
                if (str5 != null && cVar != null) {
                    trim = cVar.mo10578(trim);
                    str5 = cVar.mo10578(str5);
                }
                wVar.m10574(trim, str5);
            }
        }
        return wVar;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static w m10572(String str, String str2, boolean z5, c cVar) {
        return m10571(str, str2, "=", z5, cVar);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static w m10573(String str) {
        return m10572(str, ";", true, null);
    }

    @Override // java.lang.Iterable
    public Iterator<x> iterator() {
        ArrayList arrayList = new ArrayList();
        for (String str : keySet()) {
            Iterator it = ((List) get(str)).iterator();
            while (it.hasNext()) {
                arrayList.add(new p(str, (String) it.next()));
            }
        }
        return arrayList.iterator();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m10574(String str, String str2) {
        m10575(str).add(str2);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public List<String> m10575(String str) {
        List<String> list = get(str);
        if (list != null) {
            return list;
        }
        List<String> mo10560 = mo10560();
        put(str, mo10560);
        return mo10560;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public String m10576(String str) {
        List<String> list = get(str);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: ʿ */
    protected List<String> mo10560() {
        return new ArrayList();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m10577(String str, String str2) {
        List<String> mo10560 = mo10560();
        mo10560.add(str2);
        put(str, mo10560);
    }
}
