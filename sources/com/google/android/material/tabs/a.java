package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a extends c {
    a() {
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private static float m7267(float f5) {
        double d6 = f5;
        Double.isNaN(d6);
        return (float) (1.0d - Math.cos((d6 * 3.141592653589793d) / 2.0d));
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static float m7268(float f5) {
        double d6 = f5;
        Double.isNaN(d6);
        return (float) Math.sin((d6 * 3.141592653589793d) / 2.0d);
    }

    @Override // com.google.android.material.tabs.c
    /* renamed from: ʾ, reason: contains not printable characters */
    void mo7269(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        float m7268;
        float m7267;
        RectF m7270 = c.m7270(tabLayout, view);
        RectF m72702 = c.m7270(tabLayout, view2);
        if (m7270.left < m72702.left) {
            m7268 = m7267(f5);
            m7267 = m7268(f5);
        } else {
            m7268 = m7268(f5);
            m7267 = m7267(f5);
        }
        drawable.setBounds(AnimationUtils.lerp((int) m7270.left, (int) m72702.left, m7268), drawable.getBounds().top, AnimationUtils.lerp((int) m7270.right, (int) m72702.right, m7267), drawable.getBounds().bottom);
    }
}
