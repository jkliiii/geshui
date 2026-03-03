package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: ActionMenuItem.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a implements v.b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f791;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f792;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f793;

    /* renamed from: ʾ, reason: contains not printable characters */
    private CharSequence f794;

    /* renamed from: ʿ, reason: contains not printable characters */
    private CharSequence f795;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Intent f796;

    /* renamed from: ˈ, reason: contains not printable characters */
    private char f797;

    /* renamed from: ˊ, reason: contains not printable characters */
    private char f799;

    /* renamed from: ˎ, reason: contains not printable characters */
    private Drawable f801;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Context f802;

    /* renamed from: ˑ, reason: contains not printable characters */
    private MenuItem.OnMenuItemClickListener f803;

    /* renamed from: י, reason: contains not printable characters */
    private CharSequence f804;

    /* renamed from: ـ, reason: contains not printable characters */
    private CharSequence f805;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f798 = 4096;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f800 = 4096;

    /* renamed from: ٴ, reason: contains not printable characters */
    private ColorStateList f806 = null;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private PorterDuff.Mode f807 = null;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f808 = false;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private boolean f809 = false;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f810 = 16;

    public a(Context context, int i5, int i6, int i7, int i8, CharSequence charSequence) {
        this.f802 = context;
        this.f791 = i6;
        this.f792 = i5;
        this.f793 = i8;
        this.f794 = charSequence;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m892() {
        Drawable drawable = this.f801;
        if (drawable != null) {
            if (this.f808 || this.f809) {
                Drawable m2213 = androidx.core.graphics.drawable.a.m2213(drawable);
                this.f801 = m2213;
                Drawable mutate = m2213.mutate();
                this.f801 = mutate;
                if (this.f808) {
                    androidx.core.graphics.drawable.a.m2210(mutate, this.f806);
                }
                if (this.f809) {
                    androidx.core.graphics.drawable.a.m2211(this.f801, this.f807);
                }
            }
        }
    }

    @Override // v.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // v.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // v.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f800;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f799;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f804;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f792;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f801;
    }

    @Override // v.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f806;
    }

    @Override // v.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f807;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f796;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f791;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // v.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f798;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f797;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f793;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f794;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f795;
        return charSequence != null ? charSequence : this.f794;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f805;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // v.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f810 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f810 & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f810 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f810 & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        this.f799 = Character.toLowerCase(c6);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        this.f810 = (z5 ? 1 : 0) | (this.f810 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        this.f810 = (z5 ? 2 : 0) | (this.f810 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        this.f810 = (z5 ? 16 : 0) | (this.f810 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f801 = drawable;
        m892();
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f806 = colorStateList;
        this.f808 = true;
        m892();
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f807 = mode;
        this.f809 = true;
        m892();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f796 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        this.f797 = c6;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f803 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f797 = c6;
        this.f799 = Character.toLowerCase(c7);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f794 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f795 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        this.f810 = (this.f810 & 8) | (z5 ? 0 : 8);
        return this;
    }

    @Override // v.b
    /* renamed from: ʻ, reason: contains not printable characters */
    public v.b mo893(androidx.core.view.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // v.b
    /* renamed from: ʼ, reason: contains not printable characters */
    public androidx.core.view.b mo894() {
        return null;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v.b setActionView(int i5) {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: ˆ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v.b setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i5) {
        this.f799 = Character.toLowerCase(c6);
        this.f800 = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setContentDescription(CharSequence charSequence) {
        this.f804 = charSequence;
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i5) {
        this.f797 = c6;
        this.f798 = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i5) {
        this.f794 = this.f802.getResources().getString(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setTooltipText(CharSequence charSequence) {
        this.f805 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i5) {
        this.f801 = androidx.core.content.a.m1993(this.f802, i5);
        m892();
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i5, int i6) {
        this.f797 = c6;
        this.f798 = KeyEvent.normalizeMetaState(i5);
        this.f799 = Character.toLowerCase(c7);
        this.f800 = KeyEvent.normalizeMetaState(i6);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public void setShowAsAction(int i5) {
    }
}
