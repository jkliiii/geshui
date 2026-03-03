package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.b;

/* compiled from: AppCompatSpinner.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class r0 extends Spinner implements androidx.core.view.c1 {

    /* renamed from: ˏ, reason: contains not printable characters */
    @SuppressLint({"ResourceType"})
    private static final int[] f1415 = {R.attr.spinnerMode};

    /* renamed from: ʾ, reason: contains not printable characters */
    private final androidx.appcompat.widget.e f1416;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Context f1417;

    /* renamed from: ˆ, reason: contains not printable characters */
    private g2 f1418;

    /* renamed from: ˈ, reason: contains not printable characters */
    private SpinnerAdapter f1419;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final boolean f1420;

    /* renamed from: ˊ, reason: contains not printable characters */
    private j f1421;

    /* renamed from: ˋ, reason: contains not printable characters */
    int f1422;

    /* renamed from: ˎ, reason: contains not printable characters */
    final Rect f1423;

    /* compiled from: AppCompatSpinner.java */
    class a extends g2 {

        /* renamed from: ˑ, reason: contains not printable characters */
        final /* synthetic */ h f1424;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f1424 = hVar;
        }

        @Override // androidx.appcompat.widget.g2
        /* renamed from: ʼ */
        public androidx.appcompat.view.menu.p mo882() {
            return this.f1424;
        }

        @Override // androidx.appcompat.widget.g2
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: ʽ */
        public boolean mo883() {
            if (r0.this.getInternalPopup().mo1498()) {
                return true;
            }
            r0.this.m1491();
            return true;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!r0.this.getInternalPopup().mo1498()) {
                r0.this.m1491();
            }
            ViewTreeObserver viewTreeObserver = r0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.m1492(viewTreeObserver, this);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    private static final class c {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1492(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    private static final class d {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m1493(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m1494(View view) {
            return view.getTextDirection();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m1495(View view, int i5) {
            view.setTextAlignment(i5);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m1496(View view, int i5) {
            view.setTextDirection(i5);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    private static final class e {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1497(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (androidx.core.util.c.m2568(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: ʾ, reason: contains not printable characters */
        androidx.appcompat.app.b f1427;

        /* renamed from: ʿ, reason: contains not printable characters */
        private ListAdapter f1428;

        /* renamed from: ˆ, reason: contains not printable characters */
        private CharSequence f1429;

        f() {
        }

        @Override // androidx.appcompat.widget.r0.j
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f1427;
            if (bVar != null) {
                bVar.dismiss();
                this.f1427 = null;
            }
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i5) {
            r0.this.setSelection(i5);
            if (r0.this.getOnItemClickListener() != null) {
                r0.this.performItemClick(null, i5, this.f1428.getItemId(i5));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.r0.j
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ʼ, reason: contains not printable characters */
        public boolean mo1498() {
            androidx.appcompat.app.b bVar = this.f1427;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ʽ, reason: contains not printable characters */
        public int mo1499() {
            return 0;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˆ, reason: contains not printable characters */
        public Drawable mo1500() {
            return null;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˉ, reason: contains not printable characters */
        public void mo1501(CharSequence charSequence) {
            this.f1429 = charSequence;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo1502(int i5) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˋ, reason: contains not printable characters */
        public void mo1503(int i5) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˎ, reason: contains not printable characters */
        public void mo1504(int i5) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˏ, reason: contains not printable characters */
        public void mo1505(int i5, int i6) {
            if (this.f1428 == null) {
                return;
            }
            b.a aVar = new b.a(r0.this.getPopupContext());
            CharSequence charSequence = this.f1429;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.b create = aVar.setSingleChoiceItems(this.f1428, r0.this.getSelectedItemPosition(), this).create();
            this.f1427 = create;
            ListView m501 = create.m501();
            d.m1496(m501, i5);
            d.m1495(m501, i6);
            this.f1427.show();
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˑ, reason: contains not printable characters */
        public int mo1506() {
            return 0;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: י, reason: contains not printable characters */
        public CharSequence mo1507() {
            return this.f1429;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ـ */
        public void mo1310(ListAdapter listAdapter) {
            this.f1428 = listAdapter;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    private static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: ʾ, reason: contains not printable characters */
        private SpinnerAdapter f1431;

        /* renamed from: ʿ, reason: contains not printable characters */
        private ListAdapter f1432;

        public g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1431 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1432 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    e.m1497((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof z2) {
                    z2 z2Var = (z2) spinnerAdapter;
                    if (z2Var.getDropDownViewTheme() == null) {
                        z2Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1432;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1431;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1431;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i5, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i5) {
            SpinnerAdapter spinnerAdapter = this.f1431;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i5);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            SpinnerAdapter spinnerAdapter = this.f1431;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i5);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i5) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            return getDropDownView(i5, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1431;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i5) {
            ListAdapter listAdapter = this.f1432;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i5);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1431;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1431;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    class h extends h2 implements j {

        /* renamed from: ˊˊ, reason: contains not printable characters */
        private CharSequence f1433;

        /* renamed from: ˎˎ, reason: contains not printable characters */
        private final Rect f1434;

        /* renamed from: ˏˏ, reason: contains not printable characters */
        ListAdapter f1435;

        /* renamed from: ˑˑ, reason: contains not printable characters */
        private int f1436;

        /* compiled from: AppCompatSpinner.java */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ r0 f1438;

            a(r0 r0Var) {
                this.f1438 = r0Var;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
                r0.this.setSelection(i5);
                if (r0.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    r0.this.performItemClick(view, i5, hVar.f1435.getItemId(i5));
                }
                h.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.m1511(r0.this)) {
                    h.this.dismiss();
                } else {
                    h.this.m1509();
                    h.super.mo919();
                }
            }
        }

        /* compiled from: AppCompatSpinner.java */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1441;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1441 = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = r0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1441);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i5) {
            super(context, attributeSet, i5);
            this.f1434 = new Rect();
            m1293(r0.this);
            m1300(true);
            m1307(0);
            m1301(new a(r0.this));
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˉ */
        public void mo1501(CharSequence charSequence) {
            this.f1433 = charSequence;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˋ */
        public void mo1503(int i5) {
            this.f1436 = i5;
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: ˏ */
        public void mo1505(int i5, int i6) {
            ViewTreeObserver viewTreeObserver;
            boolean mo920 = mo920();
            m1509();
            m1311(2);
            super.mo919();
            ListView mo923 = mo923();
            mo923.setChoiceMode(1);
            d.m1496(mo923, i5);
            d.m1495(mo923, i6);
            m1309(r0.this.getSelectedItemPosition());
            if (mo920 || (viewTreeObserver = r0.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            m1302(new c(bVar));
        }

        @Override // androidx.appcompat.widget.r0.j
        /* renamed from: י */
        public CharSequence mo1507() {
            return this.f1433;
        }

        @Override // androidx.appcompat.widget.h2, androidx.appcompat.widget.r0.j
        /* renamed from: ـ */
        public void mo1310(ListAdapter listAdapter) {
            super.mo1310(listAdapter);
            this.f1435 = listAdapter;
        }

        /* renamed from: ᵎᵎ, reason: contains not printable characters */
        void m1509() {
            int i5;
            Drawable m1299 = m1299();
            if (m1299 != null) {
                m1299.getPadding(r0.this.f1423);
                i5 = p3.m1477(r0.this) ? r0.this.f1423.right : -r0.this.f1423.left;
            } else {
                Rect rect = r0.this.f1423;
                rect.right = 0;
                rect.left = 0;
                i5 = 0;
            }
            int paddingLeft = r0.this.getPaddingLeft();
            int paddingRight = r0.this.getPaddingRight();
            int width = r0.this.getWidth();
            r0 r0Var = r0.this;
            int i6 = r0Var.f1422;
            if (i6 == -2) {
                int m1490 = r0Var.m1490((SpinnerAdapter) this.f1435, m1299());
                int i7 = r0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = r0.this.f1423;
                int i8 = (i7 - rect2.left) - rect2.right;
                if (m1490 > i8) {
                    m1490 = i8;
                }
                m1294(Math.max(m1490, (width - paddingLeft) - paddingRight));
            } else if (i6 == -1) {
                m1294((width - paddingLeft) - paddingRight);
            } else {
                m1294(i6);
            }
            m1306(p3.m1477(r0.this) ? i5 + (((width - paddingRight) - m1321()) - m1510()) : i5 + paddingLeft + m1510());
        }

        /* renamed from: ᵢᵢ, reason: contains not printable characters */
        public int m1510() {
            return this.f1436;
        }

        /* renamed from: ⁱⁱ, reason: contains not printable characters */
        boolean m1511(View view) {
            return androidx.core.view.f1.m2903(view) && view.getGlobalVisibleRect(this.f1434);
        }
    }

    /* compiled from: AppCompatSpinner.java */
    static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: ʾ, reason: contains not printable characters */
        boolean f1443;

        /* compiled from: AppCompatSpinner.java */
        class a implements Parcelable.Creator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʻ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: ʼ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public i[] newArray(int i5) {
                return new i[i5];
            }
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeByte(this.f1443 ? (byte) 1 : (byte) 0);
        }

        i(Parcel parcel) {
            super(parcel);
            this.f1443 = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    interface j {
        void dismiss();

        void setBackgroundDrawable(Drawable drawable);

        /* renamed from: ʼ */
        boolean mo1498();

        /* renamed from: ʽ */
        int mo1499();

        /* renamed from: ˆ */
        Drawable mo1500();

        /* renamed from: ˉ */
        void mo1501(CharSequence charSequence);

        /* renamed from: ˊ */
        void mo1502(int i5);

        /* renamed from: ˋ */
        void mo1503(int i5);

        /* renamed from: ˎ */
        void mo1504(int i5);

        /* renamed from: ˏ */
        void mo1505(int i5, int i6);

        /* renamed from: ˑ */
        int mo1506();

        /* renamed from: י */
        CharSequence mo1507();

        /* renamed from: ـ */
        void mo1310(ListAdapter listAdapter);
    }

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.f6907);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            eVar.m1204();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f1421;
        return jVar != null ? jVar.mo1499() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f1421;
        return jVar != null ? jVar.mo1506() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f1421 != null ? this.f1422 : super.getDropDownWidth();
    }

    final j getInternalPopup() {
        return this.f1421;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f1421;
        return jVar != null ? jVar.mo1500() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f1417;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f1421;
        return jVar != null ? jVar.mo1507() : super.getPrompt();
    }

    @Override // androidx.core.view.c1
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            return eVar.m1205();
        }
        return null;
    }

    @Override // androidx.core.view.c1
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            return eVar.m1206();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1421;
        if (jVar == null || !jVar.mo1498()) {
            return;
        }
        this.f1421.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (this.f1421 == null || View.MeasureSpec.getMode(i5) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m1490(getAdapter(), getBackground())), View.MeasureSpec.getSize(i5)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (!iVar.f1443 || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f1421;
        iVar.f1443 = jVar != null && jVar.mo1498();
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g2 g2Var = this.f1418;
        if (g2Var == null || !g2Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f1421;
        if (jVar == null) {
            return super.performClick();
        }
        if (jVar.mo1498()) {
            return true;
        }
        m1491();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            eVar.m1208(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            eVar.m1209(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i5) {
        j jVar = this.f1421;
        if (jVar == null) {
            super.setDropDownHorizontalOffset(i5);
        } else {
            jVar.mo1503(i5);
            this.f1421.mo1504(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i5) {
        j jVar = this.f1421;
        if (jVar != null) {
            jVar.mo1502(i5);
        } else {
            super.setDropDownVerticalOffset(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i5) {
        if (this.f1421 != null) {
            this.f1422 = i5;
        } else {
            super.setDropDownWidth(i5);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f1421;
        if (jVar != null) {
            jVar.setBackgroundDrawable(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i5) {
        setPopupBackgroundDrawable(f.a.m8475(getPopupContext(), i5));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f1421;
        if (jVar != null) {
            jVar.mo1501(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            eVar.m1211(colorStateList);
        }
    }

    @Override // androidx.core.view.c1
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f1416;
        if (eVar != null) {
            eVar.m1212(mode);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    int m1490(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i5 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i6 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i6 = Math.max(i6, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i6;
        }
        drawable.getPadding(this.f1423);
        Rect rect = this.f1423;
        return i6 + rect.left + rect.right;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    void m1491() {
        this.f1421.mo1505(d.m1494(this), d.m1493(this));
    }

    public r0(Context context, AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1420) {
            this.f1419 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1421 != null) {
            Context context = this.f1417;
            if (context == null) {
                context = getContext();
            }
            this.f1421.mo1310(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public r0(Context context, AttributeSet attributeSet, int i5, int i6) {
        this(context, attributeSet, i5, i6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.r0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r0(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
