package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* compiled from: AccessibilityRecordCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public class n0 {

    /* compiled from: AccessibilityRecordCompat.java */
    static class a {
        /* renamed from: ʻ, reason: contains not printable characters */
        static int m2725(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: ʼ, reason: contains not printable characters */
        static int m2726(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: ʽ, reason: contains not printable characters */
        static void m2727(AccessibilityRecord accessibilityRecord, int i5) {
            accessibilityRecord.setMaxScrollX(i5);
        }

        /* renamed from: ʾ, reason: contains not printable characters */
        static void m2728(AccessibilityRecord accessibilityRecord, int i5) {
            accessibilityRecord.setMaxScrollY(i5);
        }
    }

    /* compiled from: AccessibilityRecordCompat.java */
    static class b {
        /* renamed from: ʻ, reason: contains not printable characters */
        static void m2729(AccessibilityRecord accessibilityRecord, View view, int i5) {
            accessibilityRecord.setSource(view, i5);
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static void m2722(AccessibilityRecord accessibilityRecord, int i5) {
        a.m2727(accessibilityRecord, i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static void m2723(AccessibilityRecord accessibilityRecord, int i5) {
        a.m2728(accessibilityRecord, i5);
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static void m2724(AccessibilityRecord accessibilityRecord, View view, int i5) {
        b.m2729(accessibilityRecord, view, i5);
    }
}
