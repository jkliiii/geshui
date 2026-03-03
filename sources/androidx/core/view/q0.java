package androidx.core.view;

import android.view.View;

/* compiled from: NestedScrollingParent2.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface q0 extends s0 {
    void onNestedPreScroll(View view, int i5, int i6, int[] iArr, int i7);

    void onNestedScroll(View view, int i5, int i6, int i7, int i8, int i9);

    void onNestedScrollAccepted(View view, View view2, int i5, int i6);

    boolean onStartNestedScroll(View view, View view2, int i5, int i6);

    void onStopNestedScroll(View view, int i5);
}
