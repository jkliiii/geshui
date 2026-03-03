package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.r;

/* loaded from: E:\78999\cookie_5123796.dex */
public class NavigationSubMenu extends r {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, androidx.appcompat.view.menu.i iVar) {
        super(context, navigationMenu, iVar);
    }

    @Override // androidx.appcompat.view.menu.g
    public void onItemsChanged(boolean z5) {
        super.onItemsChanged(z5);
        ((androidx.appcompat.view.menu.g) getParentMenu()).onItemsChanged(z5);
    }
}
