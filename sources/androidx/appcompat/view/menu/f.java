package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends BaseAdapter {

    /* renamed from: ʾ, reason: contains not printable characters */
    g f873;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f874 = -1;

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean f875;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final boolean f876;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final LayoutInflater f877;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f878;

    public f(g gVar, LayoutInflater layoutInflater, boolean z5, int i5) {
        this.f876 = z5;
        this.f877 = layoutInflater;
        this.f873 = gVar;
        this.f878 = i5;
        m940();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f874 < 0 ? (this.f876 ? this.f873.getNonActionItems() : this.f873.getVisibleItems()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f877.inflate(this.f878, viewGroup, false);
        }
        int groupId = getItem(i5).getGroupId();
        int i6 = i5 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f873.isGroupDividerEnabled() && groupId != (i6 >= 0 ? getItem(i6).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f875) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.initialize(getItem(i5), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m940();
        super.notifyDataSetChanged();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    void m940() {
        i expandedItem = this.f873.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<i> nonActionItems = this.f873.getNonActionItems();
            int size = nonActionItems.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (nonActionItems.get(i5) == expandedItem) {
                    this.f874 = i5;
                    return;
                }
            }
        }
        this.f874 = -1;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public g m941() {
        return this.f873;
    }

    @Override // android.widget.Adapter
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public i getItem(int i5) {
        ArrayList<i> nonActionItems = this.f876 ? this.f873.getNonActionItems() : this.f873.getVisibleItems();
        int i6 = this.f874;
        if (i6 >= 0 && i5 >= i6) {
            i5++;
        }
        return nonActionItems.get(i5);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m943(boolean z5) {
        this.f875 = z5;
    }
}
