package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.f1;
import com.google.android.material.R;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: RadialViewGroup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class g extends ConstraintLayout {

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private int f6359;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private MaterialShapeDrawable f6360;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final Runnable f6361;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m7605() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f6361);
            handler.post(this.f6361);
        }
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private void m7606(List<View> list, androidx.constraintlayout.widget.f fVar, int i5) {
        Iterator<View> it = list.iterator();
        float f5 = 0.0f;
        while (it.hasNext()) {
            fVar.m1861(it.next().getId(), R.id.circle_center, i5, f5);
            f5 += 360.0f / list.size();
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private Drawable m7607() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f6360 = materialShapeDrawable;
        materialShapeDrawable.setCornerSize(new RelativeCornerSize(0.5f));
        this.f6360.setFillColor(ColorStateList.valueOf(-1));
        return this.f6360;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private static boolean m7608(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i5, layoutParams);
        if (view.getId() == -1) {
            view.setId(f1.m2880());
        }
        m7605();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        mo7556();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        m7605();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        this.f6360.setFillColor(ColorStateList.valueOf(i5));
    }

    /* renamed from: ᐧᐧ */
    protected void mo7556() {
        androidx.constraintlayout.widget.f fVar = new androidx.constraintlayout.widget.f();
        fVar.m1859(this);
        HashMap hashMap = new HashMap();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() != R.id.circle_center && !m7608(childAt)) {
                int i6 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i6 == null) {
                    i6 = 1;
                }
                if (!hashMap.containsKey(i6)) {
                    hashMap.put(i6, new ArrayList());
                }
                ((List) hashMap.get(i6)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            m7606((List) entry.getValue(), fVar, m7609(((Integer) entry.getKey()).intValue()));
        }
        fVar.m1856(this);
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    int m7609(int i5) {
        return i5 == 2 ? Math.round(this.f6359 * 0.66f) : this.f6359;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public int m7610() {
        return this.f6359;
    }

    /* renamed from: ﾞ */
    public void mo7557(int i5) {
        this.f6359 = i5;
        mo7556();
    }

    public g(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        f1.m2836(this, m7607());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i5, 0);
        this.f6359 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f6361 = new Runnable() { // from class: com.google.android.material.timepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f6358.mo7556();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
