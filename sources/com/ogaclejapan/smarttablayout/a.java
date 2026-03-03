package com.ogaclejapan.smarttablayout;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

/* compiled from: SmartTabStrip.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class a extends LinearLayout {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f6792;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f6793;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f6794;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f6795;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final Paint f6796;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final RectF f6797;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final boolean f6798;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final boolean f6799;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final boolean f6800;

    /* renamed from: ˑ, reason: contains not printable characters */
    private final int f6801;

    /* renamed from: י, reason: contains not printable characters */
    private final int f6802;

    /* renamed from: ـ, reason: contains not printable characters */
    private final int f6803;

    /* renamed from: ٴ, reason: contains not printable characters */
    private final float f6804;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private final Paint f6805;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private SmartTabLayout.g f6806;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private final int f6807;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private final Paint f6808;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private final float f6809;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private final b f6810;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private final boolean f6811;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f6812;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f6813;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private float f6814;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private u3.b f6815;

    /* compiled from: SmartTabStrip.java */
    private static class b implements SmartTabLayout.g {

        /* renamed from: ʻ, reason: contains not printable characters */
        private int[] f6816;

        /* renamed from: ʼ, reason: contains not printable characters */
        private int[] f6817;

        private b() {
        }

        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.g
        /* renamed from: ʻ */
        public final int mo8106(int i5) {
            int[] iArr = this.f6817;
            return iArr[i5 % iArr.length];
        }

        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.g
        /* renamed from: ʼ */
        public final int mo8107(int i5) {
            int[] iArr = this.f6816;
            return iArr[i5 % iArr.length];
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        void m8122(int... iArr) {
            this.f6817 = iArr;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        void m8123(int... iArr) {
            this.f6816 = iArr;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        int i5;
        int[] intArray;
        int[] intArray2;
        super(context);
        this.f6797 = new RectF();
        setWillNotDraw(false);
        float f5 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorForeground, typedValue, true);
        int i6 = typedValue.data;
        float f6 = 0.0f * f5;
        int m8114 = m8114(i6, (byte) 38);
        int i7 = (int) f6;
        int m81142 = m8114(i6, (byte) 38);
        int m81143 = m8114(i6, (byte) 32);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u3.a.f11556);
        boolean z5 = obtainStyledAttributes.getBoolean(u3.a.f11575, false);
        boolean z6 = obtainStyledAttributes.getBoolean(u3.a.f11551, false);
        boolean z7 = obtainStyledAttributes.getBoolean(u3.a.f11570, false);
        int i8 = obtainStyledAttributes.getInt(u3.a.f11543, 0);
        int i9 = obtainStyledAttributes.getInt(u3.a.f11568, 0);
        int color = obtainStyledAttributes.getColor(u3.a.f11576, -13388315);
        int resourceId = obtainStyledAttributes.getResourceId(u3.a.f11577, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(u3.a.f11547, (int) (8.0f * f5));
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(u3.a.f11545, -1);
        float dimension = obtainStyledAttributes.getDimension(u3.a.f11578, f6);
        int color2 = obtainStyledAttributes.getColor(u3.a.f11549, m8114);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(u3.a.f11565, i7);
        int color3 = obtainStyledAttributes.getColor(u3.a.f11557, m81142);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(u3.a.f11555, (int) (2.0f * f5));
        int color4 = obtainStyledAttributes.getColor(u3.a.f11571, m81143);
        int resourceId2 = obtainStyledAttributes.getResourceId(u3.a.f11572, -1);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(u3.a.f11573, (int) (f5 * 1.0f));
        boolean z8 = obtainStyledAttributes.getBoolean(u3.a.f11574, false);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            i5 = 1;
            intArray = new int[]{color};
        } else {
            i5 = 1;
            intArray = getResources().getIntArray(resourceId);
        }
        if (resourceId2 == -1) {
            intArray2 = new int[i5];
            intArray2[0] = color4;
        } else {
            intArray2 = getResources().getIntArray(resourceId2);
        }
        b bVar = new b();
        this.f6810 = bVar;
        bVar.m8123(intArray);
        bVar.m8122(intArray2);
        this.f6792 = dimensionPixelSize2;
        this.f6793 = color2;
        this.f6794 = dimensionPixelSize3;
        this.f6795 = color3;
        this.f6796 = new Paint(1);
        this.f6799 = z5;
        this.f6798 = z6;
        this.f6800 = z7;
        this.f6801 = dimensionPixelSize;
        this.f6802 = layoutDimension;
        this.f6805 = new Paint(1);
        this.f6804 = dimension;
        this.f6803 = i9;
        this.f6809 = 0.5f;
        Paint paint = new Paint(1);
        this.f6808 = paint;
        paint.setStrokeWidth(dimensionPixelSize4);
        this.f6807 = dimensionPixelSize4;
        this.f6811 = z8;
        this.f6815 = u3.b.m12211(i8);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int m8108(int i5, int i6, float f5) {
        float f6 = 1.0f - f5;
        return Color.rgb((int) ((Color.red(i5) * f5) + (Color.red(i6) * f6)), (int) ((Color.green(i5) * f5) + (Color.green(i6) * f6)), (int) ((Color.blue(i5) * f5) + (Color.blue(i6) * f6)));
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m8109(Canvas canvas) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        SmartTabLayout.g m8115 = m8115();
        boolean m8137 = com.ogaclejapan.smarttablayout.b.m8137(this);
        if (this.f6800) {
            m8111(canvas, 0, width);
            m8113(canvas, 0, width, height);
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.f6813);
            int m8134 = com.ogaclejapan.smarttablayout.b.m8134(childAt, this.f6798);
            int m8125 = com.ogaclejapan.smarttablayout.b.m8125(childAt, this.f6798);
            if (m8137) {
                m8134 = m8125;
                m8125 = m8134;
            }
            int mo8107 = m8115.mo8107(this.f6813);
            float f5 = this.f6801;
            if (this.f6814 <= 0.0f || this.f6813 >= getChildCount() - 1) {
                i5 = mo8107;
                int i10 = m8134;
                i6 = m8125;
                i7 = i10;
            } else {
                int mo81072 = m8115.mo8107(this.f6813 + 1);
                if (mo8107 != mo81072) {
                    mo8107 = m8108(mo81072, mo8107, this.f6814);
                }
                float mo12212 = this.f6815.mo12212(this.f6814);
                float mo12213 = this.f6815.mo12213(this.f6814);
                float mo12214 = this.f6815.mo12214(this.f6814);
                View childAt2 = getChildAt(this.f6813 + 1);
                int m81342 = com.ogaclejapan.smarttablayout.b.m8134(childAt2, this.f6798);
                int m81252 = com.ogaclejapan.smarttablayout.b.m8125(childAt2, this.f6798);
                if (m8137) {
                    i8 = (int) ((m81252 * mo12213) + ((1.0f - mo12213) * m8134));
                    i9 = (int) ((m81342 * mo12212) + ((1.0f - mo12212) * m8125));
                } else {
                    i8 = (int) ((m81342 * mo12212) + ((1.0f - mo12212) * m8134));
                    i9 = (int) ((m81252 * mo12213) + ((1.0f - mo12213) * m8125));
                }
                f5 *= mo12214;
                i6 = i9;
                i7 = i8;
                i5 = mo8107;
            }
            m8110(canvas, i7, i6, height, f5, i5);
        }
        if (!this.f6800) {
            m8111(canvas, 0, width);
            m8113(canvas, 0, getWidth(), height);
        }
        m8112(canvas, height, childCount);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m8110(android.graphics.Canvas r5, int r6, int r7, int r8, float r9, int r10) {
        /*
            r4 = this;
            int r0 = r4.f6801
            if (r0 <= 0) goto L5d
            int r1 = r4.f6802
            if (r1 != 0) goto L9
            goto L5d
        L9:
            int r1 = r4.f6803
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L1e
            r2 = 2
            if (r1 == r2) goto L1c
            float r8 = (float) r8
            float r0 = (float) r0
            float r0 = r0 / r3
            float r8 = r8 - r0
        L17:
            float r9 = r9 / r3
            float r0 = r8 - r9
            float r8 = r8 + r9
            goto L21
        L1c:
            float r8 = (float) r8
            goto L1f
        L1e:
            float r8 = (float) r0
        L1f:
            float r8 = r8 / r3
            goto L17
        L21:
            android.graphics.Paint r9 = r4.f6805
            r9.setColor(r10)
            int r9 = r4.f6802
            r10 = -1
            if (r9 != r10) goto L33
            android.graphics.RectF r9 = r4.f6797
            float r6 = (float) r6
            float r7 = (float) r7
            r9.set(r6, r0, r7, r8)
            goto L47
        L33:
            int r9 = r6 - r7
            int r9 = java.lang.Math.abs(r9)
            int r10 = r4.f6802
            int r9 = r9 - r10
            float r9 = (float) r9
            float r9 = r9 / r3
            android.graphics.RectF r10 = r4.f6797
            float r6 = (float) r6
            float r6 = r6 + r9
            float r7 = (float) r7
            float r7 = r7 - r9
            r10.set(r6, r0, r7, r8)
        L47:
            float r6 = r4.f6804
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L56
            android.graphics.RectF r7 = r4.f6797
            android.graphics.Paint r8 = r4.f6805
            r5.drawRoundRect(r7, r6, r6, r8)
            goto L5d
        L56:
            android.graphics.RectF r6 = r4.f6797
            android.graphics.Paint r7 = r4.f6805
            r5.drawRect(r6, r7)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogaclejapan.smarttablayout.a.m8110(android.graphics.Canvas, int, int, int, float, int):void");
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m8111(Canvas canvas, int i5, int i6) {
        if (this.f6792 <= 0) {
            return;
        }
        this.f6796.setColor(this.f6793);
        canvas.drawRect(i5, 0.0f, i6, this.f6792, this.f6796);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m8112(Canvas canvas, int i5, int i6) {
        if (this.f6807 <= 0) {
            return;
        }
        int min = (int) (Math.min(Math.max(0.0f, this.f6809), 1.0f) * i5);
        SmartTabLayout.g m8115 = m8115();
        int i7 = (i5 - min) / 2;
        int i8 = min + i7;
        boolean m8137 = com.ogaclejapan.smarttablayout.b.m8137(this);
        for (int i9 = 0; i9 < i6 - 1; i9++) {
            View childAt = getChildAt(i9);
            int m8124 = com.ogaclejapan.smarttablayout.b.m8124(childAt);
            int m8126 = com.ogaclejapan.smarttablayout.b.m8126(childAt);
            int i10 = m8137 ? m8124 - m8126 : m8124 + m8126;
            this.f6808.setColor(m8115.mo8106(i9));
            float f5 = i10;
            canvas.drawLine(f5, i7, f5, i8, this.f6808);
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m8113(Canvas canvas, int i5, int i6, int i7) {
        if (this.f6794 <= 0) {
            return;
        }
        this.f6796.setColor(this.f6795);
        canvas.drawRect(i5, i7 - this.f6794, i6, i7, this.f6796);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private static int m8114(int i5, byte b6) {
        return Color.argb((int) b6, Color.red(i5), Color.green(i5), Color.blue(i5));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6811) {
            m8109(canvas);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f6811) {
            return;
        }
        m8109(canvas);
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    SmartTabLayout.g m8115() {
        SmartTabLayout.g gVar = this.f6806;
        return gVar != null ? gVar : this.f6810;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    boolean m8116() {
        return this.f6799;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    void m8117(int i5, float f5) {
        this.f6813 = i5;
        this.f6814 = f5;
        if (f5 == 0.0f && this.f6812 != i5) {
            this.f6812 = i5;
        }
        invalidate();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    void m8118(SmartTabLayout.g gVar) {
        this.f6806 = gVar;
        invalidate();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    void m8119(int... iArr) {
        this.f6806 = null;
        this.f6810.m8122(iArr);
        invalidate();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    void m8120(u3.b bVar) {
        this.f6815 = bVar;
        invalidate();
    }

    /* renamed from: י, reason: contains not printable characters */
    void m8121(int... iArr) {
        this.f6806 = null;
        this.f6810.m8123(iArr);
        invalidate();
    }
}
