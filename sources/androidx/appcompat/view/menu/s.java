package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuWrapperICS.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class s extends o implements SubMenu {

    /* renamed from: ʿ, reason: contains not printable characters */
    private final v.c f964;

    s(Context context, v.c cVar) {
        super(context, cVar);
        this.f964 = cVar;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f964.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m907(this.f964.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i5) {
        this.f964.setHeaderIcon(i5);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i5) {
        this.f964.setHeaderTitle(i5);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f964.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i5) {
        this.f964.setIcon(i5);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f964.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f964.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f964.setIcon(drawable);
        return this;
    }
}
