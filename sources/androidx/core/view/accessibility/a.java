package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a extends ClickableSpan {

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f2849;

    /* renamed from: ʿ, reason: contains not printable characters */
    private final j0 f2850;

    /* renamed from: ˆ, reason: contains not printable characters */
    private final int f2851;

    public a(int i5, j0 j0Var, int i6) {
        this.f2849 = i5;
        this.f2850 = j0Var;
        this.f2851 = i6;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2849);
        this.f2850.m2690(this.f2851, bundle);
    }
}
