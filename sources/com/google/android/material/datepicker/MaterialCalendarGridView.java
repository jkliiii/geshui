package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: E:\78999\cookie_5123796.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Calendar f5619;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final boolean f5620;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2643(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m6670(int i5, Rect rect) {
        if (i5 == 33) {
            setSelection(getAdapter().m6756());
        } else if (i5 == 130) {
            setSelection(getAdapter().m6749());
        } else {
            super.onFocusChanged(true, i5, rect);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private View m6671(int i5) {
        return getChildAt(i5 - getFirstVisiblePosition());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static int m6672(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static boolean m6673(Long l5, Long l6, Long l7, Long l8) {
        return l5 == null || l6 == null || l7 == null || l8 == null || l7.longValue() > l6.longValue() || l8.longValue() < l5.longValue();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m6748;
        int m6672;
        int m67482;
        int m66722;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        n adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f5694;
        b bVar = adapter.f5696;
        int max = Math.max(adapter.m6749(), getFirstVisiblePosition());
        int min = Math.min(adapter.m6756(), getLastVisiblePosition());
        Long item = adapter.getItem(max);
        Long item2 = adapter.getItem(min);
        Iterator<androidx.core.util.d<Long, Long>> it = dateSelector.getSelectedRanges().iterator();
        while (it.hasNext()) {
            androidx.core.util.d<Long, Long> next = it.next();
            Long l5 = next.f2843;
            if (l5 == null) {
                materialCalendarGridView = this;
            } else if (next.f2844 != null) {
                long longValue = l5.longValue();
                long longValue2 = next.f2844.longValue();
                if (!m6673(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                    boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
                    if (longValue < item.longValue()) {
                        m6672 = adapter.m6753(max) ? 0 : !isLayoutRtl ? materialCalendarGridView.m6671(max - 1).getRight() : materialCalendarGridView.m6671(max - 1).getLeft();
                        m6748 = max;
                    } else {
                        materialCalendarGridView.f5619.setTimeInMillis(longValue);
                        m6748 = adapter.m6748(materialCalendarGridView.f5619.get(5));
                        m6672 = m6672(materialCalendarGridView.m6671(m6748));
                    }
                    if (longValue2 > item2.longValue()) {
                        m66722 = adapter.m6754(min) ? getWidth() : !isLayoutRtl ? materialCalendarGridView.m6671(min).getRight() : materialCalendarGridView.m6671(min).getLeft();
                        m67482 = min;
                    } else {
                        materialCalendarGridView.f5619.setTimeInMillis(longValue2);
                        m67482 = adapter.m6748(materialCalendarGridView.f5619.get(5));
                        m66722 = m6672(materialCalendarGridView.m6671(m67482));
                    }
                    int itemId = (int) adapter.getItemId(m6748);
                    int i7 = max;
                    int i8 = min;
                    int itemId2 = (int) adapter.getItemId(m67482);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        n nVar = adapter;
                        int numColumns2 = (numColumns + getNumColumns()) - 1;
                        View m6671 = materialCalendarGridView.m6671(numColumns);
                        int top2 = m6671.getTop() + bVar.f5657.m6696();
                        Iterator<androidx.core.util.d<Long, Long>> it2 = it;
                        int bottom = m6671.getBottom() - bVar.f5657.m6695();
                        if (isLayoutRtl) {
                            int i9 = m67482 > numColumns2 ? 0 : m66722;
                            int width = numColumns > m6748 ? getWidth() : m6672;
                            i5 = i9;
                            i6 = width;
                        } else {
                            i5 = numColumns > m6748 ? 0 : m6672;
                            i6 = m67482 > numColumns2 ? getWidth() : m66722;
                        }
                        canvas.drawRect(i5, top2, i6, bottom, bVar.f5664);
                        itemId++;
                        materialCalendarGridView = this;
                        itemId2 = itemId2;
                        adapter = nVar;
                        it = it2;
                    }
                    materialCalendarGridView = this;
                    max = i7;
                    min = i8;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z5, int i5, Rect rect) {
        if (z5) {
            m6670(i5, rect);
        } else {
            super.onFocusChanged(false, i5, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i5, KeyEvent keyEvent) {
        if (!super.onKeyDown(i5, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m6749()) {
            return true;
        }
        if (19 != i5) {
            return false;
        }
        setSelection(getAdapter().m6749());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i5, int i6) {
        if (!this.f5620) {
            super.onMeasure(i5, i6);
            return;
        }
        super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i5) {
        if (i5 < getAdapter().m6749()) {
            super.setSelection(getAdapter().m6749());
        } else {
            super.setSelection(i5);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public n getAdapter() {
        return (n) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f5619 = w.m6786();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f5620 = MaterialDatePicker.isNestedScrollable(getContext());
        f1.m2830(this, new a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof n)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), n.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
