package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import q.d;
import q.e;
import r.b;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private static m f1725;

    /* renamed from: ʾ, reason: contains not printable characters */
    SparseArray<View> f1726;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ArrayList<d> f1727;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected q.f f1728;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f1729;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f1730;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f1731;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f1732;

    /* renamed from: ˎ, reason: contains not printable characters */
    protected boolean f1733;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f1734;

    /* renamed from: ˑ, reason: contains not printable characters */
    private f f1735;

    /* renamed from: י, reason: contains not printable characters */
    protected e f1736;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f1737;

    /* renamed from: ٴ, reason: contains not printable characters */
    private HashMap<String, Integer> f1738;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f1739;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f1740;

    /* renamed from: ᵎ, reason: contains not printable characters */
    int f1741;

    /* renamed from: ᵔ, reason: contains not printable characters */
    int f1742;

    /* renamed from: ᵢ, reason: contains not printable characters */
    int f1743;

    /* renamed from: ⁱ, reason: contains not printable characters */
    int f1744;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private SparseArray<q.e> f1745;

    /* renamed from: ﹶ, reason: contains not printable characters */
    c f1746;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private int f1747;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private int f1748;

    static /* synthetic */ class a {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f1749;

        static {
            int[] iArr = new int[e.b.values().length];
            f1749 = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1749[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1749[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1749[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class c implements b.InterfaceC0152b {

        /* renamed from: ʻ, reason: contains not printable characters */
        ConstraintLayout f1826;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f1827;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f1828;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f1829;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f1830;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f1831;

        /* renamed from: ˈ, reason: contains not printable characters */
        int f1832;

        public c(ConstraintLayout constraintLayout) {
            this.f1826 = constraintLayout;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean m1811(int i5, int i6, int i7) {
            if (i5 == i6) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i5);
            View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i7 == size;
            }
            return false;
        }

        @Override // r.b.InterfaceC0152b
        /* renamed from: ʻ, reason: contains not printable characters */
        public final void mo1812() {
            int childCount = this.f1826.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = this.f1826.getChildAt(i5);
                if (childAt instanceof j) {
                    ((j) childAt).m1886(this.f1826);
                }
            }
            int size = this.f1826.f1727.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    ((d) this.f1826.f1727.get(i6)).m1834(this.f1826);
                }
            }
        }

        @Override // r.b.InterfaceC0152b
        @SuppressLint({"WrongCall"})
        /* renamed from: ʼ, reason: contains not printable characters */
        public final void mo1813(q.e eVar, b.a aVar) {
            int makeMeasureSpec;
            int makeMeasureSpec2;
            int baseline;
            int max;
            int i5;
            int i6;
            int i7;
            if (eVar == null) {
                return;
            }
            if (eVar.m11322() == 8 && !eVar.m11232()) {
                aVar.f10679 = 0;
                aVar.f10680 = 0;
                aVar.f10681 = 0;
                return;
            }
            if (eVar.m11294() == null) {
                return;
            }
            e.b bVar = aVar.f10675;
            e.b bVar2 = aVar.f10676;
            int i8 = aVar.f10677;
            int i9 = aVar.f10678;
            int i10 = this.f1827 + this.f1828;
            int i11 = this.f1829;
            View view = (View) eVar.m11314();
            int[] iArr = a.f1749;
            int i12 = iArr[bVar.ordinal()];
            if (i12 == 1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else if (i12 == 2) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1831, i11, -2);
            } else if (i12 == 3) {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1831, i11 + eVar.m11313(), -1);
            } else if (i12 != 4) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1831, i11, -2);
                boolean z5 = eVar.f10498 == 1;
                int i13 = aVar.f10684;
                if (i13 == b.a.f10673 || i13 == b.a.f10674) {
                    if (aVar.f10684 == b.a.f10674 || !z5 || (z5 && (view.getMeasuredHeight() == eVar.m11323())) || (view instanceof j) || eVar.mo11174()) {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.m11309(), 1073741824);
                    }
                }
            }
            int i14 = iArr[bVar2.ordinal()];
            if (i14 == 1) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else if (i14 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1832, i10, -2);
            } else if (i14 == 3) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1832, i10 + eVar.m11320(), -1);
            } else if (i14 != 4) {
                makeMeasureSpec2 = 0;
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f1832, i10, -2);
                boolean z6 = eVar.f10500 == 1;
                int i15 = aVar.f10684;
                if (i15 == b.a.f10673 || i15 == b.a.f10674) {
                    if (aVar.f10684 == b.a.f10674 || !z6 || (z6 && (view.getMeasuredWidth() == eVar.m11309())) || (view instanceof j) || eVar.mo11175()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.m11323(), 1073741824);
                    }
                }
            }
            q.f fVar = (q.f) eVar.m11294();
            if (fVar != null && q.k.m11433(ConstraintLayout.this.f1734, 256) && view.getMeasuredWidth() == eVar.m11309() && view.getMeasuredWidth() < fVar.m11309() && view.getMeasuredHeight() == eVar.m11323() && view.getMeasuredHeight() < fVar.m11323() && view.getBaseline() == eVar.m11308() && !eVar.m11235()) {
                if (m1811(eVar.m11221(), makeMeasureSpec, eVar.m11309()) && m1811(eVar.m11267(), makeMeasureSpec2, eVar.m11323())) {
                    aVar.f10679 = eVar.m11309();
                    aVar.f10680 = eVar.m11323();
                    aVar.f10681 = eVar.m11308();
                    return;
                }
            }
            e.b bVar3 = e.b.MATCH_CONSTRAINT;
            boolean z7 = bVar == bVar3;
            boolean z8 = bVar2 == bVar3;
            e.b bVar4 = e.b.MATCH_PARENT;
            boolean z9 = bVar2 == bVar4 || bVar2 == e.b.FIXED;
            boolean z10 = bVar == bVar4 || bVar == e.b.FIXED;
            boolean z11 = z7 && eVar.f10423 > 0.0f;
            boolean z12 = z8 && eVar.f10423 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i16 = aVar.f10684;
            if (i16 != b.a.f10673 && i16 != b.a.f10674 && z7 && eVar.f10498 == 0 && z8 && eVar.f10500 == 0) {
                i7 = -1;
                i6 = 0;
                baseline = 0;
                max = 0;
            } else {
                if ((view instanceof n) && (eVar instanceof q.l)) {
                    ((n) view).mo1744((q.l) eVar, makeMeasureSpec, makeMeasureSpec2);
                } else {
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                }
                eVar.m11266(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i17 = eVar.f10503;
                max = i17 > 0 ? Math.max(i17, measuredWidth) : measuredWidth;
                int i18 = eVar.f10487;
                if (i18 > 0) {
                    max = Math.min(i18, max);
                }
                int i19 = eVar.f10417;
                if (i19 > 0) {
                    i6 = Math.max(i19, measuredHeight);
                    i5 = makeMeasureSpec;
                } else {
                    i5 = makeMeasureSpec;
                    i6 = measuredHeight;
                }
                int i20 = eVar.f10459;
                if (i20 > 0) {
                    i6 = Math.min(i20, i6);
                }
                if (!q.k.m11433(ConstraintLayout.this.f1734, 1)) {
                    if (z11 && z9) {
                        max = (int) ((i6 * eVar.f10423) + 0.5f);
                    } else if (z12 && z10) {
                        i6 = (int) ((max / eVar.f10423) + 0.5f);
                    }
                }
                if (measuredWidth != max || measuredHeight != i6) {
                    int makeMeasureSpec3 = measuredWidth != max ? View.MeasureSpec.makeMeasureSpec(max, 1073741824) : i5;
                    if (measuredHeight != i6) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    }
                    view.measure(makeMeasureSpec3, makeMeasureSpec2);
                    eVar.m11266(makeMeasureSpec3, makeMeasureSpec2);
                    max = view.getMeasuredWidth();
                    i6 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i7 = -1;
            }
            boolean z13 = baseline != i7;
            aVar.f10683 = (max == aVar.f10677 && i6 == aVar.f10678) ? false : true;
            if (bVar5.f1760) {
                z13 = true;
            }
            if (z13 && baseline != -1 && eVar.m11308() != baseline) {
                aVar.f10683 = true;
            }
            aVar.f10679 = max;
            aVar.f10680 = i6;
            aVar.f10682 = z13;
            aVar.f10681 = baseline;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m1814(int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f1827 = i7;
            this.f1828 = i8;
            this.f1829 = i9;
            this.f1830 = i10;
            this.f1831 = i5;
            this.f1832 = i6;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1726 = new SparseArray<>();
        this.f1727 = new ArrayList<>(4);
        this.f1728 = new q.f();
        this.f1729 = 0;
        this.f1730 = 0;
        this.f1731 = Integer.MAX_VALUE;
        this.f1732 = Integer.MAX_VALUE;
        this.f1733 = true;
        this.f1734 = 257;
        this.f1735 = null;
        this.f1736 = null;
        this.f1737 = -1;
        this.f1738 = new HashMap<>();
        this.f1739 = -1;
        this.f1740 = -1;
        this.f1741 = -1;
        this.f1742 = -1;
        this.f1743 = 0;
        this.f1744 = 0;
        this.f1745 = new SparseArray<>();
        this.f1746 = new c(this);
        this.f1747 = 0;
        this.f1748 = 0;
        m1794(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    public static m getSharedValues() {
        if (f1725 == null) {
            f1725 = new m();
        }
        return f1725;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private final q.e m1793(int i5) {
        if (i5 == 0) {
            return this.f1728;
        }
        View view = this.f1726.get(i5);
        if (view == null && (view = findViewById(i5)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1728;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f1775;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m1794(AttributeSet attributeSet, int i5, int i6) {
        this.f1728.m11246(this);
        this.f1728.m11354(this.f1746);
        this.f1726.put(getId(), this);
        this.f1735 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f2101, i5, i6);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == l.f2113) {
                    this.f1729 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1729);
                } else if (index == l.f2114) {
                    this.f1730 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1730);
                } else if (index == l.f2111) {
                    this.f1731 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1731);
                } else if (index == l.f2112) {
                    this.f1732 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1732);
                } else if (index == l.f2206) {
                    this.f1734 = obtainStyledAttributes.getInt(index, this.f1734);
                } else if (index == l.f2145) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1772(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1736 = null;
                        }
                    }
                } else if (index == l.f2121) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        f fVar = new f();
                        this.f1735 = fVar;
                        fVar.m1862(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1735 = null;
                    }
                    this.f1737 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1728.m11355(this.f1734);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m1795() {
        this.f1733 = true;
        this.f1739 = -1;
        this.f1740 = -1;
        this.f1741 = -1;
        this.f1742 = -1;
        this.f1743 = 0;
        this.f1744 = 0;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private void m1796() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            q.e m1804 = m1804(getChildAt(i5));
            if (m1804 != null) {
                m1804.mo11240();
            }
        }
        if (isInEditMode) {
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    m1808(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1793(childAt.getId()).m11247(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1737 != -1) {
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt2 = getChildAt(i7);
                if (childAt2.getId() == this.f1737 && (childAt2 instanceof g)) {
                    this.f1735 = ((g) childAt2).getConstraintSet();
                }
            }
        }
        f fVar = this.f1735;
        if (fVar != null) {
            fVar.m1857(this, true);
        }
        this.f1728.m11458();
        int size = this.f1727.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.f1727.get(i8).m1836(this);
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = getChildAt(i9);
            if (childAt3 instanceof j) {
                ((j) childAt3).m1887(this);
            }
        }
        this.f1745.clear();
        this.f1745.put(0, this.f1728);
        this.f1745.put(getId(), this.f1728);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = getChildAt(i10);
            this.f1745.put(childAt4.getId(), m1804(childAt4));
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt5 = getChildAt(i11);
            q.e m18042 = m1804(childAt5);
            if (m18042 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1728.m11455(m18042);
                m1799(isInEditMode, childAt5, m18042, bVar, this.f1745);
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private void m1797(q.e eVar, b bVar, SparseArray<q.e> sparseArray, int i5, d.b bVar2) {
        View view = this.f1726.get(i5);
        q.e eVar2 = sparseArray.get(i5);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.f1760 = true;
        d.b bVar3 = d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.f1760 = true;
            bVar4.f1775.m11255(true);
        }
        eVar.mo11306(bVar3).m11193(eVar2.mo11306(bVar2), bVar.f1780, bVar.f1751, true);
        eVar.m11255(true);
        eVar.mo11306(d.b.TOP).m11208();
        eVar.mo11306(d.b.BOTTOM).m11208();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean m1798() {
        int childCount = getChildCount();
        boolean z5 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            if (getChildAt(i5).isLayoutRequested()) {
                z5 = true;
                break;
            }
            i5++;
        }
        if (z5) {
            m1796();
        }
        return z5;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<d> arrayList = this.f1727;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                this.f1727.get(i5).m1835(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i7 = (int) ((parseInt / 1080.0f) * width);
                        int i8 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f5 = i7;
                        float f6 = i8;
                        float f7 = i7 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f5, f6, f7, f6, paint);
                        float parseInt4 = i8 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f7, f6, f7, parseInt4, paint);
                        canvas.drawLine(f7, parseInt4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f5, f6, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f5, f6, f7, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f7, f6, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        m1795();
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.f1732;
    }

    public int getMaxWidth() {
        return this.f1731;
    }

    public int getMinHeight() {
        return this.f1730;
    }

    public int getMinWidth() {
        return this.f1729;
    }

    public int getOptimizationLevel() {
        return this.f1728.m11344();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1728.f10482 == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1728.f10482 = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1728.f10482 = "parent";
            }
        }
        if (this.f1728.m11316() == null) {
            q.f fVar = this.f1728;
            fVar.m11247(fVar.f10482);
            Log.v("ConstraintLayout", " setDebugName " + this.f1728.m11316());
        }
        Iterator<q.e> it = this.f1728.m11456().iterator();
        while (it.hasNext()) {
            q.e next = it.next();
            View view = (View) next.m11314();
            if (view != null) {
                if (next.f10482 == null && (id = view.getId()) != -1) {
                    next.f10482 = getContext().getResources().getResourceEntryName(id);
                }
                if (next.m11316() == null) {
                    next.m11247(next.f10482);
                    Log.v("ConstraintLayout", " setDebugName " + next.m11316());
                }
            }
        }
        this.f1728.mo11300(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            b bVar = (b) childAt.getLayoutParams();
            q.e eVar = bVar.f1775;
            if ((childAt.getVisibility() != 8 || bVar.f1761 || bVar.f1762 || bVar.f1764 || isInEditMode) && !bVar.f1763) {
                int m11324 = eVar.m11324();
                int m11222 = eVar.m11222();
                int m11309 = eVar.m11309() + m11324;
                int m11323 = eVar.m11323() + m11222;
                childAt.layout(m11324, m11222, m11309, m11323);
                if ((childAt instanceof j) && (content = ((j) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m11324, m11222, m11309, m11323);
                }
            }
        }
        int size = this.f1727.size();
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                this.f1727.get(i10).m1833(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.f1747 == i5) {
            int i7 = this.f1748;
        }
        if (!this.f1733) {
            int childCount = getChildCount();
            int i8 = 0;
            while (true) {
                if (i8 >= childCount) {
                    break;
                }
                if (getChildAt(i8).isLayoutRequested()) {
                    this.f1733 = true;
                    break;
                }
                i8++;
            }
        }
        boolean z5 = this.f1733;
        this.f1747 = i5;
        this.f1748 = i6;
        this.f1728.m11357(m1805());
        if (this.f1733) {
            this.f1733 = false;
            if (m1798()) {
                this.f1728.m11359();
            }
        }
        m1807(this.f1728, this.f1734, i5, i6);
        m1806(i5, i6, this.f1728.m11309(), this.f1728.m11323(), this.f1728.m11351(), this.f1728.m11349());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        q.e m1804 = m1804(view);
        if ((view instanceof i) && !(m1804 instanceof q.h)) {
            b bVar = (b) view.getLayoutParams();
            q.h hVar = new q.h();
            bVar.f1775 = hVar;
            bVar.f1761 = true;
            hVar.m11426(bVar.f1753);
        }
        if (view instanceof d) {
            d dVar = (d) view;
            dVar.m1837();
            ((b) view.getLayoutParams()).f1762 = true;
            if (!this.f1727.contains(dVar)) {
                this.f1727.add(dVar);
            }
        }
        this.f1726.put(view.getId(), view);
        this.f1733 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1726.remove(view.getId());
        this.f1728.m11457(m1804(view));
        this.f1727.remove(view);
        this.f1733 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        m1795();
        super.requestLayout();
    }

    public void setConstraintSet(f fVar) {
        this.f1735 = fVar;
    }

    @Override // android.view.View
    public void setId(int i5) {
        this.f1726.remove(getId());
        super.setId(i5);
        this.f1726.put(getId(), this);
    }

    public void setMaxHeight(int i5) {
        if (i5 == this.f1732) {
            return;
        }
        this.f1732 = i5;
        requestLayout();
    }

    public void setMaxWidth(int i5) {
        if (i5 == this.f1731) {
            return;
        }
        this.f1731 = i5;
        requestLayout();
    }

    public void setMinHeight(int i5) {
        if (i5 == this.f1730) {
            return;
        }
        this.f1730 = i5;
        requestLayout();
    }

    public void setMinWidth(int i5) {
        if (i5 == this.f1729) {
            return;
        }
        this.f1729 = i5;
        requestLayout();
    }

    public void setOnConstraintsChanged(h hVar) {
        e eVar = this.f1736;
        if (eVar != null) {
            eVar.m1840(hVar);
        }
    }

    public void setOptimizationLevel(int i5) {
        this.f1734 = i5;
        this.f1728.m11355(i5);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected void m1799(boolean z5, View view, q.e eVar, b bVar, SparseArray<q.e> sparseArray) {
        q.e eVar2;
        q.e eVar3;
        q.e eVar4;
        q.e eVar5;
        int i5;
        bVar.m1810();
        bVar.f1777 = false;
        eVar.m11281(view.getVisibility());
        if (bVar.f1763) {
            eVar.m11264(true);
            eVar.m11281(8);
        }
        eVar.m11246(view);
        if (view instanceof d) {
            ((d) view).mo1743(eVar, this.f1728.m11350());
        }
        if (bVar.f1761) {
            q.h hVar = (q.h) eVar;
            int i6 = bVar.f1772;
            int i7 = bVar.f1773;
            float f5 = bVar.f1774;
            if (f5 != -1.0f) {
                hVar.m11425(f5);
                return;
            } else if (i6 != -1) {
                hVar.m11423(i6);
                return;
            } else {
                if (i7 != -1) {
                    hVar.m11424(i7);
                    return;
                }
                return;
            }
        }
        int i8 = bVar.f1765;
        int i9 = bVar.f1766;
        int i10 = bVar.f1767;
        int i11 = bVar.f1768;
        int i12 = bVar.f1769;
        int i13 = bVar.f1770;
        float f6 = bVar.f1771;
        int i14 = bVar.f1805;
        if (i14 != -1) {
            q.e eVar6 = sparseArray.get(i14);
            if (eVar6 != null) {
                eVar.m11301(eVar6, bVar.f1809, bVar.f1807);
            }
        } else {
            if (i8 != -1) {
                q.e eVar7 = sparseArray.get(i8);
                if (eVar7 != null) {
                    d.b bVar2 = d.b.LEFT;
                    eVar.m11228(bVar2, eVar7, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i12);
                }
            } else if (i9 != -1 && (eVar2 = sparseArray.get(i9)) != null) {
                eVar.m11228(d.b.LEFT, eVar2, d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i12);
            }
            if (i10 != -1) {
                q.e eVar8 = sparseArray.get(i10);
                if (eVar8 != null) {
                    eVar.m11228(d.b.RIGHT, eVar8, d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i13);
                }
            } else if (i11 != -1 && (eVar3 = sparseArray.get(i11)) != null) {
                d.b bVar3 = d.b.RIGHT;
                eVar.m11228(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i13);
            }
            int i15 = bVar.f1791;
            if (i15 != -1) {
                q.e eVar9 = sparseArray.get(i15);
                if (eVar9 != null) {
                    d.b bVar4 = d.b.TOP;
                    eVar.m11228(bVar4, eVar9, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f1821);
                }
            } else {
                int i16 = bVar.f1793;
                if (i16 != -1 && (eVar4 = sparseArray.get(i16)) != null) {
                    eVar.m11228(d.b.TOP, eVar4, d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f1821);
                }
            }
            int i17 = bVar.f1795;
            if (i17 != -1) {
                q.e eVar10 = sparseArray.get(i17);
                if (eVar10 != null) {
                    eVar.m11228(d.b.BOTTOM, eVar10, d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f1824);
                }
            } else {
                int i18 = bVar.f1797;
                if (i18 != -1 && (eVar5 = sparseArray.get(i18)) != null) {
                    d.b bVar5 = d.b.BOTTOM;
                    eVar.m11228(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f1824);
                }
            }
            int i19 = bVar.f1799;
            if (i19 != -1) {
                m1797(eVar, bVar, sparseArray, i19, d.b.BASELINE);
            } else {
                int i20 = bVar.f1801;
                if (i20 != -1) {
                    m1797(eVar, bVar, sparseArray, i20, d.b.TOP);
                } else {
                    int i21 = bVar.f1803;
                    if (i21 != -1) {
                        m1797(eVar, bVar, sparseArray, i21, d.b.BOTTOM);
                    }
                }
            }
            if (f6 >= 0.0f) {
                eVar.m11257(f6);
            }
            float f7 = bVar.f1804;
            if (f7 >= 0.0f) {
                eVar.m11275(f7);
            }
        }
        if (z5 && ((i5 = bVar.f1822) != -1 || bVar.f1752 != -1)) {
            eVar.m11273(i5, bVar.f1752);
        }
        if (bVar.f1758) {
            eVar.m11260(e.b.FIXED);
            eVar.m11282(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.m11260(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f1754) {
                eVar.m11260(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.m11260(e.b.MATCH_PARENT);
            }
            eVar.mo11306(d.b.LEFT).f10401 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.mo11306(d.b.RIGHT).f10401 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.m11260(e.b.MATCH_CONSTRAINT);
            eVar.m11282(0);
        }
        if (bVar.f1759) {
            eVar.m11278(e.b.FIXED);
            eVar.m11256(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.m11278(e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f1755) {
                eVar.m11278(e.b.MATCH_CONSTRAINT);
            } else {
                eVar.m11278(e.b.MATCH_PARENT);
            }
            eVar.mo11306(d.b.TOP).f10401 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.mo11306(d.b.BOTTOM).f10401 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.m11278(e.b.MATCH_CONSTRAINT);
            eVar.m11256(0);
        }
        eVar.m11248(bVar.f1786);
        eVar.m11262(bVar.f1794);
        eVar.m11280(bVar.f1792);
        eVar.m11258(bVar.f1798);
        eVar.m11276(bVar.f1796);
        eVar.m11283(bVar.f1757);
        eVar.m11261(bVar.f1800, bVar.f1802, bVar.f1816, bVar.f1820);
        eVar.m11279(bVar.f1814, bVar.f1812, bVar.f1818, bVar.f1806);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public Object m1802(int i5, Object obj) {
        if (i5 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1738;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1738.get(str);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public View m1803(int i5) {
        return this.f1726.get(i5);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final q.e m1804(View view) {
        if (view == this) {
            return this.f1728;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1775;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof b) {
            return ((b) view.getLayoutParams()).f1775;
        }
        return null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected boolean m1805() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* renamed from: ˑ */
    protected void mo1772(int i5) {
        this.f1736 = new e(getContext(), this, i5);
    }

    /* renamed from: י, reason: contains not printable characters */
    protected void m1806(int i5, int i6, int i7, int i8, boolean z5, boolean z6) {
        c cVar = this.f1746;
        int i9 = cVar.f1830;
        int resolveSizeAndState = View.resolveSizeAndState(i7 + cVar.f1829, i5, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i8 + i9, i6, 0) & 16777215;
        int min = Math.min(this.f1731, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1732, resolveSizeAndState2);
        if (z5) {
            min |= 16777216;
        }
        if (z6) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f1739 = min;
        this.f1740 = min2;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    protected void m1807(q.f fVar, int i5, int i6, int i7) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i7);
        int size2 = View.MeasureSpec.getSize(i7);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i8 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1746.m1814(i6, i7, max, max2, paddingWidth, i8);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        int max5 = (max3 > 0 || max4 > 0) ? m1805() ? max4 : max3 : Math.max(0, getPaddingLeft());
        int i9 = size - paddingWidth;
        int i10 = size2 - i8;
        m1809(fVar, mode, i9, mode2, i10);
        fVar.m11352(i5, mode, i9, mode2, i10, this.f1739, this.f1740, max5, max);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m1808(int i5, Object obj, Object obj2) {
        if (i5 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1738 == null) {
                this.f1738 = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1738.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[PHI: r2
  0x003e: PHI (r2v4 q.e$b) = (r2v3 q.e$b), (r2v0 q.e$b) binds: [B:21:0x004a, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ᴵ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m1809(q.f r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            androidx.constraintlayout.widget.ConstraintLayout$c r0 = r7.f1746
            int r1 = r0.f1830
            int r0 = r0.f1829
            q.e$b r2 = q.e.b.FIXED
            int r3 = r7.getChildCount()
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            if (r9 == r5) goto L2e
            if (r9 == 0) goto L23
            if (r9 == r4) goto L1a
            r9 = r2
        L18:
            r10 = 0
            goto L38
        L1a:
            int r9 = r7.f1731
            int r9 = r9 - r0
            int r10 = java.lang.Math.min(r9, r10)
            r9 = r2
            goto L38
        L23:
            q.e$b r9 = q.e.b.WRAP_CONTENT
            if (r3 != 0) goto L18
            int r10 = r7.f1729
            int r10 = java.lang.Math.max(r6, r10)
            goto L38
        L2e:
            q.e$b r9 = q.e.b.WRAP_CONTENT
            if (r3 != 0) goto L38
            int r10 = r7.f1729
            int r10 = java.lang.Math.max(r6, r10)
        L38:
            if (r11 == r5) goto L53
            if (r11 == 0) goto L48
            if (r11 == r4) goto L40
        L3e:
            r12 = 0
            goto L5d
        L40:
            int r11 = r7.f1732
            int r11 = r11 - r1
            int r12 = java.lang.Math.min(r11, r12)
            goto L5d
        L48:
            q.e$b r2 = q.e.b.WRAP_CONTENT
            if (r3 != 0) goto L3e
            int r11 = r7.f1730
            int r12 = java.lang.Math.max(r6, r11)
            goto L5d
        L53:
            q.e$b r2 = q.e.b.WRAP_CONTENT
            if (r3 != 0) goto L5d
            int r11 = r7.f1730
            int r12 = java.lang.Math.max(r6, r11)
        L5d:
            int r11 = r8.m11309()
            if (r10 != r11) goto L69
            int r11 = r8.m11323()
            if (r12 == r11) goto L6c
        L69:
            r8.m11348()
        L6c:
            r8.m11284(r6)
            r8.m11285(r6)
            int r11 = r7.f1731
            int r11 = r11 - r0
            r8.m11269(r11)
            int r11 = r7.f1732
            int r11 = r11 - r1
            r8.m11268(r11)
            r8.m11272(r6)
            r8.m11271(r6)
            r8.m11260(r9)
            r8.m11282(r10)
            r8.m11278(r2)
            r8.m11256(r12)
            int r9 = r7.f1729
            int r9 = r9 - r0
            r8.m11272(r9)
            int r9 = r7.f1730
            int r9 = r9 - r1
            r8.m11271(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1809(q.f, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1726 = new SparseArray<>();
        this.f1727 = new ArrayList<>(4);
        this.f1728 = new q.f();
        this.f1729 = 0;
        this.f1730 = 0;
        this.f1731 = Integer.MAX_VALUE;
        this.f1732 = Integer.MAX_VALUE;
        this.f1733 = true;
        this.f1734 = 257;
        this.f1735 = null;
        this.f1736 = null;
        this.f1737 = -1;
        this.f1738 = new HashMap<>();
        this.f1739 = -1;
        this.f1740 = -1;
        this.f1741 = -1;
        this.f1742 = -1;
        this.f1743 = 0;
        this.f1744 = 0;
        this.f1745 = new SparseArray<>();
        this.f1746 = new c(this);
        this.f1747 = 0;
        this.f1748 = 0;
        m1794(attributeSet, i5, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: ʻ, reason: contains not printable characters */
        public int f1750;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        public int f1751;

        /* renamed from: ʻʼ, reason: contains not printable characters */
        public int f1752;

        /* renamed from: ʻʽ, reason: contains not printable characters */
        public int f1753;

        /* renamed from: ʻʾ, reason: contains not printable characters */
        public boolean f1754;

        /* renamed from: ʻʿ, reason: contains not printable characters */
        public boolean f1755;

        /* renamed from: ʻˆ, reason: contains not printable characters */
        public String f1756;

        /* renamed from: ʻˈ, reason: contains not printable characters */
        public int f1757;

        /* renamed from: ʻˉ, reason: contains not printable characters */
        boolean f1758;

        /* renamed from: ʻˊ, reason: contains not printable characters */
        boolean f1759;

        /* renamed from: ʻˋ, reason: contains not printable characters */
        boolean f1760;

        /* renamed from: ʻˎ, reason: contains not printable characters */
        boolean f1761;

        /* renamed from: ʻˏ, reason: contains not printable characters */
        boolean f1762;

        /* renamed from: ʻˑ, reason: contains not printable characters */
        boolean f1763;

        /* renamed from: ʻי, reason: contains not printable characters */
        boolean f1764;

        /* renamed from: ʻـ, reason: contains not printable characters */
        int f1765;

        /* renamed from: ʻٴ, reason: contains not printable characters */
        int f1766;

        /* renamed from: ʻᐧ, reason: contains not printable characters */
        int f1767;

        /* renamed from: ʻᴵ, reason: contains not printable characters */
        int f1768;

        /* renamed from: ʻᵎ, reason: contains not printable characters */
        int f1769;

        /* renamed from: ʻᵔ, reason: contains not printable characters */
        int f1770;

        /* renamed from: ʻᵢ, reason: contains not printable characters */
        float f1771;

        /* renamed from: ʻⁱ, reason: contains not printable characters */
        int f1772;

        /* renamed from: ʻﹳ, reason: contains not printable characters */
        int f1773;

        /* renamed from: ʻﹶ, reason: contains not printable characters */
        float f1774;

        /* renamed from: ʻﾞ, reason: contains not printable characters */
        q.e f1775;

        /* renamed from: ʼ, reason: contains not printable characters */
        public int f1776;

        /* renamed from: ʼʻ, reason: contains not printable characters */
        public boolean f1777;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        boolean f1778;

        /* renamed from: ʽ, reason: contains not printable characters */
        public float f1779;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        public int f1780;

        /* renamed from: ʾ, reason: contains not printable characters */
        public boolean f1781;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        public float f1782;

        /* renamed from: ʿ, reason: contains not printable characters */
        public int f1783;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        boolean f1784;

        /* renamed from: ˆ, reason: contains not printable characters */
        public int f1785;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        public String f1786;

        /* renamed from: ˈ, reason: contains not printable characters */
        public int f1787;

        /* renamed from: ˈˈ, reason: contains not printable characters */
        int f1788;

        /* renamed from: ˉ, reason: contains not printable characters */
        public int f1789;

        /* renamed from: ˉˉ, reason: contains not printable characters */
        float f1790;

        /* renamed from: ˊ, reason: contains not printable characters */
        public int f1791;

        /* renamed from: ˊˊ, reason: contains not printable characters */
        public float f1792;

        /* renamed from: ˋ, reason: contains not printable characters */
        public int f1793;

        /* renamed from: ˋˋ, reason: contains not printable characters */
        public float f1794;

        /* renamed from: ˎ, reason: contains not printable characters */
        public int f1795;

        /* renamed from: ˎˎ, reason: contains not printable characters */
        public int f1796;

        /* renamed from: ˏ, reason: contains not printable characters */
        public int f1797;

        /* renamed from: ˏˏ, reason: contains not printable characters */
        public int f1798;

        /* renamed from: ˑ, reason: contains not printable characters */
        public int f1799;

        /* renamed from: ˑˑ, reason: contains not printable characters */
        public int f1800;

        /* renamed from: י, reason: contains not printable characters */
        public int f1801;

        /* renamed from: יי, reason: contains not printable characters */
        public int f1802;

        /* renamed from: ـ, reason: contains not printable characters */
        public int f1803;

        /* renamed from: ــ, reason: contains not printable characters */
        public float f1804;

        /* renamed from: ٴ, reason: contains not printable characters */
        public int f1805;

        /* renamed from: ٴٴ, reason: contains not printable characters */
        public float f1806;

        /* renamed from: ᐧ, reason: contains not printable characters */
        public int f1807;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        public int f1808;

        /* renamed from: ᴵ, reason: contains not printable characters */
        public float f1809;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        public int f1810;

        /* renamed from: ᵎ, reason: contains not printable characters */
        public int f1811;

        /* renamed from: ᵎᵎ, reason: contains not printable characters */
        public int f1812;

        /* renamed from: ᵔ, reason: contains not printable characters */
        public int f1813;

        /* renamed from: ᵔᵔ, reason: contains not printable characters */
        public int f1814;

        /* renamed from: ᵢ, reason: contains not printable characters */
        public int f1815;

        /* renamed from: ᵢᵢ, reason: contains not printable characters */
        public int f1816;

        /* renamed from: ⁱ, reason: contains not printable characters */
        public int f1817;

        /* renamed from: ⁱⁱ, reason: contains not printable characters */
        public int f1818;

        /* renamed from: ﹳ, reason: contains not printable characters */
        public int f1819;

        /* renamed from: ﹳﹳ, reason: contains not printable characters */
        public float f1820;

        /* renamed from: ﹶ, reason: contains not printable characters */
        public int f1821;

        /* renamed from: ﹶﹶ, reason: contains not printable characters */
        public int f1822;

        /* renamed from: ﾞ, reason: contains not printable characters */
        public int f1823;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        public int f1824;

        private static class a {

            /* renamed from: ʻ, reason: contains not printable characters */
            public static final SparseIntArray f1825;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1825 = sparseIntArray;
                sparseIntArray.append(l.f2190, 64);
                sparseIntArray.append(l.f2166, 65);
                sparseIntArray.append(l.f2175, 8);
                sparseIntArray.append(l.f2176, 9);
                sparseIntArray.append(l.f2178, 10);
                sparseIntArray.append(l.f2179, 11);
                sparseIntArray.append(l.f2186, 12);
                sparseIntArray.append(l.f2185, 13);
                sparseIntArray.append(l.f2154, 14);
                sparseIntArray.append(l.f2153, 15);
                sparseIntArray.append(l.f2149, 16);
                sparseIntArray.append(l.f2151, 52);
                sparseIntArray.append(l.f2150, 53);
                sparseIntArray.append(l.f2155, 2);
                sparseIntArray.append(l.f2157, 3);
                sparseIntArray.append(l.f2156, 4);
                sparseIntArray.append(l.f2196, 49);
                sparseIntArray.append(l.f2197, 50);
                sparseIntArray.append(l.f2162, 5);
                sparseIntArray.append(l.f2163, 6);
                sparseIntArray.append(l.f2165, 7);
                sparseIntArray.append(l.f2144, 67);
                sparseIntArray.append(l.f2102, 1);
                sparseIntArray.append(l.f2180, 17);
                sparseIntArray.append(l.f2181, 18);
                sparseIntArray.append(l.f2161, 19);
                sparseIntArray.append(l.f2160, 20);
                sparseIntArray.append(l.f2201, 21);
                sparseIntArray.append(l.f2204, 22);
                sparseIntArray.append(l.f2202, 23);
                sparseIntArray.append(l.f2199, 24);
                sparseIntArray.append(l.f2203, 25);
                sparseIntArray.append(l.f2200, 26);
                sparseIntArray.append(l.f2198, 55);
                sparseIntArray.append(l.f2205, 54);
                sparseIntArray.append(l.f2171, 29);
                sparseIntArray.append(l.f2187, 30);
                sparseIntArray.append(l.f2159, 44);
                sparseIntArray.append(l.f2173, 45);
                sparseIntArray.append(l.f2189, 46);
                sparseIntArray.append(l.f2172, 47);
                sparseIntArray.append(l.f2188, 48);
                sparseIntArray.append(l.f2147, 27);
                sparseIntArray.append(l.f2146, 28);
                sparseIntArray.append(l.f2192, 31);
                sparseIntArray.append(l.f2167, 32);
                sparseIntArray.append(l.f2194, 33);
                sparseIntArray.append(l.f2193, 34);
                sparseIntArray.append(l.f2195, 35);
                sparseIntArray.append(l.f2169, 36);
                sparseIntArray.append(l.f2168, 37);
                sparseIntArray.append(l.f2170, 38);
                sparseIntArray.append(l.f2174, 39);
                sparseIntArray.append(l.f2183, 40);
                sparseIntArray.append(l.f2177, 41);
                sparseIntArray.append(l.f2152, 42);
                sparseIntArray.append(l.f2148, 43);
                sparseIntArray.append(l.f2182, 51);
                sparseIntArray.append(l.f2207, 66);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1750 = -1;
            this.f1776 = -1;
            this.f1779 = -1.0f;
            this.f1781 = true;
            this.f1783 = -1;
            this.f1785 = -1;
            this.f1787 = -1;
            this.f1789 = -1;
            this.f1791 = -1;
            this.f1793 = -1;
            this.f1795 = -1;
            this.f1797 = -1;
            this.f1799 = -1;
            this.f1801 = -1;
            this.f1803 = -1;
            this.f1805 = -1;
            this.f1807 = 0;
            this.f1809 = 0.0f;
            this.f1811 = -1;
            this.f1813 = -1;
            this.f1815 = -1;
            this.f1817 = -1;
            this.f1819 = RecyclerView.UNDEFINED_DURATION;
            this.f1821 = RecyclerView.UNDEFINED_DURATION;
            this.f1823 = RecyclerView.UNDEFINED_DURATION;
            this.f1824 = RecyclerView.UNDEFINED_DURATION;
            this.f1808 = RecyclerView.UNDEFINED_DURATION;
            this.f1810 = RecyclerView.UNDEFINED_DURATION;
            this.f1751 = RecyclerView.UNDEFINED_DURATION;
            this.f1780 = 0;
            this.f1778 = true;
            this.f1784 = true;
            this.f1782 = 0.5f;
            this.f1804 = 0.5f;
            this.f1786 = null;
            this.f1790 = 0.0f;
            this.f1788 = 1;
            this.f1794 = -1.0f;
            this.f1792 = -1.0f;
            this.f1798 = 0;
            this.f1796 = 0;
            this.f1800 = 0;
            this.f1814 = 0;
            this.f1802 = 0;
            this.f1812 = 0;
            this.f1816 = 0;
            this.f1818 = 0;
            this.f1820 = 1.0f;
            this.f1806 = 1.0f;
            this.f1822 = -1;
            this.f1752 = -1;
            this.f1753 = -1;
            this.f1754 = false;
            this.f1755 = false;
            this.f1756 = null;
            this.f1757 = 0;
            this.f1758 = true;
            this.f1759 = true;
            this.f1760 = false;
            this.f1761 = false;
            this.f1762 = false;
            this.f1763 = false;
            this.f1764 = false;
            this.f1765 = -1;
            this.f1766 = -1;
            this.f1767 = -1;
            this.f1768 = -1;
            this.f1769 = RecyclerView.UNDEFINED_DURATION;
            this.f1770 = RecyclerView.UNDEFINED_DURATION;
            this.f1771 = 0.5f;
            this.f1775 = new q.e();
            this.f1777 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2101);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                int i6 = a.f1825.get(index);
                switch (i6) {
                    case 1:
                        this.f1753 = obtainStyledAttributes.getInt(index, this.f1753);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1805);
                        this.f1805 = resourceId;
                        if (resourceId == -1) {
                            this.f1805 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f1807 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1807);
                        break;
                    case 4:
                        float f5 = obtainStyledAttributes.getFloat(index, this.f1809) % 360.0f;
                        this.f1809 = f5;
                        if (f5 < 0.0f) {
                            this.f1809 = (360.0f - f5) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f1750 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1750);
                        break;
                    case 6:
                        this.f1776 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1776);
                        break;
                    case 7:
                        this.f1779 = obtainStyledAttributes.getFloat(index, this.f1779);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1783);
                        this.f1783 = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1783 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1785);
                        this.f1785 = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1785 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1787);
                        this.f1787 = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1787 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1789);
                        this.f1789 = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1789 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1791);
                        this.f1791 = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1791 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1793);
                        this.f1793 = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1793 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1795);
                        this.f1795 = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1795 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1797);
                        this.f1797 = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1797 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1799);
                        this.f1799 = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1799 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1811);
                        this.f1811 = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1811 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1813);
                        this.f1813 = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1813 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1815);
                        this.f1815 = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1815 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1817);
                        this.f1817 = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1817 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f1819 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1819);
                        break;
                    case 22:
                        this.f1821 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1821);
                        break;
                    case 23:
                        this.f1823 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1823);
                        break;
                    case 24:
                        this.f1824 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1824);
                        break;
                    case 25:
                        this.f1808 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1808);
                        break;
                    case 26:
                        this.f1810 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1810);
                        break;
                    case 27:
                        this.f1754 = obtainStyledAttributes.getBoolean(index, this.f1754);
                        break;
                    case 28:
                        this.f1755 = obtainStyledAttributes.getBoolean(index, this.f1755);
                        break;
                    case 29:
                        this.f1782 = obtainStyledAttributes.getFloat(index, this.f1782);
                        break;
                    case 30:
                        this.f1804 = obtainStyledAttributes.getFloat(index, this.f1804);
                        break;
                    case 31:
                        int i7 = obtainStyledAttributes.getInt(index, 0);
                        this.f1800 = i7;
                        if (i7 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i8 = obtainStyledAttributes.getInt(index, 0);
                        this.f1814 = i8;
                        if (i8 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f1802 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1802);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1802) == -2) {
                                this.f1802 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f1816 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1816);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1816) == -2) {
                                this.f1816 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f1820 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1820));
                        this.f1800 = 2;
                        break;
                    case 36:
                        try {
                            this.f1812 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1812);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1812) == -2) {
                                this.f1812 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f1818 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1818);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1818) == -2) {
                                this.f1818 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f1806 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1806));
                        this.f1814 = 2;
                        break;
                    default:
                        switch (i6) {
                            case 44:
                                f.m1853(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f1794 = obtainStyledAttributes.getFloat(index, this.f1794);
                                break;
                            case 46:
                                this.f1792 = obtainStyledAttributes.getFloat(index, this.f1792);
                                break;
                            case 47:
                                this.f1798 = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f1796 = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f1822 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1822);
                                break;
                            case 50:
                                this.f1752 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1752);
                                break;
                            case 51:
                                this.f1756 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f1801);
                                this.f1801 = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f1801 = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f1803);
                                this.f1803 = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f1803 = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                this.f1780 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1780);
                                break;
                            case 55:
                                this.f1751 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1751);
                                break;
                            default:
                                switch (i6) {
                                    case 64:
                                        f.m1851(this, obtainStyledAttributes, index, 0);
                                        this.f1778 = true;
                                        break;
                                    case 65:
                                        f.m1851(this, obtainStyledAttributes, index, 1);
                                        this.f1784 = true;
                                        break;
                                    case 66:
                                        this.f1757 = obtainStyledAttributes.getInt(index, this.f1757);
                                        break;
                                    case 67:
                                        this.f1781 = obtainStyledAttributes.getBoolean(index, this.f1781);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m1810();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1810() {
            this.f1761 = false;
            this.f1758 = true;
            this.f1759 = true;
            int i5 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i5 == -2 && this.f1754) {
                this.f1758 = false;
                if (this.f1800 == 0) {
                    this.f1800 = 1;
                }
            }
            int i6 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i6 == -2 && this.f1755) {
                this.f1759 = false;
                if (this.f1814 == 0) {
                    this.f1814 = 1;
                }
            }
            if (i5 == 0 || i5 == -1) {
                this.f1758 = false;
                if (i5 == 0 && this.f1800 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1754 = true;
                }
            }
            if (i6 == 0 || i6 == -1) {
                this.f1759 = false;
                if (i6 == 0 && this.f1814 == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1755 = true;
                }
            }
            if (this.f1779 == -1.0f && this.f1750 == -1 && this.f1776 == -1) {
                return;
            }
            this.f1761 = true;
            this.f1758 = true;
            this.f1759 = true;
            if (!(this.f1775 instanceof q.h)) {
                this.f1775 = new q.h();
            }
            ((q.h) this.f1775).m11426(this.f1753);
        }

        public b(int i5, int i6) {
            super(i5, i6);
            this.f1750 = -1;
            this.f1776 = -1;
            this.f1779 = -1.0f;
            this.f1781 = true;
            this.f1783 = -1;
            this.f1785 = -1;
            this.f1787 = -1;
            this.f1789 = -1;
            this.f1791 = -1;
            this.f1793 = -1;
            this.f1795 = -1;
            this.f1797 = -1;
            this.f1799 = -1;
            this.f1801 = -1;
            this.f1803 = -1;
            this.f1805 = -1;
            this.f1807 = 0;
            this.f1809 = 0.0f;
            this.f1811 = -1;
            this.f1813 = -1;
            this.f1815 = -1;
            this.f1817 = -1;
            this.f1819 = RecyclerView.UNDEFINED_DURATION;
            this.f1821 = RecyclerView.UNDEFINED_DURATION;
            this.f1823 = RecyclerView.UNDEFINED_DURATION;
            this.f1824 = RecyclerView.UNDEFINED_DURATION;
            this.f1808 = RecyclerView.UNDEFINED_DURATION;
            this.f1810 = RecyclerView.UNDEFINED_DURATION;
            this.f1751 = RecyclerView.UNDEFINED_DURATION;
            this.f1780 = 0;
            this.f1778 = true;
            this.f1784 = true;
            this.f1782 = 0.5f;
            this.f1804 = 0.5f;
            this.f1786 = null;
            this.f1790 = 0.0f;
            this.f1788 = 1;
            this.f1794 = -1.0f;
            this.f1792 = -1.0f;
            this.f1798 = 0;
            this.f1796 = 0;
            this.f1800 = 0;
            this.f1814 = 0;
            this.f1802 = 0;
            this.f1812 = 0;
            this.f1816 = 0;
            this.f1818 = 0;
            this.f1820 = 1.0f;
            this.f1806 = 1.0f;
            this.f1822 = -1;
            this.f1752 = -1;
            this.f1753 = -1;
            this.f1754 = false;
            this.f1755 = false;
            this.f1756 = null;
            this.f1757 = 0;
            this.f1758 = true;
            this.f1759 = true;
            this.f1760 = false;
            this.f1761 = false;
            this.f1762 = false;
            this.f1763 = false;
            this.f1764 = false;
            this.f1765 = -1;
            this.f1766 = -1;
            this.f1767 = -1;
            this.f1768 = -1;
            this.f1769 = RecyclerView.UNDEFINED_DURATION;
            this.f1770 = RecyclerView.UNDEFINED_DURATION;
            this.f1771 = 0.5f;
            this.f1775 = new q.e();
            this.f1777 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1750 = -1;
            this.f1776 = -1;
            this.f1779 = -1.0f;
            this.f1781 = true;
            this.f1783 = -1;
            this.f1785 = -1;
            this.f1787 = -1;
            this.f1789 = -1;
            this.f1791 = -1;
            this.f1793 = -1;
            this.f1795 = -1;
            this.f1797 = -1;
            this.f1799 = -1;
            this.f1801 = -1;
            this.f1803 = -1;
            this.f1805 = -1;
            this.f1807 = 0;
            this.f1809 = 0.0f;
            this.f1811 = -1;
            this.f1813 = -1;
            this.f1815 = -1;
            this.f1817 = -1;
            this.f1819 = RecyclerView.UNDEFINED_DURATION;
            this.f1821 = RecyclerView.UNDEFINED_DURATION;
            this.f1823 = RecyclerView.UNDEFINED_DURATION;
            this.f1824 = RecyclerView.UNDEFINED_DURATION;
            this.f1808 = RecyclerView.UNDEFINED_DURATION;
            this.f1810 = RecyclerView.UNDEFINED_DURATION;
            this.f1751 = RecyclerView.UNDEFINED_DURATION;
            this.f1780 = 0;
            this.f1778 = true;
            this.f1784 = true;
            this.f1782 = 0.5f;
            this.f1804 = 0.5f;
            this.f1786 = null;
            this.f1790 = 0.0f;
            this.f1788 = 1;
            this.f1794 = -1.0f;
            this.f1792 = -1.0f;
            this.f1798 = 0;
            this.f1796 = 0;
            this.f1800 = 0;
            this.f1814 = 0;
            this.f1802 = 0;
            this.f1812 = 0;
            this.f1816 = 0;
            this.f1818 = 0;
            this.f1820 = 1.0f;
            this.f1806 = 1.0f;
            this.f1822 = -1;
            this.f1752 = -1;
            this.f1753 = -1;
            this.f1754 = false;
            this.f1755 = false;
            this.f1756 = null;
            this.f1757 = 0;
            this.f1758 = true;
            this.f1759 = true;
            this.f1760 = false;
            this.f1761 = false;
            this.f1762 = false;
            this.f1763 = false;
            this.f1764 = false;
            this.f1765 = -1;
            this.f1766 = -1;
            this.f1767 = -1;
            this.f1768 = -1;
            this.f1769 = RecyclerView.UNDEFINED_DURATION;
            this.f1770 = RecyclerView.UNDEFINED_DURATION;
            this.f1771 = 0.5f;
            this.f1775 = new q.e();
            this.f1777 = false;
        }
    }
}
