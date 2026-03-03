package com.afollestad.materialdialogs.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;
import w0.e;
import w0.i;
import y0.a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: E:\78999\cookie_5123796.dex */
public class MDButton extends TextView {

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f5059;

    /* renamed from: ʿ, reason: contains not printable characters */
    private e f5060;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f5061;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Drawable f5062;

    /* renamed from: ˉ, reason: contains not printable characters */
    private Drawable f5063;

    public MDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5059 = false;
        m5984(context);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m5984(Context context) {
        this.f5061 = context.getResources().getDimensionPixelSize(i.f11960);
        this.f5060 = e.END;
    }

    public void setAllCapsCompat(boolean z5) {
        setAllCaps(z5);
    }

    public void setDefaultSelector(Drawable drawable) {
        this.f5063 = drawable;
        if (this.f5059) {
            return;
        }
        m5985(false, true);
    }

    public void setStackedGravity(e eVar) {
        this.f5060 = eVar;
    }

    public void setStackedSelector(Drawable drawable) {
        this.f5062 = drawable;
        if (this.f5059) {
            m5985(true, true);
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m5985(boolean z5, boolean z6) {
        if (this.f5059 != z5 || z6) {
            setGravity(z5 ? this.f5060.m12462() | 16 : 17);
            setTextAlignment(z5 ? this.f5060.m12463() : 4);
            a.m12857(this, z5 ? this.f5062 : this.f5063);
            if (z5) {
                setPadding(this.f5061, getPaddingTop(), this.f5061, getPaddingBottom());
            }
            this.f5059 = z5;
        }
    }
}
