package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h2 implements androidx.appcompat.view.menu.p {

    /* renamed from: ˈˈ, reason: contains not printable characters */
    private static Method f1273;

    /* renamed from: ˉˉ, reason: contains not printable characters */
    private static Method f1274;

    /* renamed from: ˋˋ, reason: contains not printable characters */
    private static Method f1275;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private final e f1276;

    /* renamed from: ʼʼ, reason: contains not printable characters */
    final Handler f1277;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    private Runnable f1278;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Context f1279;

    /* renamed from: ʾʾ, reason: contains not printable characters */
    private Rect f1280;

    /* renamed from: ʿ, reason: contains not printable characters */
    private ListAdapter f1281;

    /* renamed from: ʿʿ, reason: contains not printable characters */
    private final Rect f1282;

    /* renamed from: ˆ, reason: contains not printable characters */
    e2 f1283;

    /* renamed from: ˆˆ, reason: contains not printable characters */
    PopupWindow f1284;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f1285;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f1286;

    /* renamed from: ˊ, reason: contains not printable characters */
    private int f1287;

    /* renamed from: ˋ, reason: contains not printable characters */
    private int f1288;

    /* renamed from: ˎ, reason: contains not printable characters */
    private int f1289;

    /* renamed from: ˏ, reason: contains not printable characters */
    private boolean f1290;

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean f1291;

    /* renamed from: י, reason: contains not printable characters */
    private boolean f1292;

    /* renamed from: ـ, reason: contains not printable characters */
    private int f1293;

    /* renamed from: ــ, reason: contains not printable characters */
    private boolean f1294;

    /* renamed from: ٴ, reason: contains not printable characters */
    private boolean f1295;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private boolean f1296;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private final h f1297;

    /* renamed from: ᴵ, reason: contains not printable characters */
    int f1298;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private final g f1299;

    /* renamed from: ᵎ, reason: contains not printable characters */
    private View f1300;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f1301;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private DataSetObserver f1302;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private View f1303;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private Drawable f1304;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private AdapterView.OnItemClickListener f1305;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private AdapterView.OnItemSelectedListener f1306;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    final i f1307;

    /* compiled from: ListPopupWindow.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m1315 = h2.this.m1315();
            if (m1315 == null || m1315.getWindowToken() == null) {
                return;
            }
            h2.this.mo919();
        }
    }

    /* compiled from: ListPopupWindow.java */
    static class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m1323(PopupWindow popupWindow, View view, int i5, boolean z5) {
            return popupWindow.getMaxAvailableHeight(view, i5, z5);
        }
    }

    /* compiled from: ListPopupWindow.java */
    static class d {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1324(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m1325(PopupWindow popupWindow, boolean z5) {
            popupWindow.setIsClippedToScreen(z5);
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h2.this.m1312();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class f extends DataSetObserver {
        f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (h2.this.mo920()) {
                h2.this.mo919();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            h2.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class h implements View.OnTouchListener {
        h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x5 = (int) motionEvent.getX();
            int y5 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h2.this.f1284) != null && popupWindow.isShowing() && x5 >= 0 && x5 < h2.this.f1284.getWidth() && y5 >= 0 && y5 < h2.this.f1284.getHeight()) {
                h2 h2Var = h2.this;
                h2Var.f1277.postDelayed(h2Var.f1307, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            h2 h2Var2 = h2.this;
            h2Var2.f1277.removeCallbacks(h2Var2.f1307);
            return false;
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e2 e2Var = h2.this.f1283;
            if (e2Var == null || !androidx.core.view.f1.m2903(e2Var) || h2.this.f1283.getCount() <= h2.this.f1283.getChildCount()) {
                return;
            }
            int childCount = h2.this.f1283.getChildCount();
            h2 h2Var = h2.this;
            if (childCount <= h2Var.f1298) {
                h2Var.f1284.setInputMethodMode(2);
                h2.this.mo919();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1274 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f1275 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1273 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public h2(Context context) {
        this(context, null, e.a.f6891);
    }

    /* renamed from: ˏˏ, reason: contains not printable characters */
    private void m1289(boolean z5) {
        if (Build.VERSION.SDK_INT > 28) {
            d.m1325(this.f1284, z5);
            return;
        }
        Method method = f1274;
        if (method != null) {
            try {
                method.invoke(this.f1284, Boolean.valueOf(z5));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private int m1290() {
        int i5;
        int i6;
        int makeMeasureSpec;
        int i7;
        if (this.f1283 == null) {
            Context context = this.f1279;
            this.f1278 = new a();
            e2 mo1314 = mo1314(context, !this.f1294);
            this.f1283 = mo1314;
            Drawable drawable = this.f1304;
            if (drawable != null) {
                mo1314.setSelector(drawable);
            }
            this.f1283.setAdapter(this.f1281);
            this.f1283.setOnItemClickListener(this.f1305);
            this.f1283.setFocusable(true);
            this.f1283.setFocusableInTouchMode(true);
            this.f1283.setOnItemSelectedListener(new b());
            this.f1283.setOnScrollListener(this.f1299);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1306;
            if (onItemSelectedListener != null) {
                this.f1283.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f1283;
            View view2 = this.f1300;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i8 = this.f1301;
                if (i8 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i8 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f1301);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i9 = this.f1286;
                if (i9 >= 0) {
                    i7 = RecyclerView.UNDEFINED_DURATION;
                } else {
                    i9 = 0;
                    i7 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i9, i7), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i5 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i5 = 0;
            }
            this.f1284.setContentView(view);
        } else {
            View view3 = this.f1300;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i5 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i5 = 0;
            }
        }
        Drawable background = this.f1284.getBackground();
        if (background != null) {
            background.getPadding(this.f1282);
            Rect rect = this.f1282;
            int i10 = rect.top;
            i6 = rect.bottom + i10;
            if (!this.f1290) {
                this.f1288 = -i10;
            }
        } else {
            this.f1282.setEmpty();
            i6 = 0;
        }
        int m1292 = m1292(m1315(), this.f1288, this.f1284.getInputMethodMode() == 2);
        if (this.f1295 || this.f1285 == -1) {
            return m1292 + i6;
        }
        int i11 = this.f1286;
        if (i11 == -2) {
            int i12 = this.f1279.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f1282;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12 - (rect2.left + rect2.right), RecyclerView.UNDEFINED_DURATION);
        } else if (i11 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            int i13 = this.f1279.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f1282;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13 - (rect3.left + rect3.right), 1073741824);
        }
        int mo1226 = this.f1283.mo1226(makeMeasureSpec, 0, -1, m1292 - i5, -1);
        if (mo1226 > 0) {
            i5 += i6 + this.f1283.getPaddingTop() + this.f1283.getPaddingBottom();
        }
        return mo1226 + i5;
    }

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    private void m1291() {
        View view = this.f1300;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1300);
            }
        }
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int m1292(View view, int i5, boolean z5) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.m1323(this.f1284, view, i5, z5);
        }
        Method method = f1273;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1284, view, Integer.valueOf(i5), Boolean.valueOf(z5))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f1284.getMaxAvailableHeight(view, i5);
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        this.f1284.dismiss();
        m1291();
        this.f1284.setContentView(null);
        this.f1283 = null;
        this.f1277.removeCallbacks(this.f1307);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f1284.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ʻ */
    public void mo919() {
        int m1290 = m1290();
        boolean m1322 = m1322();
        androidx.core.widget.w.m3663(this.f1284, this.f1289);
        if (this.f1284.isShowing()) {
            if (androidx.core.view.f1.m2903(m1315())) {
                int i5 = this.f1286;
                if (i5 == -1) {
                    i5 = -1;
                } else if (i5 == -2) {
                    i5 = m1315().getWidth();
                }
                int i6 = this.f1285;
                if (i6 == -1) {
                    if (!m1322) {
                        m1290 = -1;
                    }
                    if (m1322) {
                        this.f1284.setWidth(this.f1286 == -1 ? -1 : 0);
                        this.f1284.setHeight(0);
                    } else {
                        this.f1284.setWidth(this.f1286 == -1 ? -1 : 0);
                        this.f1284.setHeight(-1);
                    }
                } else if (i6 != -2) {
                    m1290 = i6;
                }
                this.f1284.setOutsideTouchable((this.f1296 || this.f1295) ? false : true);
                this.f1284.update(m1315(), this.f1287, this.f1288, i5 < 0 ? -1 : i5, m1290 < 0 ? -1 : m1290);
                return;
            }
            return;
        }
        int i7 = this.f1286;
        if (i7 == -1) {
            i7 = -1;
        } else if (i7 == -2) {
            i7 = m1315().getWidth();
        }
        int i8 = this.f1285;
        if (i8 == -1) {
            m1290 = -1;
        } else if (i8 != -2) {
            m1290 = i8;
        }
        this.f1284.setWidth(i7);
        this.f1284.setHeight(m1290);
        m1289(true);
        this.f1284.setOutsideTouchable((this.f1296 || this.f1295) ? false : true);
        this.f1284.setTouchInterceptor(this.f1297);
        if (this.f1292) {
            androidx.core.widget.w.m3662(this.f1284, this.f1291);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1275;
            if (method != null) {
                try {
                    method.invoke(this.f1284, this.f1280);
                } catch (Exception e5) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e5);
                }
            }
        } else {
            d.m1324(this.f1284, this.f1280);
        }
        androidx.core.widget.w.m3664(this.f1284, m1315(), this.f1287, this.f1288, this.f1293);
        this.f1283.setSelection(-1);
        if (!this.f1294 || this.f1283.isInTouchMode()) {
            m1312();
        }
        if (this.f1294) {
            return;
        }
        this.f1277.post(this.f1276);
    }

    /* renamed from: ʻʻ, reason: contains not printable characters */
    public void m1293(View view) {
        this.f1303 = view;
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ʼ */
    public boolean mo920() {
        return this.f1284.isShowing();
    }

    /* renamed from: ʼʼ, reason: contains not printable characters */
    public void m1294(int i5) {
        Drawable background = this.f1284.getBackground();
        if (background == null) {
            m1316(i5);
            return;
        }
        background.getPadding(this.f1282);
        Rect rect = this.f1282;
        this.f1286 = rect.left + rect.right + i5;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m1295() {
        return this.f1287;
    }

    /* renamed from: ʽʽ, reason: contains not printable characters */
    public void m1296(int i5) {
        this.f1284.setAnimationStyle(i5);
    }

    /* renamed from: ʾʾ, reason: contains not printable characters */
    public void m1297(Rect rect) {
        this.f1280 = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: ʿʿ, reason: contains not printable characters */
    public void m1298(int i5) {
        this.f1293 = i5;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public Drawable m1299() {
        return this.f1284.getBackground();
    }

    /* renamed from: ˆˆ, reason: contains not printable characters */
    public void m1300(boolean z5) {
        this.f1294 = z5;
        this.f1284.setFocusable(z5);
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ˈ */
    public ListView mo923() {
        return this.f1283;
    }

    /* renamed from: ˈˈ, reason: contains not printable characters */
    public void m1301(AdapterView.OnItemClickListener onItemClickListener) {
        this.f1305 = onItemClickListener;
    }

    /* renamed from: ˉˉ, reason: contains not printable characters */
    public void m1302(PopupWindow.OnDismissListener onDismissListener) {
        this.f1284.setOnDismissListener(onDismissListener);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m1303(int i5) {
        this.f1288 = i5;
        this.f1290 = true;
    }

    /* renamed from: ˊˊ, reason: contains not printable characters */
    public void m1304(boolean z5) {
        this.f1292 = true;
        this.f1291 = z5;
    }

    /* renamed from: ˋˋ, reason: contains not printable characters */
    public void m1305(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1306 = onItemSelectedListener;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m1306(int i5) {
        this.f1287 = i5;
    }

    /* renamed from: ˎˎ, reason: contains not printable characters */
    public void m1307(int i5) {
        this.f1301 = i5;
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public int m1308() {
        if (this.f1290) {
            return this.f1288;
        }
        return 0;
    }

    /* renamed from: ˑˑ, reason: contains not printable characters */
    public void m1309(int i5) {
        e2 e2Var = this.f1283;
        if (!mo920() || e2Var == null) {
            return;
        }
        e2Var.setListSelectionHidden(false);
        e2Var.setSelection(i5);
        if (e2Var.getChoiceMode() != 0) {
            e2Var.setItemChecked(i5, true);
        }
    }

    /* renamed from: ـ, reason: contains not printable characters */
    public void mo1310(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1302;
        if (dataSetObserver == null) {
            this.f1302 = new f();
        } else {
            ListAdapter listAdapter2 = this.f1281;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1281 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1302);
        }
        e2 e2Var = this.f1283;
        if (e2Var != null) {
            e2Var.setAdapter(this.f1281);
        }
    }

    /* renamed from: ــ, reason: contains not printable characters */
    public void m1311(int i5) {
        this.f1284.setInputMethodMode(i5);
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    public void m1312() {
        e2 e2Var = this.f1283;
        if (e2Var != null) {
            e2Var.setListSelectionHidden(true);
            e2Var.requestLayout();
        }
    }

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    public boolean m1313() {
        return this.f1294;
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    e2 mo1314(Context context, boolean z5) {
        return new e2(context, z5);
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    public View m1315() {
        return this.f1303;
    }

    /* renamed from: ᵔᵔ, reason: contains not printable characters */
    public void m1316(int i5) {
        this.f1286 = i5;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    public Object m1317() {
        if (mo920()) {
            return this.f1283.getSelectedItem();
        }
        return null;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    public long m1318() {
        if (mo920()) {
            return this.f1283.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    public int m1319() {
        if (mo920()) {
            return this.f1283.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    public View m1320() {
        if (mo920()) {
            return this.f1283.getSelectedView();
        }
        return null;
    }

    /* renamed from: ﾞ, reason: contains not printable characters */
    public int m1321() {
        return this.f1286;
    }

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    public boolean m1322() {
        return this.f1284.getInputMethodMode() == 2;
    }

    public h2(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, 0);
    }

    public h2(Context context, AttributeSet attributeSet, int i5, int i6) {
        this.f1285 = -2;
        this.f1286 = -2;
        this.f1289 = 1002;
        this.f1293 = 0;
        this.f1295 = false;
        this.f1296 = false;
        this.f1298 = Integer.MAX_VALUE;
        this.f1301 = 0;
        this.f1307 = new i();
        this.f1297 = new h();
        this.f1299 = new g();
        this.f1276 = new e();
        this.f1282 = new Rect();
        this.f1279 = context;
        this.f1277 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f7159, i5, i6);
        this.f1287 = obtainStyledAttributes.getDimensionPixelOffset(e.j.f7160, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(e.j.f7162, 0);
        this.f1288 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1290 = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i5, i6);
        this.f1284 = sVar;
        sVar.setInputMethodMode(1);
    }

    /* compiled from: ListPopupWindow.java */
    class b implements AdapterView.OnItemSelectedListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i5, long j5) {
            e2 e2Var;
            if (i5 == -1 || (e2Var = h2.this.f1283) == null) {
                return;
            }
            e2Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* compiled from: ListPopupWindow.java */
    private class g implements AbsListView.OnScrollListener {
        g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i5) {
            if (i5 != 1 || h2.this.m1322() || h2.this.f1284.getContentView() == null) {
                return;
            }
            h2 h2Var = h2.this;
            h2Var.f1277.removeCallbacks(h2Var.f1307);
            h2.this.f1307.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i5, int i6, int i7) {
        }
    }
}
