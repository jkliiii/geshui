package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ActionMenuView extends LinearLayoutCompat implements g.b, androidx.appcompat.view.menu.n {

    /* renamed from: ʾ, reason: contains not printable characters */
    private androidx.appcompat.view.menu.g f1024;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Context f1025;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f1026;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f1027;

    /* renamed from: ˉ, reason: contains not printable characters */
    private androidx.appcompat.widget.c f1028;

    /* renamed from: ˊ, reason: contains not printable characters */
    private m.a f1029;

    /* renamed from: ˋ, reason: contains not printable characters */
    g.a f1030;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f1031;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f1032;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f1033;

    /* renamed from: י, reason: contains not printable characters */
    private int f1034;

    /* renamed from: ـ, reason: contains not printable characters */
    e f1035;

    public interface a {
        /* renamed from: ʻ */
        boolean mo879();

        /* renamed from: ʼ */
        boolean mo880();
    }

    public static class c extends LinearLayoutCompat.a {

        /* renamed from: ʻ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f1036;

        /* renamed from: ʼ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public int f1037;

        /* renamed from: ʽ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public int f1038;

        /* renamed from: ʾ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f1039;

        /* renamed from: ʿ, reason: contains not printable characters */
        @ViewDebug.ExportedProperty
        public boolean f1040;

        /* renamed from: ˆ, reason: contains not printable characters */
        boolean f1041;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f1036 = cVar.f1036;
        }

        public c(int i5, int i6) {
            super(i5, i6);
            this.f1036 = false;
        }
    }

    private class d implements g.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʻ */
        public boolean mo528(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f1035;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        /* renamed from: ʼ */
        public void mo529(androidx.appcompat.view.menu.g gVar) {
            g.a aVar = ActionMenuView.this.f1030;
            if (aVar != null) {
                aVar.mo529(gVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int m1035(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L28
            boolean r9 = r9.m881()
            if (r9 == 0) goto L28
            r9 = 1
            goto L29
        L28:
            r9 = 0
        L29:
            if (r7 <= 0) goto L4d
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4d
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L46
            int r4 = r4 + 1
        L46:
            if (r9 == 0) goto L4b
            if (r4 >= r3) goto L4b
            goto L4e
        L4b:
            r3 = r4
            goto L4e
        L4d:
            r3 = 0
        L4e:
            boolean r7 = r0.f1036
            if (r7 != 0) goto L55
            if (r9 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            r0.f1039 = r1
            r0.f1037 = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.m1035(android.view.View, int, int, int, int):int");
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [boolean, int] */
    /* renamed from: ˑ, reason: contains not printable characters */
    private void m1036(int i5, int i6) {
        int i7;
        int i8;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f1033;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j5 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z9) {
                    int i23 = this.f1034;
                    i10 = i22;
                    r14 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i10 = i22;
                    r14 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f1041 = r14;
                cVar.f1038 = r14;
                cVar.f1037 = r14;
                cVar.f1039 = r14;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r14;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r14;
                cVar.f1040 = z9 && ((ActionMenuItemView) childAt).m881();
                int m1035 = m1035(childAt, i15, cVar.f1036 ? 1 : i13, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, m1035);
                if (cVar.f1039) {
                    i20++;
                }
                if (cVar.f1036) {
                    z8 = true;
                }
                i13 -= m1035;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (m1035 == 1) {
                    j5 |= 1 << i17;
                    i16 = i16;
                }
                i18 = i10;
            }
            i17++;
            size2 = i21;
        }
        int i24 = size2;
        boolean z10 = z8 && i18 == 2;
        boolean z11 = false;
        while (i20 > 0 && i13 > 0) {
            int i25 = 0;
            int i26 = 0;
            int i27 = Integer.MAX_VALUE;
            long j6 = 0;
            while (i26 < childCount) {
                boolean z12 = z11;
                c cVar2 = (c) getChildAt(i26).getLayoutParams();
                int i28 = i16;
                if (cVar2.f1039) {
                    int i29 = cVar2.f1037;
                    if (i29 < i27) {
                        j6 = 1 << i26;
                        i27 = i29;
                        i25 = 1;
                    } else if (i29 == i27) {
                        i25++;
                        j6 |= 1 << i26;
                    }
                }
                i26++;
                i16 = i28;
                z11 = z12;
            }
            z5 = z11;
            i9 = i16;
            j5 |= j6;
            if (i25 > i13) {
                i7 = mode;
                i8 = i11;
                break;
            }
            int i30 = i27 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                c cVar3 = (c) childAt2.getLayoutParams();
                int i32 = i11;
                int i33 = mode;
                long j7 = 1 << i31;
                if ((j6 & j7) == 0) {
                    if (cVar3.f1037 == i30) {
                        j5 |= j7;
                    }
                    z7 = z10;
                } else {
                    if (z10 && cVar3.f1040 && i13 == 1) {
                        int i34 = this.f1034;
                        z7 = z10;
                        childAt2.setPadding(i34 + i15, 0, i34, 0);
                    } else {
                        z7 = z10;
                    }
                    cVar3.f1037++;
                    cVar3.f1041 = true;
                    i13--;
                }
                i31++;
                mode = i33;
                i11 = i32;
                z10 = z7;
            }
            i16 = i9;
            z11 = true;
        }
        i7 = mode;
        i8 = i11;
        z5 = z11;
        i9 = i16;
        boolean z13 = !z8 && i18 == 1;
        if (i13 <= 0 || j5 == 0 || (i13 >= i18 - 1 && !z13 && i19 <= 1)) {
            z6 = z5;
        } else {
            float bitCount = Long.bitCount(j5);
            if (!z13) {
                if ((j5 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f1040) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j5 & (1 << i35)) != 0 && !((c) getChildAt(i35).getLayoutParams()).f1040) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) ((i13 * i15) / bitCount) : 0;
            z6 = z5;
            for (int i37 = 0; i37 < childCount; i37++) {
                if ((j5 & (1 << i37)) != 0) {
                    View childAt3 = getChildAt(i37);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1038 = i36;
                        cVar4.f1041 = true;
                        if (i37 == 0 && !cVar4.f1040) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i36) / 2;
                        }
                    } else if (cVar4.f1036) {
                        cVar4.f1038 = i36;
                        cVar4.f1041 = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i36 / 2;
                        }
                        if (i37 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i36 / 2;
                        }
                    }
                    z6 = true;
                }
            }
        }
        if (z6) {
            for (int i38 = 0; i38 < childCount; i38++) {
                View childAt4 = getChildAt(i38);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f1041) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f1037 * i15) + cVar5.f1038, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, i7 != 1073741824 ? i9 : i24);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1024 == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.f1024 = gVar;
            gVar.setCallback(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.f1028 = cVar;
            cVar.m1161(true);
            androidx.appcompat.widget.c cVar2 = this.f1028;
            m.a aVar = this.f1029;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.setCallback(aVar);
            this.f1024.addMenuPresenter(this.f1028, this.f1025);
            this.f1028.m1169(this);
        }
        return this.f1024;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1028.m1162();
    }

    public int getPopupTheme() {
        return this.f1026;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initialize(androidx.appcompat.view.menu.g gVar) {
        this.f1024 = gVar;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.f1028;
        if (cVar != null) {
            cVar.updateMenuView(false);
            if (this.f1028.m1166()) {
                this.f1028.m1163();
                this.f1028.m1158();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m1037();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int width;
        int i9;
        if (!this.f1031) {
            super.onLayout(z5, i5, i6, i7, i8);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i8 - i6) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i7 - i5;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean m1477 = p3.m1477(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f1036) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1042(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m1477) {
                        i9 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i9 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i9 = width - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i9, i15, width, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    m1042(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (m1477) {
            int width2 = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1036) {
                    int i20 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width2 = i20 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f1036) {
                int i23 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = i23 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i5, int i6) {
        androidx.appcompat.view.menu.g gVar;
        boolean z5 = this.f1031;
        boolean z6 = View.MeasureSpec.getMode(i5) == 1073741824;
        this.f1031 = z6;
        if (z5 != z6) {
            this.f1032 = 0;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (this.f1031 && (gVar = this.f1024) != null && size != this.f1032) {
            this.f1032 = size;
            gVar.onItemsChanged(true);
        }
        int childCount = getChildCount();
        if (this.f1031 && childCount > 0) {
            m1036(i5, i6);
            return;
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            c cVar = (c) getChildAt(i7).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i5, i6);
    }

    public void setExpandedActionViewsExclusive(boolean z5) {
        this.f1028.m1168(z5);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f1035 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1028.m1160(drawable);
    }

    public void setOverflowReserved(boolean z5) {
        this.f1027 = z5;
    }

    public void setPopupTheme(int i5) {
        if (this.f1026 != i5) {
            this.f1026 = i5;
            if (i5 == 0) {
                this.f1025 = getContext();
            } else {
                this.f1025 = new ContextThemeWrapper(getContext(), i5);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.f1028 = cVar;
        cVar.m1169(this);
    }

    @Override // androidx.appcompat.view.menu.g.b
    /* renamed from: ʻ */
    public boolean mo885(androidx.appcompat.view.menu.i iVar) {
        return this.f1024.performItemAction(iVar, 0);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m1037() {
        androidx.appcompat.widget.c cVar = this.f1028;
        if (cVar != null) {
            cVar.m1159();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: ʾ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* renamed from: ʿ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public c m1041() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1036 = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    protected boolean m1042(int i5) {
        boolean z5 = false;
        if (i5 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i5 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i5);
        if (i5 < getChildCount() && (childAt instanceof a)) {
            z5 = false | ((a) childAt).mo879();
        }
        return (i5 <= 0 || !(childAt2 instanceof a)) ? z5 : z5 | ((a) childAt2).mo880();
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public boolean m1043() {
        androidx.appcompat.widget.c cVar = this.f1028;
        return cVar != null && cVar.m1163();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public boolean m1044() {
        androidx.appcompat.widget.c cVar = this.f1028;
        return cVar != null && cVar.m1165();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m1045() {
        androidx.appcompat.widget.c cVar = this.f1028;
        return cVar != null && cVar.m1166();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public boolean m1046() {
        return this.f1027;
    }

    /* renamed from: י, reason: contains not printable characters */
    public androidx.appcompat.view.menu.g m1047() {
        return this.f1024;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m1048(m.a aVar, g.a aVar2) {
        this.f1029 = aVar;
        this.f1030 = aVar2;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public boolean m1049() {
        androidx.appcompat.widget.c cVar = this.f1028;
        return cVar != null && cVar.m1158();
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f1033 = (int) (56.0f * f5);
        this.f1034 = (int) (f5 * 4.0f);
        this.f1025 = context;
        this.f1026 = 0;
    }

    private static class b implements m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        /* renamed from: ʻ */
        public boolean mo527(androidx.appcompat.view.menu.g gVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void onCloseMenu(androidx.appcompat.view.menu.g gVar, boolean z5) {
        }
    }
}
