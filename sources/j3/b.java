package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: LtActionviewItemBinding.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LinearLayout f8647;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final ImageView f8648;

    /* renamed from: ʽ, reason: contains not printable characters */
    public final TextView f8649;

    private b(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.f8647 = linearLayout;
        this.f8648 = imageView;
        this.f8649 = textView;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static b m9326(View view) {
        int i5 = 2131230967;
        ImageView imageView = (ImageView) s0.a.m11702(view, 2131230967);
        if (imageView != null) {
            i5 = 2131231262;
            TextView textView = (TextView) s0.a.m11702(view, 2131231262);
            if (textView != null) {
                return new b((LinearLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i5)));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static b m9327(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(2131427385, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return m9326(inflate);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public LinearLayout m9328() {
        return this.f8647;
    }
}
