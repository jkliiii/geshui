package com.google.android.material.carousel;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.carousel.e;

/* compiled from: CarouselStrategyHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d {
    /* renamed from: ʻ, reason: contains not printable characters */
    static e m6378(Context context, float f5, float f6, a aVar) {
        float m6379 = m6379(context) + f5;
        float f7 = m6379 / 2.0f;
        float f8 = 0.0f - f7;
        float f9 = (aVar.f5427 / 2.0f) + 0.0f;
        float max = Math.max(0, aVar.f5428 - 1);
        float f10 = aVar.f5427;
        float f11 = (max * f10) + f9;
        float f12 = (f10 / 2.0f) + f11;
        int i5 = aVar.f5425;
        if (i5 > 0) {
            f11 = (aVar.f5426 / 2.0f) + f12;
        }
        if (i5 > 0) {
            f12 = (aVar.f5426 / 2.0f) + f11;
        }
        float f13 = aVar.f5424 > 0 ? f12 + (aVar.f5423 / 2.0f) : f11;
        float f14 = f6 + f7;
        float childMaskPercentage = CarouselStrategy.getChildMaskPercentage(m6379, f10, f5);
        float childMaskPercentage2 = CarouselStrategy.getChildMaskPercentage(aVar.f5423, aVar.f5427, f5);
        float childMaskPercentage3 = CarouselStrategy.getChildMaskPercentage(aVar.f5426, aVar.f5427, f5);
        e.b m6397 = new e.b(aVar.f5427).m6394(f8, childMaskPercentage, m6379).m6397(f9, 0.0f, aVar.f5427, aVar.f5428, true);
        if (aVar.f5425 > 0) {
            m6397.m6394(f11, childMaskPercentage3, aVar.f5426);
        }
        int i6 = aVar.f5424;
        if (i6 > 0) {
            m6397.m6396(f13, childMaskPercentage2, aVar.f5423, i6);
        }
        m6397.m6394(f14, childMaskPercentage, m6379);
        return m6397.m6398();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static float m6379(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_gone_size);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static float m6380(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static float m6381(Context context) {
        return context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static int m6382(int[] iArr) {
        int i5 = RecyclerView.UNDEFINED_DURATION;
        for (int i6 : iArr) {
            if (i6 > i5) {
                i5 = i6;
            }
        }
        return i5;
    }
}
