package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class c {
    c() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    static RectF m7270(TabLayout tabLayout, View view) {
        return view == null ? new RectF() : (tabLayout.isTabIndicatorFullWidth() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : m7271((TabLayout.TabView) view, 24);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static RectF m7271(TabLayout.TabView tabView, int i5) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int dpToPx = (int) ViewUtils.dpToPx(tabView.getContext(), i5);
        if (contentWidth < dpToPx) {
            contentWidth = dpToPx;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top2 = (tabView.getTop() + tabView.getBottom()) / 2;
        int i6 = contentWidth / 2;
        return new RectF(left - i6, top2 - (contentHeight / 2), i6 + left, top2 + (left / 2));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    void m7272(TabLayout tabLayout, View view, Drawable drawable) {
        RectF m7270 = m7270(tabLayout, view);
        drawable.setBounds((int) m7270.left, drawable.getBounds().top, (int) m7270.right, drawable.getBounds().bottom);
    }

    /* renamed from: ʾ */
    void mo7269(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        RectF m7270 = m7270(tabLayout, view);
        RectF m72702 = m7270(tabLayout, view2);
        drawable.setBounds(AnimationUtils.lerp((int) m7270.left, (int) m72702.left, f5), drawable.getBounds().top, AnimationUtils.lerp((int) m7270.right, (int) m72702.right, f5), drawable.getBounds().bottom);
    }
}
