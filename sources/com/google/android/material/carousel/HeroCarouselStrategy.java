package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public class HeroCarouselStrategy extends CarouselStrategy {
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {0, 1};

    @Override // com.google.android.material.carousel.CarouselStrategy
    e onFirstChildMeasuredWithMargins(b bVar, View view) {
        int containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f5 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredWidth = view.getMeasuredWidth() * 2;
        if (bVar.isHorizontal()) {
            f5 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredWidth = view.getMeasuredHeight() * 2;
        }
        float m6381 = d.m6381(view.getContext()) + f5;
        float m6380 = d.m6380(view.getContext()) + f5;
        float f6 = containerHeight;
        float min = Math.min(measuredWidth + f5, f6);
        float m12443 = w.a.m12443((measuredWidth / 3.0f) + f5, d.m6381(view.getContext()) + f5, d.m6380(view.getContext()) + f5);
        float f7 = (min + m12443) / 2.0f;
        int max = (int) Math.max(1.0d, Math.floor((f6 - (d.m6382(SMALL_COUNTS) * m6380)) / min));
        int ceil = (((int) Math.ceil(f6 / min)) - max) + 1;
        int[] iArr = new int[ceil];
        for (int i5 = 0; i5 < ceil; i5++) {
            iArr[i5] = max + i5;
        }
        return d.m6378(view.getContext(), f5, f6, a.m6359(f6, m12443, m6381, m6380, SMALL_COUNTS, f7, MEDIUM_COUNTS, min, iArr));
    }
}
