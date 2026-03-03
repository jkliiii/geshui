package androidx.activity;

import android.window.BackEvent;

/* compiled from: BackEventCompat.kt */
/* loaded from: E:\78999\cookie_5123796.dex */
public final class b {

    /* renamed from: ʿ, reason: contains not printable characters */
    public static final a f195 = new a(null);

    /* renamed from: ʻ, reason: contains not printable characters */
    private final float f196;

    /* renamed from: ʼ, reason: contains not printable characters */
    private final float f197;

    /* renamed from: ʽ, reason: contains not printable characters */
    private final float f198;

    /* renamed from: ʾ, reason: contains not printable characters */
    private final int f199;

    /* compiled from: BackEventCompat.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f4.g gVar) {
            this();
        }
    }

    public b(float f5, float f6, float f7, int i5) {
        this.f196 = f5;
        this.f197 = f6;
        this.f198 = f7;
        this.f199 = i5;
    }

    public String toString() {
        return "BackEventCompat{touchX=" + this.f196 + ", touchY=" + this.f197 + ", progress=" + this.f198 + ", swipeEdge=" + this.f199 + '}';
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final float m365() {
        return this.f198;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final int m366() {
        return this.f199;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final float m367() {
        return this.f197;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(BackEvent backEvent) {
        f4.k.m8623(backEvent, "backEvent");
        androidx.activity.a aVar = androidx.activity.a.f194;
        this(aVar.m363(backEvent), aVar.m364(backEvent), aVar.m361(backEvent), aVar.m362(backEvent));
    }
}
