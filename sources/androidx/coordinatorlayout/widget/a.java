package androidx.coordinatorlayout.widget;

import androidx.core.util.e;
import androidx.core.util.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import m.g;

/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a<T> {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final e<ArrayList<T>> f2524 = new f(10);

    /* renamed from: ʼ, reason: contains not printable characters */
    private final g<T, ArrayList<T>> f2525 = new g<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private final ArrayList<T> f2526 = new ArrayList<>();

    /* renamed from: ʾ, reason: contains not printable characters */
    private final HashSet<T> f2527 = new HashSet<>();

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m1912(T t5, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t5)) {
            return;
        }
        if (hashSet.contains(t5)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t5);
        ArrayList<T> arrayList2 = this.f2525.get(t5);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i5 = 0; i5 < size; i5++) {
                m1912(arrayList2.get(i5), arrayList, hashSet);
            }
        }
        hashSet.remove(t5);
        arrayList.add(t5);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private ArrayList<T> m1913() {
        ArrayList<T> mo2575 = this.f2524.mo2575();
        return mo2575 == null ? new ArrayList<>() : mo2575;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m1914(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2524.mo2574(arrayList);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m1915(T t5, T t6) {
        if (!this.f2525.containsKey(t5) || !this.f2525.containsKey(t6)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f2525.get(t5);
        if (arrayList == null) {
            arrayList = m1913();
            this.f2525.put(t5, arrayList);
        }
        arrayList.add(t6);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1916(T t5) {
        if (this.f2525.containsKey(t5)) {
            return;
        }
        this.f2525.put(t5, null);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m1917() {
        int size = this.f2525.size();
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList<T> m9834 = this.f2525.m9834(i5);
            if (m9834 != null) {
                m1914(m9834);
            }
        }
        this.f2525.clear();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m1918(T t5) {
        return this.f2525.containsKey(t5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public List m1919(T t5) {
        return this.f2525.get(t5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public List<T> m1920(T t5) {
        int size = this.f2525.size();
        ArrayList arrayList = null;
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList<T> m9834 = this.f2525.m9834(i5);
            if (m9834 != null && m9834.contains(t5)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2525.m9830(i5));
            }
        }
        return arrayList;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public ArrayList<T> m1921() {
        this.f2526.clear();
        this.f2527.clear();
        int size = this.f2525.size();
        for (int i5 = 0; i5 < size; i5++) {
            m1912(this.f2525.m9830(i5), this.f2526, this.f2527);
        }
        return this.f2526;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m1922(T t5) {
        int size = this.f2525.size();
        for (int i5 = 0; i5 < size; i5++) {
            ArrayList<T> m9834 = this.f2525.m9834(i5);
            if (m9834 != null && m9834.contains(t5)) {
                return true;
            }
        }
        return false;
    }
}
