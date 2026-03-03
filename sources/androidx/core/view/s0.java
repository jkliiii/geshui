package androidx.core.view;

import android.view.View;

/* compiled from: NestedScrollingParent.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public interface s0 {
    boolean onNestedFling(View view, float f5, float f6, boolean z5);

    boolean onNestedPreFling(View view, float f5, float f6);

    void onNestedPreScroll(View view, int i5, int i6, int[] iArr);

    void onNestedScroll(View view, int i5, int i6, int i7, int i8);

    void onNestedScrollAccepted(View view, View view2, int i5);

    boolean onStartNestedScroll(View view, View view2, int i5);

    void onStopNestedScroll(View view);
}
