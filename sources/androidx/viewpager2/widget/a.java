package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;

/* compiled from: ViewPager2.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a extends ViewGroup {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Rect f4782;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Rect f4783;

    /* renamed from: ˆ, reason: contains not printable characters */
    int f4784;

    /* renamed from: ˈ, reason: contains not printable characters */
    boolean f4785;

    /* renamed from: ˉ, reason: contains not printable characters */
    LinearLayoutManager f4786;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f4787;

    /* renamed from: ˋ, reason: contains not printable characters */
    private Parcelable f4788;

    /* renamed from: ˎ, reason: contains not printable characters */
    RecyclerView f4789;

    /* renamed from: ˏ, reason: contains not printable characters */
    private j f4790;

    /* renamed from: ˑ, reason: contains not printable characters */
    private RecyclerView.m f4791;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f4792;

    /* renamed from: ـ, reason: contains not printable characters */
    private boolean f4793;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f4794;

    /* compiled from: ViewPager2.java */
    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0067a {
    }

    /* compiled from: ViewPager2.java */
    public interface b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ʽ, reason: contains not printable characters */
    private void m5620() {
        RecyclerView.h adapter;
        if (this.f4787 == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f4788;
        if (parcelable != null) {
            if (adapter instanceof t0.a) {
                ((t0.a) adapter).m12024(parcelable);
            }
            this.f4788 = null;
        }
        int max = Math.max(0, Math.min(this.f4787, adapter.mo4807() - 1));
        this.f4784 = max;
        this.f4787 = -1;
        this.f4789.scrollToPosition(max);
        throw null;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i5) {
        return this.f4789.canScrollHorizontally(i5);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i5) {
        return this.f4789.canScrollVertically(i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof c) {
            int i5 = ((c) parcelable).f4795;
            sparseArray.put(this.f4789.getId(), sparseArray.get(i5));
            sparseArray.remove(i5);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m5620();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        throw null;
    }

    public RecyclerView.h getAdapter() {
        return this.f4789.getAdapter();
    }

    public int getCurrentItem() {
        return this.f4784;
    }

    public int getItemDecorationCount() {
        return this.f4789.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f4794;
    }

    public int getOrientation() {
        return this.f4786.getOrientation() == 1 ? 1 : 0;
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f4789;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        throw null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int measuredWidth = this.f4789.getMeasuredWidth();
        int measuredHeight = this.f4789.getMeasuredHeight();
        this.f4782.left = getPaddingLeft();
        this.f4782.right = (i7 - i5) - getPaddingRight();
        this.f4782.top = getPaddingTop();
        this.f4782.bottom = (i8 - i6) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f4782, this.f4783);
        RecyclerView recyclerView = this.f4789;
        Rect rect = this.f4783;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f4785) {
            m5626();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        measureChild(this.f4789, i5, i6);
        int measuredWidth = this.f4789.getMeasuredWidth();
        int measuredHeight = this.f4789.getMeasuredHeight();
        int measuredState = this.f4789.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i5, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i6, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f4787 = cVar.f4796;
        this.f4788 = cVar.f4797;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f4795 = this.f4789.getId();
        int i5 = this.f4787;
        if (i5 == -1) {
            i5 = this.f4784;
        }
        cVar.f4796 = i5;
        Parcelable parcelable = this.f4788;
        if (parcelable != null) {
            cVar.f4797 = parcelable;
        } else {
            Object adapter = this.f4789.getAdapter();
            if (adapter instanceof t0.a) {
                cVar.f4797 = ((t0.a) adapter).m12023();
            }
        }
        return cVar;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(a.class.getSimpleName() + " does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i5, Bundle bundle) {
        throw null;
    }

    public void setAdapter(RecyclerView.h hVar) {
        this.f4789.getAdapter();
        throw null;
    }

    public void setCurrentItem(int i5) {
        m5623(i5, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i5) {
        super.setLayoutDirection(i5);
        throw null;
    }

    public void setOffscreenPageLimit(int i5) {
        if (i5 < 1 && i5 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f4794 = i5;
        this.f4789.requestLayout();
    }

    public void setOrientation(int i5) {
        this.f4786.setOrientation(i5);
        throw null;
    }

    public void setPageTransformer(b bVar) {
        if (bVar != null) {
            if (!this.f4792) {
                this.f4791 = this.f4789.getItemAnimator();
                this.f4792 = true;
            }
            this.f4789.setItemAnimator(null);
            throw null;
        }
        if (!this.f4792) {
            throw null;
        }
        this.f4789.setItemAnimator(this.f4791);
        this.f4791 = null;
        this.f4792 = false;
        throw null;
    }

    public void setUserInputEnabled(boolean z5) {
        this.f4793 = z5;
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean m5621() {
        throw null;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m5622(AbstractC0067a abstractC0067a) {
        throw null;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m5623(int i5, boolean z5) {
        if (m5621()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        m5624(i5, z5);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    void m5624(int i5, boolean z5) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f4787 != -1) {
                this.f4787 = Math.max(i5, 0);
            }
        } else {
            if (adapter.mo4807() <= 0) {
                return;
            }
            int min = Math.min(Math.max(i5, 0), adapter.mo4807() - 1);
            int i6 = this.f4784;
            if (min == i6) {
                throw null;
            }
            if (min == i6 && z5) {
                return;
            }
            this.f4784 = min;
            throw null;
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m5625(AbstractC0067a abstractC0067a) {
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    void m5626() {
        j jVar = this.f4790;
        if (jVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View findSnapView = jVar.findSnapView(this.f4786);
        if (findSnapView == null) {
            return;
        }
        if (this.f4786.getPosition(findSnapView) != this.f4784 && getScrollState() == 0) {
            throw null;
        }
        this.f4785 = false;
    }

    /* compiled from: ViewPager2.java */
    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new C0068a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4795;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4796;

        /* renamed from: ˆ, reason: contains not printable characters */
        Parcelable f4797;

        /* compiled from: ViewPager2.java */
        /* renamed from: androidx.viewpager2.widget.a$c$a, reason: collision with other inner class name */
        class C0068a implements Parcelable.ClassLoaderCreator<c> {
            C0068a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new c(parcel, classLoader) : new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public c[] newArray(int i5) {
                return new c[i5];
            }
        }

        @SuppressLint({"ClassVerificationFailure"})
        c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m5627(parcel, classLoader);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m5627(Parcel parcel, ClassLoader classLoader) {
            this.f4795 = parcel.readInt();
            this.f4796 = parcel.readInt();
            this.f4797 = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f4795);
            parcel.writeInt(this.f4796);
            parcel.writeParcelable(this.f4797, i5);
        }

        c(Parcel parcel) {
            super(parcel);
            m5627(parcel, null);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
