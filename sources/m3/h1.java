package m3;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PresentAction.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class h1 implements View.OnClickListener {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final n3.d f9227;

    /* renamed from: ʿ, reason: contains not printable characters */
    private i1 f9228;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View f9229;

    /* renamed from: ˈ, reason: contains not printable characters */
    private View f9230;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ImageView f9231;

    /* renamed from: ˊ, reason: contains not printable characters */
    private ImageView f9232;

    /* renamed from: ˋ, reason: contains not printable characters */
    private ImageView f9233;

    public h1(n3.d dVar) {
        this.f9227 = dVar;
        m10016();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private void m10016() {
        this.f9229 = this.f9227.findViewById(2131231050);
        ImageView imageView = (ImageView) this.f9227.findViewById(2131231053);
        this.f9231 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        this.f9230 = this.f9227.findViewById(2131231051);
        this.f9232 = (ImageView) this.f9227.findViewById(2131231054);
        this.f9233 = (ImageView) this.f9227.findViewById(2131231052);
        ImageView imageView2 = this.f9232;
        if (imageView2 != null) {
            imageView2.setOnClickListener(this);
        }
        ImageView imageView3 = this.f9233;
        if (imageView3 != null) {
            imageView3.setOnClickListener(this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f9228 == null) {
        }
        switch (view.getId()) {
            case 2131231052:
                this.f9228.mo7866(3);
                break;
            case 2131231053:
                this.f9228.mo7866(1);
                break;
            case 2131231054:
                this.f9228.mo7866(2);
                break;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public void m10017(l3.l lVar) {
        boolean z5 = lVar.navigationBar.lightFontColor;
        View view = this.f9229;
        if (view != null) {
            view.setBackgroundResource(z5 ? 2131165418 : 2131165417);
        }
        View view2 = this.f9230;
        if (view2 != null) {
            view2.setBackgroundResource(z5 ? 2131165418 : 2131165417);
        }
        ImageView imageView = this.f9232;
        if (imageView != null) {
            imageView.setImageResource(z5 ? 2131165354 : 2131165353);
        }
        ImageView imageView2 = this.f9233;
        if (imageView2 != null) {
            imageView2.setImageResource(z5 ? 2131165350 : 2131165349);
        }
        ImageView imageView3 = this.f9231;
        if (imageView3 != null) {
            if (lVar.navigationBar.hiddenHomeButton) {
                View view3 = this.f9229;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            } else {
                imageView3.setImageResource(z5 ? 2131165352 : 2131165351);
                View view4 = this.f9229;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
            }
        }
        if (lVar.m9741()) {
            int m7966 = com.lt.app.c.m7966(this.f9227);
            View view5 = this.f9229;
            if (view5 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view5.getLayoutParams();
                marginLayoutParams.topMargin = m7966;
                this.f9229.setLayoutParams(marginLayoutParams);
            }
            View view6 = this.f9230;
            if (view6 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view6.getLayoutParams();
                marginLayoutParams2.topMargin = m7966;
                this.f9230.setLayoutParams(marginLayoutParams2);
            }
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public void m10018(i1 i1Var) {
        this.f9228 = i1Var;
    }
}
