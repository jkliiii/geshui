package k3;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.google.android.material.R;
import com.lt.app.App;
import com.lt.app.views.ImageViewEx;
import java.util.Iterator;
import java.util.List;
import m3.f0;
import n3.a1;

/* compiled from: SplashFragment.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class f extends androidx.fragment.app.d {

    /* renamed from: ʾ, reason: contains not printable characters */
    private l3.a f8881;

    /* renamed from: ˉ, reason: contains not printable characters */
    private int f8885;

    /* renamed from: ˏ, reason: contains not printable characters */
    private View f8889;

    /* renamed from: ˑ, reason: contains not printable characters */
    private ImageView f8890;

    /* renamed from: ʿ, reason: contains not printable characters */
    private String f8882 = null;

    /* renamed from: ˆ, reason: contains not printable characters */
    private String f8883 = null;

    /* renamed from: ˈ, reason: contains not printable characters */
    private final boolean f8884 = true;

    /* renamed from: ˊ, reason: contains not printable characters */
    private boolean f8886 = false;

    /* renamed from: ˋ, reason: contains not printable characters */
    private boolean f8887 = false;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f8888 = false;

    /* compiled from: SplashFragment.java */
    class a extends v1.c<Bitmap> {

        /* renamed from: ˈ, reason: contains not printable characters */
        final /* synthetic */ View f8891;

        a(View view) {
            this.f8891 = view;
        }

        @Override // v1.h
        /* renamed from: ˋ, reason: contains not printable characters */
        public void mo9534(Drawable drawable) {
            f.this.m9530(null, this.f8891);
        }

        @Override // v1.h
        /* renamed from: ˏ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public void mo9533(Bitmap bitmap, w1.b<? super Bitmap> bVar) {
            f.this.m9530(bitmap, this.f8891);
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private void m9525() {
        if (!this.f8888 || getActivity() == null || !a1.m10620(getActivity())) {
            dismissAllowingStateLoss();
            return;
        }
        b m9518 = b.m9518(true);
        m9518.m9519(new View.OnClickListener() { // from class: k3.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8880.m9527(view);
            }
        });
        getChildFragmentManager().m4238().m4342(R.id.container, m9518).mo3948();
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private void m9526(String str, List<String> list) {
        if (!TextUtils.isEmpty(str)) {
            com.lt.app.c.m7985(getContext(), str);
            return;
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (com.lt.app.c.m7978(getContext(), it.next(), null, true)) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˈ, reason: contains not printable characters */
    public /* synthetic */ void m9527(View view) {
        dismissAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˉ, reason: contains not printable characters */
    public /* synthetic */ boolean m9528(boolean z5) {
        if (z5 && this.f8887) {
            return false;
        }
        m9525();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˊ, reason: contains not printable characters */
    public /* synthetic */ void m9529(String str, List list, View view) {
        dismissAllowingStateLoss();
        m9526(str, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ˎ, reason: contains not printable characters */
    public void m9530(Bitmap bitmap, View view) {
        this.f8889.setVisibility(8);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setInterpolator(getContext(), android.R.anim.accelerate_interpolator);
        Context context = view.getContext();
        l3.a aVar = this.f8881;
        f0 m9991 = new f0(context, aVar != null ? aVar.sp_skip : null).m9990(this.f8885).m9991(new f0.b() { // from class: k3.d
            @Override // m3.f0.b
            /* renamed from: ʻ, reason: contains not printable characters */
            public final boolean mo9520(boolean z5) {
                return this.f8879.m9528(z5);
            }
        });
        View m9989 = m9991.m9989();
        m9989.startAnimation(alphaAnimation);
        ((ViewGroup) view.findViewById(R.id.container)).addView(m9989);
        m9991.m9992();
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: ˏ, reason: contains not printable characters */
    private void m9531(View view) {
        Context context = getContext();
        if (TextUtils.isEmpty(this.f8882) || context == null) {
            m9530(null, view);
            return;
        }
        com.bumptech.glide.b.m6018(view).m6095().m12106(2500).m6087(this.f8886 ? this.f8883 : this.f8882).m6083(new a(view));
        l3.f fVar = this.f8881.splash;
        final String str = fVar.url;
        final List<String> list = fVar.us;
        if (TextUtils.isEmpty(str) && (list == null || list.isEmpty())) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: k3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8876.m9529(str, list, view2);
            }
        });
    }

    @Override // androidx.fragment.app.d
    public void dismissAllowingStateLoss() {
        try {
            super.dismissAllowingStateLoss();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, 2131886556);
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        if (onCreateDialog.getWindow() != null) {
            onCreateDialog.getWindow().setWindowAnimations(2131887286);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (getActivity() != null) {
            Point point = new Point();
            getActivity().getWindowManager().getDefaultDisplay().getRealSize(point);
            int min = Math.min(point.x, point.y);
            int max = Math.max(point.x, point.y);
            this.f8886 = max > 0 && ((double) (((float) min) / ((float) max))) < 0.52d;
        }
        View inflate = layoutInflater.inflate(2131427380, viewGroup, false);
        this.f8890 = (ImageView) inflate.findViewById(2131231268);
        this.f8889 = inflate.findViewById(2131231297);
        ImageViewEx imageViewEx = (ImageViewEx) inflate.findViewById(2131230834);
        imageViewEx.setImageResource(this.f8886 ? 2131165481 : 2131165480);
        ViewGroup.LayoutParams layoutParams = imageViewEx.getLayoutParams();
        layoutParams.height = -1;
        imageViewEx.setLayoutParams(layoutParams);
        if (this.f8881.m9729(30)) {
            imageViewEx.setCropAlign(0);
            imageViewEx.setCropType(1);
        } else if (this.f8881.m9729(31)) {
            imageViewEx.setCropAlign(1);
            imageViewEx.setCropType(1);
        } else if (this.f8881.m9729(32)) {
            imageViewEx.setCropAlign(2);
            imageViewEx.setCropType(1);
        } else if (this.f8881.m9729(33)) {
            imageViewEx.setCropAlign(3);
            imageViewEx.setCropType(1);
        } else if (this.f8881.m9729(34)) {
            imageViewEx.setCropAlign(4);
            imageViewEx.setCropType(1);
        } else {
            imageViewEx.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        m9531(inflate);
        return inflate;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m9532(l3.a aVar) {
        List<String> list;
        this.f8881 = aVar;
        int i5 = aVar.sd;
        this.f8885 = i5;
        if (i5 < 1) {
            this.f8885 = 3;
        }
        l3.e eVar = aVar.guide;
        if (eVar == null || (list = eVar.imgs) == null || list.size() <= 1) {
            return;
        }
        this.f8888 = App.m7835().m7841().getInt("k_guide_ver", -1) != aVar.guide.verCode;
    }
}
