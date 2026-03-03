package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat.java */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class n0 {
    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m3215(MotionEvent motionEvent, int i5) {
        return (motionEvent.getSource() & i5) == i5;
    }
}
