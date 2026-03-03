package w3;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e0 extends d0 {
    /* renamed from: ʾ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m12525() {
        y yVar = y.f12054;
        f4.k.m8621(yVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʿ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m12526(Map<K, ? extends V> map) {
        f4.k.m8623(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : d0.m12515(map) : m12525();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static final <K, V> void m12527(Map<? super K, ? super V> map, Iterable<? extends v3.i<? extends K, ? extends V>> iterable) {
        f4.k.m8623(map, "<this>");
        f4.k.m8623(iterable, "pairs");
        for (v3.i<? extends K, ? extends V> iVar : iterable) {
            map.put(iVar.m12376(), iVar.m12377());
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m12528(Iterable<? extends v3.i<? extends K, ? extends V>> iterable) {
        f4.k.m8623(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m12526(m12529(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m12525();
        }
        if (size != 1) {
            return m12529(iterable, new LinkedHashMap(d0.m12513(collection.size())));
        }
        return d0.m12514(iterable instanceof List ? (v3.i<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m12529(Iterable<? extends v3.i<? extends K, ? extends V>> iterable, M m5) {
        f4.k.m8623(iterable, "<this>");
        f4.k.m8623(m5, "destination");
        m12527(m5, iterable);
        return m5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static <K, V> Map<K, V> m12530(Map<? extends K, ? extends V> map) {
        f4.k.m8623(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m12531(map) : d0.m12515(map) : m12525();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m12531(Map<? extends K, ? extends V> map) {
        f4.k.m8623(map, "<this>");
        return new LinkedHashMap(map);
    }
}
