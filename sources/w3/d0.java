package w3;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapsJVM.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
class d0 extends c0 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m12513(int i5) {
        if (i5 < 0) {
            return i5;
        }
        if (i5 < 3) {
            return i5 + 1;
        }
        if (i5 < 1073741824) {
            return (int) ((i5 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m12514(v3.i<? extends K, ? extends V> iVar) {
        f4.k.m8623(iVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(iVar.m12378(), iVar.m12379());
        f4.k.m8622(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m12515(Map<? extends K, ? extends V> map) {
        f4.k.m8623(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        f4.k.m8622(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
