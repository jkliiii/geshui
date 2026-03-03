package com.ogaclejapan.smarttablayout;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f1;
import androidx.core.view.u;

/* compiled from: Utils.java */
/* loaded from: E:\78999\cookie_5123796.dex */
final class b {
    /* renamed from: ʻ, reason: contains not printable characters */
    static int m8124(View view) {
        return m8125(view, false);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    static int m8125(View view, boolean z5) {
        if (view == null) {
            return 0;
        }
        return m8137(view) ? z5 ? view.getLeft() + m8130(view) : view.getLeft() : z5 ? view.getRight() - m8130(view) : view.getRight();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    static int m8126(View view) {
        if (view == null) {
            return 0;
        }
        return u.m3353((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    static int m8127(View view) {
        if (view == null) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return u.m3354(marginLayoutParams) + u.m3353(marginLayoutParams);
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static int m8128(View view) {
        if (view == null) {
            return 0;
        }
        return u.m3354((ViewGroup.MarginLayoutParams) view.getLayoutParams());
    }

    /* renamed from: ˆ, reason: contains not printable characters */
    static int m8129(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    static int m8130(View view) {
        if (view == null) {
            return 0;
        }
        return f1.m2867(view);
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    static int m8131(View view) {
        if (view == null) {
            return 0;
        }
        return view.getPaddingLeft() + view.getPaddingRight();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static int m8132(View view) {
        if (view == null) {
            return 0;
        }
        return f1.m2871(view);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    static int m8133(View view) {
        return m8134(view, false);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static int m8134(View view, boolean z5) {
        if (view == null) {
            return 0;
        }
        return m8137(view) ? z5 ? view.getRight() - m8132(view) : view.getRight() : z5 ? view.getLeft() + m8132(view) : view.getLeft();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static int m8135(View view) {
        if (view == null) {
            return 0;
        }
        return view.getWidth();
    }

    /* renamed from: ˑ, reason: contains not printable characters */
    static int m8136(View view) {
        return m8135(view) + m8127(view);
    }

    /* renamed from: י, reason: contains not printable characters */
    static boolean m8137(View view) {
        return f1.m2834(view) == 1;
    }
}
