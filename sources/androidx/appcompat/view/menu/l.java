package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.f1;

/* compiled from: MenuPopupHelper.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class l {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final Context f927;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final g f928;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final boolean f929;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f930;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final int f931;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View f932;

    /* renamed from: ˈ, reason: contains not printable characters */
    private int f933;

    /* renamed from: ˉ, reason: contains not printable characters */
    private boolean f934;

    /* renamed from: ˊ, reason: contains not printable characters */
    private m.a f935;

    /* renamed from: ˋ, reason: contains not printable characters */
    private k f936;

    /* renamed from: ˎ, reason: contains not printable characters */
    private PopupWindow.OnDismissListener f937;

    /* renamed from: ˏ, reason: contains not printable characters */
    private final PopupWindow.OnDismissListener f938;

    /* compiled from: MenuPopupHelper.java */
    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.mo992();
        }
    }

    /* compiled from: MenuPopupHelper.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m1001(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z5, int i5) {
        this(context, gVar, view, z5, i5, 0);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private k m987() {
        Display defaultDisplay = ((WindowManager) this.f927.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.m1001(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f927.getResources().getDimensionPixelSize(e.d.f6939) ? new d(this.f927, this.f932, this.f930, this.f931, this.f929) : new q(this.f927, this.f928, this.f932, this.f930, this.f931, this.f929);
        dVar.mo921(this.f928);
        dVar.mo928(this.f938);
        dVar.mo924(this.f932);
        dVar.setCallback(this.f935);
        dVar.mo925(this.f934);
        dVar.mo926(this.f933);
        return dVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private void m988(int i5, int i6, boolean z5, boolean z6) {
        k m990 = m990();
        m990.mo929(z6);
        if (z5) {
            if ((androidx.core.view.r.m3298(this.f933, f1.m2834(this.f932)) & 7) == 5) {
                i5 -= this.f932.getWidth();
            }
            m990.mo927(i5);
            m990.mo930(i6);
            int i7 = (int) ((this.f927.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m990.m986(new Rect(i5 - i7, i6 - i7, i5 + i7, i6 + i7));
        }
        m990.mo919();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public void m989() {
        if (m991()) {
            this.f936.dismiss();
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public k m990() {
        if (this.f936 == null) {
            this.f936 = m987();
        }
        return this.f936;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public boolean m991() {
        k kVar = this.f936;
        return kVar != null && kVar.mo920();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected void mo992() {
        this.f936 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f937;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public void m993(View view) {
        this.f932 = view;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public void m994(boolean z5) {
        this.f934 = z5;
        k kVar = this.f936;
        if (kVar != null) {
            kVar.mo925(z5);
        }
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public void m995(int i5) {
        this.f933 = i5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m996(PopupWindow.OnDismissListener onDismissListener) {
        this.f937 = onDismissListener;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m997(m.a aVar) {
        this.f935 = aVar;
        k kVar = this.f936;
        if (kVar != null) {
            kVar.setCallback(aVar);
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m998() {
        if (!m999()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    public boolean m999() {
        if (m991()) {
            return true;
        }
        if (this.f932 == null) {
            return false;
        }
        m988(0, 0, false, false);
        return true;
    }

    /* renamed from: י, reason: contains not printable characters */
    public boolean m1000(int i5, int i6) {
        if (m991()) {
            return true;
        }
        if (this.f932 == null) {
            return false;
        }
        m988(i5, i6, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z5, int i5, int i6) {
        this.f933 = 8388611;
        this.f938 = new a();
        this.f927 = context;
        this.f928 = gVar;
        this.f932 = view;
        this.f929 = z5;
        this.f930 = i5;
        this.f931 = i6;
    }
}
