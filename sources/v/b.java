package v;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

/* compiled from: SupportMenuItem.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface b extends MenuItem {
    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i5);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c6, int i5);

    @Override // android.view.MenuItem
    b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c6, int i5);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c6, char c7, int i5, int i6);

    @Override // android.view.MenuItem
    void setShowAsAction(int i5);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i5);

    @Override // android.view.MenuItem
    b setTooltipText(CharSequence charSequence);

    /* renamed from: ʻ */
    b mo893(androidx.core.view.b bVar);

    /* renamed from: ʼ */
    androidx.core.view.b mo894();
}
