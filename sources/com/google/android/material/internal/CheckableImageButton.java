package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;

/* loaded from: E:\78999\cookie_5123796.dex */
public class CheckableImageButton extends androidx.appcompat.widget.o implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED = {R.attr.state_checked};
    private boolean checkable;
    private boolean checked;
    private boolean pressable;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2639(CheckableImageButton.this.isCheckable());
            j0Var.m2640(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends androidx.customview.view.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f5824;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public b[] newArray(int i5) {
                return new b[i5];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private void m6905(Parcel parcel) {
            this.f5824 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f5824 ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m6905(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    public boolean isPressable() {
        return this.pressable;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i5) {
        if (!this.checked) {
            return super.onCreateDrawableState(i5);
        }
        int[] iArr = DRAWABLE_STATE_CHECKED;
        return View.mergeDrawableStates(super.onCreateDrawableState(i5 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setChecked(bVar.f5824);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5824 = this.checked;
        return bVar;
    }

    public void setCheckable(boolean z5) {
        if (this.checkable != z5) {
            this.checkable = z5;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z5) {
        if (!this.checkable || this.checked == z5) {
            return;
        }
        this.checked = z5;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z5) {
        this.pressable = z5;
    }

    @Override // android.view.View
    public void setPressed(boolean z5) {
        if (this.pressable) {
            super.setPressed(z5);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6887);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.checkable = true;
        this.pressable = true;
        f1.m2830(this, new a());
    }
}
