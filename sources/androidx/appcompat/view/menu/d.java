package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.l2;
import androidx.appcompat.widget.o2;
import androidx.core.view.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class d extends k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: ʼʼ, reason: contains not printable characters */
    private static final int f824 = e.g.f7043;

    /* renamed from: ʻʻ, reason: contains not printable characters */
    private PopupWindow.OnDismissListener f825;

    /* renamed from: ʽʽ, reason: contains not printable characters */
    boolean f826;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Context f827;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f828;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final int f829;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final int f830;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final boolean f831;

    /* renamed from: ˋ, reason: contains not printable characters */
    final Handler f832;

    /* renamed from: ᐧᐧ, reason: contains not printable characters */
    private m.a f840;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private View f841;

    /* renamed from: ᴵᴵ, reason: contains not printable characters */
    ViewTreeObserver f842;

    /* renamed from: ᵎ, reason: contains not printable characters */
    View f843;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean f845;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private boolean f846;

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f847;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private int f848;

    /* renamed from: ﾞﾞ, reason: contains not printable characters */
    private boolean f850;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final List<g> f833 = new ArrayList();

    /* renamed from: ˏ, reason: contains not printable characters */
    final List<C0016d> f834 = new ArrayList();

    /* renamed from: ˑ, reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f835 = new a();

    /* renamed from: י, reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f836 = new b();

    /* renamed from: ـ, reason: contains not printable characters */
    private final l2 f837 = new c();

    /* renamed from: ٴ, reason: contains not printable characters */
    private int f838 = 0;

    /* renamed from: ᐧ, reason: contains not printable characters */
    private int f839 = 0;

    /* renamed from: ﾞ, reason: contains not printable characters */
    private boolean f849 = false;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private int f844 = m916();

    /* compiled from: CascadingMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.mo920() || d.this.f834.size() <= 0 || d.this.f834.get(0).f858.m1313()) {
                return;
            }
            View view = d.this.f843;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0016d> it = d.this.f834.iterator();
            while (it.hasNext()) {
                it.next().f858.mo919();
            }
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    class c implements l2 {

        /* compiled from: CascadingMenuPopup.java */
        class a implements Runnable {

            /* renamed from: ʾ, reason: contains not printable characters */
            final /* synthetic */ C0016d f854;

            /* renamed from: ʿ, reason: contains not printable characters */
            final /* synthetic */ MenuItem f855;

            /* renamed from: ˆ, reason: contains not printable characters */
            final /* synthetic */ g f856;

            a(C0016d c0016d, MenuItem menuItem, g gVar) {
                this.f854 = c0016d;
                this.f855 = menuItem;
                this.f856 = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0016d c0016d = this.f854;
                if (c0016d != null) {
                    d.this.f826 = true;
                    c0016d.f859.close(false);
                    d.this.f826 = false;
                }
                if (this.f855.isEnabled() && this.f855.hasSubMenu()) {
                    this.f856.performItemAction(this.f855, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.l2
        /* renamed from: ʾ, reason: contains not printable characters */
        public void mo931(g gVar, MenuItem menuItem) {
            d.this.f832.removeCallbacksAndMessages(null);
            int size = d.this.f834.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                } else if (gVar == d.this.f834.get(i5).f859) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 == -1) {
                return;
            }
            int i6 = i5 + 1;
            d.this.f832.postAtTime(new a(i6 < d.this.f834.size() ? d.this.f834.get(i6) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.l2
        /* renamed from: ʿ, reason: contains not printable characters */
        public void mo932(g gVar, MenuItem menuItem) {
            d.this.f832.removeCallbacksAndMessages(gVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0016d {

        /* renamed from: ʻ, reason: contains not printable characters */
        public final o2 f858;

        /* renamed from: ʼ, reason: contains not printable characters */
        public final g f859;

        /* renamed from: ʽ, reason: contains not printable characters */
        public final int f860;

        public C0016d(o2 o2Var, g gVar, int i5) {
            this.f858 = o2Var;
            this.f859 = gVar;
            this.f860 = i5;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public ListView m933() {
            return this.f858.mo923();
        }
    }

    public d(Context context, View view, int i5, int i6, boolean z5) {
        this.f827 = context;
        this.f841 = view;
        this.f829 = i5;
        this.f830 = i6;
        this.f831 = z5;
        Resources resources = context.getResources();
        this.f828 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.f6940));
        this.f832 = new Handler();
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private o2 m912() {
        o2 o2Var = new o2(this.f827, null, this.f829, this.f830);
        o2Var.m1454(this.f837);
        o2Var.m1301(this);
        o2Var.m1302(this);
        o2Var.m1293(this.f841);
        o2Var.m1298(this.f839);
        o2Var.m1300(true);
        o2Var.m1311(2);
        return o2Var;
    }

    /* renamed from: ᵎ, reason: contains not printable characters */
    private int m913(g gVar) {
        int size = this.f834.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (gVar == this.f834.get(i5).f859) {
                return i5;
            }
        }
        return -1;
    }

    /* renamed from: ᵔ, reason: contains not printable characters */
    private MenuItem m914(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = gVar.getItem(i5);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: ᵢ, reason: contains not printable characters */
    private View m915(C0016d c0016d, g gVar) {
        f fVar;
        int i5;
        int firstVisiblePosition;
        MenuItem m914 = m914(c0016d.f859, gVar);
        if (m914 == null) {
            return null;
        }
        ListView m933 = c0016d.m933();
        ListAdapter adapter = m933.getAdapter();
        int i6 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i5 = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            i5 = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i6 >= count) {
                i6 = -1;
                break;
            }
            if (m914 == fVar.getItem(i6)) {
                break;
            }
            i6++;
        }
        if (i6 != -1 && (firstVisiblePosition = (i6 + i5) - m933.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < m933.getChildCount()) {
            return m933.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int m916() {
        return f1.m2834(this.f841) == 1 ? 0 : 1;
    }

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int m917(int i5) {
        List<C0016d> list = this.f834;
        ListView m933 = list.get(list.size() - 1).m933();
        int[] iArr = new int[2];
        m933.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f843.getWindowVisibleDisplayFrame(rect);
        return this.f844 == 1 ? (iArr[0] + m933.getWidth()) + i5 > rect.right ? 0 : 1 : iArr[0] - i5 < 0 ? 1 : 0;
    }

    /* renamed from: ﹶ, reason: contains not printable characters */
    private void m918(g gVar) {
        C0016d c0016d;
        View view;
        int i5;
        int i6;
        int i7;
        LayoutInflater from = LayoutInflater.from(this.f827);
        f fVar = new f(gVar, from, this.f831, f824);
        if (!mo920() && this.f849) {
            fVar.m943(true);
        } else if (mo920()) {
            fVar.m943(k.m983(gVar));
        }
        int m982 = k.m982(fVar, null, this.f827, this.f828);
        o2 m912 = m912();
        m912.mo1310(fVar);
        m912.m1294(m982);
        m912.m1298(this.f839);
        if (this.f834.size() > 0) {
            List<C0016d> list = this.f834;
            c0016d = list.get(list.size() - 1);
            view = m915(c0016d, gVar);
        } else {
            c0016d = null;
            view = null;
        }
        if (view != null) {
            m912.m1455(false);
            m912.m1452(null);
            int m917 = m917(m982);
            boolean z5 = m917 == 1;
            this.f844 = m917;
            if (Build.VERSION.SDK_INT >= 26) {
                m912.m1293(view);
                i6 = 0;
                i5 = 0;
            } else {
                int[] iArr = new int[2];
                this.f841.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f839 & 7) == 5) {
                    iArr[0] = iArr[0] + this.f841.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i5 = iArr2[0] - iArr[0];
                i6 = iArr2[1] - iArr[1];
            }
            if ((this.f839 & 5) == 5) {
                if (!z5) {
                    m982 = view.getWidth();
                    i7 = i5 - m982;
                }
                i7 = i5 + m982;
            } else {
                if (z5) {
                    m982 = view.getWidth();
                    i7 = i5 + m982;
                }
                i7 = i5 - m982;
            }
            m912.m1306(i7);
            m912.m1304(true);
            m912.m1303(i6);
        } else {
            if (this.f845) {
                m912.m1306(this.f847);
            }
            if (this.f846) {
                m912.m1303(this.f848);
            }
            m912.m1297(m985());
        }
        this.f834.add(new C0016d(m912, gVar, this.f844));
        m912.mo919();
        ListView mo923 = m912.mo923();
        mo923.setOnKeyListener(this);
        if (c0016d == null && this.f850 && gVar.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(e.g.f7050, (ViewGroup) mo923, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.getHeaderTitle());
            mo923.addHeaderView(frameLayout, null, false);
            m912.mo919();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.f834.size();
        if (size > 0) {
            C0016d[] c0016dArr = (C0016d[]) this.f834.toArray(new C0016d[size]);
            for (int i5 = size - 1; i5 >= 0; i5--) {
                C0016d c0016d = c0016dArr[i5];
                if (c0016d.f858.mo920()) {
                    c0016d.f858.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void onCloseMenu(g gVar, boolean z5) {
        int m913 = m913(gVar);
        if (m913 < 0) {
            return;
        }
        int i5 = m913 + 1;
        if (i5 < this.f834.size()) {
            this.f834.get(i5).f859.close(false);
        }
        C0016d remove = this.f834.remove(m913);
        remove.f859.removeMenuPresenter(this);
        if (this.f826) {
            remove.f858.m1453(null);
            remove.f858.m1296(0);
        }
        remove.f858.dismiss();
        int size = this.f834.size();
        if (size > 0) {
            this.f844 = this.f834.get(size - 1).f860;
        } else {
            this.f844 = m916();
        }
        if (size != 0) {
            if (z5) {
                this.f834.get(0).f859.close(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.f840;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f842;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f842.removeGlobalOnLayoutListener(this.f835);
            }
            this.f842 = null;
        }
        this.f843.removeOnAttachStateChangeListener(this.f836);
        this.f825.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0016d c0016d;
        int size = this.f834.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                c0016d = null;
                break;
            }
            c0016d = this.f834.get(i5);
            if (!c0016d.f858.mo920()) {
                break;
            } else {
                i5++;
            }
        }
        if (c0016d != null) {
            c0016d.f859.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i5 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean onSubMenuSelected(r rVar) {
        for (C0016d c0016d : this.f834) {
            if (rVar == c0016d.f859) {
                c0016d.m933().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        mo921(rVar);
        m.a aVar = this.f840;
        if (aVar != null) {
            aVar.mo527(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void setCallback(m.a aVar) {
        this.f840 = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        Iterator<C0016d> it = this.f834.iterator();
        while (it.hasNext()) {
            k.m984(it.next().m933().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ʻ, reason: contains not printable characters */
    public void mo919() {
        if (mo920()) {
            return;
        }
        Iterator<g> it = this.f833.iterator();
        while (it.hasNext()) {
            m918(it.next());
        }
        this.f833.clear();
        View view = this.f841;
        this.f843 = view;
        if (view != null) {
            boolean z5 = this.f842 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f842 = viewTreeObserver;
            if (z5) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f835);
            }
            this.f843.addOnAttachStateChangeListener(this.f836);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ʼ, reason: contains not printable characters */
    public boolean mo920() {
        return this.f834.size() > 0 && this.f834.get(0).f858.mo920();
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ʽ, reason: contains not printable characters */
    public void mo921(g gVar) {
        gVar.addMenuPresenter(this, this.f827);
        if (mo920()) {
            m918(gVar);
        } else {
            this.f833.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ʾ, reason: contains not printable characters */
    protected boolean mo922() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ˈ, reason: contains not printable characters */
    public ListView mo923() {
        if (this.f834.isEmpty()) {
            return null;
        }
        return this.f834.get(r0.size() - 1).m933();
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˉ, reason: contains not printable characters */
    public void mo924(View view) {
        if (this.f841 != view) {
            this.f841 = view;
            this.f839 = androidx.core.view.r.m3298(this.f838, f1.m2834(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˋ, reason: contains not printable characters */
    public void mo925(boolean z5) {
        this.f849 = z5;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˎ, reason: contains not printable characters */
    public void mo926(int i5) {
        if (this.f838 != i5) {
            this.f838 = i5;
            this.f839 = androidx.core.view.r.m3298(i5, f1.m2834(this.f841));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˏ, reason: contains not printable characters */
    public void mo927(int i5) {
        this.f845 = true;
        this.f847 = i5;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˑ, reason: contains not printable characters */
    public void mo928(PopupWindow.OnDismissListener onDismissListener) {
        this.f825 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: י, reason: contains not printable characters */
    public void mo929(boolean z5) {
        this.f850 = z5;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ـ, reason: contains not printable characters */
    public void mo930(int i5) {
        this.f846 = true;
        this.f848 = i5;
    }

    /* compiled from: CascadingMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.f842;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f842 = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f842.removeGlobalOnLayoutListener(dVar.f835);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void onRestoreInstanceState(Parcelable parcelable) {
    }
}
