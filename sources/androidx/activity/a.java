package androidx.activity;

import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class a {

    /* renamed from: ʻ, reason: contains not printable characters */
    public static final a f194 = new a();

    private a() {
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final BackEvent m360(float f5, float f6, float f7, int i5) {
        return new BackEvent(f5, f6, f7, i5);
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final float m361(BackEvent backEvent) {
        f4.k.m8623(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final int m362(BackEvent backEvent) {
        f4.k.m8623(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    /* renamed from: ʾ, reason: contains not printable characters */
    public final float m363(BackEvent backEvent) {
        f4.k.m8623(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    public final float m364(BackEvent backEvent) {
        f4.k.m8623(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
