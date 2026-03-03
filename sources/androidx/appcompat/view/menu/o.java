package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: MenuWrapperICS.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class o extends c implements Menu {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final v.a f940;

    public o(Context context, v.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f940 = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m907(this.f940.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i5, int i6, int i7, ComponentName componentName, Intent[] intentArr, Intent intent, int i8, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.f940.addIntentOptions(i5, i6, i7, componentName, intentArr, intent, i8, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i9 = 0; i9 < length; i9++) {
                menuItemArr[i9] = m907(menuItemArr2[i9]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m908(this.f940.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m909();
        this.f940.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f940.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i5) {
        return m907(this.f940.findItem(i5));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i5) {
        return m907(this.f940.getItem(i5));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f940.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i5, KeyEvent keyEvent) {
        return this.f940.isShortcutKey(i5, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i5, int i6) {
        return this.f940.performIdentifierAction(i5, i6);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i5, KeyEvent keyEvent, int i6) {
        return this.f940.performShortcut(i5, keyEvent, i6);
    }

    @Override // android.view.Menu
    public void removeGroup(int i5) {
        m910(i5);
        this.f940.removeGroup(i5);
    }

    @Override // android.view.Menu
    public void removeItem(int i5) {
        m911(i5);
        this.f940.removeItem(i5);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i5, boolean z5, boolean z6) {
        this.f940.setGroupCheckable(i5, z5, z6);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i5, boolean z5) {
        this.f940.setGroupEnabled(i5, z5);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i5, boolean z5) {
        this.f940.setGroupVisible(i5, z5);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z5) {
        this.f940.setQwertyMode(z5);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f940.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i5) {
        return m907(this.f940.add(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5) {
        return m908(this.f940.addSubMenu(i5));
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, CharSequence charSequence) {
        return m907(this.f940.add(i5, i6, i7, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        return m908(this.f940.addSubMenu(i5, i6, i7, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i5, int i6, int i7, int i8) {
        return m907(this.f940.add(i5, i6, i7, i8));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, int i8) {
        return m908(this.f940.addSubMenu(i5, i6, i7, i8));
    }
}
