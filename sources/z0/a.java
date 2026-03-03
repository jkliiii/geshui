package z0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.n;
import androidx.fragment.app.v;

/* compiled from: ActionSheet.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class a extends androidx.fragment.app.e implements View.OnClickListener, View.OnKeyListener {

    /* renamed from: ʿ, reason: contains not printable characters */
    private d f12668;

    /* renamed from: ˆ, reason: contains not printable characters */
    private View f12669;

    /* renamed from: ˈ, reason: contains not printable characters */
    private LinearLayout f12670;

    /* renamed from: ˉ, reason: contains not printable characters */
    private ViewGroup f12671;

    /* renamed from: ˊ, reason: contains not printable characters */
    private View f12672;

    /* renamed from: ˋ, reason: contains not printable characters */
    private e f12673;

    /* renamed from: ʾ, reason: contains not printable characters */
    private boolean f12667 = true;

    /* renamed from: ˎ, reason: contains not printable characters */
    private boolean f12674 = true;

    /* compiled from: ActionSheet.java */
    /* renamed from: z0.a$a, reason: collision with other inner class name */
    class RunnableC0182a implements Runnable {

        /* renamed from: ʾ, reason: contains not printable characters */
        final /* synthetic */ n f12675;

        /* renamed from: ʿ, reason: contains not printable characters */
        final /* synthetic */ String f12676;

        RunnableC0182a(n nVar, String str) {
            this.f12675 = nVar;
            this.f12676 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            v m4238 = this.f12675.m4238();
            m4238.m4338(a.this, this.f12676);
            m4238.m4340(null);
            m4238.mo3948();
        }
    }

    /* compiled from: ActionSheet.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.getFragmentManager().m4209();
            v m4238 = a.this.getFragmentManager().m4238();
            m4238.mo3952(a.this);
            m4238.mo3948();
        }
    }

    /* compiled from: ActionSheet.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f12671.removeView(a.this.f12669);
        }
    }

    /* compiled from: ActionSheet.java */
    public interface d {
        /* renamed from: ʻ */
        void mo8945(a aVar, boolean z5);

        /* renamed from: ʼ */
        void mo8946(a aVar, int i5);
    }

    /* compiled from: ActionSheet.java */
    private static class e {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Context f12680;

        /* renamed from: ʼ, reason: contains not printable characters */
        Drawable f12681 = new ColorDrawable(0);

        /* renamed from: ʽ, reason: contains not printable characters */
        Drawable f12682 = new ColorDrawable(-16777216);

        /* renamed from: ʾ, reason: contains not printable characters */
        Drawable f12683;

        /* renamed from: ʿ, reason: contains not printable characters */
        Drawable f12684;

        /* renamed from: ˆ, reason: contains not printable characters */
        Drawable f12685;

        /* renamed from: ˈ, reason: contains not printable characters */
        Drawable f12686;

        /* renamed from: ˉ, reason: contains not printable characters */
        int f12687;

        /* renamed from: ˊ, reason: contains not printable characters */
        int f12688;

        /* renamed from: ˋ, reason: contains not printable characters */
        int f12689;

        /* renamed from: ˎ, reason: contains not printable characters */
        int f12690;

        /* renamed from: ˏ, reason: contains not printable characters */
        int f12691;

        /* renamed from: ˑ, reason: contains not printable characters */
        float f12692;

        public e(Context context) {
            this.f12680 = context;
            ColorDrawable colorDrawable = new ColorDrawable(-7829368);
            this.f12683 = colorDrawable;
            this.f12684 = colorDrawable;
            this.f12685 = colorDrawable;
            this.f12686 = colorDrawable;
            this.f12687 = -1;
            this.f12688 = -16777216;
            this.f12689 = m13125(20);
            this.f12690 = m13125(2);
            this.f12691 = m13125(10);
            this.f12692 = m13125(16);
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        private int m13125(int i5) {
            return (int) TypedValue.applyDimension(1, i5, this.f12680.getResources().getDisplayMetrics());
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public Drawable m13126() {
            if (this.f12684 instanceof StateListDrawable) {
                TypedArray obtainStyledAttributes = this.f12680.getTheme().obtainStyledAttributes(null, z0.c.f12722, z0.b.f12700, 0);
                this.f12684 = obtainStyledAttributes.getDrawable(z0.c.f12738);
                obtainStyledAttributes.recycle();
            }
            return this.f12684;
        }
    }

    /* compiled from: ActionSheet.java */
    public static class f {

        /* renamed from: ʻ, reason: contains not printable characters */
        private Context f12693;

        /* renamed from: ʼ, reason: contains not printable characters */
        private n f12694;

        /* renamed from: ʽ, reason: contains not printable characters */
        private String f12695;

        /* renamed from: ʾ, reason: contains not printable characters */
        private String[] f12696;

        /* renamed from: ʿ, reason: contains not printable characters */
        private String f12697 = "actionSheet";

        /* renamed from: ˆ, reason: contains not printable characters */
        private boolean f12698;

        /* renamed from: ˈ, reason: contains not printable characters */
        private d f12699;

        public f(Context context, n nVar) {
            this.f12693 = context;
            this.f12694 = nVar;
        }

        /* renamed from: ʻ, reason: contains not printable characters */
        public Bundle m13127() {
            Bundle bundle = new Bundle();
            bundle.putString("cancel_button_title", this.f12695);
            bundle.putStringArray("other_button_titles", this.f12696);
            bundle.putBoolean("cancelable_ontouchoutside", this.f12698);
            return bundle;
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        public f m13128(int i5) {
            return m13129(this.f12693.getString(i5));
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        public f m13129(String str) {
            this.f12695 = str;
            return this;
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        public f m13130(boolean z5) {
            this.f12698 = z5;
            return this;
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        public f m13131(d dVar) {
            this.f12699 = dVar;
            return this;
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        public f m13132(String... strArr) {
            this.f12696 = strArr;
            return this;
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        public a m13133() {
            a aVar = (a) androidx.fragment.app.e.instantiate(this.f12693, a.class.getName(), m13127());
            aVar.m13124(this.f12699);
            aVar.show(this.f12694, this.f12697);
            return aVar;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private boolean m13109(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        boolean z5 = false;
        boolean z6 = identifier > 0 ? resources.getBoolean(identifier) : false;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            String str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
            if (!"1".equals(str)) {
                z5 = "0".equals(str) ? true : z6;
            }
            return z5;
        } catch (Exception e5) {
            e5.printStackTrace();
            return z6;
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    private Animation m13110() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        return alphaAnimation;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    private Animation m13111() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        return alphaAnimation;
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static f m13112(Context context, n nVar) {
        return new f(context, nVar);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    private void m13113() {
        String[] m13120 = m13120();
        if (m13120 != null) {
            for (int i5 = 0; i5 < m13120.length; i5++) {
                Button button = new Button(getActivity());
                button.setId(i5 + 100 + 1);
                button.setOnClickListener(this);
                button.setBackgroundDrawable(m13119(m13120, i5));
                button.setText(m13120[i5]);
                button.setTextColor(this.f12673.f12688);
                button.setTextSize(0, this.f12673.f12692);
                if (i5 > 0) {
                    LinearLayout.LayoutParams m13122 = m13122();
                    m13122.topMargin = this.f12673.f12690;
                    this.f12670.addView(button, m13122);
                } else {
                    this.f12670.addView(button);
                }
            }
        }
        Button button2 = new Button(getActivity());
        button2.getPaint().setFakeBoldText(true);
        button2.setTextSize(0, this.f12673.f12692);
        button2.setId(100);
        button2.setBackgroundDrawable(this.f12673.f12682);
        button2.setText(m13117());
        button2.setTextColor(this.f12673.f12687);
        button2.setOnClickListener(this);
        LinearLayout.LayoutParams m131222 = m13122();
        m131222.topMargin = this.f12673.f12691;
        this.f12670.addView(button2, m131222);
        this.f12670.setBackgroundDrawable(this.f12673.f12681);
        LinearLayout linearLayout = this.f12670;
        int i6 = this.f12673.f12689;
        linearLayout.setPadding(i6, i6, i6, i6);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    private Animation m13114() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        return translateAnimation;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    private Animation m13115() {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(true);
        return translateAnimation;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    private View m13116() {
        FrameLayout frameLayout = new FrameLayout(getActivity());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View view = new View(getActivity());
        this.f12672 = view;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12672.setBackgroundColor(Color.argb(136, 0, 0, 0));
        this.f12672.setId(10);
        this.f12672.setOnClickListener(this);
        this.f12670 = new LinearLayout(getActivity());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        this.f12670.setLayoutParams(layoutParams);
        this.f12670.setOrientation(1);
        frameLayout.setPadding(0, 0, 0, m13123(getActivity()));
        frameLayout.addView(this.f12672);
        frameLayout.addView(this.f12670);
        return frameLayout;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    private String m13117() {
        return getArguments().getString("cancel_button_title");
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    private boolean m13118() {
        return getArguments().getBoolean("cancelable_ontouchoutside");
    }

    /* renamed from: ـ, reason: contains not printable characters */
    private Drawable m13119(String[] strArr, int i5) {
        if (strArr.length == 1) {
            return this.f12673.f12686;
        }
        if (strArr.length == 2) {
            if (i5 == 0) {
                return this.f12673.f12683;
            }
            if (i5 == 1) {
                return this.f12673.f12685;
            }
        }
        if (strArr.length > 2) {
            return i5 == 0 ? this.f12673.f12683 : i5 == strArr.length - 1 ? this.f12673.f12685 : this.f12673.m13126();
        }
        return null;
    }

    /* renamed from: ٴ, reason: contains not printable characters */
    private String[] m13120() {
        return getArguments().getStringArray("other_button_titles");
    }

    /* renamed from: ᐧ, reason: contains not printable characters */
    private e m13121() {
        e eVar = new e(getActivity());
        TypedArray obtainStyledAttributes = getActivity().getTheme().obtainStyledAttributes(null, z0.c.f12722, z0.b.f12700, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(z0.c.f12724);
        if (drawable != null) {
            eVar.f12681 = drawable;
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(z0.c.f12730);
        if (drawable2 != null) {
            eVar.f12682 = drawable2;
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(z0.c.f12746);
        if (drawable3 != null) {
            eVar.f12683 = drawable3;
        }
        Drawable drawable4 = obtainStyledAttributes.getDrawable(z0.c.f12738);
        if (drawable4 != null) {
            eVar.f12684 = drawable4;
        }
        Drawable drawable5 = obtainStyledAttributes.getDrawable(z0.c.f12736);
        if (drawable5 != null) {
            eVar.f12685 = drawable5;
        }
        Drawable drawable6 = obtainStyledAttributes.getDrawable(z0.c.f12740);
        if (drawable6 != null) {
            eVar.f12686 = drawable6;
        }
        eVar.f12687 = obtainStyledAttributes.getColor(z0.c.f12734, eVar.f12687);
        eVar.f12688 = obtainStyledAttributes.getColor(z0.c.f12744, eVar.f12688);
        eVar.f12689 = (int) obtainStyledAttributes.getDimension(z0.c.f12726, eVar.f12689);
        eVar.f12690 = (int) obtainStyledAttributes.getDimension(z0.c.f12742, eVar.f12690);
        eVar.f12691 = (int) obtainStyledAttributes.getDimension(z0.c.f12732, eVar.f12691);
        eVar.f12692 = obtainStyledAttributes.getDimensionPixelSize(z0.c.f12728, (int) eVar.f12692);
        obtainStyledAttributes.recycle();
        return eVar;
    }

    public void dismiss() {
        if (this.f12667) {
            return;
        }
        this.f12667 = true;
        new Handler().post(new b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != 10 || m13118()) {
            dismiss();
            if (view.getId() == 100 || view.getId() == 10) {
                return;
            }
            d dVar = this.f12668;
            if (dVar != null) {
                dVar.mo8946(this, (view.getId() - 100) - 1);
            }
            this.f12674 = false;
        }
    }

    @Override // androidx.fragment.app.e
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f12667 = bundle.getBoolean("extra_dismissed");
        }
    }

    @Override // androidx.fragment.app.e
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View currentFocus;
        InputMethodManager inputMethodManager = (InputMethodManager) getActivity().getSystemService("input_method");
        if (inputMethodManager.isActive() && (currentFocus = getActivity().getCurrentFocus()) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
        this.f12673 = m13121();
        View m13116 = m13116();
        this.f12669 = m13116;
        m13116.setFocusableInTouchMode(true);
        this.f12669.requestFocus();
        this.f12669.setOnKeyListener(this);
        this.f12671 = (ViewGroup) getActivity().getWindow().getDecorView();
        m13113();
        this.f12671.addView(this.f12669);
        this.f12672.startAnimation(m13110());
        this.f12670.startAnimation(m13114());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.e
    public void onDestroyView() {
        this.f12670.startAnimation(m13115());
        this.f12672.startAnimation(m13111());
        this.f12669.postDelayed(new c(), 300L);
        d dVar = this.f12668;
        if (dVar != null) {
            dVar.mo8945(this, this.f12674);
        }
        super.onDestroyView();
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i5, KeyEvent keyEvent) {
        if (this.f12667 || i5 != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.fragment.app.e
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("extra_dismissed", this.f12667);
    }

    public void show(n nVar, String str) {
        if (!this.f12667 || nVar.m4194()) {
            return;
        }
        this.f12667 = false;
        new Handler().post(new RunnableC0182a(nVar, str));
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public LinearLayout.LayoutParams m13122() {
        return new LinearLayout.LayoutParams(-1, -2);
    }

    /* renamed from: י, reason: contains not printable characters */
    public int m13123(Context context) {
        Resources resources;
        int identifier;
        if (Build.VERSION.SDK_INT < 21 || (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) <= 0 || !m13109(context)) {
            return 0;
        }
        return resources.getDimensionPixelSize(identifier);
    }

    /* renamed from: ᴵ, reason: contains not printable characters */
    public void m13124(d dVar) {
        this.f12668 = dVar;
    }
}
