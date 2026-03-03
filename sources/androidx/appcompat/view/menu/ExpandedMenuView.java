package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.d3;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class ExpandedMenuView extends ListView implements g.b, n, AdapterView.OnItemClickListener {

    /* renamed from: ˆ, reason: contains not printable characters */
    private static final int[] f771 = {R.attr.background, R.attr.divider};

    /* renamed from: ʾ, reason: contains not printable characters */
    private g f772;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f773;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public int getWindowAnimations() {
        return this.f773;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initialize(g gVar) {
        this.f772 = gVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i5, long j5) {
        mo885((i) getAdapter().getItem(i5));
    }

    @Override // androidx.appcompat.view.menu.g.b
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo885(i iVar) {
        return this.f772.performItemAction(iVar, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        d3 m1181 = d3.m1181(context, attributeSet, f771, i5, 0);
        if (m1181.m1200(0)) {
            setBackgroundDrawable(m1181.m1188(0));
        }
        if (m1181.m1200(1)) {
            setDivider(m1181.m1188(1));
        }
        m1181.m1201();
    }
}
