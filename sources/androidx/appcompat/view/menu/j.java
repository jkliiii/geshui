package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b;
import java.lang.reflect.Method;

/* compiled from: MenuItemWrapperICS.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j extends androidx.appcompat.view.menu.c implements MenuItem {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final v.b f915;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Method f916;

    /* compiled from: MenuItemWrapperICS.java */
    private class a extends androidx.core.view.b {

        /* renamed from: ʾ, reason: contains not printable characters */
        final ActionProvider f917;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f917 = actionProvider;
        }

        @Override // androidx.core.view.b
        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean mo973() {
            return this.f917.hasSubMenu();
        }

        @Override // androidx.core.view.b
        /* renamed from: ʽ, reason: contains not printable characters */
        public View mo974() {
            return this.f917.onCreateActionView();
        }

        @Override // androidx.core.view.b
        /* renamed from: ʿ, reason: contains not printable characters */
        public boolean mo975() {
            return this.f917.onPerformDefaultAction();
        }

        @Override // androidx.core.view.b
        /* renamed from: ˆ, reason: contains not printable characters */
        public void mo976(SubMenu subMenu) {
            this.f917.onPrepareSubMenu(j.this.m908(subMenu));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: ˆ, reason: contains not printable characters */
        private b.InterfaceC0034b f919;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z5) {
            b.InterfaceC0034b interfaceC0034b = this.f919;
            if (interfaceC0034b != null) {
                interfaceC0034b.onActionProviderVisibilityChanged(z5);
            }
        }

        @Override // androidx.core.view.b
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean mo977() {
            return this.f917.isVisible();
        }

        @Override // androidx.core.view.b
        /* renamed from: ʾ, reason: contains not printable characters */
        public View mo978(MenuItem menuItem) {
            return this.f917.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.b
        /* renamed from: ˈ, reason: contains not printable characters */
        public boolean mo979() {
            return this.f917.overridesItemVisibility();
        }

        @Override // androidx.core.view.b
        /* renamed from: ˋ, reason: contains not printable characters */
        public void mo980(b.InterfaceC0034b interfaceC0034b) {
            this.f919 = interfaceC0034b;
            this.f917.setVisibilityListener(interfaceC0034b != null ? this : null);
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    static class c extends FrameLayout implements androidx.appcompat.view.c {

        /* renamed from: ʾ, reason: contains not printable characters */
        final CollapsibleActionView f921;

        /* JADX WARN: Multi-variable type inference failed */
        c(View view) {
            super(view.getContext());
            this.f921 = (CollapsibleActionView) view;
            addView(view);
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewCollapsed() {
            this.f921.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.c
        public void onActionViewExpanded() {
            this.f921.onActionViewExpanded();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        View m981() {
            return (View) this.f921;
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final MenuItem.OnActionExpandListener f922;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f922 = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f922.onMenuItemActionCollapse(j.this.m907(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f922.onMenuItemActionExpand(j.this.m907(menuItem));
        }
    }

    /* compiled from: MenuItemWrapperICS.java */
    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final MenuItem.OnMenuItemClickListener f924;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f924 = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f924.onMenuItemClick(j.this.m907(menuItem));
        }
    }

    public j(Context context, v.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f915 = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f915.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f915.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        androidx.core.view.b mo894 = this.f915.mo894();
        if (mo894 instanceof a) {
            return ((a) mo894).f917;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f915.getActionView();
        return actionView instanceof c ? ((c) actionView).m981() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f915.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f915.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f915.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f915.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f915.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f915.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f915.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f915.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f915.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f915.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f915.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f915.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f915.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m908(this.f915.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f915.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f915.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f915.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f915.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f915.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f915.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f915.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f915.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f915.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f821, actionProvider);
        v.b bVar2 = this.f915;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo893(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f915.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f915.setAlphabeticShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        this.f915.setCheckable(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        this.f915.setChecked(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f915.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.f915.setEnabled(z5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f915.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f915.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f915.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f915.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f915.setNumericShortcut(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f915.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f915.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f915.setShortcut(c6, c7);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i5) {
        this.f915.setShowAsAction(i5);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i5) {
        this.f915.setShowAsActionFlags(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f915.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f915.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f915.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        return this.f915.setVisible(z5);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m972(boolean z5) {
        try {
            if (this.f916 == null) {
                this.f916 = this.f915.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f916.invoke(this.f915, Boolean.valueOf(z5));
        } catch (Exception e5) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e5);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i5) {
        this.f915.setAlphabeticShortcut(c6, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i5) {
        this.f915.setIcon(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i5) {
        this.f915.setNumericShortcut(c6, i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i5, int i6) {
        this.f915.setShortcut(c6, c7, i5, i6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i5) {
        this.f915.setTitle(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i5) {
        this.f915.setActionView(i5);
        View actionView = this.f915.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f915.setActionView(new c(actionView));
        }
        return this;
    }
}
