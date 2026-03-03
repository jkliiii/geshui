package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.q4;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* renamed from: ˏ, reason: contains not printable characters */
    private CharSequence f975;

    /* renamed from: ˑ, reason: contains not printable characters */
    private CharSequence f976;

    /* renamed from: י, reason: contains not printable characters */
    private View f977;

    /* renamed from: ـ, reason: contains not printable characters */
    private View f978;

    /* renamed from: ٴ, reason: contains not printable characters */
    private View f979;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private LinearLayout f980;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private TextView f981;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private TextView f982;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f983;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private int f984;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f985;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f986;

    class a implements View.OnClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ androidx.appcompat.view.b f987;

        a(androidx.appcompat.view.b bVar) {
            this.f987 = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f987.mo563();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m1006() {
        if (this.f980 == null) {
            LayoutInflater.from(getContext()).inflate(e.g.f7039, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f980 = linearLayout;
            this.f981 = (TextView) linearLayout.findViewById(e.f.f7005);
            this.f982 = (TextView) this.f980.findViewById(e.f.f7003);
            if (this.f983 != 0) {
                this.f981.setTextAppearance(getContext(), this.f983);
            }
            if (this.f984 != 0) {
                this.f982.setTextAppearance(getContext(), this.f984);
            }
        }
        this.f981.setText(this.f975);
        this.f982.setText(this.f976);
        boolean z5 = !TextUtils.isEmpty(this.f975);
        boolean z6 = !TextUtils.isEmpty(this.f976);
        int i5 = 0;
        this.f982.setVisibility(z6 ? 0 : 8);
        LinearLayout linearLayout2 = this.f980;
        if (!z5 && !z6) {
            i5 = 8;
        }
        linearLayout2.setVisibility(i5);
        if (this.f980.getParent() == null) {
            addView(this.f980);
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f976;
    }

    public CharSequence getTitle() {
        return this.f975;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f1149;
        if (cVar != null) {
            cVar.m1163();
            this.f1149.m1164();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        boolean m1477 = p3.m1477(this);
        int paddingRight = m1477 ? (i7 - i5) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i8 - i6) - getPaddingTop()) - getPaddingBottom();
        View view = this.f977;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f977.getLayoutParams();
            int i9 = m1477 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i10 = m1477 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m1129 = androidx.appcompat.widget.a.m1129(paddingRight, i9, m1477);
            paddingRight = androidx.appcompat.widget.a.m1129(m1129 + m1131(this.f977, m1129, paddingTop, paddingTop2, m1477), i10, m1477);
        }
        int i11 = paddingRight;
        LinearLayout linearLayout = this.f980;
        if (linearLayout != null && this.f979 == null && linearLayout.getVisibility() != 8) {
            i11 += m1131(this.f980, i11, paddingTop, paddingTop2, m1477);
        }
        int i12 = i11;
        View view2 = this.f979;
        if (view2 != null) {
            m1131(view2, i12, paddingTop, paddingTop2, m1477);
        }
        int paddingLeft = m1477 ? getPaddingLeft() : (i7 - i5) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1148;
        if (actionMenuView != null) {
            m1131(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m1477);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (View.MeasureSpec.getMode(i5) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i6) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i5);
        int i7 = this.f1150;
        if (i7 <= 0) {
            i7 = View.MeasureSpec.getSize(i6);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i8 = i7 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, RecyclerView.UNDEFINED_DURATION);
        View view = this.f977;
        if (view != null) {
            int m1130 = m1130(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f977.getLayoutParams();
            paddingLeft = m1130 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1148;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1130(this.f1148, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f980;
        if (linearLayout != null && this.f979 == null) {
            if (this.f985) {
                this.f980.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f980.getMeasuredWidth();
                boolean z5 = measuredWidth <= paddingLeft;
                if (z5) {
                    paddingLeft -= measuredWidth;
                }
                this.f980.setVisibility(z5 ? 0 : 8);
            } else {
                paddingLeft = m1130(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f979;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i9 = layoutParams.width;
            int i10 = i9 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
            if (i9 >= 0) {
                paddingLeft = Math.min(i9, paddingLeft);
            }
            int i11 = layoutParams.height;
            int i12 = i11 == -2 ? RecyclerView.UNDEFINED_DURATION : 1073741824;
            if (i11 >= 0) {
                i8 = Math.min(i11, i8);
            }
            this.f979.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i10), View.MeasureSpec.makeMeasureSpec(i8, i12));
        }
        if (this.f1150 > 0) {
            setMeasuredDimension(size, i7);
            return;
        }
        int childCount = getChildCount();
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i13) {
                i13 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i13);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i5) {
        this.f1150 = i5;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f979;
        if (view2 != null) {
            removeView(view2);
        }
        this.f979 = view;
        if (view != null && (linearLayout = this.f980) != null) {
            removeView(linearLayout);
            this.f980 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f976 = charSequence;
        m1006();
    }

    public void setTitle(CharSequence charSequence) {
        this.f975 = charSequence;
        m1006();
        androidx.core.view.f1.m2835(this, charSequence);
    }

    public void setTitleOptional(boolean z5) {
        if (z5 != this.f985) {
            requestLayout();
        }
        this.f985 = z5;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i5) {
        super.setVisibility(i5);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.a
    /* renamed from: ˆ, reason: contains not printable characters */
    public /* bridge */ /* synthetic */ q4 mo1007(int i5, long j5) {
        return super.mo1007(i5, j5);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m1008() {
        if (this.f977 == null) {
            m1011();
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m1009(androidx.appcompat.view.b bVar) {
        View view = this.f977;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f986, (ViewGroup) this, false);
            this.f977 = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f977);
        }
        View findViewById = this.f977.findViewById(e.f.f7013);
        this.f978 = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.mo565();
        c cVar = this.f1149;
        if (cVar != null) {
            cVar.m1159();
        }
        c cVar2 = new c(getContext());
        this.f1149 = cVar2;
        cVar2.m1161(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.addMenuPresenter(this.f1149, this.f1147);
        ActionMenuView actionMenuView = (ActionMenuView) this.f1149.mo904(this);
        this.f1148 = actionMenuView;
        androidx.core.view.f1.m2836(actionMenuView, null);
        addView(this.f1148, layoutParams);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public boolean m1010() {
        return this.f985;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m1011() {
        removeAllViews();
        this.f979 = null;
        this.f1148 = null;
        this.f1149 = null;
        View view = this.f978;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public boolean m1012() {
        c cVar = this.f1149;
        if (cVar != null) {
            return cVar.m1158();
        }
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6902);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        d3 m1181 = d3.m1181(context, attributeSet, e.j.f7339, i5, 0);
        androidx.core.view.f1.m2836(this, m1181.m1188(e.j.f7340));
        this.f983 = m1181.m1195(e.j.f7134, 0);
        this.f984 = m1181.m1195(e.j.f7080, 0);
        this.f1150 = m1181.m1194(e.j.f7326, 0);
        this.f986 = m1181.m1195(e.j.f7324, e.g.f7042);
        m1181.m1201();
    }
}
