package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class g extends ViewGroup {

    /* renamed from: ʾ, reason: contains not printable characters */
    f f2010;

    public f getConstraintSet() {
        if (this.f2010 == null) {
            this.f2010 = new f();
        }
        this.f2010.m1860(this);
        return this.f2010;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    public static class a extends ConstraintLayout.b {

        /* renamed from: ʼʽ, reason: contains not printable characters */
        public float f2011;

        /* renamed from: ʼʾ, reason: contains not printable characters */
        public boolean f2012;

        /* renamed from: ʼʿ, reason: contains not printable characters */
        public float f2013;

        /* renamed from: ʼˆ, reason: contains not printable characters */
        public float f2014;

        /* renamed from: ʼˈ, reason: contains not printable characters */
        public float f2015;

        /* renamed from: ʼˉ, reason: contains not printable characters */
        public float f2016;

        /* renamed from: ʼˊ, reason: contains not printable characters */
        public float f2017;

        /* renamed from: ʼˋ, reason: contains not printable characters */
        public float f2018;

        /* renamed from: ʼˎ, reason: contains not printable characters */
        public float f2019;

        /* renamed from: ʼˏ, reason: contains not printable characters */
        public float f2020;

        /* renamed from: ʼˑ, reason: contains not printable characters */
        public float f2021;

        /* renamed from: ʼי, reason: contains not printable characters */
        public float f2022;

        /* renamed from: ʼـ, reason: contains not printable characters */
        public float f2023;

        public a(int i5, int i6) {
            super(i5, i6);
            this.f2011 = 1.0f;
            this.f2012 = false;
            this.f2013 = 0.0f;
            this.f2014 = 0.0f;
            this.f2015 = 0.0f;
            this.f2016 = 0.0f;
            this.f2017 = 1.0f;
            this.f2018 = 1.0f;
            this.f2019 = 0.0f;
            this.f2020 = 0.0f;
            this.f2021 = 0.0f;
            this.f2022 = 0.0f;
            this.f2023 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2011 = 1.0f;
            this.f2012 = false;
            this.f2013 = 0.0f;
            this.f2014 = 0.0f;
            this.f2015 = 0.0f;
            this.f2016 = 0.0f;
            this.f2017 = 1.0f;
            this.f2018 = 1.0f;
            this.f2019 = 0.0f;
            this.f2020 = 0.0f;
            this.f2021 = 0.0f;
            this.f2022 = 0.0f;
            this.f2023 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f2295);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2296) {
                    this.f2011 = obtainStyledAttributes.getFloat(index, this.f2011);
                } else if (index == l.f2308) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f2013 = obtainStyledAttributes.getFloat(index, this.f2013);
                        this.f2012 = true;
                    }
                } else if (index == l.f2305) {
                    this.f2015 = obtainStyledAttributes.getFloat(index, this.f2015);
                } else if (index == l.f2306) {
                    this.f2016 = obtainStyledAttributes.getFloat(index, this.f2016);
                } else if (index == l.f2304) {
                    this.f2014 = obtainStyledAttributes.getFloat(index, this.f2014);
                } else if (index == l.f2302) {
                    this.f2017 = obtainStyledAttributes.getFloat(index, this.f2017);
                } else if (index == l.f2303) {
                    this.f2018 = obtainStyledAttributes.getFloat(index, this.f2018);
                } else if (index == l.f2297) {
                    this.f2019 = obtainStyledAttributes.getFloat(index, this.f2019);
                } else if (index == l.f2298) {
                    this.f2020 = obtainStyledAttributes.getFloat(index, this.f2020);
                } else if (index == l.f2300) {
                    this.f2021 = obtainStyledAttributes.getFloat(index, this.f2021);
                } else if (index == l.f2301) {
                    this.f2022 = obtainStyledAttributes.getFloat(index, this.f2022);
                } else if (index == l.f2307 && Build.VERSION.SDK_INT >= 21) {
                    this.f2023 = obtainStyledAttributes.getFloat(index, this.f2023);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
    }
}
