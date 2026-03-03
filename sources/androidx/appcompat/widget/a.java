package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.q4;
import androidx.core.view.r4;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AbsActionBarView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
abstract class a extends ViewGroup {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected final C0017a f1146;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected final Context f1147;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected ActionMenuView f1148;

    /* renamed from: ˈ, reason: contains not printable characters */
    protected c f1149;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected int f1150;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected q4 f1151;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f1152;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f1153;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0017a implements r4 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean f1154 = false;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f1155;

        protected C0017a() {
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʻ, reason: contains not printable characters */
        public void mo1132(View view) {
            this.f1154 = true;
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʼ */
        public void mo561(View view) {
            if (this.f1154) {
                return;
            }
            a aVar = a.this;
            aVar.f1151 = null;
            a.super.setVisibility(this.f1155);
        }

        @Override // androidx.core.view.r4
        /* renamed from: ʽ */
        public void mo694(View view) {
            a.super.setVisibility(0);
            this.f1154 = false;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public C0017a m1133(q4 q4Var, int i5) {
            a.this.f1151 = q4Var;
            this.f1155 = i5;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    protected static int m1129(int i5, int i6, boolean z5) {
        return z5 ? i5 - i6 : i5 + i6;
    }

    public int getAnimatedVisibility() {
        return this.f1151 != null ? this.f1146.f1155 : getVisibility();
    }

    public int getContentHeight() {
        return this.f1150;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f7079, e.a.f6888, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(e.j.f7309, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1149;
        if (cVar != null) {
            cVar.m1167(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1153 = false;
        }
        if (!this.f1153) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1153 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1153 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1152 = false;
        }
        if (!this.f1152) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1152 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1152 = false;
        }
        return true;
    }

    public void setContentHeight(int i5) {
        this.f1150 = i5;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        if (i5 != getVisibility()) {
            q4 q4Var = this.f1151;
            if (q4Var != null) {
                q4Var.m3285();
            }
            super.setVisibility(i5);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected int m1130(View view, int i5, int i6, int i7) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i5, RecyclerView.UNDEFINED_DURATION), i6);
        return Math.max(0, (i5 - view.getMeasuredWidth()) - i7);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected int m1131(View view, int i5, int i6, int i7, boolean z5) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i6 + ((i7 - measuredHeight) / 2);
        if (z5) {
            view.layout(i5 - measuredWidth, i8, i5, measuredHeight + i8);
        } else {
            view.layout(i5, i8, i5 + measuredWidth, measuredHeight + i8);
        }
        return z5 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: ˆ */
    public q4 mo1007(int i5, long j5) {
        q4 q4Var = this.f1151;
        if (q4Var != null) {
            q4Var.m3285();
        }
        if (i5 != 0) {
            q4 m3284 = androidx.core.view.f1.m2864(this).m3284(0.0f);
            m3284.m3287(j5);
            m3284.m3289(this.f1146.m1133(m3284, i5));
            return m3284;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        q4 m32842 = androidx.core.view.f1.m2864(this).m3284(1.0f);
        m32842.m3287(j5);
        m32842.m3289(this.f1146.m1133(m32842, i5));
        return m32842;
    }

    a(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f1146 = new C0017a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(e.a.f6884, typedValue, true) || typedValue.resourceId == 0) {
            this.f1147 = context;
        } else {
            this.f1147 = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
