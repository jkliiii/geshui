package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.g2;
import androidx.appcompat.widget.j3;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: ʾ, reason: contains not printable characters */
    i f759;

    /* renamed from: ʿ, reason: contains not printable characters */
    private CharSequence f760;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Drawable f761;

    /* renamed from: ˈ, reason: contains not printable characters */
    g.b f762;

    /* renamed from: ˉ, reason: contains not printable characters */
    private g2 f763;

    /* renamed from: ˊ, reason: contains not printable characters */
    b f764;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f765;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f766;

    /* renamed from: ˏ, reason: contains not printable characters */
    private int f767;

    /* renamed from: ˑ, reason: contains not printable characters */
    private int f768;

    /* renamed from: י, reason: contains not printable characters */
    private int f769;

    private class a extends g2 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.g2
        /* renamed from: ʼ, reason: contains not printable characters */
        public p mo882() {
            b bVar = ActionMenuItemView.this.f764;
            if (bVar != null) {
                return bVar.mo884();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g2
        /* renamed from: ʽ, reason: contains not printable characters */
        protected boolean mo883() {
            p mo882;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f762;
            return bVar != null && bVar.mo885(actionMenuItemView.f759) && (mo882 = mo882()) != null && mo882.mo920();
        }
    }

    public static abstract class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        public abstract p mo884();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean m877() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        return i5 >= 480 || (i5 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m878() {
        boolean z5 = true;
        boolean z6 = !TextUtils.isEmpty(this.f760);
        if (this.f761 != null && (!this.f759.m963() || (!this.f765 && !this.f766))) {
            z5 = false;
        }
        boolean z7 = z6 & z5;
        setText(z7 ? this.f760 : null);
        CharSequence contentDescription = this.f759.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z7 ? null : this.f759.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f759.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            j3.m1399(this, z7 ? null : this.f759.getTitle());
        } else {
            j3.m1399(this, tooltipText);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f759;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void initialize(i iVar, int i5) {
        this.f759 = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.m952(this));
        setId(iVar.getItemId());
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f763 == null) {
            this.f763 = new a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.f762;
        if (bVar != null) {
            bVar.mo885(this.f759);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f765 = m877();
        m878();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        boolean m881 = m881();
        if (m881 && (i7 = this.f768) >= 0) {
            super.setPadding(i7, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i5, i6);
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f767) : this.f767;
        if (mode != 1073741824 && this.f767 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i6);
        }
        if (m881 || this.f761 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f761.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var;
        if (this.f759.hasSubMenu() && (g2Var = this.f763) != null && g2Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setExpandedFormat(boolean z5) {
        if (this.f766 != z5) {
            this.f766 = z5;
            i iVar = this.f759;
            if (iVar != null) {
                iVar.m948();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f761 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i5 = this.f769;
            if (intrinsicWidth > i5) {
                intrinsicHeight = (int) (intrinsicHeight * (i5 / intrinsicWidth));
                intrinsicWidth = i5;
            }
            if (intrinsicHeight > i5) {
                intrinsicWidth = (int) (intrinsicWidth * (i5 / intrinsicHeight));
            } else {
                i5 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i5);
        }
        setCompoundDrawables(drawable, null, null, null);
        m878();
    }

    public void setItemInvoker(g.b bVar) {
        this.f762 = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i5, int i6, int i7, int i8) {
        this.f768 = i5;
        super.setPadding(i5, i6, i7, i8);
    }

    public void setPopupCallback(b bVar) {
        this.f764 = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f760 = charSequence;
        m878();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    /* renamed from: ʻ, reason: contains not printable characters */
    public boolean mo879() {
        return m881();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean mo880() {
        return m881() && this.f759.getIcon() == null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m881() {
        return !TextUtils.isEmpty(getText());
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        Resources resources = context.getResources();
        this.f765 = m877();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f7333, i5, 0);
        this.f767 = obtainStyledAttributes.getDimensionPixelSize(e.j.f7335, 0);
        obtainStyledAttributes.recycle();
        this.f769 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f768 = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z5) {
    }

    public void setChecked(boolean z5) {
    }
}
