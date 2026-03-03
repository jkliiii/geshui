package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.f5;
import androidx.core.view.w4;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.List;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class f extends w4.b {

    /* renamed from: ʽ, reason: contains not printable characters */
    private final View f5348;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f5349;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5350;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int[] f5351;

    public f(View view) {
        super(0);
        this.f5351 = new int[2];
        this.f5348 = view;
    }

    @Override // androidx.core.view.w4.b
    /* renamed from: ʼ */
    public void mo3395(w4 w4Var) {
        this.f5348.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.w4.b
    /* renamed from: ʽ */
    public void mo3396(w4 w4Var) {
        this.f5348.getLocationOnScreen(this.f5351);
        this.f5349 = this.f5351[1];
    }

    @Override // androidx.core.view.w4.b
    /* renamed from: ʾ */
    public f5 mo3397(f5 f5Var, List<w4> list) {
        Iterator<w4> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().m3388() & f5.m.m3128()) != 0) {
                this.f5348.setTranslationY(AnimationUtils.lerp(this.f5350, 0, r0.m3387()));
                break;
            }
        }
        return f5Var;
    }

    @Override // androidx.core.view.w4.b
    /* renamed from: ʿ */
    public w4.a mo3398(w4 w4Var, w4.a aVar) {
        this.f5348.getLocationOnScreen(this.f5351);
        int i5 = this.f5349 - this.f5351[1];
        this.f5350 = i5;
        this.f5348.setTranslationY(i5);
        return aVar;
    }
}
