package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: E:\78999\cookie_5123796.dex */
public class Barrier extends d {

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f1722;

    /* renamed from: י, reason: contains not printable characters */
    private int f1723;

    /* renamed from: ـ, reason: contains not printable characters */
    private q.a f1724;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private void m1790(q.e eVar, int i5, boolean z5) {
        this.f1723 = i5;
        if (z5) {
            int i6 = this.f1722;
            if (i6 == 5) {
                this.f1723 = 1;
            } else if (i6 == 6) {
                this.f1723 = 0;
            }
        } else {
            int i7 = this.f1722;
            if (i7 == 5) {
                this.f1723 = 0;
            } else if (i7 == 6) {
                this.f1723 = 1;
            }
        }
        if (eVar instanceof q.a) {
            ((q.a) eVar).m11183(this.f1723);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.f1724.m11177();
    }

    public int getMargin() {
        return this.f1724.m11179();
    }

    public int getType() {
        return this.f1722;
    }

    public void setAllowsGoneWidget(boolean z5) {
        this.f1724.m11182(z5);
    }

    public void setDpMargin(int i5) {
        this.f1724.m11184((int) ((i5 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i5) {
        this.f1724.m11184(i5);
    }

    public void setType(int i5) {
        this.f1722 = i5;
    }

    @Override // androidx.constraintlayout.widget.d
    /* renamed from: ˑ */
    protected void mo1742(AttributeSet attributeSet) {
        super.mo1742(attributeSet);
        this.f1724 = new q.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f2101);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2119) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2118) {
                    this.f1724.m11182(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == l.f2120) {
                    this.f1724.m11184(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1855 = this.f1724;
        m1837();
    }

    @Override // androidx.constraintlayout.widget.d
    /* renamed from: י */
    public void mo1743(q.e eVar, boolean z5) {
        m1790(eVar, this.f1722, z5);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
