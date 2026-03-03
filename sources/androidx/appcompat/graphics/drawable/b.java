package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* compiled from: DrawableContainerCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class b extends Drawable implements Drawable.Callback {

    /* renamed from: ʾ, reason: contains not printable characters */
    private d f621;

    /* renamed from: ʿ, reason: contains not printable characters */
    private Rect f622;

    /* renamed from: ˆ, reason: contains not printable characters */
    private Drawable f623;

    /* renamed from: ˈ, reason: contains not printable characters */
    private Drawable f624;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f626;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f628;

    /* renamed from: ˏ, reason: contains not printable characters */
    private Runnable f629;

    /* renamed from: ˑ, reason: contains not printable characters */
    private long f630;

    /* renamed from: י, reason: contains not printable characters */
    private long f631;

    /* renamed from: ـ, reason: contains not printable characters */
    private c f632;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f625 = 255;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f627 = -1;

    /* compiled from: DrawableContainerCompat.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.m782(true);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: androidx.appcompat.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0015b {
        /* renamed from: ʻ, reason: contains not printable characters */
        public static boolean m786(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public static void m787(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public static Resources m788(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    static abstract class d extends Drawable.ConstantState {

        /* renamed from: ʻ, reason: contains not printable characters */
        final b f635;

        /* renamed from: ʻʻ, reason: contains not printable characters */
        boolean f636;

        /* renamed from: ʼ, reason: contains not printable characters */
        Resources f637;

        /* renamed from: ʼʼ, reason: contains not printable characters */
        boolean f638;

        /* renamed from: ʽ, reason: contains not printable characters */
        int f639;

        /* renamed from: ʽʽ, reason: contains not printable characters */
        ColorFilter f640;

        /* renamed from: ʾ, reason: contains not printable characters */
        int f641;

        /* renamed from: ʾʾ, reason: contains not printable characters */
        PorterDuff.Mode f642;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f643;

        /* renamed from: ʿʿ, reason: contains not printable characters */
        ColorStateList f644;

        /* renamed from: ˆ, reason: contains not printable characters */
        SparseArray<Drawable.ConstantState> f645;

        /* renamed from: ˆˆ, reason: contains not printable characters */
        boolean f646;

        /* renamed from: ˈ, reason: contains not printable characters */
        Drawable[] f647;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f648;

        /* renamed from: ˊ, reason: contains not printable characters */
        boolean f649;

        /* renamed from: ˋ, reason: contains not printable characters */
        boolean f650;

        /* renamed from: ˎ, reason: contains not printable characters */
        Rect f651;

        /* renamed from: ˏ, reason: contains not printable characters */
        boolean f652;

        /* renamed from: ˑ, reason: contains not printable characters */
        boolean f653;

        /* renamed from: י, reason: contains not printable characters */
        int f654;

        /* renamed from: ـ, reason: contains not printable characters */
        int f655;

        /* renamed from: ــ, reason: contains not printable characters */
        boolean f656;

        /* renamed from: ٴ, reason: contains not printable characters */
        int f657;

        /* renamed from: ᐧ, reason: contains not printable characters */
        int f658;

        /* renamed from: ᐧᐧ, reason: contains not printable characters */
        int f659;

        /* renamed from: ᴵ, reason: contains not printable characters */
        boolean f660;

        /* renamed from: ᴵᴵ, reason: contains not printable characters */
        int f661;

        /* renamed from: ᵎ, reason: contains not printable characters */
        int f662;

        /* renamed from: ᵔ, reason: contains not printable characters */
        boolean f663;

        /* renamed from: ᵢ, reason: contains not printable characters */
        boolean f664;

        /* renamed from: ⁱ, reason: contains not printable characters */
        boolean f665;

        /* renamed from: ﹳ, reason: contains not printable characters */
        boolean f666;

        /* renamed from: ﹶ, reason: contains not printable characters */
        boolean f667;

        /* renamed from: ﾞ, reason: contains not printable characters */
        boolean f668;

        /* renamed from: ﾞﾞ, reason: contains not printable characters */
        int f669;

        d(d dVar, b bVar, Resources resources) {
            this.f649 = false;
            this.f652 = false;
            this.f667 = true;
            this.f659 = 0;
            this.f661 = 0;
            this.f635 = bVar;
            this.f637 = resources != null ? resources : dVar != null ? dVar.f637 : null;
            int m781 = b.m781(resources, dVar != null ? dVar.f639 : 0);
            this.f639 = m781;
            if (dVar == null) {
                this.f647 = new Drawable[10];
                this.f648 = 0;
                return;
            }
            this.f641 = dVar.f641;
            this.f643 = dVar.f643;
            this.f665 = true;
            this.f666 = true;
            this.f649 = dVar.f649;
            this.f652 = dVar.f652;
            this.f667 = dVar.f667;
            this.f668 = dVar.f668;
            this.f669 = dVar.f669;
            this.f659 = dVar.f659;
            this.f661 = dVar.f661;
            this.f636 = dVar.f636;
            this.f640 = dVar.f640;
            this.f638 = dVar.f638;
            this.f644 = dVar.f644;
            this.f642 = dVar.f642;
            this.f656 = dVar.f656;
            this.f646 = dVar.f646;
            if (dVar.f639 == m781) {
                if (dVar.f650) {
                    this.f651 = dVar.f651 != null ? new Rect(dVar.f651) : null;
                    this.f650 = true;
                }
                if (dVar.f653) {
                    this.f654 = dVar.f654;
                    this.f655 = dVar.f655;
                    this.f657 = dVar.f657;
                    this.f658 = dVar.f658;
                    this.f653 = true;
                }
            }
            if (dVar.f660) {
                this.f662 = dVar.f662;
                this.f660 = true;
            }
            if (dVar.f663) {
                this.f664 = dVar.f664;
                this.f663 = true;
            }
            Drawable[] drawableArr = dVar.f647;
            this.f647 = new Drawable[drawableArr.length];
            this.f648 = dVar.f648;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f645;
            if (sparseArray != null) {
                this.f645 = sparseArray.clone();
            } else {
                this.f645 = new SparseArray<>(this.f648);
            }
            int i5 = this.f648;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f645.put(i6, constantState);
                    } else {
                        this.f647[i6] = drawableArr[i6];
                    }
                }
            }
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        private void m791() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f645;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    this.f647[this.f645.keyAt(i5)] = m792(this.f645.valueAt(i5).newDrawable(this.f637));
                }
                this.f645 = null;
            }
        }

        /* renamed from: ᵎ, reason: contains not printable characters */
        private Drawable m792(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m2208(drawable, this.f669);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f635);
            return mutate;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i5 = this.f648;
            Drawable[] drawableArr = this.f647;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f645.get(i6);
                    if (constantState != null && C0015b.m786(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.m2197(drawable)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f641 | this.f643;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public final int m793(Drawable drawable) {
            int i5 = this.f648;
            if (i5 >= this.f647.length) {
                mo806(i5, i5 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f635);
            this.f647[i5] = drawable;
            this.f648++;
            this.f643 = drawable.getChangingConfigurations() | this.f643;
            m807();
            this.f651 = null;
            this.f650 = false;
            this.f653 = false;
            this.f665 = false;
            return i5;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        final void m794(Resources.Theme theme) {
            if (theme != null) {
                m791();
                int i5 = this.f648;
                Drawable[] drawableArr = this.f647;
                for (int i6 = 0; i6 < i5; i6++) {
                    Drawable drawable = drawableArr[i6];
                    if (drawable != null && androidx.core.graphics.drawable.a.m2197(drawable)) {
                        androidx.core.graphics.drawable.a.m2196(drawableArr[i6], theme);
                        this.f643 |= drawableArr[i6].getChangingConfigurations();
                    }
                }
                m814(C0015b.m788(theme));
            }
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public boolean m795() {
            if (this.f665) {
                return this.f666;
            }
            m791();
            this.f665 = true;
            int i5 = this.f648;
            Drawable[] drawableArr = this.f647;
            for (int i6 = 0; i6 < i5; i6++) {
                if (drawableArr[i6].getConstantState() == null) {
                    this.f666 = false;
                    return false;
                }
            }
            this.f666 = true;
            return true;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        protected void m796() {
            this.f653 = true;
            m791();
            int i5 = this.f648;
            Drawable[] drawableArr = this.f647;
            this.f655 = -1;
            this.f654 = -1;
            this.f658 = 0;
            this.f657 = 0;
            for (int i6 = 0; i6 < i5; i6++) {
                Drawable drawable = drawableArr[i6];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f654) {
                    this.f654 = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f655) {
                    this.f655 = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f657) {
                    this.f657 = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f658) {
                    this.f658 = minimumHeight;
                }
            }
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        final int m797() {
            return this.f647.length;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public final Drawable m798(int i5) {
            int indexOfKey;
            Drawable drawable = this.f647[i5];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f645;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i5)) < 0) {
                return null;
            }
            Drawable m792 = m792(this.f645.valueAt(indexOfKey).newDrawable(this.f637));
            this.f647[i5] = m792;
            this.f645.removeAt(indexOfKey);
            if (this.f645.size() == 0) {
                this.f645 = null;
            }
            return m792;
        }

        /* renamed from: ˉ, reason: contains not printable characters */
        public final int m799() {
            return this.f648;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final int m800() {
            if (!this.f653) {
                m796();
            }
            return this.f655;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final int m801() {
            if (!this.f653) {
                m796();
            }
            return this.f658;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final int m802() {
            if (!this.f653) {
                m796();
            }
            return this.f657;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final Rect m803() {
            Rect rect = null;
            if (this.f649) {
                return null;
            }
            Rect rect2 = this.f651;
            if (rect2 != null || this.f650) {
                return rect2;
            }
            m791();
            Rect rect3 = new Rect();
            int i5 = this.f648;
            Drawable[] drawableArr = this.f647;
            for (int i6 = 0; i6 < i5; i6++) {
                if (drawableArr[i6].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i7 = rect3.left;
                    if (i7 > rect.left) {
                        rect.left = i7;
                    }
                    int i8 = rect3.top;
                    if (i8 > rect.top) {
                        rect.top = i8;
                    }
                    int i9 = rect3.right;
                    if (i9 > rect.right) {
                        rect.right = i9;
                    }
                    int i10 = rect3.bottom;
                    if (i10 > rect.bottom) {
                        rect.bottom = i10;
                    }
                }
            }
            this.f650 = true;
            this.f651 = rect;
            return rect;
        }

        /* renamed from: ˑ, reason: contains not printable characters */
        public final int m804() {
            if (!this.f653) {
                m796();
            }
            return this.f654;
        }

        /* renamed from: י, reason: contains not printable characters */
        public final int m805() {
            if (this.f660) {
                return this.f662;
            }
            m791();
            int i5 = this.f648;
            Drawable[] drawableArr = this.f647;
            int opacity = i5 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i6 = 1; i6 < i5; i6++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i6].getOpacity());
            }
            this.f662 = opacity;
            this.f660 = true;
            return opacity;
        }

        /* renamed from: ـ, reason: contains not printable characters */
        public void mo806(int i5, int i6) {
            Drawable[] drawableArr = new Drawable[i6];
            Drawable[] drawableArr2 = this.f647;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i5);
            }
            this.f647 = drawableArr;
        }

        /* renamed from: ٴ, reason: contains not printable characters */
        void m807() {
            this.f660 = false;
            this.f663 = false;
        }

        /* renamed from: ᐧ, reason: contains not printable characters */
        public final boolean m808() {
            return this.f652;
        }

        /* renamed from: ᴵ */
        abstract void mo773();

        /* renamed from: ᵔ, reason: contains not printable characters */
        public final void m809(boolean z5) {
            this.f652 = z5;
        }

        /* renamed from: ᵢ, reason: contains not printable characters */
        public final void m810(int i5) {
            this.f659 = i5;
        }

        /* renamed from: ⁱ, reason: contains not printable characters */
        public final void m811(int i5) {
            this.f661 = i5;
        }

        /* renamed from: ﹳ, reason: contains not printable characters */
        final boolean m812(int i5, int i6) {
            int i7 = this.f648;
            Drawable[] drawableArr = this.f647;
            boolean z5 = false;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    boolean m2208 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m2208(drawable, i5) : false;
                    if (i8 == i6) {
                        z5 = m2208;
                    }
                }
            }
            this.f669 = i5;
            return z5;
        }

        /* renamed from: ﹶ, reason: contains not printable characters */
        public final void m813(boolean z5) {
            this.f649 = z5;
        }

        /* renamed from: ﾞ, reason: contains not printable characters */
        final void m814(Resources resources) {
            if (resources != null) {
                this.f637 = resources;
                int m781 = b.m781(resources, this.f639);
                int i5 = this.f639;
                this.f639 = m781;
                if (i5 != m781) {
                    this.f653 = false;
                    this.f650 = false;
                }
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m779(Drawable drawable) {
        if (this.f632 == null) {
            this.f632 = new c();
        }
        drawable.setCallback(this.f632.m790(drawable.getCallback()));
        try {
            if (this.f621.f659 <= 0 && this.f626) {
                drawable.setAlpha(this.f625);
            }
            d dVar = this.f621;
            if (dVar.f638) {
                drawable.setColorFilter(dVar.f640);
            } else {
                if (dVar.f656) {
                    androidx.core.graphics.drawable.a.m2210(drawable, dVar.f644);
                }
                d dVar2 = this.f621;
                if (dVar2.f646) {
                    androidx.core.graphics.drawable.a.m2211(drawable, dVar2.f642);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f621.f667);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23) {
                androidx.core.graphics.drawable.a.m2208(drawable, androidx.core.graphics.drawable.a.m2201(this));
            }
            androidx.core.graphics.drawable.a.m2205(drawable, this.f621.f636);
            Rect rect = this.f622;
            if (i5 >= 21 && rect != null) {
                androidx.core.graphics.drawable.a.m2207(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f632.m789());
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private boolean m780() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.m2201(this) == 1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static int m781(Resources resources, int i5) {
        if (resources != null) {
            i5 = resources.getDisplayMetrics().densityDpi;
        }
        if (i5 == 0) {
            return 160;
        }
        return i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f621.m794(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f621.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f623;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f624;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f625;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f621.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f621.m795()) {
            return null;
        }
        this.f621.f641 = getChangingConfigurations();
        return this.f621;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f623;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f622;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f621.m808()) {
            return this.f621.m800();
        }
        Drawable drawable = this.f623;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f621.m808()) {
            return this.f621.m804();
        }
        Drawable drawable = this.f623;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f621.m808()) {
            return this.f621.m801();
        }
        Drawable drawable = this.f623;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f621.m808()) {
            return this.f621.m802();
        }
        Drawable drawable = this.f623;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f623;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f621.m805();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f623;
        if (drawable != null) {
            C0015b.m787(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect m803 = this.f621.m803();
        if (m803 != null) {
            rect.set(m803);
            padding = (m803.right | ((m803.left | m803.top) | m803.bottom)) != 0;
        } else {
            Drawable drawable = this.f623;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m780()) {
            int i5 = rect.left;
            rect.left = rect.right;
            rect.right = i5;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f621;
        if (dVar != null) {
            dVar.m807();
        }
        if (drawable != this.f623 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f621.f636;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z5;
        Drawable drawable = this.f624;
        boolean z6 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f624 = null;
            z5 = true;
        } else {
            z5 = false;
        }
        Drawable drawable2 = this.f623;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f626) {
                this.f623.setAlpha(this.f625);
            }
        }
        if (this.f631 != 0) {
            this.f631 = 0L;
            z5 = true;
        }
        if (this.f630 != 0) {
            this.f630 = 0L;
        } else {
            z6 = z5;
        }
        if (z6) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f628 && super.mutate() == this) {
            d mo759 = mo759();
            mo759.mo773();
            mo760(mo759);
            this.f628 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f624;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f623;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i5) {
        return this.f621.m812(i5, m783());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        Drawable drawable = this.f624;
        if (drawable != null) {
            return drawable.setLevel(i5);
        }
        Drawable drawable2 = this.f623;
        if (drawable2 != null) {
            return drawable2.setLevel(i5);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f624;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f623;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        if (drawable != this.f623 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        if (this.f626 && this.f625 == i5) {
            return;
        }
        this.f626 = true;
        this.f625 = i5;
        Drawable drawable = this.f623;
        if (drawable != null) {
            if (this.f630 == 0) {
                drawable.setAlpha(i5);
            } else {
                m782(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        d dVar = this.f621;
        if (dVar.f636 != z5) {
            dVar.f636 = z5;
            Drawable drawable = this.f623;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.m2205(drawable, z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f621;
        dVar.f638 = true;
        if (dVar.f640 != colorFilter) {
            dVar.f640 = colorFilter;
            Drawable drawable = this.f623;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        d dVar = this.f621;
        if (dVar.f667 != z5) {
            dVar.f667 = z5;
            Drawable drawable = this.f623;
            if (drawable != null) {
                drawable.setDither(z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f5, float f6) {
        Drawable drawable = this.f623;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2206(drawable, f5, f6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i5, int i6, int i7, int i8) {
        Rect rect = this.f622;
        if (rect == null) {
            this.f622 = new Rect(i5, i6, i7, i8);
        } else {
            rect.set(i5, i6, i7, i8);
        }
        Drawable drawable = this.f623;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m2207(drawable, i5, i6, i7, i8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f621;
        dVar.f656 = true;
        if (dVar.f644 != colorStateList) {
            dVar.f644 = colorStateList;
            androidx.core.graphics.drawable.a.m2210(this.f623, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f621;
        dVar.f646 = true;
        if (dVar.f642 != mode) {
            dVar.f642 = mode;
            androidx.core.graphics.drawable.a.m2211(this.f623, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        Drawable drawable = this.f624;
        if (drawable != null) {
            drawable.setVisible(z5, z6);
        }
        Drawable drawable2 = this.f623;
        if (drawable2 != null) {
            drawable2.setVisible(z5, z6);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f623 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* renamed from: ʻ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m782(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f626 = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f623
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f630
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f625
            r3.setAlpha(r9)
            r13.f630 = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.b$d r9 = r13.f621
            int r9 = r9.f659
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f625
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f630 = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f624
            if (r9 == 0) goto L65
            long r10 = r13.f631
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f624 = r0
            r13.f631 = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.b$d r4 = r13.f621
            int r4 = r4.f661
            int r3 = r3 / r4
            int r4 = r13.f625
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f631 = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f629
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.m782(boolean):void");
    }

    /* renamed from: ʼ */
    d mo759() {
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    int m783() {
        return this.f627;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* renamed from: ˈ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m784(int r10) {
        /*
            r9 = this;
            int r0 = r9.f627
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f621
            int r0 = r0.f661
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f624
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f623
            if (r0 == 0) goto L29
            r9.f624 = r0
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f621
            int r0 = r0.f661
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f631 = r0
            goto L35
        L29:
            r9.f624 = r4
            r9.f631 = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f623
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.b$d r0 = r9.f621
            int r1 = r0.f648
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m798(r10)
            r9.f623 = r0
            r9.f627 = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.b$d r10 = r9.f621
            int r10 = r10.f659
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f630 = r2
        L51:
            r9.m779(r0)
            goto L5a
        L55:
            r9.f623 = r4
            r10 = -1
            r9.f627 = r10
        L5a:
            long r0 = r9.f630
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f631
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f629
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.b$a r0 = new androidx.appcompat.graphics.drawable.b$a
            r0.<init>()
            r9.f629 = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m782(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.b.m784(int):boolean");
    }

    /* renamed from: ˉ */
    void mo760(d dVar) {
        this.f621 = dVar;
        int i5 = this.f627;
        if (i5 >= 0) {
            Drawable m798 = dVar.m798(i5);
            this.f623 = m798;
            if (m798 != null) {
                m779(m798);
            }
        }
        this.f624 = null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    final void m785(Resources resources) {
        this.f621.m814(resources);
    }

    /* compiled from: DrawableContainerCompat.java */
    static class c implements Drawable.Callback {

        /* renamed from: ʾ, reason: contains not printable characters */
        private Drawable.Callback f634;

        c() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
            Drawable.Callback callback = this.f634;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j5);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f634;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public Drawable.Callback m789() {
            Drawable.Callback callback = this.f634;
            this.f634 = null;
            return callback;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public c m790(Drawable.Callback callback) {
            this.f634 = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
