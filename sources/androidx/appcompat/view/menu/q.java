package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.o2;
import androidx.core.view.f1;

/* compiled from: StandardMenuPopup.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class q extends k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: ﾞ, reason: contains not printable characters */
    private static final int f941 = e.g.f7051;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final Context f942;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final g f943;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final f f944;

    /* renamed from: ˉ, reason: contains not printable characters */
    private final boolean f945;

    /* renamed from: ˊ, reason: contains not printable characters */
    private final int f946;

    /* renamed from: ˋ, reason: contains not printable characters */
    private final int f947;

    /* renamed from: ˎ, reason: contains not printable characters */
    private final int f948;

    /* renamed from: ˏ, reason: contains not printable characters */
    final o2 f949;

    /* renamed from: ـ, reason: contains not printable characters */
    private PopupWindow.OnDismissListener f952;

    /* renamed from: ٴ, reason: contains not printable characters */
    private View f953;

    /* renamed from: ᐧ, reason: contains not printable characters */
    View f954;

    /* renamed from: ᴵ, reason: contains not printable characters */
    private m.a f955;

    /* renamed from: ᵎ, reason: contains not printable characters */
    ViewTreeObserver f956;

    /* renamed from: ᵔ, reason: contains not printable characters */
    private boolean f957;

    /* renamed from: ᵢ, reason: contains not printable characters */
    private boolean f958;

    /* renamed from: ⁱ, reason: contains not printable characters */
    private int f959;

    /* renamed from: ﹶ, reason: contains not printable characters */
    private boolean f961;

    /* renamed from: ˑ, reason: contains not printable characters */
    final ViewTreeObserver.OnGlobalLayoutListener f950 = new a();

    /* renamed from: י, reason: contains not printable characters */
    private final View.OnAttachStateChangeListener f951 = new b();

    /* renamed from: ﹳ, reason: contains not printable characters */
    private int f960 = 0;

    /* compiled from: StandardMenuPopup.java */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!q.this.mo920() || q.this.f949.m1313()) {
                return;
            }
            View view = q.this.f954;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f949.mo919();
            }
        }
    }

    public q(Context context, g gVar, View view, int i5, int i6, boolean z5) {
        this.f942 = context;
        this.f943 = gVar;
        this.f945 = z5;
        this.f944 = new f(gVar, LayoutInflater.from(context), z5, f941);
        this.f947 = i5;
        this.f948 = i6;
        Resources resources = context.getResources();
        this.f946 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(e.d.f6940));
        this.f953 = view;
        this.f949 = new o2(context, null, i5, i6);
        gVar.addMenuPresenter(this, context);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    private boolean m1002() {
        View view;
        if (mo920()) {
            return true;
        }
        if (this.f957 || (view = this.f953) == null) {
            return false;
        }
        this.f954 = view;
        this.f949.m1302(this);
        this.f949.m1301(this);
        this.f949.m1300(true);
        View view2 = this.f954;
        boolean z5 = this.f956 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f956 = viewTreeObserver;
        if (z5) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f950);
        }
        view2.addOnAttachStateChangeListener(this.f951);
        this.f949.m1293(view2);
        this.f949.m1298(this.f960);
        if (!this.f958) {
            this.f959 = k.m982(this.f944, null, this.f942, this.f946);
            this.f958 = true;
        }
        this.f949.m1294(this.f959);
        this.f949.m1311(2);
        this.f949.m1297(m985());
        this.f949.mo919();
        ListView mo923 = this.f949.mo923();
        mo923.setOnKeyListener(this);
        if (this.f961 && this.f943.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f942).inflate(e.g.f7050, (ViewGroup) mo923, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f943.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            mo923.addHeaderView(frameLayout, null, false);
        }
        this.f949.mo1310(this.f944);
        this.f949.mo919();
        return true;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        if (mo920()) {
            this.f949.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void onCloseMenu(g gVar, boolean z5) {
        if (gVar != this.f943) {
            return;
        }
        dismiss();
        m.a aVar = this.f955;
        if (aVar != null) {
            aVar.onCloseMenu(gVar, z5);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f957 = true;
        this.f943.close();
        ViewTreeObserver viewTreeObserver = this.f956;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f956 = this.f954.getViewTreeObserver();
            }
            this.f956.removeGlobalOnLayoutListener(this.f950);
            this.f956 = null;
        }
        this.f954.removeOnAttachStateChangeListener(this.f951);
        PopupWindow.OnDismissListener onDismissListener = this.f952;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f942, rVar, this.f954, this.f945, this.f947, this.f948);
            lVar.m997(this.f955);
            lVar.m994(k.m983(rVar));
            lVar.m996(this.f952);
            this.f952 = null;
            this.f943.close(false);
            int m1295 = this.f949.m1295();
            int m1308 = this.f949.m1308();
            if ((Gravity.getAbsoluteGravity(this.f960, f1.m2834(this.f953)) & 7) == 5) {
                m1295 += this.f953.getWidth();
            }
            if (lVar.m1000(m1295, m1308)) {
                m.a aVar = this.f955;
                if (aVar == null) {
                    return true;
                }
                aVar.mo527(rVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void setCallback(m.a aVar) {
        this.f955 = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void updateMenuView(boolean z5) {
        this.f958 = false;
        f fVar = this.f944;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ʻ */
    public void mo919() {
        if (!m1002()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ʼ */
    public boolean mo920() {
        return !this.f957 && this.f949.mo920();
    }

    @Override // androidx.appcompat.view.menu.p
    /* renamed from: ˈ */
    public ListView mo923() {
        return this.f949.mo923();
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˉ */
    public void mo924(View view) {
        this.f953 = view;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˋ */
    public void mo925(boolean z5) {
        this.f944.m943(z5);
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˎ */
    public void mo926(int i5) {
        this.f960 = i5;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˏ */
    public void mo927(int i5) {
        this.f949.m1306(i5);
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ˑ */
    public void mo928(PopupWindow.OnDismissListener onDismissListener) {
        this.f952 = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: י */
    public void mo929(boolean z5) {
        this.f961 = z5;
    }

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ـ */
    public void mo930(int i5) {
        this.f949.m1303(i5);
    }

    /* compiled from: StandardMenuPopup.java */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f956;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f956 = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f956.removeGlobalOnLayoutListener(qVar.f950);
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

    @Override // androidx.appcompat.view.menu.k
    /* renamed from: ʽ */
    public void mo921(g gVar) {
    }
}
