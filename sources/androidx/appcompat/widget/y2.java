package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* compiled from: ThemeUtils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class y2 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static final ThreadLocal<TypedValue> f1531 = new ThreadLocal<>();

    /* renamed from: ʼ, reason: contains not printable characters */
    static final int[] f1532 = {-16842910};

    /* renamed from: ʽ, reason: contains not printable characters */
    static final int[] f1533 = {R.attr.state_focused};

    /* renamed from: ʾ, reason: contains not printable characters */
    static final int[] f1534 = {R.attr.state_activated};

    /* renamed from: ʿ, reason: contains not printable characters */
    static final int[] f1535 = {R.attr.state_pressed};

    /* renamed from: ˆ, reason: contains not printable characters */
    static final int[] f1536 = {R.attr.state_checked};

    /* renamed from: ˈ, reason: contains not printable characters */
    static final int[] f1537 = {R.attr.state_selected};

    /* renamed from: ˉ, reason: contains not printable characters */
    static final int[] f1538 = {-16842919, -16842908};

    /* renamed from: ˊ, reason: contains not printable characters */
    static final int[] f1539 = new int[0];

    /* renamed from: ˋ, reason: contains not printable characters */
    private static final int[] f1540 = new int[1];

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m1650(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.j.f7109);
        try {
            if (!obtainStyledAttributes.hasValue(e.j.f7114)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static int m1651(Context context, int i5) {
        ColorStateList m1654 = m1654(context, i5);
        if (m1654 != null && m1654.isStateful()) {
            return m1654.getColorForState(f1532, m1654.getDefaultColor());
        }
        TypedValue m1655 = m1655();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, m1655, true);
        return m1653(context, i5, m1655.getFloat());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m1652(Context context, int i5) {
        int[] iArr = f1540;
        iArr[0] = i5;
        d3 m1180 = d3.m1180(context, null, iArr);
        try {
            return m1180.m1183(0, 0);
        } finally {
            m1180.m1201();
        }
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static int m1653(Context context, int i5, float f5) {
        return androidx.core.graphics.g0.m2279(m1652(context, i5), Math.round(Color.alpha(r0) * f5));
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public static ColorStateList m1654(Context context, int i5) {
        int[] iArr = f1540;
        iArr[0] = i5;
        d3 m1180 = d3.m1180(context, null, iArr);
        try {
            return m1180.m1184(0);
        } finally {
            m1180.m1201();
        }
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    private static TypedValue m1655() {
        ThreadLocal<TypedValue> threadLocal = f1531;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
