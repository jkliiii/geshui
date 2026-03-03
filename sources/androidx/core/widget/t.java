package androidx.core.widget;

import android.widget.ListView;

/* compiled from: ListViewAutoScrollHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class t extends a {

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final ListView f3143;

    public t(ListView listView) {
        super(listView);
        this.f3143 = listView;
    }

    @Override // androidx.core.widget.a
    /* renamed from: ʻ */
    public boolean mo3519(int i5) {
        return false;
    }

    @Override // androidx.core.widget.a
    /* renamed from: ʼ */
    public boolean mo3520(int i5) {
        ListView listView = this.f3143;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i6 = firstVisiblePosition + childCount;
        if (i5 > 0) {
            if (i6 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i5 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    /* renamed from: ˋ */
    public void mo3522(int i5, int i6) {
        u.m3658(this.f3143, i6);
    }
}
