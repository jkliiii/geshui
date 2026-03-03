package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public abstract class d extends View {

    /* renamed from: ʾ, reason: contains not printable characters */
    protected int[] f1852;

    /* renamed from: ʿ, reason: contains not printable characters */
    protected int f1853;

    /* renamed from: ˆ, reason: contains not printable characters */
    protected Context f1854;

    /* renamed from: ˈ, reason: contains not printable characters */
    protected q.i f1855;

    /* renamed from: ˉ, reason: contains not printable characters */
    protected boolean f1856;

    /* renamed from: ˊ, reason: contains not printable characters */
    protected String f1857;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected String f1858;

    /* renamed from: ˎ, reason: contains not printable characters */
    private View[] f1859;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected HashMap<Integer, String> f1860;

    public d(Context context) {
        super(context);
        this.f1852 = new int[32];
        this.f1856 = false;
        this.f1859 = null;
        this.f1860 = new HashMap<>();
        this.f1854 = context;
        mo1742(null);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private void m1824(String str) {
        if (str == null || str.length() == 0 || this.f1854 == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int m1828 = m1828(trim);
        if (m1828 != 0) {
            this.f1860.put(Integer.valueOf(m1828), trim);
            m1825(m1828);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m1825(int i5) {
        if (i5 == getId()) {
            return;
        }
        int i6 = this.f1853 + 1;
        int[] iArr = this.f1852;
        if (i6 > iArr.length) {
            this.f1852 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1852;
        int i7 = this.f1853;
        iArr2[i7] = i5;
        this.f1853 = i7 + 1;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m1826(String str) {
        if (str == null || str.length() == 0 || this.f1854 == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f1756)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m1825(childAt.getId());
                }
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private int m1827(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1854.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private int m1828(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i5 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object m1802 = constraintLayout.m1802(0, str);
            if (m1802 instanceof Integer) {
                i5 = ((Integer) m1802).intValue();
            }
        }
        if (i5 == 0 && constraintLayout != null) {
            i5 = m1827(constraintLayout, str);
        }
        if (i5 == 0) {
            try {
                i5 = k.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i5 == 0 ? this.f1854.getResources().getIdentifier(str, "id", this.f1854.getPackageName()) : i5;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1852, this.f1853);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1857;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1858;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        if (this.f1856) {
            super.onMeasure(i5, i6);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f1857 = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f1853 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                m1824(str.substring(i5));
                return;
            } else {
                m1824(str.substring(i5, indexOf));
                i5 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1858 = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f1853 = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                m1826(str.substring(i5));
                return;
            } else {
                m1826(str.substring(i5, indexOf));
                i5 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1857 = null;
        this.f1853 = 0;
        for (int i5 : iArr) {
            m1825(i5);
        }
    }

    @Override // android.view.View
    public void setTag(int i5, Object obj) {
        super.setTag(i5, obj);
        if (obj == null && this.f1857 == null) {
            m1825(i5);
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    protected void m1829() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m1830((ConstraintLayout) parent);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    protected void m1830(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i5 = 0; i5 < this.f1853; i5++) {
            View m1803 = constraintLayout.m1803(this.f1852[i5]);
            if (m1803 != null) {
                m1803.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    m1803.setTranslationZ(m1803.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected View[] m1832(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1859;
        if (viewArr == null || viewArr.length != this.f1853) {
            this.f1859 = new View[this.f1853];
        }
        for (int i5 = 0; i5 < this.f1853; i5++) {
            this.f1859[i5] = constraintLayout.m1803(this.f1852[i5]);
        }
        return this.f1859;
    }

    /* renamed from: ˑ */
    protected void mo1742(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.f2101);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == l.f2122) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1857 = string;
                    setIds(string);
                } else if (index == l.f2123) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1858 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m1836(ConstraintLayout constraintLayout) {
        String str;
        int m1827;
        if (isInEditMode()) {
            setIds(this.f1857);
        }
        q.i iVar = this.f1855;
        if (iVar == null) {
            return;
        }
        iVar.mo11429();
        for (int i5 = 0; i5 < this.f1853; i5++) {
            int i6 = this.f1852[i5];
            View m1803 = constraintLayout.m1803(i6);
            if (m1803 == null && (m1827 = m1827(constraintLayout, (str = this.f1860.get(Integer.valueOf(i6))))) != 0) {
                this.f1852[i5] = m1827;
                this.f1860.put(Integer.valueOf(m1827), str);
                m1803 = constraintLayout.m1803(m1827);
            }
            if (m1803 != null) {
                this.f1855.mo11428(constraintLayout.m1804(m1803));
            }
        }
        this.f1855.mo11427(constraintLayout.f1728);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public void m1837() {
        if (this.f1855 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1775 = (q.e) this.f1855;
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1852 = new int[32];
        this.f1856 = false;
        this.f1859 = null;
        this.f1860 = new HashMap<>();
        this.f1854 = context;
        mo1742(attributeSet);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected void mo1831(ConstraintLayout constraintLayout) {
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void m1833(ConstraintLayout constraintLayout) {
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    public void m1834(ConstraintLayout constraintLayout) {
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m1835(ConstraintLayout constraintLayout) {
    }

    /* renamed from: י */
    public void mo1743(q.e eVar, boolean z5) {
    }
}
