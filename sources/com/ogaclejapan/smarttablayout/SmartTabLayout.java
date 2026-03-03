package com.ogaclejapan.smarttablayout;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.f1;
import androidx.viewpager.widget.ViewPager;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SmartTabLayout extends HorizontalScrollView {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final com.ogaclejapan.smarttablayout.a f6773;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f6774;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f6775;

    /* renamed from: ˈ, reason: contains not printable characters */
    private boolean f6776;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ColorStateList f6777;

    /* renamed from: ˊ, reason: contains not printable characters */
    private float f6778;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f6779;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f6780;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ViewPager f6781;

    /* renamed from: ˑ, reason: contains not printable characters */
    private ViewPager.j f6782;

    /* renamed from: י, reason: contains not printable characters */
    private h f6783;

    /* renamed from: ـ, reason: contains not printable characters */
    private b f6784;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f6785;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i5 = 0; i5 < SmartTabLayout.this.f6773.getChildCount(); i5++) {
                if (view == SmartTabLayout.this.f6773.getChildAt(i5)) {
                    SmartTabLayout.m8099(SmartTabLayout.this);
                    SmartTabLayout.this.f6781.setCurrentItem(i5);
                    return;
                }
            }
        }
    }

    private class c implements ViewPager.j {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int f6787;

        private c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i5) {
            this.f6787 = i5;
            if (SmartTabLayout.this.f6782 != null) {
                SmartTabLayout.this.f6782.onPageScrollStateChanged(i5);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i5, float f5, int i6) {
            int childCount = SmartTabLayout.this.f6773.getChildCount();
            if (childCount == 0 || i5 < 0 || i5 >= childCount) {
                return;
            }
            SmartTabLayout.this.f6773.m8117(i5, f5);
            SmartTabLayout.this.m8102(i5, f5);
            if (SmartTabLayout.this.f6782 != null) {
                SmartTabLayout.this.f6782.onPageScrolled(i5, f5, i6);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i5) {
            if (this.f6787 == 0) {
                SmartTabLayout.this.f6773.m8117(i5, 0.0f);
                SmartTabLayout.this.m8102(i5, 0.0f);
            }
            int childCount = SmartTabLayout.this.f6773.getChildCount();
            int i6 = 0;
            while (i6 < childCount) {
                SmartTabLayout.this.f6773.getChildAt(i6).setSelected(i5 == i6);
                i6++;
            }
            if (SmartTabLayout.this.f6782 != null) {
                SmartTabLayout.this.f6782.onPageSelected(i5);
            }
        }
    }

    public interface d {
    }

    public interface e {
    }

    private static class f implements h {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final LayoutInflater f6789;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final int f6790;

        /* renamed from: ʽ, reason: contains not printable characters */
        private final int f6791;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.h
        /* renamed from: ʻ, reason: contains not printable characters */
        public View mo8105(ViewGroup viewGroup, int i5, androidx.viewpager.widget.a aVar) {
            int i6 = this.f6790;
            TextView textView = null;
            TextView inflate = i6 != -1 ? this.f6789.inflate(i6, viewGroup, false) : null;
            int i7 = this.f6791;
            if (i7 != -1 && inflate != null) {
                textView = (TextView) inflate.findViewById(i7);
            }
            if (textView == null && TextView.class.isInstance(inflate)) {
                textView = inflate;
            }
            if (textView != null) {
                textView.setText(aVar.m5607(i5));
            }
            return inflate;
        }

        private f(Context context, int i5, int i6) {
            this.f6789 = LayoutInflater.from(context);
            this.f6790 = i5;
            this.f6791 = i6;
        }
    }

    public interface g {
        /* renamed from: ʻ, reason: contains not printable characters */
        int mo8106(int i5);

        /* renamed from: ʼ, reason: contains not printable characters */
        int mo8107(int i5);
    }

    public interface h {
        /* renamed from: ʻ */
        View mo8105(ViewGroup viewGroup, int i5, androidx.viewpager.widget.a aVar);
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static /* synthetic */ e m8099(SmartTabLayout smartTabLayout) {
        smartTabLayout.getClass();
        return null;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m8101() {
        androidx.viewpager.widget.a adapter = this.f6781.getAdapter();
        for (int i5 = 0; i5 < adapter.mo5605(); i5++) {
            h hVar = this.f6783;
            View m8103 = hVar == null ? m8103(adapter.m5607(i5)) : hVar.mo8105(this.f6773, i5, adapter);
            if (m8103 == null) {
                throw new IllegalStateException("tabView is null.");
            }
            if (this.f6785) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m8103.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            b bVar = this.f6784;
            if (bVar != null) {
                m8103.setOnClickListener(bVar);
            }
            this.f6773.addView(m8103);
            if (i5 == this.f6781.getCurrentItem()) {
                m8103.setSelected(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public void m8102(int i5, float f5) {
        int i6;
        int m8133;
        int i7;
        int childCount = this.f6773.getChildCount();
        if (childCount == 0 || i5 < 0 || i5 >= childCount) {
            return;
        }
        boolean m8137 = com.ogaclejapan.smarttablayout.b.m8137(this);
        View childAt = this.f6773.getChildAt(i5);
        int m8135 = (int) ((com.ogaclejapan.smarttablayout.b.m8135(childAt) + com.ogaclejapan.smarttablayout.b.m8127(childAt)) * f5);
        if (this.f6773.m8116()) {
            if (0.0f < f5 && f5 < 1.0f) {
                View childAt2 = this.f6773.getChildAt(i5 + 1);
                m8135 = Math.round(f5 * ((com.ogaclejapan.smarttablayout.b.m8135(childAt) / 2) + com.ogaclejapan.smarttablayout.b.m8126(childAt) + (com.ogaclejapan.smarttablayout.b.m8135(childAt2) / 2) + com.ogaclejapan.smarttablayout.b.m8128(childAt2)));
            }
            View childAt3 = this.f6773.getChildAt(0);
            if (m8137) {
                int m81352 = com.ogaclejapan.smarttablayout.b.m8135(childAt3) + com.ogaclejapan.smarttablayout.b.m8126(childAt3);
                int m81353 = com.ogaclejapan.smarttablayout.b.m8135(childAt) + com.ogaclejapan.smarttablayout.b.m8126(childAt);
                m8133 = (com.ogaclejapan.smarttablayout.b.m8124(childAt) - com.ogaclejapan.smarttablayout.b.m8126(childAt)) - m8135;
                i7 = (m81352 - m81353) / 2;
            } else {
                int m81354 = com.ogaclejapan.smarttablayout.b.m8135(childAt3) + com.ogaclejapan.smarttablayout.b.m8128(childAt3);
                int m81355 = com.ogaclejapan.smarttablayout.b.m8135(childAt) + com.ogaclejapan.smarttablayout.b.m8128(childAt);
                m8133 = (com.ogaclejapan.smarttablayout.b.m8133(childAt) - com.ogaclejapan.smarttablayout.b.m8128(childAt)) + m8135;
                i7 = (m81354 - m81355) / 2;
            }
            scrollTo(m8133 - i7, 0);
            return;
        }
        int i8 = this.f6774;
        if (i8 == -1) {
            if (0.0f < f5 && f5 < 1.0f) {
                View childAt4 = this.f6773.getChildAt(i5 + 1);
                m8135 = Math.round(f5 * ((com.ogaclejapan.smarttablayout.b.m8135(childAt) / 2) + com.ogaclejapan.smarttablayout.b.m8126(childAt) + (com.ogaclejapan.smarttablayout.b.m8135(childAt4) / 2) + com.ogaclejapan.smarttablayout.b.m8128(childAt4)));
            }
            i6 = m8137 ? (((-com.ogaclejapan.smarttablayout.b.m8136(childAt)) / 2) + (getWidth() / 2)) - com.ogaclejapan.smarttablayout.b.m8132(this) : ((com.ogaclejapan.smarttablayout.b.m8136(childAt) / 2) - (getWidth() / 2)) + com.ogaclejapan.smarttablayout.b.m8132(this);
        } else if (m8137) {
            if (i5 <= 0 && f5 <= 0.0f) {
                i8 = 0;
            }
            i6 = i8;
        } else {
            i6 = (i5 > 0 || f5 > 0.0f) ? -i8 : 0;
        }
        int m81332 = com.ogaclejapan.smarttablayout.b.m8133(childAt);
        int m8128 = com.ogaclejapan.smarttablayout.b.m8128(childAt);
        scrollTo(i6 + (m8137 ? (((m81332 + m8128) - m8135) - getWidth()) + com.ogaclejapan.smarttablayout.b.m8131(this) : (m81332 - m8128) + m8135), 0);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        ViewPager viewPager;
        super.onLayout(z5, i5, i6, i7, i8);
        if (!z5 || (viewPager = this.f6781) == null) {
            return;
        }
        m8102(viewPager.getCurrentItem(), 0.0f);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i5, int i6, int i7, int i8) {
        super.onScrollChanged(i5, i6, i7, i8);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (!this.f6773.m8116() || this.f6773.getChildCount() <= 0) {
            return;
        }
        View childAt = this.f6773.getChildAt(0);
        View childAt2 = this.f6773.getChildAt(r5.getChildCount() - 1);
        int m8129 = ((i5 - com.ogaclejapan.smarttablayout.b.m8129(childAt)) / 2) - com.ogaclejapan.smarttablayout.b.m8128(childAt);
        int m81292 = ((i5 - com.ogaclejapan.smarttablayout.b.m8129(childAt2)) / 2) - com.ogaclejapan.smarttablayout.b.m8126(childAt2);
        com.ogaclejapan.smarttablayout.a aVar = this.f6773;
        aVar.setMinimumWidth(aVar.getMeasuredWidth());
        f1.m2847(this, m8129, getPaddingTop(), m81292, getPaddingBottom());
        setClipToPadding(false);
    }

    public void setCustomTabColorizer(g gVar) {
        this.f6773.m8118(gVar);
    }

    public void setCustomTabView(h hVar) {
        this.f6783 = hVar;
    }

    public void setDefaultTabTextColor(int i5) {
        this.f6777 = ColorStateList.valueOf(i5);
    }

    public void setDistributeEvenly(boolean z5) {
        this.f6785 = z5;
    }

    public void setDividerColors(int... iArr) {
        this.f6773.m8119(iArr);
    }

    public void setIndicationInterpolator(u3.b bVar) {
        this.f6773.m8120(bVar);
    }

    public void setOnPageChangeListener(ViewPager.j jVar) {
        this.f6782 = jVar;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f6773.m8121(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f6773.removeAllViews();
        this.f6781 = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        viewPager.m5575(new c());
        m8101();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected TextView m8103(CharSequence charSequence) {
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setTextColor(this.f6777);
        textView.setTextSize(0, this.f6778);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        int i5 = this.f6775;
        if (i5 != -1) {
            textView.setBackgroundResource(i5);
        } else {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(R.attr.selectableItemBackground, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
        }
        textView.setAllCaps(this.f6776);
        int i6 = this.f6779;
        textView.setPadding(i6, 0, i6, 0);
        int i7 = this.f6780;
        if (i7 > 0) {
            textView.setMinWidth(i7);
        }
        return textView;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m8104(int i5, int i6) {
        this.f6783 = new f(getContext(), i5, i6);
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        setHorizontalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f5 = displayMetrics.density;
        float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u3.a.f11556, i5, 0);
        int resourceId = obtainStyledAttributes.getResourceId(u3.a.f11561, -1);
        boolean z5 = obtainStyledAttributes.getBoolean(u3.a.f11562, true);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(u3.a.f11563);
        float dimension = obtainStyledAttributes.getDimension(u3.a.f11567, applyDimension);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(u3.a.f11564, (int) (16.0f * f5));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(u3.a.f11566, (int) (0.0f * f5));
        int resourceId2 = obtainStyledAttributes.getResourceId(u3.a.f11559, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(u3.a.f11560, -1);
        boolean z6 = obtainStyledAttributes.getBoolean(u3.a.f11569, false);
        boolean z7 = obtainStyledAttributes.getBoolean(u3.a.f11558, true);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(u3.a.f11553, (int) (f5 * 24.0f));
        obtainStyledAttributes.recycle();
        this.f6774 = layoutDimension;
        this.f6775 = resourceId;
        this.f6776 = z5;
        this.f6777 = colorStateList == null ? ColorStateList.valueOf(-67108864) : colorStateList;
        this.f6778 = dimension;
        this.f6779 = dimensionPixelSize;
        this.f6780 = dimensionPixelSize2;
        this.f6784 = z7 ? new b() : null;
        this.f6785 = z6;
        if (resourceId2 != -1) {
            m8104(resourceId2, resourceId3);
        }
        com.ogaclejapan.smarttablayout.a aVar = new com.ogaclejapan.smarttablayout.a(context, attributeSet);
        this.f6773 = aVar;
        if (z6 && aVar.m8116()) {
            throw new UnsupportedOperationException("'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support");
        }
        setFillViewport(!aVar.m8116());
        addView(aVar, -1, -1);
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f6777 = colorStateList;
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setOnTabClickListener(e eVar) {
    }
}
