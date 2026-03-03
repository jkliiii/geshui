package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* compiled from: SwitchCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class x2 extends CompoundButton {
    private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private static final int THUMB_ANIMATION_DURATION = 250;
    private static final int TOUCH_MODE_DOWN = 1;
    private static final int TOUCH_MODE_DRAGGING = 2;
    private static final int TOUCH_MODE_IDLE = 0;
    private m mAppCompatEmojiTextHelper;
    private c mEmojiCompatInitCallback;
    private boolean mEnforceSwitchWidth;
    private boolean mHasThumbTint;
    private boolean mHasThumbTintMode;
    private boolean mHasTrackTint;
    private boolean mHasTrackTintMode;
    private int mMinFlingVelocity;
    private Layout mOffLayout;
    private Layout mOnLayout;
    ObjectAnimator mPositionAnimator;
    private boolean mShowText;
    private boolean mSplitTrack;
    private int mSwitchBottom;
    private int mSwitchHeight;
    private int mSwitchLeft;
    private int mSwitchMinWidth;
    private int mSwitchPadding;
    private int mSwitchRight;
    private int mSwitchTop;
    private TransformationMethod mSwitchTransformationMethod;
    private int mSwitchWidth;
    private final Rect mTempRect;
    private ColorStateList mTextColors;
    private final y0 mTextHelper;
    private CharSequence mTextOff;
    private CharSequence mTextOffTransformed;
    private CharSequence mTextOn;
    private CharSequence mTextOnTransformed;
    private final TextPaint mTextPaint;
    private Drawable mThumbDrawable;
    float mThumbPosition;
    private int mThumbTextPadding;
    private ColorStateList mThumbTintList;
    private PorterDuff.Mode mThumbTintMode;
    private int mThumbWidth;
    private int mTouchMode;
    private int mTouchSlop;
    private float mTouchX;
    private float mTouchY;
    private Drawable mTrackDrawable;
    private ColorStateList mTrackTintList;
    private PorterDuff.Mode mTrackTintMode;
    private VelocityTracker mVelocityTracker;
    private static final Property<x2, Float> THUMB_POS = new a(Float.class, "thumbPos");
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};

    /* compiled from: SwitchCompat.java */
    class a extends Property<x2, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public Float get(x2 x2Var) {
            return Float.valueOf(x2Var.mThumbPosition);
        }

        @Override // android.util.Property
        /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void set(x2 x2Var, Float f5) {
            x2Var.setThumbPosition(f5.floatValue());
        }
    }

    /* compiled from: SwitchCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1603(ObjectAnimator objectAnimator, boolean z5) {
            objectAnimator.setAutoCancel(z5);
        }
    }

    /* compiled from: SwitchCompat.java */
    static class c extends e.AbstractC0043e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Reference<x2> f1509;

        c(x2 x2Var) {
            this.f1509 = new WeakReference(x2Var);
        }

        @Override // androidx.emoji2.text.e.AbstractC0043e
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo1604(Throwable th) {
            x2 x2Var = this.f1509.get();
            if (x2Var != null) {
                x2Var.onEmojiCompatInitializedForSwitchText();
            }
        }

        @Override // androidx.emoji2.text.e.AbstractC0043e
        /* renamed from: ʼ, reason: contains not printable characters */
        public void mo1605() {
            x2 x2Var = this.f1509.get();
            if (x2Var != null) {
                x2Var.onEmojiCompatInitializedForSwitchText();
            }
        }
    }

    public x2(Context context) {
        this(context, null);
    }

    private void animateThumbToCheckedState(boolean z5) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, THUMB_POS, z5 ? 1.0f : 0.0f);
        this.mPositionAnimator = ofFloat;
        ofFloat.setDuration(250L);
        b.m1603(this.mPositionAnimator, true);
        this.mPositionAnimator.start();
    }

    private void applyThumbTint() {
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            if (this.mHasThumbTint || this.mHasThumbTintMode) {
                Drawable mutate = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
                this.mThumbDrawable = mutate;
                if (this.mHasThumbTint) {
                    androidx.core.graphics.drawable.a.m2210(mutate, this.mThumbTintList);
                }
                if (this.mHasThumbTintMode) {
                    androidx.core.graphics.drawable.a.m2211(this.mThumbDrawable, this.mThumbTintMode);
                }
                if (this.mThumbDrawable.isStateful()) {
                    this.mThumbDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void applyTrackTint() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            if (this.mHasTrackTint || this.mHasTrackTintMode) {
                Drawable mutate = androidx.core.graphics.drawable.a.m2213(drawable).mutate();
                this.mTrackDrawable = mutate;
                if (this.mHasTrackTint) {
                    androidx.core.graphics.drawable.a.m2210(mutate, this.mTrackTintList);
                }
                if (this.mHasTrackTintMode) {
                    androidx.core.graphics.drawable.a.m2211(this.mTrackDrawable, this.mTrackTintMode);
                }
                if (this.mTrackDrawable.isStateful()) {
                    this.mTrackDrawable.setState(getDrawableState());
                }
            }
        }
    }

    private void cancelPositionAnimator() {
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void cancelSuperTouch(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float constrain(float f5, float f6, float f7) {
        return f5 < f6 ? f6 : f5 > f7 ? f7 : f5;
    }

    private CharSequence doTransformForOnOffText(CharSequence charSequence) {
        TransformationMethod m1424 = getEmojiTextViewHelper().m1424(this.mSwitchTransformationMethod);
        return m1424 != null ? m1424.getTransformation(charSequence, this) : charSequence;
    }

    private m getEmojiTextViewHelper() {
        if (this.mAppCompatEmojiTextHelper == null) {
            this.mAppCompatEmojiTextHelper = new m(this);
        }
        return this.mAppCompatEmojiTextHelper;
    }

    private boolean getTargetCheckedState() {
        return this.mThumbPosition > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((p3.m1477(this) ? 1.0f - this.mThumbPosition : this.mThumbPosition) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.mTrackDrawable;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.mTempRect;
        drawable.getPadding(rect);
        Drawable drawable2 = this.mThumbDrawable;
        Rect m1145 = drawable2 != null ? b2.m1145(drawable2) : b2.f1164;
        return ((((this.mSwitchWidth - this.mThumbWidth) - rect.left) - rect.right) - m1145.left) - m1145.right;
    }

    private boolean hitThumb(float f5, float f6) {
        if (this.mThumbDrawable == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.mThumbDrawable.getPadding(this.mTempRect);
        int i5 = this.mSwitchTop;
        int i6 = this.mTouchSlop;
        int i7 = i5 - i6;
        int i8 = (this.mSwitchLeft + thumbOffset) - i6;
        int i9 = this.mThumbWidth + i8;
        Rect rect = this.mTempRect;
        return f5 > ((float) i8) && f5 < ((float) (((i9 + rect.left) + rect.right) + i6)) && f6 > ((float) i7) && f6 < ((float) (this.mSwitchBottom + i6));
    }

    private Layout makeLayout(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.mTextPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void setOffStateDescriptionOnRAndAbove() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOff;
            if (charSequence == null) {
                charSequence = getResources().getString(e.h.f7060);
            }
            androidx.core.view.f1.m2851(this, charSequence);
        }
    }

    private void setOnStateDescriptionOnRAndAbove() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.mTextOn;
            if (charSequence == null) {
                charSequence = getResources().getString(e.h.f7061);
            }
            androidx.core.view.f1.m2851(this, charSequence);
        }
    }

    private void setSwitchTypefaceByIndex(int i5, int i6) {
        setSwitchTypeface(i5 != 1 ? i5 != 2 ? i5 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i6);
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.mTextOff = charSequence;
        this.mTextOffTransformed = doTransformForOnOffText(charSequence);
        this.mOffLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.mTextOn = charSequence;
        this.mTextOnTransformed = doTransformForOnOffText(charSequence);
        this.mOnLayout = null;
        if (this.mShowText) {
            setupEmojiCompatLoadCallback();
        }
    }

    private void setupEmojiCompatLoadCallback() {
        if (this.mEmojiCompatInitCallback == null && this.mAppCompatEmojiTextHelper.m1420() && androidx.emoji2.text.e.m3785()) {
            androidx.emoji2.text.e m3781 = androidx.emoji2.text.e.m3781();
            int m3789 = m3781.m3789();
            if (m3789 == 3 || m3789 == 0) {
                c cVar = new c(this);
                this.mEmojiCompatInitCallback = cVar;
                m3781.m3798(cVar);
            }
        }
    }

    private void stopDrag(MotionEvent motionEvent) {
        this.mTouchMode = 0;
        boolean z5 = true;
        boolean z6 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z6) {
            this.mVelocityTracker.computeCurrentVelocity(1000);
            float xVelocity = this.mVelocityTracker.getXVelocity();
            if (Math.abs(xVelocity) <= this.mMinFlingVelocity) {
                z5 = getTargetCheckedState();
            } else if (!p3.m1477(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z5 = false;
            }
        } else {
            z5 = isChecked;
        }
        if (z5 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z5);
        cancelSuperTouch(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i5;
        int i6;
        Rect rect = this.mTempRect;
        int i7 = this.mSwitchLeft;
        int i8 = this.mSwitchTop;
        int i9 = this.mSwitchRight;
        int i10 = this.mSwitchBottom;
        int thumbOffset = getThumbOffset() + i7;
        Drawable drawable = this.mThumbDrawable;
        Rect m1145 = drawable != null ? b2.m1145(drawable) : b2.f1164;
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i11 = rect.left;
            thumbOffset += i11;
            if (m1145 != null) {
                int i12 = m1145.left;
                if (i12 > i11) {
                    i7 += i12 - i11;
                }
                int i13 = m1145.top;
                int i14 = rect.top;
                i5 = i13 > i14 ? (i13 - i14) + i8 : i8;
                int i15 = m1145.right;
                int i16 = rect.right;
                if (i15 > i16) {
                    i9 -= i15 - i16;
                }
                int i17 = m1145.bottom;
                int i18 = rect.bottom;
                if (i17 > i18) {
                    i6 = i10 - (i17 - i18);
                }
                this.mTrackDrawable.setBounds(i7, i5, i9, i6);
            } else {
                i5 = i8;
            }
            i6 = i10;
            this.mTrackDrawable.setBounds(i7, i5, i9, i6);
        }
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i19 = thumbOffset - rect.left;
            int i20 = thumbOffset + this.mThumbWidth + rect.right;
            this.mThumbDrawable.setBounds(i19, i8, i20, i10);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.m2207(background, i19, i8, i20, i10);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f5, float f6) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f5, f6);
        }
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2206(drawable, f5, f6);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.m2206(drawable2, f5, f6);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.mThumbDrawable;
        boolean z5 = false;
        if (drawable != null && drawable.isStateful()) {
            z5 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            z5 |= drawable2.setState(drawableState);
        }
        if (z5) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!p3.m1477(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.mSwitchPadding : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (p3.m1477(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.mSwitchWidth;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.mSwitchPadding : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.c0.m3572(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.mShowText;
    }

    public boolean getSplitTrack() {
        return this.mSplitTrack;
    }

    public int getSwitchMinWidth() {
        return this.mSwitchMinWidth;
    }

    public int getSwitchPadding() {
        return this.mSwitchPadding;
    }

    public CharSequence getTextOff() {
        return this.mTextOff;
    }

    public CharSequence getTextOn() {
        return this.mTextOn;
    }

    public Drawable getThumbDrawable() {
        return this.mThumbDrawable;
    }

    protected final float getThumbPosition() {
        return this.mThumbPosition;
    }

    public int getThumbTextPadding() {
        return this.mThumbTextPadding;
    }

    public ColorStateList getThumbTintList() {
        return this.mThumbTintList;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.mThumbTintMode;
    }

    public Drawable getTrackDrawable() {
        return this.mTrackDrawable;
    }

    public ColorStateList getTrackTintList() {
        return this.mTrackTintList;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.mTrackTintMode;
    }

    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().m1420();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mThumbDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.mPositionAnimator;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.mPositionAnimator.end();
        this.mPositionAnimator = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i5) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i5 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.mTempRect;
        Drawable drawable = this.mTrackDrawable;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i5 = this.mSwitchTop;
        int i6 = this.mSwitchBottom;
        int i7 = i5 + rect.top;
        int i8 = i6 - rect.bottom;
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable != null) {
            if (!this.mSplitTrack || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect m1145 = b2.m1145(drawable2);
                drawable2.copyBounds(rect);
                rect.left += m1145.left;
                rect.right -= m1145.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.mOnLayout : this.mOffLayout;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.mTextColors;
            if (colorStateList != null) {
                this.mTextPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.mTextPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i7 + i8) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    void onEmojiCompatInitializedForSwitchText() {
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_EVENT_CLASS_NAME);
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int i9;
        int width;
        int i10;
        int i11;
        int i12;
        int i13;
        super.onLayout(z5, i5, i6, i7, i8);
        int i14 = 0;
        if (this.mThumbDrawable != null) {
            Rect rect = this.mTempRect;
            Drawable drawable = this.mTrackDrawable;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect m1145 = b2.m1145(this.mThumbDrawable);
            i9 = Math.max(0, m1145.left - rect.left);
            i14 = Math.max(0, m1145.right - rect.right);
        } else {
            i9 = 0;
        }
        if (p3.m1477(this)) {
            i10 = getPaddingLeft() + i9;
            width = ((this.mSwitchWidth + i10) - i9) - i14;
        } else {
            width = (getWidth() - getPaddingRight()) - i14;
            i10 = (width - this.mSwitchWidth) + i9 + i14;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i11 = this.mSwitchHeight;
            i12 = paddingTop - (i11 / 2);
        } else {
            if (gravity == 80) {
                i13 = getHeight() - getPaddingBottom();
                i12 = i13 - this.mSwitchHeight;
                this.mSwitchLeft = i10;
                this.mSwitchTop = i12;
                this.mSwitchBottom = i13;
                this.mSwitchRight = width;
            }
            i12 = getPaddingTop();
            i11 = this.mSwitchHeight;
        }
        i13 = i11 + i12;
        this.mSwitchLeft = i10;
        this.mSwitchTop = i12;
        this.mSwitchBottom = i13;
        this.mSwitchRight = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        if (this.mShowText) {
            if (this.mOnLayout == null) {
                this.mOnLayout = makeLayout(this.mTextOnTransformed);
            }
            if (this.mOffLayout == null) {
                this.mOffLayout = makeLayout(this.mTextOffTransformed);
            }
        }
        Rect rect = this.mTempRect;
        Drawable drawable = this.mThumbDrawable;
        int i9 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i7 = (this.mThumbDrawable.getIntrinsicWidth() - rect.left) - rect.right;
            i8 = this.mThumbDrawable.getIntrinsicHeight();
        } else {
            i7 = 0;
            i8 = 0;
        }
        this.mThumbWidth = Math.max(this.mShowText ? Math.max(this.mOnLayout.getWidth(), this.mOffLayout.getWidth()) + (this.mThumbTextPadding * 2) : 0, i7);
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i9 = this.mTrackDrawable.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i10 = rect.left;
        int i11 = rect.right;
        Drawable drawable3 = this.mThumbDrawable;
        if (drawable3 != null) {
            Rect m1145 = b2.m1145(drawable3);
            i10 = Math.max(i10, m1145.left);
            i11 = Math.max(i11, m1145.right);
        }
        int max = this.mEnforceSwitchWidth ? Math.max(this.mSwitchMinWidth, (this.mThumbWidth * 2) + i10 + i11) : this.mSwitchMinWidth;
        int max2 = Math.max(i9, i8);
        this.mSwitchWidth = max;
        this.mSwitchHeight = max2;
        super.onMeasure(i5, i6);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.mTextOn : this.mTextOff;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9f
            r2 = 2
            if (r0 == r1) goto L8b
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L8b
            goto Lb9
        L16:
            int r0 = r6.mTouchMode
            if (r0 == r1) goto L57
            if (r0 == r2) goto L1e
            goto Lb9
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.mTouchX
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3d
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L39
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L3d
        L39:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L3d:
            boolean r0 = androidx.appcompat.widget.p3.m1477(r6)
            if (r0 == 0) goto L44
            float r2 = -r2
        L44:
            float r0 = r6.mThumbPosition
            float r0 = r0 + r2
            float r0 = constrain(r0, r4, r3)
            float r2 = r6.mThumbPosition
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L56
            r6.mTouchX = r7
            r6.setThumbPosition(r0)
        L56:
            return r1
        L57:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.mTouchX
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7d
            float r4 = r6.mTouchY
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb9
        L7d:
            r6.mTouchMode = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.mTouchX = r0
            r6.mTouchY = r3
            return r1
        L8b:
            int r0 = r6.mTouchMode
            if (r0 != r2) goto L96
            r6.stopDrag(r7)
            super.onTouchEvent(r7)
            return r1
        L96:
            r0 = 0
            r6.mTouchMode = r0
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.clear()
            goto Lb9
        L9f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb9
            boolean r3 = r6.hitThumb(r0, r2)
            if (r3 == 0) goto Lb9
            r6.mTouchMode = r1
            r6.mTouchX = r0
            r6.mTouchY = r2
        Lb9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.x2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().m1422(z5);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z5) {
        super.setChecked(z5);
        boolean isChecked = isChecked();
        if (isChecked) {
            setOnStateDescriptionOnRAndAbove();
        } else {
            setOffStateDescriptionOnRAndAbove();
        }
        if (getWindowToken() != null && androidx.core.view.f1.m2808(this)) {
            animateThumbToCheckedState(isChecked);
        } else {
            cancelPositionAnimator();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.c0.m3573(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().m1423(z5);
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z5) {
        this.mEnforceSwitchWidth = z5;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1419(inputFilterArr));
    }

    public void setShowText(boolean z5) {
        if (this.mShowText != z5) {
            this.mShowText = z5;
            requestLayout();
            if (z5) {
                setupEmojiCompatLoadCallback();
            }
        }
    }

    public void setSplitTrack(boolean z5) {
        this.mSplitTrack = z5;
        invalidate();
    }

    public void setSwitchMinWidth(int i5) {
        this.mSwitchMinWidth = i5;
        requestLayout();
    }

    public void setSwitchPadding(int i5) {
        this.mSwitchPadding = i5;
        requestLayout();
    }

    public void setSwitchTextAppearance(Context context, int i5) {
        d3 m1179 = d3.m1179(context, i5, e.j.f7251);
        ColorStateList m1184 = m1179.m1184(e.j.f7255);
        if (m1184 != null) {
            this.mTextColors = m1184;
        } else {
            this.mTextColors = getTextColors();
        }
        int m1187 = m1179.m1187(e.j.f7252, 0);
        if (m1187 != 0) {
            float f5 = m1187;
            if (f5 != this.mTextPaint.getTextSize()) {
                this.mTextPaint.setTextSize(f5);
                requestLayout();
            }
        }
        setSwitchTypefaceByIndex(m1179.m1192(e.j.f7253, -1), m1179.m1192(e.j.f7254, -1));
        if (m1179.m1182(e.j.f7263, false)) {
            this.mSwitchTransformationMethod = new h.a(getContext());
        } else {
            this.mSwitchTransformationMethod = null;
        }
        setTextOnInternal(this.mTextOn);
        setTextOffInternal(this.mTextOff);
        m1179.m1201();
    }

    public void setSwitchTypeface(Typeface typeface, int i5) {
        if (i5 <= 0) {
            this.mTextPaint.setFakeBoldText(false);
            this.mTextPaint.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i5) : Typeface.create(typeface, i5);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ (-1)) & i5;
            this.mTextPaint.setFakeBoldText((style & 1) != 0);
            this.mTextPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        setOffStateDescriptionOnRAndAbove();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            setOnStateDescriptionOnRAndAbove();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.mThumbDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mThumbDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    void setThumbPosition(float f5) {
        this.mThumbPosition = f5;
        invalidate();
    }

    public void setThumbResource(int i5) {
        setThumbDrawable(f.a.m8475(getContext(), i5));
    }

    public void setThumbTextPadding(int i5) {
        this.mThumbTextPadding = i5;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.mThumbTintList = colorStateList;
        this.mHasThumbTint = true;
        applyThumbTint();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.mThumbTintMode = mode;
        this.mHasThumbTintMode = true;
        applyThumbTint();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.mTrackDrawable;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.mTrackDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i5) {
        setTrackDrawable(f.a.m8475(getContext(), i5));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.mTrackTintList = colorStateList;
        this.mHasTrackTint = true;
        applyTrackTint();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.mTrackTintMode = mode;
        this.mHasTrackTintMode = true;
        applyTrackTint();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mThumbDrawable || drawable == this.mTrackDrawable;
    }

    public x2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6905);
    }

    public x2(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.mThumbTintList = null;
        this.mThumbTintMode = null;
        this.mHasThumbTint = false;
        this.mHasThumbTintMode = false;
        this.mTrackTintList = null;
        this.mTrackTintMode = null;
        this.mHasTrackTint = false;
        this.mHasTrackTintMode = false;
        this.mVelocityTracker = VelocityTracker.obtain();
        this.mEnforceSwitchWidth = true;
        this.mTempRect = new Rect();
        y2.m1650(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.mTextPaint = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = e.j.f7234;
        d3 m1181 = d3.m1181(context, attributeSet, iArr, i5, 0);
        androidx.core.view.f1.m2828(this, context, iArr, attributeSet, m1181.m1199(), i5, 0);
        Drawable m1188 = m1181.m1188(e.j.f7238);
        this.mThumbDrawable = m1188;
        if (m1188 != null) {
            m1188.setCallback(this);
        }
        Drawable m11882 = m1181.m1188(e.j.f7248);
        this.mTrackDrawable = m11882;
        if (m11882 != null) {
            m11882.setCallback(this);
        }
        setTextOnInternal(m1181.m1197(e.j.f7236));
        setTextOffInternal(m1181.m1197(e.j.f7237));
        this.mShowText = m1181.m1182(e.j.f7239, true);
        this.mThumbTextPadding = m1181.m1187(e.j.f7245, 0);
        this.mSwitchMinWidth = m1181.m1187(e.j.f7241, 0);
        this.mSwitchPadding = m1181.m1187(e.j.f7243, 0);
        this.mSplitTrack = m1181.m1182(e.j.f7240, false);
        ColorStateList m1184 = m1181.m1184(e.j.f7246);
        if (m1184 != null) {
            this.mThumbTintList = m1184;
            this.mHasThumbTint = true;
        }
        PorterDuff.Mode m1146 = b2.m1146(m1181.m1192(e.j.f7247, -1), null);
        if (this.mThumbTintMode != m1146) {
            this.mThumbTintMode = m1146;
            this.mHasThumbTintMode = true;
        }
        if (this.mHasThumbTint || this.mHasThumbTintMode) {
            applyThumbTint();
        }
        ColorStateList m11842 = m1181.m1184(e.j.f7249);
        if (m11842 != null) {
            this.mTrackTintList = m11842;
            this.mHasTrackTint = true;
        }
        PorterDuff.Mode m11462 = b2.m1146(m1181.m1192(e.j.f7250, -1), null);
        if (this.mTrackTintMode != m11462) {
            this.mTrackTintMode = m11462;
            this.mHasTrackTintMode = true;
        }
        if (this.mHasTrackTint || this.mHasTrackTintMode) {
            applyTrackTint();
        }
        int m1195 = m1181.m1195(e.j.f7244, 0);
        if (m1195 != 0) {
            setSwitchTextAppearance(context, m1195);
        }
        y0 y0Var = new y0(this);
        this.mTextHelper = y0Var;
        y0Var.m1623(attributeSet, i5);
        m1181.m1201();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m1421(attributeSet, i5);
        refreshDrawableState();
        setChecked(isChecked());
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.mTextPaint.getTypeface() == null || this.mTextPaint.getTypeface().equals(typeface)) && (this.mTextPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        this.mTextPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }
}
