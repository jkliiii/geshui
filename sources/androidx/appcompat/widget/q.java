package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class q extends ImageView implements androidx.core.view.c1, androidx.core.widget.s0 {
    private final e mBackgroundTintHelper;
    private boolean mHasLevel;
    private final p mImageHelper;

    public q(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1204();
        }
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.m1465();
        }
    }

    @Override // androidx.core.view.c1
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.m1205();
        }
        return null;
    }

    @Override // androidx.core.view.c1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.m1206();
        }
        return null;
    }

    @Override // androidx.core.widget.s0
    public ColorStateList getSupportImageTintList() {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            return pVar.m1466();
        }
        return null;
    }

    @Override // androidx.core.widget.s0
    public PorterDuff.Mode getSupportImageTintMode() {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            return pVar.m1467();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.m1468() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1208(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1209(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.m1465();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        p pVar = this.mImageHelper;
        if (pVar != null && drawable != null && !this.mHasLevel) {
            pVar.m1470(drawable);
        }
        super.setImageDrawable(drawable);
        p pVar2 = this.mImageHelper;
        if (pVar2 != null) {
            pVar2.m1465();
            if (this.mHasLevel) {
                return;
            }
            this.mImageHelper.m1464();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i5) {
        super.setImageLevel(i5);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.m1471(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.m1465();
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1211(colorStateList);
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.m1212(mode);
        }
    }

    @Override // androidx.core.widget.s0
    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.m1472(colorStateList);
        }
    }

    @Override // androidx.core.widget.s0
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.mImageHelper;
        if (pVar != null) {
            pVar.m1473(mode);
        }
    }

    public q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q(Context context, AttributeSet attributeSet, int i5) {
        super(a3.m1138(context), attributeSet, i5);
        this.mHasLevel = false;
        y2.m1650(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.m1207(attributeSet, i5);
        p pVar = new p(this);
        this.mImageHelper = pVar;
        pVar.m1469(attributeSet, i5);
    }
}
