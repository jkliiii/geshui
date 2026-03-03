package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* compiled from: AccessibilityEventCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2599(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static void m2600(AccessibilityEvent accessibilityEvent, int i5) {
            accessibilityEvent.setContentChangeTypes(i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static int m2597(AccessibilityEvent accessibilityEvent) {
        return a.m2599(accessibilityEvent);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m2598(AccessibilityEvent accessibilityEvent, int i5) {
        a.m2600(accessibilityEvent, i5);
    }
}
