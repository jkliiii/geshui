package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public final class MultiBrowseCarouselStrategy extends CarouselStrategy {
    private final boolean forceCompactArrangement;
    private static final int[] SMALL_COUNTS = {1};
    private static final int[] MEDIUM_COUNTS = {1, 0};
    private static final int[] MEDIUM_COUNTS_COMPACT = {0};

    public MultiBrowseCarouselStrategy() {
        this(false);
    }

    @Override // com.google.android.material.carousel.CarouselStrategy
    e onFirstChildMeasuredWithMargins(b bVar, View view) {
        float containerHeight = bVar.getContainerHeight();
        if (bVar.isHorizontal()) {
            containerHeight = bVar.getContainerWidth();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f5 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.isHorizontal()) {
            f5 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f6 = f5;
        float m6381 = d.m6381(view.getContext()) + f6;
        float m6380 = d.m6380(view.getContext()) + f6;
        float min = Math.min(measuredHeight + f6, containerHeight);
        float m12443 = w.a.m12443((measuredHeight / 3.0f) + f6, d.m6381(view.getContext()) + f6, d.m6380(view.getContext()) + f6);
        float f7 = (min + m12443) / 2.0f;
        int[] iArr = SMALL_COUNTS;
        int[] iArr2 = this.forceCompactArrangement ? MEDIUM_COUNTS_COMPACT : MEDIUM_COUNTS;
        int max = (int) Math.max(1.0d, Math.floor(((containerHeight - (d.m6382(iArr2) * f7)) - (d.m6382(iArr) * m6380)) / min));
        int ceil = (int) Math.ceil(containerHeight / min);
        int i5 = (ceil - max) + 1;
        int[] iArr3 = new int[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            iArr3[i6] = ceil - i6;
        }
        return d.m6378(view.getContext(), f6, containerHeight, a.m6359(containerHeight, m12443, m6381, m6380, iArr, f7, iArr2, min, iArr3));
    }

    public MultiBrowseCarouselStrategy(boolean z5) {
        this.forceCompactArrangement = z5;
    }
}
