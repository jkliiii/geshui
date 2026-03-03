package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.view.q4;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: DropDownListView.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class e2 extends ListView {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final Rect f1215;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f1216;

    /* renamed from: ˆ, reason: contains not printable characters */
    private int f1217;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f1218;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f1219;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f1220;

    /* renamed from: ˋ, reason: contains not printable characters */
    private d f1221;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f1222;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1223;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f1224;

    /* renamed from: י, reason: contains not printable characters */
    private q4 f1225;

    /* renamed from: ـ, reason: contains not printable characters */
    private androidx.core.widget.t f1226;

    /* renamed from: ٴ, reason: contains not printable characters */
    f f1227;

    /* compiled from: DropDownListView.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1228(View view, float f5, float f6) {
            view.drawableHotspotChanged(f5, f6);
        }
    }

    /* compiled from: DropDownListView.java */
    static class b {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static Method f1228;

        /* renamed from: ʼ, reason: contains not printable characters */
        private static Method f1229;

        /* renamed from: ʽ, reason: contains not printable characters */
        private static Method f1230;

        /* renamed from: ʾ, reason: contains not printable characters */
        private static boolean f1231;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1228 = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1229 = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1230 = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1231 = true;
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            }
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m1229() {
            return f1231;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1230(e2 e2Var, int i5, View view) {
            try {
                f1228.invoke(e2Var, Integer.valueOf(i5), view, Boolean.FALSE, -1, -1);
                f1229.invoke(e2Var, Integer.valueOf(i5));
                f1230.invoke(e2Var, Integer.valueOf(i5));
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            } catch (InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* compiled from: DropDownListView.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m1231(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1232(AbsListView absListView, boolean z5) {
            absListView.setSelectedChildViewEnabled(z5);
        }
    }

    /* compiled from: DropDownListView.java */
    private static class d extends androidx.appcompat.graphics.drawable.f {

        /* renamed from: ʾ, reason: contains not printable characters */
        private boolean f1232;

        d(Drawable drawable) {
            super(drawable);
            this.f1232 = true;
        }

        @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1232) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
        public void setHotspot(float f5, float f6) {
            if (this.f1232) {
                super.setHotspot(f5, f6);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i5, int i6, int i7, int i8) {
            if (this.f1232) {
                super.setHotspotBounds(i5, i6, i7, i8);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1232) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.f, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z5, boolean z6) {
            if (this.f1232) {
                return super.setVisible(z5, z6);
            }
            return false;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        void m1233(boolean z5) {
            this.f1232 = z5;
        }
    }

    /* compiled from: DropDownListView.java */
    static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private static final Field f1233;

        static {
            Field field = null;
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                field.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                e5.printStackTrace();
            }
            f1233 = field;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m1234(AbsListView absListView) {
            Field field = f1233;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
                return false;
            }
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1235(AbsListView absListView, boolean z5) {
            Field field = f1233;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z5));
                } catch (IllegalAccessException e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    /* compiled from: DropDownListView.java */
    private class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e2 e2Var = e2.this;
            e2Var.f1227 = null;
            e2Var.drawableStateChanged();
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public void m1236() {
            e2 e2Var = e2.this;
            e2Var.f1227 = null;
            e2Var.removeCallbacks(this);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public void m1237() {
            e2.this.post(this);
        }
    }

    e2(Context context, boolean z5) {
        super(context, null, e.a.f6885);
        this.f1215 = new Rect();
        this.f1216 = 0;
        this.f1217 = 0;
        this.f1218 = 0;
        this.f1219 = 0;
        this.f1223 = z5;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z5) {
        d dVar = this.f1221;
        if (dVar != null) {
            dVar.m1233(z5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1215() {
        this.f1224 = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1220 - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        q4 q4Var = this.f1225;
        if (q4Var != null) {
            q4Var.m3285();
            this.f1225 = null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1216(View view, int i5) {
        performItemClick(view, i5, getItemIdAtPosition(i5));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private void m1217(Canvas canvas) {
        Drawable selector;
        if (this.f1215.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1215);
        selector.draw(canvas);
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m1218(int i5, View view) {
        Rect rect = this.f1215;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1216;
        rect.top -= this.f1217;
        rect.right += this.f1218;
        rect.bottom += this.f1219;
        boolean m1222 = m1222();
        if (view.isEnabled() != m1222) {
            m1223(!m1222);
            if (i5 != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    private void m1219(int i5, View view) {
        Drawable selector = getSelector();
        boolean z5 = (selector == null || i5 == -1) ? false : true;
        if (z5) {
            selector.setVisible(false, false);
        }
        m1218(i5, view);
        if (z5) {
            Rect rect = this.f1215;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.a.m2206(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m1220(int i5, View view, float f5, float f6) {
        m1219(i5, view);
        Drawable selector = getSelector();
        if (selector == null || i5 == -1) {
            return;
        }
        androidx.core.graphics.drawable.a.m2206(selector, f5, f6);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private void m1221(View view, int i5, float f5, float f6) {
        View childAt;
        this.f1224 = true;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 21) {
            a.m1228(this, f5, f6);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i7 = this.f1220;
        if (i7 != -1 && (childAt = getChildAt(i7 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1220 = i5;
        float left = f5 - view.getLeft();
        float top2 = f6 - view.getTop();
        if (i6 >= 21) {
            a.m1228(view, left, top2);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m1220(i5, view, f5, f6);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean m1222() {
        return androidx.core.os.a.m2404() ? c.m1231(this) : e.m1234(this);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private void m1223(boolean z5) {
        if (androidx.core.os.a.m2404()) {
            c.m1232(this, z5);
        } else {
            e.m1235(this, z5);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean m1224() {
        return this.f1224;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private void m1225() {
        Drawable selector = getSelector();
        if (selector != null && m1224() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m1217(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1227 != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m1225();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1223 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1223 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1223 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1223 && this.f1222) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1227 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1227 == null) {
            f fVar = new f();
            this.f1227 = fVar;
            fVar.m1237();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i5 < 30 || !b.m1229()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.m1230(this, pointToPosition, childAt);
                    }
                }
                m1225();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1220 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f1227;
        if (fVar != null) {
            fVar.m1236();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z5) {
        this.f1222 = z5;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f1221 = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1216 = rect.left;
        this.f1217 = rect.top;
        this.f1218 = rect.right;
        this.f1219 = rect.bottom;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int mo1226(int i5, int i6, int i7, int i8, int i9) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i10 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < count) {
            int itemViewType = adapter.getItemViewType(i11);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i11, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i5, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i11 > 0) {
                i10 += dividerHeight;
            }
            i10 += view.getMeasuredHeight();
            if (i10 >= i8) {
                return (i9 < 0 || i11 <= i9 || i13 <= 0 || i10 == i8) ? i8 : i13;
            }
            if (i9 >= 0 && i11 >= i9) {
                i13 = i10;
            }
            i11++;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0011  */
    /* renamed from: ʿ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo1227(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m1221(r3, r5, r4, r9)
            if (r0 != r1) goto Le
            r7.m1216(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m1215()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.t r9 = r7.f1226
            if (r9 != 0) goto L5a
            androidx.core.widget.t r9 = new androidx.core.widget.t
            r9.<init>(r7)
            r7.f1226 = r9
        L5a:
            androidx.core.widget.t r9 = r7.f1226
            r9.m3525(r1)
            androidx.core.widget.t r9 = r7.f1226
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.t r8 = r7.f1226
            if (r8 == 0) goto L6c
            r8.m3525(r2)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e2.mo1227(android.view.MotionEvent, int):boolean");
    }
}
