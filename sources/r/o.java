package r;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o {

    /* renamed from: ˈ, reason: contains not printable characters */
    static int f10734;

    /* renamed from: ʼ, reason: contains not printable characters */
    int f10736;

    /* renamed from: ʾ, reason: contains not printable characters */
    int f10738;

    /* renamed from: ʻ, reason: contains not printable characters */
    ArrayList<q.e> f10735 = new ArrayList<>();

    /* renamed from: ʽ, reason: contains not printable characters */
    boolean f10737 = false;

    /* renamed from: ʿ, reason: contains not printable characters */
    ArrayList<a> f10739 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f10740 = -1;

    /* compiled from: WidgetGroup.java */
    class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        WeakReference<q.e> f10741;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f10742;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f10743;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f10744;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f10745;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f10746;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f10747;

        public a(q.e eVar, n.d dVar, int i5) {
            this.f10741 = new WeakReference<>(eVar);
            this.f10742 = dVar.m10370(eVar.f10475);
            this.f10743 = dVar.m10370(eVar.f10479);
            this.f10744 = dVar.m10370(eVar.f10493);
            this.f10745 = dVar.m10370(eVar.f10481);
            this.f10746 = dVar.m10370(eVar.f10491);
            this.f10747 = i5;
        }
    }

    public o(int i5) {
        int i6 = f10734;
        f10734 = i6 + 1;
        this.f10736 = i6;
        this.f10738 = i5;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private String m11610() {
        int i5 = this.f10738;
        return i5 == 0 ? "Horizontal" : i5 == 1 ? "Vertical" : i5 == 2 ? "Both" : "Unknown";
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m11611(n.d dVar, ArrayList<q.e> arrayList, int i5) {
        int m10370;
        int m103702;
        q.f fVar = (q.f) arrayList.get(0).m11294();
        dVar.m10353();
        fVar.mo11185(dVar, false);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            arrayList.get(i6).mo11185(dVar, false);
        }
        if (i5 == 0 && fVar.f10521 > 0) {
            q.b.m11188(fVar, dVar, arrayList, 0);
        }
        if (i5 == 1 && fVar.f10522 > 0) {
            q.b.m11188(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.m10371();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        this.f10739 = new ArrayList<>();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            this.f10739.add(new a(arrayList.get(i7), dVar, i5));
        }
        if (i5 == 0) {
            m10370 = dVar.m10370(fVar.f10475);
            m103702 = dVar.m10370(fVar.f10493);
            dVar.m10353();
        } else {
            m10370 = dVar.m10370(fVar.f10479);
            m103702 = dVar.m10370(fVar.f10481);
            dVar.m10353();
        }
        return m103702 - m10370;
    }

    public String toString() {
        String str = m11610() + " [" + this.f10736 + "] <";
        Iterator<q.e> it = this.f10735.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().m11316();
        }
        return str + " >";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m11612(q.e eVar) {
        if (this.f10735.contains(eVar)) {
            return false;
        }
        this.f10735.add(eVar);
        return true;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m11613(ArrayList<o> arrayList) {
        int size = this.f10735.size();
        if (this.f10740 != -1 && size > 0) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                o oVar = arrayList.get(i5);
                if (this.f10740 == oVar.f10736) {
                    m11617(this.f10738, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m11614() {
        return this.f10736;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m11615() {
        return this.f10738;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m11616(n.d dVar, int i5) {
        if (this.f10735.size() == 0) {
            return 0;
        }
        return m11611(dVar, this.f10735, i5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m11617(int i5, o oVar) {
        Iterator<q.e> it = this.f10735.iterator();
        while (it.hasNext()) {
            q.e next = it.next();
            oVar.m11612(next);
            if (i5 == 0) {
                next.f10456 = oVar.m11614();
            } else {
                next.f10457 = oVar.m11614();
            }
        }
        this.f10740 = oVar.f10736;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m11618(boolean z5) {
        this.f10737 = z5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m11619(int i5) {
        this.f10738 = i5;
    }
}
