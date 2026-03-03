package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* compiled from: AccessibilityManagerCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class c {

    /* compiled from: AccessibilityManagerCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static boolean m2604(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0033c(bVar));
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static boolean m2605(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0033c(bVar));
        }
    }

    /* compiled from: AccessibilityManagerCompat.java */
    public interface b {
        void onTouchExplorationStateChanged(boolean z5);
    }

    /* compiled from: AccessibilityManagerCompat.java */
    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC0033c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: ʻ, reason: contains not printable characters */
        final b f2852;

        AccessibilityManagerTouchExplorationStateChangeListenerC0033c(b bVar) {
            this.f2852 = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0033c) {
                return this.f2852.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0033c) obj).f2852);
            }
            return false;
        }

        public int hashCode() {
            return this.f2852.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z5) {
            this.f2852.onTouchExplorationStateChanged(z5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m2602(AccessibilityManager accessibilityManager, b bVar) {
        return a.m2604(accessibilityManager, bVar);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m2603(AccessibilityManager accessibilityManager, b bVar) {
        return a.m2605(accessibilityManager, bVar);
    }
}
