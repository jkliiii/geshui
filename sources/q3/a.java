package q3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o3.b;
import o3.e;
import o3.f;

/* compiled from: Hosts.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Map<String, LinkedList<C0151a>> f10623 = new ConcurrentHashMap();

    /* compiled from: Hosts.java */
    /* renamed from: q3.a$a, reason: collision with other inner class name */
    public static class C0151a {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final f f10624;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final int f10625;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0151a)) {
                return false;
            }
            C0151a c0151a = (C0151a) obj;
            f fVar = this.f10624;
            f fVar2 = c0151a.f10624;
            if (fVar == fVar2) {
                return true;
            }
            return fVar != null && fVar2 != null && fVar.f10118.equals(fVar2.f10118) && this.f10625 == c0151a.f10625;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private LinkedList<C0151a> m11474(LinkedList<C0151a> linkedList, e eVar) {
        if (linkedList == null) {
            return null;
        }
        LinkedList<C0151a> linkedList2 = new LinkedList<>();
        LinkedList<C0151a> linkedList3 = new LinkedList<>();
        Iterator<C0151a> it = linkedList.iterator();
        while (it.hasNext()) {
            C0151a next = it.next();
            int i5 = next.f10625;
            if (i5 == 0) {
                linkedList2.add(next);
            } else if (i5 == eVar.f10112) {
                linkedList3.add(next);
            }
        }
        return linkedList3.size() != 0 ? linkedList3 : linkedList2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private f[] m11475(LinkedList<C0151a> linkedList) {
        f fVar;
        if (linkedList == null) {
            return null;
        }
        int size = linkedList.size();
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < size; i5++) {
            C0151a c0151a = linkedList.get(i5);
            if (c0151a != null && (fVar = c0151a.f10624) != null && fVar.f10118 != null) {
                arrayList.add(fVar);
            }
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public synchronized f[] m11476(b bVar, e eVar) {
        LinkedList<C0151a> linkedList = this.f10623.get(bVar.f10105);
        if (linkedList != null && !linkedList.isEmpty()) {
            if (linkedList.size() > 1) {
                C0151a c0151a = linkedList.get(0);
                linkedList.remove(0);
                linkedList.add(c0151a);
            }
            return m11475(m11474(linkedList, eVar));
        }
        return null;
    }
}
