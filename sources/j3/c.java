package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.NestedScrollView;

/* compiled from: LtBottomSheetBinding.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LinearLayout f8650;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final LinearLayout f8651;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final LinearLayout f8652;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final AppCompatTextView f8653;

    /* renamed from: ʿ, reason: contains not printable characters */
    public final FrameLayout f8654;

    /* renamed from: ˆ, reason: contains not printable characters */
    public final NestedScrollView f8655;

    private c(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatTextView appCompatTextView, FrameLayout frameLayout, NestedScrollView nestedScrollView) {
        this.f8650 = linearLayout;
        this.f8651 = linearLayout2;
        this.f8652 = linearLayout3;
        this.f8653 = appCompatTextView;
        this.f8654 = frameLayout;
        this.f8655 = nestedScrollView;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static c m9329(View view) {
        int i5 = 2131230989;
        LinearLayout linearLayout = (LinearLayout) s0.a.m11702(view, 2131230989);
        if (linearLayout != null) {
            i5 = 2131231161;
            LinearLayout linearLayout2 = (LinearLayout) s0.a.m11702(view, 2131231161);
            if (linearLayout2 != null) {
                i5 = 2131231262;
                AppCompatTextView appCompatTextView = (AppCompatTextView) s0.a.m11702(view, 2131231262);
                if (appCompatTextView != null) {
                    i5 = 2131231264;
                    FrameLayout frameLayout = (FrameLayout) s0.a.m11702(view, 2131231264);
                    if (frameLayout != null) {
                        i5 = 2131231298;
                        NestedScrollView nestedScrollView = (NestedScrollView) s0.a.m11702(view, 2131231298);
                        if (nestedScrollView != null) {
                            return new c((LinearLayout) view, linearLayout, linearLayout2, appCompatTextView, frameLayout, nestedScrollView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static c m9330(LayoutInflater layoutInflater) {
        return m9331(layoutInflater, null, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static c m9331(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(2131427386, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return m9329(inflate);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public LinearLayout m9332() {
        return this.f8650;
    }
}
