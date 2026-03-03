package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.accessibility.j0;
import androidx.core.view.f1;
import androidx.core.view.f5;
import androidx.core.view.u0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: E:\78999\cookie_5123796.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: ʻˊ, reason: contains not printable characters */
    static final int[] f4703 = {R.attr.layout_gravity};

    /* renamed from: ʻˋ, reason: contains not printable characters */
    private static final Comparator<f> f4704 = new a();

    /* renamed from: ʻˎ, reason: contains not printable characters */
    private static final Interpolator f4705 = new b();

    /* renamed from: ʻˏ, reason: contains not printable characters */
    private static final m f4706 = new m();

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private boolean f4707;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private j f4708;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private j f4709;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private List<i> f4710;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private int f4711;

    /* renamed from: ʻˆ, reason: contains not printable characters */
    private ArrayList<View> f4712;

    /* renamed from: ʻˈ, reason: contains not printable characters */
    private final Runnable f4713;

    /* renamed from: ʻˉ, reason: contains not printable characters */
    private int f4714;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private int f4715;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private int f4716;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f4717;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private float f4718;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final ArrayList<f> f4719;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private int f4720;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final f f4721;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    private float f4722;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final Rect f4723;

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private int f4724;

    /* renamed from: ˉ, reason: contains not printable characters */
    androidx.viewpager.widget.a f4725;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private float f4726;

    /* renamed from: ˊ, reason: contains not printable characters */
    int f4727;

    /* renamed from: ˊˊ, reason: contains not printable characters */
    private int f4728;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f4729;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private VelocityTracker f4730;

    /* renamed from: ˎ, reason: contains not printable characters */
    private Parcelable f4731;

    /* renamed from: ˎˎ, reason: contains not printable characters */
    private int f4732;

    /* renamed from: ˏ, reason: contains not printable characters */
    private ClassLoader f4733;

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private int f4734;

    /* renamed from: ˑ, reason: contains not printable characters */
    private Scroller f4735;

    /* renamed from: ˑˑ, reason: contains not printable characters */
    private int f4736;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f4737;

    /* renamed from: יי, reason: contains not printable characters */
    private EdgeEffect f4738;

    /* renamed from: ـ, reason: contains not printable characters */
    private k f4739;

    /* renamed from: ــ, reason: contains not printable characters */
    private float f4740;

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f4741;

    /* renamed from: ٴٴ, reason: contains not printable characters */
    private int f4742;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private Drawable f4743;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private int f4744;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private int f4745;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private boolean f4746;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int f4747;

    /* renamed from: ᵎᵎ, reason: contains not printable characters */
    private EdgeEffect f4748;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private float f4749;

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private boolean f4750;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private float f4751;

    /* renamed from: ᵢᵢ, reason: contains not printable characters */
    private boolean f4752;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int f4753;

    /* renamed from: ⁱⁱ, reason: contains not printable characters */
    private boolean f4754;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f4755;

    /* renamed from: ﹳﹳ, reason: contains not printable characters */
    private boolean f4756;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f4757;

    /* renamed from: ﹶﹶ, reason: contains not printable characters */
    private List<j> f4758;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean f4759;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean f4760;

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f4765 - fVar2.f4765;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f5) {
            float f6 = f5 - 1.0f;
            return (f6 * f6 * f6 * f6 * f6) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.m5576();
        }
    }

    class d implements u0 {

        /* renamed from: ʻ, reason: contains not printable characters */
        private final Rect f4762 = new Rect();

        d() {
        }

        @Override // androidx.core.view.u0
        /* renamed from: ʻ */
        public f5 mo691(View view, f5 f5Var) {
            f5 m2816 = f1.m2816(view, f5Var);
            if (m2816.m3080()) {
                return m2816;
            }
            Rect rect = this.f4762;
            rect.left = m2816.m3074();
            rect.top = m2816.m3076();
            rect.right = m2816.m3075();
            rect.bottom = m2816.m3073();
            int childCount = ViewPager.this.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                f5 m2872 = f1.m2872(ViewPager.this.getChildAt(i5), m2816);
                rect.left = Math.min(m2872.m3074(), rect.left);
                rect.top = Math.min(m2872.m3076(), rect.top);
                rect.right = Math.min(m2872.m3075(), rect.right);
                rect.bottom = Math.min(m2872.m3073(), rect.bottom);
            }
            return m2816.m3082(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        Object f4764;

        /* renamed from: ʼ, reason: contains not printable characters */
        int f4765;

        /* renamed from: ʽ, reason: contains not printable characters */
        boolean f4766;

        /* renamed from: ʾ, reason: contains not printable characters */
        float f4767;

        /* renamed from: ʿ, reason: contains not printable characters */
        float f4768;

        f() {
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private boolean m5596() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f4725;
            return aVar != null && aVar.mo5605() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(m5596());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f4725) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.mo5605());
            accessibilityEvent.setFromIndex(ViewPager.this.f4727);
            accessibilityEvent.setToIndex(ViewPager.this.f4727);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j0 j0Var) {
            super.onInitializeAccessibilityNodeInfo(view, j0Var);
            j0Var.m2641(ViewPager.class.getName());
            j0Var.m2663(m5596());
            if (ViewPager.this.canScrollHorizontally(1)) {
                j0Var.m2636(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                j0Var.m2636(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
            if (super.performAccessibilityAction(view, i5, bundle)) {
                return true;
            }
            if (i5 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f4727 + 1);
                return true;
            }
            if (i5 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f4727 - 1);
            return true;
        }
    }

    public interface i {
        /* renamed from: ʻ, reason: contains not printable characters */
        void mo5597(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void onPageScrollStateChanged(int i5);

        void onPageScrolled(int i5, float f5, int i6);

        void onPageSelected(int i5);
    }

    private class k extends DataSetObserver {
        k() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.m5580();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.m5580();
        }
    }

    public static class l extends androidx.customview.view.a {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        int f4777;

        /* renamed from: ʿ, reason: contains not printable characters */
        Parcelable f4778;

        /* renamed from: ˆ, reason: contains not printable characters */
        ClassLoader f4779;

        static class a implements Parcelable.ClassLoaderCreator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʽ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public l[] newArray(int i5) {
                return new l[i5];
            }
        }

        public l(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f4777 + "}";
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeInt(this.f4777);
            parcel.writeParcelable(this.f4778, i5);
        }

        l(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f4777 = parcel.readInt();
            this.f4778 = parcel.readParcelable(classLoader);
            this.f4779 = classLoader;
        }
    }

    static class m implements Comparator<View> {
        m() {
        }

        @Override // java.util.Comparator
        /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z5 = gVar.f4769;
            return z5 != gVar2.f4769 ? z5 ? 1 : -1 : gVar.f4773 - gVar2.f4773;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4719 = new ArrayList<>();
        this.f4721 = new f();
        this.f4723 = new Rect();
        this.f4729 = -1;
        this.f4731 = null;
        this.f4733 = null;
        this.f4749 = -3.4028235E38f;
        this.f4751 = Float.MAX_VALUE;
        this.f4744 = 1;
        this.f4724 = -1;
        this.f4752 = true;
        this.f4754 = false;
        this.f4713 = new c();
        this.f4714 = 0;
        m5592();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z5) {
        if (this.f4759 != z5) {
            this.f4759 = z5;
        }
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private boolean m5552(float f5) {
        boolean z5;
        boolean z6;
        float f6 = this.f4718 - f5;
        this.f4718 = f5;
        float scrollX = getScrollX() + f6;
        float clientWidth = getClientWidth();
        float f7 = this.f4749 * clientWidth;
        float f8 = this.f4751 * clientWidth;
        boolean z7 = false;
        f fVar = this.f4719.get(0);
        ArrayList<f> arrayList = this.f4719;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f4765 != 0) {
            f7 = fVar.f4768 * clientWidth;
            z5 = false;
        } else {
            z5 = true;
        }
        if (fVar2.f4765 != this.f4725.mo5605() - 1) {
            f8 = fVar2.f4768 * clientWidth;
            z6 = false;
        } else {
            z6 = true;
        }
        if (scrollX < f7) {
            if (z5) {
                this.f4738.onPull(Math.abs(f7 - scrollX) / clientWidth);
                z7 = true;
            }
            scrollX = f7;
        } else if (scrollX > f8) {
            if (z6) {
                this.f4748.onPull(Math.abs(scrollX - f8) / clientWidth);
                z7 = true;
            }
            scrollX = f8;
        }
        int i5 = (int) scrollX;
        this.f4718 += scrollX - i5;
        scrollTo(i5, getScrollY());
        m5566(i5);
        return z7;
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private void m5553() {
        int i5 = 0;
        while (i5 < getChildCount()) {
            if (!((g) getChildAt(i5).getLayoutParams()).f4769) {
                removeViewAt(i5);
                i5--;
            }
            i5++;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m5554(f fVar, int i5, f fVar2) {
        int i6;
        int i7;
        f fVar3;
        f fVar4;
        int mo5605 = this.f4725.mo5605();
        int clientWidth = getClientWidth();
        float f5 = clientWidth > 0 ? this.f4741 / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i8 = fVar2.f4765;
            int i9 = fVar.f4765;
            if (i8 < i9) {
                float f6 = fVar2.f4768 + fVar2.f4767 + f5;
                int i10 = i8 + 1;
                int i11 = 0;
                while (i10 <= fVar.f4765 && i11 < this.f4719.size()) {
                    f fVar5 = this.f4719.get(i11);
                    while (true) {
                        fVar4 = fVar5;
                        if (i10 <= fVar4.f4765 || i11 >= this.f4719.size() - 1) {
                            break;
                        }
                        i11++;
                        fVar5 = this.f4719.get(i11);
                    }
                    while (i10 < fVar4.f4765) {
                        f6 += this.f4725.m5608(i10) + f5;
                        i10++;
                    }
                    fVar4.f4768 = f6;
                    f6 += fVar4.f4767 + f5;
                    i10++;
                }
            } else if (i8 > i9) {
                int size = this.f4719.size() - 1;
                float f7 = fVar2.f4768;
                while (true) {
                    i8--;
                    if (i8 < fVar.f4765 || size < 0) {
                        break;
                    }
                    f fVar6 = this.f4719.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i8 >= fVar3.f4765 || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f4719.get(size);
                    }
                    while (i8 > fVar3.f4765) {
                        f7 -= this.f4725.m5608(i8) + f5;
                        i8--;
                    }
                    f7 -= fVar3.f4767 + f5;
                    fVar3.f4768 = f7;
                }
            }
        }
        int size2 = this.f4719.size();
        float f8 = fVar.f4768;
        int i12 = fVar.f4765;
        int i13 = i12 - 1;
        this.f4749 = i12 == 0 ? f8 : -3.4028235E38f;
        int i14 = mo5605 - 1;
        this.f4751 = i12 == i14 ? (fVar.f4767 + f8) - 1.0f : Float.MAX_VALUE;
        int i15 = i5 - 1;
        while (i15 >= 0) {
            f fVar7 = this.f4719.get(i15);
            while (true) {
                i7 = fVar7.f4765;
                if (i13 <= i7) {
                    break;
                }
                f8 -= this.f4725.m5608(i13) + f5;
                i13--;
            }
            f8 -= fVar7.f4767 + f5;
            fVar7.f4768 = f8;
            if (i7 == 0) {
                this.f4749 = f8;
            }
            i15--;
            i13--;
        }
        float f9 = fVar.f4768 + fVar.f4767 + f5;
        int i16 = fVar.f4765 + 1;
        int i17 = i5 + 1;
        while (i17 < size2) {
            f fVar8 = this.f4719.get(i17);
            while (true) {
                i6 = fVar8.f4765;
                if (i16 >= i6) {
                    break;
                }
                f9 += this.f4725.m5608(i16) + f5;
                i16++;
            }
            if (i6 == i14) {
                this.f4751 = (fVar8.f4767 + f9) - 1.0f;
            }
            fVar8.f4768 = f9;
            f9 += fVar8.f4767 + f5;
            i17++;
            i16++;
        }
        this.f4754 = false;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private void m5555(int i5, int i6, int i7, int i8) {
        if (i6 > 0 && !this.f4719.isEmpty()) {
            if (!this.f4735.isFinished()) {
                this.f4735.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i6 - getPaddingLeft()) - getPaddingRight()) + i8)) * (((i5 - getPaddingLeft()) - getPaddingRight()) + i7)), getScrollY());
                return;
            }
        }
        f m5591 = m5591(this.f4727);
        int min = (int) ((m5591 != null ? Math.min(m5591.f4768, this.f4751) : 0.0f) * ((i5 - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            m5556(false);
            scrollTo(min, getScrollY());
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m5556(boolean z5) {
        boolean z6 = this.f4714 == 2;
        if (z6) {
            setScrollingCacheEnabled(false);
            if (!this.f4735.isFinished()) {
                this.f4735.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f4735.getCurrX();
                int currY = this.f4735.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m5566(currX);
                    }
                }
            }
        }
        this.f4760 = false;
        for (int i5 = 0; i5 < this.f4719.size(); i5++) {
            f fVar = this.f4719.get(i5);
            if (fVar.f4766) {
                fVar.f4766 = false;
                z6 = true;
            }
        }
        if (z6) {
            if (z5) {
                f1.m2822(this, this.f4713);
            } else {
                this.f4713.run();
            }
        }
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private boolean m5557() {
        this.f4724 = -1;
        m5564();
        this.f4738.onRelease();
        this.f4748.onRelease();
        return this.f4738.isFinished() || this.f4748.isFinished();
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private void m5558(boolean z5) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z5);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private int m5559(int i5, float f5, int i6, int i7) {
        if (Math.abs(i7) <= this.f4732 || Math.abs(i6) <= this.f4728) {
            i5 += (int) (f5 + (i5 >= this.f4727 ? 0.4f : 0.6f));
        } else if (i6 <= 0) {
            i5++;
        }
        if (this.f4719.size() <= 0) {
            return i5;
        }
        return Math.max(this.f4719.get(0).f4765, Math.min(i5, this.f4719.get(r4.size() - 1).f4765));
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private void m5560(int i5, float f5, int i6) {
        j jVar = this.f4708;
        if (jVar != null) {
            jVar.onPageScrolled(i5, f5, i6);
        }
        List<j> list = this.f4758;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                j jVar2 = this.f4758.get(i7);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i5, f5, i6);
                }
            }
        }
        j jVar3 = this.f4709;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i5, f5, i6);
        }
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private void m5561(int i5, boolean z5, int i6, boolean z6) {
        f m5591 = m5591(i5);
        int clientWidth = m5591 != null ? (int) (getClientWidth() * Math.max(this.f4749, Math.min(m5591.f4768, this.f4751))) : 0;
        if (z5) {
            m5585(clientWidth, 0, i6);
            if (z6) {
                m5562(i5);
                return;
            }
            return;
        }
        if (z6) {
            m5562(i5);
        }
        m5556(false);
        scrollTo(clientWidth, 0);
        m5566(clientWidth);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m5562(int i5) {
        j jVar = this.f4708;
        if (jVar != null) {
            jVar.onPageSelected(i5);
        }
        List<j> list = this.f4758;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar2 = this.f4758.get(i6);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i5);
                }
            }
        }
        j jVar3 = this.f4709;
        if (jVar3 != null) {
            jVar3.onPageSelected(i5);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m5563(int i5) {
        j jVar = this.f4708;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i5);
        }
        List<j> list = this.f4758;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                j jVar2 = this.f4758.get(i6);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i5);
                }
            }
        }
        j jVar3 = this.f4709;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i5);
        }
    }

    /* renamed from: י, reason: contains not printable characters */
    private void m5564() {
        this.f4746 = false;
        this.f4707 = false;
        VelocityTracker velocityTracker = this.f4730;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4730 = null;
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private Rect m5565(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private boolean m5566(int i5) {
        if (this.f4719.size() == 0) {
            if (this.f4752) {
                return false;
            }
            this.f4756 = false;
            m5593(0, 0.0f, 0);
            if (this.f4756) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f m5567 = m5567();
        int clientWidth = getClientWidth();
        int i6 = this.f4741;
        int i7 = clientWidth + i6;
        float f5 = clientWidth;
        int i8 = m5567.f4765;
        float f6 = ((i5 / f5) - m5567.f4768) / (m5567.f4767 + (i6 / f5));
        this.f4756 = false;
        m5593(i8, f6, (int) (i7 * f6));
        if (this.f4756) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private f m5567() {
        int i5;
        int clientWidth = getClientWidth();
        float f5 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f6 = clientWidth > 0 ? this.f4741 / clientWidth : 0.0f;
        f fVar = null;
        float f7 = 0.0f;
        int i6 = -1;
        int i7 = 0;
        boolean z5 = true;
        while (i7 < this.f4719.size()) {
            f fVar2 = this.f4719.get(i7);
            if (!z5 && fVar2.f4765 != (i5 = i6 + 1)) {
                fVar2 = this.f4721;
                fVar2.f4768 = f5 + f7 + f6;
                fVar2.f4765 = i5;
                fVar2.f4767 = this.f4725.m5608(i5);
                i7--;
            }
            f fVar3 = fVar2;
            f5 = fVar3.f4768;
            float f8 = fVar3.f4767 + f5 + f6;
            if (!z5 && scrollX < f5) {
                return fVar;
            }
            if (scrollX < f8 || i7 == this.f4719.size() - 1) {
                return fVar3;
            }
            int i8 = fVar3.f4765;
            float f9 = fVar3.f4767;
            i7++;
            z5 = false;
            i6 = i8;
            f7 = f9;
            fVar = fVar3;
        }
        return fVar;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    private void m5568() {
        if (this.f4711 != 0) {
            ArrayList<View> arrayList = this.f4712;
            if (arrayList == null) {
                this.f4712 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                this.f4712.add(getChildAt(i5));
            }
            Collections.sort(this.f4712, f4706);
        }
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private static boolean m5569(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private boolean m5570(float f5, float f6) {
        return (f5 < ((float) this.f4715) && f6 > 0.0f) || (f5 > ((float) (getWidth() - this.f4715)) && f6 < 0.0f);
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    private void m5571(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4724) {
            int i5 = actionIndex == 0 ? 1 : 0;
            this.f4718 = motionEvent.getX(i5);
            this.f4724 = motionEvent.getPointerId(i5);
            VelocityTracker velocityTracker = this.f4730;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i5, int i6) {
        f m5590;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() == 0 && (m5590 = m5590(childAt)) != null && m5590.f4765 == this.f4727) {
                    childAt.addFocusables(arrayList, i5, i6);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i6 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f m5590;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (m5590 = m5590(childAt)) != null && m5590.f4765 == this.f4727) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean m5569 = gVar.f4769 | m5569(view);
        gVar.f4769 = m5569;
        if (!this.f4757) {
            super.addView(view, i5, layoutParams);
        } else {
            if (m5569) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f4772 = true;
            addViewInLayout(view, i5, layoutParams);
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i5) {
        if (this.f4725 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i5 < 0 ? scrollX > ((int) (((float) clientWidth) * this.f4749)) : i5 > 0 && scrollX < ((int) (((float) clientWidth) * this.f4751));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f4737 = true;
        if (this.f4735.isFinished() || !this.f4735.computeScrollOffset()) {
            m5556(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f4735.getCurrX();
        int currY = this.f4735.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!m5566(currX)) {
                this.f4735.abortAnimation();
                scrollTo(0, currY);
            }
        }
        f1.m2821(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m5586(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f m5590;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 0 && (m5590 = m5590(childAt)) != null && m5590.f4765 == this.f4727 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z5 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f4725) != null && aVar.mo5605() > 1)) {
            if (!this.f4738.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f4749 * width);
                this.f4738.setSize(height, width);
                z5 = false | this.f4738.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f4748.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f4751 + 1.0f)) * width2);
                this.f4748.setSize(height2, width2);
                z5 |= this.f4748.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f4738.finish();
            this.f4748.finish();
        }
        if (z5) {
            f1.m2821(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4743;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.f4725;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        if (this.f4711 == 2) {
            i6 = (i5 - 1) - i6;
        }
        return ((g) this.f4712.get(i6).getLayoutParams()).f4774;
    }

    public int getCurrentItem() {
        return this.f4727;
    }

    public int getOffscreenPageLimit() {
        return this.f4744;
    }

    public int getPageMargin() {
        return this.f4741;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4752 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f4713);
        Scroller scroller = this.f4735;
        if (scroller != null && !scroller.isFinished()) {
            this.f4735.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i5;
        float f5;
        float f6;
        super.onDraw(canvas);
        if (this.f4741 <= 0 || this.f4743 == null || this.f4719.size() <= 0 || this.f4725 == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f7 = this.f4741 / width;
        int i6 = 0;
        f fVar = this.f4719.get(0);
        float f8 = fVar.f4768;
        int size = this.f4719.size();
        int i7 = fVar.f4765;
        int i8 = this.f4719.get(size - 1).f4765;
        while (i7 < i8) {
            while (true) {
                i5 = fVar.f4765;
                if (i7 <= i5 || i6 >= size) {
                    break;
                }
                i6++;
                fVar = this.f4719.get(i6);
            }
            if (i7 == i5) {
                float f9 = fVar.f4768;
                float f10 = fVar.f4767;
                f5 = (f9 + f10) * width;
                f8 = f9 + f10 + f7;
            } else {
                float m5608 = this.f4725.m5608(i7);
                f5 = (f8 + m5608) * width;
                f8 += m5608 + f7;
            }
            if (this.f4741 + f5 > scrollX) {
                f6 = f7;
                this.f4743.setBounds(Math.round(f5), this.f4745, Math.round(this.f4741 + f5), this.f4747);
                this.f4743.draw(canvas);
            } else {
                f6 = f7;
            }
            if (f5 > scrollX + r2) {
                return;
            }
            i7++;
            f7 = f6;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m5557();
            return false;
        }
        if (action != 0) {
            if (this.f4746) {
                return true;
            }
            if (this.f4707) {
                return false;
            }
        }
        if (action == 0) {
            float x5 = motionEvent.getX();
            this.f4722 = x5;
            this.f4718 = x5;
            float y5 = motionEvent.getY();
            this.f4726 = y5;
            this.f4740 = y5;
            this.f4724 = motionEvent.getPointerId(0);
            this.f4707 = false;
            this.f4737 = true;
            this.f4735.computeScrollOffset();
            if (this.f4714 != 2 || Math.abs(this.f4735.getFinalX() - this.f4735.getCurrX()) <= this.f4736) {
                m5556(false);
                this.f4746 = false;
            } else {
                this.f4735.abortAnimation();
                this.f4760 = false;
                m5576();
                this.f4746 = true;
                m5558(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i5 = this.f4724;
            if (i5 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i5);
                float x6 = motionEvent.getX(findPointerIndex);
                float f5 = x6 - this.f4718;
                float abs = Math.abs(f5);
                float y6 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y6 - this.f4726);
                if (f5 != 0.0f && !m5570(this.f4718, f5) && m5578(this, false, (int) f5, (int) x6, (int) y6)) {
                    this.f4718 = x6;
                    this.f4740 = y6;
                    this.f4707 = true;
                    return false;
                }
                int i6 = this.f4720;
                if (abs > i6 && abs * 0.5f > abs2) {
                    this.f4746 = true;
                    m5558(true);
                    setScrollState(1);
                    this.f4718 = f5 > 0.0f ? this.f4722 + this.f4720 : this.f4722 - this.f4720;
                    this.f4740 = y6;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > i6) {
                    this.f4707 = true;
                }
                if (this.f4746 && m5552(x6)) {
                    f1.m2821(this);
                }
            }
        } else if (action == 6) {
            m5571(motionEvent);
        }
        if (this.f4730 == null) {
            this.f4730 = VelocityTracker.obtain();
        }
        this.f4730.addMovement(motionEvent);
        return this.f4746;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i5, Rect rect) {
        int i6;
        int i7;
        int i8;
        f m5590;
        int childCount = getChildCount();
        if ((i5 & 2) != 0) {
            i7 = childCount;
            i6 = 0;
            i8 = 1;
        } else {
            i6 = childCount - 1;
            i7 = -1;
            i8 = -1;
        }
        while (i6 != i7) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 0 && (m5590 = m5590(childAt)) != null && m5590.f4765 == this.f4727 && childAt.requestFocus(i5, rect)) {
                return true;
            }
            i6 += i8;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        androidx.viewpager.widget.a aVar = this.f4725;
        if (aVar != null) {
            aVar.m5612(lVar.f4778, lVar.f4779);
            m5583(lVar.f4777, false, true);
        } else {
            this.f4729 = lVar.f4777;
            this.f4731 = lVar.f4778;
            this.f4733 = lVar.f4779;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f4777 = this.f4727;
        androidx.viewpager.widget.a aVar = this.f4725;
        if (aVar != null) {
            lVar.f4778 = aVar.m5613();
        }
        return lVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i5, int i6, int i7, int i8) {
        super.onSizeChanged(i5, i6, i7, i8);
        if (i5 != i7) {
            int i9 = this.f4741;
            m5555(i5, i7, i9, i9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f4757) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f4725;
        if (aVar2 != null) {
            aVar2.m5616(null);
            this.f4725.m5618(this);
            for (int i5 = 0; i5 < this.f4719.size(); i5++) {
                f fVar = this.f4719.get(i5);
                this.f4725.mo5602(this, fVar.f4765, fVar.f4764);
            }
            this.f4725.m5604(this);
            this.f4719.clear();
            m5553();
            this.f4727 = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f4725;
        this.f4725 = aVar;
        this.f4717 = 0;
        if (aVar != null) {
            if (this.f4739 == null) {
                this.f4739 = new k();
            }
            this.f4725.m5616(this.f4739);
            this.f4760 = false;
            boolean z5 = this.f4752;
            this.f4752 = true;
            this.f4717 = this.f4725.mo5605();
            if (this.f4729 >= 0) {
                this.f4725.m5612(this.f4731, this.f4733);
                m5583(this.f4729, false, true);
                this.f4729 = -1;
                this.f4731 = null;
                this.f4733 = null;
            } else if (z5) {
                requestLayout();
            } else {
                m5576();
            }
        }
        List<i> list = this.f4710;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f4710.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f4710.get(i6).mo5597(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i5) {
        this.f4760 = false;
        m5583(i5, !this.f4752, false);
    }

    public void setOffscreenPageLimit(int i5) {
        if (i5 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i5 + " too small; defaulting to 1");
            i5 = 1;
        }
        if (i5 != this.f4744) {
            this.f4744 = i5;
            m5576();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.f4708 = jVar;
    }

    public void setPageMargin(int i5) {
        int i6 = this.f4741;
        this.f4741 = i5;
        int width = getWidth();
        m5555(width, width, i5, i6);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f4743 = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i5) {
        if (this.f4714 == i5) {
            return;
        }
        this.f4714 = i5;
        m5563(i5);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4743;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    f m5572(int i5, int i6) {
        f fVar = new f();
        fVar.f4765 = i5;
        fVar.f4764 = this.f4725.mo5609(this, i5);
        fVar.f4767 = this.f4725.m5608(i5);
        if (i6 < 0 || i6 >= this.f4719.size()) {
            this.f4719.add(fVar);
        } else {
            this.f4719.add(i6, fVar);
        }
        return fVar;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m5573(i iVar) {
        if (this.f4710 == null) {
            this.f4710 = new ArrayList();
        }
        this.f4710.add(iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f7 A[PHI: r7 r10 r15
  0x00f7: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v9 int) binds: [B:122:0x00ec, B:119:0x00d6, B:49:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:122:0x00ec, B:119:0x00d6, B:49:0x00c0] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:122:0x00ec, B:119:0x00d6, B:49:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ʼʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m5574(int r18) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m5574(int):void");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m5575(j jVar) {
        if (this.f4758 == null) {
            this.f4758 = new ArrayList();
        }
        this.f4758.add(jVar);
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    void m5576() {
        m5574(this.f4727);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m5577(int i5) {
        boolean z5;
        boolean requestFocus;
        View findFocus = findFocus();
        boolean z6 = false;
        if (findFocus == this) {
            findFocus = null;
        } else if (findFocus != null) {
            ViewParent parent = findFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z5 = false;
                    break;
                }
                if (parent == this) {
                    z5 = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z5) {
                StringBuilder sb = new StringBuilder();
                sb.append(findFocus.getClass().getSimpleName());
                for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                findFocus = null;
            }
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i5);
        if (findNextFocus != null && findNextFocus != findFocus) {
            if (i5 == 17) {
                requestFocus = (findFocus == null || m5565(this.f4723, findNextFocus).left < m5565(this.f4723, findFocus).left) ? findNextFocus.requestFocus() : m5594();
            } else if (i5 == 66) {
                requestFocus = (findFocus == null || m5565(this.f4723, findNextFocus).left > m5565(this.f4723, findFocus).left) ? findNextFocus.requestFocus() : m5589();
            }
            z6 = requestFocus;
        } else if (i5 == 17 || i5 == 1) {
            z6 = m5594();
        } else if (i5 == 66 || i5 == 2) {
            z6 = m5589();
        }
        if (z6) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i5));
        }
        return z6;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    protected boolean m5578(View view, boolean z5, int i5, int i6, int i7) {
        int i8;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i9 = i6 + scrollX;
                if (i9 >= childAt.getLeft() && i9 < childAt.getRight() && (i8 = i7 + scrollY) >= childAt.getTop() && i8 < childAt.getBottom() && m5578(childAt, true, i5, i9 - childAt.getLeft(), i8 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z5 && view.canScrollHorizontally(-i5);
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public void m5579(j jVar) {
        List<j> list = this.f4758;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    void m5580() {
        int mo5605 = this.f4725.mo5605();
        this.f4717 = mo5605;
        boolean z5 = this.f4719.size() < (this.f4744 * 2) + 1 && this.f4719.size() < mo5605;
        int i5 = this.f4727;
        int i6 = 0;
        boolean z6 = false;
        while (i6 < this.f4719.size()) {
            f fVar = this.f4719.get(i6);
            int m5606 = this.f4725.m5606(fVar.f4764);
            if (m5606 != -1) {
                if (m5606 == -2) {
                    this.f4719.remove(i6);
                    i6--;
                    if (!z6) {
                        this.f4725.m5618(this);
                        z6 = true;
                    }
                    this.f4725.mo5602(this, fVar.f4765, fVar.f4764);
                    int i7 = this.f4727;
                    if (i7 == fVar.f4765) {
                        i5 = Math.max(0, Math.min(i7, mo5605 - 1));
                    }
                } else {
                    int i8 = fVar.f4765;
                    if (i8 != m5606) {
                        if (i8 == this.f4727) {
                            i5 = m5606;
                        }
                        fVar.f4765 = m5606;
                    }
                }
                z5 = true;
            }
            i6++;
        }
        if (z6) {
            this.f4725.m5604(this);
        }
        Collections.sort(this.f4719, f4704);
        if (z5) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                g gVar = (g) getChildAt(i9).getLayoutParams();
                if (!gVar.f4769) {
                    gVar.f4771 = 0.0f;
                }
            }
            m5583(i5, false, true);
            requestLayout();
        }
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m5581(int i5, boolean z5) {
        this.f4760 = false;
        m5583(i5, z5, false);
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    void m5582(int i5, boolean z5, boolean z6, int i6) {
        androidx.viewpager.widget.a aVar = this.f4725;
        if (aVar == null || aVar.mo5605() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z6 && this.f4727 == i5 && this.f4719.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 >= this.f4725.mo5605()) {
            i5 = this.f4725.mo5605() - 1;
        }
        int i7 = this.f4744;
        int i8 = this.f4727;
        if (i5 > i8 + i7 || i5 < i8 - i7) {
            for (int i9 = 0; i9 < this.f4719.size(); i9++) {
                this.f4719.get(i9).f4766 = true;
            }
        }
        boolean z7 = this.f4727 != i5;
        if (!this.f4752) {
            m5574(i5);
            m5561(i5, z5, i6, z7);
        } else {
            this.f4727 = i5;
            if (z7) {
                m5562(i5);
            }
            requestLayout();
        }
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    void m5583(int i5, boolean z5, boolean z6) {
        m5582(i5, z5, z6, 0);
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    float m5584(float f5) {
        return (float) Math.sin((f5 - 0.5f) * 0.47123894f);
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    void m5585(int i5, int i6, int i7) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f4735;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.f4737 ? this.f4735.getCurrX() : this.f4735.getStartX();
            this.f4735.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i8 = scrollX;
        int scrollY = getScrollY();
        int i9 = i5 - i8;
        int i10 = i6 - scrollY;
        if (i9 == 0 && i10 == 0) {
            m5556(false);
            m5576();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i11 = clientWidth / 2;
        float f5 = clientWidth;
        float f6 = i11;
        float m5584 = f6 + (m5584(Math.min(1.0f, (Math.abs(i9) * 1.0f) / f5)) * f6);
        int abs = Math.abs(i7);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(m5584 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i9) / ((f5 * this.f4725.m5608(this.f4727)) + this.f4741)) + 1.0f) * 100.0f), 600);
        this.f4737 = false;
        this.f4735.startScroll(i8, scrollY, i9, i10, min);
        f1.m2821(this);
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public boolean m5586(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? m5594() : m5577(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? m5589() : m5577(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return m5577(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return m5577(1);
                }
            }
        }
        return false;
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public void m5587(i iVar) {
        List<i> list = this.f4710;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    f m5588(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return m5590(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    boolean m5589() {
        androidx.viewpager.widget.a aVar = this.f4725;
        if (aVar == null || this.f4727 >= aVar.mo5605() - 1) {
            return false;
        }
        m5581(this.f4727 + 1, true);
        return true;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    f m5590(View view) {
        for (int i5 = 0; i5 < this.f4719.size(); i5++) {
            f fVar = this.f4719.get(i5);
            if (this.f4725.mo5610(view, fVar.f4764)) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    f m5591(int i5) {
        for (int i6 = 0; i6 < this.f4719.size(); i6++) {
            f fVar = this.f4719.get(i6);
            if (fVar.f4765 == i5) {
                return fVar;
            }
        }
        return null;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    void m5592() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f4735 = new Scroller(context, f4705);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f4720 = viewConfiguration.getScaledPagingTouchSlop();
        this.f4728 = (int) (400.0f * f5);
        this.f4734 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f4738 = new EdgeEffect(context);
        this.f4748 = new EdgeEffect(context);
        this.f4732 = (int) (25.0f * f5);
        this.f4736 = (int) (2.0f * f5);
        this.f4716 = (int) (f5 * 16.0f);
        f1.m2830(this, new h());
        if (f1.m2807(this) == 0) {
            f1.m2843(this, 1);
        }
        f1.m2846(this, new d());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* renamed from: ﹶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void m5593(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f4742
            r1 = 1
            if (r0 <= 0) goto L6a
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6a
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.ViewPager$g r8 = (androidx.viewpager.widget.ViewPager.g) r8
            boolean r9 = r8.f4769
            if (r9 != 0) goto L2b
            goto L67
        L2b:
            int r8 = r8.f4770
            r8 = r8 & 7
            if (r8 == r1) goto L4c
            r9 = 3
            if (r8 == r9) goto L46
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5b
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
            goto L58
        L46:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5b
        L4c:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
        L58:
            r10 = r8
            r8 = r2
            r2 = r10
        L5b:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L66
            r7.offsetLeftAndRight(r2)
        L66:
            r2 = r8
        L67:
            int r6 = r6 + 1
            goto L1a
        L6a:
            r11.m5560(r12, r13, r14)
            r11.f4756 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m5593(int, float, int):void");
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    boolean m5594() {
        int i5 = this.f4727;
        if (i5 <= 0) {
            return false;
        }
        m5581(i5 - 1, true);
        return true;
    }

    public static class g extends ViewGroup.LayoutParams {

        /* renamed from: ʻ, reason: contains not printable characters */
        public boolean f4769;

        /* renamed from: ʼ, reason: contains not printable characters */
        public int f4770;

        /* renamed from: ʽ, reason: contains not printable characters */
        float f4771;

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f4772;

        /* renamed from: ʿ, reason: contains not printable characters */
        int f4773;

        /* renamed from: ˆ, reason: contains not printable characters */
        int f4774;

        public g() {
            super(-1, -1);
            this.f4771 = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4771 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f4703);
            this.f4770 = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i5) {
        setPageMarginDrawable(androidx.core.content.a.m1993(getContext(), i5));
    }
}
