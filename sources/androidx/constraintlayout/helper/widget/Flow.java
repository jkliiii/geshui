package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.l;
import androidx.constraintlayout.widget.n;
import q.e;
import q.g;

/* loaded from: E:\78999\cookie_5123796.dex */
public class Flow extends n {

    /* renamed from: ـ, reason: contains not printable characters */
    private g f1601;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.d, android.view.View
    @SuppressLint({"WrongCall"})
    protected void onMeasure(int i5, int i6) {
        mo1744(this.f1601, i5, i6);
    }

    public void setFirstHorizontalBias(float f5) {
        this.f1601.m11388(f5);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i5) {
        this.f1601.m11389(i5);
        requestLayout();
    }

    public void setFirstVerticalBias(float f5) {
        this.f1601.m11390(f5);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i5) {
        this.f1601.m11391(i5);
        requestLayout();
    }

    public void setHorizontalAlign(int i5) {
        this.f1601.m11392(i5);
        requestLayout();
    }

    public void setHorizontalBias(float f5) {
        this.f1601.m11393(f5);
        requestLayout();
    }

    public void setHorizontalGap(int i5) {
        this.f1601.m11394(i5);
        requestLayout();
    }

    public void setHorizontalStyle(int i5) {
        this.f1601.m11395(i5);
        requestLayout();
    }

    public void setLastHorizontalBias(float f5) {
        this.f1601.m11396(f5);
        requestLayout();
    }

    public void setLastHorizontalStyle(int i5) {
        this.f1601.m11397(i5);
        requestLayout();
    }

    public void setLastVerticalBias(float f5) {
        this.f1601.m11398(f5);
        requestLayout();
    }

    public void setLastVerticalStyle(int i5) {
        this.f1601.m11399(i5);
        requestLayout();
    }

    public void setMaxElementsWrap(int i5) {
        this.f1601.m11400(i5);
        requestLayout();
    }

    public void setOrientation(int i5) {
        this.f1601.m11401(i5);
        requestLayout();
    }

    public void setPadding(int i5) {
        this.f1601.m11448(i5);
        requestLayout();
    }

    public void setPaddingBottom(int i5) {
        this.f1601.m11449(i5);
        requestLayout();
    }

    public void setPaddingLeft(int i5) {
        this.f1601.m11451(i5);
        requestLayout();
    }

    public void setPaddingRight(int i5) {
        this.f1601.m11452(i5);
        requestLayout();
    }

    public void setPaddingTop(int i5) {
        this.f1601.m11454(i5);
        requestLayout();
    }

    public void setVerticalAlign(int i5) {
        this.f1601.m11402(i5);
        requestLayout();
    }

    public void setVerticalBias(float f5) {
        this.f1601.m11403(f5);
        requestLayout();
    }

    public void setVerticalGap(int i5) {
        this.f1601.m11404(i5);
        requestLayout();
    }

    public void setVerticalStyle(int i5) {
        this.f1601.m11405(i5);
        requestLayout();
    }

    public void setWrapMode(int i5) {
        this.f1601.m11406(i5);
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.n, androidx.constraintlayout.widget.d
    /* renamed from: ˑ, reason: contains not printable characters */
    protected void mo1742(AttributeSet attributeSet) {
        super.mo1742(attributeSet);
        this.f1601 = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f2101);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2102) {
                    this.f1601.m11401(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2103) {
                    this.f1601.m11448(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2115) {
                    this.f1601.m11453(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2116) {
                    this.f1601.m11450(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2104) {
                    this.f1601.m11451(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2105) {
                    this.f1601.m11454(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2107) {
                    this.f1601.m11452(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2108) {
                    this.f1601.m11449(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2143) {
                    this.f1601.m11406(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2131) {
                    this.f1601.m11395(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2142) {
                    this.f1601.m11405(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2125) {
                    this.f1601.m11389(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2134) {
                    this.f1601.m11397(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2127) {
                    this.f1601.m11391(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2136) {
                    this.f1601.m11399(obtainStyledAttributes.getInt(index, 0));
                } else if (index == l.f2129) {
                    this.f1601.m11393(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == l.f2124) {
                    this.f1601.m11388(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == l.f2133) {
                    this.f1601.m11396(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == l.f2126) {
                    this.f1601.m11390(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == l.f2135) {
                    this.f1601.m11398(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == l.f2140) {
                    this.f1601.m11403(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == l.f2128) {
                    this.f1601.m11392(obtainStyledAttributes.getInt(index, 2));
                } else if (index == l.f2139) {
                    this.f1601.m11402(obtainStyledAttributes.getInt(index, 2));
                } else if (index == l.f2130) {
                    this.f1601.m11394(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2141) {
                    this.f1601.m11404(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == l.f2138) {
                    this.f1601.m11400(obtainStyledAttributes.getInt(index, -1));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1855 = this.f1601;
        m1837();
    }

    @Override // androidx.constraintlayout.widget.d
    /* renamed from: י, reason: contains not printable characters */
    public void mo1743(e eVar, boolean z5) {
        this.f1601.m11434(z5);
    }

    @Override // androidx.constraintlayout.widget.n
    /* renamed from: ᵔ, reason: contains not printable characters */
    public void mo1744(q.l lVar, int i5, int i6) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.mo11387(mode, size, mode2, size2);
            setMeasuredDimension(lVar.m11438(), lVar.m11437());
        }
    }
}
