package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class b extends c {
    b() {
    }

    @Override // com.google.android.material.tabs.c
    /* renamed from: ʾ */
    void mo7269(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable) {
        if (f5 >= 0.5f) {
            view = view2;
        }
        RectF m7270 = c.m7270(tabLayout, view);
        float lerp = f5 < 0.5f ? AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f5) : AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f5);
        drawable.setBounds((int) m7270.left, drawable.getBounds().top, (int) m7270.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (lerp * 255.0f));
    }
}
