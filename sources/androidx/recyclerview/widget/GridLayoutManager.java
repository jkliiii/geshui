package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: E:\78999\cookie_5123796.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: ᐧ, reason: contains not printable characters */
    boolean f3976;

    /* renamed from: ᴵ, reason: contains not printable characters */
    int f3977;

    /* renamed from: ᵎ, reason: contains not printable characters */
    int[] f3978;

    /* renamed from: ᵔ, reason: contains not printable characters */
    View[] f3979;

    /* renamed from: ᵢ, reason: contains not printable characters */
    final SparseIntArray f3980;

    /* renamed from: ⁱ, reason: contains not printable characters */
    final SparseIntArray f3981;

    /* renamed from: ﹳ, reason: contains not printable characters */
    c f3982;

    /* renamed from: ﹶ, reason: contains not printable characters */
    final Rect f3983;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean f3984;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        /* renamed from: ʿ, reason: contains not printable characters */
        public int mo4675(int i5, int i6) {
            return i5 % i6;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        /* renamed from: ˆ, reason: contains not printable characters */
        public int mo4676(int i5) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final SparseIntArray f3987 = new SparseIntArray();

        /* renamed from: ʼ, reason: contains not printable characters */
        final SparseIntArray f3988 = new SparseIntArray();

        /* renamed from: ʽ, reason: contains not printable characters */
        private boolean f3989 = false;

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f3990 = false;

        /* renamed from: ʻ, reason: contains not printable characters */
        static int m4679(SparseIntArray sparseIntArray, int i5) {
            int size = sparseIntArray.size() - 1;
            int i6 = 0;
            while (i6 <= size) {
                int i7 = (i6 + size) >>> 1;
                if (sparseIntArray.keyAt(i7) < i5) {
                    i6 = i7 + 1;
                } else {
                    size = i7 - 1;
                }
            }
            int i8 = i6 - 1;
            if (i8 < 0 || i8 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i8);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        int m4680(int i5, int i6) {
            if (!this.f3990) {
                return m4682(i5, i6);
            }
            int i7 = this.f3988.get(i5, -1);
            if (i7 != -1) {
                return i7;
            }
            int m4682 = m4682(i5, i6);
            this.f3988.put(i5, m4682);
            return m4682;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        int m4681(int i5, int i6) {
            if (!this.f3989) {
                return mo4675(i5, i6);
            }
            int i7 = this.f3987.get(i5, -1);
            if (i7 != -1) {
                return i7;
            }
            int mo4675 = mo4675(i5, i6);
            this.f3987.put(i5, mo4675);
            return mo4675;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* renamed from: ʾ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int m4682(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3990
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f3988
                int r0 = m4679(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f3988
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.m4681(r0, r8)
                int r0 = r6.mo4676(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.mo4676(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.mo4676(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.m4682(int, int):int");
        }

        /* renamed from: ʿ */
        public abstract int mo4675(int i5, int i6);

        /* renamed from: ˆ */
        public abstract int mo4676(int i5);

        /* renamed from: ˈ, reason: contains not printable characters */
        public void m4683() {
            this.f3988.clear();
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public void m4684() {
            this.f3987.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.f3976 = false;
        this.f3977 = -1;
        this.f3980 = new SparseIntArray();
        this.f3981 = new SparseIntArray();
        this.f3982 = new a();
        this.f3983 = new Rect();
        m4669(RecyclerView.p.getProperties(context, attributeSet, i5, i6).f4098);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private void m4651() {
        this.f3980.clear();
        this.f3981.clear();
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private int m4652(RecyclerView.b0 b0Var) {
        if (getChildCount() != 0 && b0Var.m4766() != 0) {
            m4715();
            boolean m4723 = m4723();
            View m4718 = m4718(!m4723, true);
            View m4717 = m4717(!m4723, true);
            if (m4718 != null && m4717 != null) {
                int m4680 = this.f3982.m4680(getPosition(m4718), this.f3977);
                int m46802 = this.f3982.m4680(getPosition(m4717), this.f3977);
                int max = this.f3996 ? Math.max(0, ((this.f3982.m4680(b0Var.m4766() - 1, this.f3977) + 1) - Math.max(m4680, m46802)) - 1) : Math.max(0, Math.min(m4680, m46802));
                if (m4723) {
                    return Math.round((max * (Math.abs(this.f3993.mo5169(m4717) - this.f3993.mo5172(m4718)) / ((this.f3982.m4680(getPosition(m4717), this.f3977) - this.f3982.m4680(getPosition(m4718), this.f3977)) + 1))) + (this.f3993.mo5178() - this.f3993.mo5172(m4718)));
                }
                return max;
            }
        }
        return 0;
    }

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private int m4653(RecyclerView.b0 b0Var) {
        if (getChildCount() != 0 && b0Var.m4766() != 0) {
            m4715();
            View m4718 = m4718(!m4723(), true);
            View m4717 = m4717(!m4723(), true);
            if (m4718 != null && m4717 != null) {
                if (!m4723()) {
                    return this.f3982.m4680(b0Var.m4766() - 1, this.f3977) + 1;
                }
                int mo5169 = this.f3993.mo5169(m4717) - this.f3993.mo5172(m4718);
                int m4680 = this.f3982.m4680(getPosition(m4718), this.f3977);
                return (int) ((mo5169 / ((this.f3982.m4680(getPosition(m4717), this.f3977) - m4680) + 1)) * (this.f3982.m4680(b0Var.m4766() - 1, this.f3977) + 1));
            }
        }
        return 0;
    }

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private void m4654(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i5) {
        boolean z5 = i5 == 1;
        int m4657 = m4657(wVar, b0Var, aVar.f4008);
        if (z5) {
            while (m4657 > 0) {
                int i6 = aVar.f4008;
                if (i6 <= 0) {
                    return;
                }
                int i7 = i6 - 1;
                aVar.f4008 = i7;
                m4657 = m4657(wVar, b0Var, i7);
            }
            return;
        }
        int m4766 = b0Var.m4766() - 1;
        int i8 = aVar.f4008;
        while (i8 < m4766) {
            int i9 = i8 + 1;
            int m46572 = m4657(wVar, b0Var, i9);
            if (m46572 <= m4657) {
                break;
            }
            i8 = i9;
            m4657 = m46572;
        }
        aVar.f4008 = i8;
    }

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private void m4655() {
        View[] viewArr = this.f3979;
        if (viewArr == null || viewArr.length != this.f3977) {
            this.f3979 = new View[this.f3977];
        }
    }

    /* renamed from: ʻˊ, reason: contains not printable characters */
    private int m4656(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i5) {
        if (!b0Var.m4769()) {
            return this.f3982.m4680(i5, this.f3977);
        }
        int m4905 = wVar.m4905(i5);
        if (m4905 != -1) {
            return this.f3982.m4680(m4905, this.f3977);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i5);
        return 0;
    }

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private int m4657(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i5) {
        if (!b0Var.m4769()) {
            return this.f3982.m4681(i5, this.f3977);
        }
        int i6 = this.f3981.get(i5, -1);
        if (i6 != -1) {
            return i6;
        }
        int m4905 = wVar.m4905(i5);
        if (m4905 != -1) {
            return this.f3982.m4681(m4905, this.f3977);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 0;
    }

    /* renamed from: ʻˎ, reason: contains not printable characters */
    private int m4658(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i5) {
        if (!b0Var.m4769()) {
            return this.f3982.mo4676(i5);
        }
        int i6 = this.f3980.get(i5, -1);
        if (i6 != -1) {
            return i6;
        }
        int m4905 = wVar.m4905(i5);
        if (m4905 != -1) {
            return this.f3982.mo4676(m4905);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i5);
        return 1;
    }

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private void m4659(float f5, int i5) {
        m4663(Math.max(Math.round(f5 * this.f3977), i5));
    }

    /* renamed from: ʻˑ, reason: contains not printable characters */
    private void m4660(View view, int i5, boolean z5) {
        int i6;
        int i7;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f4102;
        int i8 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i9 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int m4667 = m4667(bVar.f3985, bVar.f3986);
        if (this.f3991 == 1) {
            i7 = RecyclerView.p.getChildMeasureSpec(m4667, i5, i9, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i6 = RecyclerView.p.getChildMeasureSpec(this.f3993.mo5179(), getHeightMode(), i8, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int childMeasureSpec = RecyclerView.p.getChildMeasureSpec(m4667, i5, i8, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int childMeasureSpec2 = RecyclerView.p.getChildMeasureSpec(this.f3993.mo5179(), getWidthMode(), i9, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i6 = childMeasureSpec;
            i7 = childMeasureSpec2;
        }
        m4661(view, i7, i6, z5);
    }

    /* renamed from: ʻי, reason: contains not printable characters */
    private void m4661(View view, int i5, int i6, boolean z5) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z5 ? shouldReMeasureChild(view, i5, i6, qVar) : shouldMeasureChild(view, i5, i6, qVar)) {
            view.measure(i5, i6);
        }
    }

    /* renamed from: ʻٴ, reason: contains not printable characters */
    private void m4662() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m4663(height - paddingTop);
    }

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private void m4663(int i5) {
        this.f3978 = m4666(this.f3978, this.f3977, i5);
    }

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private void m4664(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i5, boolean z5) {
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (z5) {
            i7 = i5;
            i6 = 0;
            i8 = 1;
        } else {
            i6 = i5 - 1;
            i7 = -1;
            i8 = -1;
        }
        while (i6 != i7) {
            View view = this.f3979[i6];
            b bVar = (b) view.getLayoutParams();
            int m4658 = m4658(wVar, b0Var, getPosition(view));
            bVar.f3986 = m4658;
            bVar.f3985 = i9;
            i9 += m4658;
            i6 += i8;
        }
    }

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private void m4665() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            b bVar = (b) getChildAt(i5).getLayoutParams();
            int m4865 = bVar.m4865();
            this.f3980.put(m4865, bVar.m4678());
            this.f3981.put(m4865, bVar.m4677());
        }
    }

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    static int[] m4666(int[] iArr, int i5, int i6) {
        int i7;
        if (iArr == null || iArr.length != i5 + 1 || iArr[iArr.length - 1] != i6) {
            iArr = new int[i5 + 1];
        }
        int i8 = 0;
        iArr[0] = 0;
        int i9 = i6 / i5;
        int i10 = i6 % i5;
        int i11 = 0;
        for (int i12 = 1; i12 <= i5; i12++) {
            i8 += i10;
            if (i8 <= 0 || i5 - i8 >= i10) {
                i7 = i9;
            } else {
                i7 = i9 + 1;
                i8 -= i5;
            }
            i11 += i7;
            iArr[i12] = i11;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean checkLayoutParams(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollOffset(RecyclerView.b0 b0Var) {
        return this.f3984 ? m4652(b0Var) : super.computeHorizontalScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeHorizontalScrollRange(RecyclerView.b0 b0Var) {
        return this.f3984 ? m4653(b0Var) : super.computeHorizontalScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollOffset(RecyclerView.b0 b0Var) {
        return this.f3984 ? m4652(b0Var) : super.computeVerticalScrollOffset(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int computeVerticalScrollRange(RecyclerView.b0 b0Var) {
        return this.f3984 ? m4653(b0Var) : super.computeVerticalScrollRange(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateDefaultLayoutParams() {
        return this.f3991 == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getColumnCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3991 == 1) {
            return this.f3977;
        }
        if (b0Var.m4766() < 1) {
            return 0;
        }
        return m4656(wVar, b0Var, b0Var.m4766() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int getRowCountForAccessibility(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.f3991 == 0) {
            return this.f3977;
        }
        if (b0Var.m4766() < 1) {
            return 0;
        }
        return m4656(wVar, b0Var, b0Var.m4766() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityNodeInfo(RecyclerView.w wVar, RecyclerView.b0 b0Var, j0 j0Var) {
        super.onInitializeAccessibilityNodeInfo(wVar, b0Var, j0Var);
        j0Var.m2641(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, j0 j0Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, j0Var);
            return;
        }
        b bVar = (b) layoutParams;
        int m4656 = m4656(wVar, b0Var, bVar.m4865());
        if (this.f3991 == 0) {
            j0Var.m2644(j0.c.m2711(bVar.m4677(), bVar.m4678(), m4656, 1, false, false));
        } else {
            j0Var.m2644(j0.c.m2711(m4656, 1, bVar.m4677(), bVar.m4678(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsAdded(RecyclerView recyclerView, int i5, int i6) {
        this.f3982.m4684();
        this.f3982.m4683();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsChanged(RecyclerView recyclerView) {
        this.f3982.m4684();
        this.f3982.m4683();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsMoved(RecyclerView recyclerView, int i5, int i6, int i7) {
        this.f3982.m4684();
        this.f3982.m4683();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsRemoved(RecyclerView recyclerView, int i5, int i6) {
        this.f3982.m4684();
        this.f3982.m4683();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void onItemsUpdated(RecyclerView recyclerView, int i5, int i6, Object obj) {
        this.f3982.m4684();
        this.f3982.m4683();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutChildren(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.m4769()) {
            m4665();
        }
        super.onLayoutChildren(wVar, b0Var);
        m4651();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void onLayoutCompleted(RecyclerView.b0 b0Var) {
        super.onLayoutCompleted(b0Var);
        this.f3976 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollHorizontallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        m4662();
        m4655();
        return super.scrollHorizontallyBy(i5, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int scrollVerticallyBy(int i5, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        m4662();
        m4655();
        return super.scrollVerticallyBy(i5, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void setMeasuredDimension(Rect rect, int i5, int i6) {
        int chooseSize;
        int chooseSize2;
        if (this.f3978 == null) {
            super.setMeasuredDimension(rect, i5, i6);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f3991 == 1) {
            chooseSize2 = RecyclerView.p.chooseSize(i6, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.f3978;
            chooseSize = RecyclerView.p.chooseSize(i5, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.p.chooseSize(i5, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.f3978;
            chooseSize2 = RecyclerView.p.chooseSize(i6, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean supportsPredictiveItemAnimations() {
        return this.f4002 == null && !this.f3976;
    }

    /* renamed from: ʻˈ, reason: contains not printable characters */
    int m4667(int i5, int i6) {
        if (this.f3991 != 1 || !m4725()) {
            int[] iArr = this.f3978;
            return iArr[i6 + i5] - iArr[i5];
        }
        int[] iArr2 = this.f3978;
        int i7 = this.f3977;
        return iArr2[i7 - i5] - iArr2[(i7 - i5) - i6];
    }

    /* renamed from: ʻˉ, reason: contains not printable characters */
    public int m4668() {
        return this.f3977;
    }

    /* renamed from: ʻـ, reason: contains not printable characters */
    public void m4669(int i5) {
        if (i5 == this.f3977) {
            return;
        }
        this.f3976 = true;
        if (i5 >= 1) {
            this.f3977 = i5;
            this.f3982.m4684();
            requestLayout();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i5);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ʼ, reason: contains not printable characters */
    void mo4670(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int i5 = this.f3977;
        for (int i6 = 0; i6 < this.f3977 && cVar.m4735(b0Var) && i5 > 0; i6++) {
            int i7 = cVar.f4019;
            cVar2.mo4864(i7, Math.max(0, cVar.f4022));
            i5 -= this.f3982.mo4676(i7);
            cVar.f4019 += cVar.f4020;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ʽʽ, reason: contains not printable characters */
    void mo4671(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i5) {
        super.mo4671(wVar, b0Var, aVar, i5);
        m4662();
        if (b0Var.m4766() > 0 && !b0Var.m4769()) {
            m4654(wVar, b0Var, aVar, i5);
        }
        m4655();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void mo4672(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo4672(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    void mo4673(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int mo5171;
        int i14;
        int childMeasureSpec;
        int i15;
        View m4736;
        int mo5177 = this.f3993.mo5177();
        boolean z5 = mo5177 != 1073741824;
        int i16 = getChildCount() > 0 ? this.f3978[this.f3977] : 0;
        if (z5) {
            m4662();
        }
        boolean z6 = cVar.f4020 == 1;
        int i17 = this.f3977;
        if (!z6) {
            i17 = m4657(wVar, b0Var, cVar.f4019) + m4658(wVar, b0Var, cVar.f4019);
        }
        int i18 = 0;
        while (i18 < this.f3977 && cVar.m4735(b0Var) && i17 > 0) {
            int i19 = cVar.f4019;
            int m4658 = m4658(wVar, b0Var, i19);
            if (m4658 > this.f3977) {
                throw new IllegalArgumentException("Item at position " + i19 + " requires " + m4658 + " spans but GridLayoutManager has only " + this.f3977 + " spans.");
            }
            i17 -= m4658;
            if (i17 < 0 || (m4736 = cVar.m4736(wVar)) == null) {
                break;
            }
            this.f3979[i18] = m4736;
            i18++;
        }
        if (i18 == 0) {
            bVar.f4013 = true;
            return;
        }
        m4664(wVar, b0Var, i18, z6);
        float f5 = 0.0f;
        int i20 = 0;
        for (int i21 = 0; i21 < i18; i21++) {
            View view = this.f3979[i21];
            if (cVar.f4027 == null) {
                if (z6) {
                    addView(view);
                } else {
                    addView(view, 0);
                }
            } else if (z6) {
                addDisappearingView(view);
            } else {
                addDisappearingView(view, 0);
            }
            calculateItemDecorationsForChild(view, this.f3983);
            m4660(view, mo5177, false);
            int mo5170 = this.f3993.mo5170(view);
            if (mo5170 > i20) {
                i20 = mo5170;
            }
            float mo51712 = (this.f3993.mo5171(view) * 1.0f) / ((b) view.getLayoutParams()).f3986;
            if (mo51712 > f5) {
                f5 = mo51712;
            }
        }
        if (z5) {
            m4659(f5, i16);
            i20 = 0;
            for (int i22 = 0; i22 < i18; i22++) {
                View view2 = this.f3979[i22];
                m4660(view2, 1073741824, true);
                int mo51702 = this.f3993.mo5170(view2);
                if (mo51702 > i20) {
                    i20 = mo51702;
                }
            }
        }
        for (int i23 = 0; i23 < i18; i23++) {
            View view3 = this.f3979[i23];
            if (this.f3993.mo5170(view3) != i20) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f4102;
                int i24 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i25 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int m4667 = m4667(bVar2.f3985, bVar2.f3986);
                if (this.f3991 == 1) {
                    i15 = RecyclerView.p.getChildMeasureSpec(m4667, 1073741824, i25, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    childMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20 - i24, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i20 - i25, 1073741824);
                    childMeasureSpec = RecyclerView.p.getChildMeasureSpec(m4667, 1073741824, i24, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i15 = makeMeasureSpec;
                }
                m4661(view3, i15, childMeasureSpec, true);
            }
        }
        bVar.f4012 = i20;
        if (this.f3991 == 1) {
            if (cVar.f4021 == -1) {
                i10 = cVar.f4017;
                i14 = i10 - i20;
            } else {
                i14 = cVar.f4017;
                i10 = i14 + i20;
            }
            i8 = i14;
            i9 = 0;
            i7 = 0;
        } else {
            if (cVar.f4021 == -1) {
                i6 = cVar.f4017;
                i5 = i6 - i20;
            } else {
                i5 = cVar.f4017;
                i6 = i5 + i20;
            }
            i7 = i5;
            i8 = 0;
            i9 = i6;
            i10 = 0;
        }
        int i26 = 0;
        while (i26 < i18) {
            View view4 = this.f3979[i26];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.f3991 == 1) {
                if (m4725()) {
                    int paddingLeft = getPaddingLeft() + this.f3978[this.f3977 - bVar3.f3985];
                    mo5171 = i10;
                    i12 = paddingLeft;
                    i13 = paddingLeft - this.f3993.mo5171(view4);
                } else {
                    int paddingLeft2 = getPaddingLeft() + this.f3978[bVar3.f3985];
                    mo5171 = i10;
                    i13 = paddingLeft2;
                    i12 = this.f3993.mo5171(view4) + paddingLeft2;
                }
                i11 = i8;
            } else {
                int paddingTop = getPaddingTop() + this.f3978[bVar3.f3985];
                i11 = paddingTop;
                i12 = i9;
                i13 = i7;
                mo5171 = this.f3993.mo5171(view4) + paddingTop;
            }
            layoutDecoratedWithMargins(view4, i13, i11, i12, mo5171);
            if (bVar3.m4867() || bVar3.m4866()) {
                bVar.f4014 = true;
            }
            bVar.f4015 |= view4.hasFocusable();
            i26++;
            i10 = mo5171;
            i9 = i12;
            i7 = i13;
            i8 = i11;
        }
        Arrays.fill(this.f3979, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: ᵔ, reason: contains not printable characters */
    View mo4674(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z5, boolean z6) {
        int i5;
        int i6;
        int childCount = getChildCount();
        int i7 = 1;
        if (z6) {
            i6 = getChildCount() - 1;
            i5 = -1;
            i7 = -1;
        } else {
            i5 = childCount;
            i6 = 0;
        }
        int m4766 = b0Var.m4766();
        m4715();
        int mo5178 = this.f3993.mo5178();
        int mo5174 = this.f3993.mo5174();
        View view = null;
        View view2 = null;
        while (i6 != i5) {
            View childAt = getChildAt(i6);
            int position = getPosition(childAt);
            if (position >= 0 && position < m4766 && m4657(wVar, b0Var, position) == 0) {
                if (((RecyclerView.q) childAt.getLayoutParams()).m4867()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.f3993.mo5172(childAt) < mo5174 && this.f3993.mo5169(childAt) >= mo5178) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i6 += i7;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public static class b extends RecyclerView.q {

        /* renamed from: ʿ, reason: contains not printable characters */
        int f3985;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f3986;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3985 = -1;
            this.f3986 = 0;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public int m4677() {
            return this.f3985;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public int m4678() {
            return this.f3986;
        }

        public b(int i5, int i6) {
            super(i5, i6);
            this.f3985 = -1;
            this.f3986 = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3985 = -1;
            this.f3986 = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3985 = -1;
            this.f3986 = 0;
        }
    }

    public GridLayoutManager(Context context, int i5, int i6, boolean z5) {
        super(context, i6, z5);
        this.f3976 = false;
        this.f3977 = -1;
        this.f3980 = new SparseIntArray();
        this.f3981 = new SparseIntArray();
        this.f3982 = new a();
        this.f3983 = new Rect();
        m4669(i5);
    }
}
