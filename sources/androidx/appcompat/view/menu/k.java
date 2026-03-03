package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuPopup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private Rect f926;

    k() {
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected static int m982(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = listAdapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i8, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i5) {
                return i5;
            }
            if (measuredWidth > i6) {
                i6 = measuredWidth;
            }
        }
        return i6;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    protected static boolean m983(g gVar) {
        int size = gVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = gVar.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    protected static f m984(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
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
    public int getId() {
        return 0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m984(listAdapter).f873.performItemAction((MenuItem) listAdapter.getItem(i5), this, mo922() ? 0 : 4);
    }

    /* renamed from: ʽ */
    public abstract void mo921(g gVar);

    /* renamed from: ʾ */
    protected boolean mo922() {
        return true;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public Rect m985() {
        return this.f926;
    }

    /* renamed from: ˉ */
    public abstract void mo924(View view);

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m986(Rect rect) {
        this.f926 = rect;
    }

    /* renamed from: ˋ */
    public abstract void mo925(boolean z5);

    /* renamed from: ˎ */
    public abstract void mo926(int i5);

    /* renamed from: ˏ */
    public abstract void mo927(int i5);

    /* renamed from: ˑ */
    public abstract void mo928(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: י */
    public abstract void mo929(boolean z5);

    /* renamed from: ـ */
    public abstract void mo930(int i5);

    @Override // androidx.appcompat.view.menu.m
    public void initForMenu(Context context, g gVar) {
    }
}
