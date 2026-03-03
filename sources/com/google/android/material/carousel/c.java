package com.google.android.material.carousel;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CarouselOrientationHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    final int f5430;

    /* compiled from: CarouselOrientationHelper.java */
    class a extends c {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ CarouselLayoutManager f5431;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i5, CarouselLayoutManager carouselLayoutManager) {
            super(i5, null);
            this.f5431 = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ʻ */
        public void mo6366(RectF rectF, RectF rectF2, RectF rectF3) {
            float f5 = rectF2.top;
            float f6 = rectF3.top;
            if (f5 < f6 && rectF2.bottom > f6) {
                float f7 = f6 - f5;
                rectF.top += f7;
                rectF3.top += f7;
            }
            float f8 = rectF2.bottom;
            float f9 = rectF3.bottom;
            if (f8 <= f9 || rectF2.top >= f9) {
                return;
            }
            float f10 = f8 - f9;
            rectF.bottom = Math.max(rectF.bottom - f10, rectF.top);
            rectF2.bottom = Math.max(rectF2.bottom - f10, rectF2.top);
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ʿ */
        public float mo6367(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˆ */
        public RectF mo6368(float f5, float f6, float f7, float f8) {
            return new RectF(0.0f, f7, f6, f5 - f7);
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˈ */
        int mo6369() {
            return this.f5431.getHeight();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˉ */
        int mo6370() {
            return mo6369();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˊ */
        int mo6371() {
            return this.f5431.getPaddingLeft();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˋ */
        int mo6372() {
            return this.f5431.getWidth() - this.f5431.getPaddingRight();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˎ */
        int mo6373() {
            return mo6374();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˏ */
        int mo6374() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˑ */
        public void mo6375(View view, int i5, int i6) {
            this.f5431.layoutDecoratedWithMargins(view, mo6371(), i5, mo6372(), i6);
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: י */
        public void mo6376(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.bottom <= rectF3.top) {
                rectF.bottom = ((float) Math.floor(rectF.bottom)) - 1.0f;
            }
            if (rectF2.top >= rectF3.bottom) {
                rectF.top = ((float) Math.ceil(rectF.top)) + 1.0f;
            }
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ـ */
        public void mo6377(View view, Rect rect, float f5, float f6) {
            view.offsetTopAndBottom((int) (f6 - (rect.top + f5)));
        }
    }

    /* compiled from: CarouselOrientationHelper.java */
    class b extends c {

        /* renamed from: ʼ, reason: contains not printable characters */
        final /* synthetic */ CarouselLayoutManager f5432;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i5, CarouselLayoutManager carouselLayoutManager) {
            super(i5, null);
            this.f5432 = carouselLayoutManager;
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ʻ */
        public void mo6366(RectF rectF, RectF rectF2, RectF rectF3) {
            float f5 = rectF2.left;
            float f6 = rectF3.left;
            if (f5 < f6 && rectF2.right > f6) {
                float f7 = f6 - f5;
                rectF.left += f7;
                rectF2.left += f7;
            }
            float f8 = rectF2.right;
            float f9 = rectF3.right;
            if (f8 <= f9 || rectF2.left >= f9) {
                return;
            }
            float f10 = f8 - f9;
            rectF.right = Math.max(rectF.right - f10, rectF.left);
            rectF2.right = Math.max(rectF2.right - f10, rectF2.left);
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ʿ */
        public float mo6367(RecyclerView.q qVar) {
            return ((ViewGroup.MarginLayoutParams) qVar).rightMargin + ((ViewGroup.MarginLayoutParams) qVar).leftMargin;
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˆ */
        public RectF mo6368(float f5, float f6, float f7, float f8) {
            return new RectF(f8, 0.0f, f6 - f8, f5);
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˈ */
        int mo6369() {
            return this.f5432.getHeight() - this.f5432.getPaddingBottom();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˉ */
        int mo6370() {
            return this.f5432.isLayoutRtl() ? mo6371() : mo6372();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˊ */
        int mo6371() {
            return 0;
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˋ */
        int mo6372() {
            return this.f5432.getWidth();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˎ */
        int mo6373() {
            return this.f5432.isLayoutRtl() ? mo6372() : mo6371();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˏ */
        int mo6374() {
            return this.f5432.getPaddingTop();
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ˑ */
        public void mo6375(View view, int i5, int i6) {
            this.f5432.layoutDecoratedWithMargins(view, i5, mo6374(), i6, mo6369());
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: י */
        public void mo6376(RectF rectF, RectF rectF2, RectF rectF3) {
            if (rectF2.right <= rectF3.left) {
                rectF.right = ((float) Math.floor(rectF.right)) - 1.0f;
            }
            if (rectF2.left >= rectF3.right) {
                rectF.left = ((float) Math.ceil(rectF.left)) + 1.0f;
            }
        }

        @Override // com.google.android.material.carousel.c
        /* renamed from: ـ */
        public void mo6377(View view, Rect rect, float f5, float f6) {
            view.offsetLeftAndRight((int) (f6 - (rect.left + f5)));
        }
    }

    /* synthetic */ c(int i5, a aVar) {
        this(i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static c m6363(CarouselLayoutManager carouselLayoutManager) {
        return new b(0, carouselLayoutManager);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static c m6364(CarouselLayoutManager carouselLayoutManager, int i5) {
        if (i5 == 0) {
            return m6363(carouselLayoutManager);
        }
        if (i5 == 1) {
            return m6365(carouselLayoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private static c m6365(CarouselLayoutManager carouselLayoutManager) {
        return new a(1, carouselLayoutManager);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    abstract void mo6366(RectF rectF, RectF rectF2, RectF rectF3);

    /* renamed from: ʿ, reason: contains not printable characters */
    abstract float mo6367(RecyclerView.q qVar);

    /* renamed from: ˆ, reason: contains not printable characters */
    abstract RectF mo6368(float f5, float f6, float f7, float f8);

    /* renamed from: ˈ, reason: contains not printable characters */
    abstract int mo6369();

    /* renamed from: ˉ, reason: contains not printable characters */
    abstract int mo6370();

    /* renamed from: ˊ, reason: contains not printable characters */
    abstract int mo6371();

    /* renamed from: ˋ, reason: contains not printable characters */
    abstract int mo6372();

    /* renamed from: ˎ, reason: contains not printable characters */
    abstract int mo6373();

    /* renamed from: ˏ, reason: contains not printable characters */
    abstract int mo6374();

    /* renamed from: ˑ, reason: contains not printable characters */
    abstract void mo6375(View view, int i5, int i6);

    /* renamed from: י, reason: contains not printable characters */
    abstract void mo6376(RectF rectF, RectF rectF2, RectF rectF3);

    /* renamed from: ـ, reason: contains not printable characters */
    abstract void mo6377(View view, Rect rect, float f5, float f6);

    private c(int i5) {
        this.f5430 = i5;
    }
}
