package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R;

/* compiled from: LtRichAlertBinding.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class d {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LinearLayout f8656;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final LinearLayout f8657;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final TextView f8658;

    /* renamed from: ʾ, reason: contains not printable characters */
    public final TextView f8659;

    private d(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.f8656 = linearLayout;
        this.f8657 = linearLayout2;
        this.f8658 = textView;
        this.f8659 = textView2;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static d m9333(View view) {
        int i5 = 2131230841;
        LinearLayout linearLayout = (LinearLayout) s0.a.m11702(view, 2131230841);
        if (linearLayout != null) {
            i5 = R.id.content;
            TextView textView = (TextView) s0.a.m11702(view, R.id.content);
            if (textView != null) {
                i5 = 2131231262;
                TextView textView2 = (TextView) s0.a.m11702(view, 2131231262);
                if (textView2 != null) {
                    return new d((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static d m9334(LayoutInflater layoutInflater) {
        return m9335(layoutInflater, null, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static d m9335(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(2131427387, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return m9333(inflate);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public LinearLayout m9336() {
        return this.f8656;
    }
}
