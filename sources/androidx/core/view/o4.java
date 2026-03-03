package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: ViewParentCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class o4 {

    /* compiled from: ViewParentCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m3233(ViewParent viewParent, View view, float f5, float f6, boolean z5) {
            return viewParent.onNestedFling(view, f5, f6, z5);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m3234(ViewParent viewParent, View view, float f5, float f6) {
            return viewParent.onNestedPreFling(view, f5, f6);
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m3235(ViewParent viewParent, View view, int i5, int i6, int[] iArr) {
            viewParent.onNestedPreScroll(view, i5, i6, iArr);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m3236(ViewParent viewParent, View view, int i5, int i6, int i7, int i8) {
            viewParent.onNestedScroll(view, i5, i6, i7, i8);
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static void m3237(ViewParent viewParent, View view, View view2, int i5) {
            viewParent.onNestedScrollAccepted(view, view2, i5);
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static boolean m3238(ViewParent viewParent, View view, View view2, int i5) {
            return viewParent.onStartNestedScroll(view, view2, i5);
        }

        /* renamed from: ˈ, reason: contains not printable characters */
        static void m3239(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m3226(ViewParent viewParent, View view, float f5, float f6, boolean z5) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof s0) {
                return ((s0) viewParent).onNestedFling(view, f5, f6, z5);
            }
            return false;
        }
        try {
            return a.m3233(viewParent, view, f5, f6, z5);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e5);
            return false;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m3227(ViewParent viewParent, View view, float f5, float f6) {
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof s0) {
                return ((s0) viewParent).onNestedPreFling(view, f5, f6);
            }
            return false;
        }
        try {
            return a.m3234(viewParent, view, f5, f6);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e5);
            return false;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m3228(ViewParent viewParent, View view, int i5, int i6, int[] iArr, int i7) {
        if (viewParent instanceof q0) {
            ((q0) viewParent).onNestedPreScroll(view, i5, i6, iArr, i7);
            return;
        }
        if (i7 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof s0) {
                    ((s0) viewParent).onNestedPreScroll(view, i5, i6, iArr);
                    return;
                }
                return;
            }
            try {
                a.m3235(viewParent, view, i5, i6, iArr);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e5);
            }
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public static void m3229(ViewParent viewParent, View view, int i5, int i6, int i7, int i8, int i9, int[] iArr) {
        if (viewParent instanceof r0) {
            ((r0) viewParent).onNestedScroll(view, i5, i6, i7, i8, i9, iArr);
            return;
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (viewParent instanceof q0) {
            ((q0) viewParent).onNestedScroll(view, i5, i6, i7, i8, i9);
            return;
        }
        if (i9 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof s0) {
                    ((s0) viewParent).onNestedScroll(view, i5, i6, i7, i8);
                    return;
                }
                return;
            }
            try {
                a.m3236(viewParent, view, i5, i6, i7, i8);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e5);
            }
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static void m3230(ViewParent viewParent, View view, View view2, int i5, int i6) {
        if (viewParent instanceof q0) {
            ((q0) viewParent).onNestedScrollAccepted(view, view2, i5, i6);
            return;
        }
        if (i6 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof s0) {
                    ((s0) viewParent).onNestedScrollAccepted(view, view2, i5);
                    return;
                }
                return;
            }
            try {
                a.m3237(viewParent, view, view2, i5);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e5);
            }
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    public static boolean m3231(ViewParent viewParent, View view, View view2, int i5, int i6) {
        if (viewParent instanceof q0) {
            return ((q0) viewParent).onStartNestedScroll(view, view2, i5, i6);
        }
        if (i6 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21) {
            if (viewParent instanceof s0) {
                return ((s0) viewParent).onStartNestedScroll(view, view2, i5);
            }
            return false;
        }
        try {
            return a.m3238(viewParent, view, view2, i5);
        } catch (AbstractMethodError e5) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e5);
            return false;
        }
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    public static void m3232(ViewParent viewParent, View view, int i5) {
        if (viewParent instanceof q0) {
            ((q0) viewParent).onStopNestedScroll(view, i5);
            return;
        }
        if (i5 == 0) {
            if (Build.VERSION.SDK_INT < 21) {
                if (viewParent instanceof s0) {
                    ((s0) viewParent).onStopNestedScroll(view);
                    return;
                }
                return;
            }
            try {
                a.m3239(viewParent, view);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e5);
            }
        }
    }
}
