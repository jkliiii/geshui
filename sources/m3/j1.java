package m3;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import n3.z1;

/* compiled from: PresentNavigationBar.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class j1 implements View.OnClickListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final n3.d f9239;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final View f9240;

    /* renamed from: ˆ, reason: contains not printable characters */
    private i1 f9241;

    /* renamed from: ˈ, reason: contains not printable characters */
    private h1 f9242;

    /* renamed from: ˉ, reason: contains not printable characters */
    private TextView f9243;

    public j1(n3.d dVar) {
        this.f9239 = dVar;
        this.f9240 = dVar.findViewById(2131231149);
        m10021();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m10021() {
        this.f9243 = (TextView) this.f9239.findViewById(2131231056);
        this.f9242 = new h1(this.f9239);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f9241 != null && view.getId() == 2131231053) {
            this.f9241.mo7866(1);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m10022(l3.l lVar) {
        Window window;
        int m9742 = lVar.navigationBar.m9742();
        View view = this.f9240;
        if (view != null) {
            view.setBackgroundColor(m9742);
        }
        l3.m mVar = lVar.navigationBar;
        boolean z5 = mVar.lightFontColor;
        TextView textView = this.f9243;
        if (textView != null) {
            textView.setVisibility(mVar.hiddenTitle ? 8 : 0);
            this.f9243.setTextColor(z5 ? -1 : -16777216);
        }
        m10024(lVar.navigationBar.title);
        this.f9242.m10017(lVar);
        z1.m10904(this.f9239, !z5);
        if (Build.VERSION.SDK_INT < 21 || (window = this.f9239.getWindow()) == null) {
            return;
        }
        window.setStatusBarColor(m9742);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m10023(i1 i1Var) {
        this.f9241 = i1Var;
        this.f9242.m10018(i1Var);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public void m10024(String str) {
        TextView textView = this.f9243;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
