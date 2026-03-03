package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class u {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final ArrayList<e> f3701 = new ArrayList<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    private final HashMap<String, t> f3702 = new HashMap<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    private q f3703;

    u() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m4312(e eVar) {
        if (this.f3701.contains(eVar)) {
            throw new IllegalStateException("Fragment already added: " + eVar);
        }
        synchronized (this.f3701) {
            this.f3701.add(eVar);
        }
        eVar.mAdded = true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m4313() {
        this.f3702.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean m4314(String str) {
        return this.f3702.get(str) != null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    void m4315(int i5) {
        for (t tVar : this.f3702.values()) {
            if (tVar != null) {
                tVar.m4309(i5);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m4316(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f3702.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (t tVar : this.f3702.values()) {
                printWriter.print(str);
                if (tVar != null) {
                    e m4302 = tVar.m4302();
                    printWriter.println(m4302);
                    m4302.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3701.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = this.f3701.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(eVar.toString());
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    e m4317(String str) {
        t tVar = this.f3702.get(str);
        if (tVar != null) {
            return tVar.m4302();
        }
        return null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    e m4318(int i5) {
        for (int size = this.f3701.size() - 1; size >= 0; size--) {
            e eVar = this.f3701.get(size);
            if (eVar != null && eVar.mFragmentId == i5) {
                return eVar;
            }
        }
        for (t tVar : this.f3702.values()) {
            if (tVar != null) {
                e m4302 = tVar.m4302();
                if (m4302.mFragmentId == i5) {
                    return m4302;
                }
            }
        }
        return null;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    e m4319(String str) {
        if (str != null) {
            for (int size = this.f3701.size() - 1; size >= 0; size--) {
                e eVar = this.f3701.get(size);
                if (eVar != null && str.equals(eVar.mTag)) {
                    return eVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (t tVar : this.f3702.values()) {
            if (tVar != null) {
                e m4302 = tVar.m4302();
                if (str.equals(m4302.mTag)) {
                    return m4302;
                }
            }
        }
        return null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    e m4320(String str) {
        e findFragmentByWho;
        for (t tVar : this.f3702.values()) {
            if (tVar != null && (findFragmentByWho = tVar.m4302().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    int m4321(e eVar) {
        View view;
        View view2;
        ViewGroup viewGroup = eVar.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f3701.indexOf(eVar);
        for (int i5 = indexOf - 1; i5 >= 0; i5--) {
            e eVar2 = this.f3701.get(i5);
            if (eVar2.mContainer == viewGroup && (view2 = eVar2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f3701.size()) {
                return -1;
            }
            e eVar3 = this.f3701.get(indexOf);
            if (eVar3.mContainer == viewGroup && (view = eVar3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    List<t> m4322() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f3702.values()) {
            if (tVar != null) {
                arrayList.add(tVar);
            }
        }
        return arrayList;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    List<e> m4323() {
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.f3702.values()) {
            if (tVar != null) {
                arrayList.add(tVar.m4302());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    t m4324(String str) {
        return this.f3702.get(str);
    }

    /* renamed from: י, reason: contains not printable characters */
    List<e> m4325() {
        ArrayList arrayList;
        if (this.f3701.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3701) {
            arrayList = new ArrayList(this.f3701);
        }
        return arrayList;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    q m4326() {
        return this.f3703;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    void m4327(t tVar) {
        e m4302 = tVar.m4302();
        if (m4314(m4302.mWho)) {
            return;
        }
        this.f3702.put(m4302.mWho, tVar);
        if (m4302.mRetainInstanceChangedWhileDetached) {
            if (m4302.mRetainInstance) {
                this.f3703.m4276(m4302);
            } else {
                this.f3703.m4283(m4302);
            }
            m4302.mRetainInstanceChangedWhileDetached = false;
        }
        if (n.m4148(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m4302);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    void m4328(t tVar) {
        e m4302 = tVar.m4302();
        if (m4302.mRetainInstance) {
            this.f3703.m4283(m4302);
        }
        if (this.f3702.put(m4302.mWho, null) != null && n.m4148(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m4302);
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    void m4329() {
        Iterator<e> it = this.f3701.iterator();
        while (it.hasNext()) {
            t tVar = this.f3702.get(it.next().mWho);
            if (tVar != null) {
                tVar.m4303();
            }
        }
        for (t tVar2 : this.f3702.values()) {
            if (tVar2 != null) {
                tVar2.m4303();
                e m4302 = tVar2.m4302();
                if (m4302.mRemoving && !m4302.isInBackStack()) {
                    m4328(tVar2);
                }
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m4330(e eVar) {
        synchronized (this.f3701) {
            this.f3701.remove(eVar);
        }
        eVar.mAdded = false;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    void m4331() {
        this.f3702.clear();
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m4332(List<String> list) {
        this.f3701.clear();
        if (list != null) {
            for (String str : list) {
                e m4317 = m4317(str);
                if (m4317 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m4317);
                }
                m4312(m4317);
            }
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    ArrayList<s> m4333() {
        ArrayList<s> arrayList = new ArrayList<>(this.f3702.size());
        for (t tVar : this.f3702.values()) {
            if (tVar != null) {
                e m4302 = tVar.m4302();
                s m4307 = tVar.m4307();
                arrayList.add(m4307);
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "Saved state of " + m4302 + ": " + m4307.f3692);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    ArrayList<String> m4334() {
        synchronized (this.f3701) {
            if (this.f3701.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f3701.size());
            Iterator<e> it = this.f3701.iterator();
            while (it.hasNext()) {
                e next = it.next();
                arrayList.add(next.mWho);
                if (n.m4148(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    void m4335(q qVar) {
        this.f3703 = qVar;
    }
}
