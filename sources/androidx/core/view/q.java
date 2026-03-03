package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class q {

    /* renamed from: ʻ, reason: contains not printable characters */
    private final DisplayCutout f3006;

    /* compiled from: DisplayCutoutCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static DisplayCutout m3272(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static List<Rect> m3273(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static int m3274(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static int m3275(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: ʿ, reason: contains not printable characters */
        static int m3276(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: ˆ, reason: contains not printable characters */
        static int m3277(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private q(DisplayCutout displayCutout) {
        this.f3006 = displayCutout;
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    static q m3267(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new q(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return androidx.core.util.c.m2568(this.f3006, ((q) obj).f3006);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f3006;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3006 + "}";
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public int m3268() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3274(this.f3006);
        }
        return 0;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public int m3269() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3275(this.f3006);
        }
        return 0;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public int m3270() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3276(this.f3006);
        }
        return 0;
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public int m3271() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m3277(this.f3006);
        }
        return 0;
    }
}
