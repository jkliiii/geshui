package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.graphics.g0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CarouselLayoutManager extends RecyclerView.p implements com.google.android.material.carousel.b, RecyclerView.a0.b {
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private CarouselStrategy carouselStrategy;
    private int currentFillStartPosition;
    private e currentKeylineState;
    private final c debugItemDecoration;
    private boolean isDebuggingEnabled;
    private f keylineStateList;
    private Map<Integer, e> keylineStatePositionMap;
    int maxScroll;
    int minScroll;
    private com.google.android.material.carousel.c orientationHelper;
    int scrollOffset;

    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        /* renamed from: ʻ */
        public PointF mo4742(int i5) {
            return CarouselLayoutManager.this.computeScrollVectorForPosition(i5);
        }

        @Override // androidx.recyclerview.widget.g
        /* renamed from: ᵔ */
        public int mo5154(View view, int i5) {
            if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
        }

        @Override // androidx.recyclerview.widget.g
        /* renamed from: ᵢ */
        public int mo5155(View view, int i5) {
            if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
        }
    }

    private static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        final View f5413;

        /* renamed from: ʼ, reason: contains not printable characters */
        final float f5414;

        /* renamed from: ʽ, reason: contains not printable characters */
        final float f5415;

        /* renamed from: ʾ, reason: contains not printable characters */
        final d f5416;

        b(View view, float f5, float f6, d dVar) {
            this.f5413 = view;
            this.f5414 = f5;
            this.f5415 = f6;
            this.f5416 = dVar;
        }
    }

    private static class c extends RecyclerView.o {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Paint f5417;

        /* renamed from: ʼ, reason: contains not printable characters */
        private List<e.c> f5418;

        c() {
            Paint paint = new Paint();
            this.f5417 = paint;
            this.f5418 = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            super.onDrawOver(canvas, recyclerView, b0Var);
            this.f5417.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (e.c cVar : this.f5418) {
                this.f5417.setColor(g0.m2271(-65281, -16776961, cVar.f5446));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(cVar.f5445, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), cVar.f5445, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.f5417);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), cVar.f5445, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), cVar.f5445, this.f5417);
                }
            }
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m6354(List<e.c> list) {
            this.f5418 = Collections.unmodifiableList(list);
        }
    }

    private static class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        final e.c f5419;

        /* renamed from: ʼ, reason: contains not printable characters */
        final e.c f5420;

        d(e.c cVar, e.c cVar2) {
            androidx.core.util.h.m2577(cVar.f5444 <= cVar2.f5444);
            this.f5419 = cVar;
            this.f5420 = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i5, b bVar) {
        float m6388 = this.currentKeylineState.m6388() / 2.0f;
        addView(view, i5);
        float f5 = bVar.f5415;
        this.orientationHelper.mo6375(view, (int) (f5 - m6388), (int) (f5 + m6388));
        updateChildMaskForLocation(view, bVar.f5414, bVar.f5416);
    }

    private int addEnd(int i5, int i6) {
        return isLayoutRtl() ? i5 - i6 : i5 + i6;
    }

    private int addStart(int i5, int i6) {
        return isLayoutRtl() ? i5 + i6 : i5 - i6;
    }

    private void addViewsEnd(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i5) {
        int calculateChildStartForFill = calculateChildStartForFill(i5);
        while (i5 < b0Var.m4766()) {
            b makeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill, i5);
            if (isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.f5415, makeChildCalculations.f5416)) {
                return;
            }
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.m6388());
            if (!isLocOffsetOutOfFillBoundsStart(makeChildCalculations.f5415, makeChildCalculations.f5416)) {
                addAndLayoutView(makeChildCalculations.f5413, -1, makeChildCalculations);
            }
            i5++;
        }
    }

    private void addViewsStart(RecyclerView.w wVar, int i5) {
        int calculateChildStartForFill = calculateChildStartForFill(i5);
        while (i5 >= 0) {
            b makeChildCalculations = makeChildCalculations(wVar, calculateChildStartForFill, i5);
            if (isLocOffsetOutOfFillBoundsStart(makeChildCalculations.f5415, makeChildCalculations.f5416)) {
                return;
            }
            calculateChildStartForFill = addStart(calculateChildStartForFill, (int) this.currentKeylineState.m6388());
            if (!isLocOffsetOutOfFillBoundsEnd(makeChildCalculations.f5415, makeChildCalculations.f5416)) {
                addAndLayoutView(makeChildCalculations.f5413, 0, makeChildCalculations);
            }
            i5--;
        }
    }

    private float calculateChildOffsetCenterForLocation(View view, float f5, d dVar) {
        e.c cVar = dVar.f5419;
        float f6 = cVar.f5445;
        e.c cVar2 = dVar.f5420;
        float lerp = AnimationUtils.lerp(f6, cVar2.f5445, cVar.f5444, cVar2.f5444, f5);
        if (dVar.f5420 != this.currentKeylineState.m6387() && dVar.f5419 != this.currentKeylineState.m6392()) {
            return lerp;
        }
        float mo6367 = this.orientationHelper.mo6367((RecyclerView.q) view.getLayoutParams()) / this.currentKeylineState.m6388();
        e.c cVar3 = dVar.f5420;
        return lerp + ((f5 - cVar3.f5444) * ((1.0f - cVar3.f5446) + mo6367));
    }

    private int calculateChildStartForFill(int i5) {
        return addEnd(getParentStart() - this.scrollOffset, (int) (this.currentKeylineState.m6388() * i5));
    }

    private int calculateEndScroll(RecyclerView.b0 b0Var, f fVar) {
        boolean isLayoutRtl = isLayoutRtl();
        e m6419 = isLayoutRtl ? fVar.m6419() : fVar.m6415();
        e.c m6385 = isLayoutRtl ? m6419.m6385() : m6419.m6390();
        float m4766 = (((b0Var.m4766() - 1) * m6419.m6388()) + getPaddingEnd()) * (isLayoutRtl ? -1.0f : 1.0f);
        float parentStart = m6385.f5444 - getParentStart();
        float parentEnd = getParentEnd() - m6385.f5444;
        if (Math.abs(parentStart) > Math.abs(m4766)) {
            return 0;
        }
        return (int) ((m4766 - parentStart) + parentEnd);
    }

    private static int calculateShouldScrollBy(int i5, int i6, int i7, int i8) {
        int i9 = i6 + i5;
        return i9 < i7 ? i7 - i6 : i9 > i8 ? i8 - i6 : i5;
    }

    private int calculateStartScroll(f fVar) {
        boolean isLayoutRtl = isLayoutRtl();
        e m6415 = isLayoutRtl ? fVar.m6415() : fVar.m6419();
        return (int) (((getPaddingStart() * (isLayoutRtl ? 1 : -1)) + getParentStart()) - addStart((int) (isLayoutRtl ? m6415.m6390() : m6415.m6385()).f5444, (int) (m6415.m6388() / 2.0f)));
    }

    private void fill(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        removeAndRecycleOutOfBoundsViews(wVar);
        if (getChildCount() == 0) {
            addViewsStart(wVar, this.currentFillStartPosition - 1);
            addViewsEnd(wVar, b0Var, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(wVar, position - 1);
            addViewsEnd(wVar, b0Var, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private int getContainerSize() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    private float getDecoratedCenterXWithMargins(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return r0.centerX();
    }

    private e getKeylineStateForPosition(int i5) {
        e eVar;
        Map<Integer, e> map = this.keylineStatePositionMap;
        return (map == null || (eVar = map.get(Integer.valueOf(w.a.m12444(i5, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.m6414() : eVar;
    }

    private float getMaskedItemSizeForLocOffset(float f5, d dVar) {
        e.c cVar = dVar.f5419;
        float f6 = cVar.f5447;
        e.c cVar2 = dVar.f5420;
        return AnimationUtils.lerp(f6, cVar2.f5447, cVar.f5445, cVar2.f5445, f5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.mo6369();
    }

    private int getParentEnd() {
        return this.orientationHelper.mo6370();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.mo6371();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.mo6372();
    }

    private int getParentStart() {
        return this.orientationHelper.mo6373();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.mo6374();
    }

    private int getScrollOffsetForPosition(int i5, e eVar) {
        return isLayoutRtl() ? (int) (((getContainerSize() - eVar.m6390().f5444) - (i5 * eVar.m6388())) - (eVar.m6388() / 2.0f)) : (int) (((i5 * eVar.m6388()) - eVar.m6385().f5444) + (eVar.m6388() / 2.0f));
    }

    private static d getSurroundingKeylineRange(List<e.c> list, float f5, boolean z5) {
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        float f8 = Float.MAX_VALUE;
        float f9 = -3.4028235E38f;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        for (int i9 = 0; i9 < list.size(); i9++) {
            e.c cVar = list.get(i9);
            float f10 = z5 ? cVar.f5445 : cVar.f5444;
            float abs = Math.abs(f10 - f5);
            if (f10 <= f5 && abs <= f6) {
                i5 = i9;
                f6 = abs;
            }
            if (f10 > f5 && abs <= f7) {
                i7 = i9;
                f7 = abs;
            }
            if (f10 <= f8) {
                i6 = i9;
                f8 = f10;
            }
            if (f10 > f9) {
                i8 = i9;
                f9 = f10;
            }
        }
        if (i5 == -1) {
            i5 = i6;
        }
        if (i7 == -1) {
            i7 = i8;
        }
        return new d(list.get(i5), list.get(i7));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f5, d dVar) {
        int addStart = addStart((int) f5, (int) (getMaskedItemSizeForLocOffset(f5, dVar) / 2.0f));
        if (isLayoutRtl()) {
            if (addStart < 0) {
                return true;
            }
        } else if (addStart > getContainerSize()) {
            return true;
        }
        return false;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f5, d dVar) {
        int addEnd = addEnd((int) f5, (int) (getMaskedItemSizeForLocOffset(f5, dVar) / 2.0f));
        if (isLayoutRtl()) {
            if (addEnd > getContainerSize()) {
                return true;
            }
        } else if (addEnd < 0) {
            return true;
        }
        return false;
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + getDecoratedCenterXWithMargins(childAt) + ", child index:" + i5);
            }
            Log.d(TAG, "==============");
        }
    }

    private b makeChildCalculations(RecyclerView.w wVar, float f5, int i5) {
        float m6388 = this.currentKeylineState.m6388() / 2.0f;
        View m4922 = wVar.m4922(i5);
        measureChildWithMargins(m4922, 0, 0);
        float addEnd = addEnd((int) f5, (int) m6388);
        d surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.m6389(), addEnd, false);
        return new b(m4922, addEnd, calculateChildOffsetCenterForLocation(m4922, addEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private void offsetChild(View view, float f5, float f6, Rect rect) {
        float addEnd = addEnd((int) f5, (int) f6);
        d surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.m6389(), addEnd, false);
        float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, addEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, addEnd, surroundingKeylineRange);
        this.orientationHelper.mo6377(view, rect, f6, calculateChildOffsetCenterForLocation);
    }

    private void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.w wVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterXWithMargins = getDecoratedCenterXWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterXWithMargins, getSurroundingKeylineRange(this.currentKeylineState.m6389(), decoratedCenterXWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, wVar);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterXWithMargins2 = getDecoratedCenterXWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterXWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.m6389(), decoratedCenterXWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, wVar);
            }
        }
    }

    private int scrollBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (getChildCount() == 0 || i5 == 0) {
            return 0;
        }
        int calculateShouldScrollBy = calculateShouldScrollBy(i5, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += calculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset();
        float m6388 = this.currentKeylineState.m6388() / 2.0f;
        int calculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            offsetChild(getChildAt(i6), calculateChildStartForFill, m6388, rect);
            calculateChildStartForFill = addEnd(calculateChildStartForFill, (int) this.currentKeylineState.m6388());
        }
        fill(wVar, b0Var);
        return calculateShouldScrollBy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f5, d dVar) {
        if (view instanceof g) {
            e.c cVar = dVar.f5419;
            float f6 = cVar.f5446;
            e.c cVar2 = dVar.f5420;
            float lerp = AnimationUtils.lerp(f6, cVar2.f5446, cVar.f5444, cVar2.f5444, f5);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF mo6368 = this.orientationHelper.mo6368(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, lerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, lerp));
            float calculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f5, dVar);
            RectF rectF = new RectF(calculateChildOffsetCenterForLocation - (mo6368.width() / 2.0f), calculateChildOffsetCenterForLocation - (mo6368.height() / 2.0f), calculateChildOffsetCenterForLocation + (mo6368.width() / 2.0f), (mo6368.height() / 2.0f) + calculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.isContained()) {
                this.orientationHelper.mo6366(mo6368, rectF, rectF2);
            }
            this.orientationHelper.mo6376(mo6368, rectF, rectF2);
            ((g) view).setMaskRectF(mo6368);
        }
    }

    private void updateCurrentKeylineStateForScrollOffset() {
        int i5 = this.maxScroll;
        int i6 = this.minScroll;
        if (i5 <= i6) {
            this.currentKeylineState = isLayoutRtl() ? this.keylineStateList.m6415() : this.keylineStateList.m6419();
        } else {
            this.currentKeylineState = this.keylineStateList.m6417(this.scrollOffset, i6, i5);
        }
        this.debugItemDecoration.m6354(this.currentKeylineState.m6389());
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i5 = 0;
        while (i5 < getChildCount() - 1) {
            int position = getPosition(getChildAt(i5));
            int i6 = i5 + 1;
            int position2 = getPosition(getChildAt(i6));
            if (position > position2) {
                logChildrenIfDebugging();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i5 + "] had adapter position [" + position + "] and child at index [" + i6 + "] had adapter position [" + position2 + "].");
            }
            i5 = i6;
        }
    }

    int calculateScrollDeltaToMakePositionVisible(int i5) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollExtent(RecyclerView.b0 b0Var) {
        return (int) this.keylineStateList.m6414().m6388();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF computeScrollVectorForPosition(int i5) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i5, getKeylineStateForPosition(i5));
        return isHorizontal() ? new PointF(offsetToScrollToPosition, 0.0f) : new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollExtent(RecyclerView.b0 b0Var) {
        return (int) this.keylineStateList.m6414().m6388();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // com.google.android.material.carousel.b
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.b
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - getMaskedItemSizeForLocOffset(centerX, getSurroundingKeylineRange(this.currentKeylineState.m6389(), centerX, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    int getOffsetToScrollToPosition(int i5, e eVar) {
        return getScrollOffsetForPosition(i5, eVar) - this.scrollOffset;
    }

    int getOffsetToScrollToPositionForSnap(int i5, boolean z5) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i5, this.keylineStateList.m6418(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i5, getKeylineStateForPosition(i5)) : offsetToScrollToPosition;
        return (!z5 || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    public int getOrientation() {
        return this.orientationHelper.f5430;
    }

    @Override // com.google.android.material.carousel.b
    public boolean isHorizontal() {
        return this.orientationHelper.f5430 == 0;
    }

    boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void measureChildWithMargins(View view, int i5, int i6) {
        if (!(view instanceof g)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i7 = i5 + rect.left + rect.right;
        int i8 = i6 + rect.top + rect.bottom;
        f fVar = this.keylineStateList;
        float m6388 = (fVar == null || this.orientationHelper.f5430 != 0) ? ((ViewGroup.MarginLayoutParams) qVar).width : fVar.m6414().m6388();
        f fVar2 = this.keylineStateList;
        view.measure(RecyclerView.p.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i7, (int) m6388, canScrollHorizontally()), RecyclerView.p.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i8, (int) ((fVar2 == null || this.orientationHelper.f5430 != 1) ? ((ViewGroup.MarginLayoutParams) qVar).height : fVar2.m6414().m6388()), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.m4766() <= 0) {
            removeAndRecycleAllViews(wVar);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean isLayoutRtl = isLayoutRtl();
        boolean z5 = this.keylineStateList == null;
        if (z5) {
            View m4922 = wVar.m4922(0);
            measureChildWithMargins(m4922, 0, 0);
            e onFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, m4922);
            if (isLayoutRtl) {
                onFirstChildMeasuredWithMargins = e.m6384(onFirstChildMeasuredWithMargins);
            }
            this.keylineStateList = f.m6405(this, onFirstChildMeasuredWithMargins);
        }
        int calculateStartScroll = calculateStartScroll(this.keylineStateList);
        int calculateEndScroll = calculateEndScroll(b0Var, this.keylineStateList);
        int i5 = isLayoutRtl ? calculateEndScroll : calculateStartScroll;
        this.minScroll = i5;
        if (isLayoutRtl) {
            calculateEndScroll = calculateStartScroll;
        }
        this.maxScroll = calculateEndScroll;
        if (z5) {
            this.scrollOffset = calculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.m6416(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
        } else {
            int i6 = this.scrollOffset;
            this.scrollOffset = i6 + calculateShouldScrollBy(0, i6, i5, calculateEndScroll);
        }
        this.currentFillStartPosition = w.a.m12444(this.currentFillStartPosition, 0, b0Var.m4766());
        updateCurrentKeylineStateForScrollOffset();
        detachAndScrapAttachedViews(wVar);
        fill(wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
        if (this.keylineStateList == null) {
            return false;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(getPosition(view), getKeylineStateForPosition(getPosition(view)));
        if (z6 || offsetToScrollToPosition == 0) {
            return false;
        }
        recyclerView.scrollBy(offsetToScrollToPosition, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (canScrollHorizontally()) {
            return scrollBy(i5, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void scrollToPosition(int i5) {
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i5, getKeylineStateForPosition(i5));
        this.currentFillStartPosition = w.a.m12444(i5, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (canScrollVertically()) {
            return scrollBy(i5, wVar, b0Var);
        }
        return 0;
    }

    public void setCarouselStrategy(CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    public void setDebuggingEnabled(RecyclerView recyclerView, boolean z5) {
        this.isDebuggingEnabled = z5;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z5) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i5) {
        if (i5 != 0 && i5 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i5);
        }
        assertNotInLayoutOrScroll(null);
        com.google.android.material.carousel.c cVar = this.orientationHelper;
        if (cVar == null || i5 != cVar.f5430) {
            this.orientationHelper = com.google.android.material.carousel.c.m6364(this, i5);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i5) {
        a aVar = new a(recyclerView.getContext());
        aVar.m4757(i5);
        startSmoothScroll(aVar);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(CarouselStrategy carouselStrategy, int i5) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new c();
        this.currentFillStartPosition = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i5);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new c();
        this.currentFillStartPosition = 0;
        setOrientation(RecyclerView.p.getProperties(context, attributeSet, i5, i6).f4097);
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
    }
}
