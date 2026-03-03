package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import w0.e;
import w0.g;
import w0.i;
import w0.k;
import w0.n;
import w0.o;

/* loaded from: E:\78999\cookie_5123796.dex */
public class MDRootLayout extends ViewGroup {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final MDButton[] f5064;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5065;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View f5066;

    /* renamed from: ˈ, reason: contains not printable characters */
    private View f5067;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f5068;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f5069;

    /* renamed from: ˋ, reason: contains not printable characters */
    private o f5070;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f5071;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f5072;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f5073;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f5074;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f5075;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f5076;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f5077;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private e f5078;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f5079;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private Paint f5080;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private ViewTreeObserver.OnScrollChangedListener f5081;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private ViewTreeObserver.OnScrollChangedListener f5082;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f5083;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f5084;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ boolean f5085;

        /* renamed from: ˆ, reason: contains not printable characters */
        final /* synthetic */ boolean f5086;

        a(View view, boolean z5, boolean z6) {
            this.f5084 = view;
            this.f5085 = z5;
            this.f5086 = z6;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (this.f5084.getMeasuredHeight() == 0) {
                return true;
            }
            if (MDRootLayout.m5997((WebView) this.f5084)) {
                MDRootLayout.this.m5993((ViewGroup) this.f5084, this.f5085, this.f5086);
            } else {
                if (this.f5085) {
                    MDRootLayout.this.f5068 = false;
                }
                if (this.f5086) {
                    MDRootLayout.this.f5069 = false;
                }
            }
            this.f5084.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    }

    class b extends RecyclerView.u {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f5088;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ boolean f5089;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ boolean f5090;

        b(ViewGroup viewGroup, boolean z5, boolean z6) {
            this.f5088 = viewGroup;
            this.f5089 = z5;
            this.f5090 = z6;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        /* renamed from: ʼ */
        public void mo4875(RecyclerView recyclerView, int i5, int i6) {
            super.mo4875(recyclerView, i5, i6);
            MDButton[] mDButtonArr = MDRootLayout.this.f5064;
            int length = mDButtonArr.length;
            boolean z5 = false;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    MDButton mDButton = mDButtonArr[i7];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z5 = true;
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
            MDRootLayout.this.m6001(this.f5088, this.f5089, this.f5090, z5);
            MDRootLayout.this.invalidate();
        }
    }

    class c implements ViewTreeObserver.OnScrollChangedListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final /* synthetic */ ViewGroup f5092;

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ boolean f5093;

        /* renamed from: ʽ, reason: contains not printable characters */
        final /* synthetic */ boolean f5094;

        c(ViewGroup viewGroup, boolean z5, boolean z6) {
            this.f5092 = viewGroup;
            this.f5093 = z5;
            this.f5094 = z6;
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            MDButton[] mDButtonArr = MDRootLayout.this.f5064;
            int length = mDButtonArr.length;
            boolean z5 = false;
            int i5 = 0;
            while (true) {
                if (i5 < length) {
                    MDButton mDButton = mDButtonArr[i5];
                    if (mDButton != null && mDButton.getVisibility() != 8) {
                        z5 = true;
                        break;
                    }
                    i5++;
                } else {
                    break;
                }
            }
            ViewGroup viewGroup = this.f5092;
            if (viewGroup instanceof WebView) {
                MDRootLayout.this.m6002((WebView) viewGroup, this.f5093, this.f5094, z5);
            } else {
                MDRootLayout.this.m6001(viewGroup, this.f5093, this.f5094, z5);
            }
            MDRootLayout.this.invalidate();
        }
    }

