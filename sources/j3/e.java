package j3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: LtRichDialogBinding.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class e {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final FrameLayout f8660;

    private e(FrameLayout frameLayout) {
        this.f8660 = frameLayout;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static e m9337(View view) {
        if (view != null) {
            return new e((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static e m9338(LayoutInflater layoutInflater) {
        return m9339(layoutInflater, null, false);
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static e m9339(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z5) {
        View inflate = layoutInflater.inflate(2131427388, viewGroup, false);
        if (z5) {
            viewGroup.addView(inflate);
        }
        return m9337(inflate);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public FrameLayout m9340() {
        return this.f8660;
    }
}
