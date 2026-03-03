package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class b implements m {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected Context f811;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected Context f812;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected g f813;

    /* renamed from: ˈ, reason: contains not printable characters */
    protected LayoutInflater f814;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected LayoutInflater f815;

    /* renamed from: ˊ, reason: contains not printable characters */
    private m.a f816;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f817;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f818;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected n f819;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f820;

    public b(Context context, int i5, int i6) {
        this.f811 = context;
        this.f814 = LayoutInflater.from(context);
        this.f817 = i5;
        this.f818 = i6;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean collapseItemActionView(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean expandItemActionView(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f820;
    }

    @Override // androidx.appcompat.view.menu.m
    public void initForMenu(Context context, g gVar) {
        this.f812 = context;
        this.f815 = LayoutInflater.from(context);
        this.f813 = gVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void onCloseMenu(g gVar, boolean z5) {
        m.a aVar = this.f816;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.m
    public boolean onSubMenuSelected(r rVar) {
        m.a aVar = this.f816;
        r rVar2 = rVar;
        if (aVar == null) {
            return false;
        }
        if (rVar == null) {
            rVar2 = this.f813;
        }
        return aVar.mo527(rVar2);
    }

    @Override // androidx.appcompat.view.menu.m
    public void setCallback(m.a aVar) {
        this.f816 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        ViewGroup viewGroup = (ViewGroup) this.f819;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.f813;
        int i5 = 0;
        if (gVar != null) {
            gVar.flagActionItems();
            ArrayList<i> visibleItems = this.f813.getVisibleItems();
            int size = visibleItems.size();
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                i iVar = visibleItems.get(i7);
                if (mo906(i6, iVar)) {
                    View childAt = viewGroup.getChildAt(i6);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View mo903 = mo903(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        mo903.setPressed(false);
                        mo903.jumpDrawablesToCurrentState();
                    }
                    if (mo903 != childAt) {
                        m898(mo903, i6);
                    }
                    i6++;
                }
            }
            i5 = i6;
        }
        while (i5 < viewGroup.getChildCount()) {
            if (!mo901(viewGroup, i5)) {
                i5++;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected void m898(View view, int i5) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f819).addView(view, i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public abstract void mo899(i iVar, n.a aVar);

    /* renamed from: ʽ, reason: contains not printable characters */
    public n.a m900(ViewGroup viewGroup) {
        return (n.a) this.f814.inflate(this.f818, viewGroup, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected boolean mo901(ViewGroup viewGroup, int i5) {
        viewGroup.removeViewAt(i5);
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public m.a m902() {
        return this.f816;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ˆ, reason: contains not printable characters */
    public View mo903(i iVar, View view, ViewGroup viewGroup) {
        n.a m900 = view instanceof n.a ? (n.a) view : m900(viewGroup);
        mo899(iVar, m900);
        return (View) m900;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public n mo904(ViewGroup viewGroup) {
        if (this.f819 == null) {
            n nVar = (n) this.f814.inflate(this.f817, viewGroup, false);
            this.f819 = nVar;
            nVar.initialize(this.f813);
            updateMenuView(true);
        }
        return this.f819;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m905(int i5) {
        this.f820 = i5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public abstract boolean mo906(int i5, i iVar);
}
