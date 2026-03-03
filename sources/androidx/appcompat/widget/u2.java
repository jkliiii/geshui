package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;

/* compiled from: ScrollingTabContainerView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class u2 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: ˑ, reason: contains not printable characters */
    private static final Interpolator f1468 = new DecelerateInterpolator();

    /* renamed from: ʾ, reason: contains not printable characters */
    Runnable f1469;

    /* renamed from: ʿ, reason: contains not printable characters */
    private c f1470;

    /* renamed from: ˆ, reason: contains not printable characters */
    LinearLayoutCompat f1471;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Spinner f1472;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f1473;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f1474;

    /* renamed from: ˋ, reason: contains not printable characters */
    int f1475;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f1476;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f1477;

    /* compiled from: ScrollingTabContainerView.java */
    class a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ View f1478;

        a(View view) {
            this.f1478 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            u2.this.smoothScrollTo(this.f1478.getLeft() - ((u2.this.getWidth() - this.f1478.getWidth()) / 2), 0);
            u2.this.f1469 = null;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return u2.this.f1471.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i5) {
            return ((d) u2.this.f1471.getChildAt(i5)).m1567();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            if (view == null) {
                return u2.this.m1565((a.c) getItem(i5), true);
            }
            ((d) view).m1566((a.c) getItem(i5));
            return view;
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1567().m497();
            int childCount = u2.this.f1471.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = u2.this.f1471.getChildAt(i5);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* compiled from: ScrollingTabContainerView.java */
    private class d extends LinearLayout {

        /* renamed from: ʾ, reason: contains not printable characters */
        private final int[] f1482;

        /* renamed from: ʿ, reason: contains not printable characters */
        private a.c f1483;

        /* renamed from: ˆ, reason: contains not printable characters */
        private TextView f1484;

        /* renamed from: ˈ, reason: contains not printable characters */
        private ImageView f1485;

        /* renamed from: ˉ, reason: contains not printable characters */
        private View f1486;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, a.c cVar, boolean z5) {
            int i5 = e.a.f6890;
            super(context, null, i5);
            int[] iArr = {R.attr.background};
            this.f1482 = iArr;
            this.f1483 = cVar;
            d3 m1181 = d3.m1181(context, null, iArr, i5, 0);
            if (m1181.m1200(0)) {
                setBackgroundDrawable(m1181.m1188(0));
            }
            m1181.m1201();
            if (z5) {
                setGravity(8388627);
            }
            m1568();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i5, int i6) {
            super.onMeasure(i5, i6);
            if (u2.this.f1474 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i7 = u2.this.f1474;
                if (measuredWidth > i7) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), i6);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z5) {
            boolean z6 = isSelected() != z5;
            super.setSelected(z5);
            if (z6 && z5) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1566(a.c cVar) {
            this.f1483 = cVar;
            m1568();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public a.c m1567() {
            return this.f1483;
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public void m1568() {
            a.c cVar = this.f1483;
            View m494 = cVar.m494();
            if (m494 != null) {
                ViewParent parent = m494.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m494);
                    }
                    addView(m494);
                }
                this.f1486 = m494;
                TextView textView = this.f1484;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1485;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1485.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1486;
            if (view != null) {
                removeView(view);
                this.f1486 = null;
            }
            Drawable m495 = cVar.m495();
            CharSequence m496 = cVar.m496();
            if (m495 != null) {
                if (this.f1485 == null) {
                    q qVar = new q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    qVar.setLayoutParams(layoutParams);
                    addView(qVar, 0);
                    this.f1485 = qVar;
                }
                this.f1485.setImageDrawable(m495);
                this.f1485.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1485;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1485.setImageDrawable(null);
                }
            }
            boolean z5 = !TextUtils.isEmpty(m496);
            if (z5) {
                if (this.f1484 == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, e.a.f6892);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1484 = appCompatTextView;
                }
                this.f1484.setText(m496);
                this.f1484.setVisibility(0);
            } else {
                TextView textView2 = this.f1484;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1484.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1485;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m493());
            }
            j3.m1399(this, z5 ? null : cVar.m493());
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private Spinner m1560() {
        r0 r0Var = new r0(getContext(), null, e.a.f6898);
        r0Var.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        r0Var.setOnItemSelectedListener(this);
        return r0Var;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m1561() {
        Spinner spinner = this.f1472;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m1562() {
        if (m1561()) {
            return;
        }
        if (this.f1472 == null) {
            this.f1472 = m1560();
        }
        removeView(this.f1471);
        addView(this.f1472, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1472.getAdapter() == null) {
            this.f1472.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1469;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1469 = null;
        }
        this.f1472.setSelection(this.f1477);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private boolean m1563() {
        if (!m1561()) {
            return false;
        }
        removeView(this.f1472);
        addView(this.f1471, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1472.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1469;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.view.a m827 = androidx.appcompat.view.a.m827(getContext());
        setContentHeight(m827.m832());
        this.f1475 = m827.m831();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1469;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
        ((d) view).m1567().m497();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        boolean z5 = mode == 1073741824;
        setFillViewport(z5);
        int childCount = this.f1471.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1474 = -1;
        } else {
            if (childCount > 2) {
                this.f1474 = (int) (View.MeasureSpec.getSize(i5) * 0.4f);
            } else {
                this.f1474 = View.MeasureSpec.getSize(i5) / 2;
            }
            this.f1474 = Math.min(this.f1474, this.f1475);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1476, 1073741824);
        if (!z5 && this.f1473) {
            this.f1471.measure(0, makeMeasureSpec);
            if (this.f1471.getMeasuredWidth() > View.MeasureSpec.getSize(i5)) {
                m1562();
            } else {
                m1563();
            }
        } else {
            m1563();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i5, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z5 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1477);
    }

    public void setAllowCollapse(boolean z5) {
        this.f1473 = z5;
    }

    public void setContentHeight(int i5) {
        this.f1476 = i5;
        requestLayout();
    }

    public void setTabSelected(int i5) {
        this.f1477 = i5;
        int childCount = this.f1471.getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.f1471.getChildAt(i6);
            boolean z5 = i6 == i5;
            childAt.setSelected(z5);
            if (z5) {
                m1564(i5);
            }
            i6++;
        }
        Spinner spinner = this.f1472;
        if (spinner == null || i5 < 0) {
            return;
        }
        spinner.setSelection(i5);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m1564(int i5) {
        View childAt = this.f1471.getChildAt(i5);
        Runnable runnable = this.f1469;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1469 = aVar;
        post(aVar);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    d m1565(a.c cVar, boolean z5) {
        d dVar = new d(getContext(), cVar, z5);
        if (z5) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1476));
        } else {
            dVar.setFocusable(true);
            if (this.f1470 == null) {
                this.f1470 = new c();
            }
            dVar.setOnClickListener(this.f1470);
        }
        return dVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
