package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: OrientationHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class i {

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final RecyclerView.p f4317;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f4318;

    /* renamed from: ʽ, reason: contains not printable characters */
    final Rect f4319;

    /* compiled from: OrientationHelper.java */
    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ʾ */
        public int mo5169(View view) {
            return this.f4317.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ʿ */
        public int mo5170(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4317.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˆ */
        public int mo5171(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4317.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˈ */
        public int mo5172(View view) {
            return this.f4317.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˉ */
        public int mo5173() {
            return this.f4317.getWidth();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˊ */
        public int mo5174() {
            return this.f4317.getWidth() - this.f4317.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˋ */
        public int mo5175() {
            return this.f4317.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˎ */
        public int mo5176() {
            return this.f4317.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˏ */
        public int mo5177() {
            return this.f4317.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˑ */
        public int mo5178() {
            return this.f4317.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: י */
        public int mo5179() {
            return (this.f4317.getWidth() - this.f4317.getPaddingLeft()) - this.f4317.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ٴ */
        public int mo5181(View view) {
            this.f4317.getTransformedBoundingBox(view, true, this.f4319);
            return this.f4319.right;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ᐧ */
        public int mo5182(View view) {
            this.f4317.getTransformedBoundingBox(view, true, this.f4319);
            return this.f4319.left;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ᴵ */
        public void mo5183(int i5) {
            this.f4317.offsetChildrenHorizontal(i5);
        }
    }

    /* compiled from: OrientationHelper.java */
    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ʾ */
        public int mo5169(View view) {
            return this.f4317.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ʿ */
        public int mo5170(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4317.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˆ */
        public int mo5171(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f4317.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˈ */
        public int mo5172(View view) {
            return this.f4317.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˉ */
        public int mo5173() {
            return this.f4317.getHeight();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˊ */
        public int mo5174() {
            return this.f4317.getHeight() - this.f4317.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˋ */
        public int mo5175() {
            return this.f4317.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˎ */
        public int mo5176() {
            return this.f4317.getHeightMode();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˏ */
        public int mo5177() {
            return this.f4317.getWidthMode();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ˑ */
        public int mo5178() {
            return this.f4317.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: י */
        public int mo5179() {
            return (this.f4317.getHeight() - this.f4317.getPaddingTop()) - this.f4317.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ٴ */
        public int mo5181(View view) {
            this.f4317.getTransformedBoundingBox(view, true, this.f4319);
            return this.f4319.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ᐧ */
        public int mo5182(View view) {
            this.f4317.getTransformedBoundingBox(view, true, this.f4319);
            return this.f4319.top;
        }

        @Override // androidx.recyclerview.widget.i
        /* renamed from: ᴵ */
        public void mo5183(int i5) {
            this.f4317.offsetChildrenVertical(i5);
        }
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static i m5166(RecyclerView.p pVar) {
        return new a(pVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static i m5167(RecyclerView.p pVar, int i5) {
        if (i5 == 0) {
            return m5166(pVar);
        }
        if (i5 == 1) {
            return m5168(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static i m5168(RecyclerView.p pVar) {
        return new b(pVar);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public abstract int mo5169(View view);

    /* renamed from: ʿ, reason: contains not printable characters */
    public abstract int mo5170(View view);

    /* renamed from: ˆ, reason: contains not printable characters */
    public abstract int mo5171(View view);

    /* renamed from: ˈ, reason: contains not printable characters */
    public abstract int mo5172(View view);

    /* renamed from: ˉ, reason: contains not printable characters */
    public abstract int mo5173();

    /* renamed from: ˊ, reason: contains not printable characters */
    public abstract int mo5174();

    /* renamed from: ˋ, reason: contains not printable characters */
    public abstract int mo5175();

    /* renamed from: ˎ, reason: contains not printable characters */
    public abstract int mo5176();

    /* renamed from: ˏ, reason: contains not printable characters */
    public abstract int mo5177();

    /* renamed from: ˑ, reason: contains not printable characters */
    public abstract int mo5178();

    /* renamed from: י, reason: contains not printable characters */
    public abstract int mo5179();

    /* renamed from: ـ, reason: contains not printable characters */
    public int m5180() {
        if (Integer.MIN_VALUE == this.f4318) {
            return 0;
        }
        return mo5179() - this.f4318;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public abstract int mo5181(View view);

    /* renamed from: ᐧ, reason: contains not printable characters */
    public abstract int mo5182(View view);

    /* renamed from: ᴵ, reason: contains not printable characters */
    public abstract void mo5183(int i5);

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m5184() {
        this.f4318 = mo5179();
    }

    private i(RecyclerView.p pVar) {
        this.f4318 = RecyclerView.UNDEFINED_DURATION;
        this.f4319 = new Rect();
        this.f4317 = pVar;
    }
}
