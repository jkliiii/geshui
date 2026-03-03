package q;

import java.util.ArrayList;

/* compiled from: WidgetContainer.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class m extends e {

    /* renamed from: ʼᐧ, reason: contains not printable characters */
    public ArrayList<e> f10609 = new ArrayList<>();

    @Override // q.e
    /* renamed from: ʻﹳ */
    public void mo11240() {
        this.f10609.clear();
        super.mo11240();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m11455(e eVar) {
        this.f10609.add(eVar);
        if (eVar.m11294() != null) {
            ((m) eVar.m11294()).m11457(eVar);
        }
        eVar.m11274(this);
    }

    @Override // q.e
    /* renamed from: ʼʻ */
    public void mo11243(n.c cVar) {
        super.mo11243(cVar);
        int size = this.f10609.size();
        for (int i5 = 0; i5 < size; i5++) {
            this.f10609.get(i5).mo11243(cVar);
        }
    }

    /* renamed from: ʽﾞ, reason: contains not printable characters */
    public ArrayList<e> m11456() {
        return this.f10609;
    }

    /* renamed from: ʾʻ */
    public void mo11333() {
        ArrayList<e> arrayList = this.f10609;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = this.f10609.get(i5);
            if (eVar instanceof m) {
                ((m) eVar).mo11333();
            }
        }
    }

    /* renamed from: ʾʼ, reason: contains not printable characters */
    public void m11457(e eVar) {
        this.f10609.remove(eVar);
        eVar.mo11240();
    }

    /* renamed from: ʾʽ, reason: contains not printable characters */
    public void m11458() {
        this.f10609.clear();
    }
}