    static /* synthetic */ class d {

        /* renamed from: ʻ, reason: contains not printable characters */
        static final /* synthetic */ int[] f5096;

        static {
            int[] iArr = new int[e.values().length];
            f5096 = iArr;
            try {
                iArr[e.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5096[e.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MDRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5064 = new MDButton[3];
        this.f5068 = false;
        this.f5069 = false;
        this.f5070 = o.ADAPTIVE;
        this.f5071 = false;
        this.f5072 = true;
        this.f5078 = e.START;
        m6000(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public void m5993(ViewGroup viewGroup, boolean z5, boolean z6) {
        if ((z6 || this.f5081 != null) && !(z6 && this.f5082 == null)) {
            return;
        }
        if (viewGroup instanceof RecyclerView) {
            b bVar = new b(viewGroup, z5, z6);
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            recyclerView.addOnScrollListener(bVar);
            bVar.mo4875(recyclerView, 0, 0);
            return;
        }
        c cVar = new c(viewGroup, z5, z6);
        if (z6) {
            this.f5082 = cVar;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f5082);
        } else {
            this.f5081 = cVar;
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(this.f5081);
        }
        cVar.onScrollChanged();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean m5994(AdapterView adapterView) {
        if (adapterView.getLastVisiblePosition() == -1) {
            return false;
        }
        return !(adapterView.getFirstVisiblePosition() == 0) || !(adapterView.getLastVisiblePosition() == adapterView.getCount() - 1) || adapterView.getChildCount() <= 0 || adapterView.getChildAt(0).getTop() < adapterView.getPaddingTop() || adapterView.getChildAt(adapterView.getChildCount() - 1).getBottom() > adapterView.getHeight() - adapterView.getPaddingBottom();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m5995(RecyclerView recyclerView) {
        return (recyclerView == null || recyclerView.getLayoutManager() == null || !recyclerView.getLayoutManager().canScrollVertically()) ? false : true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean m5996(ScrollView scrollView) {
        if (scrollView.getChildCount() == 0) {
            return false;
        }
        return (scrollView.getMeasuredHeight() - scrollView.getPaddingTop()) - scrollView.getPaddingBottom() < scrollView.getChildAt(0).getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˏ, reason: contains not printable characters */
    public static boolean m5997(WebView webView) {
        return ((float) webView.getMeasuredHeight()) < ((float) webView.getContentHeight()) * webView.getScale();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private static View m5998(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getBottom() == viewGroup.getMeasuredHeight()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: י, reason: contains not printable characters */
    private static View m5999(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() == 0) {
            return null;
        }
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0 && childAt.getTop() == 0) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private void m6000(Context context, AttributeSet attributeSet, int i5) {
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f12029, i5, 0);
        this.f5073 = obtainStyledAttributes.getBoolean(n.f12030, true);
        obtainStyledAttributes.recycle();
        this.f5075 = resources.getDimensionPixelSize(i.f11967);
        this.f5076 = resources.getDimensionPixelSize(i.f11955);
        this.f5079 = resources.getDimensionPixelSize(i.f11957);
        this.f5077 = resources.getDimensionPixelSize(i.f11956);
        this.f5080 = new Paint();
        this.f5083 = resources.getDimensionPixelSize(i.f11964);
        this.f5080.setColor(y0.a.m12849(context, g.f11941));
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ٴ, reason: contains not printable characters */
    public void m6001(ViewGroup viewGroup, boolean z5, boolean z6, boolean z7) {
        if (z5 && viewGroup.getChildCount() > 0) {
            View view = this.f5066;
            this.f5068 = (view == null || view.getVisibility() == 8 || viewGroup.getScrollY() + viewGroup.getPaddingTop() <= viewGroup.getChildAt(0).getTop()) ? false : true;
        }
        if (!z6 || viewGroup.getChildCount() <= 0) {
            return;
        }
        this.f5069 = z7 && (viewGroup.getScrollY() + viewGroup.getHeight()) - viewGroup.getPaddingBottom() < viewGroup.getChildAt(viewGroup.getChildCount() - 1).getBottom();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m6002(WebView webView, boolean z5, boolean z6, boolean z7) {
        if (z5) {
            View view = this.f5066;
            this.f5068 = (view == null || view.getVisibility() == 8 || webView.getScrollY() + webView.getPaddingTop() <= 0) ? false : true;
        }
        if (z6) {
            this.f5069 = z7 && ((float) ((webView.getScrollY() + webView.getMeasuredHeight()) - webView.getPaddingBottom())) < ((float) webView.getContentHeight()) * webView.getScale();
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private void m6003() {
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            int i5 = d.f5096[this.f5078.ordinal()];
            if (i5 == 1) {
                this.f5078 = e.END;
            } else {
                if (i5 != 2) {
                    return;
                }
                this.f5078 = e.START;
            }
        }
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private static boolean m6004(View view) {
        boolean z5 = (view == null || view.getVisibility() == 8) ? false : true;
        if (z5 && (view instanceof MDButton)) {
            return ((MDButton) view).getText().toString().trim().length() > 0;
        }
        return z5;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m6005(View view, boolean z5, boolean z6) {
        if (view == null) {
            return;
        }
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            if (m5996(scrollView)) {
                m5993(scrollView, z5, z6);
                return;
            }
            if (z5) {
                this.f5068 = false;
            }
            if (z6) {
                this.f5069 = false;
                return;
            }
            return;
        }
        if (view instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) view;
            if (m5994(adapterView)) {
                m5993(adapterView, z5, z6);
                return;
            }
            if (z5) {
                this.f5068 = false;
            }
            if (z6) {
                this.f5069 = false;
                return;
            }
            return;
        }
        if (view instanceof WebView) {
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, z5, z6));
            return;
        }
        if (view instanceof RecyclerView) {
            boolean m5995 = m5995((RecyclerView) view);
            if (z5) {
                this.f5068 = m5995;
            }
            if (z6) {
                this.f5069 = m5995;
            }
            if (m5995) {
                m5993((ViewGroup) view, z5, z6);
                return;
            }
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            View m5999 = m5999(viewGroup);
            m6005(m5999, z5, z6);
            View m5998 = m5998(viewGroup);
            if (m5998 != m5999) {
                m6005(m5998, false, true);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f5067;
        if (view != null) {
            if (this.f5068) {
                canvas.drawRect(0.0f, r0 - this.f5083, getMeasuredWidth(), view.getTop(), this.f5080);
            }
            if (this.f5069) {
                canvas.drawRect(0.0f, this.f5067.getBottom(), getMeasuredWidth(), r0 + this.f5083, this.f5080);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() == k.f11983) {
                this.f5066 = childAt;
            } else if (childAt.getId() == k.f11971) {
                this.f5064[0] = (MDButton) childAt;
            } else if (childAt.getId() == k.f11970) {
                this.f5064[1] = (MDButton) childAt;
            } else if (childAt.getId() == k.f11972) {
                this.f5064[2] = (MDButton) childAt;
            } else {
                this.f5067 = childAt;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        int measuredWidth;
        int i11;
        int i12;
        int i13;
        int measuredWidth2;
        int measuredWidth3;
        int i14;
        if (m6004(this.f5066)) {
            int measuredHeight = this.f5066.getMeasuredHeight() + i6;
            this.f5066.layout(i5, i6, i7, measuredHeight);
            i6 = measuredHeight;
        } else if (!this.f5074 && this.f5072) {
            i6 += this.f5075;
        }
        if (m6004(this.f5067)) {
            View view = this.f5067;
            view.layout(i5, i6, i7, view.getMeasuredHeight() + i6);
        }
        if (this.f5071) {
            int i15 = i8 - this.f5076;
            for (MDButton mDButton : this.f5064) {
                if (m6004(mDButton)) {
                    mDButton.layout(i5, i15 - mDButton.getMeasuredHeight(), i7, i15);
                    i15 -= mDButton.getMeasuredHeight();
                }
            }
        } else {
            if (this.f5072) {
                i8 -= this.f5076;
            }
            int i16 = i8 - this.f5077;
            int i17 = this.f5079;
            if (m6004(this.f5064[2])) {
                if (this.f5078 == e.END) {
                    measuredWidth3 = i5 + i17;
                    i14 = this.f5064[2].getMeasuredWidth() + measuredWidth3;
                    i9 = -1;
                } else {
                    int i18 = i7 - i17;
                    measuredWidth3 = i18 - this.f5064[2].getMeasuredWidth();
                    i14 = i18;
                    i9 = measuredWidth3;
                }
                this.f5064[2].layout(measuredWidth3, i16, i14, i8);
                i17 += this.f5064[2].getMeasuredWidth();
            } else {
                i9 = -1;
            }
            if (m6004(this.f5064[1])) {
                e eVar = this.f5078;
                if (eVar == e.END) {
                    i13 = i17 + i5;
                    measuredWidth2 = this.f5064[1].getMeasuredWidth() + i13;
                } else if (eVar == e.START) {
                    measuredWidth2 = i7 - i17;
                    i13 = measuredWidth2 - this.f5064[1].getMeasuredWidth();
                } else {
                    i13 = this.f5079 + i5;
                    measuredWidth2 = this.f5064[1].getMeasuredWidth() + i13;
                    i10 = measuredWidth2;
                    this.f5064[1].layout(i13, i16, measuredWidth2, i8);
                }
                i10 = -1;
                this.f5064[1].layout(i13, i16, measuredWidth2, i8);
            } else {
                i10 = -1;
            }
            if (m6004(this.f5064[0])) {
                e eVar2 = this.f5078;
                if (eVar2 == e.END) {
                    i11 = i7 - this.f5079;
                    i12 = i11 - this.f5064[0].getMeasuredWidth();
                } else if (eVar2 == e.START) {
                    i12 = i5 + this.f5079;
                    i11 = this.f5064[0].getMeasuredWidth() + i12;
                } else {
                    if (i10 != -1 || i9 == -1) {
                        if (i9 == -1 && i10 != -1) {
                            measuredWidth = this.f5064[0].getMeasuredWidth();
                        } else if (i9 == -1) {
                            i10 = ((i7 - i5) / 2) - (this.f5064[0].getMeasuredWidth() / 2);
                            measuredWidth = this.f5064[0].getMeasuredWidth();
                        }
                        i9 = i10 + measuredWidth;
                    } else {
                        i10 = i9 - this.f5064[0].getMeasuredWidth();
                    }
                    i11 = i9;
                    i12 = i10;
                }
                this.f5064[0].layout(i12, i16, i11, i8);
            }
        }
        m6005(this.f5067, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.MDRootLayout.onMeasure(int, int):void");
    }

    public void setButtonGravity(e eVar) {
        this.f5078 = eVar;
        m6003();
    }

    public void setButtonStackedGravity(e eVar) {
        for (MDButton mDButton : this.f5064) {
            if (mDButton != null) {
                mDButton.setStackedGravity(eVar);
            }
        }
    }

    public void setDividerColor(int i5) {
        this.f5080.setColor(i5);
        invalidate();
    }

    public void setMaxHeight(int i5) {
        this.f5065 = i5;
    }

    public void setStackingBehavior(o oVar) {
        this.f5070 = oVar;
        invalidate();
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    public void m6006() {
        this.f5074 = true;
    }
}
