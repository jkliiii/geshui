package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: KeylineState.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final float f5433;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final List<c> f5434;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final int f5435;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f5436;

    /* compiled from: KeylineState.java */
    static final class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final float f5437;

        /* renamed from: ʽ, reason: contains not printable characters */
        private c f5439;

        /* renamed from: ʾ, reason: contains not printable characters */
        private c f5440;

        /* renamed from: ʼ, reason: contains not printable characters */
        private final List<c> f5438 = new ArrayList();

        /* renamed from: ʿ, reason: contains not printable characters */
        private int f5441 = -1;

        /* renamed from: ˆ, reason: contains not printable characters */
        private int f5442 = -1;

        /* renamed from: ˈ, reason: contains not printable characters */
        private float f5443 = 0.0f;

        b(float f5) {
            this.f5437 = f5;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        private static float m6393(float f5, float f6, int i5, int i6) {
            return (f5 - (i5 * f6)) + (i6 * f6);
        }

        @CanIgnoreReturnValue
        /* renamed from: ʻ, reason: contains not printable characters */
        b m6394(float f5, float f6, float f7) {
            return m6395(f5, f6, f7, false);
        }

        @CanIgnoreReturnValue
        /* renamed from: ʼ, reason: contains not printable characters */
        b m6395(float f5, float f6, float f7, boolean z5) {
            if (f7 <= 0.0f) {
                return this;
            }
            c cVar = new c(Float.MIN_VALUE, f5, f6, f7);
            if (z5) {
                if (this.f5439 == null) {
                    this.f5439 = cVar;
                    this.f5441 = this.f5438.size();
                }
                if (this.f5442 != -1 && this.f5438.size() - this.f5442 > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f7 != this.f5439.f5447) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f5440 = cVar;
                this.f5442 = this.f5438.size();
            } else {
                if (this.f5439 == null && cVar.f5447 < this.f5443) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f5440 != null && cVar.f5447 > this.f5443) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f5443 = cVar.f5447;
            this.f5438.add(cVar);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: ʽ, reason: contains not printable characters */
        b m6396(float f5, float f6, float f7, int i5) {
            return m6397(f5, f6, f7, i5, false);
        }

        @CanIgnoreReturnValue
        /* renamed from: ʾ, reason: contains not printable characters */
        b m6397(float f5, float f6, float f7, int i5, boolean z5) {
            if (i5 > 0 && f7 > 0.0f) {
                for (int i6 = 0; i6 < i5; i6++) {
                    m6395((i6 * f7) + f5, f6, f7, z5);
                }
            }
            return this;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        e m6398() {
            if (this.f5439 == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < this.f5438.size(); i5++) {
                c cVar = this.f5438.get(i5);
                arrayList.add(new c(m6393(this.f5439.f5445, this.f5437, this.f5441, i5), cVar.f5445, cVar.f5446, cVar.f5447));
            }
            return new e(this.f5437, arrayList, this.f5441, this.f5442);
        }
    }

    /* compiled from: KeylineState.java */
    static final class c {

        /* renamed from: ʻ, reason: contains not printable characters */
        final float f5444;

        /* renamed from: ʼ, reason: contains not printable characters */
        final float f5445;

        /* renamed from: ʽ, reason: contains not printable characters */
        final float f5446;

        /* renamed from: ʾ, reason: contains not printable characters */
        final float f5447;

        c(float f5, float f6, float f7, float f8) {
            this.f5444 = f5;
            this.f5445 = f6;
            this.f5446 = f7;
            this.f5447 = f8;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static c m6399(c cVar, c cVar2, float f5) {
            return new c(AnimationUtils.lerp(cVar.f5444, cVar2.f5444, f5), AnimationUtils.lerp(cVar.f5445, cVar2.f5445, f5), AnimationUtils.lerp(cVar.f5446, cVar2.f5446, f5), AnimationUtils.lerp(cVar.f5447, cVar2.f5447, f5));
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static e m6383(e eVar, e eVar2, float f5) {
        if (eVar.m6388() != eVar2.m6388()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List<c> m6389 = eVar.m6389();
        List<c> m63892 = eVar2.m6389();
        if (m6389.size() != m63892.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < eVar.m6389().size(); i5++) {
            arrayList.add(c.m6399(m6389.get(i5), m63892.get(i5), f5));
        }
        return new e(eVar.m6388(), arrayList, AnimationUtils.lerp(eVar.m6386(), eVar2.m6386(), f5), AnimationUtils.lerp(eVar.m6391(), eVar2.m6391(), f5));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static e m6384(e eVar) {
        b bVar = new b(eVar.m6388());
        float f5 = eVar.m6387().f5445 - (eVar.m6387().f5447 / 2.0f);
        int size = eVar.m6389().size() - 1;
        while (size >= 0) {
            c cVar = eVar.m6389().get(size);
            bVar.m6395((cVar.f5447 / 2.0f) + f5, cVar.f5446, cVar.f5447, size >= eVar.m6386() && size <= eVar.m6391());
            f5 += cVar.f5447;
            size--;
        }
        return bVar.m6398();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    c m6385() {
        return this.f5434.get(this.f5435);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    int m6386() {
        return this.f5435;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    c m6387() {
        return this.f5434.get(0);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    float m6388() {
        return this.f5433;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    List<c> m6389() {
        return this.f5434;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    c m6390() {
        return this.f5434.get(this.f5436);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    int m6391() {
        return this.f5436;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    c m6392() {
        return this.f5434.get(r0.size() - 1);
    }

    private e(float f5, List<c> list, int i5, int i6) {
        this.f5433 = f5;
        this.f5434 = Collections.unmodifiableList(list);
        this.f5435 = i5;
        this.f5436 = i6;
    }
}
