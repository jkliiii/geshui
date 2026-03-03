package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.core.view.b;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: MenuItemImpl.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class i implements v.b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final int f883;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private MenuItem.OnActionExpandListener f884;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final int f885;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private ContextMenu.ContextMenuInfo f886;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f887;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f889;

    /* renamed from: ʿ, reason: contains not printable characters */
    private CharSequence f890;

    /* renamed from: ˆ, reason: contains not printable characters */
    private CharSequence f891;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Intent f892;

    /* renamed from: ˉ, reason: contains not printable characters */
    private char f893;

    /* renamed from: ˋ, reason: contains not printable characters */
    private char f895;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Drawable f897;

    /* renamed from: י, reason: contains not printable characters */
    g f899;

    /* renamed from: ـ, reason: contains not printable characters */
    private r f900;

    /* renamed from: ٴ, reason: contains not printable characters */
    private Runnable f901;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private MenuItem.OnMenuItemClickListener f902;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private View f903;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private CharSequence f904;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private androidx.core.view.b f905;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private CharSequence f906;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f913;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f894 = 4096;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f896 = 4096;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f898 = 0;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private ColorStateList f907 = null;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private PorterDuff.Mode f908 = null;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f909 = false;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean f910 = false;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f911 = false;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int f912 = 16;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private boolean f888 = false;

    /* compiled from: MenuItemImpl.java */
    class a implements b.InterfaceC0034b {
        a() {
        }

        @Override // androidx.core.view.b.InterfaceC0034b
        public void onActionProviderVisibilityChanged(boolean z5) {
            i iVar = i.this;
            iVar.f899.onItemVisibleChanged(iVar);
        }
    }

    i(g gVar, int i5, int i6, int i7, int i8, CharSequence charSequence, int i9) {
        this.f899 = gVar;
        this.f883 = i6;
        this.f885 = i5;
        this.f887 = i7;
        this.f889 = i8;
        this.f890 = charSequence;
        this.f913 = i9;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static void m946(StringBuilder sb, int i5, int i6, String str) {
        if ((i5 & i6) == i6) {
            sb.append(str);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private Drawable m947(Drawable drawable) {
        if (drawable != null && this.f911 && (this.f909 || this.f910)) {
            drawable = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
            if (this.f909) {
                androidx.core.graphics.drawable.a.m2210(drawable, this.f907);
            }
            if (this.f910) {
                androidx.core.graphics.drawable.a.m2211(drawable, this.f908);
            }
            this.f911 = false;
        }
        return drawable;
    }

    @Override // v.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f913 & 8) == 0) {
            return false;
        }
        if (this.f903 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f884;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f899.collapseItemActionView(this);
        }
        return false;
    }

    @Override // v.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m953()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f884;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f899.expandItemActionView(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // v.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f903;
        if (view != null) {
            return view;
        }
        androidx.core.view.b bVar = this.f905;
        if (bVar == null) {
            return null;
        }
        View mo978 = bVar.mo978(this);
        this.f903 = mo978;
        return mo978;
    }

    @Override // v.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f896;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f895;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f904;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f885;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f897;
        if (drawable != null) {
            return m947(drawable);
        }
        if (this.f898 == 0) {
            return null;
        }
        Drawable m8475 = f.a.m8475(this.f899.getContext(), this.f898);
        this.f898 = 0;
        this.f897 = m8475;
        return m947(m8475);
    }

    @Override // v.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f907;
    }

    @Override // v.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f908;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f892;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f883;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f886;
    }

    @Override // v.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f894;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f893;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f887;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f900;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f890;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f891;
        return charSequence != null ? charSequence : this.f890;
    }

    @Override // v.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f906;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f900 != null;
    }

    @Override // v.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f888;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f912 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f912 & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f912 & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        androidx.core.view.b bVar = this.f905;
        return (bVar == null || !bVar.mo979()) ? (this.f912 & 8) == 0 : (this.f912 & 8) == 0 && this.f905.mo977();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6) {
        if (this.f895 == c6) {
            return this;
        }
        this.f895 = Character.toLowerCase(c6);
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z5) {
        int i5 = this.f912;
        int i6 = (z5 ? 1 : 0) | (i5 & (-2));
        this.f912 = i6;
        if (i5 != i6) {
            this.f899.onItemsChanged(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z5) {
        if ((this.f912 & 4) != 0) {
            this.f899.setExclusiveItemChecked(this);
        } else {
            m964(z5);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z5) {
        if (z5) {
            this.f912 |= 16;
        } else {
            this.f912 &= -17;
        }
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f898 = 0;
        this.f897 = drawable;
        this.f911 = true;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f907 = colorStateList;
        this.f909 = true;
        this.f911 = true;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f908 = mode;
        this.f910 = true;
        this.f911 = true;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f892 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c6) {
        if (this.f893 == c6) {
            return this;
        }
        this.f893 = c6;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f884 = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f902 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7) {
        this.f893 = c6;
        this.f895 = Character.toLowerCase(c7);
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public void setShowAsAction(int i5) {
        int i6 = i5 & 3;
        if (i6 != 0 && i6 != 1 && i6 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f913 = i5;
        this.f899.onItemActionRequestChanged(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f890 = charSequence;
        this.f899.onItemsChanged(false);
        r rVar = this.f900;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f891 = charSequence;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z5) {
        if (m970(z5)) {
            this.f899.onItemVisibleChanged(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f890;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // v.b
    /* renamed from: ʻ */
    public v.b mo893(androidx.core.view.b bVar) {
        androidx.core.view.b bVar2 = this.f905;
        if (bVar2 != null) {
            bVar2.m2750();
        }
        this.f903 = null;
        this.f905 = bVar;
        this.f899.onItemsChanged(true);
        androidx.core.view.b bVar3 = this.f905;
        if (bVar3 != null) {
            bVar3.mo980(new a());
        }
        return this;
    }

    @Override // v.b
    /* renamed from: ʼ */
    public androidx.core.view.b mo894() {
        return this.f905;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m948() {
        this.f899.onItemActionRequestChanged(this);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public int m949() {
        return this.f889;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    char m950() {
        return this.f899.isQwertyMode() ? this.f895 : this.f893;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    String m951() {
        char m950 = m950();
        if (m950 == 0) {
            return BuildConfig.FLAVOR;
        }
        Resources resources = this.f899.getContext().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f899.getContext()).hasPermanentMenuKey()) {
            sb.append(resources.getString(e.h.f7071));
        }
        int i5 = this.f899.isQwertyMode() ? this.f896 : this.f894;
        m946(sb, i5, 65536, resources.getString(e.h.f7067));
        m946(sb, i5, 4096, resources.getString(e.h.f7063));
        m946(sb, i5, 2, resources.getString(e.h.f7062));
        m946(sb, i5, 1, resources.getString(e.h.f7068));
        m946(sb, i5, 4, resources.getString(e.h.f7070));
        m946(sb, i5, 8, resources.getString(e.h.f7066));
        if (m950 == '\b') {
            sb.append(resources.getString(e.h.f7064));
        } else if (m950 == '\n') {
            sb.append(resources.getString(e.h.f7065));
        } else if (m950 != ' ') {
            sb.append(m950);
        } else {
            sb.append(resources.getString(e.h.f7069));
        }
        return sb.toString();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    CharSequence m952(n.a aVar) {
        return (aVar == null || !aVar.prefersCondensedTitle()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m953() {
        androidx.core.view.b bVar;
        if ((this.f913 & 8) == 0) {
            return false;
        }
        if (this.f903 == null && (bVar = this.f905) != null) {
            this.f903 = bVar.mo978(this);
        }
        return this.f903 != null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m954() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f902;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.f899;
        if (gVar.dispatchMenuItemSelected(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f901;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f892 != null) {
            try {
                this.f899.getContext().startActivity(this.f892);
                return true;
            } catch (ActivityNotFoundException e5) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e5);
            }
        }
        androidx.core.view.b bVar = this.f905;
        return bVar != null && bVar.mo975();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m955() {
        return (this.f912 & 32) == 32;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m956() {
        return (this.f912 & 4) != 0;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m957() {
        return (this.f913 & 1) == 1;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m958() {
        return (this.f913 & 2) == 2;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: ٴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v.b setActionView(int i5) {
        Context context = this.f899.getContext();
        setActionView(LayoutInflater.from(context).inflate(i5, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: ᐧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v.b setActionView(View view) {
        int i5;
        this.f903 = view;
        this.f905 = null;
        if (view != null && view.getId() == -1 && (i5 = this.f883) > 0) {
            view.setId(i5);
        }
        this.f899.onItemActionRequestChanged(this);
        return this;
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    boolean m961() {
        return this.f899.isShortcutsVisible() && m950() != 0;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m962(boolean z5) {
        this.f888 = z5;
        this.f899.onItemsChanged(false);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    public boolean m963() {
        return (this.f913 & 4) == 4;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    void m964(boolean z5) {
        int i5 = this.f912;
        int i6 = (z5 ? 2 : 0) | (i5 & (-3));
        this.f912 = i6;
        if (i5 != i6) {
            this.f899.onItemsChanged(false);
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m965(boolean z5) {
        this.f912 = (z5 ? 4 : 0) | (this.f912 & (-5));
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public void m966(boolean z5) {
        if (z5) {
            this.f912 |= 32;
        } else {
            this.f912 &= -33;
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    void m967(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f886 = contextMenuInfo;
    }

    @Override // v.b, android.view.MenuItem
    /* renamed from: ﹳ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public v.b setShowAsActionFlags(int i5) {
        setShowAsAction(i5);
        return this;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public void m969(r rVar) {
        this.f900 = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    boolean m970(boolean z5) {
        int i5 = this.f912;
        int i6 = (z5 ? 0 : 8) | (i5 & (-9));
        this.f912 = i6;
        return i5 != i6;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean m971() {
        return this.f899.getOptionalIconsVisible();
    }

    @Override // android.view.MenuItem
    public v.b setContentDescription(CharSequence charSequence) {
        this.f904 = charSequence;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public v.b setTooltipText(CharSequence charSequence) {
        this.f906 = charSequence;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c6, int i5) {
        if (this.f895 == c6 && this.f896 == i5) {
            return this;
        }
        this.f895 = Character.toLowerCase(c6);
        this.f896 = KeyEvent.normalizeMetaState(i5);
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c6, int i5) {
        if (this.f893 == c6 && this.f894 == i5) {
            return this;
        }
        this.f893 = c6;
        this.f894 = KeyEvent.normalizeMetaState(i5);
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // v.b, android.view.MenuItem
    public MenuItem setShortcut(char c6, char c7, int i5, int i6) {
        this.f893 = c6;
        this.f894 = KeyEvent.normalizeMetaState(i5);
        this.f895 = Character.toLowerCase(c7);
        this.f896 = KeyEvent.normalizeMetaState(i6);
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i5) {
        this.f897 = null;
        this.f898 = i5;
        this.f911 = true;
        this.f899.onItemsChanged(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i5) {
        return setTitle(this.f899.getContext().getString(i5));
    }
}
