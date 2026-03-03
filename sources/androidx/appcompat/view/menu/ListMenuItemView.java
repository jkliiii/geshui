package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.d3;
import androidx.core.view.f1;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: ʾ, reason: contains not printable characters */
    private i f774;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ImageView f775;

    /* renamed from: ˆ, reason: contains not printable characters */
    private RadioButton f776;

    /* renamed from: ˈ, reason: contains not printable characters */
    private TextView f777;

    /* renamed from: ˉ, reason: contains not printable characters */
    private CheckBox f778;

    /* renamed from: ˊ, reason: contains not printable characters */
    private TextView f779;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ImageView f780;

    /* renamed from: ˎ, reason: contains not printable characters */
    private ImageView f781;

    /* renamed from: ˏ, reason: contains not printable characters */
    private LinearLayout f782;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Drawable f783;

    /* renamed from: י, reason: contains not printable characters */
    private int f784;

    /* renamed from: ـ, reason: contains not printable characters */
    private Context f785;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f786;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Drawable f787;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean f788;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private LayoutInflater f789;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f790;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6893);
    }

    private LayoutInflater getInflater() {
        if (this.f789 == null) {
            this.f789 = LayoutInflater.from(getContext());
        }
        return this.f789;
    }

    private void setSubMenuArrowVisible(boolean z5) {
        ImageView imageView = this.f780;
        if (imageView != null) {
            imageView.setVisibility(z5 ? 0 : 8);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m886(View view) {
        m887(view, -1);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m887(View view, int i5) {
        LinearLayout linearLayout = this.f782;
        if (linearLayout != null) {
            linearLayout.addView(view, i5);
        } else {
            addView(view, i5);
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m888() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(e.g.f7046, (ViewGroup) this, false);
        this.f778 = checkBox;
        m886(checkBox);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m889() {
        ImageView imageView = (ImageView) getInflater().inflate(e.g.f7047, (ViewGroup) this, false);
        this.f775 = imageView;
        m887(imageView, 0);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m890() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(e.g.f7049, (ViewGroup) this, false);
        this.f776 = radioButton;
        m886(radioButton);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f781;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f781.getLayoutParams();
        rect.top += this.f781.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f774;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void initialize(i iVar, int i5) {
        this.f774 = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.m952(this));
        setCheckable(iVar.isCheckable());
        m891(iVar.m961(), iVar.m950());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        f1.m2836(this, this.f783);
        TextView textView = (TextView) findViewById(e.f.f7014);
        this.f777 = textView;
        int i5 = this.f784;
        if (i5 != -1) {
            textView.setTextAppearance(this.f785, i5);
        }
        this.f779 = (TextView) findViewById(e.f.f7006);
        ImageView imageView = (ImageView) findViewById(e.f.f7008);
        this.f780 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f787);
        }
        this.f781 = (ImageView) findViewById(e.f.f7029);
        this.f782 = (LinearLayout) findViewById(e.f.f7019);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.f775 != null && this.f786) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f775.getLayoutParams();
            int i7 = layoutParams.height;
            if (i7 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i7;
            }
        }
        super.onMeasure(i5, i6);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z5) {
        CompoundButton compoundButton;
        View view;
        if (!z5 && this.f776 == null && this.f778 == null) {
            return;
        }
        if (this.f774.m956()) {
            if (this.f776 == null) {
                m890();
            }
            compoundButton = this.f776;
            view = this.f778;
        } else {
            if (this.f778 == null) {
                m888();
            }
            compoundButton = this.f778;
            view = this.f776;
        }
        if (z5) {
            compoundButton.setChecked(this.f774.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f778;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f776;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z5) {
        CompoundButton compoundButton;
        if (this.f774.m956()) {
            if (this.f776 == null) {
                m890();
            }
            compoundButton = this.f776;
        } else {
            if (this.f778 == null) {
                m888();
            }
            compoundButton = this.f778;
        }
        compoundButton.setChecked(z5);
    }

    public void setForceShowIcon(boolean z5) {
        this.f790 = z5;
        this.f786 = z5;
    }

    public void setGroupDividerEnabled(boolean z5) {
        ImageView imageView = this.f781;
        if (imageView != null) {
            imageView.setVisibility((this.f788 || !z5) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z5 = this.f774.m971() || this.f790;
        if (z5 || this.f786) {
            ImageView imageView = this.f775;
            if (imageView == null && drawable == null && !this.f786) {
                return;
            }
            if (imageView == null) {
                m889();
            }
            if (drawable == null && !this.f786) {
                this.f775.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f775;
            if (!z5) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f775.getVisibility() != 0) {
                this.f775.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f777.getVisibility() != 8) {
                this.f777.setVisibility(8);
            }
        } else {
            this.f777.setText(charSequence);
            if (this.f777.getVisibility() != 0) {
                this.f777.setVisibility(0);
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m891(boolean z5, char c6) {
        int i5 = (z5 && this.f774.m961()) ? 0 : 8;
        if (i5 == 0) {
            this.f779.setText(this.f774.m951());
        }
        if (this.f779.getVisibility() != i5) {
            this.f779.setVisibility(i5);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet);
        d3 m1181 = d3.m1181(getContext(), attributeSet, e.j.f7196, i5, 0);
        this.f783 = m1181.m1188(e.j.f7198);
        this.f784 = m1181.m1195(e.j.f7197, -1);
        this.f786 = m1181.m1182(e.j.f7199, false);
        this.f785 = context;
        this.f787 = m1181.m1188(e.j.f7200);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, e.a.f6885, 0);
        this.f788 = obtainStyledAttributes.hasValue(0);
        m1181.m1201();
        obtainStyledAttributes.recycle();
    }
}
