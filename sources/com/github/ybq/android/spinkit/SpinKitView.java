package com.github.ybq.android.spinkit;

import a2.a;
import a2.b;
import a2.c;
import a2.d;
import a2.e;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import d2.f;

/* loaded from: E:\78999\cookie_5123796.dex */
public class SpinKitView extends ProgressBar {

    /* renamed from: ʾ, reason: contains not printable characters */
    private e f5245;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f5246;

    /* renamed from: ˆ, reason: contains not printable characters */
    private f f5247;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f91);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m6175() {
        f m180 = d.m180(this.f5245);
        m180.mo8195(this.f5246);
        setIndeterminateDrawable(m180);
    }

    @Override // android.view.View
    public void onScreenStateChanged(int i5) {
        f fVar;
        super.onScreenStateChanged(i5);
        if (i5 != 0 || (fVar = this.f5247) == null) {
            return;
        }
        fVar.stop();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z5) {
        super.onWindowFocusChanged(z5);
        if (z5 && this.f5247 != null && getVisibility() == 0) {
            this.f5247.start();
        }
    }

    public void setColor(int i5) {
        this.f5246 = i5;
        f fVar = this.f5247;
        if (fVar != null) {
            fVar.mo8195(i5);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof f)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((f) drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof f) {
            ((f) drawable).stop();
        }
    }

    public SpinKitView(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, b.f92);
    }

    @Override // android.widget.ProgressBar
    public f getIndeterminateDrawable() {
        return this.f5247;
    }

    @TargetApi(21)
    public SpinKitView(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f93, i5, i6);
        this.f5245 = e.values()[obtainStyledAttributes.getInt(c.f95, 0)];
        this.f5246 = obtainStyledAttributes.getColor(c.f94, -1);
        obtainStyledAttributes.recycle();
        m6175();
        setIndeterminate(true);
    }

    public void setIndeterminateDrawable(f fVar) {
        super.setIndeterminateDrawable((Drawable) fVar);
        this.f5247 = fVar;
        if (fVar.mo8194() == 0) {
            this.f5247.mo8195(this.f5246);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.f5247.start();
        }
    }
}
