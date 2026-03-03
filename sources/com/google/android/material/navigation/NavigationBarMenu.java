package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class NavigationBarMenu extends g {
    private final int maxItemCount;
    private final Class<?> viewClass;

    public NavigationBarMenu(Context context, Class<?> cls, int i5) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i5;
    }

    @Override // androidx.appcompat.view.menu.g
    protected MenuItem addInternal(int i5, int i6, int i7, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem addInternal = super.addInternal(i5, i6, i7, charSequence);
            if (addInternal instanceof i) {
                ((i) addInternal).m965(true);
            }
            startDispatchingItemsChanged();
            return addInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.maxItemCount + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
