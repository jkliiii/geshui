package v2;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

/* compiled from: HashList.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f<T> {

    /* renamed from: ʻ, reason: contains not printable characters */
    Hashtable<String, i<T>> f11716 = new Hashtable<>();

    /* renamed from: ʻ, reason: contains not printable characters */
    public synchronized void m12349(String str, T t5) {
        ArrayList<T> m12350 = m12350(str);
        if (m12350 == null) {
            m12350 = new i<>();
            this.f11716.put(str, m12350);
        }
        m12350.add(t5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized ArrayList<T> m12350(String str) {
        return this.f11716.get(str);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public Set<String> m12351() {
        return this.f11716.keySet();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public synchronized ArrayList<T> m12352(String str) {
        return this.f11716.remove(str);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public synchronized boolean m12353(String str, T t5) {
        i<T> iVar = this.f11716.get(str);
        if (iVar == null) {
            return false;
        }
        iVar.remove(t5);
        return iVar.size() == 0;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public synchronized <V> V m12354(String str) {
        i<T> iVar = this.f11716.get(str);
        if (iVar == null) {
            return null;
        }
        return (V) iVar.m12366();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public synchronized <V> void m12355(String str, V v5) {
        i<T> iVar = this.f11716.get(str);
        if (iVar == null) {
            iVar = new i<>();
            this.f11716.put(str, iVar);
        }
        iVar.m12367(v5);
    }
}
