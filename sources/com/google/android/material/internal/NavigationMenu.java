package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;

/* loaded from: E:\78999\cookie_5123796.dex */
public class NavigationMenu extends androidx.appcompat.view.menu.g {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.g, android.view.Menu
    public SubMenu addSubMenu(int i5, int i6, int i7, CharSequence charSequence) {
        androidx.appcompat.view.menu.i iVar = (androidx.appcompat.view.menu.i) addInternal(i5, i6, i7, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, iVar);
        iVar.m969(navigationSubMenu);
        return navigationSubMenu;
    }
}
