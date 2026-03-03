package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LtActionviewBinding.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final LinearLayout f8645;

    /* renamed from: ʼ, reason: contains not printable characters */
    public final RecyclerView f8646;

    private a(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f8645 = linearLayout;
        this.f8646 = recyclerView;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static a m9322(View view) {
        RecyclerView recyclerView = (RecyclerView) s0.a.m11702(view, 2131230994);
        if (recyclerView != null) {
            return new a((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(2131230994)));
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static a m9323(LayoutInflater layoutInflater) {
        return m9324(layoutInflater, null, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static a m9324(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(2131427384, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return m9322(inflate);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public LinearLayout m9325() {
        return this.f8645;
    }
}
