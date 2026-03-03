package w3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: Maps.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
final class y implements Map, Serializable {

    /* renamed from: ʾ, reason: contains not printable characters */
    public static final y f12054 = new y();

    private y() {
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m12576((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m12578();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m12579();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m12580();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m12581();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m12576(Void r22) {
        f4.k.m8623(r22, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public Set<Map.Entry> m12578() {
        return z.f12055;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public Set<Object> m12579() {
        return z.f12055;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public int m12580() {
        return 0;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public Collection m12581() {
        return x.f12053;
    }

    @Override // java.util.Map
    /* renamed from: ˈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
