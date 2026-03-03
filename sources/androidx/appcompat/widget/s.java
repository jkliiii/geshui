package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatPopupWindow.java */
/* loaded from: E:\78999\cookie_5123796.dex */
class s extends PopupWindow {

    /* renamed from: ʼ, reason: contains not printable characters */
    private static final boolean f1454;

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean f1455;

    static {
        f1454 = Build.VERSION.SDK_INT < 21;
    }

    public s(Context context, AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        m1543(context, attributeSet, i5, i6);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private void m1543(Context context, AttributeSet attributeSet, int i5, int i6) {
        d3 m1181 = d3.m1181(context, attributeSet, e.j.f7201, i5, i6);
        int i7 = e.j.f7203;
        if (m1181.m1200(i7)) {
            m1544(m1181.m1182(i7, false));
        }
        setBackgroundDrawable(m1181.m1188(e.j.f7202));
        m1181.m1201();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m1544(boolean z5) {
        if (f1454) {
            this.f1455 = z5;
        } else {
            androidx.core.widget.w.m3662(this, z5);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i5, int i6) {
        if (f1454 && this.f1455) {
            i6 -= view.getHeight();
        }
        super.showAsDropDown(view, i5, i6);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i5, int i6, int i7, int i8) {
        if (f1454 && this.f1455) {
            i6 -= view.getHeight();
        }
        super.update(view, i5, i6, i7, i8);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i5, int i6, int i7) {
        if (f1454 && this.f1455) {
            i6 -= view.getHeight();
        }
        super.showAsDropDown(view, i5, i6, i7);
    }
}
