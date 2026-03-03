package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.r;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.widget.c0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import java.util.ArrayList;

/* loaded from: E:\78999\cookie_5123796.dex */
public class NavigationMenuPresenter implements androidx.appcompat.view.menu.m {
    public static final int NO_TEXT_APPEARANCE_SET = 0;
    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    c adapter;
    private m.a callback;
    int dividerInsetEnd;
    int dividerInsetStart;
    boolean hasCustomItemIconSize;
    LinearLayout headerLayout;
    ColorStateList iconTintList;
    private int id;
    Drawable itemBackground;
    RippleDrawable itemForeground;
    int itemHorizontalPadding;
    int itemIconPadding;
    int itemIconSize;
    private int itemMaxLines;
    int itemVerticalPadding;
    LayoutInflater layoutInflater;
    androidx.appcompat.view.menu.g menu;
    private NavigationMenuView menuView;
    int paddingSeparator;
    private int paddingTopDefault;
    ColorStateList subheaderColor;
    int subheaderInsetEnd;
    int subheaderInsetStart;
    ColorStateList textColor;
    int subheaderTextAppearance = 0;
    int textAppearance = 0;
    boolean textAppearanceActiveBoldEnabled = true;
    boolean isBehindStatusBar = true;
    private int overScrollMode = -1;
    final View.OnClickListener onClickListener = new a();

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z5 = true;
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            androidx.appcompat.view.menu.i itemData = ((NavigationMenuItemView) view).getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.menu.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.adapter.m6925(itemData);
            } else {
                z5 = false;
            }
            NavigationMenuPresenter.this.setUpdateSuspended(false);
            if (z5) {
                NavigationMenuPresenter.this.updateMenuView(false);
            }
        }
    }

    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    private class c extends RecyclerView.h<l> {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final ArrayList<e> f5831 = new ArrayList<>();

        /* renamed from: ʿ, reason: contains not printable characters */
        private androidx.appcompat.view.menu.i f5832;

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f5833;

        class a extends androidx.core.view.a {

            /* renamed from: ʻ, reason: contains not printable characters */
            final /* synthetic */ int f5835;

            /* renamed from: ʼ, reason: contains not printable characters */
            final /* synthetic */ boolean f5836;

            a(int i5, boolean z5) {
                this.f5835 = i5;
                this.f5836 = z5;
            }

            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
                super.onInitializeAccessibilityNodeInfo(view, j0Var);
                j0Var.m2644(j0.c.m2711(c.this.m6918(this.f5835), 1, 1, 1, this.f5836, view.isSelected()));
            }
        }

        c() {
            m6915();
        }

        /* renamed from: ʾʾ, reason: contains not printable characters */
        private void m6915() {
            if (this.f5833) {
                return;
            }
            this.f5833 = true;
            this.f5831.clear();
            this.f5831.add(new d());
            int size = NavigationMenuPresenter.this.menu.getVisibleItems().size();
            int i5 = -1;
            boolean z5 = false;
            int i6 = 0;
            for (int i7 = 0; i7 < size; i7++) {
                androidx.appcompat.view.menu.i iVar = NavigationMenuPresenter.this.menu.getVisibleItems().get(i7);
                if (iVar.isChecked()) {
                    m6925(iVar);
                }
                if (iVar.isCheckable()) {
                    iVar.m965(false);
                }
                if (iVar.hasSubMenu()) {
                    SubMenu subMenu = iVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i7 != 0) {
                            this.f5831.add(new f(NavigationMenuPresenter.this.paddingSeparator, 0));
                        }
                        this.f5831.add(new g(iVar));
                        int size2 = this.f5831.size();
                        int size3 = subMenu.size();
                        boolean z6 = false;
                        for (int i8 = 0; i8 < size3; i8++) {
                            androidx.appcompat.view.menu.i iVar2 = (androidx.appcompat.view.menu.i) subMenu.getItem(i8);
                            if (iVar2.isVisible()) {
                                if (!z6 && iVar2.getIcon() != null) {
                                    z6 = true;
                                }
                                if (iVar2.isCheckable()) {
                                    iVar2.m965(false);
                                }
                                if (iVar.isChecked()) {
                                    m6925(iVar);
                                }
                                this.f5831.add(new g(iVar2));
                            }
                        }
                        if (z6) {
                            m6919(size2, this.f5831.size());
                        }
                    }
                } else {
                    int groupId = iVar.getGroupId();
                    if (groupId != i5) {
                        i6 = this.f5831.size();
                        z5 = iVar.getIcon() != null;
                        if (i7 != 0) {
                            i6++;
                            ArrayList<e> arrayList = this.f5831;
                            int i9 = NavigationMenuPresenter.this.paddingSeparator;
                            arrayList.add(new f(i9, i9));
                        }
                    } else if (!z5 && iVar.getIcon() != null) {
                        m6919(i6, this.f5831.size());
                        z5 = true;
                    }
                    g gVar = new g(iVar);
                    gVar.f5841 = z5;
                    this.f5831.add(gVar);
                    i5 = groupId;
                }
            }
            this.f5833 = false;
        }

        /* renamed from: ˆˆ, reason: contains not printable characters */
        private void m6916(View view, int i5, boolean z5) {
            f1.m2830(view, new a(i5, z5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ﾞ, reason: contains not printable characters */
        public int m6918(int i5) {
            int i6 = i5;
            for (int i7 = 0; i7 < i5; i7++) {
                if (NavigationMenuPresenter.this.adapter.mo4809(i7) == 2 || NavigationMenuPresenter.this.adapter.mo4809(i7) == 3) {
                    i6--;
                }
            }
            return i6;
        }

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        private void m6919(int i5, int i6) {
            while (i5 < i6) {
                ((g) this.f5831.get(i5)).f5841 = true;
                i5++;
            }
        }

        /* renamed from: ʻʻ, reason: contains not printable characters */
        int m6920() {
            int i5 = 0;
            for (int i6 = 0; i6 < NavigationMenuPresenter.this.adapter.mo4807(); i6++) {
                int mo4809 = NavigationMenuPresenter.this.adapter.mo4809(i6);
                if (mo4809 == 0 || mo4809 == 1) {
                    i5++;
                }
            }
            return i5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ʼʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public l mo4817(ViewGroup viewGroup, int i5) {
            if (i5 == 0) {
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                return new i(navigationMenuPresenter.layoutInflater, viewGroup, navigationMenuPresenter.onClickListener);
            }
            if (i5 == 1) {
                return new k(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i5 == 2) {
                return new j(NavigationMenuPresenter.this.layoutInflater, viewGroup);
            }
            if (i5 != 3) {
                return null;
            }
            return new b(NavigationMenuPresenter.this.headerLayout);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ʽʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4815(l lVar, int i5) {
            int mo4809 = mo4809(i5);
            if (mo4809 != 0) {
                if (mo4809 != 1) {
                    if (mo4809 != 2) {
                        return;
                    }
                    f fVar = (f) this.f5831.get(i5);
                    lVar.itemView.setPadding(NavigationMenuPresenter.this.dividerInsetStart, fVar.m6931(), NavigationMenuPresenter.this.dividerInsetEnd, fVar.m6930());
                    return;
                }
                TextView textView = (TextView) lVar.itemView;
                textView.setText(((g) this.f5831.get(i5)).m6932().getTitle());
                c0.m3570(textView, NavigationMenuPresenter.this.subheaderTextAppearance);
                textView.setPadding(NavigationMenuPresenter.this.subheaderInsetStart, textView.getPaddingTop(), NavigationMenuPresenter.this.subheaderInsetEnd, textView.getPaddingBottom());
                ColorStateList colorStateList = NavigationMenuPresenter.this.subheaderColor;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                m6916(textView, i5, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.setIconTintList(NavigationMenuPresenter.this.iconTintList);
            navigationMenuItemView.setTextAppearance(NavigationMenuPresenter.this.textAppearance);
            ColorStateList colorStateList2 = NavigationMenuPresenter.this.textColor;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = NavigationMenuPresenter.this.itemBackground;
            f1.m2836(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = NavigationMenuPresenter.this.itemForeground;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.f5831.get(i5);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f5841);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i6 = navigationMenuPresenter.itemHorizontalPadding;
            int i7 = navigationMenuPresenter.itemVerticalPadding;
            navigationMenuItemView.setPadding(i6, i7, i6, i7);
            navigationMenuItemView.setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            if (navigationMenuPresenter2.hasCustomItemIconSize) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter2.itemIconSize);
            }
            navigationMenuItemView.setMaxLines(NavigationMenuPresenter.this.itemMaxLines);
            navigationMenuItemView.initialize(gVar.m6932(), NavigationMenuPresenter.this.textAppearanceActiveBoldEnabled);
            m6916(navigationMenuItemView, i5, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ʿ */
        public int mo4807() {
            return this.f5831.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ʿʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo4822(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).recycle();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ˆ */
        public long mo4808(int i5) {
            return i5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: ˈ */
        public int mo4809(int i5) {
            e eVar = this.f5831.get(i5);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).m6932().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* renamed from: ˈˈ, reason: contains not printable characters */
        public void m6924(boolean z5) {
            this.f5833 = z5;
        }

        /* renamed from: ˉˉ, reason: contains not printable characters */
        public void m6925(androidx.appcompat.view.menu.i iVar) {
            if (this.f5832 == iVar || !iVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.i iVar2 = this.f5832;
            if (iVar2 != null) {
                iVar2.setChecked(false);
            }
            this.f5832 = iVar;
            iVar.setChecked(true);
        }

        /* renamed from: ˋˋ, reason: contains not printable characters */
        public void m6926() {
            m6915();
            m4812();
        }

        /* renamed from: ــ, reason: contains not printable characters */
        public void m6927(Bundle bundle) {
            androidx.appcompat.view.menu.i m6932;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.i m69322;
            int i5 = bundle.getInt("android:menu:checked", 0);
            if (i5 != 0) {
                this.f5833 = true;
                int size = this.f5831.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    e eVar = this.f5831.get(i6);
                    if ((eVar instanceof g) && (m69322 = ((g) eVar).m6932()) != null && m69322.getItemId() == i5) {
                        m6925(m69322);
                        break;
                    }
                    i6++;
                }
                this.f5833 = false;
                m6915();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.f5831.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    e eVar2 = this.f5831.get(i7);
                    if ((eVar2 instanceof g) && (m6932 = ((g) eVar2).m6932()) != null && (actionView = m6932.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(m6932.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        public Bundle m6928() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.i iVar = this.f5832;
            if (iVar != null) {
                bundle.putInt("android:menu:checked", iVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f5831.size();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = this.f5831.get(i5);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.i m6932 = ((g) eVar).m6932();
                    View actionView = m6932 != null ? m6932.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(m6932.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        public androidx.appcompat.view.menu.i m6929() {
            return this.f5832;
        }
    }

    private static class d implements e {
        d() {
        }
    }

    private interface e {
    }

    private static class f implements e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final int f5838;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f5839;

        public f(int i5, int i6) {
            this.f5838 = i5;
            this.f5839 = i6;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public int m6930() {
            return this.f5839;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public int m6931() {
            return this.f5838;
        }
    }

    private static class g implements e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final androidx.appcompat.view.menu.i f5840;

        /* renamed from: ʼ, reason: contains not printable characters */
        boolean f5841;

        g(androidx.appcompat.view.menu.i iVar) {
            this.f5840 = iVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public androidx.appcompat.view.menu.i m6932() {
            return this.f5840;
        }
    }

    private class h extends androidx.recyclerview.widget.k {
        h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.k, androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2643(j0.b.m2709(NavigationMenuPresenter.this.adapter.m6920(), 1, false));
        }
    }

    private static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    private static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    private static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    private static abstract class l extends RecyclerView.f0 {
        public l(View view) {
            super(view);
        }
    }

    private boolean hasHeader() {
        return getHeaderCount() > 0;
    }

    private void updateTopPadding() {
        int i5 = (hasHeader() || !this.isBehindStatusBar) ? 0 : this.paddingTopDefault;
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, i5, 0, navigationMenuView.getPaddingBottom());
    }

    public void addHeaderView(View view) {
        this.headerLayout.addView(view);
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean collapseItemActionView(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    public void dispatchApplyWindowInsets(f5 f5Var) {
        int m3076 = f5Var.m3076();
        if (this.paddingTopDefault != m3076) {
            this.paddingTopDefault = m3076;
            updateTopPadding();
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, f5Var.m3073());
        f1.m2872(this.headerLayout, f5Var);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean expandItemActionView(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean flagActionItems() {
        return false;
    }

    public androidx.appcompat.view.menu.i getCheckedItem() {
        return this.adapter.m6929();
    }

    public int getDividerInsetEnd() {
        return this.dividerInsetEnd;
    }

    public int getDividerInsetStart() {
        return this.dividerInsetStart;
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int i5) {
        return this.headerLayout.getChildAt(i5);
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.id;
    }

    public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    public int getItemMaxLines() {
        return this.itemMaxLines;
    }

    public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public int getItemVerticalPadding() {
        return this.itemVerticalPadding;
    }

    public androidx.appcompat.view.menu.n getMenuView(ViewGroup viewGroup) {
        if (this.menuView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.layoutInflater.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.menuView = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.menuView));
            if (this.adapter == null) {
                this.adapter = new c();
            }
            int i5 = this.overScrollMode;
            if (i5 != -1) {
                this.menuView.setOverScrollMode(i5);
            }
            LinearLayout linearLayout = (LinearLayout) this.layoutInflater.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.menuView, false);
            this.headerLayout = linearLayout;
            f1.m2843(linearLayout, 2);
            this.menuView.setAdapter(this.adapter);
        }
        return this.menuView;
    }

    public int getSubheaderInsetEnd() {
        return this.subheaderInsetEnd;
    }

    public int getSubheaderInsetStart() {
        return this.subheaderInsetStart;
    }

    public View inflateHeaderView(int i5) {
        View inflate = this.layoutInflater.inflate(i5, (ViewGroup) this.headerLayout, false);
        addHeaderView(inflate);
        return inflate;
    }

    @Override // androidx.appcompat.view.menu.m
    public void initForMenu(Context context, androidx.appcompat.view.menu.g gVar) {
        this.layoutInflater = LayoutInflater.from(context);
        this.menu = gVar;
        this.paddingSeparator = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public boolean isBehindStatusBar() {
        return this.isBehindStatusBar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
        m.a aVar = this.callback;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z5);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(STATE_HIERARCHY);
            if (sparseParcelableArray != null) {
                this.menuView.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(STATE_ADAPTER);
            if (bundle2 != null) {
                this.adapter.m6927(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(STATE_HEADER);
            if (sparseParcelableArray2 != null) {
                this.headerLayout.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.menuView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.menuView.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(STATE_HIERARCHY, sparseArray);
        }
        c cVar = this.adapter;
        if (cVar != null) {
            bundle.putBundle(STATE_ADAPTER, cVar.m6928());
        }
        if (this.headerLayout != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.headerLayout.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(STATE_HEADER, sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean onSubMenuSelected(r rVar) {
        return false;
    }

    public void removeHeaderView(View view) {
        this.headerLayout.removeView(view);
        if (hasHeader()) {
            return;
        }
        NavigationMenuView navigationMenuView = this.menuView;
        navigationMenuView.setPadding(0, this.paddingTopDefault, 0, navigationMenuView.getPaddingBottom());
    }

    public void setBehindStatusBar(boolean z5) {
        if (this.isBehindStatusBar != z5) {
            this.isBehindStatusBar = z5;
            updateTopPadding();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void setCallback(m.a aVar) {
        this.callback = aVar;
    }

    public void setCheckedItem(androidx.appcompat.view.menu.i iVar) {
        this.adapter.m6925(iVar);
    }

    public void setDividerInsetEnd(int i5) {
        this.dividerInsetEnd = i5;
        updateMenuView(false);
    }

    public void setDividerInsetStart(int i5) {
        this.dividerInsetStart = i5;
        updateMenuView(false);
    }

    public void setId(int i5) {
        this.id = i5;
    }

    public void setItemBackground(Drawable drawable) {
        this.itemBackground = drawable;
        updateMenuView(false);
    }

    public void setItemForeground(RippleDrawable rippleDrawable) {
        this.itemForeground = rippleDrawable;
        updateMenuView(false);
    }

    public void setItemHorizontalPadding(int i5) {
        this.itemHorizontalPadding = i5;
        updateMenuView(false);
    }

    public void setItemIconPadding(int i5) {
        this.itemIconPadding = i5;
        updateMenuView(false);
    }

    public void setItemIconSize(int i5) {
        if (this.itemIconSize != i5) {
            this.itemIconSize = i5;
            this.hasCustomItemIconSize = true;
            updateMenuView(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        updateMenuView(false);
    }

    public void setItemMaxLines(int i5) {
        this.itemMaxLines = i5;
        updateMenuView(false);
    }

    public void setItemTextAppearance(int i5) {
        this.textAppearance = i5;
        updateMenuView(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z5) {
        this.textAppearanceActiveBoldEnabled = z5;
        updateMenuView(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.textColor = colorStateList;
        updateMenuView(false);
    }

    public void setItemVerticalPadding(int i5) {
        this.itemVerticalPadding = i5;
        updateMenuView(false);
    }

    public void setOverScrollMode(int i5) {
        this.overScrollMode = i5;
        NavigationMenuView navigationMenuView = this.menuView;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i5);
        }
    }

    public void setSubheaderColor(ColorStateList colorStateList) {
        this.subheaderColor = colorStateList;
        updateMenuView(false);
    }

    public void setSubheaderInsetEnd(int i5) {
        this.subheaderInsetEnd = i5;
        updateMenuView(false);
    }

    public void setSubheaderInsetStart(int i5) {
        this.subheaderInsetStart = i5;
        updateMenuView(false);
    }

    public void setSubheaderTextAppearance(int i5) {
        this.subheaderTextAppearance = i5;
        updateMenuView(false);
    }

    public void setUpdateSuspended(boolean z5) {
        c cVar = this.adapter;
        if (cVar != null) {
            cVar.m6924(z5);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        c cVar = this.adapter;
        if (cVar != null) {
            cVar.m6926();
        }
    }
}
