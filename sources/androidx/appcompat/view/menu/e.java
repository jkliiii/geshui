package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    Context f861;

    /* renamed from: ʿ, reason: contains not printable characters */
    LayoutInflater f862;

    /* renamed from: ˆ, reason: contains not printable characters */
    g f863;

    /* renamed from: ˈ, reason: contains not printable characters */
    ExpandedMenuView f864;

    /* renamed from: ˉ, reason: contains not printable characters */
    int f865;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f866;

    /* renamed from: ˋ, reason: contains not printable characters */
    int f867;

    /* renamed from: ˎ, reason: contains not printable characters */
    private m.a f868;

    /* renamed from: ˏ, reason: contains not printable characters */
    a f869;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f870;

    /* compiled from: ListMenuPresenter.java */
    private class a extends BaseAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private int f871 = -1;

        public a() {
            m938();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f863.getNonActionItems().size() - e.this.f865;
            return this.f871 < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f862.inflate(eVar.f867, viewGroup, false);
            }
            ((n.a) view).initialize(getItem(i5), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m938();
            super.notifyDataSetChanged();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m938() {
            i expandedItem = e.this.f863.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<i> nonActionItems = e.this.f863.getNonActionItems();
                int size = nonActionItems.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (nonActionItems.get(i5) == expandedItem) {
                        this.f871 = i5;
                        return;
                    }
                }
            }
            this.f871 = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public i getItem(int i5) {
            ArrayList<i> nonActionItems = e.this.f863.getNonActionItems();
            int i6 = i5 + e.this.f865;
            int i7 = this.f871;
            if (i7 >= 0 && i6 >= i7) {
                i6++;
            }
            return nonActionItems.get(i6);
        }
    }

    public e(Context context, int i5) {
        this(i5, 0);
        this.f861 = context;
        this.f862 = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean collapseItemActionView(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean expandItemActionView(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public int getId() {
        return this.f870;
    }

    @Override // androidx.appcompat.view.menu.m
    public void initForMenu(Context context, g gVar) {
        if (this.f866 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f866);
            this.f861 = contextThemeWrapper;
            this.f862 = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f861 != null) {
            this.f861 = context;
            if (this.f862 == null) {
                this.f862 = LayoutInflater.from(context);
            }
        }
        this.f863 = gVar;
        a aVar = this.f869;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void onCloseMenu(g gVar, boolean z5) {
        m.a aVar = this.f868;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z5);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        this.f863.performItemAction(this.f869.getItem(i5), this, 0);
    }

    @Override // androidx.appcompat.view.menu.m
    public void onRestoreInstanceState(Parcelable parcelable) {
        m936((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable onSaveInstanceState() {
        if (this.f864 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        m937(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean onSubMenuSelected(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).m945(null);
        m.a aVar = this.f868;
        if (aVar == null) {
            return true;
        }
        aVar.mo527(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void setCallback(m.a aVar) {
        this.f868 = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        a aVar = this.f869;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public ListAdapter m934() {
        if (this.f869 == null) {
            this.f869 = new a();
        }
        return this.f869;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public n m935(ViewGroup viewGroup) {
        if (this.f864 == null) {
            this.f864 = (ExpandedMenuView) this.f862.inflate(e.g.f7045, viewGroup, false);
            if (this.f869 == null) {
                this.f869 = new a();
            }
            this.f864.setAdapter((ListAdapter) this.f869);
            this.f864.setOnItemClickListener(this);
        }
        return this.f864;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m936(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f864.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m937(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f864;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public e(int i5, int i6) {
        this.f867 = i5;
        this.f866 = i6;
    }
}
