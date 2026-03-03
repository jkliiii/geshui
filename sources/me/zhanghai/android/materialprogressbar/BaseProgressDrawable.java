package me.zhanghai.android.materialprogressbar;

/* loaded from: E:\78999\cookie_5123796.dex */
abstract class BaseProgressDrawable extends BasePaintDrawable implements IntrinsicPaddingDrawable {
    protected boolean mUseIntrinsicPadding = true;

    BaseProgressDrawable() {
    }

    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public boolean getUseIntrinsicPadding() {
        return this.mUseIntrinsicPadding;
    }

    @Override // me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
    public void setUseIntrinsicPadding(boolean z5) {
        if (this.mUseIntrinsicPadding != z5) {
            this.mUseIntrinsicPadding = z5;
            invalidateSelf();
        }
    }
}
