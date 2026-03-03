package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    final Context f821;

    /* renamed from: ʼ, reason: contains not printable characters */
    private m.g<v.b, MenuItem> f822;

    /* renamed from: ʽ, reason: contains not printable characters */
    private m.g<v.c, SubMenu> f823;

    c(Context context) {
        this.f821 = context;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    final MenuItem m907(MenuItem menuItem) {
        if (!(menuItem instanceof v.b)) {
            return menuItem;
        }
        v.b bVar = (v.b) menuItem;
        if (this.f822 == null) {
            this.f822 = new m.g<>();
        }
        MenuItem menuItem2 = this.f822.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f821, bVar);
        this.f822.put(bVar, jVar);
        return jVar;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    final SubMenu m908(SubMenu subMenu) {
        if (!(subMenu instanceof v.c)) {
            return subMenu;
        }
        v.c cVar = (v.c) subMenu;
        if (this.f823 == null) {
            this.f823 = new m.g<>();
        }
        SubMenu subMenu2 = this.f823.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f821, cVar);
        this.f823.put(cVar, sVar);
        return sVar;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    final void m909() {
        m.g<v.b, MenuItem> gVar = this.f822;
        if (gVar != null) {
            gVar.clear();
        }
        m.g<v.c, SubMenu> gVar2 = this.f823;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    final void m910(int i5) {
        if (this.f822 == null) {
            return;
        }
        int i6 = 0;
        while (i6 < this.f822.size()) {
            if (this.f822.m9830(i6).getGroupId() == i5) {
                this.f822.mo9832(i6);
                i6--;
            }
            i6++;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    final void m911(int i5) {
        if (this.f822 == null) {
            return;
        }
        for (int i6 = 0; i6 < this.f822.size(); i6++) {
            if (this.f822.m9830(i6).getItemId() == i5) {
                this.f822.mo9832(i6);
                return;
            }
        }
    }
}
